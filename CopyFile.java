
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CopyFile {
    public static void main(String[] args) {
        copyFile("C:/Users/Veronika/IdeaProjects/Lesson_13/src/Doklad.txt", "C:/Users/Veronika/IdeaProjects/Lesson_13/src/Doklad_copy.txt");
    }

    private static void copyFile(String source, String target) {

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void logging(String[] args) {
        Date date = new Date();
        try (FileWriter writer = new FileWriter("log.txt", true)) { //еще хрен знает где он создастся...
            String text = date + "был скопирован файл" + source + "→" + target; // у меня просто закончились идеи, я знаю, что это хрень, SOS
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}