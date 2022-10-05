<h1>Rest-Api-Spring-Boot</h1>

> Status: Completed📘

### this is a rest api made by me with all the methods http, and also with query methods created // GET / POST/ DELETE / PUT / QUERY METHODS CREATED
![Captura de tela 2022-10-04 214954](https://user-images.githubusercontent.com/102499938/193956152-fe2e0b6f-7d0b-49f8-9300-c42938bb2dd7.png)


## properties of the main model class

+ name
+ telephone
+ address
+ neighborhood
+ city
+ category

## quick explanation of the methods according to their mappings in the ComercioController class (class that directs requisitions) 📗
+ @GetMapping("/") - return all Trade 📗
+ @GetMapping("/categoria/{categoria}") - return all trades by desired category 📗
+ @GetMapping("/cidade/{cidade}") - return all trades by desired city in search ... 📗
+ @GetMapping("/bairro/{bairro}") - return all the trades by desired neighborhood in the search 📗
+ @PostMapping("/") - add a new trade  📗
+ @DeleteMapping("/remove/{id}") - delete a specific trade 📗
+ @PutMapping("/update/{id}") - update a trade 📗

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

How to run the application 📙

1) you'd need a java run
2) create the class with its respective name in your application directory and copy its referring code
3) the api was made based on the mysql bank, if you are going to use another and need to change the connector of the spring and download the referent, and put in the pom.xml
4) exchange the connection data with the bank as login and password and place your, equal below.
![Captura de tela 2022-10-04 214616](https://user-images.githubusercontent.com/102499938/193955866-2afb300a-c790-4642-9380-3e3f8224fd4b.png)







