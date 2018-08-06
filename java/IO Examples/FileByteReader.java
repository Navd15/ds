import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileByteReader {
    public static void main(String[] args) throws IOException {
File f=new File(args[0]);
        FileInputStream fin=null;

        try{

            fin=new FileInputStream(f);

        }catch(FileNotFoundException fnF){}
// print to console
    int i=0;
do {
   i= fin.read();
    if(i != -1) System.out.print(i);
}
while(i!=-1);

fin.close();
    }

}
