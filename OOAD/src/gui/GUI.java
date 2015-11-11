package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class GUI implements ActionListener {
	
	//Initialisering af vindue og JPanels der holder hvert element i interfacet.
	JFrame window;
	JPanel titlePanel;
	JPanel descriptionPanel;
	JPanel categoryPanel;
	JPanel saveButtonPanel;
	JPanel seriousnessPanel;
	JPanel seriousLabelPanel;
	JPanel timePanel;
	
	//Initialisering af Label til forklarende tekst, samt drop-down boxes for kategori og seriøsitet.
	JLabel seriousLabel;
	JLabel categoryLabel;
	JLabel timeLabel;
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
	JSpinner timeSpinner;
	String[] categoryOpt = {"Forhold", "Mode", "Hobby", "Karriere"};
	
	public GUI() {
		//Konstruktion af alle GUI-elementer.
		window = new JFrame("DILEMMA");
		titleField = new JTextField("Overskrift", 30);
		descriptionTextArea = new JTextArea("Beskrivelse", 8, 30);
		saveButton = new JButton("Gem");
		saveButton.addActionListener(this);
		seriousLabel = new JLabel("Seriøsitet: ");
		categoryLabel = new JLabel("Vælg kategori: ");
		timeLabel = new JLabel("Svartid: ");
		
		seriousLevel1 = new JButton("1");
		seriousLevel1.addActionListener(this);
		seriousLevel1.setActionCommand("Serious = 1");
		seriousLevel2 = new JButton("2");
		seriousLevel3 = new JButton("3");
		seriousLevel4 = new JButton("4");
		seriousLevel5 = new JButton("5");
		
		categoryChoices = new JComboBox<String>(categoryOpt);
		
		timeSpinner = new JSpinner(new SpinnerNumberModel(10, 0, 60, 1));
		
		seriousnessPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		seriousLabelPanel = new JPanel();
		timePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		categoryPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		descriptionPanel = new JPanel();
		titlePanel = new JPanel();
		descriptionPanel = new JPanel();
		saveButtonPanel = new JPanel();
	}

	public void openWindow() {
		window.setPreferredSize(new Dimension(400, 480));
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.getContentPane().setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
		
		descriptionTextArea.setLineWrap(true);
		descriptionPanel.add(descriptionTextArea);
		
		seriousLabelPanel.add(seriousLabel);
		seriousnessPanel.add(seriousLevel1);
		seriousnessPanel.add(seriousLevel2);
		seriousnessPanel.add(seriousLevel3);
		seriousnessPanel.add(seriousLevel4);
		seriousnessPanel.add(seriousLevel5);
		
		saveButtonPanel.add(saveButton);
		titlePanel.add(titleField);
		
		categoryPanel.add(categoryLabel);
		categoryPanel.add(categoryChoices);
		
		timePanel.add(timeLabel);
		timePanel.add(timeSpinner);
		
		window.add(titlePanel);
		window.add(descriptionPanel);
		window.add(seriousLabelPanel);
		window.add(seriousnessPanel);
		window.add(categoryPanel);
		window.add(timePanel);
		window.add(saveButtonPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		if ("Serious = 1".equals(e.getActionCommand()))
			System.out.println(seriousLevel1.getText());
		else {
			System.out.println("Title: "+titleField.getText());
			System.out.println("Description: "+descriptionTextArea.getText());
			System.out.println("Category: "+categoryOpt[categoryChoices.getSelectedIndex()]);
			System.out.println("Time: "+timeSpinner.getValue());
		}
	}
}
