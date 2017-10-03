import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Statement;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class MuscleBuilding implements ActionListener{
	
	public JFrame MBframe;
	public JFrame MBdietchartframe;
	public JFrame MBexscheduleframe;
	public JFrame MBsupplementsframe;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void MuscleBuildingfunc() {
		
		MBframe = new JFrame();
		MBframe.setBounds(300, 150, 700, 500);
		MBframe.getContentPane().setLayout(null);
		MBframe.setVisible(true);
		MBframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\mg.jpg")));
		
		JLabel lblNewLabel = new JLabel("MuscleBuilding Programme");
		lblNewLabel.setForeground(new Color(0, 206, 209));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(50, 40, 246, 21);
		MBframe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Diet Chart");
		btnNewButton.setBounds(50, 164, 154, 100);
		MBframe.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JButton btnExerciseSchedule = new JButton("Exercise Schedule");
		btnExerciseSchedule.setBounds(258, 164, 154, 100);
		MBframe.getContentPane().add(btnExerciseSchedule);
		btnExerciseSchedule.addActionListener(this);
		
		JButton btnSupplementation = new JButton("Supplementation");
		btnSupplementation.setBounds(468, 164, 154, 100);
		MBframe.getContentPane().add(btnSupplementation);
		btnSupplementation.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="Diet Chart"){
			
			MBdietchartframe = new JFrame();
			MBdietchartframe.setBounds(200, 70, 979, 627);
			MBdietchartframe.getContentPane();
			MBdietchartframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\musclebuilding\\MBdietchart.jpg")));
			MBdietchartframe.setVisible(true);
			
		}
		if(e.getActionCommand()=="Exercise Schedule"){
			
			MBexscheduleframe = new JFrame();
			MBexscheduleframe.setBounds(220, 120, 800, 500);
			MBexscheduleframe.getContentPane();
			MBexscheduleframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\musclebuilding\\MBexschedule.jpg")));
			MBexscheduleframe.setVisible(true);
			
	        		}
		if(e.getActionCommand()=="Supplementation"){
			
			MBsupplementsframe = new JFrame();
			MBsupplementsframe.setBounds(220, 120, 800, 500);
			MBsupplementsframe.getContentPane();
			MBsupplementsframe.setContentPane(new JLabel(new ImageIcon("C:\\Users\\deepanshu\\Desktop\\GYMms\\musclebuilding\\MBsupplements.jpg")));
			MBsupplementsframe.setVisible(true);
		
       		}

}
}
