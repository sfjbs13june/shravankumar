#### **#Create Springboot project**

https://start.spring.io/

#select maven version as 2.6.7 and java as 11

#Add Spring web,jpa,mockito,junit dependencies

#### **#Build project**
```
mvn clean install
```

# Run
```
docker-compose -f docker-compose-mysql.yml up -d

mvn spring-boot:run

docker-compose -f docker-compose-mysql.yml down

```
# training
## POST
```
curl --location --request POST 'localhost:8081/patient/save' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":3,
    "name":"shyam",
    "age":30,
    "gender":"Male",
    "disease":"Cold"
}'
```

## Get
```
curl --location --request GET 'localhost:8081/patient/read'
```

## Delete
```
curl --location --request DELETE 'localhost:8081/patient/delete?id=3'
```

## Getting inside container

docker exec -it <container-id> /bin/bash
mysql -u user -p
show databases;
use db;
show tables;
select * from user;
