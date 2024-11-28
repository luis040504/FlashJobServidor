package mx.uv.fei.servidorflashjob.controllers;

import mx.uv.fei.servidorflashjob.models.Trabajo;
import mx.uv.fei.servidorflashjob.services.TrabajoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trabajo")
public class TrabajoController {
    @Autowired
    private TrabajoServices trabajoServices;
    @GetMapping
    public List<Trabajo> obtenerTrabajos(){
        return trabajoServices.obtenerTodos();
    }
    @GetMapping
    public Trabajo guardarTrabajo(Trabajo trabajo){
        return trabajoServices.guardarTrabajo(trabajo);
    }
    @GetMapping
    public List<Trabajo> obtenerTrabajosPorUsuario(Long idUsuario){
        return trabajoServices.obtenerTrabajosPorIdUsuario(idUsuario);
    }
}
