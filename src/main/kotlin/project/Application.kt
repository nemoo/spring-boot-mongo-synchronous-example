package project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootMongoApplication

fun main(args: Array<String>) {
	runApplication<BootMongoApplication>(*args)
}

