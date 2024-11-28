package mx.uv.fei.servidorflashjob.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import mx.uv.fei.servidorflashjob.models.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "solicitudtrabajo")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Solicitudtrabajo {
    @Id
    @Column(name = "idSolciitud", nullable = false)
    private Integer id;

    @Column(name = "precioPropuesto")
    private Float precioPropuesto;

    @Column(name = "fechaPropuesta")
    private LocalDate fechaPropuesta;

    @Column(name = "comentarios")
    private String comentarios;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idOferta")
    @JsonBackReference
    private OfertaDeTrabajo idOferta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPrestadorServicios")
    @JsonBackReference
    private Prestadorservicio idPrestadorServicios;

    @OneToMany(mappedBy = "idSolciitud")
    @JsonManagedReference
    private Set<Trabajo> trabajos = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPrecioPropuesto() {
        return precioPropuesto;
    }

    public void setPrecioPropuesto(Float precioPropuesto) {
        this.precioPropuesto = precioPropuesto;
    }

    public LocalDate getFechaPropuesta() {
        return fechaPropuesta;
    }

    public void setFechaPropuesta(LocalDate fechaPropuesta) {
        this.fechaPropuesta = fechaPropuesta;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public OfertaDeTrabajo getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(OfertaDeTrabajo idOferta) {
        this.idOferta = idOferta;
    }

    public Prestadorservicio getIdPrestadorServicios() {
        return idPrestadorServicios;
    }

    public void setIdPrestadorServicios(Prestadorservicio idPrestadorServicios) {
        this.idPrestadorServicios = idPrestadorServicios;
    }

}