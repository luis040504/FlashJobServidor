package mx.uv.fei.servidorflashjob.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "municipio")
public class Municipio {
    @Id
    @Column(name = "CTLG_MUNICIPIO_ID", nullable = false)
    private Integer id;

    @Column(name = "CTLG_MUNICIPIO_DESC")
    private String ctlgMunicipioDesc;

    @Column(name = "CTLG_ESTADO_ID")
    private Integer ctlgEstadoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCtlgMunicipioDesc() {
        return ctlgMunicipioDesc;
    }

    public void setCtlgMunicipioDesc(String ctlgMunicipioDesc) {
        this.ctlgMunicipioDesc = ctlgMunicipioDesc;
    }

    public Integer getCtlgEstadoId() {
        return ctlgEstadoId;
    }

    public void setCtlgEstadoId(Integer ctlgEstadoId) {
        this.ctlgEstadoId = ctlgEstadoId;
    }

}