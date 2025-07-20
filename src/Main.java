import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    // Sabit kilogram fiyatları
    double armutFiyat = 2.14;
    double elmaFiyat = 3.67;
    double domatesFiyat = 1.11;
    double muzFiyat = 0.95;
    double patlicanFiyat = 5.00;

    // Kullanıcıdan kilogram bilgilerini al
        System.out.print("Armut Kaç Kilo? : ");
    double armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
    double elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
    double domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
    double muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
    double patlicanKg = input.nextDouble();

    // Toplam tutarı hesapla
    double toplamTutar = (armutKg * armutFiyat) +
            (elmaKg * elmaFiyat) +
            (domatesKg * domatesFiyat) +
            (muzKg * muzFiyat) +
            (patlicanKg * patlicanFiyat);

    // Sonucu yazdır
        System.out.printf("Toplam Tutar : %.2f TL%n", toplamTutar);
        }
    }
