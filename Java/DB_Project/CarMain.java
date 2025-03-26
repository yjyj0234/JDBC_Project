package day0325;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class CarMain extends JFrame {
	CarImage ci=new CarImage();
	DefaultTableModel model;
	JTable table;
	Container cp;
	JButton btn1,btn2;
	
	//생성자
	public CarMain(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(200, 100, 1300, 700);		
		cp=this.getContentPane();
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(245,245,245));		
		initDesign();
		
		this.setVisible(true);	
	}
	
	public void initDesign()
	{
		ci.carImage();
		ci.setBounds(20, 20, 240, 160);
	
		this.add(ci);
		
		
	}
	
	

	
	public static void main(String[] args) {
		new CarMain("자동차 스윙");
	}

}
