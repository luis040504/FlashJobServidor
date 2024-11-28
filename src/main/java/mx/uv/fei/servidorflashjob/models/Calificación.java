package mx.uv.fei.servidorflashjob.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import mx.uv.fei.servidorflashjob.models.*;
@Entity
@Table(name = "`calificación`")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Calificación {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`idCalificación`", nullable = false)
    private Integer id;

    @Column(name = "`calificación`")
    private Float calificación;

    @Column(name = "comentarios")
    private String comentarios;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTrabajo")
    @JsonBackReference
    private mx.uv.fei.servidorflashjob.models.Trabajo idTrabajo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getCalificación() {
        return calificación;
    }

    public void setCalificación(Float calificación) {
        this.calificación = calificación;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Trabajo getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(Trabajo idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

}