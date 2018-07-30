package cl.hfierroprog.inventario.Inventario.service.vo;

public class ProductoResponse extends StandarResponse{
    private String nombreProducto;

    public ProductoResponse() {

    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "ProductoResponse{" +
                "nombreProducto='" + nombreProducto + '\'' +
                '}';
    }
}
