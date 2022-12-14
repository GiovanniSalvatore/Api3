package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class Strings {

    @GetMapping("/{prima}")
    public String concat(@PathVariable(required = true) String prima) {
        return prima;
    }

    @GetMapping("/{prima}/{seconda}")
    public String concat(@PathVariable(required = true) String prima, @PathVariable(required = false) String seconda) {
        return prima+seconda;
    }

}