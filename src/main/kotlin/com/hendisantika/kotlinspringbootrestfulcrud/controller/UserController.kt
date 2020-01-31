package com.hendisantika.kotlinspringbootrestfulcrud.controller

import com.hendisantika.kotlinspringbootrestfulcrud.model.User
import com.hendisantika.kotlinspringbootrestfulcrud.service.UserService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-springboot-restful-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/02/20
 * Time: 05.14
 */
@RestController
@RequestMapping("/api")
class UserController(private val userService: UserService) {
    @GetMapping("/users")
    fun getAllUsers(): List<User> = userService.getAllUsers()

    @PostMapping("/users")
    fun createNewUser(@Valid @RequestBody user: User): User =
            userService.createNewUser(user)
}
