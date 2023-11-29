package com.bankManagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
@SuppressWarnings("serial")

public class SignupOne extends JFrame implements ActionListener
	{	
	
	long random;
	JTextField nameTextField, FnameTextField, emailTextField, addressTextField,
	cityTextField, stateTextField, pinTextField;
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;
	JLabel formno,  personalDetails;
	
	SignupOne(){
		setLayout(null);
		
		Random ran= new Random();
		random = Math.abs((ran.nextLong()%9999L)+1000L);
		
		//Math.abs is to print only +ve numbers
		formno=new JLabel("Application Form no."+random);
		formno.setFont(new Font("Raleway",Font.BOLD, 38 ));
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		
		personalDetails=new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway",Font.BOLD, 22 ));
		personalDetails.setBounds(290, 80, 400, 30);
		add(personalDetails);
		
		JLabel name =new JLabel("Name");
		name.setFont(new Font("Raleway",Font.BOLD, 22 ));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		nameTextField= new JTextField();
		nameTextField.setFont(new Font("Raieway", Font.BOLD, 14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);
		
		JLabel Fname =new JLabel("Father's Name");
		Fname.setFont(new Font("Raleway",Font.BOLD, 22 ));
		Fname.setBounds(100, 190, 200, 30);
		add(Fname);
		
		FnameTextField = new JTextField();
		FnameTextField.setFont(new Font("Raieway", Font.BOLD, 14));
		FnameTextField.setBounds(300, 190, 400, 30);
		add(FnameTextField);
		
		JLabel dob =new JLabel("Date of Birth");
		dob.setFont(new Font("Raleway",Font.BOLD, 22 ));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		dateChooser=new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		dateChooser.setForeground(Color.BLACK);
		add(dateChooser);
		
		JLabel gender =new JLabel("Gender");
		gender.setFont(new Font("Raleway",Font.BOLD, 22 ));
		gender.setBounds(100, 290, 200, 30);
		add(gender);
		
		male= new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.WHITE);
		add(male);
		
		female= new JRadioButton("Female");
		female.setBounds(400, 290, 120, 30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(female);
		gendergroup.add(male);
		
		JLabel email =new JLabel("Email");
		email.setFont(new Font("Raleway",Font.BOLD, 22 ));
		email.setBounds(100, 340, 200, 30);
		add(email);
		
		emailTextField  = new JTextField();
		emailTextField.setFont(new Font("Raieway", Font.BOLD, 14));
		emailTextField.setBounds(300, 340, 400, 30);
		add(emailTextField);
		
		JLabel martial =new JLabel("Marital Status");
		martial.setFont(new Font("Raleway",Font.BOLD, 22 ));
		martial.setBounds(100, 390, 200, 30);
		add(martial);
		
		married= new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.WHITE);
		add(married);
		
		unmarried= new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 100, 30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		other= new JRadioButton("other");
		other.setBounds(630, 390, 100, 30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup matrialgroup=new ButtonGroup();
		matrialgroup.add(married);
		matrialgroup.add(unmarried);
		matrialgroup.add(other);
		
		JLabel address =new JLabel("Address");
		address.setFont(new Font("Raleway",Font.BOLD, 22 ));
		address.setBounds(100, 440, 200, 30);
		add(address);
		
		addressTextField  = new JTextField();
		addressTextField.setFont(new Font("Raieway", Font.BOLD, 14));
		addressTextField.setBounds(300, 440, 400, 30);
		add(addressTextField);
		
		
		JLabel city =new JLabel("City");
		city.setFont(new Font("Raleway",Font.BOLD, 22 ));
		city.setBounds(100, 490, 200, 30);
		add(city);
		
		cityTextField  = new JTextField();
		cityTextField.setFont(new Font("Raieway", Font.BOLD, 14));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);
		
		JLabel state =new JLabel("State");
		state.setFont(new Font("Raleway",Font.BOLD, 22 ));
		state.setBounds(100, 540, 200, 30);
		add(state);
		
		stateTextField  = new JTextField();
		stateTextField.setFont(new Font("Raieway", Font.BOLD, 14));
		stateTextField.setBounds(300, 540, 400, 30);
		add(stateTextField);
		
		JLabel pincode =new JLabel("Pincode");
		pincode.setFont(new Font("Raleway",Font.BOLD, 22 ));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);
		
		pinTextField  = new JTextField();
		pinTextField.setFont(new Font("Raieway", Font.BOLD, 14));
		pinTextField.setBounds(300, 590, 400, 30);
		add(pinTextField);
		
		next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		
		getContentPane().setBackground(Color.white);

		setSize(850, 800);
		setLocation(350,10);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		String formno= " "+random;
		String name = nameTextField.getText();
		String Fname= FnameTextField.getText();
		String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();	
		String gender= null;
		if(male.isSelected()) {
			gender= "Male";
			
		}else if(female.isSelected()){
			gender= "Female";
			
		}
		
		String email=emailTextField.getText();
		String matrial=null;
		if(married.isSelected()) {
			matrial="Married";
		}else if (unmarried.isSelected()) {
			matrial="Unmarried";
		}else if(other.isSelected()){
			matrial="others";
		}
		String address= addressTextField.getText();
		String city= cityTextField.getText();
		String state= stateTextField.getText();
		String pin= pinTextField.getText();
		
		try {
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}
			if(city.equals("")) {
			JOptionPane.showMessageDialog(null,"City Need to filled");	
			}
				else {
				Conn C= new Conn();
				String query="insert into signin values('"+formno+"' ,'"+name+"' ,'"+Fname+"' ,'"+dob+"' ,'"+gender+"' ,'"+email+"' ,'"+matrial+"' ,'"+address+"' ,'"+city+"' ,'"+pin+"' ,'"+state+"')";                       
				C.s.executeUpdate(query);
				
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	} 
	
	public static void main(String[] args) {

		SignupOne s =new SignupOne();
	}

}
