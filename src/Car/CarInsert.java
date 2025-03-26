package Car;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CarInsert extends JFrame {
	
	Container cp;
	JRadioButton rb;
	JLabel lblModel;
	JButton btnop;
	JTextField tfPrice,tfName, tfAddr, tfHp, tfNati;	
	CarImage ci=new CarImage();
	String title;
	
	
	//생성자
	public CarInsert(String title) {
		super(title);
		this.title=title;
		//위치,너비
		this.setBounds(1000, 100, 500, 600);		
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
		this.setLayout(null);
		
		//라벨 모델 
		lblModel=new JLabel(title);
		lblModel.setBounds(10, 20, 80, 30);
		this.add(lblModel);
		
		System.out.println(title);
		
		
		
		JLabel lblPrice=new JLabel("가격");
		lblPrice.setBounds(10, 60, 80, 30);
		this.add(lblPrice);
		
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CarInsert("추가폼");
		
	}

}
