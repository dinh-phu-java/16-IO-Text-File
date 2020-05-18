import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Path myPath= Paths.get(System.getProperty("user.dir"),"myfile.txt");
        System.out.println(myPath.toString());
        File myFile= new File(myPath.toString());
        InputStream stream= new FileInputStream(myFile);
        DataInputStream dis = new DataInputStream(stream);
        InputStreamReader isr= new InputStreamReader(dis);
        BufferedReader bufferedReader=new BufferedReader(isr);
        while(bufferedReader.ready()){
            String[] myArr= bufferedReader.readLine().split(",");
            System.out.println("CountTry : "+myArr[myArr.length-1]);
        }
    
    }
}
