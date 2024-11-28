package mx.uv.fei.servidorflashjob.controllers;

import mx.uv.fei.servidorflashjob.models.Usuario;
import mx.uv.fei.servidorflashjob.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioServices usuarioServices;

    @GetMapping
    public List<Usuario> obtenerTodos() {
        return usuarioServices.obtenerTodos();
    }

    @PostMapping
    public Usuario agregarEmpleado(@RequestBody Usuario usuario) {
        return usuarioServices.agregarUsuario(usuario);
    }
}
