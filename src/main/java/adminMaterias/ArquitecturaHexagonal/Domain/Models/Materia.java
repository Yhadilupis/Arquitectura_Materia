package adminMaterias.ArquitecturaHexagonal.Domain.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Materia {
    private Long id;
    private String name;
    private String carrera;
    private boolean estatus;

    public Materia(Long id, String name, String carrera, boolean estatus) {
        this.id = id;
        this.name = name;
        this.carrera = carrera;
        this.estatus = estatus;
    }

}
