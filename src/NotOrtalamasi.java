import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Sınav Puanı Giriniz: ");
        int mat = input.nextInt();
        System.out.print("Fizik Sınav Puanı Giriniz: ");
        int fizik = input.nextInt();
        System.out.print("Kimya Sınav Puanı Giriniz: ");
        int kimya = input.nextInt();
        System.out.print("Turkce Sınav Puanı Giriniz: ");
        int turkce = input.nextInt();
        System.out.print("Tarih Sınav Puanı Giriniz: ");
        int tarih = input.nextInt();
        System.out.print("Muzik Sınav Puanı Giriniz: ");
        int muzik = input.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız: " + ortalama);
        String durum = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

    }
}
