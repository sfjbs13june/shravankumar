# Build
``` 
mvn clean install
```


# Run
``` 
docker-compose -f docker-compose-rabbitmq.yml up -d
```


# Run Producer
``` 
rabbitmq-demo-producer> mvn spring-boot:run
```


# Test
``` 
curl --request POST 'localhost:8080/rabbitmq/hospital' \--header 'Content-Type: application/json' \--data-raw '{"name":"Yashoda","hosId":"136","address":"Hyderabad"}

curl --request POST 'localhost:8080/rabbitmq/patient' \--header 'Content-Type: application/json' \--data-raw '{"patientName":"Gwein","patId":"bkg","gender":"female","age":"26"}'
```


# Run Consumer
``` 
rabbitmq-demo-consumer> mvn spring-boot:run
```


# Show data on browser::

http://localhost:15672/

user-name:guest
password:guest


## Stop Container
``` 
docker-compose -f docker-compose-rabbitmq.yml down
```
