import java.util.Scanner;


public class NewClass {

    

 
    public void NewClass () {
        String[] bilgi = {"�al��an Ki�inin �simi:",
                        "�al��ma S�resi:",
                        "Alan�:",
                        "R�tbesi:",
                        "Maa��:",
                        "��e Giri� Tarihi:"};
        
    
       String[] veri = {"Hasan",
                        "G�nl�k 14 Saat ",
                        "Back-end Developer",
                        "Senior",
                        "9500 TL",
                        "2016"};
       
      
      System.out.println(bilgi[0]+veri[0]+"\n"+bilgi[1]+veri[1]+"\n"+bilgi[2]+veri[2]+"\n"+bilgi[3]+veri[3]+"\n"+bilgi[4]+veri[4]+"\n"+bilgi[5]+veri[5]);
       
        
      }
    public void isci(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplam ��ci Say�s� 2");
        System.out.println("**********************");
        System.out.println("��ciler : "
                + "Hasan"+","+"Mehmet");
        System.out.println("***********************");
        System.out.println("Bu ��cilerin B�t�n Bilgilerini G�rmek �stiyorsan�z x yazman�z yeterli olacakt�r.");
        String ayr�nt� = scanner.nextLine();
        if (ayr�nt�.equals("x")) {
          NewClass();
                  
        
          }
        else {
            System.out.println("Ge�ersiz de�er");
         }
       }
    public void panel() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***********************************");
        System.out.println("Toplam Sistemde Kay�tl� ��ci 2");
        System.out.println("************************************");
        System.out.println("��cileri G�rmek ��in 1'e yaz�n�z");
        System.out.println("*************************************");
        int isci = scanner.nextInt();
        if(isci==1) {
         isci();
          }
        else {
            System.out.println("L�tfen Ge�erli Bir De�er Giriniz");
         }
    
      }
   
    public static void main(String[] args) {
            NewClass panel = new NewClass();
        
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3;
        
        String kullan = "Hasan";
        String parola = "123456";
        
        System.out.println("*****************************");
        System.out.println("Kullan�c� Giri�ine Ho�geldiniz...");
        System.out.println("*****************************");
        
        
         System.out.print("L�tfen Kullan�c� Ad�n�z� Giriniz : ");
         String kad = scanner.nextLine();
         System.out.print("L�tfen �ifrenizi Giriniz : ");
         String sfr = scanner.nextLine();
            
           if (kad.equals(kullan)&&sfr.equals(parola)){  
            panel.isci();
             } 
           else if (kad.equals(kullan)&&!sfr.equals(parola)){ // e�er �ifre yanl�� ise alttaki de�er yaz�lacakt�r
             System.out.println("�ifreniz Yanl��");
             giris_hakki -=1;
             System.out.println("Kalan Deneme Hakk�n�z "+giris_hakki);
                }
           else if (!kad.equals(kullan)&&sfr.equals(parola)) {
             System.out.println("Kullan�c� Ad�n�z Yanl��");
               giris_hakki -=1;
             System.out.println("Kalan Deneme Hakk�n�z "+giris_hakki);
                 }
           else {
             System.out.println("Kullan�c� Ad�n�z ve �ifreniz Yanl��.");
              giris_hakki -=1;
             System.out.println("Kalan Deneme Hakk�n�z "+giris_hakki);
              }
           if (giris_hakki==0) {
             System.out.println("Deneme Hakk�n�z Bitmi�tir daha sonra tekrar deneyin");
             
              }
           }
            
            

}