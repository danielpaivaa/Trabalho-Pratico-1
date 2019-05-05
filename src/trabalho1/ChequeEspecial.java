/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Paiva
 */


public class ChequeEspecial extends Contas{
    
    public static double limite;
    public static double multa;

    
    /**
     *
     */
    public void descontar(double valor){
        
       valor += valor*(multa/100);
        setSaldo(valor*(-1));
    }

    public void tipoConta(){
            JOptionPane.showMessageDialog(null, "Tipo de conta: Cheque Especial.");
        }
    
}
