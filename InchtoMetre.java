/* Adithya Krishnan Java task-4 to convert the measurement from inch to metre using 1 m=39.37 inch
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author User
 */
//Adithya Krishnan
//Task 5-Convert inch to metre
import java.util.Scanner;
public class InchtoMetre {
    public static void main(String args[]){
        double in,met;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter measurement in inch: ");
        in=sc.nextDouble();
        met=in*0.0254;
        System.out.println("Equivalent measurement in metres: "+met);
    }
}
