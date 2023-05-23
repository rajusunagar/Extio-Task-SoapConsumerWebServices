package com.example.tempwordsoap.service;

import com.example.tempwordsoap.temperature.CelsiusToFahrenheit;
import com.example.tempwordsoap.temperature.CelsiusToFahrenheitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class TemperatureConversionService {

    private final WebServiceTemplate temperatureWebServiceTemplate;

    @Autowired
    public TemperatureConversionService(WebServiceTemplate temperatureWebServiceTemplate) {
        this.temperatureWebServiceTemplate = temperatureWebServiceTemplate;
    }

    public String convertCelsiusToFahrenheit(double celsius) {
        CelsiusToFahrenheit request = new CelsiusToFahrenheit();
        request.setCelsius(String.valueOf(celsius));

        CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) temperatureWebServiceTemplate
                .marshalSendAndReceive("https://www.w3schools.com/xml/tempconvert.asmx",
                        request,
                        new SoapActionCallback("https://www.w3schools.com/xml/CelsiusToFahrenheit"));

        return response.getCelsiusToFahrenheitResult();
    }
}
