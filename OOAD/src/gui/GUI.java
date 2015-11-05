package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {
	
	//Initialisering af vindue og JPanels der holder hvert element i interfacet.
	JFrame window;
	JPanel titlePanel;
	JPanel descriptionPanel;
	JPanel categoryPanel;
	JPanel saveButtonPanel;
	JPanel seriousnessPanel;
	
	//Initialisering af Label til forklarende tekst, samt drop-down boxes for kategori og seriøsitet.
	JLabel seriousLabel;
	JLabel categoryLabel;
	JComboBox<String> seriousChoices;
	JComboBox<String> categoryChoices;
	
	//Initialisering af tekstfelter til overskrift og beskrivelse af dilemma, samt knap til at gemme.
	JTextField titleField;
	JTextArea descriptionTextArea;
	JButton saveButton;
	
	public GUI() {
		//Konstruktion af alle GUI-elementer.
		window = new JFrame("DILEMMA");
		titleField = new JTextField("Overskrift", 30);
		descriptionTextArea = new JTextArea("Beskrivelse", 8, 30);
		saveButton = new JButton("Gem");
		seriousLabel = new JLabel("Vælg seriøsitet: ");
		categoryLabel = new JLabel("Vælg kategori: ");
		seriousnessPanel = new JPanel();
		descriptionPanel = new JPanel();
		titlePanel = new JPanel();
		descriptionPanel = new JPanel();
		saveButtonPanel = new JPanel();
	}

	public void openWindow() {
		window.setPreferredSize(new Dimension(400, 600));
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		descriptionTextArea.setLineWrap(true);
		descriptionPanel.add(descriptionTextArea);
		
		/*
		String[] opt = {"1", "2", "3", "4", "5"};
		seriousChoices = new JComboBox<String>(opt);
		seriousnessPanel.add(seriousLabel);
		seriousnessPanel.add(seriousChoices);
		*/
		
		saveButtonPanel.add(saveButton);
		titlePanel.add(titleField);
		
		window.getContentPane().add(titlePanel, BorderLayout.NORTH);
//		window.getContentPane().add(seriousnessPanel, BorderLayout.SOUTH);
		window.add(descriptionPanel, BorderLayout.CENTER);
		window.getContentPane().add(saveButtonPanel, BorderLayout.SOUTH);
	}
}
