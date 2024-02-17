package adminMaterias.ArquitecturaHexagonal.Aplication.UseCases;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.In.CreateMateriaUseCase;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out.MateriaRepositoryPort;

public class CreateMateriaUseCaseImpl implements CreateMateriaUseCase {
    private final MateriaRepositoryPort materiaRepositoryPort;

    public CreateMateriaUseCaseImpl(MateriaRepositoryPort materiaRepositoryPort) {
        this.materiaRepositoryPort = materiaRepositoryPort;
    }

    @Override
    public Materia CreateMateria(Materia materia) {
        return materiaRepositoryPort.save(materia);
    }
}
