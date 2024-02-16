package adminMaterias.ArquitecturaHexagonal.Domain.Ports.In;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;

public interface CreateMateriaUseCase {
    Materia CreateProduct(Materia product);

}
