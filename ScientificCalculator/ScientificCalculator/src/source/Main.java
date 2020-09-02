package source;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField textField;
	double firstnumber;
	double secondnumber;
	double result;
	private String item;
	private final double exp = 2.71828;
	private final double pie = 3.14159;
	String operations;
	String Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setForeground(Color.GRAY);
		setBackground(Color.GRAY);
		setTitle("Scientific Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 492);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 102, 153));
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(UIManager.getBorder("CheckBox.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(102, 102, 102));
		menuBar.setBackground(new Color(102, 102, 102));
		menuBar.setToolTipText("");
		menuBar.setBounds(0, 0, 486, 22);
		contentPane.add(menuBar);
		
		JMenu Menu = new JMenu("File");
		Menu.setForeground(new Color(255, 255, 0));
		menuBar.add(Menu);
		
		JMenuItem MenuItem1 = new JMenuItem("Graph");
		MenuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainGraph();
				
			
			}
		});
		MenuItem1.setBackground(new Color(173, 216, 230));
		Menu.add(MenuItem1);
		
		JMenuItem MenuItem2 = new JMenuItem("Exit");
		MenuItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		MenuItem2.setBackground(new Color(173, 216, 230));
		MenuItem2.setForeground(new Color(0, 0, 0));
		Menu.add(MenuItem2);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.BOLD, 18));
		textField.setBounds(10, 25, 406, 93);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    item = textField.getText() + btn1.getText();
				textField.setText(item);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn1.setBounds(10, 129, 60, 46);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText( )+ btn2.getText();
				textField.setText(item);
				
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn2.setBounds(80, 129, 60, 46);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText() + btn3.getText();
				textField.setText(item);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn3.setBounds(150, 129, 58, 46);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText() + btn4.getText();
				textField.setText(item);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn4.setBounds(10, 186, 58, 46);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText() + btn5.getText();
				textField.setText(item);
				
			}
			
		});
		btn5.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn5.setBounds(80, 186, 60, 46);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText() + btn6.getText();
				textField.setText(item);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn6.setBounds(150, 186, 60, 46);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText() + btn7.getText();
				textField.setText(item);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn7.setBounds(10, 243, 58, 46);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText() + btn8.getText();
				textField.setText(item);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn8.setBounds(80, 243, 58, 46);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText() + btn9.getText();
				textField.setText(item);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn9.setBounds(150, 243, 60, 46);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText() + btn0.getText();
				textField.setText(item);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn0.setBounds(150, 300, 60, 46);
		contentPane.add(btn0);
		
		//This is for Subtraction 
		//Adding the data of BtnMinus to the textField and assigning it to the item
		//And adding item to the textField 
		//operations contains symbol of the operator
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
				
			}
		});
		btnMinus.setFont(new Font("Arial Black", Font.BOLD, 34));
		btnMinus.setBounds(10, 300, 60, 46);
		contentPane.add(btnMinus);
		
		//This is for multiplication 
		//Adding the data of BtnMulti to the textField and assigning it to the item
		//And adding item to the textField 
		//operations contains symbol of the operator
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			
				
			}
		});
		btnMulti.setFont(new Font("Arial Black", Font.BOLD, 34));
		btnMulti.setBounds(80, 300, 60, 46);
		contentPane.add(btnMulti);
		
		//This is for Dividing
		//Adding the data of  btndivide  to the textField and assigning it to the item
		//And adding item to the textField 
		//operations contains symbol of the operator
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="/";
			
				
			}
		});
		btndivide.setFont(new Font("Arial Black", Font.BOLD, 34));
		btndivide.setBounds(80, 357, 60, 40);
		contentPane.add(btndivide);
		
		//This is for Percentage calculation
		//Adding the data of  btnpercent  to the textField and assigning it to the item
		//And adding item to the textField 
		//operations contains symbol of the operator
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
		
						
			}
		});
		btnpercent.setFont(new Font("Arial Black", Font.BOLD, 24));
		btnpercent.setBounds(10, 357, 60, 40);
		contentPane.add(btnpercent);
		
		//This is for dot(.)
		//Adding the data of  btndot  to the textField and assigning it to the item
		//And adding item to the textField 		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText() + btndot.getText();
				textField.setText(item);
					
			}
		});
		btndot.setFont(new Font("Arial Black", Font.BOLD, 30));
		btndot.setBounds(10, 408, 60, 40);
		contentPane.add(btndot);
		
		//This is for addition
		//Adding the data of  btnplus  to the textField and assigning it to the item
		//And adding item to the textField 
		//operations contains symbol of the operator
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			
				
			}
		});
		btnplus.setFont(new Font("Arial Black", Font.BOLD, 34));
		btnplus.setBounds(80, 408, 60, 40);
		contentPane.add(btnplus);
		
		//This is for getting the answers 
		/* */
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnumber = Double.parseDouble(textField.getText());

				if(operations=="+") {
					result = firstnumber + secondnumber;
					Answer = String.format("%.2f", result);
					textField.setText(Answer);
				}
				else if(operations.contentEquals("-")) {
					result = firstnumber - secondnumber;
					Answer = String.valueOf(result);
					textField.setText(Answer);
				}
				else if(operations.equals("/")) {
					result = firstnumber / secondnumber;
					Answer = String.valueOf(result);
					textField.setText(Answer);
				}
				else if(operations.equals("*")) {
					result = firstnumber * secondnumber;
					Answer = String.valueOf(result);
					textField.setText(Answer);
				}
				else if(operations=="x^n") {
					result = Math.pow(firstnumber, secondnumber);
					Answer = String.valueOf(result);
					textField.setText(Answer);
				}
			}
		});
		btnequal.setForeground(new Color(255, 0, 255));
		btnequal.setBackground(new Color(34, 139, 34));
		btnequal.setFont(new Font("Arial Black", Font.BOLD, 34));
		btnequal.setBounds(147, 357, 61, 91);
		contentPane.add(btnequal);
		
		JButton btn_x_square = new JButton("x^2");
		btn_x_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value;
				value = Double.parseDouble((textField.getText()));
				value = value * value;
				textField.setText(String.valueOf(value));
			}
			
		});
		btn_x_square.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_x_square.setBounds(218, 129, 58, 46);
		contentPane.add(btn_x_square);
		
		JButton btn_x_power_n = new JButton("x^n");
		btn_x_power_n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "x^n";
			}
			
		});
		btn_x_power_n.setFont(new Font("Arial Black", Font.BOLD, 12));
		btn_x_power_n.setBounds(286, 129, 60, 46);
		contentPane.add(btn_x_power_n);
		
		//This is for finding square root of x ..
		//In it for item we are assigning the data in the textField by converting it to double
		//And after performing operations we again converting item into a String and adding it to the textField
		
		JButton btn_square_root = new JButton("\u221Ax");
		btn_square_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value;
				value = Double.parseDouble(textField.getText());
				value = Math.sqrt(value);
				textField.setText(String.valueOf(value));
			}
		});
		btn_square_root.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn_square_root.setBounds(356, 129, 60, 46);
		contentPane.add(btn_square_root);
		
		JButton btn_e_power = new JButton("e^x");
		btn_e_power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(textField.getText());
				value = Math.pow(exp, value);
				textField.setText(String.valueOf(value));
			}
		});
		btn_e_power.setFont(new Font("Arial Black", Font.BOLD, 11));
		btn_e_power.setBounds(220, 186, 56, 46);
		contentPane.add(btn_e_power);
		
		JButton btn_10_power_x = new JButton("10^x");
		btn_10_power_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble((textField.getText()));
				value = Math.pow(10, value);
				textField.setText(String.valueOf(value));
			}
		});
		btn_10_power_x.setFont(new Font("Arial Black", Font.BOLD, 9));
		btn_10_power_x.setBounds(286, 186, 60, 46);
		contentPane.add(btn_10_power_x);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value;
				value = Double.parseDouble(textField.getText());
				value = Math.sin(value);
				textField.setText(String.valueOf(value));
			}
		});
		btnSin.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnSin.setBounds(356, 186, 60, 44);
		contentPane.add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value;
				value= Double.parseDouble(textField.getText());
				value= Math.cos(value);
				textField.setText(String.valueOf(value));
			}
		});
		btnCos.setFont(new Font("Arial Black", Font.BOLD, 10));
		btnCos.setBounds(220, 244, 56, 45);
		contentPane.add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value;
				value = Double.parseDouble(textField.getText());
				value = Math.tan(value);
				textField.setText(String.valueOf(value));
			}
		});
		btnTan.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnTan.setBounds(286, 244, 60, 45);
		contentPane.add(btnTan);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value;
				value = Double.parseDouble(textField.getText());
				value = Math.log10(value);
				textField.setText(String.valueOf(value));
			}
		});
		btnLog.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnLog.setBounds(356, 243, 60, 46);
		contentPane.add(btnLog);
		
		JButton btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(textField.getText());
				value = Math.log(value);
				textField.setText(String.valueOf(value));
			}
			
		});
		btnLn.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnLn.setBounds(220, 300, 56, 46);
		contentPane.add(btnLn);
		
		JButton btn_one_divide_x = new JButton("1/x");
		btn_one_divide_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value ;
				value = Double.parseDouble(textField.getText());
				value = (1/value);
				textField.setText(String.valueOf(value));
			}
		});
		btn_one_divide_x.setFont(new Font("Arial Black", Font.BOLD, 13));
		btn_one_divide_x.setBounds(286, 300, 60, 46);
		contentPane.add(btn_one_divide_x);
		
		//This is for calculating the multiple value with respect to pie
		//Here just taking a new variable value type of double and assigning the converted textField data to value
		//after completion of mathematical operations 
		//Adding the value to the textField by converting the value into String
		JButton btn_pie = new JButton("\u03C0");
		btn_pie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value;
				value = Double.parseDouble(textField.getText());
				value =value*pie;
				textField.setText(String.valueOf(value));
			}
		});
		btn_pie.setFont(new Font("Arial Black", Font.BOLD, 16));
		btn_pie.setBounds(355, 300, 61, 46);
		contentPane.add(btn_pie);
		
		JButton btn_decimal = new JButton("OCT");
		btn_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a, 8));

			}
		});
		btn_decimal.setFont(new Font("Arial Black", Font.BOLD, 11));
		btn_decimal.setBounds(356, 410, 60, 38);
		contentPane.add(btn_decimal);
		
		JButton btn_Bin = new JButton("BIN");
		btn_Bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a, 2));
			}
		});
		btn_Bin.setFont(new Font("Arial Black", Font.BOLD, 11));
		btn_Bin.setBounds(218, 408, 58, 40);
		contentPane.add(btn_Bin);
		
		JButton btn_hex = new JButton("HEX");
		btn_hex.setFont(new Font("Arial Black", Font.BOLD, 11));
		btn_hex.setBounds(286, 408, 60, 40);
		btn_hex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a, 16));

			}
		});
		contentPane.add(btn_hex);
		
		JButton btn_del = new JButton("DEL");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = null;
				if(textField.getText().length()>0) {
					StringBuilder st = new StringBuilder(textField.getText());
					st.deleteCharAt(textField.getText().length()-1);
					item=st.toString();
					textField.setText(item);
				}
			}
		});
		btn_del.setForeground(Color.ORANGE);
		btn_del.setBackground(new Color(255, 69, 0));
		btn_del.setFont(new Font("Arial Black", Font.BOLD, 11));
		btn_del.setBounds(321, 357, 95, 40);
		contentPane.add(btn_del);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = textField.getText();
				item = item.replace(item, "");
				textField.setText(item);
			}
			
		});
		btnCancel.setBackground(new Color(255, 0, 51));
		btnCancel.setForeground(Color.YELLOW);
		btnCancel.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnCancel.setBounds(218, 357, 93, 46);
		contentPane.add(btnCancel);
		
		
	}
	
}
