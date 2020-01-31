package com.hendisantika.kotlinspringbootrestfulcrud.service

import com.hendisantika.kotlinspringbootrestfulcrud.model.User
import org.springframework.http.ResponseEntity

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-springboot-restful-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/02/20
 * Time: 05.10
 */
interface UserService {
    fun getAllUsers(): List<User>
    fun createNewUser(user: User): User
    fun getUserById(userId: Long): ResponseEntity<User>
    fun updateUserById(userId: Long, newUser: User): ResponseEntity<User>
    fun deleteUserById(userId: Long): ResponseEntity<Void>
}