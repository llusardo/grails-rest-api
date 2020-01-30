# grails-rest-api
A example of REST API with  GRAILS


Examples: 

Create data: 
curl -i -H "Content-Type:application/json" -X POST localhost:8080/products -d '{"name":"Orange","price":2.0}'

Read data:
curl -i  -H "Content-Type:application/json" -H "Authorization: Bearer j2tbn74eq6cf1fhlc4pn3mdovvd7m2kj" localhost:8080/products

Single instance:
curl -i  -H "Content-Type:application/json" -H "Authorization: Bearer j2tbn74eq6cf1fhlc4pn3mdovvd7m2kj" localhost:8080/products/1

Update data:
curl -i -H "Content-Type:application/json" -H "Authorization: Bearer j2tbn74eq6cf1fhlc4pn3mdovvd7m2kj" -X PUT localhost:8080/products/1 -d '{"price":3.0}'

Delete data:
curl -i -X DELETE localhost:8080/products/1


Auth:
Obtain token:
curl -i -H "Content-Type:application/js-X POST localhost:8080/api/login -d '{"username":"admin","password": "admin"}'

Validate token:
curl -i -H "Authorization: Bearer 664dkbafcuo4prsd02vocvlfvaok5nvl" http://localhost:8080/api/validate

Logout:
curl -i -H "X-Auth-Token:664dkbafcuo4prsd02vocvlfvaok5nvl" -X POST http://localhost:8080/api/logout HTTP/1.1 200 OK


fmmeq4s20n7n8m64fubfh39fri6l4mon