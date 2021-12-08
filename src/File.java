
import java.io.*;
public class File implements Serializable{

    public void fileWriter(String Path, String Txt){

      try {

          FileWriter fileWriter = new FileWriter(Path);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          bufferedWriter.write(Txt);
          bufferedWriter.flush();
          bufferedWriter.close();
      }
      catch (IOException e){
          e.printStackTrace();
      }

    }

    public String fileReader(String Path){
        String Temp = "";

        try {

            FileReader fileReader = new FileReader(Path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String nextLine = "";
            while ((nextLine = bufferedReader.readLine()) != null){

                Temp += nextLine;
            }
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return Temp;

    }

    public void objectFileWriter(String Path, Object Note){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(Note);
        }catch (FileNotFoundException e){

            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public Object objectFileReader(String Path){
            Object Temp = null;

         try {
             FileInputStream fileInputStream = new FileInputStream(Path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             Temp = objectInputStream.readObject();
         }catch (FileNotFoundException e){
             e.printStackTrace();
         }catch (IOException e){
             e.printStackTrace();
         }catch (ClassNotFoundException e){
             e.printStackTrace();
         }

         return Temp;
    }
}
