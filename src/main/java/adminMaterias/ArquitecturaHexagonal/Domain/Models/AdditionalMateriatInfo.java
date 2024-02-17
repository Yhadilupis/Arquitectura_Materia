package adminMaterias.ArquitecturaHexagonal.Domain.Models;

import lombok.Getter;

@Getter
public class AdditionalMateriatInfo {
    private final Long id;
    private final String name;
    private final String email;

    public AdditionalMateriatInfo(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
