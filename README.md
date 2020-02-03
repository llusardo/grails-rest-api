# grails-rest-api
Example REST API made with  GRAILS


Examples: 

Create data: 
curl -i -H "Content-Type:application/json" -X POST localhost:8080/products -d '{"name":"Orange","price":2.0}'

Read data:
curl -i  localhost:8080/products

Single instance:
curl -i  localhost:8080/products/1

Update data:
curl -i -H "Content-Type:application/json" -X PUT localhost:8080/products/1 -d '{"price":3.0}'

Delete data:
curl -i -X DELETE localhost:8080/products/1
