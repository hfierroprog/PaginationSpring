package cl.hfierroprog.inventario.Inventario.service;

import cl.hfierroprog.inventario.Inventario.Entity.Categoria;
import cl.hfierroprog.inventario.Inventario.service.vo.CategoriaResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoriaService {

    CategoriaResponse agregarCategoria(Categoria categoria);

    Page<Categoria> getCategorias(Pageable pageable);
}
