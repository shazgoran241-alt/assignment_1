/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttest_1;


public class account {
   



    private  int id ;
    private double balance;
    
    public account(int id,double balance){
        this.id=id;
     this.balance=balance; 
     if(balance>0){
       this.balance=balance;  
     }
     else{  
     this.balance=0;
    
    }
    }
    public int getid(){
        return id;
    }
    public double getbalance(){
        return balance;
    }
    public void setDesposite(double Desposite){
        if(Desposite>0){
            balance+=Desposite;
            
        }
    }
    public void setDebit(double Debit){
        if(Debit>balance){
            System.out.println("Debit amount exceeded account balance ");
        }else{
           balance-=Debit; 
    }
    }
    
    
    
    
    
    
    
}}
