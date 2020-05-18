import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        Path myPath= Paths.get(System.getProperty("user.dir"));
        Path sourceDirPath= Paths.get(System.getProperty("user.dir"),"source");
        Path desDirPath= Paths.get(System.getProperty("user.dir"),"destination");


        System.out.println(myPath.toAbsolutePath());
        //String mySoureFile= myPath.toString()+"\source\mytext.txt";
        Path mySourceFile = Paths.get(sourceDirPath.toString(),"mytext.txt");
        Path myDesFile= Paths.get(desDirPath.toString(),"copyofmytext.txt");
        System.out.println(mySourceFile.toString());
        //System.out.println(mySoureFile);
        try{
            if (Files.exists(sourceDirPath) || Files.exists(desDirPath)){
                System.out.println("Folder Already Created");
            }else{
                Path sourceDir= Files.createDirectory(sourceDirPath);
                Path desDir=Files.createDirectory(desDirPath);

            }

            if(Files.exists(mySourceFile)){
                System.out.println("files Already Created");
            }else{
                Path newFile= Files.createFile(mySourceFile);
                System.out.println("New file Created: "+newFile);
            }

            if (Files.exists(myDesFile)){
                System.out.println("Already Copy");
            }else{
                Path copyFile= Files.copy(mySourceFile,myDesFile);
                System.out.println("Copied File: "+copyFile);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(myPath.getFileName());
    }
}
