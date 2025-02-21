/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
    public enum TestEnum{
        PLUS(1),
        MINUS(2),
        TIMES(3),
        DIVIDE(4);
    private int numVal;
    TestEnum(int numVal) {
        this.numVal = numVal;
    }
    public int getNumVal() {
        return numVal;
    }} //I wanted this to be able to select the operation based off of a number from 1-4, however i ran out of time before i was able to inplement
    // the selection system based on user input, as i was having trouble with it.
 public double x,y;
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        String s= sc.next();
        switch (s.toUpperCase()) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
