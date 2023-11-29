package com.bankManagementsystem;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener{
	
	JButton login, signup, clear;
	JTextField cardTextField; 
	JPasswordField pinTextField;
	JLabel cardno, pin;
	
	//declaring outside the constructor to use globally
	Login(){
		
		setTitle("Atm Machine");
		
		setLayout(null);// changing the location of icon inside the tab and using setBounds
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		//give image resolution
		Image i2= i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		// can't give Image  in JLabe directly so we create new ImageIcon
		ImageIcon i3=new ImageIcon(i2);
		
		JLabel label=new JLabel(i3);
		// to set image location in the window using setBound 
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		JLabel text=new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		add(text);
		
		cardno=new JLabel("Card No :");
		cardno.setFont(new Font("Raleway", Font.BOLD, 28));
		cardno.setBounds(120, 150, 150, 40);
		add(cardno);
		
		cardTextField=new JTextField();
		cardTextField.setBounds(350, 150, 250, 40);
		cardTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(cardTextField);
		
		pin=new JLabel("Pin :");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 200, 200, 40);
		add(pin); 
	
		//pin.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT)
		
		pinTextField= new JPasswordField();
		pinTextField.setBounds(350, 200, 250, 40);
		pinTextField.setFont(new Font("Ralewy", Font.BOLD, 14));
		add(pinTextField);
		
		login = new JButton("Sign In");
		login.setBounds(350, 300, 100, 30);
		login.setBackground(Color.black);
		login.setForeground(Color.white);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("Clear");
		clear.setBounds(500, 300, 100, 30);
		clear.setBackground(Color.black);
		clear.setForeground(Color.white);
		clear.addActionListener(this);
		add(clear);
		
		signup = new JButton("Sign up");
		signup.setBounds(350, 350, 250, 30);
		signup.setBackground(Color.black);
		signup.setForeground(Color.white);
		signup.addActionListener(this);
		add(signup);
		
		
		//Changing the frame background color using get content to select the whole frame
				//color class to give color
		getContentPane().setBackground(Color.white);
		
		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}
	public void actionPerformed(ActionEvent ae) {
		//overriding using abstract method, abstract 
		if(ae.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
			
		}else if(ae.getSource()==login) {
			Conn conn= new Conn();
			String cardnumber= cardTextField.getText();
			String pinnumber=pinTextField.getText();
			String query="select*from login where cardnumber='"+cardnumber+"'and pin = '"+pinnumber+"'";  
 			try {
				ResultSet rs= conn.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
				}
			}catch(Exception e) {
				System.out.println();
				
			}
		}else if(ae.getSource()==signup) {
			setVisible(false);
			new SignupOne().setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Login();
	}

}
