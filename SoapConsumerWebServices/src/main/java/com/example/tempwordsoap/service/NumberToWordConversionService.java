package com.example.tempwordsoap.service;

import com.example.tempwordsoap.number.NumberToWords;
import com.example.tempwordsoap.number.NumberToWordsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.math.BigInteger;

@Service
public class NumberToWordConversionService {

    private final WebServiceTemplate numberToWordWebServiceTemplate;

    @Autowired
    public NumberToWordConversionService(WebServiceTemplate numberToWordWebServiceTemplate) {
        this.numberToWordWebServiceTemplate = numberToWordWebServiceTemplate;
    }

    public String numberToWords(int number) {
        NumberToWords request = new NumberToWords();
        request.setUbiNum(BigInteger.valueOf(number));

        NumberToWordsResponse response = (NumberToWordsResponse) numberToWordWebServiceTemplate
                .marshalSendAndReceive("https://www.dataaccess.com/webservicesserver/NumberConversion.wso",
                        request,
                        new SoapActionCallback("https://www.dataaccess.com/webservicesserver/NumberConversion.wso/NumberToWords"));

        return response.getNumberToWordsResult();
    }
}
