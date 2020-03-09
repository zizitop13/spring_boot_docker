package ru.zizitop.example.spring_boot_docker.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Health {


    @GetMapping("/health")
    public Mono<String> health() {
        return Mono.just("Hello World !");
    }


}
