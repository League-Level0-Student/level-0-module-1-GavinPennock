import javax.swing.JOptionPane;

public class theRiddeler {
	public static void main(String[] args) {
		int score = 0;
		String answer=JOptionPane.showInputDialog(null, "What is greater than God," + 
				"more evil than the devil," + 
				"the poor have it," + 
				"the rich need it," + 
				"and if you eat it, you'll die?");
		if (answer .equals ("nothing")) {
			JOptionPane.showMessageDialog(null, "corrct!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			score++;
			
			
			
			
		} else {
			JOptionPane.showMessageDialog(null, "wrong. you dissapoint me the right answer is nopthing");

		}
		
		
		
		String riddle=JOptionPane.showInputDialog(null, "what gets wetter the more that it dries?");
		if (riddle .equals ("a towel")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
			JOptionPane.showMessageDialog(null, score);
		} else {
			JOptionPane.showMessageDialog(null, "wrong. the answer is a towel");
			JOptionPane.showMessageDialog(null, score);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
