package source;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class MainGraph extends JFrame {
	double a, b, c;
	private JLabel Label_Last1;
	
	
	MainGraph(){
		Graph p1 = new Graph();
		
		 setTitle("Graph Calculator");
		 setSize(650, 650);
		 setVisible(true);
		 setResizable(true);
		   
		 getContentPane().add(p1, BorderLayout.CENTER);
		 p1.setLayout(null);
		 
		 Label_Last1 = new JLabel();
		 Label_Last1.setText("While ploting graphs first fill all the textFields with values or\r\n enter 1 as default and click on button ");
		 Label_Last1.setBackground(new Color(102, 204, 255));
		 Label_Last1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		 Label_Last1.setForeground(new Color(210, 105, 30));
		 Label_Last1.setBounds(0, 514, 634, 48);
		 p1.add(Label_Last1);
		 
		 JLabel Label_last2 = new JLabel("Then select the graphs type from comboBox and start plotting");
		 Label_last2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 Label_last2.setForeground(SystemColor.desktop);
		 Label_last2.setBounds(0, 552, 634, 48);
		 p1.add(Label_last2);
		 

	}
	public static void main(String[] args) {
		new MainGraph();

	}
}

		
		
