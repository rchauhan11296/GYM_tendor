import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Statement;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Toolkit;

public class Powerlifting implements ActionListener {

	public JFrame PLframe;
	public JFrame PLdietchartframe;
	public JFrame PLexscheduleframe;
	public JFrame PLsupplementsframe;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void Powerliftingfunc() {
		
		PLframe = new JFrame();
		PLframe.setBounds(300, 150, 700, 500);
		PLframe.getContentPane().setLayout(null);
		PLframe.setVisible(true);
		PLframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\pl.jpg")));
		
		JLabel lblPowerliftingProgramme = new JLabel("Powerlifting Programme");
		lblPowerliftingProgramme.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPowerliftingProgramme.setForeground(new Color(210, 105, 30));
		lblPowerliftingProgramme.setBounds(50, 40, 229, 24);
		PLframe.getContentPane().add(lblPowerliftingProgramme);
		
		JButton btnNewButton = new JButton("Diet Chart");
		btnNewButton.setBounds(58, 193, 149, 101);
		PLframe.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JButton btnExerciseSchedule = new JButton("Exercise Schedule");
		btnExerciseSchedule.setBounds(265, 193, 149, 101);
		PLframe.getContentPane().add(btnExerciseSchedule);
		btnExerciseSchedule.addActionListener(this);
		
		JButton btnSupplementation = new JButton("Supplementation");
		btnSupplementation.setBounds(466, 193, 149, 101);
		PLframe.getContentPane().add(btnSupplementation);
		btnSupplementation.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Connection con = null;
        Statement st = null;
        ResultSet rs = null;
		if(e.getActionCommand()=="Diet Chart"){
			
			PLdietchartframe = new JFrame();
			PLdietchartframe.setBounds(200, 70, 979, 627);
			PLdietchartframe.getContentPane();
			PLdietchartframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\powerlifting\\PLdietchart.jpg")));
			PLdietchartframe.setVisible(true);
			
	    }
		if(e.getActionCommand()=="Exercise Schedule"){
			
			PLexscheduleframe = new JFrame();
			PLexscheduleframe.setBounds(200, 70, 979, 627);
			PLexscheduleframe.getContentPane();
			PLexscheduleframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\powerlifting\\PLexschedule.jpg")));
			PLexscheduleframe.setVisible(true);
			
	    }
				
		if(e.getActionCommand()=="Supplementation"){
			
			PLsupplementsframe = new JFrame();
			PLsupplementsframe.setBounds(200, 70, 979, 627);
			PLsupplementsframe.getContentPane();
			PLsupplementsframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\powerlifting\\PLsupplements.jpg")));
			PLsupplementsframe.setVisible(true);
		
       	}

	}	
		
}
