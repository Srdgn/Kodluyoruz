import java.util.Scanner;

public class kdv {
    public static void main(String[] args){
        int fiyat;
        double kdvli, kdv;
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat :");
        fiyat = input.nextInt();

        if(fiyat > 1000) kdvli = fiyat * 1.08;
        else kdvli = fiyat * 1.18;
        if (fiyat > 1000) kdv = fiyat * 0.08;
        else kdv = fiyat * 0.18;

        System.out.println("KDV'siz Fiyat = " + fiyat );
        System.out.println("KDV'li Fiyat = " + kdvli );
        System.out.println("KDV tutari = " + kdv );
    }
}
