/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuerdos;
import javax.swing.JOptionPane;
public class Recuerdos {
    public static void main(String[] args) {
   
      double precio, desc,impago,total;
      int cantidad,lapi;
      cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad"));
      precio= Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio"));
     
     
      impago=precio* cantidad;
      if(cantidad >= 10){
          desc=impago*0.15;
      }else{
          desc=impago*0.11;
      }
      total=impago-desc;
      if(total >= 200){
          lapi=2*cantidad;
      }else{
          lapi=0;
      }
        System.out.println("cantidad : "+ cantidad);
        System.out.println("precio : "+ precio);
         System.out.println("pago : "+ impago);
        System.out.println("descuento : "+desc);
        System.out.println("total de pago : "+total);
        System.out.println(" regalos : " + lapi);
      
    }
    
}
