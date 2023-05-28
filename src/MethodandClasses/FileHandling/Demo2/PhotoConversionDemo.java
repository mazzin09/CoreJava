package MethodandClasses.FileHandling.Demo2;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class PhotoConversionDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://images-eu.ssl-images-amazon.com/images/G/31/img21/CEPC/Clearance/May21/V238940049_IN_PC_BAU_Edit_Creation_Laptops2X._SY608_CB667377204.jpg");
//            File file = new File("C:/testFile/Red.png");

            BufferedImage image = ImageIO.read(url);

            ImageIO.write(image, "jpg", new File("C:/testFile/new-test-ref.png"));
            ImageIO.write(image, "jpg", new File("C:/testFile/new-test.jpg"));
            ImageIO.write(image, "jpg", new File("C:/testFile/new-test.gif"));

            System.out.println("Done ......");
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
