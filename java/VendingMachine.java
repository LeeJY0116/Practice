package ljy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachine extends JFrame 
{
	JTextField totalTX = new JTextField(15);
	String[] menus = {"돈가스", "김치찌개", "정식"};
	JComboBox cb = new JComboBox(menus);
	int pork = 0;
	int kimchi = 0;
	int formal = 0;
	int result = 0;
	JTextArea menuArea = new JTextArea(4, 30);
	VendingMachine()
	{
		setTitle("식권 자판기");
		
		setLayout(new BorderLayout(10, 10));
		showNorth(); showCenter(); showSouth();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 300);
		setVisible(true);
	}
	
	// 상단 레이아웃 설정
	
	void showNorth()
	{
		JPanel panel = new JPanel();
		

		menuArea.setText("돈가스 0개\n김치찌개 0개\n정식 0개");
		menuArea.setEditable(false);
		menuArea.setForeground(Color.BLACK);
		panel.add(menuArea);
		
		add(panel, BorderLayout.NORTH);
	}
	
	// 중앙 레이아웃 설정
	
	void showCenter()
	{
		JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5, 1));
		JPanel leftPanel = new JPanel();
		JPanel totalPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,20,1));
		JButton left = new JButton("<");
		JButton right = new JButton(">");
		cb.setPreferredSize(new Dimension(120,30));
		JTextField countField = new JTextField(5);
		countField.setEditable(false);
		countField.setHorizontalAlignment(JTextField.CENTER);
		countField.setBackground(Color.WHITE);
		
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cbi = cb.getSelectedIndex();
				String cutlet = String.valueOf(pork);
				String stew = String.valueOf(kimchi);
				String form = String.valueOf(formal);
				
				if( cbi == 0)
					countField.setText(cutlet);
				else if(cbi == 1)
					countField.setText(stew);
				else
					countField.setText(form);
				
			}
		});
		
		// 좌, 우 버튼 누를 시 이벤트 발생
		// 좌 버튼 누를 시 메뉴 갯수 한개씩 줄어들며 총액에서 메뉴 금액만큼 차감, 0 미만으로 차감되지 않음.
		// 우 버튼 누를 시 메뉴 갯수 한개씩 늘어나며 총액에서 메뉴 금액만큼 증가
		
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cbi = cb.getSelectedIndex();			
				if(cbi == 0)
				{
					if(pork > 0)
					{

						menuArea.setText(menuArea.getText().replace("돈가스 " + String.valueOf(pork) + "개\n","돈가스 " + String.valueOf(pork-1) + "개\n"));
						result -= 3000;	
						pork -= 1;
						String cutlet = String.valueOf(pork);
						countField.setText(cutlet);
					}
				}
				else if(cbi == 1)
				{
					if(kimchi > 0)
					{
						menuArea.setText(menuArea.getText().replace("김치찌개 " + String.valueOf(kimchi) + "개\n","김치찌개 " + String.valueOf(kimchi-1) + "개\n"));
						kimchi -= 1;	
						String stew = String.valueOf(kimchi);
						result -= 2000;
						countField.setText(stew);
					}
				}
				else if(cbi == 2)
				{
					if(formal > 0)
					{
					menuArea.setText(menuArea.getText().replace("정식 " + String.valueOf(formal) + "개","정식 " + String.valueOf(formal-1) + "개"));
					formal -= 1;
					String form = String.valueOf(formal);
					result -= 2500;
					countField.setText(form);
					}
				}
				String resultStr = String.valueOf(result);
				totalTX.setText(resultStr + "원");
				
			}
		});
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cbi = cb.getSelectedIndex();
				if(cbi == 0)
				{
					menuArea.setText(menuArea.getText().replace("돈가스 " + String.valueOf(pork) + "개\n","돈가스 " + String.valueOf(pork+1) + "개\n"));
					pork += 1;
					String cutlet = String.valueOf(pork);
					result += 3000;
					countField.setText(cutlet);
				}
				else if(cbi == 1)
				{
					menuArea.setText(menuArea.getText().replace("김치찌개 " + String.valueOf(kimchi) + "개\n","김치찌개 " + String.valueOf(kimchi+1) + "개\n"));
					result += 2000;
					kimchi += 1;
					String stew = String.valueOf(kimchi);
					countField.setText(stew);
				}
				else if(cbi == 2)
				{
					menuArea.setText(menuArea.getText().replace("정식 " + String.valueOf(formal) + "개","정식 " + String.valueOf(formal+1) + "개"));
					formal += 1;
					result += 2500;
					String form = String.valueOf(formal);
					countField.setText(form);
				}
				String resultStr = String.valueOf(result);
				totalTX.setText(resultStr + "원");
			}
		});
		
		cb.setBackground(Color.WHITE);
		left.setBackground(new Color(150,150,150));
		right.setBackground(new Color(150,150,150));
		leftPanel.add(cb); rightPanel.add(left); rightPanel.add(countField); rightPanel.add(right);
		totalPanel.add(leftPanel); totalPanel.add(rightPanel);
		add(totalPanel, BorderLayout.CENTER);
		
	}
	
	// 하단 레이아웃, 결제 이벤트 설정
	
	void showSouth()
	{
		JPanel totalPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 1));
		JPanel totalTXPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 1));
		JPanel insertTXPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 3));
		JPanel insertPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 1));
		JPanel panelNorth = new JPanel(new GridLayout(2,2));
		JPanel panelSouth = new JPanel(new GridLayout(1,1));
		JPanel panel = new JPanel(new GridLayout(0,1));
		JButton pay = new JButton("결제");
		
		JLabel totalLabel = new JLabel("총 액");
		JLabel insertLabel = new JLabel("투입금액");
		
		JTextField insertTX = new JTextField(15);
		insertTX.setText("0");
		insertTX.setHorizontalAlignment(JTextField.CENTER);
		totalTX.setHorizontalAlignment(JTextField.CENTER);
		totalTX.setBackground(Color.WHITE);
		totalPanel.add(totalLabel); totalTXPanel.add(totalTX); insertPanel.add(insertLabel); insertTXPanel.add(insertTX);
		totalTX.setEditable(false);
		
		
		// 결제 버튼 클릭 시 상황에 맞는 이벤트 발생
		// 메뉴를 한 개도 선택하지 않을 시 메뉴 선택 요구
		// 금액을 투입하지 않을 시 금액 투입 요구, 결제 완료, 실패 시 결과 통보
		
		pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(insertTX.getText().matches(".*[0-9].*") == false)	// 투입금액이 공백일 경우 금액 투입 요구
				{
					if(menuArea.getText().contains("금액을 투입해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("금액을 투입해주세요", "금액을 투입해주세요"));
					}
					else if(menuArea.getText().contains("메뉴를 선택해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("메뉴를 선택해주세요", "금액을 투입해주세요"));
					}
					else if(menuArea.getText().contains("금액이 부족합니다"))
					{
						menuArea.setText(menuArea.getText().replace("금액이 부족합니다", "금액을 투입해주세요"));
					}
					else if(menuArea.getText().contains("결제 완료"))
					{
						menuArea.setText(menuArea.getText().replace("결제 완료", "금액을 투입해주세요"));
					}
					else
						menuArea.append("\n금액을 투입해주세요");
				}
				else if(pork == 0 && kimchi == 0 && formal ==0)			// 메뉴를 아무것도 고르지 않았을 경우 메뉴 선택 요구
				{
					if(menuArea.getText().contains("메뉴를 선택해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("메뉴를 선택해주세요", "메뉴를 선택해주세요"));
					}
					else if(menuArea.getText().contains("금액을 투입해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("금액을 투입해주세요", "메뉴를 선택해주세요"));
					}
					else if(menuArea.getText().contains("결제 완료"))
					{
						menuArea.setText(menuArea.getText().replace("결제 완료", "메뉴를 선택해주세요"));
					}
					else if(menuArea.getText().contains("금액이 부족합니다"))
					{
						menuArea.setText(menuArea.getText().replace("금액이 부족합니다", "메뉴를 선택해주세요"));
					}
					else
						menuArea.append("\n메뉴를 선택해주세요");
				}
				else if(Integer.parseInt(insertTX.getText()) == 0)		// 투입금액이 초기값인 0일 경우 금액 투입 요구
					if(menuArea.getText().contains("금액을 투입해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("금액을 투입해주세요", "금액을 투입해주세요"));
					}
					else if(menuArea.getText().contains("메뉴를 선택해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("메뉴를 선택해주세요", "금액을 투입해주세요"));
					}
					else if(menuArea.getText().contains("금액이 부족합니다"))
					{
						menuArea.setText(menuArea.getText().replace("금액이 부족합니다", "금액을 투입해주세요"));
					}
					else if(menuArea.getText().contains("결제 완료"))
					{
						menuArea.setText(menuArea.getText().replace("결제 완료", "금액을 투입해주세요"));
					}
					else
						menuArea.append("\n금액을 투입해주세요");
				else if(Integer.parseInt(insertTX.getText()) >= result)	// 투입금액이 총액보다 높을 시 결제 성공 표시
				{
					if(menuArea.getText().contains("결제 완료"))
						menuArea.setText(menuArea.getText().replace("결제 완료", "결제 완료"));
					else if(menuArea.getText().contains("메뉴를 선택해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("메뉴를 선택해주세요", "결제 완료"));
					}
					else if(menuArea.getText().contains("금액을 투입해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("금액을 투입해주세요", "결제 완료"));
					}
					else if(menuArea.getText().contains("금액이 부족합니다"))
						menuArea.setText(menuArea.getText().replace("금액이 부족합니다", "결제 완료"));
					else
						menuArea.append("\n결제 완료");
				}
				else {												// 투입금액이 총액보다 적을 시 금액이 부족하다고 알림
					if(menuArea.getText().contains("결제 완료"))
						menuArea.setText(menuArea.getText().replace("결제 완료", "금액이 부족합니다"));
					else if(menuArea.getText().contains("메뉴를 선택해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("메뉴를 선택해주세요", "금액이 부족합니다"));
					}
					else if(menuArea.getText().contains("금액을 투입해주세요"))
					{
						menuArea.setText(menuArea.getText().replace("금액을 투입해주세요", "금액이 부족합니다"));
					}
					else if(menuArea.getText().contains("금액이 부족합니다"))
						menuArea.setText(menuArea.getText().replace("금액이 부족합니다", "금액이 부족합니다"));
					else
						menuArea.append("\n금액이 부족합니다");
				}
			}
		});
		
		// 상세 레이아웃 설정
		
		pay.setFont(new Font("돋움", Font.BOLD, 20));
		pay.setBackground(new Color(150,150,150));
		pay.setBounds(17, 15, 300 ,30);
		panelSouth.setLayout(null);
		panelNorth.add(totalPanel);
		panelNorth.add(totalTXPanel);
		panelNorth.add(insertPanel);
		panelNorth.add(insertTXPanel);
		panelSouth.add(pay);
		panel.add(panelNorth);
		panel.add(panelSouth);
		
		add(panel, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) 
	{	
		new VendingMachine();
	}

}