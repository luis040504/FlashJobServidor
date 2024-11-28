package mx.uv.fei.servidorflashjob.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "prestadorservicios")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Prestadorservicio {
    @Id
    @Column(name = "idPrestadorServicios", nullable = false)
    private Integer id;

    @Column(name = "idUsuario")
    private Integer idUsuario;

    @Column(name = "idCurriculum")
    private Integer idCurriculum;

    @OneToMany(mappedBy = "idPrestadorServicios")
    @JsonManagedReference
    private Set<Trabajo> trabajos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idPrestadorServicios")
    @JsonManagedReference
    private Set<Solicitudtrabajo> solicitudesTrabajo = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdCurriculum() {
        return idCurriculum;
    }

    public void setIdCurriculum(Integer idCurriculum) {
        this.idCurriculum = idCurriculum;
    }

}