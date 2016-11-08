package no.itera.workshops.third_episode

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

class HelloWorldController {

    /*
     * Make this message available through REST interface
      *
      * GET /hello-world
      * 200 "Hello World"
     */
    fun helloMessage() = "Hello World"

}

@SpringBootApplication
open class HelloWorldApp

fun main(args: Array<String>) {
    SpringApplication.run(HelloWorldApp::class.java, *args)
}
