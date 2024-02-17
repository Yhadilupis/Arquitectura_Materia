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
    private final MateriaService materiaService;

    @PostMapping
    public ResponseEntity<Materia> CreateMateria(@RequestBody Materia materia) {
        Materia createdProduct = materiaService.CreateMateria(materia);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Materia> GetMateria(@PathVariable Long id) {
        return materiaService.GetMateria(id)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<?> getAllMateriass() {
        return new ResponseEntity<>(materiaService.getAllMateriass(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Materia> updateMateria(@PathVariable Long id, @RequestBody Materia updateMateria) {
        return materiaService.updateMateria(id, updateMateria)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMateria(@PathVariable Long id) {
        return materiaService.DeleteMateria(id) ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/additionalInfo/{id}")
    public ResponseEntity<?> getAdditionalMateriatInfo(@PathVariable Long id) {
        return new ResponseEntity<>(materiaService.getAdditionalMateriaInfo(id), HttpStatus.OK);
    }
}
