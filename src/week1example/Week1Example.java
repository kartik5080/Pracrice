/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1example;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Week1Example {

    /**
     * @param args the command line arguments
     * hello my name is kartik
     * nnnn
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // System.out.println("hello");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the word");
        String word = sc.next();
        char[] a= new char[word.length()];
        a = word.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
            
        }
        
    }
    
}
