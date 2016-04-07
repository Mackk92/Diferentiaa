package differentia;

public class Container {

    static String file1source;
    static String file2source;
    static String file1name;
    static String file2name;
    static int[][] red, green, blue, alpha, source, sr1, sr2;
    static int[] red1d, green1d, blue1d, alpha1d;
    static int height, width, lenght;

    public static int[][] getSource2() throws IllegalStateException {
        return sr2; //will throw exception if not set
    }

    public static void setSource2(int[][] s2) {
        Container.sr2 = s2;
    }

    public static int[][] getSource1() throws IllegalStateException {
        return sr1; //will throw exception if not set
    }

    public static void setSource1(int[][] s1) {
        Container.sr1 = s1;
    }

    public static int[][] getSource() throws IllegalStateException {
        return source; //will throw exception if not set
    }

    public static void setSource(int[][] sss) {
        Container.source = sss;
    }

    public static int getLenght() throws IllegalStateException {
        return lenght; //will throw exception if not set
    }

    public static void setLenght(int lengh) {
        Container.lenght = lengh;
    }

    public static int[] getAlphaMatrix1d() throws IllegalStateException {
        return alpha1d; //will throw exception if not set
    }

    public static void setAlphaMatrix1d(int[] alphas) {
        Container.alpha1d = alphas;
    }

    public static int[][] getAlphaMatrix() throws IllegalStateException {
        return alpha; //will throw exception if not set
    }

    public static void setAlphaMatrix(int[][] alphas) {
        Container.alpha = alphas;
    }

    public static void setHeight(int heights) {
        Container.height = heights;
    }

    public static void setWidth(int widths) {
        Container.width = widths;
    }

    public static int getHeight() throws IllegalStateException {
        return height; //will throw exception if not set
    }

    public static int getWidth() throws IllegalStateException {
        return width; //will throw exception if not set
    }

    public static int[] getRedMatrix1d() throws IllegalStateException {
        return red1d; //will throw exception if not set
    }

    public static int[] getGreenMatrix1d() throws IllegalStateException {
        return green1d; //will throw exception if not set
    }

    public static int[] getBlueMatrix1d() throws IllegalStateException {
        return blue1d; //will throw exception if not set
    }

    public static void setRedMatrix1d(int[] reds) {
        Container.red1d = reds;
    }

    public static void setGreenMatrix1d(int[] greens) {
        Container.green1d = greens;
    }

    public static void setBlueMatrix1d(int[] blues) {
        Container.blue1d = blues;
    }

    public static void setRedMatrix(int[][] redsor) {
        Container.red = redsor;
    }

    public static void setBlueMatrix(int[][] bluesor) {
        Container.blue = bluesor;
    }

    public static void setGreenMatrix(int[][] greensor) {
        Container.green = greensor;
    }

    public static int[][] getRedMatrix() throws IllegalStateException {
        return red; //will throw exception if not set
    }

    public static int[][] getBlueMatrix() throws IllegalStateException {
        return blue; //will throw exception if not set
    }

    public static int[][] getGreenMatrix() throws IllegalStateException {
        return green; //will throw exception if not set
    }

    public static void setFile1Name(String filename1) {
        Container.file1name = filename1;
    }

    public static void setFile2Name(String filename2) {
        Container.file2name = filename2;
    }

    public static String getFile1Name() throws IllegalStateException {
        return file1name; //will throw exception if not set
    }

    public static String getFile2Name() throws IllegalStateException {
        return file2name; //will throw exception if not set
    }

    public static void setFile1Source(String filesource1) {
        Container.file1source = filesource1;
    }

    public static String getFile1Source() throws IllegalStateException {
        return file1source;
    }

    public static void setFile2Source(String filesource2) {
        Container.file2source = filesource2;
    }

    public static String getFile2Source() throws IllegalStateException {
        return file2source; //will throw exception if not set
    }
}
