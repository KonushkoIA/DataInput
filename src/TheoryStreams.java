import java.io.*;
import java.nio.charset.StandardCharsets;

public class TheoryStreams {
    public static void main(String[] args) {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("testFile.txt");
//            int c;
//            while ((c = fileInputStream.read()) != -1) {
//                System.out.print((char) c);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //------------------------------------------------------------
//        try{
//            FileOutputStream fileOutputStream = new FileOutputStream("newfile.txt");
//            String variableForWrite = "Teach me skills";
//            fileOutputStream.write(variableForWrite.getBytes(StandardCharsets.UTF_8));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //---------------------------------------------------------
//        try {
//            FileReader fileReader = new FileReader("testFile.txt");
//            int c;
//            while ((c = fileReader.read()) != -1){
//                System.out.print((char) c);
//            }
//        } catch (IOException e){
//
//        }
        // ---------------------------------------------------------
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter("newfile.txt");
//            String variableForWrite = "Teaccch me skills";
//            fileWriter.write(variableForWrite);
//        }catch (IOException e){
//
//        }finally {
//            if (fileWriter != null){
//                try {
//                    fileWriter.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        // или
//        try(FileWriter fileWriter = new FileWriter("newfile.txt")) {
//            String variableForWrite = "Teacch me skills";
//            fileWriter.write(variableForWrite);
//        }catch (IOException e){
//
//       }
        //---------------------------------------------------------
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("testFile.txt"))){
            String variableForWrite = "Teach me skillllls";
            bufferedWriter.write(variableForWrite);
        } catch (IOException e){

        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("testFile.txt"))){
            System.out.println(bufferedReader.readLine());
        } catch (IOException e){
            }
        // если много строк, то через создание переменной String и присваиванием ей каждой строки пока != null
        //---------------------------------------------------------
    }
}
