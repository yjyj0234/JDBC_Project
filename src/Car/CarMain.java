package Car;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CarMain extends JFrame implements ActionListener {
	CarImage ci=new CarImage();
	CarInsert cInsert=new CarInsert("추가 폼");
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
		cp.setBackground(Color.pink);		
		initDesign();
		
		this.setVisible(true);	
	}
	
	public void initDesign()
	{
		ci.carImage();
		ci.setBounds(20, 20, 240, 160);		
		
		ci.carImage1();
		ci.btn2.addActionListener(this);
	
		this.add(ci);
		
		
	}
	
	

	
	public static void main(String[] args) {
		new CarMain("자동차 스윙");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		
		if(ob==btn2)
		{
			for(int i=0; i<ci.data.length;i++)
			{
				String car_model=ci.data[i][0];				
			}
			cInsert=new CarInsert(ci.car_model);
			cInsert.setVisible(true);
		}
		
	}

}
