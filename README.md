This ia a basic SPring Boot application for a typical Online shopping store.

ABOUT

This is written using SPring BOot - Spring Rest and SPring Data JPA
MapStruct is used as Object Mapper
Currently it supports /products and /orders REST API
Its backed by H2 Database

HOWTO

To start the Server

mvn clean install
mvn spring-boot:run

Use Postman to access the API

http://localhost/products (GET)
http://localhost/orders (GET)
http://localhost/checkout (POST)
