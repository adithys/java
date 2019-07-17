/* Adithya Krishnan Java Task 5-To express minutes in years and days
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
//Task 5-Express minutes in terms of years and days
import java.util.Scanner;
public class NewClass {
    public static void main(String args[]){
        int minutes,days,years,rem_mins;
        Scanner sc=new Scanner(System.in);
        System.out.println("Minutes: ");
        minutes=sc.nextInt();
        sc.close();
        days=minutes/1440;
        years=minutes/525600;
        rem_mins=days%525600;
        System.out.println(minutes+" minutes is "+years+" years and "+days+"days");
    }
}