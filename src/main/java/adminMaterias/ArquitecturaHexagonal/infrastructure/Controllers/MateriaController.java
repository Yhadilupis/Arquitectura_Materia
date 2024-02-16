package adminMaterias.ArquitecturaHexagonal.infrastructure.Controllers;

import adminMaterias.ArquitecturaHexagonal.Aplication.Services.MateriaService;
import adminMaterias.ArquitecturaHexagonal.Domain.Models.Materia;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/materias")
@RequiredArgsConstructor
public class MateriaController {
    private final MateriaService productService;

    @PostMapping
    public ResponseEntity<Materia> createProduct(@RequestBody Materia materia) {
        Materia createdProduct = productService.CreateProduct(materia);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Materia> getProduct(@PathVariable Long id) {
        return productService.GetProduct(id)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        return new ResponseEntity<>(productService.GetAllProducts(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Materia> updateMateria(@PathVariable Long id, @RequestBody Materia updatedProduct) {
        return productService.updateMateria(id, updatedProduct)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        return productService.DeleteProduct(id) ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/additionalInfo/{id}")
    public ResponseEntity<?> getAdditionalMateriatInfo(@PathVariable Long id) {
        return new ResponseEntity<>(productService.getAdditionalMateriaInfo(id), HttpStatus.OK);
    }
}
