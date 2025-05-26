package com.example.tempwordsoap.service;

import com.example.tempwordsoap.number.NumberToWords;
import com.example.tempwordsoap.number.NumberToWordsResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NumberToWordConversionServiceTest {

    @Mock
    private WebServiceTemplate numberToWordWebServiceTemplate;

    private NumberToWordConversionService service;

    @BeforeEach
    void setUp() {
        service = new NumberToWordConversionService(numberToWordWebServiceTemplate);
    }

    @Test
    void numberToWords_ShouldReturnCorrectConversion() {
        // Given
        int number = 42;
        NumberToWordsResponse response = new NumberToWordsResponse();
        response.setNumberToWordsResult("forty two");

        when(numberToWordWebServiceTemplate.marshalSendAndReceive(
                any(NumberToWords.class),
                any(SoapActionCallback.class)))
                .thenReturn(response);

        // When
        String result = service.numberToWords(number);

        // Then
        assertEquals("forty two", result);
    }
}