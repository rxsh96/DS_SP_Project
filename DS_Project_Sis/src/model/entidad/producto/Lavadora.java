/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidad.producto;

/**
 *
 * @author rxsh96
 */
public class Lavadora extends Producto{

    public Lavadora() {
    }

    @Override
    public void construir() {
        System.out.println("Construyendo una Lavadora!");
    }

}