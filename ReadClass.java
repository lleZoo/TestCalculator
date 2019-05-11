/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatortest;

import java.util.Scanner;
/**
 *
 * @author 322
 */
public class ReadClass {
    
    public double readNextDouble() {
        
        Scanner sc = new Scanner(System.in);
        double i = 0;
        if(sc.hasNextDouble()) {
            i = sc.nextDouble();
        }
        else{
            System.out.println("Вы ввели не целое число");
        }
        return i;
    }
    
    
}
