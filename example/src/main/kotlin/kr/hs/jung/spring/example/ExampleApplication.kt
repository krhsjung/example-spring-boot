package kr.hs.jung.spring.example

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class ExampleApplication

fun main(args: Array<String>) {
	runApplication<ExampleApplication>(*args)
}
