
package differentia;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;


public class ImageMaker {

    public void start() throws java.lang.Exception {

        String userdir = System.getProperty("user.dir");
        int width = Container.width;
        int height = Container.height;
        Menu.setLog("Creating image...");
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        int[][] sss = Container.getSource();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                {

                    image.setRGB(i, j, sss[j][i]);

                }
            }
        }

        int a = 1;
        File outputFile = new File(userdir + "\\src\\resource\\result.png");
        File outputFile1 = new File("D:\\result.png");
        if (outputFile.exists()) {

            outputFile.renameTo(new File(userdir + "\\src\\resource\\result" + a + ".png"));
            a++;
            ImageIO.write(image, "png", outputFile1);
            ImageIO.write(image, "png", outputFile);
        } else {
            ImageIO.write(image, "png", outputFile1);
            ImageIO.write(image, "png", outputFile);
        }
        Menu.setLog("Image saved");
    }
}
