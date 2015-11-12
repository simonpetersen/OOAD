package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUI implements ActionListener, ChangeListener {
	
	//Initialisering af vindue og JPanels der holder hvert element i interfacet.
	private int seriousValue;
	private ArrayList<JTextField> answerOptions;
	private JFrame window;
	private JPanel titlePanel;
	private JPanel descriptionPanel;
	private JPanel categoryPanel;
	private JPanel saveButtonPanel;
	private JPanel seriousnessPanel;
	private JPanel seriousLabelPanel;
	private JPanel timePanel;
	private JPanel answerOptionsPanel;
	private JPanel mainAnswerOptionsPanel; //Container til at holde to panels.
	
	//Initialisering af Label til forklarende tekst, samt drop-down boxes for kategori og seriøsitet.
	private JLabel seriousLabel;
	private JLabel categoryLabel;
	private JLabel timeLabel;
	private JLabel answerOptionsLabel;
	private JComboBox<String> categoryChoices;
	private JButton seriousLevel1;
	private JButton seriousLevel2;
	private JButton seriousLevel3;
	private JButton seriousLevel4;
	private JButton seriousLevel5;
	
	//Initialisering af tekstfelter til overskrift og beskrivelse af dilemma, samt knap til at gemme.
	private JTextField titleField;
	private JTextArea descriptionTextArea;
	private JButton saveButton;
	private JSpinner timeSpinner;
	private JSpinner answerOptionsSpinner;
	private String[] categoryOpt = {"--", "Forhold", "Mode", "Hobby", "Karriere"};
	
	public GUI() {
		seriousValue = 0;
		answerOptions = new ArrayList<JTextField>();
		//Konstruktion af alle GUI-elementer.
		window = new JFrame("DILEMMA");
		titleField = new JTextField("Overskrift", 30);
		descriptionTextArea = new JTextArea("Beskrivelse", 8, 30);
		saveButton = new JButton("Gem"); 
//		saveButton.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Title: "+titleField.getText());
//				System.out.println("Description: "+descriptionTextArea.getText());
//				System.out.println("Category: "+categoryOpt[categoryChoices.getSelectedIndex()]);
//				System.out.println("Time: "+timeSpinner.getValue());
//			}
//		});
		seriousLabel = new JLabel("Seriøsitet: ");
		categoryLabel = new JLabel("Vælg kategori: ");
		timeLabel = new JLabel("Svartid: ");
		answerOptionsLabel = new JLabel("Antal svarmuligheder: ");
		
		seriousLevel1 = new JButton("1");
		seriousLevel1.addActionListener(this);
		seriousLevel1.setActionCommand("1");
		seriousLevel2 = new JButton("2");
		seriousLevel2.addActionListener(this);
		seriousLevel2.setActionCommand("2");
		seriousLevel3 = new JButton("3");
		seriousLevel3.addActionListener(this);
		seriousLevel3.setActionCommand("3");
		seriousLevel4 = new JButton("4");
		seriousLevel4.addActionListener(this);
		seriousLevel4.setActionCommand("4");
		seriousLevel5 = new JButton("5");
		seriousLevel5.addActionListener(this);
		seriousLevel5.setActionCommand("5");
		
		categoryChoices = new JComboBox<String>(categoryOpt);
		
		answerOptionsSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 5, 1));
		answerOptionsSpinner.addChangeListener(this);
		timeSpinner = new JSpinner(new SpinnerNumberModel(10, 0, 60, 1));
		
		seriousnessPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		seriousLabelPanel = new JPanel();
		timePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		categoryPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		answerOptionsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		titlePanel = new JPanel();
		descriptionPanel = new JPanel();
		saveButtonPanel = new JPanel();
		mainAnswerOptionsPanel = new JPanel();
		mainAnswerOptionsPanel.setLayout(new BoxLayout(mainAnswerOptionsPanel, BoxLayout.Y_AXIS));
	}
	
	public void setSaveButtonActionListener(ActionListener aL) {
		saveButton.addActionListener(aL);
	}

	public void openWindow() {
		window.setPreferredSize(new Dimension(400, 580));
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
		
		answerOptionsPanel.add(answerOptionsLabel);
		answerOptionsPanel.add(answerOptionsSpinner);
		
		categoryPanel.add(categoryLabel);
		categoryPanel.add(categoryChoices);
		
		timePanel.add(timeLabel);
		timePanel.add(timeSpinner);
		
		mainAnswerOptionsPanel.add(answerOptionsPanel);
		
		window.add(titlePanel);
		window.add(descriptionPanel);
		window.add(seriousLabelPanel);
		window.add(seriousnessPanel);
		window.add(categoryPanel);
		window.add(timePanel);
		window.add(answerOptionsPanel);
		window.add(mainAnswerOptionsPanel);
		window.add(saveButtonPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("1"))
			seriousValue = 1;
		else if (e.getActionCommand().equals("2"))
			seriousValue = 2;
		else if (e.getActionCommand().equals("3"))
			seriousValue = 3;
		else if (e.getActionCommand().equals("4"))
			seriousValue = 4;
		else if (e.getActionCommand().equals("5"))
			seriousValue = 5;
		System.out.println(seriousValue);
	}
	
	public void stateChanged(ChangeEvent e) {
		int numberOfOptions = (int) answerOptionsSpinner.getValue();
		if (numberOfOptions < answerOptions.size()) {
			for (int i=answerOptions.size()-1; i >= numberOfOptions; i--) {
				mainAnswerOptionsPanel.remove(i);
				answerOptions.remove(i);
			}
		}
		
		for (int i=answerOptions.size(); i < numberOfOptions; i++) {
			JPanel tempPanel = new JPanel();
			JLabel tempLabel = new JLabel("Mulighed "+(++i)+": ");
			JTextField tempTextField = new JTextField(24);
			tempPanel.add(tempLabel);
			tempPanel.add(tempTextField);
			mainAnswerOptionsPanel.add(tempPanel);
			answerOptions.add(tempTextField);
		}
		window.validate();
		window.repaint();
	}
	
	public String getTitleFieldText() {
		return titleField.getText();
	}
	
	public String getDescription() {
		return descriptionTextArea.getText();
	}
	
	public int getSeriousLevel() {
		return seriousValue;
	}
	
	public int getTime() {
		return (int) timeSpinner.getValue();
	}
	
	public String getCategory() {
		return categoryOpt[categoryChoices.getSelectedIndex()];
	}
	
	
}
