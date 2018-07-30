package cl.hfierroprog.inventario.Inventario.Dao;

import cl.hfierroprog.inventario.Inventario.Entity.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface CategoriaDao extends PagingAndSortingRepository<Categoria, Integer> {
    Categoria findById(int id);

    @Query("SELECT c FROM Categoria c WHERE c.nombre = :cat")
    Categoria findByNombre(@Param("cat") String categoria);
}
