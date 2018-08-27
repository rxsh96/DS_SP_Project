/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.strategy.pago;

/**
 *
 * @author rxsh96
 */
public class FormaPago {

    private IPago ipago;

    public FormaPago() {
    }

    public void setFormaPago(IPago pago) {
        this.ipago = pago;
    }

    public void pagar() {
    }

}