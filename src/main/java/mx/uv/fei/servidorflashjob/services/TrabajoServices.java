package mx.uv.fei.servidorflashjob.services;

import jakarta.persistence.EntityManager;
import mx.uv.fei.servidorflashjob.models.Trabajo;
import mx.uv.fei.servidorflashjob.models.Usuario;
import mx.uv.fei.servidorflashjob.repositories.ITrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajoServices {
    @Autowired
    private ITrabajoRepository iTrabajoRepository;
    @Autowired
    private EntityManager entityManager;
    public List<Trabajo> obtenerTodos(){
        return iTrabajoRepository.findAll();
    }
    public Trabajo guardarTrabajo (Trabajo trabajo){
        return iTrabajoRepository.save(trabajo);
    }
    public List<Trabajo> obtenerTrabajosPorIdUsuario(Long idUsuario) {
        return iTrabajoRepository.findByIdUsuario(idUsuario);
    }
}
