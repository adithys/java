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

public class Ch2_Exercise2_7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Prompt user for number of minutes
    System.out.println("Enter the number of minutes:");
    int minutes = input.nextInt();

     // Number of minutes in a year
    int year = minutes / 525600;
    int day = minutes / 1440;
    int remainingMinutes = day % 525600;


    System.out.println(minutes + " minutes is " + year + " years and "  +  remainingMinutes + " days ");
    }

   }
