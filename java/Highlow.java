package ljy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Highlow extends JFrame implements ActionListener
{
	//필드값
	Random random = new Random();
	JTextArea area = new JTextArea(9, 39);
	JLabel answerLabel = new JLabel("정답 : ??");
	int answer = random.nextInt(100);
	
	//GUI 껍데기 구현
	Highlow()
	{	
	setTitle("자바프로그래밍2 2분반 중간고사 이주엽");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(410,300);
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
		area.setEditable(false);

		JTextField answerField = new JTextField(12);
		JButton tryButton = new JButton("도전!");
		panel.add(answerField); panel.add(tryButton);
		
		tryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(answerField.getText().matches(".*[0-9].*") == false)		// 정답란에 숫자를 입력하지 않을 경우
				{
					area.setText("정답을 입력해주세요!\n");
				}
				else if(Integer.parseInt(answerField.getText()) > 100 || Integer.parseInt(answerField.getText()) < 0)
					
				{
					area.setText("1~100 사이의 숫자를 입력해주세요!\n");
				}
				else if(Integer.parseInt(answerField.getText()) == answer)	// 정답일 경우
				{
					if(area.getText().contains("정답을 입력해주세요!") || area.getText().contains("1~100 사이의 숫자를 입력해주세요!"))
					{
						area.setText(answerField.getText() + "-> 정답!!\n");
						answerLabel.setText(answerLabel.getText().replace("정답 : ??", "정답 : " + String.valueOf(answer)));
					}
					else
					{
						area.append(answerField.getText() + "-> 정답!!\n");
						answerLabel.setText(answerLabel.getText().replace("정답 : ??", "정답 : " + String.valueOf(answer)));
					}
				}
				else if(Integer.parseInt(answerField.getText()) > answer)	// 정답보다 큰 숫자를 입력했을 경우
				{
					if(area.getText().contains("정답을 입력해주세요!") || area.getText().contains("1~100 사이의 숫자를 입력해주세요!"))
					{
						area.setText(answerField.getText() + "-> LOW!\n");
					}
					else
						area.append(answerField.getText() + "-> LOW!\n");
				}
				else
				{
					if(area.getText().contains("정답을 입력해주세요!") || area.getText().contains("1~100 사이의 숫자를 입력해주세요!"))
					{
						area.setText(answerField.getText() + "-> HIGH\n");
					}
					else
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
		
		panel.add(area);
		add(panel, BorderLayout.CENTER);
	}
	
	void showSouth()
	{
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(answerLabel);
		add(panel, BorderLayout.SOUTH);
	}
	
		// 액션이벤트 기능 구현
		public void actionPerformed(ActionEvent e) 
		{
			JMenuItem actionmenu = (JMenuItem)(e.getSource());
			switch (actionmenu.getText())
			{
			case "새 게임" -> 						// 화면 리셋, 정답 변경, 정답표시 리셋
			{
				area.setText("");
				answer = random.nextInt(100);
				answerLabel.setText("정답 : ??");
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
		new Highlow();
	}
}

