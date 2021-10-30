package com.enes.learningreadfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import java.io.*  ------> bu satir tum io class ini cagirir. Boylelikle tum classlari import etmemize gerek kalmaz
public class Application {

    public static void main(String[] args) {

        File file = new File("myfilewrong.txt");
        /*Normalde Java 7 ye kadar olan surumlerde Bir resource acildiktan sonra kapatilmalidir ve bunun icin finally bloguna ihtiyac duyulur.
         * ancak bu durum Java 7 den sonra degismistir. Bunun icin tum resourcelar try blogunda tanimlanir ve geri kapatmaya ihtiyac duymadan Java
         * bunu kendisi otomatik olarak yapar. Yanina 1 yazilmis hicbir satira artik gerek kalmadi
         *
         *
         *
         * BUNU YAPARAK NE KADAR SATIRDAN KURTULDUGUNU GOR
         */

        //1	BufferedReader bufferedReader=null;
        //1	FileReader fileReader=null;
        try(FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader)) {
            //1	fileReader = new FileReader(file);
            //1	bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine(); // Burada hata aldik ve add catch clause to surrounding try
            // secenegine tikladik
            // asagida bunun icin ayrica bir catch blogu olustu
            // (IOException)

            while(line!=null) {
                System.out.println(line);
                line=bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem Reading the File: "+file.getName());
        }

//		finally {
//			try {
//				if(bufferedReader!=null)
//				{
//					bufferedReader.close();
//				}
//				if(fileReader!=null)
//				{
//					fileReader.close();
//				}
//				bufferedReader.close();
//				fileReader.close();
//			} catch (IOException e) {
//				System.out.println("Unable to close file: "+file.getName());
//			}

//			  catch(NullPointerException e) ********aslinda null pointer kullanmak software olarak iyi degil
//										    cunku bir programda asla bir degerin null olmasini istemeyiz
//										    bu yuzden NullPointerException yerine if statement kullanabiliirz.********
//			{
//				  System.out.println("File name does not exist");
//			}
    }
}


