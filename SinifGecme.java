import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,turk,fizik,kimya,tarih,muzik;
        int n =0;
        double ortalama = 0;
        
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

        if(mat<=100 && mat>=0){
            n +=1;
            ortalama += mat;
        }
        if(turk<=100 && turk>=0){
            n +=1;
            ortalama += turk;
        }
        if(fizik<=100 && fizik>=0){
            n +=1;
            ortalama += fizik;
        }
        if(kimya<=100 && kimya>=0){
            n +=1;
            ortalama += kimya;
        }
        if(tarih<=100 && tarih>=0){
            n +=1;
            ortalama += tarih;
        }
         ortalama /= n;
        
        System.out.println("Ortalama: " + ortalama);
        
        if (ortalama >= 55 ) System.out.println("Sinifi Gecti");
        else System.out.println("Sinifta Kaldi");

        
    }
}
