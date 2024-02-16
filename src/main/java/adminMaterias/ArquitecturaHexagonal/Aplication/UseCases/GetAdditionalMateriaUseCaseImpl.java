package adminMaterias.ArquitecturaHexagonal.Aplication.UseCases;

import adminMaterias.ArquitecturaHexagonal.Domain.Models.AdditionalMateriatInfo;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.In.GetAdditionalMateriaUseCase;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out.ExternalServicePort;

public class GetAdditionalMateriaUseCaseImpl implements GetAdditionalMateriaUseCase {
    private final ExternalServicePort servicePort;

    public GetAdditionalMateriaUseCaseImpl(ExternalServicePort servicePort) {
        this.servicePort = servicePort;
    }

    @Override
    public AdditionalMateriatInfo getAdditionalMateriatInfo(Long id) {
        return servicePort.getAdditionalProduct(id);
    }
}
