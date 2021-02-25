/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lipan
 */
public class ATM {
        public int cash;//Declare the cash of ATM as an interger variable
        public boolean inService;//Declare inService to be a boolean variable
        
        /*Construct an ATM object*/ 
        public ATM(){
            cash = 0;
            inService = false;
        }
        
        /*Construct an ATM object*/ 
        public ATM(int x, boolean y){
            cash = x;
            inService = y;
        }
        
        /*Return the cash of the ATM*/
        public int queryCash(){
            return cash;
        }
        
        /*Increase the cash of the ATM*/
        public void inscreaseCash(int x){
            cash += x;
        }
        
        /*Decrease the cash of the ATM*/
        public void reduceCash(int x){
            cash -= x;
        }
        
        /*Return the inService of the ATM*/
        public boolean getServiceStatus(){
            return inService;
        }
        
        /*Inverse the inService status and output status*/
        public void changeServiceStatus(boolean y){
            inService = !y;
            System.out.println("inService is now " + inService);
        }
        
        /*Nested class CashDispenser*/
        class CashDispenser{
            public void dispenseCash(int x){
                reduceCash(x);
                System.out.println(x + " dollars has been dispensed.");
            }
        }
        
        /*Nested class ReceiptPrinter*/
        class ReceiptPrinter{
            public void printReceipt(){
                System.out.println("Receipt has been printed.");
            }
        }
        
        /*Nested class CardReader*/
        class CardReader{
            public void readCard(){
                System.out.println("Card has been read.");
            }
        }
        
        /*Nested class KeypadDisplay*/
        class KeypadDisplay{
            public void displayPINverification(){
                System.out.println("PIN has been verified.");
            }
        }
        
        CashDispenser dispenser = new CashDispenser();//Initial a object under CashDispenser class
        ReceiptPrinter printer = new ReceiptPrinter();//Initial a object under ReceiptPrinter class
        CardReader reader = new CardReader();//Initial a object under CardReader class
        KeypadDisplay display = new KeypadDisplay();//Initial a object under KeypadDisplay class
        

}
