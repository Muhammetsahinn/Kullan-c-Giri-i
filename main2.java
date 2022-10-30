import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {

        int password,yeni,olustur;
        String username;

        Scanner gir = new  Scanner(System.in);

        System.out.print("kullanici adini giriniz:");

        username=gir.nextLine();

        System.out.print("sifrenizi giriniz:");

        password=gir.nextInt();

        if(password==123456){
            System.out.println("giris yapildi");
        }
        else{
            System.out.println("sifreniz yanlis yenilemek icin 1'e basiniz");
            yeni=gir.nextInt();
            if(yeni==1){
                System.out.println("yeni sifrenizi giriniz");
                olustur= gir.nextInt();
                if(olustur==123456){
                    System.out.println("sifreniz onceki sifre ile ayni olamaz tekrar deneyiniz");
                }
                else{
                    System.out.println("sifreniz basariyla olusturuldu");
                }
            }
            else if(yeni!=1){
                System.out.println("cikis yapildi tekrar giris yapiniz");
            }
        }


















    }
}
