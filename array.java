import java.util.Scanner;


public class NewClass {

    

 
    public void NewClass () {
        String[] bilgi = {"Çalýþan Kiþinin Ýsimi:",
                        "Çalýþma Süresi:",
                        "Alaný:",
                        "Rütbesi:",
                        "Maaþý:",
                        "Ýþe Giriþ Tarihi:"};
        
    
       String[] veri = {"Hasan",
                        "Günlük 14 Saat ",
                        "Back-end Developer",
                        "Senior",
                        "9500 TL",
                        "2016"};
       
      
      System.out.println(bilgi[0]+veri[0]+"\n"+bilgi[1]+veri[1]+"\n"+bilgi[2]+veri[2]+"\n"+bilgi[3]+veri[3]+"\n"+bilgi[4]+veri[4]+"\n"+bilgi[5]+veri[5]);
       
        
      }
    public void isci(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplam Ýþci Sayýsý 2");
        System.out.println("**********************");
        System.out.println("Ýþciler : "
                + "Hasan"+","+"Mehmet");
        System.out.println("***********************");
        System.out.println("Bu Ýþcilerin Bütün Bilgilerini Görmek Ýstiyorsanýz x yazmanýz yeterli olacaktýr.");
        String ayrýntý = scanner.nextLine();
        if (ayrýntý.equals("x")) {
          NewClass();
                  
        
          }
        else {
            System.out.println("Geçersiz deðer");
         }
       }
    public void panel() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***********************************");
        System.out.println("Toplam Sistemde Kayýtlý Ýþci 2");
        System.out.println("************************************");
        System.out.println("Ýþcileri Görmek Ýçin 1'e yazýnýz");
        System.out.println("*************************************");
        int isci = scanner.nextInt();
        if(isci==1) {
         isci();
          }
        else {
            System.out.println("Lütfen Geçerli Bir Deðer Giriniz");
         }
    
      }
   
    public static void main(String[] args) {
            NewClass panel = new NewClass();
        
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3;
        
        String kullan = "Hasan";
        String parola = "123456";
        
        System.out.println("*****************************");
        System.out.println("Kullanýcý Giriþine Hoþgeldiniz...");
        System.out.println("*****************************");
        
        
         System.out.print("Lütfen Kullanýcý Adýnýzý Giriniz : ");
         String kad = scanner.nextLine();
         System.out.print("Lütfen Þifrenizi Giriniz : ");
         String sfr = scanner.nextLine();
            
           if (kad.equals(kullan)&&sfr.equals(parola)){  
            panel.isci();
             } 
           else if (kad.equals(kullan)&&!sfr.equals(parola)){ // eðer þifre yanlýþ ise alttaki deðer yazýlacaktýr
             System.out.println("Þifreniz Yanlýþ");
             giris_hakki -=1;
             System.out.println("Kalan Deneme Hakkýnýz "+giris_hakki);
                }
           else if (!kad.equals(kullan)&&sfr.equals(parola)) {
             System.out.println("Kullanýcý Adýnýz Yanlýþ");
               giris_hakki -=1;
             System.out.println("Kalan Deneme Hakkýnýz "+giris_hakki);
                 }
           else {
             System.out.println("Kullanýcý Adýnýz ve Þifreniz Yanlýþ.");
              giris_hakki -=1;
             System.out.println("Kalan Deneme Hakkýnýz "+giris_hakki);
              }
           if (giris_hakki==0) {
             System.out.println("Deneme Hakkýnýz Bitmiþtir daha sonra tekrar deneyin");
             
              }
           }
            
            

}