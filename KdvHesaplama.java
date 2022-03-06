import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir tutar Giriniz:");
        tutar = input.nextDouble();

        double kdvOranı = (tutar <= 1000) ? 0.18 : 0.08;
        double a = tutar * kdvOranı;
        System.out.println("Girilen Tutarın Kdv'si:" + a);
        System.out.println("Kdv Oranı:" + kdvOranı);
        double b = a + tutar;
        System.out.println("Kdv'li tutar:" + b);

    }
}
