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

Spring boot application will be excuted on http://localhost:9123 as server-port mentioned in applicaton.properties file

# Project Structure

![Project Structure](https://github.com/rajusunagar/Extio-Task-SoapConsumerApplication/blob/main/ScreenShots/ProjectStructure.png)

# 1. Temperature conversion Web service [Celsius To Fahrenheit]

Spring boot application will be executed on URl http://localhost:9123/convert/temperature?celsius=25 

For Example: Need to convert 25 celsius to Fahrenheit. According to my Spring boot project 25 celsius to be updated on end of URL like         
**?celsius=25**

For result observe the below screenshot

![Temperature](https://github.com/rajusunagar/Extio-Task-SoapConsumerApplication/blob/main/ScreenShots/temperature1.png)

# 2. Number to word conversion Web serivce [Number To Words]

Spring boot application will be executed on URl http://localhost:9123/convert/number?number=1233546

For Example: Need to convert 1233546 number to words. According to my Spring boot project 1233546 number to be updated on end of URL like 
**?number=1233546**

For result observe the below screenshot

![Number](https://github.com/rajusunagar/Extio-Task-SoapConsumerApplication/blob/main/ScreenShots/number1.png)
