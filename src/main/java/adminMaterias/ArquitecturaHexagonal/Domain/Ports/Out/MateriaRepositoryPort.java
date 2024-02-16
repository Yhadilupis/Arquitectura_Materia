package adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;

import java.util.List;
import java.util.Optional;

public interface MateriaRepositoryPort {
    Materia save(Materia materia);

    Optional<Materia> findById(Long id);

    List<Materia> findAll();

    Optional<Materia> update(Long id, Materia materia);

    boolean deleteById(Long id);

}
