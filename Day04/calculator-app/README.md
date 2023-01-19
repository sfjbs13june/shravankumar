## Create the project using :

https://start.spring.io/

## Build application

``` 
mvn clean install
```

## Run application

``` 
mvn spring-boot:run
```

## Test Application
```
curl --location --request GET 'localhost:8082/add?a=5.0&b=5.0'

curl --location --request GET 'localhost:8082/sub?a=5.0&b=5.0'

curl --location --request GET 'localhost:8082/mul?a=5.0&b=5.0'

curl --location --request GET 'localhost:8082/div?a=5.0&b=5.0'


```

