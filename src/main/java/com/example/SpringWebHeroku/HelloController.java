package com.example.SpringWebHeroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Awesome app</title>
                </head>
                <body>
                <h1>Home page</h1>
                </body>
                </html>
                """;
    }

    @GetMapping("/hello")
    public String hello(){
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Awesome app</title>
                </head>
                <body>
                <h1>Hello World page</h1>
                </body>
                </html>
                """;
    }
}