/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorbmi;

import javax.swing.JOptionPane;

/**
 *
 * @author MERC-LAB-01
 */
public class Calculatorbmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"BMI Calculator");
        
        String response;// to go back to the begining of calculation we are using a do loop
        //a string variable named response is declared
       do{
           JOptionPane.showConfirmDialog(null, "Would you like to enter your details");
        
       //BMI calculator is coded in side the do loop
          String ht;
      
        String wt;
        
      ht =  JOptionPane.showInputDialog(null, "Please enter Height in meters ");
        System.out.println("The height you entered is "+ht+"m");
        JOptionPane.showMessageDialog(null, "The Height you entered is "+ht+"m");
        
       
      wt= JOptionPane.showInputDialog(null,"Please enter Weight in Kg ");
        System.out.println("The weight you entered is "+wt+"kg");
        JOptionPane.showMessageDialog(null,"The weight you entered is "+ wt+"Kg");
      
      float height;
      float weight;
      float x;
       
       height=Float.parseFloat(ht);
       weight=Float.parseFloat(wt);
//how to convert string to float
       x=height*height;
       float y= weight/x;
        System.out.println("your BMI is "+y);
        JOptionPane.showMessageDialog(null,"your BMI is(Kg/m2) "+ y);
        //once one BMI calculation is done we create another box to prompt for a new one
        //variable response is assigned a Y or N
        
        if(y>35){
        JOptionPane.showMessageDialog(null, "Obese III");
        }
        else if(y>30){
        JOptionPane.showMessageDialog(null, "Obese II");
        }
        else if(y>25){
        JOptionPane.showMessageDialog(null, "Obese ");
        }
        else if(y>18.5){
        JOptionPane.showMessageDialog(null, "Normal");
        }
                
        
   response=JOptionPane.showInputDialog(null,"Would you like to calculate a new BMI Y or N" );
            } 
while(response.equals("Y"));
      
   
    }
}
