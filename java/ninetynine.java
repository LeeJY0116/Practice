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
	//�ʵ尪
	JTextArea area = new JTextArea(12, 39);
	JTextField fieldNum = new JTextField(39);
	int standardNum = 0;
	SimpleDateFormat dateTime;
	Calendar date = Calendar.getInstance();
	
	//GUI ������ ����
	ninetynine()
	{
	createMenu();
	showNorth();
	setTitle("�ڹ����α׷���2 ������ ��� ���ֿ�");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(450,300);
	fieldNum.setHorizontalAlignment(JTextField.CENTER);
	}
		
		
	//�޴��ٿ� �޴������� ����
	public void createMenu()
	{
		// �޴�
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("����");
		JMenu ntnMenu = new JMenu("������");
		JMenu dateMenu = new JMenu("��¥�ð�");
		
		// �޴�������
		JMenuItem reset = new JMenuItem("����");
		reset.addActionListener(this);
		fileMenu.add(reset);
		JMenuItem exit = new JMenuItem("����");
		exit.addActionListener(this);
		JMenuItem forprint = new JMenuItem("������ ���");
		forprint.addActionListener(this);
		ntnMenu.add(forprint);
		JMenuItem revprint = new JMenuItem("������ ���� ���");
		revprint.addActionListener(this);
		ntnMenu.add(revprint);
		JMenuItem dateprint = new JMenuItem("��¥ ���");
		dateprint.addActionListener(this);
		dateMenu.add(dateprint);
		JMenuItem timeprint = new JMenuItem("�ð� ���");
		timeprint.addActionListener(this);
		dateMenu.add(timeprint);
		fileMenu.add(exit);
		
		// ����Ű ����
		KeyStroke resetKey = KeyStroke.getKeyStroke('R',ActionEvent.CTRL_MASK);
		KeyStroke exitKey = KeyStroke.getKeyStroke('X',ActionEvent.CTRL_MASK);
		KeyStroke forKey = KeyStroke.getKeyStroke('9',ActionEvent.CTRL_MASK);
		KeyStroke revKey = KeyStroke.getKeyStroke('6',ActionEvent.CTRL_MASK);
		KeyStroke dateKey = KeyStroke.getKeyStroke('1',ActionEvent.CTRL_MASK);
		KeyStroke timeKey = KeyStroke.getKeyStroke('2',ActionEvent.CTRL_MASK);
		
		// Ű ����
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
	
		// �׼��̺�Ʈ ��� ����
		public void actionPerformed(ActionEvent e) 
		{
			JMenuItem actionmenu = (JMenuItem)(e.getSource());
			
			// ���� Ž��
			try
			{
				
				switch (actionmenu.getText())
				{
				case "����" -> 						// ȭ�� ����
				{
					area.setText("");
				}
				case "����" -> System.exit(0);		// ����
		
				// ������ ��� ����
				case "������ ���" ->
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
				
				// ������ ���� ��� ����
				case "������ ���� ���" ->
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
				
				// ��¥ ��� ����
				case "��¥ ���" ->
				{
					dateTime = new SimpleDateFormat("������ yy�� MM�� dd���Դϴ�.", Locale.KOREA);
					area.setText(dateTime.format(date.getTime()));	
				}
				
				// �ð� ��� ����
				case "�ð� ���" ->
				{
					dateTime = new SimpleDateFormat("������ hh�� mm�� ss���Դϴ�.", Locale.KOREA);
					area.setText(dateTime.format(date.getTime()));
				}
				}
			}
			
			// ���� ó��
			catch(NumberFormatException f)
			{
				area.setText("���ڰ� �ƴ� ���� �ԷµǾ����ϴ�. \n���ܳ��� : " + f.getMessage());
			}
		}
		
	
		public static void main(String[] args) 
	{	
		new ninetynine();
	}
}
