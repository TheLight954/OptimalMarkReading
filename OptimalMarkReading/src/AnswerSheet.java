/***
 * A class to represent a set of answers from a page
 */
public class AnswerSheet {
	int id;
	String alphabet = "ABCDE";
	ArrayList<int>[] answers;
	public int convertToString(ArrayList<int> a) {
		for(int i=0; i<a.size()-1; i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.print(a.get(a.size()-1));
	}
	public void toString() {
		for(int i=0; i<answers.length; i++) {
			System.out.println((i+1) + ", " + answers.convertToString());
		}
	}
}
