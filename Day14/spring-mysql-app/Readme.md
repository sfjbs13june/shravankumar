## Build

``` 
mvn clean install
```


# Run
```
docker-compose -f docker-compose-mysql.yml up -d

mvn spring-boot:run

docker-compose -f docker-compose-mysql.yml down

```

# POST

```
curl -X POST \
http://localhost:8081/user/create -H 'content-type: application/json' -d '{"name": "kumar","teamName": "alfa","salary": 300000 }'

```
## Get 

```
curl -X GET http://localhost:8081/user/read 
```

## Getting inside container

docker exec -it <container-id> /bin/bash
mysql -u user -p
show databases;
use db;
show tables;
select * from user;
