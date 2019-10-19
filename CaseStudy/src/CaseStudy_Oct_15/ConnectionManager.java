package CaseStudy_Oct_15;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import org.omg.CORBA.portable.ValueBase;

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
		Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/product_details","root","");  
		Statement statement = (Statement) con.createStatement();
		if (con != null)
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("not Connected");
		}


		
    JFrame f= new JFrame("LOGIN PAGE");
    
    
    JLabel head;
    head= new JLabel ("RETAIL COMPANY");
    head.setForeground(Color.blue);
    head.setFont(new Font("Serif", Font.BOLD, 30));
    head.setBounds(50,60,300,50);
    f.add(head);
    
    JButton l1= new JButton (" ADMIN LOGIN ");
    l1.setBackground(Color.GREEN);
	l1.setForeground(Color.white);
	l1.setFont(new Font("Serif", Font.BOLD, 20));
	l1.setBounds(60,130,200,30);
	f.add(l1);
	
	JButton l2= new JButton ("  AGENT LOGIN  ");
    l2.setBackground(Color.BLUE);
	l2.setForeground(Color.white);
	l2.setFont(new Font("Serif", Font.BOLD, 20));
	l2.setBounds(60,170,200,30);
	f.add(l2);
	
	JButton l3= new JButton ("  EXIT  ");
    l3.setBackground(Color.RED);
	l3.setForeground(Color.white);
	l3.setFont(new Font("Serif", Font.BOLD, 20));
	l3.setBounds(60,210,200,30);
	f.add(l3);
	
	
				l1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
								f.setVisible(false);
							    JFrame f4 = new JFrame ("ADMIN LOGIN");
							    JLabel user,pass, head1; 
							    
							    head1= new JLabel ("SIGN IN");
							    head1.setForeground(Color.GREEN);
							    head1.setFont(new Font("Serif", Font.BOLD, 50));
							    head1.setBounds(310,80,300,40);
							    f4.add(head1);
							    
								user= new JLabel ("User Name :");
								user.setBounds(250,140,100,30);
								final JTextField atuser =new JTextField();
								atuser.setBounds(350,140,150,30);
								pass= new JLabel ("Password  :");
								pass.setBounds(250,180,100,30);
								final JPasswordField atpass =new JPasswordField();
								atpass.setBounds(350,180,150,30);
								
								
								
								f4.add(user); f4.add(pass);
								f4.add(atuser);f4.add(atpass);
								
								JButton b1= new JButton ("LOGIN");
								b1.setBackground(Color.BLUE);
								b1.setForeground(Color.white);
								b1.setFont(new Font("Serif", Font.BOLD, 20));
								b1.setBounds(350,250,150,30);
								f4.add(b1);
															
								
								
								b1.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										String uname=atuser.getText();
										String upass=atpass.getText();
										int utype=1;
										
										String s= "Select UserName , Password from login where  userName= '"+uname+"' and password= '"+upass+"'  and type= '"+utype+"'";
										System.out.println(s);
										try {
											ResultSet que= statement.executeQuery(s);
											
											
											if (que.next()==true)
												
											{
												
												
												f4.setVisible(false);
												
												JFrame f5 = new JFrame ("PRODUCT DETAILS");
											    JLabel head1, pid,pname, pquan,pprice; 
											    
											    head1= new JLabel ("Enter Product Details");
											    head1.setForeground(Color.GREEN);
											    head1.setFont(new Font("Serif", Font.BOLD, 20));
											    head1.setBounds(200,40,300,40);
											    f5.add(head1);
											    
												pid= new JLabel ("PRODUCT ID :");
												pid.setBounds(200,100,150,30);
												final JTextField tpid =new JTextField();
												tpid.setBounds(350,100,150,30);
												f5.add(pid); f5.add(tpid);
												
												pname= new JLabel ("PRODUCT NAME  :");
												pname.setBounds(200,140,150,30);
												final JTextField tpname =new JTextField();
												tpname.setBounds(350,140,150,30);
												 f5.add(pname); f5.add(tpname);
												 
												pquan= new JLabel ("PRODUCT QUANTITY  :");
												pquan.setBounds(200,180,150,30);
												final JTextField tpquan =new JTextField();
												tpquan.setBounds(350,180,150,30);
											    f5.add(pquan); f5.add(tpquan);
													 
											    pprice= new JLabel ("PRODUCT PRICE  :");
											    pprice.setBounds(200,220,150,30);
												final JTextField tpprice =new JTextField();
												tpprice.setBounds(350,220,150,30);
												f5.add(pprice); f5.add(tpprice);
												
												JButton b1= new JButton ("ADD");
												b1.setBackground(Color.GREEN);
												b1.setForeground(Color.white);
												b1.setFont(new Font("Serif", Font.BOLD, 20));
												b1.setBounds(350,260,150,30);
												f5.add(b1);
												
												JButton b2= new JButton ("INVENTOY");
												b2.setBackground(Color.YELLOW);
												b2.setForeground(Color.white);
												b2.setFont(new Font("Serif", Font.BOLD, 20));
												b2.setBounds(350,300,150,30);
												f5.add(b2);
												
												JButton b3= new JButton ("LOGOUT");
												b3.setBackground(Color.RED);
												b3.setForeground(Color.white);
												b3.setFont(new Font("Serif", Font.BOLD, 10));
												b3.setBounds(370,340,100,20);
												f5.add(b3);
												
												
												b1.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent e) {
												
														
														String npid= tpid.getText();														
														String npname= tpname.getText();
														String npquan= tpquan.getText();
														String npprice= tpprice.getText();													
														
														Statement statement = null;
														try {
															statement = (Statement) con.createStatement();
														} catch (SQLException e1) {
															// TODO Auto-generated catch block
															e1.printStackTrace();
														}
														try {
															statement.executeUpdate ("INSERT INTO products VALUES ('" +npid+"','" +npname+"','" +npquan+"','"+npprice+"')");
														} catch (SQLException e1) {
															// TODO Auto-generated catch block
															e1.printStackTrace();
														}
										
														JOptionPane.showMessageDialog(pid, "Products Added");
														
														tpid.setText(null);
														tpname.setText(null);
														tpquan.setText(null);
														tpprice.setText(null);
														
														
														
														
													}
												});
												
													b2.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent e) {
														
														f5.setVisible(false);
														
														JFrame f6 = new JFrame ("INVENTORY");
													    
														JLabel pid,pne,sqy,ppe,tct;  
														
														pid= new JLabel ("Product_ID");
														pid.setBounds(10,25,150,30); 
														f6.add(pid); 
														pne= new JLabel ("Product_Name");
														pne.setBounds(120,25,150,30); 
														f6.add(pne);
														sqy= new JLabel ("Quantity");
														sqy.setBounds(240,25,150,30); 
														f6.add(sqy);
														ppe= new JLabel ("Price");
														ppe.setBounds(350,25,150,30); 
														f6.add(ppe);
														tct= new JLabel ("Total_Cost");
														tct.setBounds(460,25,150,30); 
														f6.add(tct);
														  
														  
														  
														  
														String sql="SELECT * FROM products";
														ResultSet rs1=null;
														try {
														rs1 = statement.executeQuery(sql);
														} catch (SQLException e1) {
														// TODO Auto-generated catch block
														e1.printStackTrace();
														}
														try {
															int a=0;
														while(rs1.next())
														{
														   String id = rs1.getString("Product_id");
														   String pn = rs1.getString("Product_name");
														   String sq = rs1.getString("Sell_Quantity");
														   String pp = rs1.getString("Price");
														   
														  int isq= Integer.parseInt(sq) ;
														   int ipp= Integer.parseInt(pp);
														   int ttc=isq*ipp;
														   String total=String.valueOf(ttc);
														  
														JLabel lid,lpn,lsq,lpp,ltc;  
														
														
														lid= new JLabel (id);
														lid.setBounds(10,50+a,150,30); 
														f6.add(lid);
														   
														lpn= new JLabel (pn);
														lpn.setBounds(120,50+a,150,30); 
														f6.add(lpn);
														
														lsq= new JLabel (sq);
														lsq.setBounds(240,50+a,150,30); 
														f6.add(lsq);
														
														lpp= new JLabel (pp);
														lpp.setBounds(350,50+a,150,30); 
														f6.add(lpp);
														
														ltc= new JLabel (total);
														ltc.setBounds(460,50+a,150,30); 
														f6.add(ltc);
														
														a=a+30;
														
														JButton b4= new JButton ("BACK");
														b4.setBackground(Color.GRAY);
														b4.setForeground(Color.white);
														b4.setFont(new Font("Serif", Font.BOLD, 10));
														b4.setBounds(500,540,100,20);
														f6.add(b4);
														
														b4.addActionListener(new ActionListener() {
															
															@Override
															public void actionPerformed(ActionEvent e) {
																
																f6.setVisible(false);
																f.setVisible(true);
														   
															
														}
														});
														}
														} catch (SQLException e1) {
														// TODO Auto-generated catch block
														e1.printStackTrace();
														} 
														
														
														
														f6.setSize(600,600);
														f6.setLayout(null);
														f6.setVisible(true);
														
												
													}
													});
													
													b3.addActionListener(new ActionListener() {
														
														@Override
														public void actionPerformed(ActionEvent e) {
															
															f5.setVisible(false);
															f.setVisible(true);
														}
													});
														
												f5.setSize(600,600);
												f5.setLayout(null);
												f5.setVisible(true);
											}
											else
											{
												JOptionPane.showMessageDialog(atuser, "LOGIN FAILED");
											}
											
											atuser.setText(null);
											atpass.setText(null);
											
											
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
											
										}
										
										
										
									}
								});
								
								
						
								f4.setSize(600,600);
								f4.setLayout(null);
								f4.setVisible(true);
								
								
								
										
					}
				});
				
	
			
				l2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
								f.setVisible(false);
							    JFrame f4 = new JFrame ("AGENT LOGIN");
							    JLabel user,pass, head1; 
							    
							    head1= new JLabel ("SIGN IN");
							    head1.setForeground(Color.GREEN);
							    head1.setFont(new Font("Serif", Font.BOLD, 50));
							    head1.setBounds(310,80,300,40);
							    f4.add(head1);
							    
								user= new JLabel ("User Name :");
								user.setBounds(250,140,100,30);
								final JTextField tuser =new JTextField();
								tuser.setBounds(350,140,150,30);
								pass= new JLabel ("Password  :");
								pass.setBounds(250,180,100,30);
								final JPasswordField tpass =new JPasswordField();
								tpass.setBounds(350,180,150,30);
								
								
								
								f4.add(user); f4.add(pass);
								f4.add(tuser);f4.add(tpass);
								
								JButton b1= new JButton ("LOGIN");
								b1.setBackground(Color.BLUE);
								b1.setForeground(Color.white);
								b1.setFont(new Font("Serif", Font.BOLD, 20));
								b1.setBounds(350,250,150,30);
								f4.add(b1);
								
															
								
									b1.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										String uname=tuser.getText();
										String upass=tpass.getText();
										int utype=0;
										
										String s= "Select UserName , Password from login where  userName= '"+uname+"' and password= '"+upass+"' and type= '"+utype+"'";
										System.out.println(s);
										try {
											ResultSet que= statement.executeQuery(s);
											
											
											if (que.next()==true)
												
											{
												f4.setVisible(false);
												JFrame f6 = new JFrame("BUY / SELL");
												
												
												
												
												
												
												
												JLabel pn,bs,pr,qy,tp;
												
												pn= new JLabel ("Product Name :");
												pn.setBounds(150,140,100,30);
												f6.add(pn);
												String sql="SELECT * FROM products";
												ResultSet rs1=null;
												JComboBox pnb=new JComboBox();
											    pnb.setBounds(250,140,100,30);    
											    f6.add(pnb); 
											    
												try {
												rs1 = statement.executeQuery(sql);
												while(rs1.next())
												{
												   
												   String pn1 = rs1.getString("Product_name");
												   pnb.addItem(pn1);
												   
												       
												}
												} catch (SQLException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
												}
											
													
											     
												
											    bs= new JLabel ("Buy / Sell :");
												bs.setBounds(150,180,100,30);
												f6.add(bs);
												
											   
												String bos[]={"Select option","BUY","SELL"};        
											    JComboBox bsb=new JComboBox(bos);    
											    bsb.setBounds(250,180,100,30);    
											    f6.add(bsb);
											    
											    JLabel lprice= new JLabel ("Price");
											    lprice.setBounds(150,220,100,30);
												f6.add(lprice);
												
												JTextField price=new JTextField();
												price.setBounds(250,220,100,30);	
												f6.add(price);
												
												pnb.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent e) {
														
														String pname=(String) pnb.getSelectedItem();
														String sql="SELECT * FROM products where Product_name='"+pname+"'";
														ResultSet rs1=null;
														  
														try {
														rs1 = statement.executeQuery(sql);
														while(rs1.next())
														{
														   
														   String pn1 = rs1.getString("price");
														  price.setText(pn1);
														   
														       
														}
														} catch (SQLException e1) {
														// TODO Auto-generated catch block
														e1.printStackTrace();
														}
													
														
													}
												});
												
												
												qy= new JLabel ("Quantity :");
												qy.setBounds(150,260,100,30);
												f6.add(qy);
												
												JTextField tqy=new JTextField();
												tqy.setBounds(250,260,100,30);	
												f6.add(tqy);
												
												   
												
												tp= new JLabel ("Total price :");
												tp.setBounds(150,300,100,30);
												f6.add(tp);
												
												JTextField ttp=new JTextField();
												ttp.setBounds(250,300,100,30);	
												f6.add(ttp);
												
												
												
												
												tqy.addFocusListener(new FocusListener() {
													
													@Override
													public void focusLost(FocusEvent e) {
														
														int qq=Integer.parseInt(tqy.getText());
														int pp=Integer.parseInt(price.getText());
													     int tt=qq*pp;
													     ttp.setText(""+tt);
														
													}
													
													@Override
													public void focusGained(FocusEvent e) {
														// TODO Auto-generated method stub
														
														
													}
												});
												
												JButton b5= new JButton ("PURCHASE");
												b5.setBackground(Color.GREEN);
												b5.setForeground(Color.white);
												b5.setFont(new Font("Serif", Font.BOLD, 20));
												b5.setBounds(250,350,150,30);
												f6.add(b5);
												
												
												JButton b6= new JButton ("LOGOUT");
												b6.setBackground(Color.RED);
												b6.setForeground(Color.white);
												b6.setFont(new Font("Serif", Font.BOLD, 20));
												b6.setBounds(400,350,150,30);
												f6.add(b6);
												b6.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent e) {
														// TODO Auto-generated method stub
														f6.setVisible(false);
														f4.setVisible(true);
														
													}
												});
												
												f6.setSize(600,600);
												f6.setLayout(null);
												f6.setVisible(true);
												
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
								
							
							
					
							f4.setSize(600,600);
							f4.setLayout(null);
							f4.setVisible(true);
							
							
							
									
				}
			});
	
			
			
	
	

	  
	
	f.setSize(600,600);
	f.setLayout(null);
	f.setVisible(true);


	}



}
