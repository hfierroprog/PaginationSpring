package cl.hfierroprog.inventario.Inventario.RestController;

import cl.hfierroprog.inventario.Inventario.Entity.Producto;
import cl.hfierroprog.inventario.Inventario.service.ProductoService;
import cl.hfierroprog.inventario.Inventario.service.vo.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/agregarProducto")
    public ProductoResponse agregarProducto(@RequestBody Producto producto){
        return productoService.agregarProducto(producto);
    }

    @GetMapping("/getProductos")
    public Object getProductos(Pageable pageable) {
        return productoService.getProductos(pageable);
    }
}
