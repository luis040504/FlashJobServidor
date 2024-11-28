package mx.uv.fei.servidorflashjob.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import mx.uv.fei.servidorflashjob.models.OfertaDeTrabajo;
import mx.uv.fei.servidorflashjob.repositories.IOfertaDeTrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfertaDeTrabajoService {
    @Autowired
    private IOfertaDeTrabajoRepository iOfertaDeTrabajoRepository;
    @Autowired
    private EntityManager entityManager;
    public List<OfertaDeTrabajo> obtenerTodas(){
        return iOfertaDeTrabajoRepository.findAll();
    }
    public OfertaDeTrabajo guardarOferta(OfertaDeTrabajo ofertaDeTrabajo){
        return iOfertaDeTrabajoRepository.save(ofertaDeTrabajo);
    }
    public List<OfertaDeTrabajo> obtenerOfertasPorIdUsuario(Long idUsuario) {
        return iOfertaDeTrabajoRepository.findOfertasByIdUsuario(idUsuario);
    }
}
