<h1>Rest-Api-Spring-Boot</h1>

> Status: Completedπ

### this is a rest api made by me with all the methods http, and also with query methods created // GET / POST/ DELETE / PUT / QUERY METHODS CREATED
![Captura de tela 2022-10-04 214954](https://user-images.githubusercontent.com/102499938/193956152-fe2e0b6f-7d0b-49f8-9300-c42938bb2dd7.png)


## properties of the main model class

+ name
+ telephone
+ address
+ neighborhood
+ city
+ category

## quick explanation of the methods according to their mappings in the ComercioController class (class that directs requisitions) π
+ @GetMapping("/") - return all Trade π
+ @GetMapping("/categoria/{categoria}") - return all trades by desired category π
+ @GetMapping("/cidade/{cidade}") - return all trades by desired city in search ... π
+ @GetMapping("/bairro/{bairro}") - return all the trades by desired neighborhood in the search π
+ @PostMapping("/") - add a new trade  π
+ @DeleteMapping("/remove/{id}") - delete a specific trade π
+ @PutMapping("/update/{id}") - update a trade π

example of a query: http://localhost:8080/comercio/bairro/Santa Monica

## Technologies Used
<table>
  <tr>
     <td>Java</td>
     <td>Spring Boot Framework</td>
     <td>Mysql</td>
     <td>development tool: visual studio code</td>
  </tr>
  <tr>
     <td>17</td>
     <td>2.7.4</td>
     <td>8</td>
     <td>1.71</td>
  <tr>
<table>

How to run the application π

1) you'd need a java run
2) create the class with its respective name in your application directory and copy its referring code
3) the api was made based on the mysql bank, if you are going to use another and need to change the connector of the spring and download the referent, and put in the pom.xml
4) exchange the connection data with the bank as login and password and place your, equal below.
![Captura de tela 2022-10-04 214616](https://user-images.githubusercontent.com/102499938/193955866-2afb300a-c790-4642-9380-3e3f8224fd4b.png)

5) exchanging the database data, having copied all the files, we can already run the application.
6) https://springhow.com/spring-boot-database-connection /if you have difficulty connecting tente 





