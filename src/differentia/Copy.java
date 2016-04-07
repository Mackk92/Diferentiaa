package differentia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JOptionPane;

public class Copy {

    File dest = new File("C:\\Users\\bla\\bla\\files\\destfile1.txt");

    public String filename;
    public File filesource;

    public void Copy(File source, String name) throws IOException {
          JOptionPane.showMessageDialog(null, "copy");
        String Dir = System.getProperty("user.dir");
        Dir = Dir.replace("\\", "\\\\");
        filename = name;
        filesource = source;

        Menu.setLog("Copying file:" + Dir + "\\\\src\\\\resource\\\\" + filename);

        dest = new File(Dir + "\\\\src\\\\resource\\\\" + filename);

        Files.copy(filesource.toPath(), dest.toPath());

        Menu.setLog("Copying Completed");
JOptionPane.showMessageDialog(null, "copy ok");
    }
}
