
package doaaibucell;
import java.util.Scanner;
public class doaibucell {
    public static void main(String[] args) {
          for (String i = "Y"; i.equals("Y")||i.equals("y"); ){
             System.out.println("=====================================================");
             System.out.println("    WELCOME DOA IBU CELL  ");
             System.out.println("1. PULSA :  ");
             System.out.println("2. PAKETDATA :  ");
             System.out.println("3. E-WALET : ");
             System.out.println("=====================================================");
             Scanner in = new Scanner(System.in);
             System.out.print("Masukkan pilihan : ");
             int pilihan = in.nextInt();
             System.out.println ("                                                    ") ;
             //PULSA
            if (pilihan==1 ) {
                char nilai;
                System.out.println ("SEDIA PULSA") ;
                System.out.println("A. INDOSAT :  ");
                System.out.println("B. TELKOMSEL:  ");
                System.out.println("C. XL : ");
                System.out.println("D. SMARTFREN : ");
                System.out.println("E. TRI : ");
                System.out.println("=====================================================");
               nilai=in.next().charAt(0);
               
               if(nilai=='A'){
                 System.out.println("INDOSAT");
                    System.out.println("PILIHAN NOMINAL");
                    System.out.println("a.6000");
                    System.out.println("b.11000");
                    System.out.println("c.22000");
                    System.out.println("MASUKKAN PILIHANMU:");
                      System.out.println("                                    ");
                     nilai=in.next().charAt(0);
                     if(nilai=='a'){
                         int total;
                         total=6000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='b'){
                         int total;
                         total=11000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='c'){
                         int total;
                         total=22000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total);
                     }
                    
                     
               }
               if(nilai=='B'){
                   System.out.println("TELKOMSEL");
                    System.out.println("PILIHAN NOMINAL");
                    System.out.println("a.21000");
                    System.out.println("b.51000");
                    System.out.println("c.100000");
                    System.out.println("MASUKKAN PILIHANMU:");
                      System.out.println("                                    ");
                     nilai=in.next().charAt(0);
                     if(nilai=='a'){
                         int total;
                         total=21000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='b'){
                         int total;
                         total=51000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='c'){
                         int total;
                         total=100000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total);
                     }
               }
               else if(nilai=='C'){
                   System.out.println("XL/AXIS");
                    System.out.println("PILIHAN NOMINAL");
                    System.out.println("a.5000");
                    System.out.println("b.10000");
                    System.out.println("c.25000");
                    System.out.println("MASUKKAN PILIHANMU:");
                      System.out.println("                                    ");
                     nilai=in.next().charAt(0);
                     if(nilai=='a'){
                         int total;
                         total=5000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='b'){
                         int total;
                         total=10000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='c'){
                         int total;
                         total=25000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total);
                     }
            }
               else if(nilai=='D'){
                  System.out.println("SMARTFREN");
                    System.out.println("PILIHAN NOMINAL");
                    System.out.println("a.50000");
                    System.out.println("b.100000");
                    System.out.println("MASUKKAN PILIHANMU:");
                      System.out.println("                                    ");
                     nilai=in.next().charAt(0);
                     if(nilai=='a'){
                         int total;
                         total=50000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='b'){
                         int total;
                         total=100000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     
            }
               else if(nilai=='E'){
                  System.out.println("TRI");
                    System.out.println("PILIHAN NOMINAL");
                    System.out.println("a.1000");
                    System.out.println("b.5000");
                    System.out.println("c.10000");
                    System.out.println("MASUKKAN PILIHANMU:");
                      System.out.println("                                    ");
                     nilai=in.next().charAt(0);
                     if(nilai=='a'){
                         int total;
                         total=1000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='b'){
                         int total;
                         total=5000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='c'){
                         int total;
                         total=10000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total);
                     }
            }
               
           
            }
            
            //PAKETDATA
            else if(pilihan==2) {
                char nilai;
                System.out.println ("SEDIA PAKET DATA") ;
                System.out.println("A 1 GB :  ");
                System.out.println("B 2GB  :  ");
                System.out.println("C 3GB : ");
                System.out.println("D 4GB : ");
                System.out.println("E 6GB : ");
                System.out.println("F 8GB : ");
                System.out.println("G UNLIMITED : ");
                System.out.println("=====================================================");
             nilai=in.next().charAt(0);
             
             if (nilai=='A') {
                 int total;
                  System.out.println("1GB");
                  total=10000;
                  System.out.println("ANDA HARUS MEMBAYAR "  + total);
             }
             if (nilai=='B') {
                 int total;
                 System.out.println("2GB");
                  total=20000;
                  System.out.println("ANDA HARUS MEMBAYAR "+total);
            }
             else if (nilai=='C'){
                int total;
                 System.out.println("3GB");
                  total=30000;
                  System.out.println("ANDA HARUS MEMBAYAR "+total); 
             }
            else if (nilai=='D') {
                   int total;
                 System.out.println("4GB");
                  total=40000;
                  System.out.println("ANDA HARUS MEMBAYAR "+total); 
            }
            else if (nilai=='E') {
                  int total;
                 System.out.println("6GB");
                  total=50000;
                  System.out.println("ANDA HARUS MEMBAYAR "+total); 
            }
            else if (nilai=='F') {
                   int total;
                 System.out.println("8GB");
                  total=70000;
                  System.out.println("ANDA HARUS MEMBAYAR "+total); 
            }
            else if (nilai=='G') {
                   int total;
                 System.out.println("UNLIMITED 1 BULAN");
                  total=80000;
                  System.out.println("ANDA HARUS MEMBAYAR "+total); 
            }
            }
            
            //E-WALLET
            else if (pilihan==3) {
                char nilai;
                System.out.println ("SEDIA E-WALLET") ;
                System.out.println("A DANA :");
                System.out.println("B OVO:  ");
                System.out.println("C SHOPEEPAY : ");
                System.out.println("D GOPAY : ");
                System.out.println("=====================================================");
                nilai=in.next().charAt(0);
                
                
                if(nilai=='A'){
                    System.out.println("DANA");
                    System.out.println("PILIHAN NOMINAL");
                    System.out.println("a.20000");
                    System.out.println("b.50000");
                    System.out.println("c.100000");
                    System.out.println("MASUKKAN PILIHANMU:");
                    System.out.println("                                    ");
                     nilai=in.next().charAt(0);
                     if(nilai=='a'){
                         int total;
                         total=20000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='b'){
                         int total;
                         total=50000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='c'){
                         int total;
                         total=100000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                }
                 if(nilai=='B'){
                    System.out.println("OVO");
                     System.out.println("PILIHAN NOMINAL");
                    System.out.println("a.20000");
                    System.out.println("b.50000");
                    System.out.println("c.100000");
                    System.out.println("MASUKKAN PILIHANMU:");
                      System.out.println("                                    ");
                     nilai=in.next().charAt(0);
                     if(nilai=='a'){
                         int total;
                         total=20000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='b'){
                         int total;
                         total=50000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='c'){
                         int total;
                         total=100000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                }
                 if(nilai=='C'){
                    System.out.println("SHOOPEPAY");
                     System.out.println("PILIHAN NOMINAL");
                    System.out.println("a.20000");
                    System.out.println("b.50000");
                    System.out.println("c.100000");
                    System.out.println("MASUKKAN PILIHANMU:");
                      System.out.println("                                    ");
                     nilai=in.next().charAt(0);
                     if(nilai=='a'){
                         int total;
                         total=20000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='b'){
                         int total;
                         total=50000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='c'){
                         int total;
                         total=100000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                }
                  if(nilai=='D'){
                    System.out.println("GOPAY");
                     System.out.println("PILIHAN NOMINAL");
                    System.out.println("a.20000");
                    System.out.println("b.50000");
                    System.out.println("c.100000");
                    System.out.println("MASUKKAN PILIHANMU:");
                      System.out.println("                                    ");
                     nilai=in.next().charAt(0);
                     if(nilai=='a'){
                         int total;
                         total=20000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='b'){
                         int total;
                         total=50000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                     else if(nilai=='c'){
                         int total;
                         total=100000;
                          System.out.println("ANDA HARUS MEMBAYAR "+total); 
                     }
                }
                
                
            }
               
              
                       
                   
               
            
             
            else {
                 
                  if(pilihan>3){
                      System.out.println ("TIDAK ADA PILIHAN") ;
                  }
                  
            }
           System.out.print("Apakah Anda Ingin Mengulang Perhitungan Lagi? Y/T: ");
      i = in.next();
        
    }
   
       for (String j = "T"; j.equals("T")||j.equals("t"); ){
           String total = null;
           System.out.println("TOTALNYA ITUNG SENDIRI  AJA YA"); 
          System.exit(0);
          break;
      }
           
    }
    }
    

