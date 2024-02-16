package adminMaterias.ArquitecturaHexagonal.Aplication.UseCases;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.In.UpdateMateriaUseCase;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out.MateriaRepositoryPort;
import java.util.Optional;

public class UpdateMateriaUseCaseImpl implements UpdateMateriaUseCase {
    private final MateriaRepositoryPort materiaRepositoryPort;

    public UpdateMateriaUseCaseImpl(MateriaRepositoryPort materiaRepositoryPort) {
        this.materiaRepositoryPort = materiaRepositoryPort;
    }

    @Override
    public Optional<Materia> updateMateria(Long id, Materia updatedProduct) {
        return materiaRepositoryPort.update(id, updatedProduct);
    }
}
