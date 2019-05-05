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
public class Contas {
    
    private String nome;
    private int numero;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
     /*public void depositar(double valor){
        this.saldo = this.saldo + valor;
        
    }*/
     
     public boolean depositar(double valor){
         if(valor>0){
             this.saldo += valor;
             return (true);
         }else{
         return (false);
         }
     }
    
    public boolean sacar(double valor){
        if(valor>0 && this.saldo>=valor){
            this.saldo-=valor;
            return (true);
        }else
            return (false);
    }

    public int transferir(int ContaOrigem, int ContaDestino, double valor){
            
                //COMPARANDO CONTA 1 COM CONTA 2
         if(ContaOrigem == Principal.conta1.getNumero() && ContaDestino == Principal.conta2.getNumero()){
            
            int i = JOptionPane.showConfirmDialog(null, "Conta de Origem do Senhor (a):\n"+Principal.conta1.getNome()+
                    "\nConta de Destino do Senhor (a):\n"+Principal.conta2.getNome()+"\nDeseja concluir a Tranferência?", "Cofitmação", JOptionPane.YES_NO_OPTION);
            
            if(i==0){
                
                if(Principal.conta1.sacar(valor)==true){
                    if(Principal.conta2.depositar(valor)==true){
                        JOptionPane.showMessageDialog(null, "Tranferência realizada com Sucesso!");
                        new Aba4().setVisible(true);
                    }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);}
                }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);
                 }
            }else{
                new Aba4().setVisible(true);
             }
        }
        //////////////////////////////////////
        
                //COMPARANDO CONTA 1 COM CONTA 3
        else if(ContaOrigem == Principal.conta1.getNumero() && ContaDestino == Principal.conta3.getNumero()){
            
            int i = JOptionPane.showConfirmDialog(null, "Conta de Origem do Senhor (a):\n"+Principal.conta1.getNome()+
                    "\nConta de Destino do Senhor (a):\n"+Principal.conta3.getNome()+"\nDeseja concluir a Tranferência?", "Cofitmação", JOptionPane.YES_NO_OPTION);
            
            if(i==0){
                
                if(Principal.conta1.sacar(valor)==true){
                    if(Principal.conta3.depositar(valor)==true){
                        JOptionPane.showMessageDialog(null, "Tranferência realizada com Sucesso!");
                        new Aba4().setVisible(true);
                    }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);}
                }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);
                 }
            }else{
                new Aba4().setVisible(true);
             }
        }
        ///////////////////////////////////////
        
                    //COMPARANDO COONTA2 COM CONTA 1
        else if(ContaOrigem == Principal.conta2.getNumero() && ContaDestino == Principal.conta1.getNumero()){
            
            int i = JOptionPane.showConfirmDialog(null, "Conta de Origem do Senhor (a):\n"+Principal.conta2.getNome()+
                    "\nConta de Destino do Senhor (a):\n"+Principal.conta1.getNome()+"\nDeseja concluir a Tranferência?", "Cofitmação", JOptionPane.YES_NO_OPTION);
            
            if(i==0){
            
                if(Principal.conta2.sacar(valor)==true){
                    if(Principal.conta1.depositar(valor)==true){
                        JOptionPane.showMessageDialog(null, "Tranferência realizada com Sucesso!");
                        new Aba4().setVisible(true);
                    }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);}
                }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);
                 }
                
            }else{
                new Aba4().setVisible(true);
             }
        }
        ///////////////////////////////////////////
        
                //COMPARANDO CONTA 2 COM CONTA 3
        else if(ContaOrigem == Principal.conta2.getNumero() && ContaDestino == Principal.conta3.getNumero()){
               
            int i = JOptionPane.showConfirmDialog(null, "Conta de Origem do Senhor (a):\n"+Principal.conta2.getNome()+
                    "\nConta de Destino do Senhor (a):\n"+Principal.conta3.getNome()+"\nDeseja concluir a Tranferência?", "Cofitmação", JOptionPane.YES_NO_OPTION);
            
            if(i==0){
            
                if(Principal.conta2.sacar(valor)==true){
                    if(Principal.conta3.depositar(valor)==true){
                        JOptionPane.showMessageDialog(null, "Tranferência realizada com Sucesso!");
                        new Aba4().setVisible(true);
                    }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);}
                }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);
                 }
            }else{
                new Aba4().setVisible(true);
             }
        }
        //////////////////////////////////
        
                //COMPARANDO CONTA 3 COM CONTA 1
        else if(ContaOrigem == Principal.conta3.getNumero() && ContaDestino == Principal.conta1.getNumero()){
        
            int i = JOptionPane.showConfirmDialog(null, "Conta de Origem do Senhor (a):\n"+Principal.conta3.getNome()+
                    "\nConta de Destino do Senhor (a):\n"+Principal.conta1.getNome()+"\nDeseja concluir a Tranferência?", "Cofitmação", JOptionPane.YES_NO_OPTION);
            
            if(i==0){
            
                if(Principal.conta3.sacar(valor)==true){
                    if(Principal.conta1.depositar(valor)==true){
                        JOptionPane.showMessageDialog(null, "Tranferência realizada com Sucesso!");
                        new Aba4().setVisible(true);
                    }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);}
                }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);
                 }
            }else{
                new Aba4().setVisible(true);
             }
        }
        ////////////////////////////////////////
        
                //COMPARANDO CONTA 3 COM CONTA 2
        else if(ContaOrigem == Principal.conta3.getNumero() && ContaDestino == Principal.conta2.getNumero()){
        
            int i = JOptionPane.showConfirmDialog(null, "Conta de Origem do Senhor (a):\n"+Principal.conta3.getNome()+
                    "\nConta de Destino do Senhor (a):\n"+Principal.conta2.getNome()+"\nDeseja concluir a Tranferência?", "Cofitmação", JOptionPane.YES_NO_OPTION);
            
            if(i==0){
            
                if(Principal.conta1.sacar(valor)==true){
                    if(Principal.conta3.depositar(valor)==true){
                        JOptionPane.showMessageDialog(null, "Tranferência realizada com Sucesso!");
                        new Aba4().setVisible(true);
                    }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);}
                }else{JOptionPane.showMessageDialog(null, "Tranferência não realizada!");
                    new Aba4().setVisible(true);
                 }
            }else{
                new Aba4().setVisible(true);
             }
        }else {
            if(ContaOrigem == ContaDestino){
                JOptionPane.showMessageDialog(null, "Tranferencia não pode ser realizada, Contas iguais!");
                new metodoTransferencia().setVisible(true);
            }else{JOptionPane.showMessageDialog(null, "Conta (s) Inexistende (s)!");
                new metodoTransferencia().setVisible(true);}
         }
       
        return (0); 
    }
  //////////////////////////////////////
    public void tipoConta(){
            JOptionPane.showMessageDialog(null, "Tipo de conta: Comum.");
        }
    
}
