import java.io.File;
import java.lang.reflect.Field;

import javax.annotation.processing.FilerException;
import javax.swing.JFileChooser;
import javax.swing.plaf.FileChooserUI;

public class App {
    public static void main(String[] args) throws Exception {
        boolean running = true;
        int cancel = 0;
        String[] imageExtionStrings = {"jpeg", "png", "jpg", "webp", "img"};
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
                    if(){
                        
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
