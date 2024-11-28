package mx.uv.fei.servidorflashjob.repositories;

import mx.uv.fei.servidorflashjob.models.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITrabajoRepository extends JpaRepository<Trabajo,Integer> {
    @Query("SELECT t FROM Trabajo t WHERE t.idUsuario = :idUsuario")
    List<Trabajo> findByIdUsuario(@Param("idUsuario") Long idUsuario);
}
