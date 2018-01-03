import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Js extends JFrame implements ActionListener{

	JFrame frame=new JFrame("MS");
	JButton enter=new JButton();
	JButton low=new JButton();
	JButton middle=new JButton();
	JButton high=new JButton();
	JTextField text1=new JTextField();
	JTextField text2=new JTextField();
	JTextField text3=new JTextField();
	public Js() {
		
		frame.setSize(300,200);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel northPanel=new JPanel();
		northPanel.setLayout(new GridLayout(3,2));
		northPanel.add(new JLabel("请输入行数            ",SwingConstants.RIGHT));
		northPanel.add(text1);
		northPanel.add(new JLabel("请输入列数            ", SwingConstants.RIGHT));
		northPanel.add(text2);
		northPanel.add(new JLabel("请输入雷数            ", SwingConstants.RIGHT));
		northPanel.add(text3);
		
		JPanel centerPanel=new JPanel();
		centerPanel.add(enter);
		
		enter.addActionListener(this);
		enter.setText("确定");
		
		JPanel southPanel=new JPanel();
		low.addActionListener(this);
		middle.addActionListener(this);
		high.addActionListener(this);
		low.setText("初级");
		middle.setText("中级");
		high.setText("高级");
		southPanel.add(low);
		southPanel.add(middle);
		southPanel.add(high);
		
		frame.add(northPanel,BorderLayout.NORTH);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.add(southPanel, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button=(JButton)e.getSource();
		if(button.equals(enter)) {
			String s1=text1.getText();
			int row=Integer.parseInt(s1);
			String s2=text2.getText();
			int col=Integer.parseInt(s2);
			String s3=text3.getText();
			int mineCount=Integer.parseInt(s3);
			
			MineSweeper Boom=new MineSweeper(row,col,mineCount);
			Boom.run();
		}
		if(button.equals(low)) {
			MineSweeper Boom1=new MineSweeper(10,10,10);
			Boom1.run();
		}
		if(button.equals(middle)) {
			MineSweeper Boom2=new MineSweeper(16,16,40);
			Boom2.run();
		}
		if(button.equals(high)) {
			MineSweeper Boom3=new MineSweeper(16,30,99);
			Boom3.run();
		}
	}
}
public class Begin{
	public static void main(String[] args) {
		Js js =new Js();
	}
}