package report;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class ninetynine extends JFrame implements ActionListener
{
	//필드값
	JTextArea area = new JTextArea(12, 39);
	JTextField fieldNum = new JTextField(39);
	int standardNum = 0;
	SimpleDateFormat dateTime;
	Calendar date = Calendar.getInstance();
	
	//GUI 껍데기 구현
	ninetynine()
	{
	createMenu();
	showNorth();
	setTitle("자바프로그래밍2 구구단 출력 이주엽");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(450,300);
	fieldNum.setHorizontalAlignment(JTextField.CENTER);
	}
		
		
	//메뉴바와 메뉴아이템 생성
	public void createMenu()
	{
		// 메뉴
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
		JMenu ntnMenu = new JMenu("구구단");
		JMenu dateMenu = new JMenu("날짜시간");
		
		// 메뉴아이템
		JMenuItem reset = new JMenuItem("리셋");
		reset.addActionListener(this);
		fileMenu.add(reset);
		JMenuItem exit = new JMenuItem("종료");
		exit.addActionListener(this);
		JMenuItem forprint = new JMenuItem("구구단 출력");
		forprint.addActionListener(this);
		ntnMenu.add(forprint);
		JMenuItem revprint = new JMenuItem("구구단 역순 출력");
		revprint.addActionListener(this);
		ntnMenu.add(revprint);
		JMenuItem dateprint = new JMenuItem("날짜 출력");
		dateprint.addActionListener(this);
		dateMenu.add(dateprint);
		JMenuItem timeprint = new JMenuItem("시간 출력");
		timeprint.addActionListener(this);
		dateMenu.add(timeprint);
		fileMenu.add(exit);
		
		// 단축키 설정
		KeyStroke resetKey = KeyStroke.getKeyStroke('R',ActionEvent.CTRL_MASK);
		KeyStroke exitKey = KeyStroke.getKeyStroke('X',ActionEvent.CTRL_MASK);
		KeyStroke forKey = KeyStroke.getKeyStroke('9',ActionEvent.CTRL_MASK);
		KeyStroke revKey = KeyStroke.getKeyStroke('6',ActionEvent.CTRL_MASK);
		KeyStroke dateKey = KeyStroke.getKeyStroke('1',ActionEvent.CTRL_MASK);
		KeyStroke timeKey = KeyStroke.getKeyStroke('2',ActionEvent.CTRL_MASK);
		
		// 키 동작
		reset.setAccelerator(resetKey);
		exit.setAccelerator(exitKey);
		forprint.setAccelerator(forKey);
		revprint.setAccelerator(revKey);
		dateprint.setAccelerator(dateKey);
		timeprint.setAccelerator(timeKey);
	
		bar.add(fileMenu); bar.add(ntnMenu); bar.add(dateMenu);
		
		setJMenuBar(bar);
	}
	
	void showNorth()
	{
		JPanel panel = new JPanel();
		area.setEditable(false);
		panel.add(fieldNum);
		area.setLineWrap(true);
		panel.add(area);
		add(panel, BorderLayout.NORTH);
	}
	
		// 액션이벤트 기능 구현
		public void actionPerformed(ActionEvent e) 
		{
			JMenuItem actionmenu = (JMenuItem)(e.getSource());
			
			// 예외 탐색
			try
			{
				
				switch (actionmenu.getText())
				{
				case "리셋" -> 						// 화면 리셋
				{
					area.setText("");
				}
				case "종료" -> System.exit(0);		// 종료
		
				// 구구단 출력 동작
				case "구구단 출력" ->
				{
		
						area.setText("");
						String prnt = "";
						standardNum = Integer.parseInt(fieldNum.getText());
					
						for(int i = 1; i < 10; i ++)
						{
							prnt = MessageFormat.format("{0} * {1} = {2}\n", standardNum, i, standardNum * i);
							area.append(prnt);
						}
				}
				
				// 구구단 역순 출력 동작
				case "구구단 역순 출력" ->
				{
					area.setText("");
					String prnt = "";
					standardNum = Integer.parseInt(fieldNum.getText());
				
					for(int i = 9; i > 0; i --)
					{
						prnt = MessageFormat.format("{0} * {1} = {2}\n", standardNum, i, standardNum * i);
						area.append(prnt);
					}
				}
				
				// 날짜 출력 동작
				case "날짜 출력" ->
				{
					dateTime = new SimpleDateFormat("오늘은 yy년 MM월 dd일입니다.", Locale.KOREA);
					area.setText(dateTime.format(date.getTime()));	
				}
				
				// 시간 출력 동작
				case "시간 출력" ->
				{
					dateTime = new SimpleDateFormat("지금은 hh시 mm분 ss초입니다.", Locale.KOREA);
					area.setText(dateTime.format(date.getTime()));
				}
				}
			}
			
			// 예외 처리
			catch(NumberFormatException f)
			{
				area.setText("숫자가 아닌 값이 입력되었습니다. \n예외내용 : " + f.getMessage());
			}
		}
		
	
		public static void main(String[] args) 
	{	
		new ninetynine();
	}
}
