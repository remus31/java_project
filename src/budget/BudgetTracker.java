package budget;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class BudgetTracker {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;
	private JTextField textField_12;
	int calculations;
	double num, ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BudgetTracker window = new BudgetTracker();
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
	public BudgetTracker() {
		initialize();
		
		add(textField);
		add(textField_1);
		add(textField_2);
		add(textField_3);
		add(textField_4);
		add(textField_5);
		add(textField_6);
		add(textField_7);
		add(textField_8);
		add(textField_9);
		add(textField_10);
		add(textField_11);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(819, 466, 97, 25);
		frame.getContentPane().add(btnExit);
	}

	
	private void add(JTextField textField2) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void actionPerformed (ActionEvent ae){
		
	}
	public void arithmetic_operation (){
		
		switch (calculations){
		
		case 1: 
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 2:
			ans = num + Double.parseDouble(textField_1.getText());
			textField_1.setText(Double.toString(ans));
			break;
			
		case 3:
			ans = num + Double.parseDouble(textField_2.getText());
			textField_2.setText(Double.toString(ans));
			break;
			
		case 4:
			ans = num + Double.parseDouble(textField_3.getText());
			textField_3.setText(Double.toString(ans));
			break;
			
		case 5:
			ans = num + Double.parseDouble(textField_4.getText());
			textField_4.setText(Double.toString(ans));
			break;
			
		case 6:
			ans = num + Double.parseDouble(textField_5.getText());
			textField_5.setText(Double.toString(ans));
			break;
			
		case 7:
			ans = num + Double.parseDouble(textField_6.getText());
			textField_6.setText(Double.toString(ans));
			break;
			
		case 8:
			ans = num + Double.parseDouble(textField_7.getText());
			textField_7.setText(Double.toString(ans));
			break;
			
		case 9:
			ans = num + Double.parseDouble(textField_8.getText());
			textField_8.setText(Double.toString(ans));
			break;
			
		case 10:
			ans = num + Double.parseDouble(textField_9.getText());
			textField_9.setText(Double.toString(ans));
			break;
		}
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(12, 59, 463, 162);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Salary");
		lblNewLabel_1.setBounds(12, 36, 56, 16);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Dividends");
		label.setBounds(12, 65, 56, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Business");
		label_1.setBounds(12, 94, 56, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Founds");
		label_2.setBounds(12, 123, 56, 16);
		panel.add(label_2);
		
		JLabel lblIncome = new JLabel("INCOME");
		lblIncome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIncome.setBounds(44, 13, 80, 16);
		panel.add(lblIncome);
		
		textField = new JTextField();
		//textField_10.setText(textField_10.getText());
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double EnterNumber = Double.parseDouble(textField.getText());
				textField.setText(answer);
			}
		});
		textField.setBounds(148, 33, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		//textField_10.setText(textField_10.getText());
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double EnterNumber = Double.parseDouble(textField_1.getText());
				textField_1.setText(answer);
			}
		});
		textField_1.setBounds(148, 62, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double EnterNumber = Double.parseDouble(textField_2.getText());
				textField_2.setText(answer);
			}
		});
		textField_2.setBounds(148, 91, 116, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double EnterNumber = Double.parseDouble(textField_3.getText());
				textField_3.setText(answer);	
			}
		});
		textField_3.setBounds(148, 120, 116, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(312, 61, 97, 25);
		panel.add(btnCalculate);
		
		JLabel label_13 = new JLabel("$");
		label_13.setBounds(273, 36, 56, 16);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("$");
		label_14.setBounds(273, 65, 56, 16);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("$");
		label_15.setBounds(273, 94, 56, 16);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("$");
		label_16.setBounds(273, 123, 56, 16);
		panel.add(label_16);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());
				double num3 = Double.parseDouble(textField_2.getText());
				double num4 = Double.parseDouble(textField_3.getText());
				double value = num1+num2+num3+num4;
				textField_10.setText(value + " ");
				
				//arithmetic_operation ();
				//String EnterNumber = Double.toString(calculations);
				//textField_10.setText(EnterNumber);
				
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(487, 59, 193, 162);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_10 = new JLabel("TOTAL INCOME");
		label_10.setBounds(38, 13, 116, 19);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(label_10);
		
		textField_10 = new JTextField("Result");
		textField_10.setBounds(38, 45, 116, 22);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel label_23 = new JLabel("$");
		label_23.setBounds(166, 48, 56, 16);
		panel_1.add(label_23);
				
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(487, 234, 193, 219);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_11 = new JLabel("TOTAL EXPENSES");
		label_11.setBounds(30, 13, 132, 19);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(label_11);
		
		textField_11 = new JTextField("Result");
		textField_11.setBounds(40, 45, 116, 22);
		panel_3.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel label_24 = new JLabel("$");
		label_24.setBounds(168, 48, 56, 16);
		panel_3.add(label_24);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(692, 59, 278, 394);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_12 = new JLabel("BALANCE");
		label_12.setBounds(104, 13, 70, 19);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(label_12);
		
		textField_12 = new JTextField();
		textField_12.setBounds(80, 55, 116, 121);
		panel_4.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnCalculate_1 = new JButton("Calculate");
		btnCalculate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double num1 = Double.parseDouble(textField_10.getText());
				double num2 = Double.parseDouble(textField_11.getText());
				double value = num1 - num2;
				textField_12.setText(value + " ");
			}
		});
		btnCalculate_1.setBounds(90, 189, 97, 25);
		panel_4.add(btnCalculate_1);
		
		JLabel label_25 = new JLabel("$");
		label_25.setBounds(210, 107, 56, 16);
		panel_4.add(label_25);
		
		JLabel lblNewLabel = new JLabel("Budget Tracker");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel.setBounds(281, 0, 439, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(12, 234, 463, 219);
		frame.getContentPane().add(panel_2);
		
		JLabel label_3 = new JLabel("Electricity");
		label_3.setBounds(12, 36, 56, 16);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Gas/Oil");
		label_4.setBounds(12, 65, 56, 16);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("Water");
		label_5.setBounds(12, 94, 56, 16);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("Phone");
		label_6.setBounds(12, 123, 56, 16);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("EXPENSES");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(44, 13, 80, 16);
		panel_2.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double EnterNumber = Double.parseDouble(textField_4.getText());
				textField_4.setText(answer);
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(148, 33, 116, 22);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double EnterNumber = Double.parseDouble(textField_5.getText());
				textField_5.setText(answer);
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(148, 62, 116, 22);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double EnterNumber = Double.parseDouble(textField_6.getText());
				textField_6.setText(answer);
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(148, 91, 116, 22);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double EnterNumber = Double.parseDouble(textField_7.getText());
				textField_7.setText(answer);
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(148, 120, 116, 22);
		panel_2.add(textField_7);
		
		JLabel label_8 = new JLabel("Internet");
		label_8.setBounds(12, 152, 56, 16);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("Maintenance");
		label_9.setBounds(12, 181, 80, 16);
		panel_2.add(label_9);
		
		textField_8 = new JTextField();
		textField_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double EnterNumber = Double.parseDouble(textField_8.getText());
				textField_8.setText(answer);
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(148, 149, 116, 22);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double EnterNumber = Double.parseDouble(textField_9.getText());
				textField_9.setText(answer);
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(148, 178, 116, 22);
		panel_2.add(textField_9);
		
		JButton button = new JButton("Calculate");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(textField_4.getText());
				double num2 = Double.parseDouble(textField_5.getText());
				double num3 = Double.parseDouble(textField_6.getText());
				double num4 = Double.parseDouble(textField_7.getText());
				double num5 = Double.parseDouble(textField_8.getText());
				double num6 = Double.parseDouble(textField_9.getText());
				double value = num1+num2+num3+num4+num5+num6;
				textField_11.setText(value + " ");
				
			}
		});
		button.setBounds(315, 94, 97, 25);
		panel_2.add(button);
		
		JLabel label_17 = new JLabel("$");
		label_17.setBounds(273, 36, 56, 16);
		panel_2.add(label_17);
		
		JLabel label_18 = new JLabel("$");
		label_18.setBounds(273, 65, 56, 16);
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("$");
		label_19.setBounds(273, 94, 56, 16);
		panel_2.add(label_19);
		
		JLabel label_20 = new JLabel("$");
		label_20.setBounds(273, 123, 56, 16);
		panel_2.add(label_20);
		
		JLabel label_21 = new JLabel("$");
		label_21.setBounds(273, 152, 56, 16);
		panel_2.add(label_21);
		
		JLabel label_22 = new JLabel("$");
		label_22.setBounds(273, 178, 56, 16);
		panel_2.add(label_22);
	}
}
