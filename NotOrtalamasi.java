import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,turk,fizik,kimya,tarih,muzik;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.print("Turkce Notunuz :");
        turk = input.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = input.nextInt();

        System.out.print("Muzik Notunuz :");
        muzik = input.nextInt();

        double ortalama = (mat + turk + fizik + kimya + tarih + muzik) / 6.0;
        
        System.out.println("Ortalama: " + ortalama);
        
        if (ortalama >= 60 ) System.out.println("Sinifi Gecti");
        else System.out.println("Sinifta Kaldi");

        
    }
}
