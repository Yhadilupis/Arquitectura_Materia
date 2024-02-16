package adminMaterias.ArquitecturaHexagonal.Aplication.UseCases;

import adminMaterias.ArquitecturaHexagonal.Domain.Ports.In.DeleteMateriaUseCase;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out.MateriaRepositoryPort;

public class DeleteMateriaUseCaseImpl implements DeleteMateriaUseCase {
    private final MateriaRepositoryPort productRepositoryPort;

    public DeleteMateriaUseCaseImpl(MateriaRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public boolean DeleteProduct(Long id) {
        return productRepositoryPort.deleteById(id);
    }
}
