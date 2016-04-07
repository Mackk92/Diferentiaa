package differentia;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

    public synchronized void main() throws IOException, Exception {
        
        JOptionPane.showMessageDialog(null, "Rezsizeing...");
        
        Resize res = new Resize();
   
        res.init(Container.file1name, Container.file2name);
        
        JOptionPane.showMessageDialog(null, "Rezsize ok");
        
        int[][] img1, img2;
        MatrixMaker mak1 = new MatrixMaker();
        mak1.MatrixMaker(Container.file1name);
        img1 = Container.getSource();
        Container.setSource1(img1);

        Container.setSource(null);

        mak1.MatrixMaker(Container.file2name);
        img2 = Container.getSource();
        Container.setSource2(img2);

        Comp comp = new Comp();
        comp.start();
        
        JOptionPane.showMessageDialog(null, "Creating img ..");
        
        ImageMaker imgmak3 = new ImageMaker();
        imgmak3.start();
        
        JOptionPane.showMessageDialog(null, "Img ready");
        
        img im = new img();
        im.img();
        
        JOptionPane.showMessageDialog(null, "All went OK");
    }
}
