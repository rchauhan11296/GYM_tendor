import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.joda.time.DateTime;
import org.joda.time.Days;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Panel;
import java.awt.SystemColor;

public class prosel extends Login implements ActionListener{

	public JPanel contentPane;
	public JFrame proselframeobj;
	public JTextPane cptxtp;
	public JTextPane usertxtp;
	public String u;
	public JTextPane textPane_2;
	public String currdate;
	public int diff;
	public int nmon;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void proselfunc(String us){
		
			proselframeobj = new JFrame();
			proselframeobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			proselframeobj.setTitle("Programme selection");
			proselframeobj.setBounds(200, 50, 1000, 600);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			proselframeobj.getContentPane().setLayout(null);
			proselframeobj.setVisible(true);
			proselframeobj.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\prosel.jpg")));
			
			
			JLabel lblUser = new JLabel("User :");
			lblUser.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblUser.setBounds(53, 89, 73, 14);
			proselframeobj.getContentPane().add(lblUser);
			
			usertxtp = new JTextPane();
			usertxtp.setBackground(Color.WHITE);
			usertxtp.setForeground(Color.BLACK);
			usertxtp.setFont(new Font("Tahoma", Font.PLAIN, 14));
			usertxtp.setBounds(53, 116, 144, 20);
			proselframeobj.getContentPane().add(usertxtp);   
			
			JButton btnLeaning = new JButton("Fatloss");
			btnLeaning.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnLeaning.setBounds(42, 388, 96, 52);
			proselframeobj.getContentPane().add(btnLeaning);
			btnLeaning.addActionListener(this);							
			
			JButton btnMuscleBuilding = new JButton("Musclebuilding");		
			btnMuscleBuilding.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnMuscleBuilding.setBounds(150, 388, 128, 52);
			proselframeobj.getContentPane().add(btnMuscleBuilding);
			btnMuscleBuilding.addActionListener(this);					
			
			JButton btnPowerlifting = new JButton("Powerlifting");
			btnPowerlifting.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnPowerlifting.setBounds(290, 388, 116, 52);
			proselframeobj.getContentPane().add(btnPowerlifting);
			btnPowerlifting.addActionListener(this);
			
			JLabel lblWantToSwitch = new JLabel("wanna switch to another programme ?");
			lblWantToSwitch.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblWantToSwitch.setBounds(42, 335, 286, 29);
			proselframeobj.getContentPane().add(lblWantToSwitch);
			
			JLabel lblNewLabel = new JLabel("Current programme :");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(53, 167, 165, 23);
			proselframeobj.getContentPane().add(lblNewLabel);
			
			cptxtp = new JTextPane();
			cptxtp.setBackground(Color.WHITE);
			cptxtp.setForeground(Color.BLACK);
			cptxtp.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			cptxtp.setBounds(53, 194, 144, 20);
			proselframeobj.getContentPane().add(cptxtp);
			
			JLabel lblLastFeeSubmitted = new JLabel("Last Fee submitted on");
			lblLastFeeSubmitted.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblLastFeeSubmitted.setBounds(738, 171, 157, 14);
			proselframeobj.getContentPane().add(lblLastFeeSubmitted);
			
			textPane_2 = new JTextPane();
			textPane_2.setBackground(Color.WHITE);
			textPane_2.setForeground(Color.BLACK);
			textPane_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textPane_2.setBounds(761, 194, 106, 20);
			proselframeobj.getContentPane().add(textPane_2);
			
			JButton btnPayFee = new JButton("Fee Submit");
			btnPayFee.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnPayFee.setBounds(761, 324, 106, 23);
			proselframeobj.getContentPane().add(btnPayFee);
			btnPayFee.addActionListener(this);
			
			JLabel lblClickHereTo = new JLabel("Fee to be submitted :");
			lblClickHereTo.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblClickHereTo.setBounds(738, 251, 157, 14);
			proselframeobj.getContentPane().add(lblClickHereTo);
			
			JTextPane feecaltxtp = new JTextPane();
			feecaltxtp.setBackground(Color.WHITE);
			feecaltxtp.setForeground(Color.BLACK);
			feecaltxtp.setFont(new Font("Tahoma", Font.PLAIN, 14));
			feecaltxtp.setBounds(777, 278, 73, 20);
			proselframeobj.getContentPane().add(feecaltxtp);
			
			JButton btnLogout = new JButton("Logout");
			btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnLogout.setBounds(761, 433, 97, 25);
			proselframeobj.getContentPane().add(btnLogout);
			btnLogout.addActionListener(this);
			
			JLabel lblChooseAProgramme = new JLabel("Choose a programme according to you");
			lblChooseAProgramme.setForeground(new Color(0, 0, 128));
			lblChooseAProgramme.setFont(new Font("Narkisim", Font.BOLD, 20));
			lblChooseAProgramme.setBounds(193, 54, 352, 25);
			contentPane.add(lblChooseAProgramme);
			
			SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			currdate=dformat.format(date);
			System.out.println("current date is : "+currdate);
			
			try {
				
				this.u = us;
				System.out.println("username-"+this.u);
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/GYMms","root","root");  
				System.out.println("prosel frame connection established");
				PreparedStatement pst = con.prepareStatement("select prog,username,treadmill,feesd from basicinfo where username = ?");
				pst.setString(1,this.u);
				ResultSet rs = pst.executeQuery();
				if(rs.next()==true){
					cptxtp.setText(rs.getString(1));
					usertxtp.setText(rs.getString(2));
					textPane_2.setText(rs.getString(4));
					System.out.println("treadmill status- "+rs.getString(3));
					String tmvar = rs.getString(3);
					
					String dateStart = rs.getString(4);
					String dateStop = this.currdate;

					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


					try {
					
						DateTime dt1 = new DateTime(format.parse(dateStart));
						DateTime dt2 = new DateTime(format.parse(dateStop));
						this.diff =Days.daysBetween(dt1, dt2).getDays();
						System.out.println(this.diff + " days");
							
					} catch (ParseException e) {	
					e.printStackTrace();
					}

					
					if((this.diff<30)||(this.diff<31)){
						System.out.println("fee already paid");
						feecaltxtp.setText("already paid");
					}
					else{ 
						this.nmon=diff/30;
						System.out.println("value of nmon is "+nmon);	
					}
						
					if(tmvar.equals("yes")){
						// set feecaltxtp to 1500*nmon;
						int calfee = this.nmon*1500;
						String calfeestr = Integer.toString(calfee);
						feecaltxtp.setText(calfeestr);
						JLabel lblNewLabel_1 = new JLabel("don't wanna use treadmill from next month ?");
						lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
						lblNewLabel_1.setBounds(650, 57, 313, 16);
						proselframeobj.getContentPane().add(lblNewLabel_1);
						JButton tmdontusebtn = new JButton("don't use");
						tmdontusebtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
						tmdontusebtn.setBounds(761, 96, 97, 25);
						proselframeobj.getContentPane().add(tmdontusebtn);
						tmdontusebtn.addActionListener(this);
					}
					else{
					//set feecaltxtp to 1000*nmon;
					int calfee = this.nmon*1000;
					String calfeestr = Integer.toString(calfee);
					feecaltxtp.setText(calfeestr);
					JLabel lblNewLabel_2 = new JLabel("wanna use treadmill from next month ?");
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
					lblNewLabel_2.setBounds(650, 57, 313, 16);
					proselframeobj.getContentPane().add(lblNewLabel_2);
					JButton tmusebtn = new JButton("use");
					tmusebtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
					tmusebtn.setBounds(761, 96, 97, 25);
					proselframeobj.getContentPane().add(tmusebtn);
					tmusebtn.addActionListener(this);
					}
				}
			} 
			catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
			}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Fatloss"){
			
			String u1=this.u;
			String cpname = cptxtp.getText();
				
				if(cpname.equals("fatloss")){
				JOptionPane.showMessageDialog(null,"already enrolled in Fatloss");
				
				}
				else{
					
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection(  
						"jdbc:mysql://localhost:3306/GYMms","root","root");  
						System.out.println("prosel frame connection established");
						PreparedStatement pst = con.prepareStatement("update basicinfo set prog='fatloss' where username=?");
						pst.setString(1,u1);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null,"Programme changed to fatloss");
						cptxtp.setText("fatloss");
						
						System.out.println("current date"+currdate);
				}
					catch (SQLException | ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				}
				new FatLoss().FatLossfunc();
		}

		if(e.getActionCommand()=="Musclebuilding"){
			
			String u1=this.u;
			String cpname = cptxtp.getText();
				
				if(cpname.equals("musclebuilding")){
				JOptionPane.showMessageDialog(null,"already enrolled in musclebuilding");
				
				}
				else{
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection(  
						"jdbc:mysql://localhost:3306/GYMms","root","root");  
						System.out.println("prosel frame connection established");
						PreparedStatement pst = con.prepareStatement("update basicinfo set prog='musclebuilding' where username=?");
						pst.setString(1,u1);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null,"program changed to Muscle Building");
						cptxtp.setText("musclebuilding");
						new MuscleBuilding().MuscleBuildingfunc();
						//startedontxtp.setText(CURRENT DATE);
						}
					catch (SQLException | ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
		}
		if(e.getActionCommand()=="Powerlifting"){
			
			String u1=this.u;
			String cpname = cptxtp.getText();
				
				if(cpname.equals("powerlifting")){
				JOptionPane.showMessageDialog(null,"already enrolled in powerlifting");
				
				}
				else{
					try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/GYMms","root","root");  
				System.out.println("prosel frame connection established");
				PreparedStatement pst = con.prepareStatement("update basicinfo set prog='powerlifting' where username=?");
				pst.setString(1,u1);
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"program changed to powerlifting");
				cptxtp.setText("powerlifting");
				new Powerlifting().Powerliftingfunc();
				} 
				catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
					}	
				}
		}
		
		if(e.getActionCommand()=="use"){
			
			String u1 = this.u;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GYMms","root","root"); 
				PreparedStatement pst = con.prepareStatement("update basicinfo set treadmill='yes' where username=?");
				pst.setString(1,u1 );
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"you'll be charged for using treadmill from next month");
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		if(e.getActionCommand()=="don't use"){
			
			String u1 = this.u;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GYMms","root","root"); 
				PreparedStatement pst = con.prepareStatement("update basicinfo set treadmill='no' where username=?");
				pst.setString(1,u1 );
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"treadmill charges are not applicable from next month");
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		if(e.getActionCommand()=="Fee Submit"){
			
			try {
				
				String u1 = this.u;
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GYMms","root","root"); 
				PreparedStatement pst = con.prepareStatement("update basicinfo set feesd=? where username=?");
				pst.setString(1,this.currdate);
				pst.setString(2,u1 );
				pst.executeUpdate();
				textPane_2.setText(this.currdate);
				
				
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Fee Submited");
		}
		
		if (e.getActionCommand()=="Logout"){
			
			System.out.println("logout clicked");
			proselframeobj.dispose();
			new Login().Loginfunc();
			
		}
	}
}