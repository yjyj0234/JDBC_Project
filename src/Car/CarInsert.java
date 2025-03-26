package Car;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class CarInsert extends JFrame implements ActionListener {
	
	Container cp;
	JRadioButton [] rb=new JRadioButton[2];
	Color [] color= {Color.white,Color.black}; 
	JCheckBox [] cb=new JCheckBox[4]; //다중선택 가능
	JLabel lblModel,lblCarImage;
	JButton btnop;
	JTextField tfPrice,tfName, tfAddr, tfHp, tfNati;	
	CarImage ci=new CarImage();
	String car_model,option,car_color;
	DbConnect db=new DbConnect();
	
	// 자동차 이미지 경로 (색상별)
    String[] carImages = {
        "C:\\Java\\work\\JDBC_Project\\test\\avante_white.png", // 흰색 자동차 이미지
        "C:\\Java\\work\\JDBC_Project\\test\\avante_black.png"  // 검은색 자동차 이미지
    };
	
	
	//생성자
	public CarInsert(String title) {
		super(title);
		this.car_model=car_model;
		//위치,너비
		this.setBounds(1000, 100, 500, 600);		
		cp=this.getContentPane();
		//메인프레임 종료
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(245,245,245));		
		initDesign();
		//this.setVisible(true);	
	}
	
	//디자인
	public void initDesign()
	{
		
		this.setLayout(null);
		
		//라벨 모델 
		lblModel=new JLabel(car_model);
		lblModel.setBounds(10, 20, 80, 30);
		this.add(lblModel);
		
		//차량 색상
		String [] car_color= {"white","black"};
		JPanel panel1=new JPanel();
		panel1.setBorder(new TitledBorder("차량 색상"));
		panel1.setBounds(10, 60, 200, 60);
		panel1.setOpaque(false);
		this.add(panel1);
		
		ButtonGroup bg=new ButtonGroup();
		for(int i=0; i< rb.length; i++)
		{
			rb[i]=new JRadioButton(car_color[i], i==1?true:false); //라디오버튼 생성
			panel1.add(rb[i]);// 탑패널에 2개의 라디오버튼추가
			bg.add(rb[i]); //버튼그룹에 2개의 버튼 추가
			
			rb[i].addActionListener(this); 
		}
		
		// 자동차 이미지 표시 (초기 이미지: 흰색)
        lblCarImage = new JLabel();
        lblCarImage.setBounds(50, 200, 300, 200);
        setCarImage(0); // 기본 이미지를 흰색으로 설정
        this.add(lblCarImage);
		
        //자동차 이미지 변경 메서드
        
        
		//옵션 패널 checkbox
		String [] car_option = {"네비게이션","파노라마 썬루프","크루즈컨트롤","열선 및 통풍시트"};
		JPanel panel2=new JPanel();
		panel2.setBounds(10, 140, 250, 60);
		panel2.setBorder(new TitledBorder("추가할 옵션을 선택해주세요"));
		this.add(panel2);
		
		for(int i=0; i<cb.length;i++)
		{
			cb[i]=new JCheckBox(car_option[i]);
			panel2.add(cb[i]);
			cb[i].addActionListener(this);			
		}
		
		
		
		//가격
		JLabel lblPrice=new JLabel("가격");
		lblPrice.setBounds(10, 140, 80, 30);
		this.add(lblPrice);
		
		
		
		
		
		
	}
	
	private void setCarImage(int index)
    {
    	ImageIcon icon= new ImageIcon(carImages[index]); //이미지 로드
    	Image img= icon.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
    	lblCarImage.setIcon(new ImageIcon(img)); //라벨에 이미지 설정
    }
	
	public void insertCar()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="insert into car values(seq_car.nextval, ?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setString(1, car_model);
			pstmt.setString(2, option);
			pstmt.setString(3, lblCarImage);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new CarInsert("추가폼");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		
		for(int i=0; i<rb.length;i++)
		{
			if(ob==rb[i])
			{
				setCarImage(i); //선택된 색상에 맞는 이미지 변경
			}
		}
		option=" ";
		for(int i=0; i<cb.length; i++)
		{	
			if(cb[i].isSelected()==true)
			{			
				option+=cb[i].getText()+" ";		//cb[i]의 텍스트를 가져온다		
				
			}
			
			}
		}
	
	}


