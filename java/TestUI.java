package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestUI extends JFrame 
{
	JTextField totalTX = new JTextField(10);
	String[] menus = {"������", "��ġ�", "����"};
	JComboBox cb = new JComboBox(menus);
	int pork = 0;
	int kimchi = 0;
	int formal = 0;
	int result = 0;
	int [] prices = {3000,2000,2500};
	JTextArea area = new JTextArea(4, 35);
	TestUI()
	{
		setTitle("��������");
		
		setLayout(new BorderLayout(10, 10));
		showNorth(); showCenter(); showSouth();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}
	
	void showNorth()
	{
		JPanel panel = new JPanel();
		

		area.setText("������ 0��\n��ġ� 0��\n���� 0��");
		area.setEditable(false);
		area.setForeground(Color.BLACK);
		panel.add(area);
		
		add(panel, BorderLayout.NORTH);
	}
	
	void showCenter()
	{
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 1));
		JButton left = new JButton("<");
		left.setSize(1, 3);
		JButton right = new JButton(">");
		right.setSize(1,4);
		JTextArea area2 = new JTextArea("", 1, 6);
		area2.setEditable(false);
		
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prices = cb.getSelectedItem().toString();
				int cbi = cb.getSelectedIndex();
				String cutlet = String.valueOf(pork);
				String stew = String.valueOf(kimchi);
				String form = String.valueOf(formal);
				
				if( cbi == 0)
					area2.setText(cutlet);
				else if(cbi == 1)
					area2.setText(stew);
				else
					area2.setText(form);
				
			}
		});
		
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cbi = cb.getSelectedIndex();			
				if(cbi == 0)
				{
					if(pork > 0)
					{
						pork -= 1;
						String cutlet = String.valueOf(pork);
						area.setText("������" + cutlet + "��");
						result -= 3000;	
						area2.setText(cutlet);
					}
				}
				else if(cbi == 1)
				{
					if(kimchi > 0)
					{
						kimchi -= 1;	
						String stew = String.valueOf(kimchi);
						area.setText("��ġ�" + stew + "��");
						result -= 2000;
						area2.setText(stew);
					}
				}
				else if(cbi == 2)
				{
					if(formal > 0)
					{
					formal -= 1;
					String form = String.valueOf(formal);
					area.setText("����" + form + "��");
					result -= 2500;
					area2.setText(form);
					}
				}
				String str2 = String.valueOf(result);
				totalTX.setText(str2);
				
			}
		});
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cbi = cb.getSelectedIndex();
				if(cbi == 0)
				{
					pork += 1;
					String cutlet = String.valueOf(pork);
					area.setText("������" + cutlet + "��");
					area.append(area.getText());
					result += 3000;
					area2.setText(cutlet);
				}
				else if(cbi == 1)
				{
					kimchi += 1;
					String stew = String.valueOf(kimchi);
					area.setText("��ġ�" + stew + "��");
					result += 2000;
					area2.setText(stew);
				}
				else if(cbi == 2)
				{
					formal += 1;
					String form = String.valueOf(formal);
					area.append("����" + form + "��");
					result += 2500;
					area2.setText(form);
				}
				String str2 = String.valueOf(result);
				totalTX.setText(str2);
			}
		});

		panel.add(cb); panel.add(left); panel.add(area2); panel.add(right);
		
		add(panel, BorderLayout.CENTER);
		
	}
	
	void showSouth()
	{
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(3,0));
		JButton pay = new JButton("����");
		
		JLabel totalLabel = new JLabel("�� ��");
		JLabel insertLabel = new JLabel("���Աݾ�");
		
		JTextField insertTX = new JTextField(10);
		p1.add(totalLabel); p1.add(totalTX); p2.add(insertLabel); p2.add(insertTX);
		totalTX.setEditable(false);
		
		
		pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(insertTX.getText()) >= result)
					area.append("\n���� �Ϸ�");
				else
					area.append("\n�ݾ��� �����մϴ�.");
			}
		});
		
		panel.add(p1);
		panel.add(p2);
		panel.add(pay);
		
		add(panel, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) 
	{	
		new TestUI();
	}

}
