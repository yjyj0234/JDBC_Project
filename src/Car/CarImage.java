package Car;

import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class CarImage extends JPanel implements ActionListener {

	DefaultTableModel model;
	JTable table;
	Container cp;
	JButton btn1 ,btn2;		
	String car_model;
	CarInsert cInsert=new CarInsert(car_model);
	
	static final String [][] data= {
			{"아반떼", "C:\\Java\\work\\JDBC_Project\\test\\avante-25my-well-side.png", "C:\\Java\\work\\JDBC_Project\\test\\avante-25my-45side.png"},	
			{"그랜저","C:\\Java\\work\\JDBC_Project\\test\\grandeur-25my-well-side.png","C:\\Java\\work\\JDBC_Project\\test\\main-grandeur-25my-45side.png"}
			
			};
	
	public void carImage()
	{
		this.setLayout(null);
        for (int i = 0; i < data.length; i++) {
            addCarButton(data[i][0], data[i][1], data[i][2], 40 + (i * 260), 50);
        }
	}
	
	static final String [][] data1= {
			{"아반떼", "C:\\Java\\work\\JDBC_Project\\test\\avante-25my-well-side.png", "C:\\Java\\work\\JDBC_Project\\test\\avante-25my-45side.png"},	
			{"그랜저","C:\\Java\\work\\JDBC_Project\\test\\grandeur-25my-well-side.png","C:\\Java\\work\\JDBC_Project\\test\\main-grandeur-25my-45side.png"}
			
			};
	
	public void carImage1()
	{
		this.setLayout(null);
        for (int i = 0; i < data1.length; i++) {
            addCarButton(data1[i][0], data1[i][1], data1[i][2], 40 + (i * 260), 230);
        }
	}
	
	public void addCarButton(String car_model, String imagePath, String rollorverPath, int x, int y)
	{
		
		ImageIcon icon=new ImageIcon(imagePath); //사진 read
		ImageIcon icon1=new ImageIcon(rollorverPath);
		Image img = icon.getImage();
		Image img1= icon1.getImage();
        Image resizedImg = img.getScaledInstance(240, 160, Image.SCALE_SMOOTH); // 원하는 크기로 조절
        Image resizedImg1= img1.getScaledInstance(240, 160, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);
        ImageIcon resizedIcon1= new ImageIcon(resizedImg1);       
        
        	
		btn2=new JButton(car_model);
		btn2.setIcon(resizedIcon);
		btn2.setBounds(x, y, 240, 220);		
		btn2.setRolloverIcon(resizedIcon1);
		 // 텍스트를 아이콘 아래로 정렬
        btn2.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn2.setHorizontalTextPosition(SwingConstants.CENTER);

        // 버튼 스타일 조정 (선택 사항)
        btn2.setFocusPainted(false); // 포커스 표시 제거
       btn2.setBorderPainted(false); // 테두리 제거
       btn2.setContentAreaFilled(false); // 버튼 배경 제거
        this.add(btn2);
		
        btn2.addActionListener(this);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		
		if(ob==btn2)
		{
			for(int i=0; i<data.length;i++)
			{
				String car_model=data[i][0];				
			}
			cInsert=new CarInsert(car_model);
			cInsert.setVisible(true);
		}
			
			
			
			
		}
		
	}
	
	
	

