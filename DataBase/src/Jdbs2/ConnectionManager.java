package Jdbs2;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPasswordField;


public class ConnectionManager {
	public static void main (String []args) throws ClassNotFoundException, SQLException
	{

	
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");  
	
	if (con != null)
	{
		System.out.println("Connected");
	}
	else
	{
		System.out.println("not Connected");
	}
	
	
	
	
JFrame f= new JFrame("WELCOME TO LOGIN PAGE");
	
	JLabel us,pw,repw,ema;
	
	
	us= new JLabel ("User Name :");
	us.setBounds(50,100,100,30);
	final JTextField tun =new JTextField();
	tun.setBounds(150,100,150,30);
	
	pw= new JLabel ("Password :");
	pw.setBounds(50,140,100,30);
	final JPasswordField tpw =new JPasswordField();
	tpw.setBounds(150,140,150,30);
	
	repw= new JLabel ("Re-Password :");
	repw.setBounds(50,180,100,30);
	final JPasswordField trepw =new JPasswordField();
	trepw.setBounds(150,180,150,30);
	
	ema= new JLabel ("Email-ID :");
	ema.setBounds(50,220,100,30);
	final JTextField tema =new JTextField();
	tema.setBounds(150,220,150,30);
	
	f.add(us);f.add(pw);f.add(repw);f.add(ema);
	f.add(tun);f.add(tpw);f.add(trepw);f.add(tema);
	
	
	JButton b= new JButton ("SUBMIT");
	b.setBounds(150,260,80,30);
	f.add(b);
	
	b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JLabel ous,opw,orepw,oema;
			
		
			ous= new JLabel ();
			ous.setBounds(50,330,200,30);
			f.add(ous);
			String nus= tun.getText();
			ous.setText("User Name : "+nus);
			
			opw= new JLabel ();
			opw.setBounds(50,350,200,30);
			f.add(opw);
			String npw= tpw.getText();
			opw.setText("Password : "+npw);
			
			orepw= new JLabel ();
			orepw.setBounds(50,370,200,30);
			f.add(orepw);
			String nrepw= trepw.getText();
			orepw.setText("Re-Password : "+nrepw);
			
			
			oema= new JLabel ();
			oema.setBounds(50,390,200,30);
			f.add(oema);
			String nema= tema.getText();
			oema.setText("Email-ID : "+nema);
			

			Statement statement = null;
			try {
				statement = (Statement) con.createStatement();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				statement.executeUpdate ("INSERT INTO loginpage VALUES ('" +nus+"','"+npw+"','"+nrepw+"','"+nema+"')");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
						
		}
	});
	
	
	
	  
	
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
		
	
	
	
	
	
	
	

	}



}
