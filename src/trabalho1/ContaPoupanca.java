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
   public class ContaPoupanca extends Contas{
       
       public static double reajuste;
       
       public void reajustar(double taxa){

            this.depositar(this.getSaldo()*(taxa/100));
       }

        public void reajustar(){
        
             this.depositar(this.getSaldo()*0.1);
       }
        
 
        public void tipoConta(){
            JOptionPane.showMessageDialog(null, "Tipo de conta: Poupança.");
        }
}
    

