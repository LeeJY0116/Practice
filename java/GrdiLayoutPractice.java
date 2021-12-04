package ljy;

import javax.swing.*;

import java.awt.Color;
import java.awt.GridLayout;

public class GrdiLayoutPractice extends JFrame {	
	GrdiLayoutPractice()
	{
		setTitle("연습 문제!");
		setLayout(new GridLayout(0,3));
		JPanel p1 = new JPanel();
		p1.setBackground(Color.RED);
		p1.setSize(100,300);
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3,0));
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(4,0));
		JPanel p21 = new JPanel();
		p21.setBackground(Color.YELLOW);
		JPanel p22 = new JPanel();
		p22.setBackground(Color.BLUE);
		JPanel p23 = new JPanel();
		p23.setBackground(Color.BLACK);
		JPanel p31 = new JPanel();
		p31.setBackground(Color.GREEN);
		JPanel p32 = new JPanel();
		p32.setBackground(Color.GREEN);
		JPanel p33 = new JPanel();
		p33.setBackground(Color.GREEN);
		JPanel p34 = new JPanel();
		p34.setBackground(Color.ORANGE);
		add(p1);
		add(p2);
		add(p3);
		p2.add(p21);
		p2.add(p22);
		p2.add(p23);
		p3.add(p31);
		p3.add(p32);
		p3.add(p33);
		p3.add(p34);
		setSize(300, 300);
		setVisible(true);	
	}

	public static void main(String[] args) {
		new GrdiLayoutPractice();
	}

}
