
package model.entidad.articulo;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Producto {
    private final SimpleStringProperty codigo;
    private final SimpleStringProperty nombre;
    private final SimpleStringProperty modelo;
    private final SimpleIntegerProperty precio;

    public Producto(String codigo, String nombre, String modelo, Integer precio) {
        this.codigo = new SimpleStringProperty(codigo);
        this.nombre = new SimpleStringProperty(nombre);
        this.modelo = new SimpleStringProperty(modelo);
        this.precio = new SimpleIntegerProperty(precio);
    }

    public String getCodigo() {
        return codigo.get();
    }

    public String getNombre() {
        return nombre.get();
    }

    public String getModelo() {
        return modelo.get();
    }

    public Integer getPrecio() {
        return precio.get();
    }
    
    
}
