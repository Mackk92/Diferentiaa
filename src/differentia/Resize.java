
package differentia;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

public class Resize {

    public void init(String file1, String file2) throws java.lang.Exception {

        String wokfile1 = file1;
        String wokfile2 = file2;

        Menu.setLog("Resizing...");
        String userdir = System.getProperty("user.dir");
       // InputStream is1 = this.getClass().getResourceAsStream(userdir + "\\src\\resource\\" + wokfile1);
         BufferedImage bimg1 = ImageIO.read(new File(userdir + "\\src\\resource\\"+wokfile1));
      //  BufferedImage bimg1 = ImageIO.read(is1);
       // InputStream is2 = this.getClass().getResourceAsStream(userdir + "\\src\\resource\\" + wokfile2);
  //      BufferedImage bimg2 = ImageIO.read(is2);
                 BufferedImage bimg2 = ImageIO.read(new File(userdir + "\\src\\resource\\"+wokfile2));
        int type1 = bimg1.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : bimg1.getType();

        int type2 = bimg2.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : bimg2.getType();
        int width1 = bimg1.getWidth();
        int height1 = bimg1.getHeight();
        int width2 = bimg2.getWidth();
        int height2 = bimg2.getHeight();

        if (width1 > width2) {

            BufferedImage resizedImage = new BufferedImage(width1, height1, type2);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(bimg2, 0, 0, width1, height1, null);

            g.setComposite(AlphaComposite.Src);
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.dispose();
            File f2 = new File(userdir + "\\src\\resource\\" + wokfile2);
            //   f2.delete();
            ImageIO.write(resizedImage, "PNG", new File(userdir + "\\src\\resource\\workfile2.png"));
            TimeUnit.SECONDS.sleep(2);
            Container.setFile2Name("workfile2.png");
            Menu.setLog("Resizing done");
        } else if (width2 > width1) {

            BufferedImage resizedImage = new BufferedImage(width2, height2, type1);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(bimg1, 0, 0, width2, height2, null);

            g.setComposite(AlphaComposite.Src);
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.dispose();
            File f1 = new File(userdir + "\\src\\resource\\" + wokfile1);
            // f1.delete();
            ImageIO.write(resizedImage, "PNG", new File(userdir + "\\src\\resource\\workfile1.png"));
            TimeUnit.SECONDS.sleep(2);
            Container.setFile1Name("workfile1.png");
            Menu.setLog("Resizing done");

        } else {
            Menu.setLog("Resizing not required");
        }
        {
        }

    }
}
