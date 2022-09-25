/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_21_Recursividad {
    public static void main(String[]args){
        System.out.println("MAIN " + A());
        
    }
    
    public static String A(){
        return "A " + B();        
    }
    
    public static String B(){
        return "B " + C();
    }
    
    public static String C(){
        return "C ";
    }
    
}
