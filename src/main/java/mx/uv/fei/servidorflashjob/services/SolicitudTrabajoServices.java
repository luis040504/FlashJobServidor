package mx.uv.fei.servidorflashjob.services;

import jakarta.persistence.EntityManager;
import mx.uv.fei.servidorflashjob.models.Solicitudtrabajo;
import mx.uv.fei.servidorflashjob.repositories.ISolicitudTrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudTrabajoServices {
    @Autowired
    private ISolicitudTrabajoRepository iSolicitudTrabajoRepository;
    @Autowired
    private EntityManager entityManager;
    public List<Solicitudtrabajo> obtenerTodos(){
        return iSolicitudTrabajoRepository.findAll();
    }
    public Solicitudtrabajo guardarSolicitud(Solicitudtrabajo solicitudtrabajo){
        return iSolicitudTrabajoRepository.save(solicitudtrabajo);
    }
    public List<Solicitudtrabajo> obtenerSolicitudesPorIdOferta(Long idOferta) {
        return iSolicitudTrabajoRepository.findByIdOferta(idOferta);
    }
}
