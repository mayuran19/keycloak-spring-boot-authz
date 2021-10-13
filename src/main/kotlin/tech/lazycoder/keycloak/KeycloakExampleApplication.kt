package tech.lazycoder.keycloak

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KeycloakExampleApplication

fun main(args: Array<String>) {
	runApplication<KeycloakExampleApplication>(*args)
}
