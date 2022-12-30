/**
 *  MEHMET TURAN 02210224055
 *  DOĞAÇ GÜLAÇAN 02210224057
 */
package arackiralama;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Mehmet turan
 */
public class Dosyaislemleri {
   File fkayit=new File("c:\\Proje\\AracKiralama\\KullaniciKayit");
   File fAraba=new File("c:\\Proje\\AracKiralama\\ArabaKayit");
   File fmusteri=new File("c:\\Proje\\AracKiralama\\Musteri");
   File faracsahibi=new File("c:\\Proje\\AracKiralama\\Aracsahibi");
   File fiade=new File("c:\\Proje\\AracKiralama\\Araciade");

   int lnkayit;
   int lnaraba;
   int lnmusteri;
   int lniade;
   int lnaracsahibi;
   void dosyaOlustur(){
       if(!fmusteri.exists()){
           fmusteri.mkdirs();
       }
        if(!fkayit.exists()){
           fkayit.mkdirs();
       } 
         if(!fAraba.exists()){
           fAraba.mkdirs();
       }
           if(!fiade.exists()){
           fiade.mkdirs();
       } 
            if(!faracsahibi.exists()){
           faracsahibi.mkdirs();
       } 
    }
   
   void kayitdosyaOku() {
            try {
                
                FileReader fr=new FileReader(fkayit+"\\kayit.txt");
                
          
            FileWriter fw = new FileWriter(fkayit+"\\kayit.txt");
            RandomAccessFile raf = new RandomAccessFile(fkayit+"\\kayit.txt", "rw");
            raf.writeBytes("K. Adi:"+"admin"+"\r\n");
            raf.writeBytes("Sifre:"+"12345678"+"\r\n");
            raf.writeBytes("Ad Soyad:"+" "+"\r\n");
            raf.writeBytes("Cinsiyet:"+" "+"\r\n");
            raf.writeBytes("D.Tarihi:"+" "+"\r\n");
            raf.writeBytes("Adres:"+" ");
            
  
        } catch (FileNotFoundException ex) {
           Logger.getLogger(Dosyaislemleri.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Dosyaislemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
   void ArabakayitdosyaOku() {
        try {
            FileReader fr=new FileReader(fAraba+"\\Arabakayit.txt");
        
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(fAraba+"\\Arabakayit.txt");
                
            } catch (IOException ex1) {
                Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
   void musteridosyaOku() {
        try {
            FileReader fr=new FileReader(fmusteri+"\\Musteri.txt");
        
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(fmusteri+"\\Musteri.txt");
                
            } catch (IOException ex1) {
                Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
   void iadedosyaOku() {
        try {
            FileReader fr=new FileReader(fiade+"\\iade.txt");
        
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(fiade+"\\iade.txt");
                
            } catch (IOException ex1) {
                Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
   void aracsahibidosyaOku() {
        try {
            FileReader fr=new FileReader(faracsahibi+"\\aracsahibi.txt");
        
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(fiade+"\\aracsahibi.txt");
                
            } catch (IOException ex1) {
                Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
   
   void kayitcountlines(){
        try {
            lnkayit=0;
            RandomAccessFile raf=new RandomAccessFile(fkayit+"\\kayit.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                lnkayit++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   void arabacountlines(){
        try {
            lnaraba=0;
            RandomAccessFile raf=new RandomAccessFile(fAraba+"\\Arabakayit.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                lnaraba++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   void mustericountlines(){
        try {
            lnmusteri=0;
            RandomAccessFile raf=new RandomAccessFile(fmusteri+"\\Musteri.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                lnmusteri++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   void iadecountlines(){
        try {
            lniade=0;
            RandomAccessFile raf=new RandomAccessFile(fiade+"\\iade.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                lniade++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   void aracsahibicountlines(){
        try {
            lnaracsahibi=0;
            RandomAccessFile raf=new RandomAccessFile(faracsahibi+"\\aracsahibi.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                lnaracsahibi++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   void veriKontrol(String usr,String pswd){
        try {
            RandomAccessFile raf = new RandomAccessFile(fkayit+"\\kayit.txt", "rw");
            for(int i=0;i<lnkayit;i+=7){
                String forUser = raf.readLine().substring(7);
                String forPswd = raf.readLine().substring(6);
                if(usr.equals(forUser) && pswd.equals(forPswd)){
                    AnaMenu anaMenu=new AnaMenu();
                    KullaniciGiris.frame.dispose();
                    break;
                }
                else if(i==(lnkayit-6)){
                    JOptionPane.showMessageDialog(null, "incorrect username/password");
                    break;
                }
                for(int k=1;k<=5;k++){
                    raf.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
   void kayitveriEkle(String Kullaniciad,String sfre,String ad,String Cinsiyet,String dtarih,String adrees, int sonuc){
        try {
            RandomAccessFile raf = new RandomAccessFile(fkayit+"\\kayit.txt", "rw");
            for(int i=0;i<lnkayit;i+=7){
                String forUser = raf.readLine().substring(7);
                if(Kullaniciad.equals(forUser)){
                    JOptionPane.showMessageDialog(null, "Kullanici Adi Zaten Kayitli");
                    sonuc=1;
                    break;
                }
                for(int k=1;k<=6;k++){
                    raf.readLine();
                }
            }
            for(int i=0;i<lnkayit;i++){
            raf.readLine();
        }
            if(sonuc!=1){
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");                        
            raf.writeBytes("K. Adi:"+Kullaniciad+"\r\n");
            raf.writeBytes("Sifre:"+sfre+"\r\n");
            raf.writeBytes("Ad Soyad:"+ad+"\r\n");
            raf.writeBytes("Cinsiyet:"+Cinsiyet+"\r\n");
            raf.writeBytes("D.Tarihi:"+dtarih+"\r\n");
            raf.writeBytes("Adres:"+adrees);
            JOptionPane.showMessageDialog(null, "Kayit Basarili");
            KullaniciGiris k=new KullaniciGiris();
                    KullaniciKayit.frame.dispose();
        } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
   void ArabaveriEkle(String Arabaid,String Marka,String Model,String Mevcutmu,int sonuc){
        try {
            RandomAccessFile raf = new RandomAccessFile(fAraba+"\\Arabakayit.txt", "rw");
            for(int i=0;i<lnaraba;i+=5){
                String forUser = raf.readLine().substring(9);
                if(Arabaid.equals(forUser)){
                    JOptionPane.showMessageDialog(null, "Araba Id Zaten Kayitli");
                    sonuc=1;
                    break;
                }
                for(int k=1;k<=4;k++){
                    raf.readLine();
                }
            }
            for(int i=0;i<lnaraba;i++){
            raf.readLine();
        }
            if(sonuc!=1){
            if(lnaraba>0){
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");}                         
            raf.writeBytes("Araba id:"+Arabaid+"\r\n");
            raf.writeBytes("Marka:"+Marka+"\r\n");
            raf.writeBytes("Model:"+Model+"\r\n");
            raf.writeBytes("Mevcutmu:"+Mevcutmu);
           Object[] row=new Object[4];
                row[0]=ArabaKayit.tlabel1.getText();
                row[1]=ArabaKayit.tlabel2.getText();
                row[2]=ArabaKayit.tlabel3.getText();
                row[3]=ArabaKayit.tlabel4.getSelectedItem();
                ArabaKayit.model.addRow(row);
        } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
   void musteriveriEkle(String Musteriid,String Adsoyad,String adres,String telefon,int sonuc){
        try {
            RandomAccessFile raf = new RandomAccessFile(fmusteri+"\\Musteri.txt", "rw");
            for(int i=0;i<lnmusteri;i+=5){
                String forUser = raf.readLine().substring(6);
                if(Musteriid.equals(forUser)){
                    JOptionPane.showMessageDialog(null, "Musteri Id Zaten Kayitli");
                    sonuc=1;
                    break;
                }
                for(int k=1;k<=4;k++){
                    raf.readLine();
                }
            }
            for(int i=0;i<lnmusteri;i++){
            raf.readLine();
        }
            if(sonuc!=1){
            if(lnmusteri>0){
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");}                         
            raf.writeBytes("M. Id:"+Musteriid+"\r\n");
            raf.writeBytes("Ad Soyad:"+Adsoyad+"\r\n");
            raf.writeBytes("Adres:"+adres+"\r\n");
            raf.writeBytes("Telefon:"+telefon);
           Object[] row=new Object[4];
                row[0]=Musteri.tMusteriId.getText();
                row[1]=Musteri.tAdSoyad.getText();
                row[2]=Musteri.tAdres.getText();
                row[3]=Musteri.tTelefon.getText();
                Musteri.model.addRow(row);
        } 
        } catch (FileNotFoundException ex) {
           Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Musteri.class.getName()).log(Level.SEVERE, null, ex);
       }
  } 
   void iadeveriEkle(String MusteriId,String ArabaId,String DonusTarihi,String GecikenGun,String ParaCezasi){
       try {
           RandomAccessFile raf = new RandomAccessFile(fiade+"\\iade.txt", "rw");
           for(int i=0;i<lniade;i++){
               raf.readLine();
           }
           if(lniade>0){
               raf.writeBytes("\r\n");
               raf.writeBytes("\r\n");
           }
           raf.writeBytes("M.id:"+MusteriId+"\r\n");
           raf.writeBytes("Arabaid:"+ArabaId+"\r\n");
           raf.writeBytes("D.tarihi:"+DonusTarihi+"\r\n");
           raf.writeBytes("G.gun:"+GecikenGun+"\r\n");
           raf.writeBytes("Ceza:"+ParaCezasi);
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Dosyaislemleri.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Dosyaislemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   void aracsahibiveriEkle(String ArabaId,String MusteriId,String ad,String ucret,String tarih,String DonusTarihi, int sonuc){
       try {
           RandomAccessFile raf = new RandomAccessFile(faracsahibi+"\\aracsahibi.txt", "rw");
           for(int i=0;i<lnaracsahibi;i++){
               raf.readLine();
           }
           if(lnaracsahibi>0){
               raf.writeBytes("\r\n");
               raf.writeBytes("\r\n");
           }
           raf.writeBytes("Araba id:"+ArabaId+"\r\n");
           raf.writeBytes("M.id:"+MusteriId+"\r\n");
           raf.writeBytes("Ad Soyad:"+ad+"\r\n");
           raf.writeBytes("Ucret:"+ucret+"\r\n");
           raf.writeBytes("Tarih:"+tarih+"\r\n");
           raf.writeBytes("Dönus T.:"+DonusTarihi);
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Dosyaislemleri.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Dosyaislemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   void musteriveriKaydet(int sonuc){
        try {
            RandomAccessFile raf = new RandomAccessFile(fmusteri+"\\Musteri.txt", "rw");
            for(int i=0;i<lnmusteri;i+=5){
                String Musteriid = raf.readLine().substring(6);
                String Adsoyad=raf.readLine().substring(9);
                String adres=raf.readLine().substring(6);
                String telefon=raf.readLine().substring(8);
                
                Object[] row=new Object[4];
                row[0]=Musteriid;
                row[1]=Adsoyad;
                row[2]=adres;
                row[3]=telefon;
                Musteri.model.addRow(row);
                raf.readLine();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
   void ArabaveriKaydet(int sonuc){
       try {
            RandomAccessFile raf = new RandomAccessFile(fAraba+"\\Arabakayit.txt", "rw");
            for(int i=0;i<lnaraba;i+=5){
                String ArabaidString = raf.readLine().substring(9);
                String MarkaString=raf.readLine().substring(6);
                String ModelString=raf.readLine().substring(6);
                String MevcutmuString=raf.readLine().substring(9);
               
                Object[] row=new Object[4];
                row[0]=ArabaidString;
                row[1]=MarkaString;
                row[2]=ModelString;
                row[3]=MevcutmuString;
                ArabaKayit.model.addRow(row);
                 raf.readLine();
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    } 
   void ArabalarveriKaydet(int sonuc){
        try {
            RandomAccessFile raf = new RandomAccessFile(fAraba+"\\Arabakayit.txt", "rw");
            for(int i=0;i<lnaraba;i+=5){
                String ArabaidString = raf.readLine().substring(9);
                String MarkaString=raf.readLine().substring(6);
                String ModelString=raf.readLine().substring(6);
                String MevcutmuString=raf.readLine().substring(9);
               
                Object[] row=new Object[4];
                row[0]=ArabaidString;
                row[1]=MarkaString;
                row[2]=ModelString;
                row[3]=MevcutmuString;
                Arabalar.model.addRow(row);
                 raf.readLine();
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    } 
   void kiralamaveriKaydet(){
        try {
           RandomAccessFile raf=new RandomAccessFile(fAraba+"\\Arabakayit.txt","rw");
            for(int i=0;i<lnaraba;i+=5){
                 String ArabaidString = raf.readLine().substring(9);
                 String MarkaString=raf.readLine().substring(6);
                 String ModelString=raf.readLine().substring(6);
                 String MevcutmuString=raf.readLine().substring(9);
                 AracKiralama.combobox.addItem(ArabaidString);

                    raf.readLine();

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   void iadeveriKaydet(){
       try {
           RandomAccessFile raf=new RandomAccessFile(fiade+"\\iade.txt","rw");
            for(int i=0;i<lniade;i+=6){
                 String MusteriidString = raf.readLine().substring(5);
                 String arabaidString=raf.readLine().substring(8);
                 String DonustarihiString=raf.readLine().substring(9);
                 String GecikenGunString=raf.readLine().substring(6);
                 String ParaCezasiString=raf.readLine().substring(5);
                 
                Object[] row=new Object[5];
                row[0]=MusteriidString;
                row[1]=arabaidString;
                row[2]=DonustarihiString;
                row[3]=GecikenGunString;
                row[4]=ParaCezasiString;
               adminarabageri.model.addRow(row);
                    raf.readLine();

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   void aracsahibiKaydet(){
       try {
           RandomAccessFile raf=new RandomAccessFile(faracsahibi+"\\aracsahibi.txt","rw");
            for(int i=0;i<lnaracsahibi;i+=7){
                 String arabaidString=raf.readLine().substring(9);
                 String MusteriidString = raf.readLine().substring(5);
                 String adString = raf.readLine().substring(9);
                 String UcretString=raf.readLine().substring(6);
                 String TarihString=raf.readLine().substring(6);
                 String DonustarihiString=raf.readLine().substring(9);
                 
                Object[] row=new Object[6];
                row[0]=arabaidString;
                row[1]=MusteriidString;
                row[2]=adString;
                row[3]=UcretString;
                row[4]=TarihString;
                row[5]=DonustarihiString;
                Aracsahipleri.model.addRow(row);
                raf.readLine();

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
   void aracveriKontrol(){
       try {
           RandomAccessFile raf=new RandomAccessFile(faracsahibi+"\\aracsahibi.txt","rw");
            for(int i=0;i<lnaracsahibi;i+=7){
                 String arabaidString=raf.readLine().substring(9);
                  ArabaveriDuzenle(arabaidString);
                   for(int k=1;k<=6;k++){
                    raf.readLine();
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   void ArabaveriDuzenle(String Arabaid){
       try {
            RandomAccessFile raf = new RandomAccessFile(fAraba+"\\Arabakayit.txt", "rw");
            for(int i=0;i<lnaraba;i+=5){
                String ArabaidString = raf.readLine().substring(9);
                String MarkaString=raf.readLine().substring(6);
                String ModelString=raf.readLine().substring(6);
                String MevcutmuString=raf.readLine().substring(9);
               if(ArabaidString.equals(Arabaid)){
                   MevcutmuString="Hayir";
               }
                Object[] row=new Object[4];
                row[0]=ArabaidString;
                row[1]=MarkaString;
                row[2]=ModelString;
                row[3]=MevcutmuString;
                Arabalar.model.addRow(row);
               
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    } 
   void AaracveriKontrol(){
       try {
           RandomAccessFile raf=new RandomAccessFile(faracsahibi+"\\aracsahibi.txt","rw");
            for(int i=0;i<lnaracsahibi;i+=7){
                 String arabaidString=raf.readLine().substring(9);
                  aArabaveriDuzenle(arabaidString);
                   for(int k=1;k<=6;k++){
                    raf.readLine();
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   void aArabaveriDuzenle(String Arabaid){
       try {
            RandomAccessFile raf = new RandomAccessFile(fAraba+"\\Arabakayit.txt", "rw");
            for(int i=0;i<lnaraba;i+=5){
                String ArabaidString = raf.readLine().substring(9);
                String MarkaString=raf.readLine().substring(6);
                String ModelString=raf.readLine().substring(6);
                String MevcutmuString=raf.readLine().substring(9);
               if(ArabaidString.equals(Arabaid)){
                   MevcutmuString="Hayir";
               }
                Object[] row=new Object[4];
                row[0]=ArabaidString;
                row[1]=MarkaString;
                row[2]=ModelString;
                row[3]=MevcutmuString;
                ArabaKayit.model.addRow(row);
               
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    } 
   }  

