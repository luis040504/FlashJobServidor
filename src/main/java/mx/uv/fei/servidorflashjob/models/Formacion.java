package mx.uv.fei.servidorflashjob.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "formacion")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Formacion {
    @Id
    @Column(name = "idFormacion", nullable = false)
    private Integer id;

    @Column(name = "GradoDeEstudio")
    private String gradoDeEstudio;

    @Column(name = "lugarDeEstudio")
    private String lugarDeEstudio;

    @Column(name = "fechaConclusionEstudios")
    private LocalDate fechaConclusionEstudios;

    @OneToMany(mappedBy = "idFormacion")
    @JsonManagedReference
    private Set<RelacionCurriculum> relacionCurriculum = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradoDeEstudio() {
        return gradoDeEstudio;
    }

    public void setGradoDeEstudio(String gradoDeEstudio) {
        this.gradoDeEstudio = gradoDeEstudio;
    }

    public String getLugarDeEstudio() {
        return lugarDeEstudio;
    }

    public void setLugarDeEstudio(String lugarDeEstudio) {
        this.lugarDeEstudio = lugarDeEstudio;
    }

    public LocalDate getFechaConclusionEstudios() {
        return fechaConclusionEstudios;
    }

    public void setFechaConclusionEstudios(LocalDate fechaConclusionEstudios) {
        this.fechaConclusionEstudios = fechaConclusionEstudios;
    }

}