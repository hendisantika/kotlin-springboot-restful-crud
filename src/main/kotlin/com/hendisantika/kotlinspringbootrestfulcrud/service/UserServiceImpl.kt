package com.hendisantika.kotlinspringbootrestfulcrud.service

import com.hendisantika.kotlinspringbootrestfulcrud.model.User
import com.hendisantika.kotlinspringbootrestfulcrud.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.sql.Timestamp

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-springboot-restful-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/02/20
 * Time: 05.11
 */
@Service("userService")
class UserServiceImpl : UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    override fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun createNewUser(user: User): User {
        return userRepository.save(user)
    }

    override fun getUserById(userId: Long): ResponseEntity<User> {
        return userRepository.findById(userId).map { article ->
            ResponseEntity.ok(article)
        }.orElse(ResponseEntity.notFound().build())
    }

    override fun updateUserById(userId: Long, newUser: User): ResponseEntity<User> {
        return userRepository.findById(userId).map { existingUser ->
            val updatedUser: User = existingUser
                    .copy(
                            created = Timestamp(System.currentTimeMillis()),
                            username = newUser.username,
                            password = newUser.password
                    )
            ResponseEntity.ok().body(userRepository.save(updatedUser))
        }.orElse(ResponseEntity.notFound().build())
    }
}