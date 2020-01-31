package com.hendisantika.kotlinspringbootrestfulcrud.model

import java.sql.Timestamp
import javax.persistence.*
import javax.validation.constraints.NotBlank

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-springboot-restful-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/02/20
 * Time: 05.05
 */
@Entity
@Table(name = "users")
data class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        val created: Timestamp = Timestamp(System.currentTimeMillis()),

        @get: NotBlank
        val password: String = "",

        @get: NotBlank
        val username: String = ""
)