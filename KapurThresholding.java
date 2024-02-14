package codePractice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class KapurThresholding {
    public static void main(String[] args)throws Exception {
        try {
            // Load the grayscale image from a file
            BufferedImage image = ImageIO.read(new File("C:\\Users\\i\\Desktop\\skillvertex\\personal\\image.png"));

            // Get image width and height
            int width = image.getWidth();
            int height = image.getHeight();

            // Initialize variables to calculate probabilities
            int[] histogram = new int[256];
            double[] probability = new double[256];

            // Calculate histogram and probabilities
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixelValue = image.getRGB(x, y) & 0xFF; // Get the intensity value (0-255)
                    histogram[pixelValue]++;
                }
            }

            int totalPixels = width * height;
            for (int i = 0; i < 256; i++) {
                probability[i] = (double) histogram[i] / totalPixels;
            }

            // Calculate Kapur's entropy and find optimal threshold
            double maxEntropy = 0;
            int optimalThreshold = 0;

            for (int t = 1; t < 255; t++) {
                double omega0 = 0;
                double omega1 = 0;
                double mu0 = 0;
                double mu1 = 0;

                // Calculate omega0 and omega1
                for (int i = 0; i <= t; i++) {
                    omega0 += probability[i];
                    mu0 += i * probability[i];
                }
                for (int i = t + 1; i < 256; i++) {
                    omega1 += probability[i];
                    mu1 += i * probability[i];
                }

                // Calculate entropy for the two classes
                double entropy0 = calculateEntropy(omega0);
                double entropy1 = calculateEntropy(omega1);

                // Calculate Kapur's entropy
                double kapurEntropy = entropy0 + entropy1;

                // Update if a better threshold is found
                if (kapurEntropy > maxEntropy) {
                    maxEntropy = kapurEntropy;
                    optimalThreshold = t;
                }
            }

            System.out.println("Optimal Threshold: " + optimalThreshold);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to calculate entropy
    public static double calculateEntropy(double omega) {
        if (omega <= 0 || omega >= 1) {
            return 0;
        }
        return -omega * Math.log(omega) / Math.log(2);
    }
}
