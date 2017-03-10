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
	
	public static int getPixelAt(int row, int col, PImage image) {
		image.loadPixels();
		
		int index = row*image.width + col;
		
		return image.pixels[index];
	}
	public static boolean isBubbled(PImage p,int r, int c, int h, int w, int threshold){
		int sum = 0;
		for(int i = r; i < r + h; i++){
			for(int j = c; j < c + w; j++){
				sum += getPixelAt(i, j, p);
			}
		}
		return sum >= (threshold*h*w);
	}
	public static AnswerSheet processPageImage(PImage p, int u, int l, int du, int dl, int bubbles){
		AnswerSheet a = new AnswerSheet();
		for(int i=0; i<bubbles; i++)
		{
			a[i] = new ArrayList<int>;
			for(int j=0; j<5; j++) 
			{
				if(isBubbled(P, u+i*du, l+j*dl, du, dl, 75))
				{
					a[i].add(j+1);
				}
			}
		}
		return a;
	}
	public static grade(AnswerSheet[] x, int[] items) {
		for(int i=0; i<x.length; i++) {
			AnswerSheets.compareAnswerSheets(x[i], x[0], items);
		}
		for(int i=0; i<50; i++) {
			items[i].Item.toString();	
		}
	}
}
