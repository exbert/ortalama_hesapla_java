package intro;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunuz: ");
        mat = s.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = s.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = s.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = s.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = s.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = s.nextInt();

        float ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0f;
        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = (ortalama >= 60) ? "Sınıfı Geçti." : "Sınıfta Kaldı.";
        System.out.println(sonuc);
    }
}
