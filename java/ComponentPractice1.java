package ljy;

import javax.swing.*;
import java.awt.*;

public class ComponentPractice1 extends JFrame 
{
	ComponentPractice1()
	{
		setTitle("�� ���� ���ϱ�");
		
		setLayout(new BorderLayout(10, 10));
		showNorth(); showCenter(); showSouth();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 220);
		setVisible(true);
	}
	
	void showNorth()
	{
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(2, 0));
		
		JLabel l1 = new JLabel("���� ������");
		JLabel l2 = new JLabel("���� ����");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEnabled(false);
		
		p1.add(l1); p1.add(t1); p2.add(l2); p2.add(t2);
		
		panel.add(p1);
		panel.add(p2);
		
		add(panel, BorderLayout.NORTH);
	}
	
	void showCenter()
	{
		JPanel panel = new JPanel();
		
		JTextArea area = new JTextArea(30, 20);
		area.setText("�� ������ ���� ���̸� ����ϴ� ������ ��Ÿ���ϴ�");
		area.setEditable(false);
		area.setForeground(Color.RED);
		
		panel.add(area);
		
		add(panel, BorderLayout.CENTER);
		
	}
	
	void showSouth()
	{
		String[] colors = {"red", "orange", "yellow", "green", "blue", "navy blue", "purple"};
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JButton cal = new JButton("���");
		JComboBox cb = new JComboBox(colors);
		JButton reset = new JButton("����");
		
		panel.add(cal); panel.add(cb); panel.add(reset);
		cb.setSize(50,200);
		
		add(panel, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) 
	{	
		new ComponentPractice1();
	}

}
