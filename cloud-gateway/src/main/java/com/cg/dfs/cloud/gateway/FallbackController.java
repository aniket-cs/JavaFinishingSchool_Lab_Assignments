package com.cg.dfs.cloud.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/bookFallback")
    public Mono<String> bookServiceFallBack() {
        return Mono.just("Book Service is taking too long to respond or is down. Please try again later!");
    }
    @RequestMapping("/studentFallback")
    public Mono<String> studentServiceFallBack() {
        return Mono.just("Student Portal is taking too long to respond or is down. Please try again later!");
    }
}
