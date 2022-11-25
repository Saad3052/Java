import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator_test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String text;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_test frame = new calculator_test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator_test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		text=" ";
		textField = new JTextField();
		textField.setBounds(0, 10, 436, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton.setBounds(10, 72, 85, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text.isEmpty())
				{
					text="1";
				}
				else
				{
					text=textField.getText()+"1";
				}
				textField.setText(text);
				
		}
	});
		btnNewButton_1.setBounds(10, 113, 85, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 154, 85, 31);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(10, 195, 85, 31);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("0");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text.isEmpty())
				{
					text="0";
				}
				else
				{
					text=textField.getText()+"0";
				}
				textField.setText(text);
			}
		});
		btnNewButton_4.setBounds(10, 236, 180, 27);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text.isEmpty())
				{
					text="2";
				}
				else
				{
					text=textField.getText()+"2";
				}
				textField.setText(text);
			}
		});
		btnNewButton_5.setBounds(105, 113, 85, 31);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(105, 159, 85, 21);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(105, 200, 85, 21);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("/");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text.isEmpty())
				{
					JOptionPane.showMessageDialog( null,"error");
				}
				else
				{
					text=textField.getText()+"/";
				}
				textField.setText(text);
			}
		});
		btnNewButton_8.setBounds(105, 77, 85, 21);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("*");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog( null,"error");
				}
				else
				{
					text=textField.getText()+"*";
				}
				textField.setText(text);
			
			}
		});
		btnNewButton_9.setBounds(200, 77, 85, 21);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"error");
				}
				else
				{
					text=textField.getText()+"-";
				}
				textField.setText(text);
			}
		});
		btnNewButton_10.setBounds(316, 72, 85, 21);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(200, 118, 85, 21);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setBounds(200, 159, 85, 21);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setBounds(200, 200, 85, 21);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton(".");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"error");
				}
				else
				{
					text=textField.getText()+".";
				}
				textField.setText(text);

			
			}
		});
		btnNewButton_14.setBounds(200, 239, 85, 21);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"error");
				}
				else
				{
					text=textField.getText()+"+";
				}
				textField.setText(text);
			}
		});
		btnNewButton_15.setBounds(316, 118, 85, 67);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val=textField.getText();
				String arr[];
				if(val.contains("+"))
				{
					arr=val.split("\\+");
					double n1,n2,ans;
					n1=Double.parseDouble(arr[0]);
					n2=Double.parseDouble(arr[1]);
					ans=n1+n2;
					textField.setText(String.valueOf(ans));
				}
				else if(val.contains("-"))
				{
					arr=val.split("-");
					double n1,n2,ans;
					n1=Double.parseDouble(arr[0]);
					n2=Double.parseDouble(arr[1]);
					ans=n1-n2;
					textField.setText(String.valueOf(ans));
				}
				else if(val.contains("*"))
				{
					arr=val.split("\\*");
					double n1,n2,ans;
					n1=Double.parseDouble(arr[0]);
					n2=Double.parseDouble(arr[1]);
					ans=n1*n2;
					textField.setText(String.valueOf(ans));
				}
				else if(val.contains("/"))
				{
					arr=val.split("/");
					double n1,n2,ans;
					n1=Double.parseDouble(arr[0]);
					n2=Double.parseDouble(arr[1]);
					ans=n1/n2;
					textField.setText(String.valueOf(ans));
				}
			}
		});
		btnNewButton_16.setBounds(316, 200, 85, 60);
		contentPane.add(btnNewButton_16);
	}
}
