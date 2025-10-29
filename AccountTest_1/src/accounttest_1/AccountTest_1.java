/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accounttest_1;

/**
 *
 * @author MSI
 */
public class AccountTest_1 {

   
    public static void main(String[] args) {
      
    account a1=new account(33,300);
   account a2=new account(12,400);
    
        System.out.println("a1 B---->  "+  a1.getbalance());
    System.out.println("a2 B---->  "    +a2.getbalance());
    
    a1.setDesposite(80);
    a2.setDebit(50);
    
     System.out.println("a1 B---->  "  +a1.getbalance());
    System.out.println("a2 B---->  "   +a2.getbalance());
}
}











}
    
}
