import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class TestImageMerge
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			// TODO Auto-generated method stub
			BufferedImage image1 = ImageIO.read(new File("/Images/test1010.jpg"));
			BufferedImage image2 = ImageIO.read(new File("/Images/test74.jpg"));
	
			int width = Math.max(image1.getWidth(), image2.getWidth());
			int height = image1.getHeight() + image2.getHeight();
	
			BufferedImage mergedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			Graphics2D graphics = (Graphics2D) mergedImage.getGraphics();
	
			graphics.setBackground(Color.WHITE);
			graphics.drawImage(image2, 0, 0,300,300, null);
			graphics.drawImage(image1, 0, 30, null);
			
			
			//ImageIO.write(mergedImage, "png", new File("/Images/result.png"));
			// ImageIO.write(mergedImage, "jpg", new File("c:\\mergedImage.jpg"));
			// ImageIO.write(mergedImage, "png", new File("c:\\mergedImage.png"));
		}
		catch(Exception e)
		{
			
		}
	
	}

}
