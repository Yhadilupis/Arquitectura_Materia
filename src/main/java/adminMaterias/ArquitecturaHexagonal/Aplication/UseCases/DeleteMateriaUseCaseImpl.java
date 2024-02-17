package adminMaterias.ArquitecturaHexagonal.Aplication.UseCases;

import adminMaterias.ArquitecturaHexagonal.Domain.Ports.In.DeleteMateriaUseCase;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out.MateriaRepositoryPort;

public class DeleteMateriaUseCaseImpl implements DeleteMateriaUseCase {
    private final MateriaRepositoryPort materiaRepositoryPort;

    public DeleteMateriaUseCaseImpl(MateriaRepositoryPort materiaRepositoryPort) {
        this.materiaRepositoryPort = materiaRepositoryPort;
    }

    @Override
    public boolean DeleteMateria(Long id) {
        return materiaRepositoryPort.deleteById(id);
    }
}
