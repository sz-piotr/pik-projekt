package app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan("app.controler")
@EntityScan("app.entity")
@EnableJpaRepositories("app.repository")

public class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
