package mx.uv.fei.servidorflashjob.controllers;

import mx.uv.fei.servidorflashjob.models.Municipio;
import mx.uv.fei.servidorflashjob.services.MunicipioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/municipio")
public class MunicipioController {
    @Autowired
    private MunicipioServices municipioServices;
    @GetMapping
    public List<Municipio> obtenerMunicipios(){
        return municipioServices.obtenerTodos();
    }
}
