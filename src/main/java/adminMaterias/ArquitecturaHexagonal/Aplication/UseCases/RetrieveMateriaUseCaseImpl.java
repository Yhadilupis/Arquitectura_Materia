package adminMaterias.ArquitecturaHexagonal.Aplication.UseCases;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.In.RetrieveMAteriaUseCase;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out.MateriaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveMateriaUseCaseImpl implements RetrieveMAteriaUseCase {

    private final MateriaRepositoryPort materiaRepositoryPort;

    public RetrieveMateriaUseCaseImpl(MateriaRepositoryPort materiaRepositoryPort) {
        this.materiaRepositoryPort = materiaRepositoryPort;
    }

    @Override
    public Optional<Materia> GetProduct(Long id) {
        return materiaRepositoryPort.findById(id);
    }

    @Override
    public List<Materia> GetAllProducts() {
        return materiaRepositoryPort.findAll();
    }
}
