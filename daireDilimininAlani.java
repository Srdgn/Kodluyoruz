import java.util.Scanner;

public class daireDilimininAlani {
    public static void main(String[] args){
        int r, alpha;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("r :");
        r = input.nextInt();
        System.out.print("Aci :");
        alpha = input.nextInt();

        
        
        System.out.println("Alan = " + pi*r*r*alpha/360);

    }
}
