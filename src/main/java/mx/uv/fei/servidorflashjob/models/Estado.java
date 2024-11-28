package mx.uv.fei.servidorflashjob.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @Column(name = "CTLG_ESTADO_ID", nullable = false)
    private Integer id;

    @Column(name = "CTLG_ESTADO_DESC")
    private String ctlgEstadoDesc;

    @Column(name = "CTLG_PAIS_ID")
    private Integer ctlgPaisId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCtlgEstadoDesc() {
        return ctlgEstadoDesc;
    }

    public void setCtlgEstadoDesc(String ctlgEstadoDesc) {
        this.ctlgEstadoDesc = ctlgEstadoDesc;
    }

    public Integer getCtlgPaisId() {
        return ctlgPaisId;
    }

    public void setCtlgPaisId(Integer ctlgPaisId) {
        this.ctlgPaisId = ctlgPaisId;
    }

}