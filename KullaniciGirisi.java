import java.util.Scanner;

class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password, yenile, newPassword;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Username: ");
        username = input.nextLine();
        
        System.out.print("Password: ");
        password = input.nextLine();
        
        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giris Yaptiniz!");
        }else {
            System.out.println("Giris Yapilamadi!");
            System.out.print("Sifre yenile? (y/n): ");
            yenile = input.nextLine();
            if(yenile.equals("y")){
                System.out.print("Yeni sifre: ");
                newPassword = input.nextLine();
                if(newPassword.equals(password) || newPassword.equals("java123")) 
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                else
                    System.out.println("Sifre olusturuldu.");
            }
        }
            
    }
}
