class ColorImage {
    private int[][][] pixelValues; // Array representation of pixel values
    private int width;
    private int height;
    private int depth; // Number of bits per pixel

    public ColorImage(String filename) {
        // TODO: Implement constructor to read image from file (jpg or ppm)
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int[] getPixel(int i, int j) {
        // TODO: Implement method to get the 3-channel value of a pixel
        return null;
    }

    public void reduceColor(int d) {
        // TODO: Implement method to reduce color space to a d-bit representation
    }
}