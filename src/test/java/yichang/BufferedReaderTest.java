package yichang;
import java.io.*;


/**
 * Created by Administrator on 2017/4/21 0021.
 */
public class BufferedReaderTest {
    private static final String FILE = "src/main/java/java1702/javase/io/BufferedReaderTest.java";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}