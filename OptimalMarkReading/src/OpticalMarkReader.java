import processing.core.PImage;

/***
 * Class to perform image processing for optical mark reading
 * 
 */
public class OpticalMarkReader {

	/***
	 * Method to do optical mark reading on page image.  Return an AnswerSheet object representing the page answers.
	 * @param image
	 * @return
	 */
	public AnswerSheet processPageImage(PImage image) {
		
		return null;
	}
	
	public static int getPixelAt(int row, int col, PImage image) {
		image.loadPixels();
		
		int index = row*image.width + col;
		
		return image.pixels[index];
	}
	public static boolean isBubbled(PImage p,int r, int c, int h, int w,int threshold){
		int sum = 0;
		for(int i = r; i < r + h; i++){
			for(int j = c; j < c + w; j++){
				sum += getPixelAt(i, j, p);
			}
		}
		return sum >= (threshold*h*w);
	}
	
}
