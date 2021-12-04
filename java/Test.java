package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class Test extends JFrame implements ActionListener
{
	//�ʵ尪
	JTextArea area = new JTextArea("");
	int font = 12;
	
	//GUI ������ ����
	Test()
	{	
	setTitle("�޸���");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	add(area);
	area.setLineWrap(true);
	area.setFont(new Font("����", Font.BOLD, font));
	setSize(400,300);
	createMenu();
	}
	
	
	//�޴��ٿ� �޴������� ����
	public void createMenu()
	{
		JMenuItem menu;
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("����");
		JMenu colorMenu = new JMenu("���� ��");
		JMenu sizeMenu = new JMenu("���� ũ��");
		
		menu = new JMenuItem("�� ����");
		menu.addActionListener(this);
		fileMenu.add(menu);
		menu = new JMenuItem("����");
		fileMenu.add(menu);
		menu.addActionListener(this);
		JMenuItem redColor = new JMenuItem("����");
		redColor.addActionListener(this);
		JMenuItem greenColor = new JMenuItem("�ʷ�");
		greenColor.addActionListener(this);
		JMenuItem blueColor = new JMenuItem("�Ķ�");
		blueColor.addActionListener(this);
		JMenuItem largeFont = new JMenuItem("ũ��");
		largeFont.addActionListener(this);
		JMenuItem smallFont = new JMenuItem("�۰�");
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
	
		// �׼��̺�Ʈ ��� ����
		public void actionPerformed(ActionEvent e) 
		{
			JMenuItem actionmenu = (JMenuItem)(e.getSource());
			switch (actionmenu.getText())
			{
			case "�� ����" -> area.setText("");
			case "����" -> System.exit(0);
			case "����" -> area.setForeground(Color.RED);
			case "�ʷ�" -> area.setForeground(Color.GREEN);
			case "�Ķ�" -> area.setForeground(Color.BLUE);
			case "ũ��" -> area.setFont(new Font("����", Font.BOLD,++font));
			case "�۰�" -> area.setFont(new Font("����", Font.BOLD,--font));
			}
		}
		
	

	public static void main(String[] args) 
	{	
		new Test();
	}

}