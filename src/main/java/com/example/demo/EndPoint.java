package com.example.demo;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/hello")
public class EndPoint {

    @GET
    public String message() {
        return "Hello";
    }

}