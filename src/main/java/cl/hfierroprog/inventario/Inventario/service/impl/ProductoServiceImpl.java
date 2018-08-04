package cl.hfierroprog.inventario.Inventario.service.impl;

import cl.hfierroprog.inventario.Inventario.Dao.CategoriaDao;
import cl.hfierroprog.inventario.Inventario.Dao.ProductoDao;
import cl.hfierroprog.inventario.Inventario.Entity.Categoria;
import cl.hfierroprog.inventario.Inventario.Entity.Producto;
import cl.hfierroprog.inventario.Inventario.service.ProductoService;
import cl.hfierroprog.inventario.Inventario.service.vo.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("ProductoService")
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Autowired
    private CategoriaDao categoriaDao;

    public ProductoResponse agregarProducto(Producto producto) {
        ProductoResponse productoResponse = new ProductoResponse();

        Categoria cat = categoriaDao.findById(producto.getCategoria().getId());

        if(cat == null) {
            productoResponse.setCode(400);
            productoResponse.setMensaje("Error al validar categoria!");
            productoResponse.setNombreProducto("nulo");
        }else {
            producto.setCategoria(cat);
            try {
                Producto productoDb = productoDao.save(producto);

                productoResponse.setNombreProducto(productoDb.getNombre());
                productoResponse.setCode(200);
                productoResponse.setMensaje("Producto agregado correctamente!");
            }catch (Exception ex) {
                productoResponse.setNombreProducto("nulo");
                productoResponse.setCode(400);
                productoResponse.setMensaje("Error al agregar nuevo producto!");
            }
        }

        return productoResponse;
    }

    @Override
    public Page<Producto> getProductos(Pageable pageable) {
        return productoDao.findAll(pageable);
    }

    @Override
    public Long getCantidadProductos() {
        return productoDao.count();
    }
}
