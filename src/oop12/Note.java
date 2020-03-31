package oop12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Note extends JFrame {

	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("파일");
	JMenu editMenu = new JMenu("편집");
	JMenu helpMenu = new JMenu("도움말");
	JTextArea textArea = new JTextArea();
	
	JMenuItem newMenuItem = new JMenuItem("새 파일");
	JMenuItem openMenuItem = new JMenuItem("열기");
	JMenuItem saveMenuItem = new JMenuItem("저장하기");
	JMenuItem exitMenuItem = new JMenuItem("끝내기");
	
	
	public Note() {
		
		setLayout(new BorderLayout());
		
		ActionListener al1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "새 파일을 엽니다");
				System.out.println("");
			}
		};
		
		JFileChooser chooser = new JFileChooser();
		
		ActionListener al2 = new ActionListener() {
			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				public void actionPerformed(ActionEvent e) {
//					chooser.showDialog(null, "파일 오픈");
//				}
//				
//			}
		};
		
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		setJMenuBar(menuBar);
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Note();
	}
}
