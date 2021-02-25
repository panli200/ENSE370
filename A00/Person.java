/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lipan
 */
public class Person {
    String name ;//Declare the name of Person as a string variable
    
    /*Construct a Person object*/ 
    public Person(){
        name = "**";
    }
    
    /*Return the the name of Person*/
    String getName(){
        return name;
    }
    
    /*Output the name of Person*/
    void setName(String nameString){
        name =  nameString;
        System.out.println("The name is set to "+ name);
    }
}
