package adminMaterias.ArquitecturaHexagonal.Domain.Ports.In;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;

import java.util.Optional;

public interface UpdateMateriaUseCase {

    Optional<Materia> updateMateria(Long id, Materia updMateria);
}
