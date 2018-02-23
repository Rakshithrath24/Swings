package com.eai;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
public class Solution extends JFrame 
{

	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	int buttonClicked;
	public Solution() 
	{
		this.setSize(400,400);
		//this.setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		
		int xPos = (dim.width/2)-(this.getWidth()/2);
		int yPos = (dim.height/2)-(this.getHeight()/2);
		
		this.setLocation(xPos, yPos);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("MY FIRST FRAME");
		JPanel thepanel = new JPanel();
		
		JLabel label1 = new JLabel("Tell Me Something!");
		//label1.setText("New Text Message!");
		label1.setToolTipText("It's a Label!");
		thepanel.add(label1);
		
		textField1 = new JTextField("Type here!",15);
		//textField1.setText("Type again");
		//textField1.setColumns(10);
		textField1.setToolTipText("This is text field!" );
		thepanel.add(textField1);
		ListenForKeys lForKeys = new ListenForKeys();
		textField1.addKeyListener(lForKeys);
		
		button1 = new JButton("Send");
		//button1.setText("New Button");
		button1.setToolTipText("It's a Button!");
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		thepanel.add(button1);
		
		textArea1 = new JTextArea(15,20);
		textArea1.setText("Just Drop Your Comments here!\n");
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		//int  numOfLines = textArea1.getLineCount();
		//textArea1.append("Number of lines:"+numOfLines);
		
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		thepanel.add(scrollbar1);
		
		ListenForMouse lForMouse = new ListenForMouse();
		thepanel.addMouseListener(lForMouse);
		
		ListenForWindow lForWindow = new ListenForWindow();
		this.addWindowListener(lForWindow);
		this.add(thepanel); 
		this.setVisible(true);
		//textField1.requestFocus();
		textArea1.requestFocus();
		
	}
	
	public static void main(String[] args) 
	{
		new Solution();
	}
	
	private class ListenForButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == button1)
			{
				buttonClicked++;
				textArea1.append("Button Clicked "+buttonClicked+" times\n");
				
			}
		}
	}
	
	private class ListenForKeys implements KeyListener
	{

		@Override
		public void keyTyped(KeyEvent e) 
		{
			textArea1.append("Key Hit: "+ e.getKeyChar() +"\n");
		}

		@Override
		public void keyPressed(KeyEvent e) 
		{
			
		}

		@Override
		public void keyReleased(KeyEvent e) 
		{
			
		}
		
	}
	
	private class ListenForWindow implements WindowListener
	{

		@Override
		public void windowOpened(WindowEvent e) {
			textArea1.append("Window is Created\n");
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			textArea1.append("Window is minimized\n");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			textArea1.append("Window in Normal State\n");
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			textArea1.append("Window is Active\n");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			textArea1.append("Window is Not Active\n");
			
		}
		
	}
	
	private class ListenForMouse implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			textArea1.append("Mouse Panel pos:" + e.getX()+" "+e.getY()+"\n");
			textArea1.append("Mouse Screen pos:" + e.getXOnScreen()+" "+e.getYOnScreen()+"\n");
			textArea1.append("Mouse Button: "+e.getButton()+"\n");
			textArea1.append("Mouse Clicks: "+e.getClickCount()+"\n");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}



