package tech.lazycoder.keycloak.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/secured/hello")
    fun hello() : String{
        return "secured hello"
    }

    @GetMapping("/secured/hello-no-policy")
    fun helloNoPolicy() : String{
        return "secured no policy"
    }

    @GetMapping("/public/hello")
    fun publicFun() : String{
        return "public hello"
    }
}