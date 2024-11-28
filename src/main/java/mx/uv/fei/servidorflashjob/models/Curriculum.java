package mx.uv.fei.servidorflashjob.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "curriculum")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Curriculum {
    @Id
    @Column(name = "idCurriculum", nullable = false)
    private Integer id;

    @Column(name = "resumenProfesional")
    private String resumenProfesional;

    @OneToMany(mappedBy = "idCurriculum")
    @JsonManagedReference
    private Set<RelacionCurriculum> relacionCurriculum = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResumenProfesional() {
        return resumenProfesional;
    }

    public void setResumenProfesional(String resumenProfesional) {
        this.resumenProfesional = resumenProfesional;
    }

}