package adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.AdditionalMateriatInfo;

public interface ExternalServicePort {
    AdditionalMateriatInfo gMateriatInfo(Long id);
}
