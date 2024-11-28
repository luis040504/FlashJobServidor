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
@Table(name = "`oferta de trabajo`")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class OfertaDeTrabajo {
    @Id
    @Column(name = "idOferta", nullable = false)
    private Integer id;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "estado")
    private String estado;

    @Column(name = "contacto")
    private String contacto;

    @Column(name = "`dirección`")
    private String dirección;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "fechaNegociable")
    private String fechaNegociable;

    @Column(name = "precio")
    private Float precio;

    @Column(name = "precioNegociable")
    private String precioNegociable;

    @Column(name = "motivoSolicitudServicio")
    private String motivoSolicitudServicio;

    @Column(name = "Comentarios")
    private String comentarios;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario")
    @JsonBackReference
    private Usuario idUsuario;

    @OneToMany(mappedBy = "idOferta")
    @JsonManagedReference
    private Set<Solicitudtrabajo> solicitudes = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFechaNegociable() {
        return fechaNegociable;
    }

    public void setFechaNegociable(String fechaNegociable) {
        this.fechaNegociable = fechaNegociable;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getPrecioNegociable() {
        return precioNegociable;
    }

    public void setPrecioNegociable(String precioNegociable) {
        this.precioNegociable = precioNegociable;
    }

    public String getMotivoSolicitudServicio() {
        return motivoSolicitudServicio;
    }

    public void setMotivoSolicitudServicio(String motivoSolicitudServicio) {
        this.motivoSolicitudServicio = motivoSolicitudServicio;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

}