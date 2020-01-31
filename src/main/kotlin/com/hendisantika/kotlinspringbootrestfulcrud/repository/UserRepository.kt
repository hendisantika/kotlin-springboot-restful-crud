package com.hendisantika.kotlinspringbootrestfulcrud.repository

import com.hendisantika.kotlinspringbootrestfulcrud.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-springboot-restful-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/02/20
 * Time: 05.10
 */
@Repository
interface UserRepository : JpaRepository<User, Long>