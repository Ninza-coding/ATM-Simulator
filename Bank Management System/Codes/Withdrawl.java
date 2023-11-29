package com.bankManagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;

public class Withdrawl extends JFrame implements ActionListener {
	
	JTextField amount;
	JButton withdrawl, back;
	String pinnumber;
	Withdrawl(String pinnumber){
		
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 =new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text= new JLabel("Enter the amount you want to withdraw");
		text.setForeground(Color.white);
		text.setFont(new Font("Systeme", Font.BOLD, 16));
		text.setBounds(175, 300, 400, 20);
		image.add(text);
		
		amount=new JTextField();
		amount.setFont(new Font("Raleway", Font.BOLD, 22));
		amount.setBounds(175, 330, 320, 20);
		image.add(amount);
		
		withdrawl= new JButton("Withdrawl");
		withdrawl.setBounds(355, 485, 150, 30);
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		back= new JButton("Back");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		
		setSize(900, 900);
		setLocation(300, 0);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==withdrawl) {
		
			String number= amount.getText();
			Date date=new Date();
			
			if(number.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to withdrwal");
			}else {
				Conn conn= new Conn();
				String query="insert into bank values('"+pinnumber+"', '"+date+"','withdrwa','"+number+"')";
				try {
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs"+number+"Withdrawl Sucessfuly");
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
		else if(ae.getSource()==back) {
			
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
			
		}
	}
	public static void main(String[] args) {
		
		new Withdrawl("");
	}

}