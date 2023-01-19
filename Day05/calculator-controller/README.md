## Create the project using :

https://start.spring.io/

## Build application

mvn clean install

## Run application

mvn spring-boot:run

## Test Application

curl --location --request GET 'localhost:8081/add?a=5&b=4'

curl --location --request POST 'localhost:8081/sub?a=12&b=5'

curl --location --request PUT 'localhost:8081/mul?a=5&b=9'

curl --location --request DELETE 'localhost:8081/div?a=12&b=2'