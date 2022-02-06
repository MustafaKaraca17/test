/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teksayilar33;

/**
 *
 * @author musta
 */
import java.util.Scanner;
public class Teksayilar33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int sayi1;
         int sayi2;
         Scanner scanner = new Scanner(System.in);
         System.out.println("lütfen kücük sayiyi giriniz : ");
         sayi1 = scanner.nextInt();
         System.out.println("Lütfen büyük sayisi giriniz : ");
         sayi2 = scanner.nextInt();
         {
        int toplam=0;
        for(int i=sayi1+1;i<sayi2;i++){//verilen sayilar arasinda i degerini bir bir arttir
        if(i%2!=0){//if kosulu tek sayi olup olmadigini kontrol et
            System.out.print(i+" ");//buldugun sayilari ekrana satie atlamadan yaz
        toplam=toplam+i;//if kosuluna uygun her i degerini üstüne koyarak topla
        }
                }
        System.out.print("\n");
        System.out.println("Toplam = "+toplam);
    }
                 
    }
    
}
