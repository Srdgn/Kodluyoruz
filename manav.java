import java.util.Scanner;

public class manav{
    public static void main(String[] args){
        double fiyat_armut =2.14 , fiyat_elma =3.67, fiyat_domates=1.11, fiyat_muz=0.95, fiyat_patlican=5 ;
        double armut, elma, domates, muz, patlican;
        Scanner input = new Scanner(System.in);
        System.out.print("armut(kg) :");
        armut = input.nextInt();
        System.out.print("elma(kg) :");
        elma = input.nextInt();
        System.out.print("domates(kg) :");
        domates = input.nextInt();
        System.out.print("muz(kg) :");
        muz = input.nextInt();
        System.out.print("patlican(kg) :");
        patlican = input.nextInt();

        
        
        System.out.println("Fiyat = " + (fiyat_armut*armut + fiyat_elma*elma + fiyat_domates*domates + fiyat_muz*muz + fiyat_patlican*patlican));

    }
}
