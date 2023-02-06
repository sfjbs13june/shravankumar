## Create project
``` 
https://start.spring.io/
```

## Build the project
``` 
mvn clean install
```

## Run application
``` 
mvn spring-boot:run
```

## Testing the application
```
Save Data:

curl --location --request POST 'localhost:8081/save/student' \
--header 'Content-Type: application/json' \
--data-raw '{
"rollNo":"12",
"name":"raju",
"std":"6th"
}'

Get data:

curl --location --request GET 'localhost:8081/get/student?name=raju'

Update data:

curl --location --request PUT 'localhost:8081/update/student?name=raju&std=6th'

Remove Data:

curl --location --request DELETE 'localhost:8081/remove/student?name=raju'
```

## Swagger Page:
```
http://localhost:8081/swagger-ui/index.html
```