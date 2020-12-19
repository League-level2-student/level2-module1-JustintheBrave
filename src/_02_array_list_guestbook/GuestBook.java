package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public static void main(String[] args) {
		GuestBook guest = new GuestBook();
		guest.GUI();
	}
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton addName = new JButton();
	static JButton viewName = new JButton();
	
	public void GUI() {
		panel.add(addName);
		panel.add(viewName);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
		viewName.addActionListener(this);
		addName.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==addName) {
		String newName = JOptionPane.showInputDialog("Please enter a name");	
		}
	}

	
}
