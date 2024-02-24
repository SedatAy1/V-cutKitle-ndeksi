import java.util.Scanner;

public class VücutKitleİndeksiHesaplayanProgram {

    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (m cinsinden) Giriniz: ");
        boy=scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo=scanner.nextDouble();
        indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+indeks);


    }
}
