/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lipan
 */
public class Customer extends Person {
    public void withdrawCash(ATM atm, int amount){
        //Output the current inService status
        System.out.println("current inService is " + atm.getServiceStatus());
        
        /*If the ATM out of service turn it back to service*/
        if(!atm.inService){
            System.out.println("ATM is not in service");
            atm.changeServiceStatus(atm.inService);
        }
        
        /*If the cash in ATM is less than withdraw amount, output insufficient;Otherwise process the withdraw*/
        if(atm.cash< amount){
            System.out.println("ATM has insufficient cash");
        }
        else{
            atm.reader.readCard();
            atm.display.displayPINverification();
            atm.dispenser.dispenseCash(amount);
            atm.printer.printReceipt();
            System.out.println(amount + " successfully withdraw from ATM");
        }               
    }   
}
