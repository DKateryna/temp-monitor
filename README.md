# temp-monitor
This API is to retrieve and save a temperature data requested in `json` format.


### Getting Started
To run the application, run the following command in a terminal window (in the complete) directory:

`./gradlew bootRun`

If you use Maven, run the following command in a terminal window (in the complete) directory:

`./mvnw spring-boot:run`

Change the Name to "your_name" and then choose "Generate Project". A .zip will download. Unzip it. Inside you’ll find a simple, Maven-based project including a [pom.xml](pom.xml) build file. 

### POST /temperatures

__Good request:__

`curl -X POST localhost:8080/temperatures -H 'Content-type:application/json' -d '[{"measurement": "38.5", "timestamp": "1655048488", "sensorId": "5"}]'`

__Response__

` '[{"measurement": "38.5", "timestamp": "1655048488", "sensorId": "5"}`

__Bad request:__

`curl -X POST localhost:8080/temperatures -H 'Content-type:application/json' -d '[{"measurement": "38.5", "timestamp": "bla", "sensorId": ""}]'`

__Response:__

`{"timestamp":"2022-06-13T03:29:34.934+00:00","status":400,"error":"Bad Request","path":"/temperatures"}`


### GET /temperatures

Retrieve the members data in `json` format.
__Example:__

`[{"id":1,"measurement":36.5,"timestamp":1655048488,"sensorId":2},{"id":2,"measurement":36.2,"timestamp":1655048588,"sensorId":2},{"id":3,"measurement":36.4,"timestamp":1655048688,"sensorId":2},{"id":4,"measurement":36.1,"timestamp":1655048788,"sensorId":2},{"id":5,"measurement":36.6,"timestamp":1655048888,"sensorId":2},{"id":6,"measurement":36.9,"timestamp":1655048988,"sensorId":2},{"id":7,"measurement":36.3,"timestamp":1655058488,"sensorId":2},{"id":8,"measurement":36.2,"timestamp":1655068488,"sensorId":2},{"id":9,"measurement":36.4,"timestamp":1655078488,"sensorId":2},{"id":10,"measurement":36.5,"timestamp":1655088488,"sensorId":2},{"id":11,"measurement":36.6,"timestamp":1655098488,"sensorId":2},{"id":12,"measurement":39.0,"timestamp":1655048416,"sensorId":3}]k`

***

/* 

(TODO)
- implement service to retrieve the aggregated temperature data (hourly, daily):
- store results into hourly and daily temperature objects
- - add cron job to retrieve 
- refactore `TemperatureService#getAllTemperatures` to return `min, max, average` temperatures per hour, day
- Documenting an API using _swagger_
- cleanup readmy
- add unit tests
- add validation and constraints to domain classes
- handle exeptions/errors

*/