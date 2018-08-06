import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
class ByteWriter {

public static void main(String[] args){
    FileOutputStream fout=null;
    try {
   



    fout=new FileOutputStream(new File("writed.txt"));
} catch (FileNotFoundException e) {
   // do something or nothing
}

byte b[]={1,01,1};   /* or read from a source using FileInputStream */

try{
fout.write(b);
}
catch(IOException e){
// something
}

}


}