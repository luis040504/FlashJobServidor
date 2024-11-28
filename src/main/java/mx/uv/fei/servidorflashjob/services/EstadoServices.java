package mx.uv.fei.servidorflashjob.services;

import jakarta.persistence.EntityManager;
import mx.uv.fei.servidorflashjob.models.Estado;
import mx.uv.fei.servidorflashjob.repositories.IEstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServices {
    @Autowired
    private IEstadoRepository iEstadoRepository;
    @Autowired
    private EntityManager entityManager;
    public List<Estado> obtenerTodos(){
        return iEstadoRepository.findAll();
    }
}
