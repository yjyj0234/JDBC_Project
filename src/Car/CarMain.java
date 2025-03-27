package Car;



import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
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
		setContentPane(new JLabel(new ImageIcon("images/main.png")));  //배경 이미지 넣기
		cp=this.getContentPane();
		
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
			
		initDesign();
		
		this.setVisible(true);	
	}
	
	public void initDesign()
	{
		this.setLayout(null);
		
		ci.carImage();
		ci.setBounds(50, 50, 780, 550);	
		ci.setBorder(new LineBorder(Color.black,4));
	
		this.add(ci);
		
		//자동차 버튼 사이 선
		JPanel linePanel=new JPanel();
		linePanel.setBounds(900, 0, 5, 700);
		linePanel.setBackground(new Color(255,255,255));
		this.add(linePanel);
		
		//버튼 2개
		btn1 = new JButton("전체 고객 조회");
		btn1.setFont(new Font("", Font.BOLD, 20));
		btn1.setBounds(980, 150, 250, 80);
		this.add(btn1);
		
		btn2 = new JButton("기존 고객 데이터 삭제");
		btn2.setFont(new Font("", Font.BOLD, 18));
		btn2.setBounds(980, 370, 250, 80);
		this.add(btn2);
		
	}
	
	

	
	public static void main(String[] args) {
		new CarMain("자동차 스윙");
	}

}
