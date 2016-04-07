
package differentia;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class MatrixMaker {

    static int lenght;
    static int width, height;

    public void MatrixMaker(String file) throws IOException {
        String workfile = file;

        JOptionPane.showMessageDialog(null, "bufforing "+workfile+" procedure starting");
        

        System.out.println("/" + workfile);

        InputStream is = this.getClass().getResourceAsStream("/resource/" + workfile);
        BufferedImage hugeImage = ImageIO.read(is);
        Menu.setLog("Buffering image file ...");
        JOptionPane.showMessageDialog(null, "bufforing OK");
        height = hugeImage.getHeight();
        width = hugeImage.getWidth();
        Container.setHeight(height);
        Container.setWidth(width);
        System.out.println("height:" + height);
        System.out.println("width:" + width);

        Container.setLenght(lenght);

        int[][] source = new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                source[row][col] = hugeImage.getRGB(col, row);

            }
        }
        Container.setSource(source);
        Menu.setLog("Buffering done");

    }
}
