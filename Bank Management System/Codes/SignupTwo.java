package com.bankManagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
@SuppressWarnings("serial")

public class SignupTwo extends JFrame implements ActionListener
	{	
	
	JTextField pantext, aadhartext;
	JButton next;

	JRadioButton syes, sno, eyes, eno;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;
	JLabel additionaldetails;
	JComboBox religion, category, education, income, occupation;
	String formno;
	
	SignupTwo(String formno){
		this.formno=formno;
		setLayout(null);
		
		setTitle("New Account Application-Page 2");
		
		
		additionaldetails =new JLabel("Page 2: Additional Details");
		additionaldetails.setFont(new Font("Raleway",Font.BOLD, 22 ));
		additionaldetails.setBounds(290, 80, 400, 30);
		add(additionaldetails);
		
		JLabel name =new JLabel("Religion :");
		name.setFont(new Font("Raleway",Font.BOLD, 22 ));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		String vaiReligion[]={"Hindu", "Muslim", "Sikh", "Christian", "Others"};
		religion=new JComboBox(vaiReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.white);
		add(religion);
		
		JLabel Fname =new JLabel("Category :");
		Fname.setFont(new Font("Raleway",Font.BOLD, 22 ));
		Fname.setBounds(100, 190, 200, 30);
		add(Fname);
		
		String vaiCategory[]= {"General", "OBC", "SC", "ST", "Others"};
		category= new JComboBox(vaiCategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.white);
		add(category);
		
		JLabel dob =new JLabel("Income :");
		dob.setFont(new Font("Raleway",Font.BOLD, 22 ));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		String vaiincome[]= {"Null", "<1,50,00", "2,50,000", "5,00,000", "Upto 10,00,000"};
		income= new JComboBox(vaiincome);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.white);
		add(income);
		
		JLabel educational =new JLabel("Eduational");
		educational.setFont(new Font("Raleway",Font.BOLD, 22 ));
		educational.setBounds(100, 290, 200, 30);
		add(educational);
		
		JLabel qualificatuion =new JLabel("Qulifaication :");
		qualificatuion.setFont(new Font("Raleway",Font.BOLD, 22 ));
		qualificatuion.setBounds(100, 315, 200, 30);
		add(qualificatuion);
		
		String EdualtionVaules[]= {"Non-Graduate", "Graduate", "Post-Gradute", "Doctrate", "Others"};
		education= new JComboBox(EdualtionVaules);
		education.setBounds(300, 315, 400, 30);
		education.setBackground(Color.white);
		add(education);
		
		JLabel soccupation =new JLabel("Occupation :");
		soccupation.setFont(new Font("Raleway",Font.BOLD, 22 ));
		soccupation.setBounds(100, 390, 200, 30);
		add(soccupation);
		
		String OccupationVaules[]= {"Salaried", "Self-Employed", "Bussiness", "Student", "Others"};
		occupation = new JComboBox(OccupationVaules);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.white);
		add(occupation);
		
		JLabel pan =new JLabel("PAN No.:");
		pan.setFont(new Font("Raleway",Font.BOLD, 22 ));
		pan.setBounds(100, 440, 200, 30);
		add(pan);
		
		pantext  = new JTextField();
		pantext.setFont(new Font("Raieway", Font.BOLD, 14));
		pantext.setBounds(300, 440, 400, 30);
		add(pantext);
		
		
		JLabel aadhar =new JLabel("Aadhar no. :");
		aadhar.setFont(new Font("Raleway",Font.BOLD, 22 ));
		aadhar.setBounds(100, 490, 200, 30);
		add(aadhar);
		
		aadhartext= new JTextField();
		aadhartext.setFont(new Font("Raieway", Font.BOLD, 14));
		aadhartext.setBounds(300, 490, 400, 30);
		add(aadhartext);
		
		JLabel senior =new JLabel("Senior citizen :");
		senior.setFont(new Font("Raleway",Font.BOLD, 22 ));
		senior.setBounds(100, 540, 200, 30);
		add(senior);
		
		syes= new JRadioButton("Yes");
		syes.setBounds(300,540,100,30);
		syes.setBackground(Color.white);
		add(syes);
		
		sno= new JRadioButton("No");
		sno.setBounds(400,540,100,30);
		sno.setBackground(Color.white);
		add(sno);
		
		ButtonGroup seniorgroup=new ButtonGroup();
		seniorgroup.add(syes);
		seniorgroup.add(sno);
		
		JLabel Existacc =new JLabel("Existing Acounts :");
		Existacc.setFont(new Font("Raleway",Font.BOLD, 22 ));
		Existacc.setBounds(100, 590, 200, 30);
		add(Existacc);
		
		eyes= new JRadioButton("Yes");
		eyes.setBounds(300,590,100,30);
		eyes.setBackground(Color.white);
		add(eyes);
		
		eno= new JRadioButton("No");
		eno.setBounds(400,590,100,30);
		eno.setBackground(Color.white);
		add(eno);
		
		
		
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
		
		String sreligion =(String) religion.getSelectedItem();
		String scategory= (String) category.getSelectedItem();
		String sincome=(String) income.getSelectedItem();
		String seducation=(String) education.getSelectedItem();
		String soccupation=(String) occupation.getSelectedItem();

		
		
		
		String senior= null;
		if(syes.isSelected()) {
			senior= "Yes";
			
		}else if(sno.isSelected()){
			senior= "No";
			
		}
		
		String Existacc=null;
		if(eyes.isSelected()) {
			Existacc="Yes";
		}else if (eno.isSelected()) {
			Existacc="NO";
		}
		
		String pan= pantext.getText();
		String aadhar= aadhartext.getText();
		
		try {
				Conn C= new Conn();
				String query="insert into signuptwo values('"+formno+"' ,'"+sreligion+"' ,'"+scategory+"' ,'"+sincome+"','"+seducation+"' ,'"+soccupation+"' ,'"+pan+"' ,'"+aadhar+"' ,'"+senior+"' ,'"+Existacc+"')";                       
				C.s.executeUpdate(query);																					
			
				setVisible(false);
				new SignupThree(formno).setVisible(true);
				
		}catch (Exception e) {
			System.out.println(e);
		}
		
	} 
	
	public static void main(String[] args) {

		new SignupTwo("");
	}

}

