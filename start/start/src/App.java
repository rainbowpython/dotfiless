import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Field;

import javax.annotation.processing.FilerException;
import javax.swing.JFileChooser;
import javax.swing.plaf.FileChooserUI;

public class App {
    public static void main(String[] args) throws Exception {
        boolean running = true;
        int cancel = 0;
        String[] imageExtentionStrings = {"jpeg", "png", "jpg", "webp", "img"};
        while(running){
            System.out.println("Hello, World!");
            
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

            var result = jFileChooser.showOpenDialog(jFileChooser);

            if(result == JFileChooser.APPROVE_OPTION){
                File file = jFileChooser.getSelectedFile();
                running = false;
                
                //create a char array from a string
                char[] fileNameAsChar = new char[file.getName().length()];
                for(int i = 0; i<file.getName().length(); i++){
                    fileNameAsChar[i] = file.getName().charAt(i);
                }
                
                //find index of dot
                int index = 0;
                for (char letter : fileNameAsChar) {
                    if(letter == '.'){
                        break;
                    }else{
                        index++;
                    }
                }
                try {
                    String fileExtionsion = file.getName().substring(index+1);
                    System.out.println(fileExtionsion);
                    for (int i = 0; i < imageExtentionStrings.length; i++) {

                        if(fileExtionsion.equals(imageExtentionStrings[i])){
                            String path = file.getPath();
                            System.out.println(path);
                            PrintStream printStream = new PrintStream(new File("~/dotfiless/pywal.sh"));
                            printStream.println("wal -i " + path);

                            try {
                                Process process = new ProcessBuilder("~/dotfiless/pywal.sh").start();
                                
                            } catch (IOException e) {
                                e.printStackTrace();
                                System.out.println(e);
                            } catch(Exception e){
                                e.printStackTrace();
                                System.out.println(e);
                            }
                            break;
                        }
                        else{
                            System.out.println("owo");
                        }

                    }
              
                } catch (Exception e) {
                    // TODO: handle exception
                    
                }
            }
            else if(result == JFileChooser.CANCEL_OPTION){
                if(cancel == 1){
                    running = false;
                }
                cancel++;
            }
            
        }
    }
}
