## Import project

```
 Import the project on either eclipse or inellij as a maven import project
```

## Building

# Maven

``` 
This project is maven project which will be build using maven command.
```
```
$ mvn clean install
```  

## Dockerization

```  
$ mvn install dockerfile:build
```

## List docker images

```
$ docker images
```

## Running the application in docker container

```
$ docker run -p 8080:8080 shravankumarmunakala/spring-header-app:1.0.0
```

## List docker running container

``` 
$ docker ps
```

## Start app With Docker-compose

``` 
$ docker-compose up
```

## Stop app With Docker-compose

```
$ docker-compose down
```

## Start app With Docker-compose in back groud mode

```
$ docker-compose up -d
```
## get docker container logs

```
$ docker-compose logs
```

## List all docker container

```
$ docker ps -a
```

## List only running docker container

```
$ docker ps
```

## List all docker images

```
$ d
ocker images
```
## Stop and remove docker container

```
$ docker stop <container-id>
$ docker rm <container-id>
```

## remove docker images

```
$ docker rmi <image-id>
```