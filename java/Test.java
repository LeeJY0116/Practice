package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class Test extends JFrame implements ActionListener
{
	//필드값
	JTextArea area = new JTextArea("");
	int font = 12;
	
	//GUI 껍데기 구현
	Test()
	{	
	setTitle("메모장");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	add(area);
	area.setLineWrap(true);
	area.setFont(new Font("굴림", Font.BOLD, font));
	setSize(400,300);
	createMenu();
	}
	
	
	//메뉴바와 메뉴아이템 생성
	public void createMenu()
	{
		JMenuItem menu;
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
		JMenu colorMenu = new JMenu("글자 색");
		JMenu sizeMenu = new JMenu("글자 크기");
		
		menu = new JMenuItem("새 파일");
		menu.addActionListener(this);
		fileMenu.add(menu);
		menu = new JMenuItem("종료");
		fileMenu.add(menu);
		menu.addActionListener(this);
		JMenuItem redColor = new JMenuItem("빨강");
		redColor.addActionListener(this);
		JMenuItem greenColor = new JMenuItem("초록");
		greenColor.addActionListener(this);
		JMenuItem blueColor = new JMenuItem("파랑");
		blueColor.addActionListener(this);
		JMenuItem largeFont = new JMenuItem("크게");
		largeFont.addActionListener(this);
		JMenuItem smallFont = new JMenuItem("작게");
		smallFont.addActionListener(this);
		KeyStroke redKey = KeyStroke.getKeyStroke('R',ActionEvent.CTRL_MASK);
		KeyStroke greenKey = KeyStroke.getKeyStroke('G',ActionEvent.CTRL_MASK);
		KeyStroke blueKey = KeyStroke.getKeyStroke('B',ActionEvent.CTRL_MASK);
		KeyStroke largeKey = KeyStroke.getKeyStroke('L',ActionEvent.CTRL_MASK);
		KeyStroke smallKey = KeyStroke.getKeyStroke('S',ActionEvent.CTRL_MASK);
		redColor.setAccelerator(redKey);
		greenColor.setAccelerator(greenKey);
		blueColor.setAccelerator(blueKey);
		largeFont.setAccelerator(largeKey);
		smallFont.setAccelerator(smallKey);
		colorMenu.add(redColor);
		colorMenu.add(greenColor);
		colorMenu.add(blueColor);
		sizeMenu.add(largeFont);
		sizeMenu.add(smallFont);
		
		bar.add(fileMenu); bar.add(colorMenu); bar.add(sizeMenu);
		
		setJMenuBar(bar);
	}
	
		// 액션이벤트 기능 구현
		public void actionPerformed(ActionEvent e) 
		{
			JMenuItem actionmenu = (JMenuItem)(e.getSource());
			switch (actionmenu.getText())
			{
			case "새 파일" -> area.setText("");
			case "종료" -> System.exit(0);
			case "빨강" -> area.setForeground(Color.RED);
			case "초록" -> area.setForeground(Color.GREEN);
			case "파랑" -> area.setForeground(Color.BLUE);
			case "크게" -> area.setFont(new Font("굴림", Font.BOLD,++font));
			case "작게" -> area.setFont(new Font("굴림", Font.BOLD,--font));
			}
		}
		
	

	public static void main(String[] args) 
	{	
		new Test();
	}

}