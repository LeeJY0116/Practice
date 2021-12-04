package ljy2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class practice0 extends JFrame implements ActionListener
{
	//필드값
	Random random = new Random();
	JTextArea area = new JTextArea(8, 35);
	JLabel answerLabel = new JLabel("정답 : ??");
	int font = 12;
	int answer = random.nextInt(100);
	
	//GUI 껍데기 구현
	practice0()
	{	
	setTitle("자바프로그래밍2 2분반 중간고사");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(400,300);
	setLayout(new BorderLayout(0, 1));
	showNorth(); showCenter(); showSouth();
	createMenu();
	}
		
		
	//메뉴바와 메뉴아이템 생성
	public void createMenu()
	{
		JMenuItem menu;
		JMenuBar bar = new JMenuBar();
		JMenu gameMenu = new JMenu("게임");
		
		JMenuItem newGame = new JMenuItem("새 게임");
		newGame.addActionListener(this);
		gameMenu.add(newGame);
		JMenuItem answer = new JMenuItem("정답 보기");
		answer.addActionListener(this);
		gameMenu.add(answer);
		JMenuItem exit = new JMenuItem("종료");
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
		JButton tryButton = new JButton("도전!");
		panel.add(answerField); panel.add(tryButton);
		
		tryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(answerField.getText()) == answer)		// 정답일 경우
				{
					area.append(answerField.getText() + "-> 정답!!\n");
				}
				else if(Integer.parseInt(answerField.getText()) > answer)	// 정답보다 큰 숫자를 입력했을 경우
				{
					area.append(answerField.getText() + "-> LOW!\n");
				}
				else
				{
					area.append(answerField.getText() + "-> HIGH!\n");		// 정답보다 작은 숫자를 입력했을 경우
				}

			}
		});
		
		add(panel, BorderLayout.NORTH);
		
	}
	
	void showCenter()
	{
		JPanel panel = new JPanel();
		
		area.setLineWrap(true);
		area.setFont(new Font("굴림", Font.BOLD, font));
		
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
	
		// 액션이벤트 기능 구현
		public void actionPerformed(ActionEvent e) 
		{
			JMenuItem actionmenu = (JMenuItem)(e.getSource());
			switch (actionmenu.getText())
			{
			case "새 게임" -> 
			{
				area.setText("");
				answerLabel.setText("정답 : ??");
				answer = random.nextInt(100);
				
			}
			case "종료" -> System.exit(0);
			case "정답 보기" ->
			{
				answerLabel.setText(answerLabel.getText().replace("정답 : ??", "정답 : " + String.valueOf(answer)));
			}
			}
		}
		
	
		public static void main(String[] args) 
	{	
		new practice0();
	}
}

