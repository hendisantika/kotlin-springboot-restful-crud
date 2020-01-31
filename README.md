# kotlin-springboot-restful-crud

Integration Kotlin Spring boot 2 Spring Data JPA RESTful Web service, CRUD Example

You can IDE Eclipse or IntelliJ Community. :)

Steps:

Execute next script on Mysql.
```
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `created` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`)
)
```


For test please use Postman.

GET

http://localhost:8080/api/users

POST

http://localhost:8080/api/users

json:
```
{
        "created": "2019-12-28T18:53:50.274+0000",
        "password": "123",
        "username": "Uzumaki Naruto"
}
```

GET By Id user

http://localhost:8080/api/users/1

PUT

http://localhost:8080/api/users/1

json:
```
{
        "password": "hi123",
        "username": "Uchiha Sasuke"
}
```

DELETE

http://localhost:8080/api/users/1



