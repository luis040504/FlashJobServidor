package mx.uv.fei.servidorflashjob.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.time.LocalDate;
import mx.uv.fei.servidorflashjob.models.*;

@Entity
@Table(name = "trabajo")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Trabajo {
    @Id
    @Column(name = "idTrabajo", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario")
    @JsonBackReference
    private Usuario idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPrestadorServicios")
    @JsonBackReference
    private Prestadorservicio idPrestadorServicios;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSolciitud")
    @JsonBackReference
    private Solicitudtrabajo idSolciitud;

    @Column(name = "precioFinal")
    private Float precioFinal;

    @Column(name = "fechaFinal")
    private LocalDate fechaFinal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`idCalificación`")
    @JsonBackReference
    private Calificación idCalificación;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Prestadorservicio getIdPrestadorServicios() {
        return idPrestadorServicios;
    }

    public void setIdPrestadorServicios(Prestadorservicio idPrestadorServicios) {
        this.idPrestadorServicios = idPrestadorServicios;
    }

    public Solicitudtrabajo getIdSolciitud() {
        return idSolciitud;
    }

    public void setIdSolciitud(Solicitudtrabajo idSolciitud) {
        this.idSolciitud = idSolciitud;
    }

    public Float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Calificación getIdCalificación() {
        return idCalificación;
    }

    public void setIdCalificación(Calificación idCalificación) {
        this.idCalificación = idCalificación;
    }

}