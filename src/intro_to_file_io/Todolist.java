package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Todolist implements ActionListener {
	public static void main(String[] args) {
		Todolist asdf = new Todolist();

	}

	JFrame tiny = new JFrame();
	JPanel small = new JPanel();
	JButton add = new JButton();
	JButton load = new JButton();
	JButton save = new JButton();
	JButton remove = new JButton();
	ArrayList<String> task = new ArrayList<String>();

	Todolist() {

		tiny.add(small);
		small.add(remove);
		small.add(add);
		small.add(load);
		small.add(save);
		add.setText("Add task");
		remove.setText("Remove task");
		load.setText("Load Task");
		save.setText("Save task");
		tiny.setVisible(true);
		tiny.setSize(500, 75);
		add.addActionListener(this);
		load.addActionListener(this);
		remove.addActionListener(this);
		save.addActionListener(this);
		add.getMouseListeners();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(add)) {
			String work = JOptionPane.showInputDialog("Do you want to add someting to your list?");
			task.add(work);
		}
		if (e.getSource().equals(load)) {
			JOptionPane.showConfirmDialog(null, "Do you want to " + task);
		}
		if (e.getSource().equals(remove)) {
			String not = JOptionPane.showInputDialog("Which task do you want to get rid of" + task);
			int number = Integer.parseInt(not);
			task.remove(number);
		}
		if (e.getSource().equals(save)) {
			try {
				FileWriter fwr = new FileWriter("src/intro_to_file_io/tdl.txt");
				String ing = "";
				for (String st : task) {
					ing += st + "\n";
				}
				fwr.write(ing);
				fwr.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

}
