package mx.uv.fei.servidorflashjob.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import mx.uv.fei.servidorflashjob.models.*;
@Entity
@Table(name = "`relacion curriculum`")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class RelacionCurriculum {
    @Id
    @Column(name = "idRelacion", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCurriculum")
    @JsonBackReference
    private Curriculum idCurriculum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idFormacion")
    @JsonBackReference
    private Formacion idFormacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idHistorial")
    @JsonBackReference
    private HistorialLaboral idHistorial;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Curriculum getIdCurriculum() {
        return idCurriculum;
    }

    public void setIdCurriculum(Curriculum idCurriculum) {
        this.idCurriculum = idCurriculum;
    }

    public Formacion getIdFormacion() {
        return idFormacion;
    }

    public void setIdFormacion(Formacion idFormacion) {
        this.idFormacion = idFormacion;
    }

    public HistorialLaboral getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(HistorialLaboral idHistorial) {
        this.idHistorial = idHistorial;
    }

}