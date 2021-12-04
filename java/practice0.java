package ljy2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class practice0 extends JFrame implements ActionListener
{
	//�ʵ尪
	Random random = new Random();
	JTextArea area = new JTextArea(8, 35);
	JLabel answerLabel = new JLabel("���� : ??");
	int font = 12;
	int answer = random.nextInt(100);
	
	//GUI ������ ����
	practice0()
	{	
	setTitle("�ڹ����α׷���2 2�й� �߰����");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(400,300);
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
		

		JTextField answerField = new JTextField(10);
		JButton tryButton = new JButton("����!");
		panel.add(answerField); panel.add(tryButton);
		
		tryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(answerField.getText()) == answer)		// ������ ���
				{
					area.append(answerField.getText() + "-> ����!!\n");
				}
				else if(Integer.parseInt(answerField.getText()) > answer)	// ���亸�� ū ���ڸ� �Է����� ���
				{
					area.append(answerField.getText() + "-> LOW!\n");
				}
				else
				{
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
		area.setFont(new Font("����", Font.BOLD, font));
		
		panel.add(area);
		add(panel, BorderLayout.CENTER);
	}
	
	void showSouth()
	{
		JPanel panel = new JPanel();
		answerLabel.setHorizontalAlignment(JLabel.LEFT);
		panel.add(answerLabel);
		add(panel, BorderLayout.SOUTH);
	}
	
		// �׼��̺�Ʈ ��� ����
		public void actionPerformed(ActionEvent e) 
		{
			JMenuItem actionmenu = (JMenuItem)(e.getSource());
			switch (actionmenu.getText())
			{
			case "�� ����" -> 
			{
				area.setText("");
				answerLabel.setText("���� : ??");
				answer = random.nextInt(100);
				
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
		new practice0();
	}
}

