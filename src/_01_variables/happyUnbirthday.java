package _01_variables;

import javax.swing.JOptionPane;

public class happyUnbirthday {
	public static void main(String[] args) {
		String day=JOptionPane.showInputDialog(null, "when is your birthday? (write birthday like m/d");
		if (day .equals ("9/5")) {
			JOptionPane.showMessageDialog(null,"happy birthday");
		} else {
JOptionPane.showMessageDialog(null, "loser");
		}
	}

}
