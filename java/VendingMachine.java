package ljy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachine extends JFrame 
{
	JTextField totalTX = new JTextField(15);
	String[] menus = {"������", "��ġ�", "����"};
	JComboBox cb = new JComboBox(menus);
	int pork = 0;
	int kimchi = 0;
	int formal = 0;
	int result = 0;
	JTextArea menuArea = new JTextArea(4, 30);
	VendingMachine()
	{
		setTitle("�ı� ���Ǳ�");
		
		setLayout(new BorderLayout(10, 10));
		showNorth(); showCenter(); showSouth();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 300);
		setVisible(true);
	}
	
	// ��� ���̾ƿ� ����
	
	void showNorth()
	{
		JPanel panel = new JPanel();
		

		menuArea.setText("������ 0��\n��ġ� 0��\n���� 0��");
		menuArea.setEditable(false);
		menuArea.setForeground(Color.BLACK);
		panel.add(menuArea);
		
		add(panel, BorderLayout.NORTH);
	}
	
	// �߾� ���̾ƿ� ����
	
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
		
		// ��, �� ��ư ���� �� �̺�Ʈ �߻�
		// �� ��ư ���� �� �޴� ���� �Ѱ��� �پ��� �Ѿ׿��� �޴� �ݾ׸�ŭ ����, 0 �̸����� �������� ����.
		// �� ��ư ���� �� �޴� ���� �Ѱ��� �þ�� �Ѿ׿��� �޴� �ݾ׸�ŭ ����
		
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cbi = cb.getSelectedIndex();			
				if(cbi == 0)
				{
					if(pork > 0)
					{

						menuArea.setText(menuArea.getText().replace("������ " + String.valueOf(pork) + "��\n","������ " + String.valueOf(pork-1) + "��\n"));
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
						menuArea.setText(menuArea.getText().replace("��ġ� " + String.valueOf(kimchi) + "��\n","��ġ� " + String.valueOf(kimchi-1) + "��\n"));
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
					menuArea.setText(menuArea.getText().replace("���� " + String.valueOf(formal) + "��","���� " + String.valueOf(formal-1) + "��"));
					formal -= 1;
					String form = String.valueOf(formal);
					result -= 2500;
					countField.setText(form);
					}
				}
				String resultStr = String.valueOf(result);
				totalTX.setText(resultStr + "��");
				
			}
		});
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cbi = cb.getSelectedIndex();
				if(cbi == 0)
				{
					menuArea.setText(menuArea.getText().replace("������ " + String.valueOf(pork) + "��\n","������ " + String.valueOf(pork+1) + "��\n"));
					pork += 1;
					String cutlet = String.valueOf(pork);
					result += 3000;
					countField.setText(cutlet);
				}
				else if(cbi == 1)
				{
					menuArea.setText(menuArea.getText().replace("��ġ� " + String.valueOf(kimchi) + "��\n","��ġ� " + String.valueOf(kimchi+1) + "��\n"));
					result += 2000;
					kimchi += 1;
					String stew = String.valueOf(kimchi);
					countField.setText(stew);
				}
				else if(cbi == 2)
				{
					menuArea.setText(menuArea.getText().replace("���� " + String.valueOf(formal) + "��","���� " + String.valueOf(formal+1) + "��"));
					formal += 1;
					result += 2500;
					String form = String.valueOf(formal);
					countField.setText(form);
				}
				String resultStr = String.valueOf(result);
				totalTX.setText(resultStr + "��");
			}
		});
		
		cb.setBackground(Color.WHITE);
		left.setBackground(new Color(150,150,150));
		right.setBackground(new Color(150,150,150));
		leftPanel.add(cb); rightPanel.add(left); rightPanel.add(countField); rightPanel.add(right);
		totalPanel.add(leftPanel); totalPanel.add(rightPanel);
		add(totalPanel, BorderLayout.CENTER);
		
	}
	
	// �ϴ� ���̾ƿ�, ���� �̺�Ʈ ����
	
	void showSouth()
	{
		JPanel totalPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 1));
		JPanel totalTXPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 1));
		JPanel insertTXPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 3));
		JPanel insertPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 1));
		JPanel panelNorth = new JPanel(new GridLayout(2,2));
		JPanel panelSouth = new JPanel(new GridLayout(1,1));
		JPanel panel = new JPanel(new GridLayout(0,1));
		JButton pay = new JButton("����");
		
		JLabel totalLabel = new JLabel("�� ��");
		JLabel insertLabel = new JLabel("���Աݾ�");
		
		JTextField insertTX = new JTextField(15);
		insertTX.setText("0");
		insertTX.setHorizontalAlignment(JTextField.CENTER);
		totalTX.setHorizontalAlignment(JTextField.CENTER);
		totalTX.setBackground(Color.WHITE);
		totalPanel.add(totalLabel); totalTXPanel.add(totalTX); insertPanel.add(insertLabel); insertTXPanel.add(insertTX);
		totalTX.setEditable(false);
		
		
		// ���� ��ư Ŭ�� �� ��Ȳ�� �´� �̺�Ʈ �߻�
		// �޴��� �� ���� �������� ���� �� �޴� ���� �䱸
		// �ݾ��� �������� ���� �� �ݾ� ���� �䱸, ���� �Ϸ�, ���� �� ��� �뺸
		
		pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(insertTX.getText().matches(".*[0-9].*") == false)	// ���Աݾ��� ������ ��� �ݾ� ���� �䱸
				{
					if(menuArea.getText().contains("�ݾ��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�ݾ��� �������ּ���", "�ݾ��� �������ּ���"));
					}
					else if(menuArea.getText().contains("�޴��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�޴��� �������ּ���", "�ݾ��� �������ּ���"));
					}
					else if(menuArea.getText().contains("�ݾ��� �����մϴ�"))
					{
						menuArea.setText(menuArea.getText().replace("�ݾ��� �����մϴ�", "�ݾ��� �������ּ���"));
					}
					else if(menuArea.getText().contains("���� �Ϸ�"))
					{
						menuArea.setText(menuArea.getText().replace("���� �Ϸ�", "�ݾ��� �������ּ���"));
					}
					else
						menuArea.append("\n�ݾ��� �������ּ���");
				}
				else if(pork == 0 && kimchi == 0 && formal ==0)			// �޴��� �ƹ��͵� ���� �ʾ��� ��� �޴� ���� �䱸
				{
					if(menuArea.getText().contains("�޴��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�޴��� �������ּ���", "�޴��� �������ּ���"));
					}
					else if(menuArea.getText().contains("�ݾ��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�ݾ��� �������ּ���", "�޴��� �������ּ���"));
					}
					else if(menuArea.getText().contains("���� �Ϸ�"))
					{
						menuArea.setText(menuArea.getText().replace("���� �Ϸ�", "�޴��� �������ּ���"));
					}
					else if(menuArea.getText().contains("�ݾ��� �����մϴ�"))
					{
						menuArea.setText(menuArea.getText().replace("�ݾ��� �����մϴ�", "�޴��� �������ּ���"));
					}
					else
						menuArea.append("\n�޴��� �������ּ���");
				}
				else if(Integer.parseInt(insertTX.getText()) == 0)		// ���Աݾ��� �ʱⰪ�� 0�� ��� �ݾ� ���� �䱸
					if(menuArea.getText().contains("�ݾ��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�ݾ��� �������ּ���", "�ݾ��� �������ּ���"));
					}
					else if(menuArea.getText().contains("�޴��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�޴��� �������ּ���", "�ݾ��� �������ּ���"));
					}
					else if(menuArea.getText().contains("�ݾ��� �����մϴ�"))
					{
						menuArea.setText(menuArea.getText().replace("�ݾ��� �����մϴ�", "�ݾ��� �������ּ���"));
					}
					else if(menuArea.getText().contains("���� �Ϸ�"))
					{
						menuArea.setText(menuArea.getText().replace("���� �Ϸ�", "�ݾ��� �������ּ���"));
					}
					else
						menuArea.append("\n�ݾ��� �������ּ���");
				else if(Integer.parseInt(insertTX.getText()) >= result)	// ���Աݾ��� �Ѿ׺��� ���� �� ���� ���� ǥ��
				{
					if(menuArea.getText().contains("���� �Ϸ�"))
						menuArea.setText(menuArea.getText().replace("���� �Ϸ�", "���� �Ϸ�"));
					else if(menuArea.getText().contains("�޴��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�޴��� �������ּ���", "���� �Ϸ�"));
					}
					else if(menuArea.getText().contains("�ݾ��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�ݾ��� �������ּ���", "���� �Ϸ�"));
					}
					else if(menuArea.getText().contains("�ݾ��� �����մϴ�"))
						menuArea.setText(menuArea.getText().replace("�ݾ��� �����մϴ�", "���� �Ϸ�"));
					else
						menuArea.append("\n���� �Ϸ�");
				}
				else {												// ���Աݾ��� �Ѿ׺��� ���� �� �ݾ��� �����ϴٰ� �˸�
					if(menuArea.getText().contains("���� �Ϸ�"))
						menuArea.setText(menuArea.getText().replace("���� �Ϸ�", "�ݾ��� �����մϴ�"));
					else if(menuArea.getText().contains("�޴��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�޴��� �������ּ���", "�ݾ��� �����մϴ�"));
					}
					else if(menuArea.getText().contains("�ݾ��� �������ּ���"))
					{
						menuArea.setText(menuArea.getText().replace("�ݾ��� �������ּ���", "�ݾ��� �����մϴ�"));
					}
					else if(menuArea.getText().contains("�ݾ��� �����մϴ�"))
						menuArea.setText(menuArea.getText().replace("�ݾ��� �����մϴ�", "�ݾ��� �����մϴ�"));
					else
						menuArea.append("\n�ݾ��� �����մϴ�");
				}
			}
		});
		
		// �� ���̾ƿ� ����
		
		pay.setFont(new Font("����", Font.BOLD, 20));
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