package cl.hfierroprog.inventario.Inventario.service;

import cl.hfierroprog.inventario.Inventario.Entity.Producto;
import cl.hfierroprog.inventario.Inventario.service.vo.ProductoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductoService {

    ProductoResponse agregarProducto(Producto producto);

    Page<Producto> getProductos(Pageable pageable);
}
