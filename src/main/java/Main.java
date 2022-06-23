import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        System.out.println("Hello! ><");
//        InputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream("conn.yaml");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        Yaml yaml = new Yaml();
//
//        Map<String, Object> connect_obj = yaml.load(inputStream);
//
//        System.out.println(connect_obj);

        String inputString = ""; // строка, в которую запишем содержимое файла

        try(FileReader reader = new FileReader("src//main//resources//conn.yaml"))
        {
            int c;  // вычитвать будем посимвольно
            while((c = reader.read())!= -1)
            {
                //System.out.println((char)c); // промежуточная проверка, что все читается
                inputString += (char)c; // собираем символы обратно в строчку
            }
        }
        catch(IOException ex){
             System.out.println(ex.getMessage());
        }

        System.out.println(inputString);
        Yaml yaml = new Yaml();
        Map<String, Object> connect_obj = yaml.load(inputString);

        System.out.println(connect_obj);
    }
}

