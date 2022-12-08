import java.io.IOException;

public class test {
    public static void main(String[] args) {
        try {
            Process process = new ProcessBuilder("pywal.sh").start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
