/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int toplam =0;
        do{
            
            System.out.println("Bir sayı giriniz: ");
            sayi = scanner.nextInt();
            if(sayi%2==0 && sayi%4 ==0){
                toplam+= sayi;
            }
            
        }while(sayi%2 == 0);
        
        System.out.println("girilen değerlerden çift ve 4'ün katları olan sayıları toplamı: " + toplam);
    }
    
}
