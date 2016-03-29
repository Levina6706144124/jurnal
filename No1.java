/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1e;
import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class No1e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] bilangan=new int[100];
        bilangan[0]=0;
        bilangan[1]=1;       
        int deret;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan angka : ");
        String data = input.nextLine();
        deret = Integer.parseInt(data);
       
        for(int i=0;i<deret;i++){
            System.out.print(bilangan[i]+" ");
            bilangan[i+2]=bilangan[i]+bilangan[i+1];
        }
    }
    
}
    
    

