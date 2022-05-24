import java.util.Scanner;

class HesapMakinesi {
    public static void main(String[] args) {
        
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayi: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayi: ");
        n2 = input.nextInt();
        System.out.print("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme\n");
        select = input.nextInt();
        
        switch(select){
            case 1:
                System.out.print(n1+n2);
                break;
            case 2:
                System.out.print(n1-n2);
                break;
            case 3:
                System.out.print(n1*n2);
                break;
            case 4:
                System.out.print(n1/n2);
                break;
        }
            
    }
}
