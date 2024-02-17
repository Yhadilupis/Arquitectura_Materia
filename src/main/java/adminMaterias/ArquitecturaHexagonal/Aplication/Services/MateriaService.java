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
    private final CreateMateriaUseCase createMateriaUseCase;
    private final RetrieveMAteriaUseCase retrieveProductUseCase;
    private final UpdateMateriaUseCase updateMateriaUseCase;
    private final GetAdditionalMateriaUseCase getAdditionalMateriaUseCase;
    private final DeleteMateriaUseCase deleteMateriaUseCase;

    public MateriaService(CreateMateriaUseCase createMateriaUseCase, RetrieveMAteriaUseCase retrieveProductUseCase,
            UpdateMateriaUseCase updateMateriaUseCase, GetAdditionalMateriaUseCase getAdditionalMateriaUseCase,
            DeleteMateriaUseCase deleteMateriaUseCase) {
        this.createMateriaUseCase = createMateriaUseCase;
        this.retrieveProductUseCase = retrieveProductUseCase;
        this.updateMateriaUseCase = updateMateriaUseCase;
        this.getAdditionalMateriaUseCase = getAdditionalMateriaUseCase;
        this.deleteMateriaUseCase = deleteMateriaUseCase;
    }

    @Override
    public Materia CreateMateria(Materia materia) {
        return createMateriaUseCase.CreateMateria(materia);
    }

    @Override
    public Optional<Materia> updateMateria(Long id, Materia updatedProduct) {
        return updateMateriaUseCase.updateMateria(id, updatedProduct);
    }

    @Override
    public boolean DeleteMateria(Long id) {
        return deleteMateriaUseCase.DeleteMateria(id);
    }

    @Override
    public AdditionalMateriatInfo getAdditionalMateriaInfo(Long id) {
        return getAdditionalMateriaUseCase.getAdditionalMateriaInfo(id);
    }

    @Override
    public Optional<Materia> GetMateria(Long id) {
        return retrieveProductUseCase.GetMateria(id);
    }

    @Override
    public List<Materia> getAllMateriass() {
        return retrieveProductUseCase.getAllMateriass();
    }

}
