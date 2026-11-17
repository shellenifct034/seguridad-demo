package com.seguridad.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HolaController {

    @GetMapping("/")
    public String publico() {
        return "Área pública. Cualquiera puede ver esto.";
    }

    @GetMapping("/usuario")
    public String usuario() {
        return "Área de usuario. Has iniciado sesión correctamente.";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Información confidencial. Solo para niveles de acceso administrador.";
    }
}
