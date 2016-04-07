package differentia;



public class Comp {

    static int img3[][];

    public void start() {
        Menu.setLog("Compering...");
        int[][] img1 = Container.getSource1();
        int[][] img2 = Container.getSource2();

        int row, col;
        row = img1[0].length;
        col = img1.length;

        img3 = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (img1[i][j] < img2[i][j]) {

                    double x = (double) ((double) img2[i][j] / (double) img1[i][j]);
                    double x1 = x;
                    double x2 = 255 * x1;
                    int x3 = (int) x2;

                    int rgb = (255 << 24) | (x3 << 16) | (x3 << 8) | x3;

                    img3[i][j] = rgb;

                } else if (img1[i][j] > img2[i][j]) {

                    double x = (double) ((double) img1[i][j] / (double) img2[i][j]);
                    double x1 = x;
                    double x2 = 255 * x1;
                    int x3 = (int) x2;
                    int rgb = (255 << 24) | (x3 << 16) | (x3 << 8) | x3;

                    img3[i][j] = (int) rgb;

                } else if (img1[i][j] == img2[i][j]) {

                    img3[i][j] = -1;

                }

            }
        }

        Container.setSource(img3);
        Menu.setLog("Compering completed");

    }

}
