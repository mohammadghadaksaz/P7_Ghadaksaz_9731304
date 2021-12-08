import java.io.*;

public class Main extends File {

    public static void main (String[] args){

        Note note1 = new Note("Test1", "This Is Dummy Content1", "1400/9/8");
        Note note2 = new Note("Test2", "This Is Dummy Content2", "1400/9/8");

        note1.objectFileWriter("note1.bin", note1);
        note2.objectFileWriter("note2.bin", note2);

        Note note3 = (Note) note1.objectFileReader("note1.bin");
        Note note4 = (Note) note2.objectFileReader("note2.bin");

        System.out.println(note3);
        System.out.println(note4);

        try {

            FileWriter fileWriter = new FileWriter("Text1.text");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("This Is Dummy Content3\n This Is Dummy Content4");
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        String Temp1 = "";

        try {

            FileReader fileReader = new FileReader("Text1.text");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String nextLine = "";
            while ((nextLine = bufferedReader.readLine()) != null){

                Temp1 += nextLine;
            }
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(Temp1);

        try {

            FileWriter fileWriter = new FileWriter("Text2.text");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("This Is Dummy Content5");
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        String Temp2 ="";
        try {

            FileReader fileReader = new FileReader("Text2.text");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String nextLine = "";
            while ((nextLine = bufferedReader.readLine()) != null){

                Temp2 += nextLine;
            }
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(Temp2);

    }

}
