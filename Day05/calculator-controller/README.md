## Create the project using :

https://start.spring.io/

## Build application

mvn clean install

## Run application

mvn spring-boot:run

## Test Application

curl --location --request GET 'localhost:8080/add?m=7&s=8'

curl --location --request POST 'localhost:8080/sub?m=10&s=2'

curl --location --request PUT 'localhost:8080/mul?m=10&s=6'

curl --location --request DELETE 'localhost:8080/div?m=18&s=3'