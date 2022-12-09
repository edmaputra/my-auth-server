package io.github.edmaputra.my_auth_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyAuthServerApplication

fun main(args: Array<String>) {
	runApplication<MyAuthServerApplication>(*args)
}
