package cl.hfierroprog.inventario.Inventario.service.vo;

public class StandarResponse {
    private int code;
    private String mensaje;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "StandarResponse{" +
                "code=" + code +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
