import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaProject extends JFrame implements ActionListener{
	
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JButton button = new JButton("Big");
	JButton button1 = new JButton("Small");
	ImageIcon[] icon = new ImageIcon[6];
	JLabel label = new JLabel(new ImageIcon("1.jpg"));
	JLabel label1 = new JLabel(new ImageIcon("1.jpg"));
	
	JavaProject(){
		p2.setLayout(new GridLayout(1,2));
		p2.add(label);
		p2.add(label1);
		p3.setLayout(new GridLayout(1,2));
		p3.add(button);
		button.addActionListener(this);
		p3.add(button1);
		button1.addActionListener(this);
		this.add(p2, BorderLayout.CENTER);
		this.add(p3, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int n1 = (int)(Math.random() * 6) + 1;
		int n2 = (int)(Math.random() * 6) + 1;
		System.out.println(n1 + "  " + n2);
		label.setIcon(new ImageIcon(n1 + ".jpg"));
		label1.setIcon(new ImageIcon(n2 + ".jpg"));
		if(e.getSource() == button){
			if(n1 + n2 > 6)
				JOptionPane.showMessageDialog(null, "答對了");
			else
				JOptionPane.showMessageDialog(null, "答錯了");
		}
		
		else if(e.getSource() == button1){
			if(n1 + n2 < 7)
				JOptionPane.showMessageDialog(null, "答對了");
			else
				JOptionPane.showMessageDialog(null, "答錯了");
		}
	}
	public static void main(String[] args){
		Game frame = new Game();
		frame.setTitle("Game");
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
