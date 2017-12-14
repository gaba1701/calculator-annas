package com.calculator_annas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.GridLayout;

public class MainForm {

	private JFrame frame;
	private JTextField txtOut;
	private CalculatorOperations calculatorOperations;
	private CalculatorAdvancedOperationsClass calculatorAdvancedOperations;
	private boolean needsErasingOutput;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
		calculatorOperations = new CalculatorOperations();
		calculatorAdvancedOperations = new CalculatorAdvancedOperationsClass();
		needsErasingOutput = false;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setBounds(0, 46, 90, 45);
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
				}
		});
		
		JButton btnEight = new JButton("8");
		btnEight.setBounds(90, 46, 90, 45);
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
				}
		});
		
		JButton btnNine = new JButton("9");
		btnNine.setBounds(180, 46, 90, 45);
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
				}
		});
		
		txtOut = new JTextField();
		txtOut.setBounds(0, 1, 361, 45);
		txtOut.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOut.setText("0");
		txtOut.setBackground(Color.WHITE);
		txtOut.setEditable(false);
		txtOut.setColumns(10);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(270, 46, 90, 45);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorOperations.firstNumber = Double.parseDouble(txtOut.getText());
				calculatorOperations.setOperation(0);
				needsErasingOutput = true;
			}
		});
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBounds(270, 91, 90, 45);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorOperations.firstNumber = Double.parseDouble(txtOut.getText());
				calculatorOperations.setOperation(1);
				needsErasingOutput = true;
			}
		});
		JButton btnAddition = new JButton("+");
		btnAddition.setBounds(270, 136, 90, 45);
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorOperations.firstNumber = Double.parseDouble(txtOut.getText());
				calculatorOperations.setOperation(2);
				needsErasingOutput = true;
			}
		});
		JButton btnX2 = new JButton("^2");
		btnX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorAdvancedOperations.number = Double.parseDouble(txtOut.getText());
				double result = calculatorAdvancedOperations.x2();
				txtOut.setText(String.valueOf(result));
				needsErasingOutput = true;
			}
		});
		btnX2.setBounds(360, 226, 90, 45);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(txtOut);
		
		JButton btnPi = new JButton("Pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorAdvancedOperations.number = Double.parseDouble(txtOut.getText());
				double result = calculatorAdvancedOperations.piMultiplyByX();
				txtOut.setText(String.valueOf(result));
				needsErasingOutput = true;
			}
		});
		btnPi.setBounds(360, 1, 90, 45);
		frame.getContentPane().add(btnPi);
		frame.getContentPane().add(btnSeven);
		frame.getContentPane().add(btnEight);
		frame.getContentPane().add(btnNine);
		frame.getContentPane().add(btnDivide);
		
		JButton btnSix = new JButton("6");
		btnSix.setBounds(180, 91, 90, 45);
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
				}
		});
		
		JButton btnFive = new JButton("5");
		btnFive.setBounds(90, 91, 90, 45);
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
				}
		});
		
		JButton btnFour = new JButton("4");
		btnFour.setBounds(0, 91, 90, 45);
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
				}
		});
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorAdvancedOperations.number = Double.parseDouble(txtOut.getText());
				double result = calculatorAdvancedOperations.sqrt();
				txtOut.setText(String.valueOf(result));
			}
		});
		btnSqrt.setBounds(360, 46, 90, 45);
		frame.getContentPane().add(btnSqrt);
		frame.getContentPane().add(btnFour);
		frame.getContentPane().add(btnFive);
		frame.getContentPane().add(btnSix);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnThree = new JButton("3");
		btnThree.setBounds(180, 136, 90, 45);
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
				}
		});
		
		JButton btnTwo = new JButton("2");
		btnTwo.setBounds(90, 136, 90, 45);
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
			}
		});
		
		JButton btnOne = new JButton("1");
		btnOne.setBounds(0, 136, 90, 45);
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
			}
		});
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorAdvancedOperations.number = Double.parseDouble(txtOut.getText());
				double result = calculatorAdvancedOperations.sinus();
				txtOut.setText(String.valueOf(result));
				needsErasingOutput = true;
			}
		});
		btnSin.setBounds(360, 91, 90, 45);
		frame.getContentPane().add(btnSin);
		frame.getContentPane().add(btnOne);
		frame.getContentPane().add(btnTwo);
		frame.getContentPane().add(btnThree);
		frame.getContentPane().add(btnAddition);
		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(180, 181, 90, 45);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorOperations.secondNumber = Double.parseDouble(txtOut.getText());
				double result = 0.0;
				
				switch (calculatorOperations.getOperation()) {
				case 0:
					result = calculatorOperations.division();
					break;
				case 1:
					result = calculatorOperations.multiply();
					break;
				case 2:
					result = calculatorOperations.addition();
					break;
				case 3:
					result = calculatorOperations.subtracion();
					break;
				default:
					try {
					throw new Exception("Action not supported");
					} catch (Exception e1) {
		
						e1.printStackTrace();
					}
				}
				
				
				txtOut.setText(String.valueOf(result));
				needsErasingOutput = true;
			}
		});
		
		JButton btnZero = new JButton("0");
		btnZero.setBounds(90, 181, 90, 45);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readInputAndUpdateOutput(e);
			}
		});
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorAdvancedOperations.number = Double.parseDouble(txtOut.getText());
				double result = calculatorAdvancedOperations.cosinus();
				txtOut.setText(String.valueOf(result));
				needsErasingOutput = true;
			}
		});
		btnCos.setBounds(360, 136, 90, 45);
		frame.getContentPane().add(btnCos);
		frame.getContentPane().add(btnZero);
		frame.getContentPane().add(btnEquals);
		frame.getContentPane().add(btnX2);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorOperations.firstNumber = Double.parseDouble(txtOut.getText());
				calculatorOperations.setOperation(3);
				needsErasingOutput = true;
			}
		});
		btnMinus.setBounds(270, 181, 90, 45);
		frame.getContentPane().add(btnMinus);
		
		JButton btnX3 = new JButton("^3");
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorAdvancedOperations.number = Double.parseDouble(txtOut.getText());
				double result = calculatorAdvancedOperations.x3();
				txtOut.setText(String.valueOf(result));
				needsErasingOutput = true;
			}
		});
		btnX3.setBounds(360, 181, 90, 45);
		frame.getContentPane().add(btnX3);
	}
	
	private void readInputAndUpdateOutput(ActionEvent e) {
		if (needsErasingOutput) {
			txtOut.setText("0");
			needsErasingOutput = false;
		}
		
		String existingOutput = txtOut.getText();
		JButton sender = (JButton)e.getSource();
		String input = sender.getText();
		
		if (existingOutput.length() > 9) {
			return;
		}
		
		if (existingOutput.equals("0")) {
			txtOut.setText(input);
		} else {
			txtOut.setText(existingOutput + input);
		}
	}
}