## Create Spring Project

``` 
https://start.spring.io/
```

## Select maven version as 2.7.8 and java as 11 #Add Spring web Dependency

## Build Project

```
mvn clean install 
```

## Run the application

```
mvn spring-boot:run 
```

## Add junit dependency in pom.xml file

## Test application (curl Commands)

``` 
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=5F812D64B9748F4CDAE37CBF353EF71F' \
--data-raw '{
     "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bactrial"
}'

curl --location --request PUT 'localhost:8080/patient/update?disease=fever&age=21' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=5F812D64B9748F4CDAE37CBF353EF71F' \
--data-raw '{ "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bactrial"
}'
```