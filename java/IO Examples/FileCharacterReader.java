import java.io.*;

public class FileCharacterReader {
    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br=null;
         try {
             fr=new FileReader(new File("eg.txt"));
             br=new BufferedReader(fr);
         }catch (FileNotFoundException fnf){
             //do something

         }
StringBuffer s=new StringBuffer();

        try {
              s.append(br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);


    }




}
