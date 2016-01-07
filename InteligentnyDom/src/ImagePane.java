

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePane extends JPanel {

	private static final long serialVersionUID = 1L;
	
	BufferedImage originalImage;
	BufferedImage scaledImage;
	
	public ImagePane(File file) {

		 setPreferredSize(new Dimension(320,200));
		    try {
		    	
		        originalImage = ImageIO.read(file);
		        
		    } catch(Exception e){}

		    addComponentListener(new ResizerListener());

	}
	
	public ImagePane(File file, int width, int height)
	{
		this(file);
		setPreferredSize(new Dimension(width,height));
		
	}
	
	public void changeImage(File file){
		try {
			originalImage = ImageIO.read(file);
			resize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void lightOn (){
		try {
			originalImage = ImageIO.read(new File("img/houseStart.jpg"));
			repaint();
			resize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void lightOff (){
		try {
			originalImage = ImageIO.read(new File("img/houseLightOff.jpg"));
			repaint();
			resize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void resize() {
	    double widthScaleFactor = getWidth() / (double)originalImage.getWidth();
	    double heightScaleFactor = getHeight() / (double)originalImage.getHeight();
	    double scaleFactor = (widthScaleFactor > heightScaleFactor)? heightScaleFactor : widthScaleFactor;

	    AffineTransform at = new AffineTransform();
	    at.scale(scaleFactor, scaleFactor);

	    AffineTransformOp scaleOp = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
	    scaledImage = scaleOp.filter(originalImage, null);

	    repaint();
	  
	}
	
	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);

	    g.drawImage(scaledImage, 0, 0, null);
	}
	
	
	
	class ResizerListener implements ComponentListener {
	    @Override
	    public void componentResized(ComponentEvent e) {
	        resize();
	    }

	    @Override public void componentHidden(ComponentEvent e) {}
	    @Override public void componentMoved(ComponentEvent e) {}
	    @Override public void componentShown(ComponentEvent e) {}
	}
	

}

