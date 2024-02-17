package adminMaterias.ArquitecturaHexagonal.Domain.Ports.In;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;

import java.util.List;
import java.util.Optional;

public interface RetrieveMAteriaUseCase {
    Optional<Materia> GetMateria(Long id);

    List<Materia> getAllMateriass();
}
