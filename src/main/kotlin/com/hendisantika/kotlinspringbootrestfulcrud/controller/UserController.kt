package com.hendisantika.kotlinspringbootrestfulcrud.controller

import com.hendisantika.kotlinspringbootrestfulcrud.service.UserService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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
@RequestMapping("/ws")
class UserController(private val userService: UserService)