package mx.uv.fei.servidorflashjob.repositories;

import mx.uv.fei.servidorflashjob.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query("SELECT u FROM Usuario u WHERE u.nombreUsuario = :usuario AND u.contraseña = :contraseña")
    List<Usuario> findByUsuarioAndContraseña(@Param("usuario") String usuario, @Param("contraseña") String contraseña);
}