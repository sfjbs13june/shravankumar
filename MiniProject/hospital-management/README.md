## Create Spring Project

``` 
https://start.spring.io/
```

## Build the Project

``` 
mvn clean install
```

## Docker image Creation

```
mvn install dockerfile:build
```

## Run the project

``` 
cd docker

docker-compose up -d

cd ..

mvn spring-boot:run

cd docker

docker-compose down
```

## Testing

``` 
## DoctorController

curl --location --request GET 'localhost:8080/doctor/doctor-appointment' \
--header 'Authorization: Basic RG9jdG9yMTIzOnBhc3Nkb2MxMjM=' \
--header 'Cookie: JSESSIONID=FC56FC4518D46FEFA24FB5DE9479007F' \


curl --location --request POST 'localhost:8080/doctor/save' \
--header 'Authorization: Basic RG9jdG9yMTIzOnBhc3Nkb2MxMjM=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=FC56FC4518D46FEFA24FB5DE9479007F' \
--data-raw '{
  "appointmentId":"491",
   "patientName":"pat35",
    "doctorName":"doc76",
     "date":"9th dec",
     "prescription":{
         "prescriptionId":"pre98",
         "appointmentId":"491",
         "description":"drugs for dengue",
         "patientName":"pat35",
         "doctorName":"doc76"
      }
}'
```
## Parent Controller

``` 
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=pat35' \
--header 'Authorization: Basic UGF0aWVudDEyMzpwYXNzcGF0MTIz' \
--header 'Cookie: JSESSIONID=C79FB1F7BBD1CE9CBC9E702C47C8BFF2'

curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic UGF0aWVudDEyMzpwYXNzcGF0MTIz' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C79FB1F7BBD1CE9CBC9E702C47C8BFF2' \
--data-raw '{
  "appointmentId":"987",
   "patientName":"pat2",
    "doctorName":"doc6",
     "date":"9th jan",
     "prescription":{
         "prescriptionId":"pre564",
         "appointmentId":"987",
         "description":"drugs for cancer",
         "patientName":"pat2",
         "doctorName":"doc6"
      }
}'
```

## Prescription Controller

``` 
curl --location --request GET 'localhost:8080/view-prescription' \
--header 'Authorization: Basic RG9jdG9yMTIzOnBhc3Nkb2MxMjM=' \
--header 'Cookie: JSESSIONID=C79FB1F7BBD1CE9CBC9E702C47C8BFF2'

curl --location --request POST 'localhost:8080/save-prescription' \
--header 'Authorization: Basic UGF0aWVudDEyMzpwYXNzcGF0MTIz' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C79FB1F7BBD1CE9CBC9E702C47C8BFF2' \
--data-raw ' {
         "prescriptionId":"pre98",
         "appointmentId":"pk43",
         "description":"drugs for tb",
         "patientName":"sai",
         "doctorName":"kanth"
      }'
```
## Swagger

``` 
http://localhost:8080/swagger-ui/index.html
```