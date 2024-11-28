package mx.uv.fei.servidorflashjob.controllers;

import mx.uv.fei.servidorflashjob.models.Estado;
import mx.uv.fei.servidorflashjob.services.EstadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estado")
public class EstadoController {
    @Autowired
    private EstadoServices estadoServices;
    @GetMapping
    public List<Estado> obtenerEstados(){
        return estadoServices.obtenerTodos();
    }
}
