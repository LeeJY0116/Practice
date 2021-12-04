package ljy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Highlow extends JFrame implements ActionListener
{
	//�ʵ尪
	Random random = new Random();
	JTextArea area = new JTextArea(9, 39);
	JLabel answerLabel = new JLabel("���� : ??");
	int answer = random.nextInt(100);
	
	//GUI ������ ����
	Highlow()
	{	
	setTitle("�ڹ����α׷���2 2�й� �߰���� ���ֿ�");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(410,300);
	setLayout(new BorderLayout(0, 1));
	showNorth(); showCenter(); showSouth();
	createMenu();
	}
		
		
	//�޴��ٿ� �޴������� ����
	public void createMenu()
	{
		JMenuItem menu;
		JMenuBar bar = new JMenuBar();
		JMenu gameMenu = new JMenu("����");
		
		JMenuItem newGame = new JMenuItem("�� ����");
		newGame.addActionListener(this);
		gameMenu.add(newGame);
		JMenuItem answer = new JMenuItem("���� ����");
		answer.addActionListener(this);
		gameMenu.add(answer);
		JMenuItem exit = new JMenuItem("����");
		exit.addActionListener(this);
		gameMenu.add(exit);
		KeyStroke newGamekey = KeyStroke.getKeyStroke('N',ActionEvent.CTRL_MASK);
		KeyStroke answerKey = KeyStroke.getKeyStroke('S',ActionEvent.CTRL_MASK);
		KeyStroke exitKey = KeyStroke.getKeyStroke('X',ActionEvent.CTRL_MASK);
		newGame.setAccelerator(newGamekey);
		answer.setAccelerator(answerKey);
		exit.setAccelerator(exitKey);
	
		bar.add(gameMenu);
		
		setJMenuBar(bar);
	}
	
	void showNorth()
	{
		JPanel panel = new JPanel();
		area.setEditable(false);

		JTextField answerField = new JTextField(12);
		JButton tryButton = new JButton("����!");
		panel.add(answerField); panel.add(tryButton);
		
		tryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(answerField.getText().matches(".*[0-9].*") == false)		// ������� ���ڸ� �Է����� ���� ���
				{
					area.setText("������ �Է����ּ���!\n");
				}
				else if(Integer.parseInt(answerField.getText()) > 100 || Integer.parseInt(answerField.getText()) < 0)
					
				{
					area.setText("1~100 ������ ���ڸ� �Է����ּ���!\n");
				}
				else if(Integer.parseInt(answerField.getText()) == answer)	// ������ ���
				{
					if(area.getText().contains("������ �Է����ּ���!") || area.getText().contains("1~100 ������ ���ڸ� �Է����ּ���!"))
					{
						area.setText(answerField.getText() + "-> ����!!\n");
						answerLabel.setText(answerLabel.getText().replace("���� : ??", "���� : " + String.valueOf(answer)));
					}
					else
					{
						area.append(answerField.getText() + "-> ����!!\n");
						answerLabel.setText(answerLabel.getText().replace("���� : ??", "���� : " + String.valueOf(answer)));
					}
				}
				else if(Integer.parseInt(answerField.getText()) > answer)	// ���亸�� ū ���ڸ� �Է����� ���
				{
					if(area.getText().contains("������ �Է����ּ���!") || area.getText().contains("1~100 ������ ���ڸ� �Է����ּ���!"))
					{
						area.setText(answerField.getText() + "-> LOW!\n");
					}
					else
						area.append(answerField.getText() + "-> LOW!\n");
				}
				else
				{
					if(area.getText().contains("������ �Է����ּ���!") || area.getText().contains("1~100 ������ ���ڸ� �Է����ּ���!"))
					{
						area.setText(answerField.getText() + "-> HIGH\n");
					}
					else
						area.append(answerField.getText() + "-> HIGH!\n");		// ���亸�� ���� ���ڸ� �Է����� ���
				}

			}
		});
		
		add(panel, BorderLayout.NORTH);
		
	}
	
	void showCenter()
	{
		JPanel panel = new JPanel();
		
		area.setLineWrap(true);
		
		panel.add(area);
		add(panel, BorderLayout.CENTER);
	}
	
	void showSouth()
	{
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(answerLabel);
		add(panel, BorderLayout.SOUTH);
	}
	
		// �׼��̺�Ʈ ��� ����
		public void actionPerformed(ActionEvent e) 
		{
			JMenuItem actionmenu = (JMenuItem)(e.getSource());
			switch (actionmenu.getText())
			{
			case "�� ����" -> 						// ȭ�� ����, ���� ����, ����ǥ�� ����
			{
				area.setText("");
				answer = random.nextInt(100);
				answerLabel.setText("���� : ??");
			}
			case "����" -> System.exit(0);
			case "���� ����" ->
			{
				answerLabel.setText(answerLabel.getText().replace("���� : ??", "���� : " + String.valueOf(answer)));
			}
			}
		}
		
	
		public static void main(String[] args) 
	{	
		new Highlow();
	}
}

