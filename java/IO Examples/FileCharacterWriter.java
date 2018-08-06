import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharacterWriter {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;

        try {
            fileWriter=new FileWriter("test.txt");
         bufferedWriter=new BufferedWriter(fileWriter);
        }catch (IOException IOE){
            //
        }

        try {
            bufferedWriter.write(args[0]);
            bufferedWriter.close();
        }
        catch (IOException e){

            //
        }
    }
}
