import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textdisplay;
	
	double firstnum;
	double secondnum;
	double thirdnum;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 134, 545, 402);
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1);
		
		JButton button_0 = new JButton("0");
		button_0.setBounds(35, 334, 68, 45);
		button_0.setBackground(new Color(204, 204, 255));
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=textdisplay.getText()+button_0.getText();
				textdisplay.setText(iNum);
			}
		});
		panel_1.setLayout(null);
		button_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_0);
		
		JButton button_dot = new JButton(".");
		button_dot.setBounds(113, 334, 68, 45);
		button_dot.setBackground(new Color(102, 204, 204));
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textdisplay.setText(textdisplay.getText()+".");
			}
		});
		button_dot.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_dot);
		
		JButton btnNewButton_1_2 = new JButton("\u03C0");
		btnNewButton_1_2.setBounds(191, 335, 68, 45);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				double ops;
				ops=Math.PI;
				textdisplay.setText(String.valueOf(ops));	
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_2.setBackground(new Color(102, 204, 204));
		panel_1.add(btnNewButton_1_2);
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(35, 281, 68, 45);
		button_1.setBackground(new Color(204, 204, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=textdisplay.getText()+button_1.getText();
				textdisplay.setText(iNum);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_1);
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(35, 226, 68, 45);
		button_4.setBackground(new Color(204, 204, 255));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=textdisplay.getText()+button_4.getText();
				textdisplay.setText(iNum);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_4);
		
		JButton button_7 = new JButton("7");
		button_7.setBounds(35, 172, 68, 45);
		button_7.setBackground(new Color(204, 204, 255));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum=textdisplay.getText()+button_7.getText();
				textdisplay.setText(iNum);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_7);
		
		JButton btnNewButton_1_6 = new JButton("X !");
		btnNewButton_1_6.setBounds(35, 120, 68, 45);
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=1,i;
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				for(i=1;i<=(int)ops;i++) {
					a=a*i;
				}
				textdisplay.setText(String.valueOf(a));
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_6.setBackground(new Color(102, 204, 204));
		panel_1.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("X^3");
		btnNewButton_1_7.setBounds(113, 65, 68, 45);
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=ops*ops*ops;
				textdisplay.setText(String.valueOf(ops));	
				
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_7.setBackground(new Color(102, 204, 204));
		panel_1.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("X^-1");
		btnNewButton_1_8.setBounds(35, 10, 68, 45);
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=1/ops;
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_8.setBackground(new Color(102, 204, 204));
		panel_1.add(btnNewButton_1_8);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(113, 280, 68, 45);
		button_2.setBackground(new Color(204, 204, 255));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=textdisplay.getText()+button_2.getText();
				textdisplay.setText(iNum);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_2);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(113, 226, 68, 45);
		button_5.setBackground(new Color(204, 204, 255));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=textdisplay.getText()+button_5.getText();
				textdisplay.setText(iNum);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_5);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(113, 172, 68, 45);
		button_8.setBackground(new Color(204, 204, 255));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=textdisplay.getText()+button_8.getText();
				textdisplay.setText(iNum);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_8);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.setBounds(191, 121, 68, 45);
		btnSqrt.setBackground(new Color(102, 204, 204));
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.sqrt(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnSqrt);
		
		JButton btnX = new JButton("x^2");
		btnX.setBounds(35, 63, 68, 45);
		btnX.setBackground(new Color(102, 204, 204));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.pow(ops,2);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(btnX);
		
		JButton btnXn = new JButton("x^n");
		btnXn.setBounds(113, 10, 68, 45);
		btnXn.setBackground(new Color(102, 204, 204));
		btnXn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(String.valueOf(textdisplay.getText()));
				textdisplay.setText("");
				operation="power";
			}
		});
		btnXn.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(btnXn);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(191, 280, 68, 45);
		button_3.setBackground(new Color(204, 204, 255));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=textdisplay.getText()+button_3.getText();
				textdisplay.setText(iNum);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_3);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(191, 226, 68, 45);
		button_6.setBackground(new Color(204, 204, 255));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=textdisplay.getText()+button_6.getText();
				textdisplay.setText(iNum);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_6);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(191, 172, 68, 45);
		button_9.setBackground(new Color(204, 204, 255));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum=textdisplay.getText()+button_9.getText();
				textdisplay.setText(iNum);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_9);
		
		JButton btnNewButton_1_18 = new JButton("10^x");
		btnNewButton_1_18.setBounds(113, 120, 68, 45);
		btnNewButton_1_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.pow(10,ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_1_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_18.setBackground(new Color(102, 204, 204));
		panel_1.add(btnNewButton_1_18);
		
		JButton button_sin = new JButton("sin");
		button_sin.setBounds(191, 64, 68, 45);
		button_sin.setBackground(new Color(102, 204, 204));
		button_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.sin(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		button_sin.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(button_sin);
		
		JButton button_equal = new JButton("=");
		button_equal.setBounds(269, 334, 68, 45);
		button_equal.setBackground(new Color(102, 204, 204));
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				
				if(operation=="+") {
					secondnum=Double.parseDouble(textdisplay.getText());
					result=firstnum+secondnum;
					textdisplay.setText(String.valueOf(result));
				}
				if(operation=="-") {
					secondnum=Double.parseDouble(textdisplay.getText());
					result=firstnum-secondnum;
					textdisplay.setText(String.valueOf(result));
				}
				if(operation=="*") {
					secondnum=Double.parseDouble(textdisplay.getText());
					result=firstnum*secondnum;
					textdisplay.setText(String.valueOf(result));
				}
				if(operation=="/") {
					secondnum=Double.parseDouble(textdisplay.getText());
					result=firstnum/secondnum;
					textdisplay.setText(String.valueOf(result));;
				}
				/*if(operation=="quadratic") {
					//second=b,first=a,third=c
					secondnum=Double.parseDouble(textdisplay.getText());
					textdisplay.setText("");
					operation="quadratic2";
				}
				if(operation=="quadratic2") {
					double det;
					double root1,root2;
					thirdnum=Double.parseDouble(textdisplay.getText());
					det=(secondnum*secondnum)-(4*firstnum*thirdnum);
					if(det>0) {
						root1= (-secondnum + Math.sqrt(det)) / (2 * firstnum);
						root2= (-secondnum - Math.sqrt(det)) / (2 * firstnum);
						textdisplay.setText("root1="+root1+", root2="+root2);
					}
					else if(det==0) {
						root1=root2=-secondnum/(2*firstnum);
						textdisplay.setText("root1="+root1+", root2="+root2);
					}
					else {
						textdisplay.setText("Imaginary roots");
					}
				}*/
				if(operation=="power") {
					double power;
					secondnum=Double.parseDouble(textdisplay.getText());
					power=Math.pow(firstnum,secondnum);
					textdisplay.setText(String.valueOf(power));
				}

			}
		});
		button_equal.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_equal);
		
		JButton button_plus = new JButton("+");
		button_plus.setBounds(269, 280, 68, 45);
		button_plus.setBackground(new Color(102, 204, 204));
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textdisplay.getText());
				textdisplay.setText("");
				operation="+";
				
			}
		});
		button_plus.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_plus);
		
		JButton button_multiply = new JButton("�");
		button_multiply.setBounds(269, 226, 68, 45);
		button_multiply.setBackground(new Color(102, 204, 204));
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textdisplay.getText());
				textdisplay.setText("");
				operation="*";
			}
		});
		button_multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_multiply);
		
		JButton button_backspace = new JButton("<--");
		button_backspace.setBounds(347, 334, 68, 45);
		button_backspace.setBackground(new Color(102, 204, 204));
		button_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace= null;
				
				if(textdisplay.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textdisplay.getText());
					strB.deleteCharAt(textdisplay.getText().length()-1);
					backspace=strB.toString();
					textdisplay.setText(backspace);
				}
			}
		});
		button_backspace.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button_backspace);
		
		JButton btnNewButton_1_26 = new JButton("aX^2+bX+c=0");
		btnNewButton_1_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*firstnum=Double.parseDouble(textdisplay.getText());
				textdisplay.setText("");
				operation="quadratic";*/
				Quadratic q=new Quadratic();
				q.setVisible(true);
			}
		});
		btnNewButton_1_26.setBounds(269, 174, 146, 45);
		btnNewButton_1_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_26.setBackground(new Color(102, 204, 204));
		panel_1.add(btnNewButton_1_26);
		
		JButton btnCos = new JButton("cos");
		btnCos.setBounds(269, 64, 68, 45);
		btnCos.setBackground(new Color(102, 204, 204));
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.cos(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(btnCos);
		
		JButton btnLog = new JButton("log");
		btnLog.setBounds(269, 10, 68, 45);
		btnLog.setBackground(new Color(102, 204, 204));
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.log10(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(btnLog);
		
		JButton btnLnx = new JButton("ln(x)");
		btnLnx.setBounds(347, 10, 68, 45);
		btnLnx.setBackground(new Color(102, 204, 204));
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.log(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnLnx.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1.add(btnLnx);
		
		JButton button_tan = new JButton("tan");
		button_tan.setBounds(347, 64, 68, 45);
		button_tan.setBackground(new Color(102, 204, 204));
		button_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.tan(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		button_tan.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(button_tan);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(425, 337, 85, 45);
		btnClear.setBackground(new Color(255, 0, 0));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textdisplay.setText("");
				operation="C";
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(btnClear);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(347, 226, 68, 45);
		btnDivide.setBackground(new Color(102, 204, 204));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			firstnum=Double.parseDouble(textdisplay.getText());
			textdisplay.setText("");
			operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnDivide);
		
		JButton button_minus = new JButton("-");
		button_minus.setBounds(347, 280, 68, 45);
		button_minus.setBackground(new Color(102, 204, 204));
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textdisplay.getText().isEmpty()) {
					textdisplay.setText("-");
				}
				else {
				firstnum=Double.parseDouble(textdisplay.getText());
				textdisplay.setText("");
				operation="-";
				}
				}
		});
		button_minus.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_1.add(button_minus);
		
		JButton btnNewButton = new JButton("cos^-1");
		btnNewButton.setBackground(new Color(102, 204, 204));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				double a;
				a=Math.acos((ops));
				textdisplay.setText(String.valueOf(a));
			}
		});
		btnNewButton.setBounds(425, 67, 85, 45);
		panel_1.add(btnNewButton);
		
		JButton btnSin = new JButton("sin^-1");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				double a;
				a=Math.asin(ops);
				textdisplay.setText(String.valueOf(a));
			}
		});
		btnSin.setBackground(new Color(102, 204, 204));
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSin.setBounds(425, 10, 85, 45);
		panel_1.add(btnSin);
		
		JButton btnSinhx = new JButton("sinh");
		btnSinhx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.sinh(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnSinhx.setBackground(new Color(102, 204, 204));
		btnSinhx.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSinhx.setBounds(425, 172, 85, 45);
		panel_1.add(btnSinhx);
		
		JButton btnTan = new JButton("tan^-1");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				double a;
				a=Math.atan((ops));
				textdisplay.setText(String.valueOf(a));
			}
		});
		btnTan.setBackground(new Color(102, 204, 204));
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTan.setBounds(425, 120, 85, 45);
		panel_1.add(btnTan);
		
		JButton btnCoshx = new JButton("cosh");
		btnCoshx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.cosh(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnCoshx.setBackground(new Color(102, 204, 204));
		btnCoshx.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCoshx.setBounds(425, 226, 85, 45);
		panel_1.add(btnCoshx);
		
		JButton btnTanhx = new JButton("tanh");
		btnTanhx.setBackground(new Color(102, 204, 204));
		btnTanhx.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTanhx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.tanh(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnTanhx.setBounds(425, 280, 85, 45);
		panel_1.add(btnTanhx);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a;
				firstnum=Double.parseDouble(textdisplay.getText());
				a=Math.exp(firstnum);
				textdisplay.setText(String.valueOf(a));
			}
		});
		btnEx.setBackground(new Color(102, 204, 204));
		btnEx.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEx.setBounds(191, 10, 68, 44);
		panel_1.add(btnEx);
		
		JButton button_percent = new JButton("%");
		button_percent.setBounds(347, 120, 68, 45);
		panel_1.add(button_percent);
		button_percent.setBackground(new Color(102, 204, 204));
		button_percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textdisplay.getText());
				result=firstnum/100;
				textdisplay.setText(String.valueOf(result));			
			}
		});
		button_percent.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnUa = new JButton("cbrt");
		btnUa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textdisplay.getText()));
				ops=Math.cbrt(ops);
				textdisplay.setText(String.valueOf(ops));
			}
		});
		btnUa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUa.setBackground(new Color(102, 204, 204));
		btnUa.setBounds(269, 120, 68, 45);
		panel_1.add(btnUa);
		
		textdisplay = new JTextField();
		textdisplay.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textdisplay.setBounds(20, 60, 545, 64);
		contentPane.add(textdisplay);
		textdisplay.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(20, 10, 545, 37);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(100, 10, 380, 17);
		panel.add(lblNewLabel);
	}
}
