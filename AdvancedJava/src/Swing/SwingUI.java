package Swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPasswordField;


public class SwingUI {
	
public  static void main (String []args)
{
	JFrame f= new JFrame("WELCOME TO LOGIN PAGE");
	
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
	final JPasswordField tpw =new JPasswordField();
	tpw.setBounds(150,180,150,30);
	repw= new JLabel ("Re-Password :");
	repw.setBounds(50,220,100,30);
	final JPasswordField trepw =new JPasswordField();
	trepw.setBounds(150,220,150,30);
	mob= new JLabel ("Mobile No. :");
	mob.setBounds(50,260,100,30);
	final JTextField tmob =new JTextField();
	tmob.setBounds(150,260,150,30);
	ema= new JLabel ("Email-ID :");
	ema.setBounds(50,300,100,30);
	final JTextField tema =new JTextField();
	tema.setBounds(150,300,150,30);
	f.add(fn); f.add(ln);f.add(us);f.add(pw);f.add(repw);f.add(mob);f.add(ema);
	f.add(tfn); f.add(tln);f.add(tun);f.add(tpw);f.add(trepw);f.add(tmob);f.add(tema);
	
	
	JButton b= new JButton ("SUBMIT");
	b.setBounds(150,340,80,30);
	f.add(b);
	
	b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JLabel ofn,oln,ous,opw,orepw,omob,oema;
			
			ofn= new JLabel ();
			ofn.setBounds(50,390,200,30);
			f.add(ofn);
			String nfn= tfn.getText();
			ofn.setText("First Name : "+nfn);
			
			oln= new JLabel ();
			oln.setBounds(50,410,200,30);
			f.add(oln);
			String nln= tln.getText();
			oln.setText("Last Name : "+nln);
			
			ous= new JLabel ();
			ous.setBounds(50,430,200,30);
			f.add(ous);
			String nus= tun.getText();
			ous.setText("User Name : "+nus);
			
			opw= new JLabel ();
			opw.setBounds(50,450,200,30);
			f.add(opw);
			String npw= tpw.getText();
			opw.setText("Password : "+npw);
			
			orepw= new JLabel ();
			orepw.setBounds(50,470,200,30);
			f.add(orepw);
			String nrepw= trepw.getText();
			orepw.setText("Re-Password : "+nrepw);
			
			omob= new JLabel ();
			omob.setBounds(50,490,200,30);
			f.add(omob);
			String nmob= tmob.getText();
			omob.setText("Mobile No. : "+nmob);
			
			oema= new JLabel ();
			oema.setBounds(50,510,200,30);
			f.add(oema);
			String nema= tema.getText();
			oema.setText("Email-ID : "+nema);
						
		}
	});
	
	
	
	  
	
	f.setSize(800,800);
	f.setLayout(null);
	f.setVisible(true);
	
}
}
