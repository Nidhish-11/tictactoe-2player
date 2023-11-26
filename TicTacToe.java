import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TicTacToe implements ActionListener
{
	Frame f;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	int p=1;
	String Win;
	TextField t1,t2;
	TicTacToe()
	{
		f=new Frame();
		f.setLayout(null);
		f.setSize(400,500);
		//f.setUndecorated(true);
		Label l1=new Label("Enter 1st player name");
		l1.setBounds(10,50,150,20);
		f.add(l1);
		Label l2=new Label("Enter 2nd player name");
		l2.setBounds(10,90,150,20);
		f.add(l2);
		t1=new TextField();
		t1.setBounds(200,50,100,20);
		f.add(t1);
		t2=new TextField();
		t2.setBounds(200,90,100,20);
		f.add(t2);
		b1=new JButton("1");
		b1.setBounds(50,200,50,50);
		f.add(b1);
		b2=new JButton("2");
		b2.setBounds(150,200,50,50);
		f.add(b2);
		b3=new JButton("3");
		b3.setBounds(250,200,50,50);
		f.add(b3);
		b4=new JButton("4");
		b4.setBounds(50,300,50,50);
		f.add(b4);
		b5=new JButton("5");
		b5.setBounds(150,300,50,50);
		f.add(b5);
		b6=new JButton("6");
		b6.setBounds(250,300,50,50);
		f.add(b6);
		b7=new JButton("7");
		b7.setBounds(50,400,50,50);
		f.add(b7);
		b8=new JButton("8");
		b8.setBounds(150,400,50,50);
		f.add(b8);
		b9=new JButton("9");
		b9.setBounds(250,400,50,50);
		f.add(b9);
		b10=new JButton("Confirm");
		b10.setBounds(70,130,100,20);
		f.add(b10);
		b11=new JButton("Reset");
		b11.setBounds(200,130,100,20);
		f.add(b11);
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();
		String chk[]=new String[10];
		if(ob==b10)
		{
			t1.setEnabled(false);
			t2.setEnabled(false);
		}
		else if(ob==b11)
		{
			t1.setEnabled(true);
			t2.setEnabled(true);
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			t1.setText(null);
			t2.setText(null);
			b1.setText("1");
			b2.setText("2");
			b3.setText("3");
			b4.setText("4");
			b5.setText("5");
			b6.setText("6");
			b7.setText("7");
			b8.setText("8");
			b9.setText("9");
			p=1;
		}
		else if(p==1 || p==3 || p==5 || p==7 || p==9)
		{
			if(ob==b1)
			{
				b1.setText("X");
				b1.setEnabled(false);
			}
			else if(ob==b2)
			{
				b2.setText("X");
				b2.setEnabled(false);
			}
			else if(ob==b3)
			{
				b3.setText("X");
				b3.setEnabled(false);
			}
			else if(ob==b4)
			{
				b4.setText("X");
				b4.setEnabled(false);
			}
			else if(ob==b5)
			{
				b5.setText("X");
				b5.setEnabled(false);
			}
			else if(ob==b6)
			{
				b6.setText("X");
				b6.setEnabled(false);
			}
			else if(ob==b7)
			{
				b7.setText("X");
				b7.setEnabled(false);
			}
			else if(ob==b8)
			{
				b8.setText("X");
				b8.setEnabled(false);
			}
			else if(ob==b9)
			{
				b9.setText("X");
				b9.setEnabled(false);
			}
			p++;
		}
		else
		{
			if(ob==b1)
			{
				b1.setText("O");
				b1.setEnabled(false);
			}
			else if(ob==b2)
			{
				b2.setText("O");
				b2.setEnabled(false);
			}
			else if(ob==b3)
			{
				b3.setText("O");
				b3.setEnabled(false);
			}
			else if(ob==b4)
			{
				b4.setText("O");
				b4.setEnabled(false);
			}
			else if(ob==b5)
			{
				b5.setText("O");
				b5.setEnabled(false);
			}
			else if(ob==b6)
			{
				b6.setText("O");
				b6.setEnabled(false);
			}
			else if(ob==b7)
			{
				b7.setText("O");
				b7.setEnabled(false);
			}
			else if(ob==b8)
			{
				b8.setText("O");
				b8.setEnabled(false);
			}
			else if(ob==b9)
			{
				b9.setText("O");
				b9.setEnabled(false);
			}
			p++;
		}
		chk[0]=b1.getText();
		chk[1]=b2.getText();
		chk[2]=b3.getText();
		chk[3]=b4.getText();
		chk[4]=b5.getText();
		chk[5]=b6.getText();
		chk[6]=b7.getText();
		chk[7]=b8.getText();
		chk[8]=b9.getText();
		if(chk[0]=="X" && chk[1]=="X" && chk[2]=="X")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[0]=="X" && chk[3]=="X" && chk[6]=="X")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[0]=="X" && chk[4]=="X" && chk[8]=="X")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[3]=="X" && chk[4]=="X" && chk[5]=="X")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[6]=="X" && chk[7]=="X" && chk[8]=="X")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[1]=="X" && chk[4]=="X" && chk[7]=="X")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[2]=="X" && chk[5]=="X" && chk[8]=="X")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[2]=="X" && chk[4]=="X" && chk[6]=="X")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[0]=="O" && chk[1]=="O" && chk[2]=="O")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[0]=="O" && chk[3]=="O" && chk[6]=="O")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[0]=="O" && chk[4]=="O" && chk[8]=="O")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[3]=="O" && chk[4]=="O" && chk[5]=="O")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[6]=="O" && chk[7]=="O" && chk[8]=="O")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[1]=="O" && chk[4]=="O" && chk[7]=="O")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[2]=="O" && chk[5]=="O" && chk[8]=="O")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
		else if(chk[2]=="O" && chk[4]=="O" && chk[6]=="O")
		{
			if(p==1 || p==3 || p==5 || p==7)
			Win=t2.getText();
			else
			Win=t1.getText();
			System.out.print(""+Win);
			JOptionPane.showMessageDialog(f,Win+" wins");
		}
	}
	public static void main(String z[])
	{
		new TicTacToe();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                           