package adminMaterias.ArquitecturaHexagonal.Aplication.Services;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.AdditionalMateriatInfo;
import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.In.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService implements CreateMateriaUseCase, RetrieveMAteriaUseCase, UpdateMateriaUseCase,
        GetAdditionalMateriaUseCase, DeleteMateriaUseCase {
    private final CreateMateriaUseCase createProductUseCase;
    private final RetrieveMAteriaUseCase retrieveProductUseCase;
    private final UpdateMateriaUseCase updateMateriaUseCase;
    private final GetAdditionalMateriaUseCase getAdditionalProductUseCase;
    private final DeleteMateriaUseCase deleteProductUseCase;

    public MateriaService(CreateMateriaUseCase createProductUseCase, RetrieveMAteriaUseCase retrieveProductUseCase,
            UpdateMateriaUseCase updateMateriaUseCase, GetAdditionalMateriaUseCase getAdditionalProductUseCase,
            DeleteMateriaUseCase deleteProductUseCase) {
        this.createProductUseCase = createProductUseCase;
        this.retrieveProductUseCase = retrieveProductUseCase;
        this.updateMateriaUseCase = updateMateriaUseCase;
        this.getAdditionalProductUseCase = getAdditionalProductUseCase;
        this.deleteProductUseCase = deleteProductUseCase;
    }

    @Override
    public Materia CreateProduct(Materia materia) {
        return createProductUseCase.CreateProduct(materia);
    }

    @Override
    public Optional<Materia> updateMateria(Long id, Materia updatedProduct) {
        return updateMateriaUseCase.updateMateria(id, updatedProduct);
    }

    @Override
    public boolean DeleteProduct(Long id) {
        return deleteProductUseCase.DeleteProduct(id);
    }

    @Override
    public AdditionalMateriatInfo getAdditionalMateriaInfo(Long id) {
        return getAdditionalProductUseCase.getAdditionalMateriaInfo(id);
    }

    @Override
    public Optional<Materia> GetProduct(Long id) {
        return retrieveProductUseCase.GetProduct(id);
    }

    @Override
    public List<Materia> GetAllProducts() {
        return retrieveProductUseCase.GetAllProducts();
    }

}
