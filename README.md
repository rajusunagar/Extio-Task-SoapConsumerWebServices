# Extio-Task-SoapConsumerWebServices

Create a spring boot application to Consume below two SOAP Web services by creating RESTful interfaces to accept input in the GET parameter:

1. Temperature conversion Web service

Operation: CelsiusToFahrenheit

WSDL: https://www.w3schools.com/xml/tempconvert.asmx?WSDL

2. Number to word conversion Web serivce 

Operation:  NumberToWords

WSDL: https://www.dataaccess.com/webservicesserver/NumberConversion.wso?WSDL

You can refer to below official spring boot documentation

Consuming SOAP Web services

https://spring.io/guides/gs/consuming-web-service/

Building REST Services

https://spring.io/guides/tutorials/rest/


# Execution Process

Spring boot application will be excuted on http://localhost:8080 as server-port mentioned in applicaton.properties file

# Project Structure

![Project Structure](https://github.com/rajusunagar/Extio-Task-SoapConsumerWebServices/blob/main/Screenshots/Screenshot%20(56).png)

# 1. Temperature conversion Web service [Celsius To Fahrenheit]

Spring boot application will be executed on URl http://localhost:8080/convert/celsius-to-fahrenheit?celsius=25

For Example: Need to convert 25 celsius to Fahrenheit. According to my Spring boot project 25 celsius to be updated on end of URL like         
**?celsius=25**

For result observe the below screenshot

![Temperature](https://github.com/rajusunagar/Extio-Task-SoapConsumerWebServices/blob/main/Screenshots/Screenshot%20(57).png)

# 2. Number to word conversion Web serivce [Number To Words]

Spring boot application will be executed on http://localhost:8080/convert/number-to-words?number=1233546

For Example: Need to convert 1233546 number to words. According to my Spring boot project 1233546 number to be updated on end of URL like 
**?number=1233546**

For result observe the below screenshot

![Number](https://github.com/rajusunagar/Extio-Task-SoapConsumerWebServices/blob/main/Screenshots/Screenshot%20(58).png)

# Demo Video

[YouTube video](https://www.youtube.com/watch?v=7RjUwPWr1-g&ab_channel=RajuSunagar)


