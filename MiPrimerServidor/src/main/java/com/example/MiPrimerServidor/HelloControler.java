package com.example.MiPrimerServidor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloControler {

    @GetMapping("/hola")
    public String hello(){
        return "hola desde mi servidor";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "hola "+nombre+"desde mi servidor humilde ☆*: .｡. o(≧▽≦)o .｡.:*☆";
    }

    @PostMapping("/mensaje")
    public String recivirMensaje(@RequestBody String mensaje){
        return "recibi tu mensaje "+mensaje ;
    }

}
