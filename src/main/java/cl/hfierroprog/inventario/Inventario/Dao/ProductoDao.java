package cl.hfierroprog.inventario.Inventario.Dao;

import cl.hfierroprog.inventario.Inventario.Entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductoDao extends PagingAndSortingRepository<Producto, Integer> {
}
