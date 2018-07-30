package cl.hfierroprog.inventario.Inventario.service.impl;

import cl.hfierroprog.inventario.Inventario.Dao.CategoriaDao;
import cl.hfierroprog.inventario.Inventario.Entity.Categoria;
import cl.hfierroprog.inventario.Inventario.service.CategoriaService;
import cl.hfierroprog.inventario.Inventario.service.vo.CategoriaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("CategoriaService")
@Transactional
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public CategoriaResponse agregarCategoria(Categoria categoria) {
        CategoriaResponse categoriaResponse = new CategoriaResponse();

        try {
            Categoria categoriaDb = categoriaDao.save(categoria);

            categoriaResponse.setNombre(categoriaDb.getNombre());
            categoriaResponse.setCode(200);
            categoriaResponse.setMensaje("Agregado correctamente!");
        }catch (Exception ex) {
            categoriaResponse.setNombre("nulo");
            categoriaResponse.setCode(400);
            categoriaResponse.setMensaje("Error al agregar categoria!");
        }

        return categoriaResponse;
    }

    @Override
    public Page<Categoria> getCategorias(Pageable pageable) {
        return categoriaDao.findAll(pageable);
    }
}
