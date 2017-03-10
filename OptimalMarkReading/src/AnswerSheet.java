/***
 * A class to represent a set of answers from a page
 */
public class AnswerSheet {
	int id;
	ArrayList<int>[] answers;
	public void compareAnswerSheets(AnswerSheet a, AnswerSheet answerKey) {
		int correct = 0;
		int wrong = 0;
		for(int i=0; i<answers.length; i++) {
			if(a.answers[i] == answerKey.answers[i]) {
				correct++;
			}
			else
			{
				wrong++;
			}
		}
		System.out.println("# Correct " + correct + "# Wrong " + wrong + "% Correct " + 100*correct/(correct+wrong) + "% Wrong " + 100*wrong/(correct+wrong));
	}
}
