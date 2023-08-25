package KDV;
import java.util.Scanner;
public class KdvHesap {
    public static void main(String[] args) {
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün fiyatını yazınız:");
        tutar = input.nextDouble();
        double kdv = tutar *18/100;
        System.out.println("Ürününüzün KDV`si: " + kdv + "TL");
        double kdvliTutar = tutar + tutar * 18 / 100;
        System.out.println("Ürününüzün KDV dahil tutarı:" + kdvliTutar + "TL");
    }







}
