package com.example.Ec2codespacesL11;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/idat")
public class Controller{

    @GetMapping(path="/")
    public String home(){
        return "A1711484 - Angello Rodriguez";
    }

    @GetMapping(path="/codigo")
    public String codigo(){
        return "A1711484";
    }

    @GetMapping(path="/nombre-completo")
    public String nombre(){
        return "Randhol Angello Rodriguez Cansaya";
    }

}