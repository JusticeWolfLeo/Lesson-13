
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class CopyFile {
    public static void main(String[] args) {
        copyFile("C:/Users/Veronika/IdeaProjects/Lesson_13/src/Doklad.txt", "C:/Users/Veronika/IdeaProjects/Lesson_13/src/Doklad_copy.txt");
        logging();
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

    public static void logging() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        String string = "C:/Users/Veronika/IdeaProjects/Lesson_13/src/Doklad.txt";
        String[] parts = string.split("/");
        String part1 = parts[6];
        String string2 ="C:/Users/Veronika/IdeaProjects/Lesson_13/src/Doklad_copy.txt";
        String[] tparts = string.split("/");
        String tpart1 = tparts[6];
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            String text = date +" "+ time + "был скопирован файл" + parts[6] + "→" + tparts[6];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}