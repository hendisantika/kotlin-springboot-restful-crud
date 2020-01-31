package com.hendisantika.kotlinspringbootrestfulcrud.service

import com.hendisantika.kotlinspringbootrestfulcrud.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

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
}