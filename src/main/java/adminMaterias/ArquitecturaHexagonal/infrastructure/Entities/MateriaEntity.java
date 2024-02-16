package adminMaterias.ArquitecturaHexagonal.infrastructure.Entities;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "materias")
@Getter
@Setter

public class MateriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String carrera;
    private boolean estatus;

    public MateriaEntity() {
    }

    public MateriaEntity(Long id, String name, String carrera, boolean estatus) {
        this.id = id;
        this.name = name;
        this.carrera = carrera;
        this.estatus = estatus;
    }

    public static MateriaEntity fromDomainiModel(adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia materia) {
        return new MateriaEntity(materia.getId(), materia.getName(), materia.getCarrera(), materia.isEstatus());
    }

    public Materia toDomainModel() {
        return new Materia(this.id, this.name, this.carrera, this.estatus);
    }
}
