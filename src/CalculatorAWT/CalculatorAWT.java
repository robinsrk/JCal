package CalculatorAWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorAWT extends Frame {
	CalculatorAWT(){
		Frame mainFrame = new Frame();
		mainFrame.setTitle("Calculator");
		Panel mainPanel = new Panel();
		Panel outputPanel = new Panel();
		TextField outputText = new TextField();
		outputPanel.add(outputText);
		Panel buttonsPanel = new Panel();
		buttonsPanel.setLayout(new GridLayout(4, 4));
		outputPanel.setLayout(new GridLayout(1, 1));
		mainPanel.setLayout(new GridLayout(2, 1));
		Button one = new Button("1");
		Button two = new Button("2");
		Button three = new Button("3");
		Button four = new Button("4");
		Button five = new Button("5");
		Button six = new Button("6");
		Button seven = new Button("7");
		Button eight = new Button("8");
		Button nine = new Button("9");
		Button zero = new Button("0");
		Button divide = new Button("/");
		Button multiply = new Button("*");
		Button subtract = new Button("-");
		Button add = new Button("+");
		Button equal = new Button("=");
		Button percent = new Button("%");
//		Button equal = new Button("=");
		mainFrame.setVisible(true);
//		mainFrame.setLayout(new GridLayout(2, 2));
		mainFrame.setSize(300, 300);
		buttonsPanel.add(seven);
		buttonsPanel.add(eight);
		buttonsPanel.add(nine);
		buttonsPanel.add(divide);
		buttonsPanel.add(four);
		buttonsPanel.add(five);
		buttonsPanel.add(six);
		buttonsPanel.add(multiply);
		buttonsPanel.add(one);
		buttonsPanel.add(two);
		buttonsPanel.add(three);
		buttonsPanel.add(subtract);
		buttonsPanel.add(zero);
		buttonsPanel.add(percent);
		buttonsPanel.add(equal);
		buttonsPanel.add(add);
		mainPanel.add(outputPanel);
		mainPanel.add(buttonsPanel);
		mainFrame.add(mainPanel, BorderLayout.NORTH);
		mainFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new CalculatorAWT();
	}
}
