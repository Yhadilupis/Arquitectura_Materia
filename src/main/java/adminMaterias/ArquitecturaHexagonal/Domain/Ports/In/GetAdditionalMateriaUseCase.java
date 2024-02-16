package adminMaterias.ArquitecturaHexagonal.Domain.Ports.In;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.AdditionalMateriatInfo;

public interface GetAdditionalMateriaUseCase {
    AdditionalMateriatInfo getAdditionalMateriaInfo(Long id);
}
