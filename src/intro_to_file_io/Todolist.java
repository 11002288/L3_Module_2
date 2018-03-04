package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Todolist implements ActionListener {
	public static void main(String[] args) {
	}

	JFrame tiny = new JFrame();
	JPanel small = new JPanel();
	JButton add = new JButton();
	JButton load = new JButton();
	JButton save = new JButton();
	JButton remove = new JButton();

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
		tiny.setSize(500, 500);
		add.addActionListener(this);
		load.addActionListener(this);
		remove.addActionListener(this);
		save.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
