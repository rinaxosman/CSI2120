import java.util.List;

public class SimilaritySearch {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SimilaritySearch <query_image_filename> <image_dataset_directory>");
            System.exit(1);
        }

        String queryImageFilename = args[0];
        String imageDatasetDirectory = args[1];

        // Create ColorImage object for the query image
        ColorImage queryImage = new ColorImage(queryImageFilename);

        // TODO: Compute histogram for the query image

        // TODO: Read pre-computed histograms from the image dataset directory

        // TODO: Compare histograms and find 5 most similar images

        // TODO: Print the names of the 5 most similar images
    }
}