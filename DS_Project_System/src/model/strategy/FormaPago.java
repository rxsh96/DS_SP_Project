/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.strategy;

/**
 *
 * @author rxsh96
 */
public class FormaPago implements IPago{
    
    private IPago ipago;

    public void setFormaPago(IPago pago){
        this.ipago = pago;
    }
    
    @Override
    public void pagar(){
        ipago.pagar();
    }
    
    
}
