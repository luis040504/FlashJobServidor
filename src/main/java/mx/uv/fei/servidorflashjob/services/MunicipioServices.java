package mx.uv.fei.servidorflashjob.services;

import jakarta.persistence.EntityManager;
import mx.uv.fei.servidorflashjob.models.Municipio;
import mx.uv.fei.servidorflashjob.repositories.IMunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipioServices {
    @Autowired
    private IMunicipioRepository iMunicipioRepository;
    @Autowired
    private EntityManager entityManager;
    public List<Municipio> obtenerTodos(){
        return iMunicipioRepository.findAll();
    }
}
