package source;

import javax.swing.JPanel;
import java.awt.Color;

import java.awt.Graphics;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Graph extends JPanel {
		
	private double pie = 3.14159;
	double a, b, c;
	private static final long serialVersionUID = 1L;
		
	private int x=30, y=300;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	
	private String s1="";
	private String s2="";
	
	private JComboBox comboBox1, comboBox2;
	
		
	public Graph() {
		
		String[] graphs = {"select..","parabola","ax^2+bx+c","ax^3","y=mx+c","sin(x)",
							"cos(x)","tan(x)","signum(x)",
							"cubic function","sin^3",
							"cos^3","sin^3+cos^3","Amplitude Modulation"};
		
		String[] select = {"Draw graph", "Erase"};
		
		
		setLayout(null);
		setSize(640, 640);
		
		
		textField1 = new JTextField();
		textField1.setBounds(10, 369, 86, 20);
		add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(10, 395, 86, 20);
		add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(10, 419, 86, 20);
		add(textField3);
		textField3.setColumns(10);
		
		JLabel Label2 = new JLabel("2nd coefficient");
		Label2.setForeground(new Color(255, 102, 51));
		Label2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Label2.setBounds(106, 398, 97, 14);
		add(Label2);
		
		JLabel Label1 = new JLabel("1st coefficient");
		Label1.setForeground(new Color(255, 0, 51));
		Label1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Label1.setBounds(111, 372, 92, 17);
		add(Label1);
		
		JLabel Label3 = new JLabel("constant");
		Label3.setForeground(new Color(255, 0, 153));
		Label3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Label3.setBounds(106, 422, 92, 17);
		add(Label3);
		
		JButton Button = new JButton("C");
		Button.setBackground(new Color(0, 153, 0));
		Button.setForeground(new Color(255, 0, 0));
		Button.setBounds(189, 368, 51, 71);
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField1.getText());
				b = Double.parseDouble(textField2.getText());
				c = Double.parseDouble(textField3.getText());
			}
		});
		add(Button);
		
		comboBox1 = new JComboBox(graphs);
		comboBox1.setBounds(250, 394, 86, 22);
		add(comboBox1);
		
		comboBox2 = new JComboBox(select);
		comboBox2.setBounds(346, 394, 94, 22);
		add(comboBox2);
		
		x=30;
		y=300;
		
		
			
		}
		
		/**
		 * 
		 */
		
		
	public void paintComponent (Graphics g) {
			
			/* Here  by taking x1 and y1 values we initially defined as starting points and 
			 x2  and y2 are ending points we are drawing a lines and pointing the origin for plotting graphs */
			/*And Oval means like rectangle with overly rounded corners and it contains four arguments the first two 
			represent the top and left points like x and y coordinates and the last two represents the width and height
			And if the width and height are same for ovals are rounded circles.
			Here fillOval method draws a solid oval */
			g.drawLine(300, 30, 300, 400);
			g.drawLine(30, 300, 400, 300);
			g.setColor(Color.RED);
			
			
			
			

			//g.drawString((String) comboBox1.getSelectedItem(), 200, 200);\
				s1= (String) comboBox1.getSelectedItem();
				s2 = (String) comboBox2.getSelectedItem();
				
				
			if(s2.equals("Draw graph")&& s1.equals("ax^2+bx+c")){
				//g.setColor(new Color(223,237,238));
				run1();
				
			}else if(s1.equals("cos(x)")&& s2.equals("Draw graph")) {
				g.setColor(Color.BLUE);
				run2();
			}else if(s1.equals("sin(x)")&& s2.equals("Draw graph")) {
				g.setColor(Color.PINK);
				run3();
			}else if(s1.equals("ax^3")&& s2.equals("Draw graph")) {
				g.setColor(Color.blue);
				run4();
			}else if(s1.equals("tan(x)")&& s2.equals("Draw graph")) {
				g.setColor(Color.RED);
				run5();
			}else if(s1.equals("parabola") && s2.equals("Draw graph")) {
				g.setColor(Color.GREEN);
				run6();
			}else if(s1.equals("y=mx+c") && s2.equals("Draw graph")) {
				g.setColor(Color.red);
				run7();
			}else if(s1.equals("signam(x)") && s2.equals("Draw graph")) {
				g.setColor(Color.BLUE);
				run8();
			}else if(s1.equals("cubic function") && s2.equals("Draw graph")) {
				g.setColor(Color.RED);
				run9();
			}else if(s1.equals("sin^3+cos^3") && s2.equals("Draw graph")) {
				g.setColor(Color.RED);
				run10();
			}else if(s1.equals("Amplitude Modulation")&& s2.equals("Draw graph")) {
				g.setColor(Color.RED);
				run11();
			}else if(s1.equals("sin^3") && s2.equals("Draw graph")) {
				g.setColor(Color.RED);
				run12();
			}else if(s1.equals("cos^3") && s2.equals("Draw graph")) {
				g.setColor(Color.RED);
				run13();
			}
			
			
			g.fillOval(x, y, 5, 5);	
			repaint();
	}
	public void run1() {
		
		try {
			Thread.sleep(5);
				
			if(x<600&&y>30&&y!=600) {
				int x1 = x-300;
				int y1 = y-300;
				x1++;
					
				y1 = (int) (.095*(a*Math.pow(x1,2)/60+b*x1+c)); // ax^2+bx+c
				x=300+x1;
				y=300-y1;
			}
		}catch(Exception e) {
				System.out.println("Error Occured");
			}
			
			
	}
	
	public void run2() {
		try {
			Thread.sleep(5);
			
			if(x<600&&y>30&&y!=600) {
				int x1 = x-300;
				int y1 = y-300;
				
				x1++;
				
				y1 = (int) (40*Math.cos(.2*(a*x1/pie)));//cos function
				
				x = x1+300;
				y = 300-y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public void run3() {
		try {
			Thread.sleep(5);
			
			if(x<600&&y>30&&y!=600) {
				int x1 = x-300;
				int y1 = y-300;
				
				x1++;
				
				y1 = (int) (40*Math.sin(.2*(a*x1/pie)));//sin function
				
				x = x1+300;
				y = 300-y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public void run4() {
		try {
			Thread.sleep(5);
			
			if(x<600&&y>30&&y!=600) {
				int x1 = x-300;
				int y1 = y-300;
				
				x1++;
				
				y1 = (int) (.005*(a*Math.pow(x1, 3)));// this is x cube
				
				x = x1+300;
				y = 300-y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public void run5() {
		try {
			Thread.sleep(5);
			
			if(x<600&&y>30&&y!=600) {
				int x1 = x-300;
				int y1 = y-300;
				
				x1++;
				
				y1 = (int) (40*Math.tan(.2*(a*x1/pie)));// Tan function
				
				x = x1+300;
				y = 300-y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public void run6() {
		try {
			Thread.sleep(5);
			
			if(x<600&&y>30&&y!=600) {
				int x1 = x-300;
				int y1 = y-300;
				
				x1++;
				
				y1 = (int) (.0002*(a*Math.pow(x1, 2))); //parabola y = ax^2
				
				x = x1+300;
				y = 300-y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public void run7() {
		try {
			Thread.sleep(5);
			
			if(x<600&&y>30&&y!=600) {
				int x1 = x-300;
				int y1 = y-300;
				
				x1++;
				
				y1 = (int) (.095*(a*x1+c));// this is y = mx+c
				
				x = x1+300;
				y = 300-y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public void run8() {
		try {
			Thread.sleep(5);
			if(x<600&&y>30&&y!=600) {
				int x1 = x-300;
				int y1 = y - 300;
				
				x1++;
				
				y1 = (int) (50*Math.signum(a*x1));// This is signum function
				x = x1+300;
				y = 300 - y1;
			}
		}catch(Exception e) {
			System.out.println("Error occured");
		}
	}
	public void run9(){
		try{
			Thread.sleep(5);
			
			
			if(x<600&&y>30&&y!=600){
				
				 int x1 = x-300;
				 int y1 = y-300;
				 
			     x1++;
				
			     y1 = (int) (.040*(a*Math.pow(x1, 3) + b*x1+ c)); //cubic function
				 x=300+x1;
				 y=300-y1;
					
			}
					
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public void run10() {
		try {
			Thread.sleep(5);
			if(x<600&&y>30&&y!=600) {
				int x1 = x-300;
				int y1 = y - 300;
				
				x1++;
				
				y1 = (int) ((15*Math.pow((Math.cos(.2*a*x1/3.14)),3))+(40*Math.pow((Math.sin(.2*a*x1/3.14)),3))); //sin^3+cos^3
				
				x = x1+300;
				y = 300 - y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public void run11() {
		try {
			
			Thread.sleep(5);
			
			if(x<600&&y>30&&y!=600) {
				
				int x1 = x-300;
				int y1 = y-300;
				
				x1++;
				
				y1 = (int) (15*(1+a*Math.cos(.2*x1/3.14))*Math.cos(x1/3.14)); // Amplitude Modulation
				
				x = x1+300;
				y = 300 - y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public void run12() {
		try {
			
			Thread.sleep(5);
			
			if(x<600&&y>30&&y!=600) {
				
				int x1 = x-300;
				int y1 = y-300;
				
				x1++;
				
				y1 = (int) (40*Math.pow(Math.sin(.2*a*x1/pie), 3));// this is sin^3
				
				x = x1+300;
				y = 300 - y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public void run13() {
		try {
			
			Thread.sleep(5);
			
			if(x<600&&y>30&&y!=600) {
				
				int x1 = x-300;
				int y1 = y-300;
				
				x1++;
				
				y1 = (int) (40*Math.pow(Math.cos(.2*a*x1/pie), 3));// this is cos^3
				
				x = x1+300;
				y = 300 - y1;
				
			}
		}catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
}
