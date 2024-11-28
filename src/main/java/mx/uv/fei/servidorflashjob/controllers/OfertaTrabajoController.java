package mx.uv.fei.servidorflashjob.controllers;

import mx.uv.fei.servidorflashjob.models.OfertaDeTrabajo;
import mx.uv.fei.servidorflashjob.services.OfertaDeTrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ofertaTrabajo")
public class OfertaTrabajoController {
    @Autowired
    private OfertaDeTrabajoService ofertaDeTrabajoService;
    @GetMapping
    public OfertaDeTrabajo guardarOferta(OfertaDeTrabajo ofertaDeTrabajo){
        return ofertaDeTrabajoService.guardarOferta(ofertaDeTrabajo);
    }
    @GetMapping
    public List<OfertaDeTrabajo> obtenerOfertas(){
        return ofertaDeTrabajoService.obtenerTodas();
    }
    @GetMapping
    public List<OfertaDeTrabajo> obtenerOfertasPorUsuario(Long idUsuario){
        return ofertaDeTrabajoService.obtenerOfertasPorIdUsuario(idUsuario);
    }
}
