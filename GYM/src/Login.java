import java.awt.EventQueue;
import java.io.*;


import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import org.joda.time.DateTime;
import org.joda.time.Days;
import java.awt.Font;

public class Login implements ActionListener{

	public JFrame loginframeobj;
	public JTextField LUserNametxtf;
	public JTextField UserNametxtf;
	public JTextField LPasswordtxtf;
	public JTextField Mobiletxtf;
	
	public JPasswordField Passwordtxtf;
	public JTextField feesdtxtf;
	public JTextField Progtxtf;
	public JTextField tmtxtf;
	public JTextPane feepaidtxtp;
	private JTextField txtEnterUsername;
	public int Ldiff;
	public String Lcurrdate;
	
	public String user;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void Loginfunc() {
		
		loginframeobj = new JFrame();
		loginframeobj.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		loginframeobj.setTitle("Welcome");
		loginframeobj.setBounds(200, 50, 1000, 600);
		loginframeobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginframeobj.getContentPane().setLayout(null);
		loginframeobj.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\9.jpg")));
		
		JLabel lblUserName = new JLabel("UserName");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setBounds(62, 132, 77, 14);
		loginframeobj.getContentPane().add(lblUserName);
		
		LUserNametxtf = new JTextField();
		LUserNametxtf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LUserNametxtf.setBounds(149, 129, 103, 20);
		loginframeobj.getContentPane().add(LUserNametxtf);
		LUserNametxtf.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(62, 181, 77, 14);
		loginframeobj.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(162, 223, 77, 23);
		loginframeobj.getContentPane().add(btnLogin);
		btnLogin.addActionListener(this);                // Action listener added to login button
		
		JLabel lblNewUser = new JLabel("New user ? Get Started here !");
		lblNewUser.setForeground(Color.WHITE);
		lblNewUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewUser.setBounds(417, 61, 181, 14);
		loginframeobj.getContentPane().add(lblNewUser);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSignup.setBounds(521, 442, 86, 23);
		loginframeobj.getContentPane().add(btnSignup);
		btnSignup.addActionListener(this);				// Action listener added to signup button
		
		UserNametxtf = new JTextField();
		UserNametxtf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		UserNametxtf.setBounds(510, 129, 103, 20);
		loginframeobj.getContentPane().add(UserNametxtf);
		UserNametxtf.setColumns(10);
		
		LPasswordtxtf = new JPasswordField();
		LPasswordtxtf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LPasswordtxtf.setBounds(149, 178, 103, 20);
		loginframeobj.getContentPane().add(LPasswordtxtf);
	
		
		Mobiletxtf = new JTextField();
		Mobiletxtf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Mobiletxtf.setColumns(10);
		Mobiletxtf.setBounds(510, 272, 103, 20);
		loginframeobj.getContentPane().add(Mobiletxtf);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(417, 132, 69, 14);
		loginframeobj.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setForeground(Color.WHITE);
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword_1.setBounds(428, 181, 58, 14);
		loginframeobj.getContentPane().add(lblPassword_1);
		
		JLabel lblAreaCode = new JLabel("Programme");
		lblAreaCode.setForeground(Color.WHITE);
		lblAreaCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAreaCode.setBounds(417, 227, 86, 14);
		loginframeobj.getContentPane().add(lblAreaCode);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setForeground(Color.WHITE);
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobile.setBounds(445, 275, 41, 14);
		loginframeobj.getContentPane().add(lblMobile);
		
		JLabel lblTreadmillyesno = new JLabel("Treadmill (yes/no)");
		lblTreadmillyesno.setForeground(Color.WHITE);
		lblTreadmillyesno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTreadmillyesno.setBounds(366, 325, 120, 14);
		loginframeobj.getContentPane().add(lblTreadmillyesno);
		
		Passwordtxtf = new JPasswordField();
		Passwordtxtf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Passwordtxtf.setBounds(510, 178, 103, 20);
		loginframeobj.getContentPane().add(Passwordtxtf);
		
		feesdtxtf = new JTextField();
		feesdtxtf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		feesdtxtf.setBounds(510, 376, 103, 20);
		loginframeobj.getContentPane().add(feesdtxtf);
		feesdtxtf.setColumns(10);
		
		JLabel lblDateOfJoining = new JLabel("Fee paid on:");
		lblDateOfJoining.setForeground(Color.WHITE);
		lblDateOfJoining.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateOfJoining.setBounds(405, 379, 81, 14);
		loginframeobj.getContentPane().add(lblDateOfJoining);
		
		JLabel lblEg = new JLabel("yyyy-mm-dd");
		lblEg.setForeground(Color.GRAY);
		lblEg.setBounds(510, 397, 80, 14);
		loginframeobj.getContentPane().add(lblEg);
		
		Progtxtf = new JTextField();
		Progtxtf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Progtxtf.setBounds(510, 224, 103, 20);
		loginframeobj.getContentPane().add(Progtxtf);
		Progtxtf.setColumns(10);
		
		tmtxtf = new JTextField();
		tmtxtf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tmtxtf.setBounds(510, 322, 103, 20);
		loginframeobj.getContentPane().add(tmtxtf);
		tmtxtf.setColumns(10);
		
		JLabel lblFindFeeDetails = new JLabel("Find fee details of users (enter username)");
		lblFindFeeDetails.setForeground(Color.WHITE);
		lblFindFeeDetails.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFindFeeDetails.setBounds(62, 332, 298, 14);
		loginframeobj.getContentPane().add(lblFindFeeDetails);
		
		txtEnterUsername = new JTextField();
		txtEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterUsername.setBounds(62, 361, 120, 20);
		loginframeobj.getContentPane().add(txtEnterUsername);
		txtEnterUsername.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.setBounds(200, 360, 92, 23);
		loginframeobj.getContentPane().add(btnSearch);
		btnSearch.addActionListener(this);
		
		JLabel lblFeePaid = new JLabel("Fee Paid :");
		lblFeePaid.setForeground(Color.WHITE);
		lblFeePaid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFeePaid.setBounds(92, 403, 69, 14);
		loginframeobj.getContentPane().add(lblFeePaid);
		
		feepaidtxtp = new JTextPane();
		feepaidtxtp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		feepaidtxtp.setForeground(new Color(255, 255, 255));
		feepaidtxtp.setBackground(Color.GRAY);
		feepaidtxtp.setBounds(162, 397, 57, 20);
		loginframeobj.getContentPane().add(feepaidtxtp);
		
		JButton feesbtn = new JButton("submitted");
		feesbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		feesbtn.setBounds(265, 441, 113, 25);
		loginframeobj.getContentPane().add(feesbtn);
		feesbtn.addActionListener(this);
		
		JButton feepbtn = new JButton("pending");
		feepbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		feepbtn.setBounds(265, 479, 113, 25);
		loginframeobj.getContentPane().add(feepbtn);
		feepbtn.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("List of users (fee submitted) ->");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(62, 445, 204, 16);
		loginframeobj.getContentPane().add(lblNewLabel_1);
		
		JLabel lblListOfUsers = new JLabel("List of users (fee pending) ->");
		lblListOfUsers.setForeground(Color.WHITE);
		lblListOfUsers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblListOfUsers.setBounds(62, 483, 190, 16);
		loginframeobj.getContentPane().add(lblListOfUsers);
		
		SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		this.Lcurrdate=dformat.format(date);
		System.out.println("current date is : "+this.Lcurrdate);
		
		loginframeobj.setVisible(true);
		
	}
	
	public int dateLdiff(String Startdate, String Stopdate){
			
			String dateStart = Startdate;
			String dateStop = this.Lcurrdate;

			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

			try {
			
				DateTime dt1 = new DateTime(format.parse(dateStart));
				DateTime dt2 = new DateTime(format.parse(dateStop));
				this.Ldiff =Days.daysBetween(dt1, dt2).getDays();
				System.out.println(this.Ldiff + " days");
					
			} catch (ParseException e) {	
			e.printStackTrace();
			}
			
			return Ldiff;

		}
	

	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand()=="Login"){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/GYMms","root","root");  
				System.out.println("Connection established");
				PreparedStatement pst = con.prepareStatement("select username,password from basicinfo where username = ? and password = ?");
				pst.setString(1, LUserNametxtf.getText());
				pst.setString(2, LPasswordtxtf.getText());
				ResultSet rs = pst.executeQuery();
					if(rs.next()==true){
						JOptionPane.showMessageDialog(null,"access granted !");
						this.user = LUserNametxtf.getText();
						loginframeobj.dispose();
						new prosel().proselfunc(this.user);
					}
					else{
						JOptionPane.showMessageDialog(null,"invalid username or password! please try again");
					}
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getActionCommand()=="SignUp"){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/GYMms","root","root");  
				System.out.println("Connection established");
				PreparedStatement pst = con.prepareStatement("INSERT INTO basicinfo VALUES (?,?,?,?,?,?)");
				pst.setString(1, UserNametxtf.getText());
				pst.setString(2, Passwordtxtf.getText());
				pst.setString(3, Progtxtf.getText());
				pst.setString(4, Mobiletxtf.getText());
				pst.setString(5, tmtxtf.getText());
				pst.setString(6, feesdtxtf.getText());
				pst.executeUpdate();
				System.out.println("Inserted records into the table...");
				this.user = UserNametxtf.getText();
				loginframeobj.dispose();
				new prosel().proselfunc(this.user);
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}   
		} 
		if (e.getActionCommand()=="Search"){
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/GYMms","root","root");  
				PreparedStatement pst = con.prepareStatement("select feesd from basicinfo where username = ?");
				pst.setString(1,txtEnterUsername.getText());
				ResultSet rs = pst.executeQuery();
					if(rs.next()==true){	
						
						if ( dateLdiff(rs.getString(1),this.Lcurrdate)<30){
						feepaidtxtp.setText("yes");
						System.out.println(txtEnterUsername.getText() + "fee paid: yes");
						}
						else{
						feepaidtxtp.setText("no");
						System.out.println(txtEnterUsername.getText() + "fee paid: no");
						}
					}
					else{
						JOptionPane.showMessageDialog(null,"invalid info");
					}
					
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	if (e.getActionCommand()=="submitted"){
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/GYMms","root","root");
				Statement st = (Statement) con.createStatement();
				ResultSet rs = st.executeQuery("select username,feesd from basicinfo");
					
					PrintWriter pw = new PrintWriter("C:\\users\\deepanshu\\desktop\\gym fee submited.txt");
					String Uline;
					int count=0;
					while (rs.next()==true){
						if(dateLdiff(rs.getString(2),this.Lcurrdate)<30){
							
							Uline = rs.getString(1);
							pw.println(Uline);
							System.out.println(Uline);
							count++;
						}	
					}
					pw.flush();
					pw.close();
					System.out.println("total users who submitted their fee are : "+count);
					
					JOptionPane.showMessageDialog(null, "List created");
				
			} catch (FileNotFoundException | ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
			
		}  
		if (e.getActionCommand()=="pending"){
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/GYMms","root","root");
				Statement st = (Statement) con.createStatement();
				ResultSet rs = st.executeQuery("select username,feesd from basicinfo");
					
					PrintWriter pw = new PrintWriter("C:\\users\\deepanshu\\desktop\\gym fee pending.txt");
					String Uline;
					int count=0;
					while (rs.next()==true){
						if(dateLdiff(rs.getString(2),this.Lcurrdate)>30){
							
							Uline = rs.getString(1);
							pw.println(Uline);
							System.out.println(Uline);
							count++;
						}	
					}
					pw.flush();
					pw.close();
					System.out.println("total users with pending fee are : "+count);
					
					JOptionPane.showMessageDialog(null, "List created");
				
			} catch (FileNotFoundException | ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
				}
	
		}
	}
	