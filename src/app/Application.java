
package app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) /*throws FileNotFoundException*/ { //buradaki scanner hatasi try catch ile de giderilebilir.

//		for(int i=0;i<=3;i++) {
//		Scanner input =new Scanner(System.in);
//		System.out.println("Enter string: ");
//		String enteredText=input.nextLine();
//		System.out.println(enteredText);
//		}

        try {
            File file = new File("myfile.txt");
            Scanner input;

            input = new Scanner(file);

            while (input.hasNextLine()) {
                String str = input.nextLine();
                System.out.println(str);
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("File not found");
            //e.printStackTrace();
        }


        try {
            MyFileUtils myUtil=new MyFileUtils();
            System.out.println(myUtil.subtract10FromLargeNumber(9));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
