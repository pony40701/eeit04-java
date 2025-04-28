package tw.pony.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class GuessNumber extends JFrame {
	private JTextField input;
	private JButton guess;
	//private JTextArea log;
	private JTextPane log;
	private String answer;
	private int i;

	public GuessNumber() {
		super("猜數字遊戲");
		input = new JTextField();
		guess = new JButton("猜");
		log = new JTextPane();
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);

		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		initEvent();
		initGame();
	}

	private void initEvent() {
		guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				guess();
			}
		});
	}

	private void guess() {
		String inputText = input.getText();
		i++;
		if(!inputText.matches("^(?!.*(.).*\\1)\\d{3}$")) {
				JOptionPane.showMessageDialog(input,"請輸入三位數字");
				input.setText("");
				return;
			}
		String result = checkAB(inputText);
		StyledDocument style = log.getStyledDocument();
		Style style1 = style.addStyle("style1", null);
		StyleConstants.setForeground(style1, Color.RED);
		Style style2 = style.addStyle("style2", null);
		StyleConstants.setForeground(style2, Color.BLUE);
		Style style3 = style.addStyle("style3", null);
		StyleConstants.setForeground(style3, Color.BLACK);
		try {
		style.insertString(style.getLength(), inputText, style1);
		style.insertString(style.getLength(), " => ", style2);
		style.insertString(style.getLength(), result + "\n", style3);
		}catch(Exception e) {
			
		}
		
		
		
		//log.append(String.format("%s => %s\n", inputText, result));
			
		input.setText("");
		if (result.equals("3A0B") || i == 5) {
		    int option = JOptionPane.showConfirmDialog(null, "要重新開始嗎？", "遊戲結束", JOptionPane.YES_NO_OPTION);
		    if (option == JOptionPane.YES_OPTION) {
		        initGame();
		        i = 0;
		        log.setText("");
		    } else {
		        System.exit(0);
		    }
		}
	}
	private void initGame() {
		answer = createAnswer(3);
	}

	private String checkAB(String g) {
		int A = 0, B = 0;
		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) == g.charAt(i)) {
				A++;
			} else if (answer.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		return String.format("%dA%dB", A, B);
	}

	private static String createAnswer(int d) {
		int nums = 10;
		int[] poker = new int[nums];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;
		// 2.
		for (int i = nums - 1; i > 0; i--) {
			int rindex = (int) (Math.random() * (i + 1));
			// poker[i] <=> poker[rindex]

			int temp = poker[rindex];
			poker[rindex] = poker[i];
			poker[i] = temp;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 3; i++)
			sb.append(poker[i]);
		return sb.toString();
	}

	public static void main(String[] args) {
		new GuessNumber();
	}

}
