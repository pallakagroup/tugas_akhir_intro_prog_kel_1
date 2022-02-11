import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class laundry_tugasakhir{
    
    public static void main(String[] args){
         Scanner ip = new Scanner(System.in);
         
         ///Inisiasi harga
         String customer, kasir, alamat, telp, pilihan;
         int jenis, berat, harga = 0, total, diskon, hasil, nopilihan;
         int j1 = 35000, j2 = 12000, j3 = 15000, j4 = 30000;

         ///end Inisiasi harga

        //Tampilan input data
        System.out.println("=========== LAUNDRY KASIR ===========");
        System.out.print("NAMA KASIR : ");
        kasir = ip.nextLine();
        System.out.print("NAMA CUSTOMER : ");
        customer = ip.nextLine();
        System.out.print("ALAMAT : ");
        alamat = ip.nextLine();
        System.out.print("NO. TELP : ");
        telp = ip.nextLine();
        System.out.println("JENIS CUCIAN ");
        System.out.println("[1] SEPATU -- 35.000/PCS");
        System.out.println("[2] PAKAIAN -- 12.000/KG");
        System.out.println("[3] SELIMUT -- 15.000/KG");
        System.out.println("[4] BONEKA -- 30.000/PCS");
        System.out.println("[5] KELUAR");
        //End tampilan input data

        
        //Perulangan penginputan pesanan
        for(String x = "Y"; x.equals("Y")|| x.equals("y"); ){
            System.out.println("==================================");
            System.out.print("MASUKAN NOMOR PILIHAN ANDA : ");
            nopilihan = ip.nextInt();
            if(nopilihan == 1 | nopilihan == 4){
                System.out.print("JUMLAH BARANG (PCS) : ");
            
            } else{
                System.out.print("BERAT LAUNDRY (KG) : ");
            }
            
            berat = ip.nextInt();
            System.out.println("==================================");
            
            // Pemilihan pesanan
            switch(nopilihan){
                case 1:
                    pilihan = " SEPATU";
                    System.out.println("ANDA MEMILIH NOMOR [" + nopilihan + "]" + pilihan);
                    harga = harga + j1 * berat;
                    break;
                case 2 :
                    pilihan = " PAKAIAN";
                    System.out.println("ANDA MEMILIH NOMOR [" + nopilihan + "]" + pilihan);
                    harga = harga + j2 * berat;
                    break;
                case 3 :
                    pilihan = " SELIMUT";
                    System.out.println("ANDA MEMILIH NOMOR [" + nopilihan+ "]" + pilihan);
                    harga = harga + j3 * berat;
                    break;
                case 4 :
                    pilihan = " BONEKA";
                    System.out.println("ANDA MEMILIH NOMOR [t" + nopilihan+ "]" + pilihan);
                    harga = harga + j4 * berat;
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("NOMOR TIDAK SESUAI");
            }

            //Pilihan melanjutkan atau mengakhiri pesanan
            System.out.println("TAMBAH PILIHAN? Y/T");

            x = ip.next();
            //end Pilihan melanjutkan atau mengakhiri pesanan
        
        }
        //end perulangan penginputan pesanan


        //menampilkan data pesanan dan data lainnya
        System.out.println("=======================================================================");
        System.out.println("REPORT PESANAN");
        System.out.println("=======================================================================");
        System.out.println("NAMA KASIR : " + kasir);
        System.out.println("NAMA CUSTOMER : " + customer);
        System.out.println("ALAMAT : " + alamat);
        System.out.println("NO. TELP : " + telp);
        
        System.out.println("TOTAL HARGA KESELURUHAN : " + harga +".");
        System.out.println("(========================TERIMA KASIH TELAH BERKUNJUNG======================");
        //end menampilkan data pesanan dan data lainnya
    }

}
