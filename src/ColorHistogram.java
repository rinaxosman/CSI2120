class ColorHistogram {
    private double[] histogram;

    public ColorHistogram(int d) {
        // TODO: Implement constructor for a d-bit image
    }

    public ColorHistogram(String filename) {
        // TODO: Implement constructor to construct a ColorHistogram from a text file
    }

    public void setImage(ColorImage image) {
        // TODO: Implement method to associate an image with a histogram instance
    }

    public double[] getHistogram() {
        // TODO: Implement method to return the normalized histogram of the image
        return null;
    }

    public double compare(ColorHistogram hist) {
        // TODO: Implement method to return the intersection between two histograms
        return 0.0;
    }

    public void save(String filename) {
        // TODO: Implement method to save the histogram into a text file
    }
}