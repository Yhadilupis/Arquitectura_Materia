package adminMaterias.ArquitecturaHexagonal.infrastructure.Config;

import adminMaterias.ArquitecturaHexagonal.Aplication.Services.MateriaService;
import adminMaterias.ArquitecturaHexagonal.Aplication.UseCases.*;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.In.GetAdditionalMateriaUseCase;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out.ExternalServicePort;
import adminMaterias.ArquitecturaHexagonal.Domain.Ports.Out.MateriaRepositoryPort;
import adminMaterias.ArquitecturaHexagonal.infrastructure.Adapters.ExternalServiceAdapter;
import adminMaterias.ArquitecturaHexagonal.infrastructure.Repositories.JpaProductRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MateriaService productService(MateriaRepositoryPort productRepositoryPort,
            GetAdditionalMateriaUseCase getAdditionalProductUseCase) {
        return new MateriaService(
                new CreateMateriaUseCaseImpl(productRepositoryPort),
                new RetrieveMateriaUseCaseImpl(productRepositoryPort),
                new UpdateMateriaUseCaseImpl(productRepositoryPort), getAdditionalProductUseCase,
                new DeleteMateriaUseCaseImpl(productRepositoryPort));
    }

    @Bean
    public MateriaRepositoryPort productRepositoryPort(JpaProductRepositoryAdapter jpaProductRepositoryAdapter) {
        return jpaProductRepositoryAdapter;
    }

    @Bean
    public GetAdditionalMateriaUseCase getAdditionalProductUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalMateriaUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }

}
