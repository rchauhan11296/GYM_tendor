 import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Statement;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FatLoss implements ActionListener{
	
	public JFrame FatLossFrameobj;
	public JFrame FLdietchartframe;
	public JFrame FLexscheduleframe;
	public JFrame FLsupplementsframe;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void FatLossfunc()
	{
		FatLossFrameobj = new JFrame();
		FatLossFrameobj.setBounds(300, 150, 700, 500);
		FatLossFrameobj.getContentPane().setLayout(null);
		FatLossFrameobj.setVisible(true);
		FatLossFrameobj.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\fl.jpg")));
		
		JLabel lblLeaningProgramme = new JLabel("Fat Loss Programme");
		lblLeaningProgramme.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLeaningProgramme.setForeground(new Color(0, 128, 0));
		lblLeaningProgramme.setBounds(43, 35, 245, 31);
		FatLossFrameobj.getContentPane().add(lblLeaningProgramme);
		
		JButton btnDietChart = new JButton("Diet Chart");
		btnDietChart.setBounds(50, 180, 145, 100);
		FatLossFrameobj.getContentPane().add(btnDietChart);
		btnDietChart.addActionListener(this);
		
		JButton btnExerciseSchedule = new JButton("Exercise Schedule");
		btnExerciseSchedule.setBounds(234, 180, 176, 100);
		FatLossFrameobj.getContentPane().add(btnExerciseSchedule);
		btnExerciseSchedule.addActionListener(this);
		
		JButton btnSupplementation = new JButton("Supplementation");
		btnSupplementation.setBounds(445, 180, 134, 100);
		FatLossFrameobj.getContentPane().add(btnSupplementation);
		btnSupplementation.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="Diet Chart"){
			
			FLdietchartframe = new JFrame();
			FLdietchartframe.setBounds(200, 70, 650, 300);
			FLdietchartframe.getContentPane();
			FLdietchartframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\powerlifting\\PLdietchart.jpg")));
			FLdietchartframe.setVisible(true);
			
		}
		 if (e.getActionCommand()=="Exercise Schedule"){
			 
			FLexscheduleframe = new JFrame();
			FLexscheduleframe.setBounds(200, 70, 979, 627);
			FLexscheduleframe.getContentPane();
			FLexscheduleframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\fatloss\\FLexschedule.jpg")));
			FLexscheduleframe.setVisible(true);
			 
		 }
			
		if (e.getActionCommand()=="Supplementation"){
				
			FLsupplementsframe = new JFrame();
			FLsupplementsframe.setBounds(200, 70, 979, 627);
			FLsupplementsframe.getContentPane();
			FLsupplementsframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\fatloss\\FLsupplements.jpg")));
			FLsupplementsframe.setVisible(true);
			
		}
}
}

