package adminMaterias.ArquitecturaHexagonal.infrastructure.Repositories;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out.MateriaRepositoryPort;
import adminMaterias.ArquitecturaHexagonal.infrastructure.Entities.MateriaEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JpaProductRepositoryAdapter implements MateriaRepositoryPort {
    private final JpaProductRepository jpaProductRepository;

    public JpaProductRepositoryAdapter(JpaProductRepository jpaProductRepository) {
        this.jpaProductRepository = jpaProductRepository;
    }

    @Override
    public Materia save(Materia materia) {
        MateriaEntity productEntity = MateriaEntity.fromDomainiModel(materia);
        MateriaEntity savedProductEntity = jpaProductRepository.save(productEntity);
        return savedProductEntity.toDomainModel();
    }

    @Override
    public Optional<Materia> findById(Long id) {
        return jpaProductRepository.findById(id).map(MateriaEntity::toDomainModel);
    }

    @Override
    public List<Materia> findAll() {
        return jpaProductRepository.findAll()
                .stream()
                .map(MateriaEntity::toDomainModel)
                .toList();
    }

    @Override
    public Optional<Materia> update(Long id, Materia materia) {
        if (jpaProductRepository.existsById(id)) {
            MateriaEntity productEntity = MateriaEntity.fromDomainiModel(materia);
            productEntity.setId(id);
            MateriaEntity updatedProductEntity = jpaProductRepository.save(productEntity);
            return Optional.of(updatedProductEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaProductRepository.existsById(id)) {
            jpaProductRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
