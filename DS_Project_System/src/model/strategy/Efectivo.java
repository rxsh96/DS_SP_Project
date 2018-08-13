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
public class Efectivo implements IPago {

    @Override
    public void pagar() {
        System.out.println("Pagando en efectivo");
    }
    
}
