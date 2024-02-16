package adminMaterias.ArquitecturaHexagonal.infrastructure.Repositories;

import adminMaterias.ArquitecturaHexagonal.infrastructure.Entities.MateriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<MateriaEntity, Long> {
}
