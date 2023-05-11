import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, tarih;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
        }
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }
        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        if (tarih < 0 || tarih > 100) {
            tarih = 0;
        }

        double ortalama = (mat + turkce + fizik + kimya + tarih) / 5;
        if (ortalama >= 55){
            System.out.println("Sınıfı geçtiniz.");
        }
        else{
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız: " + ortalama);
    }
}

