package mx.uv.fei.servidorflashjob.services;

import jakarta.persistence.EntityManager;
import mx.uv.fei.servidorflashjob.models.Usuario;
import mx.uv.fei.servidorflashjob.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServices {
    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Autowired
    private EntityManager entityManager;

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario agregarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> obtenerUsuariosPorCredenciales(String usuario, String contraseña) {
        return usuarioRepository.findByUsuarioAndContraseña(usuario, contraseña);
    }
}

