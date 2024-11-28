package mx.uv.fei.servidorflashjob.repositories;

import mx.uv.fei.servidorflashjob.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoRepository extends JpaRepository<Estado,Integer> {
}
