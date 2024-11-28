package mx.uv.fei.servidorflashjob.controllers;

import mx.uv.fei.servidorflashjob.models.Prestadorservicio;
import mx.uv.fei.servidorflashjob.services.PrestadorServiciosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/prestadorServicio")
public class PrestadorServicioController {
    @Autowired
    private PrestadorServiciosServices prestadorServiciosServices;
    @GetMapping
    public List<Prestadorservicio> obtenerPrestadoresDeServicio(){
        return prestadorServiciosServices.obtenerTodos();
    }
    @GetMapping
    public Prestadorservicio guardarPrestadorServicio(Prestadorservicio prestadorservicio){
        return prestadorServiciosServices.guardarPrestador(prestadorservicio);
    }

}
