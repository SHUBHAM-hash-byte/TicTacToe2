package tictactoegame2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UserPanel implements ActionListener{
	JFrame jf;
	JLabel jl1,jl2,jl3;
	JTextField jt1,jt2;
	JButton jb1;
	JComboBox cb;
	UserPanel()
	{
		jf=new JFrame("TicTacToeGame By Shubham_N_Jaysingpure");
		jf.setSize(600,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		jl1=new JLabel("Enter Player 1=");
		jl1.setBounds(50,50,120,30);
		jf.add(jl1);
		
		jt1=new JTextField();
		jt1.setBounds(200,50,250,40);
		jf.add(jt1);
		
		jl2=new JLabel("Enter Player 2=");
		jl2.setBounds(50,110,120,30);
		jf.add(jl2);
		
		jt2=new JTextField();
		jt2.setBounds(200,100,250,40);
		jf.add(jt2);
		
		jl2=new JLabel("Select Series");
		jl2.setBounds(50,150,120,30);
		jf.add(jl2);
		
		String[] series= {"3","5","7","9"};
		cb=new JComboBox(series);
		cb.setBounds(200,150,250,40);
		jf.add(cb);
		
		jb1=new JButton("START GAME");
		jb1.addActionListener(this);
		jb1.setBounds(200,250,200,40);
		jf.add(jb1);
		
		
	jf.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1)
		{
			String player1=jt1.getText();
			String player2=jt2.getText();
			
			String series=(String)cb.getSelectedItem();
			
			GamePanel gp=new GamePanel(player1,player2,Integer.parseInt(series));
			gp.openGamePanel();
			jf.setVisible(false);
		}
		
	}
		
		
		

}
