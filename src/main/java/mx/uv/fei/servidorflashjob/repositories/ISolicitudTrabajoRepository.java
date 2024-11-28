package mx.uv.fei.servidorflashjob.repositories;

import mx.uv.fei.servidorflashjob.models.Solicitudtrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ISolicitudTrabajoRepository extends JpaRepository<Solicitudtrabajo,Integer> {
    @Query("SELECT s FROM Solicitudtrabajo s WHERE s.idOferta = :idOferta")
    List<Solicitudtrabajo> findByIdOferta(@Param("idOferta") Long idOferta);
}
