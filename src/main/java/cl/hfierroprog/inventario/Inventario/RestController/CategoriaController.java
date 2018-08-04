package cl.hfierroprog.inventario.Inventario.RestController;

import cl.hfierroprog.inventario.Inventario.Entity.Categoria;
import cl.hfierroprog.inventario.Inventario.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/agregarCategoria")
    public Object addCat(@RequestBody Categoria categoria) {
        return categoriaService.agregarCategoria(categoria);
    }

    @GetMapping("/getCategorias")
    public Object getCategorias(Pageable pageable) {
        return categoriaService.getCategorias(pageable);
    }

    /*@GetMapping("/getCatNom/{cat}")
    public Object getCatNom(@PathVariable("cat") String categoria) {

        Categoria respuestaSQL = categoriaDao.findByNombre(categoria);

        if(respuestaSQL != null) {
            return respuestaSQL;
        }else {
            return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
        }
    }*/
}
