package u10.tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Client extends JFrame {
	public static int PORT = 9997;
	public static String IP = "";
	
	private int turn = 0;
	private ImageIcon x = new ImageIcon("image/x.jpg");
	private ImageIcon o = new ImageIcon("image/o.jpg");
	private JButton_Mine b1 = new JButton_Mine();
	private JButton_Mine b2 = new JButton_Mine();
	private JButton_Mine b3 = new JButton_Mine();
	private JButton_Mine b4 = new JButton_Mine();
	private JButton_Mine b5 = new JButton_Mine();
	private JButton_Mine b6 = new JButton_Mine();
	private JButton_Mine b7 = new JButton_Mine();
	private JButton_Mine b8 = new JButton_Mine();
	private JButton_Mine b9 = new JButton_Mine();

	private JButton_Mine[] jbt = { b1, b2, b3, b4, b5, b6, b7, b8, b9 };

	public Client() {
		setLayout(new GridLayout(3, 3, 1, 1));
		setBackground(Color.WHITE);
		for (int i = 0; i < jbt.length; i++) {
			JLabel pic = new JLabel();
			add(jbt[i]);

		}
	}

	public void startGame() {
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				addPic(b1);
				Toolkit.getDefaultToolkit().beep();
				return;
			}
		});
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				addPic(b2);
				Toolkit.getDefaultToolkit().beep();
				return;
			}
		});
		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				addPic(b3);
				Toolkit.getDefaultToolkit().beep();
				return;
			}
		});
		b4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				addPic(b4);
				Toolkit.getDefaultToolkit().beep();

				return;
			}
		});
		b5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				addPic(b5);
				Toolkit.getDefaultToolkit().beep();

				return;
			}
		});
		b6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				addPic(b6);
				Toolkit.getDefaultToolkit().beep();

				return;
			}
		});
		b7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				addPic(b7);
				Toolkit.getDefaultToolkit().beep();

				return;
			}
		});
		b8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				addPic(b8);
				Toolkit.getDefaultToolkit().beep();

				return;
			}
		});
		b9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				addPic(b9);
				Toolkit.getDefaultToolkit().beep();

				return;
			}
		});
	}

	public void addPic(JButton_Mine b) {
		if (b.isEditable()) {
			if (turn % 2 != 0) {
				ImageIcon icon = x;
				Image img = icon.getImage();
				Image newimg = img.getScaledInstance(170, 170,
						Image.SCALE_SMOOTH);
				icon.setImage(newimg);
				b.setIcon(icon);
				b.setBackground(Color.WHITE);

				b.setName("x");
			} else {
				ImageIcon icon = o;
				Image img = icon.getImage();
				Image newimg = img.getScaledInstance(170, 170,
						Image.SCALE_SMOOTH);
				icon.setImage(newimg);
				b.setIcon(icon);
				b.setBackground(Color.WHITE);

				b.setName("o");
			}
			turn++;
			System.out.println(turn);
			b.setEditable(false);
			checkWin();
			System.out.println(b.getName());
		}
	}

	public void checkWin() {
		String winner = null;
		Color c;
		if ((b1.getName() == "x" && b2.getName() == "x" && b3.getName() == "x")
				|| (b4.getName() == "x" && b5.getName() == "x" && b6.getName() == "x")
				|| (b7.getName() == "x" && b8.getName() == "x" && b9.getName() == "x")
				|| (b1.getName() == "x" && b4.getName() == "x" && b7.getName() == "x")
				|| (b2.getName() == "x" && b5.getName() == "x" && b8.getName() == "x")
				|| (b3.getName() == "x" && b6.getName() == "x" && b9.getName() == "x")
				|| (b1.getName() == "x" && b5.getName() == "x" && b9.getName() == "x")
				|| (b3.getName() == "x" && b5.getName() == "x" && b7.getName() == "x")) {
			winner = "X Wins!";
			c = Color.BLACK;
			Toolkit.getDefaultToolkit().beep();

		} else if ((b1.getName() == "o" && b2.getName() == "o" && b3.getName() == "o")
				|| (b4.getName() == "o" && b5.getName() == "o" && b6.getName() == "o")
				|| (b7.getName() == "o" && b8.getName() == "o" && b9.getName() == "o")
				|| (b1.getName() == "o" && b4.getName() == "o" && b7.getName() == "o")
				|| (b2.getName() == "o" && b5.getName() == "o" && b8.getName() == "o")
				|| (b3.getName() == "o" && b6.getName() == "o" && b9.getName() == "o")
				|| (b1.getName() == "o" && b5.getName() == "o" && b9.getName() == "o")
				|| (b3.getName() == "o" && b5.getName() == "o" && b7.getName() == "o")) {
			winner = "O Wins!";
			c = Color.PINK;
			Toolkit.getDefaultToolkit().beep();

		} else if (turn == 9) {
			winner = "Tie!";
			c = Color.decode("#7AF5C8");
		} else {
			return;
		}
		remove(b1);
		remove(b2);
		remove(b3);
		remove(b4);
		remove(b5);
		remove(b6);
		remove(b7);
		remove(b8);
		remove(b9);
		setLayout(new GridLayout(1, 1));
		setSize(400, 400);
		Font font = new Font("Arial", 1, 88);
		JLabel l = new JLabel(winner, SwingConstants.CENTER);
		l.setFont(font);
		l.setForeground(c);
		add(l);
	}

	public static void main(String[] args) {
		Client frame = new Client();
		frame.setTitle("TicTacTo");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.startGame();
	}
}