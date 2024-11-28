package mx.uv.fei.servidorflashjob.repositories;

import mx.uv.fei.servidorflashjob.models.OfertaDeTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOfertaDeTrabajoRepository extends JpaRepository<OfertaDeTrabajo,Integer> {
    @Query("SELECT o FROM OfertaDeTrabajo o WHERE o.idUsuario = :idUsuario")
    List<OfertaDeTrabajo> findOfertasByIdUsuario(@Param("idUsuario") Long idUsuario);
}
