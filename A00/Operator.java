/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lipan
 */
public class Operator extends Person{
    public void topUpATM(ATM atm){
        //Output the current inService status
        System.out.println("current inService is " + atm.getServiceStatus());
        //Output the current cash in ATM
        System.out.println("current cash is " + atm.queryCash());
        
        //If the ATM in service turn it into out of service
        if(atm.inService){
            atm.changeServiceStatus(atm.inService);
        }
        
        /*If less than 5000 in the ATM, adding 5000*/
        if (atm.queryCash()<5000)
            atm.inscreaseCash(5000); 
        //Output the current cash 
        System.out.println("ATM now has "+ atm.queryCash() + " dollars");
        
        /*Swith the ATM back to service*/
        if(!atm.inService){
            atm.changeServiceStatus(atm.inService);
        }   
    }    
}
