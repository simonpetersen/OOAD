package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
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
	JPanel seriousLabelPanel;
	
	//Initialisering af Label til forklarende tekst, samt drop-down boxes for kategori og seriøsitet.
	JLabel seriousLabel;
	JLabel categoryLabel;
	JComboBox<String> seriousChoices;
	JComboBox<String> categoryChoices;
	JButton seriousLevel1;
	JButton seriousLevel2;
	JButton seriousLevel3;
	JButton seriousLevel4;
	JButton seriousLevel5;
	
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
		seriousLabel = new JLabel("Seriøsitet: ");
		categoryLabel = new JLabel("Vælg kategori: ");
		
		seriousLevel1 = new JButton("1");
		seriousLevel2 = new JButton("2");
		seriousLevel3 = new JButton("3");
		seriousLevel4 = new JButton("4");
		seriousLevel5 = new JButton("5");
		
		seriousnessPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		seriousLabelPanel = new JPanel();
		categoryPanel = new JPanel();
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
		window.getContentPane().setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
		
		descriptionTextArea.setLineWrap(true);
		descriptionPanel.add(descriptionTextArea);
		
		//String[] opt = {"1", "2", "3", "4", "5"};
		//seriousChoices = new JComboBox<String>(opt);
		seriousLabelPanel.add(seriousLabel);
		seriousnessPanel.add(seriousLevel1);
		seriousnessPanel.add(seriousLevel2);
		seriousnessPanel.add(seriousLevel3);
		seriousnessPanel.add(seriousLevel4);
		seriousnessPanel.add(seriousLevel5);
		
		saveButtonPanel.add(saveButton);
		titlePanel.add(titleField);
		
		
		window.add(titlePanel);
		window.add(descriptionPanel);
		window.add(seriousLabelPanel);
		window.add(seriousnessPanel);
		window.add(saveButtonPanel, BorderLayout.SOUTH);
		
		
	}
}
