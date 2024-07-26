package assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QueueGUI extends JFrame implements ActionListener{

	private JTextArea output;
	private JLabel enqueueLabel, dataLabel, dequeueLabel, peekLabel;
	private JTextField dataInput;
	private JPanel inPanel, outPanel, mainPanel;
	private JButton enqueueButton, dequeueButton, peekButton;
	private Queue<Integer> myQueue = new Queue<Integer>(); 
	private int data;
	
	public QueueGUI() {
		
		data=0;

		
		inPanel = new JPanel();
		inPanel.setLayout(new GridLayout(20,1));
		
		outPanel = new JPanel();
		outPanel.setLayout(new FlowLayout());
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		
		enqueueLabel = new JLabel("Enqueue:");
		dataLabel= new JLabel("Data:"); 
		dequeueLabel= new JLabel("Dequeue:");
		peekLabel= new JLabel("Peek:");
	
		output=new JTextArea(30,30);
	
		enqueueButton=new JButton("Enqueue!");
		enqueueButton.addActionListener(this);
		dequeueButton =new JButton("Dequeue!");
		dequeueButton.addActionListener(this);
		peekButton=new JButton("Peek!");
		peekButton.addActionListener(this);
		
	
		dataInput = new JTextField(15);
		dataInput.addActionListener(this);
	
	
		inPanel.add(enqueueLabel);
		inPanel.add(dataLabel);
		inPanel.add(dataInput);
		inPanel.add(enqueueButton);
		inPanel.add(dequeueLabel);
		inPanel.add(dequeueButton);
		inPanel.add(peekLabel);
		inPanel.add(peekButton);
		
	
	
		outPanel.add(new JScrollPane(output));

		mainPanel.add(inPanel);
		mainPanel.add(outPanel);
		this.add(mainPanel);
	
	}
 

	public void actionPerformed(ActionEvent actEvent) {
	try {
		 if(actEvent.getSource()==enqueueButton) {
			 
			 String  initialData= dataInput.getText();
			 data=Integer.parseInt(initialData);			 
			 myQueue.enqueue(data);
			 String out="Queue is composed of:\n"+myQueue.toString()+"\n";
			 output.append(out);
			 
		 }else if(actEvent.getSource()==dequeueButton) {

			 String out="Next number in line: "+ myQueue.dequeue()+"\n"+"Queue is composed of:\n"+myQueue.toString()+"\n";
			 output.append(out);
		 }else if(actEvent.getSource()==peekButton) {
			 myQueue.front();
			 String out="Peeking at next in line: "+ myQueue.front()+"\n"+"Queue is composed of:\n"+myQueue.toString()+"\n";
			 output.append(out);
		 }
		 
		 
	}catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Try again!");
	}	 
			 
}
		 
		 
			


 public static void main(String[] args) {

		
		QueueGUI gui = new QueueGUI();
		
		
		gui.setVisible(true); 
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		gui.setSize(600,600);  
		gui.setTitle("Doubly Linked List GUI"); 
		gui.setResizable(false);
	}

}
