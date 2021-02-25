
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lipan
 */
public class A00panli200 {
    //Main method
    public static void main(String[] args){
        //Display and prompt users enter a number
        System.out.println("Enter a number between a and 10000");
        
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        //Get a number from input
        int enterAmount = input.nextInt();
        
        //Initial two ATMs
        ATM atm1 = new ATM(0,false);
        ATM atm2 = new ATM(enterAmount,true);
        
        //Prompt user enter an operator name
        System.out.println("Enter a name for the Operator");
        //Initial a object under Operator class 
        Operator operator = new Operator();
        //Take input name 
        String operatorName = input.next();
        operator.setName(operatorName);   
        
        System.out.println("Processing ATM 1");
        //Display results on ATM1
        operator.topUpATM(atm1);
        System.out.println("Processing ATM 2");
        //Display results on ATM2
        operator.topUpATM(atm2);
           
        //Prompt user enter a customer name
        System.out.println("Enter a name for the Customer");
        //Initial a object under Customer class 
        Customer customer = new Customer();
        //Take input name 
        String customerName = input.next();
        //Take input name as customer name
        customer.setName(customerName);   
        //Prompt user enter withdraw amount 
        System.out.println("Enter an amount to withdraw");
        int drawAmount = input.nextInt();
        //Display results on ATM2
        customer.withdrawCash(atm2,drawAmount);    
        
    }
    
}
