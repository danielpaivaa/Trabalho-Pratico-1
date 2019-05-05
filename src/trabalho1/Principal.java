/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import sun.security.provider.PolicyParser;

/**
 *
 * @author Daniel Paiva
 */
public class Principal {

    public static Contas conta1 = new Contas();
    public static Contas trans = new Contas();
    public static ContaPoupanca conta2 = new ContaPoupanca();
    public static ChequeEspecial conta3 = new ChequeEspecial();

   
    public static void main(String[] args) {
       
        new Inicio().setVisible(true);

    }
   
}
