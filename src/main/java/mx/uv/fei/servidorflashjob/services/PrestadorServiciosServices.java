package mx.uv.fei.servidorflashjob.services;

import jakarta.persistence.EntityManager;
import mx.uv.fei.servidorflashjob.models.Prestadorservicio;
import mx.uv.fei.servidorflashjob.repositories.IPrestadorServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestadorServiciosServices {
    @Autowired
    private IPrestadorServiciosRepository iPrestadorServiciosRepository;
    @Autowired
    private EntityManager entityManager;
    public List<Prestadorservicio> obtenerTodos(){
        return iPrestadorServiciosRepository.findAll();
    }
    public Prestadorservicio guardarPrestador(Prestadorservicio prestadorservicio){
        return iPrestadorServiciosRepository.save(prestadorservicio);
    }
}
