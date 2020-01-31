package com.hendisantika.kotlinspringbootrestfulcrud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class KotlinSpringbootRestfulCrudApplication : SpringBootServletInitializer() {
	override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
		return application.sources(KotlinSpringbootRestfulCrudApplication::class.java)
	}
}

fun main(args: Array<String>) {
	runApplication<KotlinSpringbootRestfulCrudApplication>(*args)
}
