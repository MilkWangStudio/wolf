package com.nekopara.wolf

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WolfApplication

fun main(args: Array<String>) {
	runApplication<WolfApplication>(*args)
}
