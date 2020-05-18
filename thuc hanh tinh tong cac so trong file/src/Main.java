import java.io.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is= new FileInputStream("mytext.txt");

        DataInputStream dis=new DataInputStream(is);
        BufferedReader bf = new BufferedReader(new InputStreamReader(dis));

        Optional<Integer> count = bf.lines().map(k->Integer.parseInt(k)).reduce((num1,num2)->{
            return num1+num2;
        });
        System.out.println("Sum is: "+count.get());
    }
}
