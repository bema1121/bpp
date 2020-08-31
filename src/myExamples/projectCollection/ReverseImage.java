package myExamples.projectCollection;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReverseImage {
    public static void main(String[] args) {
        /**
         * Task Level: Advanced
         * 1) There is a DevX School logo in resources image directory.
         * 2) TODO implement flipImageHorizontally method so that the image will be reversed horizontally
         * 3) Then image will be saved in "out" directory as New-DevX-logo.png
         *
         */
        ReverseImage reverseImage = new ReverseImage();
        BufferedImage original = reverseImage.initImage("image/DevX-logo.png");
        BufferedImage reversed = reverseImage.flipImageHorizontally(original);
        reverseImage.saveMirrorImage(reversed);
    }
    /**
     * 1) loads image that is in resources directory
     *
     * @return originalImage
     */
    public BufferedImage initImage(String location) {
        BufferedImage original;
        //read source image file
        try {
            URL url = this.getClass().getClassLoader().getResource(location);
            File file = new File(url.toURI());
            original = ImageIO.read(file);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            throw new NullPointerException("Image not found\n" + e.getMessage());
        }
        return original;
    }
    /**
     * 2) Flips the image horizontally
     * * get source image dimensions
     * * create BufferedImage object for mirror image
     * * mirror image pixel by pixel, by using 2 for loops
     * - first loop iterates height
     * - second loop reverses width
     * lx starts from the left side of the image which is index 0
     * rx starts from the right side of the image which is width length - 1
     * get source pixel value
     * set mirror image pixel value
     * * return mirror image
     *
     * @param original
     * @return mirror
     */
    public BufferedImage flipImageHorizontally(BufferedImage original) {
        //get source image dimensions
        int width = original.getWidth();
        int height = original.getHeight();
        //BufferedImage object for mirror image
        BufferedImage mirror = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        //create mirror image pixel by pixel
        // TODO implement this loop
        //you can use original.getRGB(int x, int y) to get the specific pixel in the picture;
        //where x is x coordinate of the pixel. and y is y coordinate
        //mirror.setRGB(int x, int y, int pixel) can be used to copy and paste that pixel to a picture.
        return mirror;
    }
    /**
     * saves the mirrored image in "out" directory
     *
     * @param reversed
     */
    public void saveMirrorImage(BufferedImage reversed) {
        try {
            Path path = Paths.get("out", "New-DevX-logo.png");
            File newFile = new File(path.toUri());
            ImageIO.write(reversed, "png", newFile);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }}