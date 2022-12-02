import java.io.*;

public class FileProcess {
    public static void FileSystem() throws IOException{
        String[] header = new String[]{"Name", "Surname", "Age"};
        File file = new File("readme.txt");
        if(!file.exists()) file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(String output:header) fileWriter.write(output + "\t");
        bufferedWriter.close();

    }

    /*public static void main(String[] args) throws IOException {
        File file = new File("readme.txt");
        //Eğer dosya yoksa oluşturulacak.
        if (!file.exists()) file.createNewFile();

        //Dosya Yazma İşlemleri

        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.write("git clone https://github.com/Ibrahim-Ulusall/delta-software");
        bufferedWriter.close();
        String line;
        //Dosya Okuma İşlemleri
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((line = bufferedReader.readLine()) != null) System.out.println(line);
        bufferedReader.close();
    }*/

    public static void main(String[] args) throws IOException {
        FileSystem();
    }
}
