package cl.hfierroprog.inventario.Inventario.service.vo;

public class CategoriaResponse extends StandarResponse{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CategoriaResponse{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
