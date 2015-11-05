package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {
	
	JFrame window;
	JPanel titlePanel;
	JPanel saveButtonPanel;
	JPanel seriousnessPanel;
	JLabel seriousLabel;
	JComboBox<String> seriousChoices;
	JTextField titleField;
	JButton saveButton;
	
	public GUI() {
		window = new JFrame("DILEMMA");
		titleField = new JTextField("Skriv overskrift", 30);
		saveButton = new JButton("Gem");
		seriousLabel = new JLabel("Choose seriousness: ");
		seriousnessPanel = new JPanel();
		titlePanel = new JPanel();
		saveButtonPanel = new JPanel();
	}

	public void openWindow() {
		window.setPreferredSize(new Dimension(400, 600));
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		/*
		String[] opt = {"1", "2", "3", "4", "5"};
		seriousChoices = new JComboBox<String>(opt);
		seriousnessPanel.add(seriousLabel);
		seriousnessPanel.add(seriousChoices);
		*/
		
		saveButtonPanel.add(saveButton);
		titlePanel.add(titleField);
		
		window.add(titlePanel, BorderLayout.NORTH);
		//window.add(seriousnessPanel, BorderLayout.CENTER);
		window.add(saveButtonPanel, BorderLayout.CENTER);
	}
}
