/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

/**
 *
 * @author Praktikum
 */
 import java.util.Scanner;
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
		Scanner input = new Scanner(System.in);
		int num1=0,num2=1,sum;
		int count;
		
		
		
		System.out.println("Masukan angka: ");
		int N = input.nextInt();
		
		
		
		

		for (count = 1;count<= N; count++) { 
		sum=num1+num2; 
		num1=num2; 
		num2=sum; 
		System.out.print(" "+num1); 
		} 
		} 
		} 
    
    

