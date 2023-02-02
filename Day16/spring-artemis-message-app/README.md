## Build

```
mvn clean install
```

## Run

```
docker-compose -f docker-compose-artemis.yml up -d
artemis-message-producer> mvn spring-boot:run
```

## Send some message though producer

```
curl --location --request GET 'localhost:1230/send/message?name=bigchill&age=13'
```

## Start consumer

```
artemis-message-consumer> mvn spring-boot:run
```

## Stop Container

```
docker-compose -f docker-compose-artemis.yml down
```

## Show data::

```
http://localhost:8161/
```


