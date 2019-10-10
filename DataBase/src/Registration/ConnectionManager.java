package Registration;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPasswordField;


public class ConnectionManager {
	
	public static void main (String []args) throws ClassNotFoundException, SQLException
	{
		
	
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");  
		Statement statement = (Statement) con.createStatement();
		if (con != null)
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("not Connected");
		}


		
    JFrame f= new JFrame("FACEBOOK");
    
    f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\fb.png")));
   

   
    
    
    
    
    JLabel head,dia,user,pass;
    
    head= new JLabel ("facebook");
    head.setForeground(Color.blue);
    head.setFont(new Font("Serif", Font.BOLD, 50));
    head.setBounds(50,60,250,40);
    dia= new JLabel ("Facebook helps you connect and share with the people in your life.");
	dia.setBounds(50,100,450,30);
	
	user= new JLabel ("User Name :");
	user.setBounds(450,140,100,30);
	final JTextField tuser =new JTextField();
	tuser.setBounds(550,140,150,30);
	pass= new JLabel ("Password  :");
	pass.setBounds(450,180,100,30);
	final JPasswordField tpass =new JPasswordField();
	tpass.setBounds(550,180,150,30);
	
	
	f.add(head); f.add(dia);f.add(user); f.add(pass);
	f.add(tuser);f.add(tpass);
	
	JButton b1= new JButton ("LOGIN");
	b1.setBackground(Color.BLUE);
	b1.setForeground(Color.white);
	b1.setFont(new Font("Serif", Font.BOLD, 20));
	b1.setBounds(550,250,150,30);
	f.add(b1);
	
	
	JButton b2= new JButton ("CREATE ACCOUNT");
	b2.setBackground(Color.GREEN);
    b2.setForeground(Color.white);
	b2.setFont(new Font("Serif", Font.BOLD, 12));
	b2.setBounds(550,300,150,30);
	f.add(b2);
	
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String uname=tuser.getText();
			String upass=tpass.getText();
			
			String s= "Select UserName , Password from loginpage where  UserName= '"+uname+"' and Password= '"+upass+"'";
			System.out.println(s);
			try {
				ResultSet que= statement.executeQuery(s);
				
				
				if (que.next()==true)
					
				{
					JOptionPane.showMessageDialog(tuser, "LOGIN SUCCESSFULL");
					
				}
				else
				{
					JOptionPane.showMessageDialog(tuser, "LOGIN FAILED");
				}
				
				tuser.setText(null);
				tpass.setText(null);
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			}
			
			
			
		}
	});
	
	
	
	
	
	

	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			f.setVisible(false);
			JFrame f1= new JFrame("FACEBOOK REGISTRATION");
			
			
			JLabel fn,ln,us,pw,repw,mob,ema;
			
			fn= new JLabel ("First Name :");
			fn.setBounds(50,60,100,30);
			final JTextField tfn =new JTextField();
			tfn.setBounds(150,60,150,30);
			ln= new JLabel ("Last Name :");
			ln.setBounds(50,100,100,30);
			final JTextField tln =new JTextField();
			tln.setBounds(150,100,150,30);
			us= new JLabel ("User Name :");
			us.setBounds(50,140,100,30);
			final JTextField tun =new JTextField();
			tun.setBounds(150,140,150,30);
			pw= new JLabel ("Password :");
			pw.setBounds(50,180,100,30);
			final JTextField tpw =new JTextField();
			tpw.setBounds(150,180,150,30);
			repw= new JLabel ("Re-Password :");
			repw.setBounds(50,220,100,30);
			final JTextField trepw =new JTextField();
			trepw.setBounds(150,220,150,30);
			mob= new JLabel ("Mobile No. :");
			mob.setBounds(50,260,100,30);
			final JTextField tmob =new JTextField();
			tmob.setBounds(150,260,150,30);
			tmob.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					
					String npwd=tpw.getText();
					String nrepwd= trepw.getText();
					
					
					if (npwd.equals(nrepwd))
					{
						tmob.requestFocus(true);
						
					}
					else
					{
						tpw.requestFocus(true);
						JOptionPane.showMessageDialog(mob, "Password Mismatch");
					}
					
				}
			});
			
			
			ema= new JLabel ("Email-ID :");
			ema.setBounds(50,300,100,30);
			final JTextField tema =new JTextField();
			tema.setBounds(150,300,150,30);
			f1.add(fn); f1.add(ln);f1.add(us);f1.add(pw);f1.add(repw);f1.add(mob);f1.add(ema);
			f1.add(tfn); f1.add(tln);f1.add(tun);f1.add(tpw);f1.add(trepw);f1.add(tmob);f1.add(tema);
			
			
			

			
			JButton b3= new JButton ("SUBMIT");
			b3.setBackground(Color.BLUE);
			b3.setForeground(Color.white);
			b3.setFont(new Font("Serif", Font.BOLD, 15));
			b3.setBounds(150,360,100,30);
			f1.add(b3);
			
			
			
			JButton b4= new JButton ("BACK");
			b4.setBackground(Color.gray);
			b4.setForeground(Color.white);
			b4.setFont(new Font("Serif", Font.BOLD, 15));
			b4.setBounds(300,360,100,30);
			f1.add(b4);
			
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
			
					
					String nfn= tfn.getText();
					
					String nln= tln.getText();
					
					String nus= tun.getText();
				
					String npw= tpw.getText();
					
					String nrepw= trepw.getText();
					
					String nmob= tmob.getText();
		
					String nema= tema.getText();

					
					Statement statement = null;
					try {
						statement = (Statement) con.createStatement();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						statement.executeUpdate ("INSERT INTO loginpage VALUES ('" +nfn+"','" +nln+"','" +nus+"','"+npw+"','"+nrepw+"','" +nmob+"','"+nema+"')");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	
					JOptionPane.showMessageDialog(ema, "Account Created");
					
					tfn.setText(null);
					tln.setText(null);
					tun.setText(null);
					tpw.setText(null);
					trepw.setText(null);
					tmob.setText(null);
					tema.setText(null);
					
					
					
				}
			});
			
			
			
			
			f1.setSize(800,700);
			f1.setLayout(null);
			f1.setVisible(true);
			
}
});

	  
	
	f.setSize(800,700);
	f.setLayout(null);
	f.setVisible(true);


	}



}
