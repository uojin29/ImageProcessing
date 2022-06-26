package com.example.yujin;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Sketch extends JMenu{
	JMenuItem line = new JMenuItem("Line");
	JMenuItem square = new JMenuItem("Square");
	JMenuItem circle = new JMenuItem("Circle");
	JMenuItem free_sketch = new JMenuItem("Pen");
	
	Sketch(String s){
		super(s);
		createSketch();
	}
	public void createSketch() {
		this.add(line);
		this.add(square);
		this.add(circle);
		this.add(free_sketch);
		
		line.addActionListener(listener);
		square.addActionListener(listener);
		circle.addActionListener(listener);
		free_sketch.addActionListener(listener);
	}
	
	ActionListener listener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String tool = e.getActionCommand();
			if(tool.equals("Pen")) {
				MainFrame.toolName = "Pen";
				MainFrame.label.setText("[Pen]");
			}
			else if(tool.equals("Line")) {
				MainFrame.toolName = "Line";
				MainFrame.label.setText("[Line]");
			}
			else if(tool.equals("Square")) {
				MainFrame.toolName = "Square";
				MainFrame.label.setText("[Square]");
			}
			else if(tool.equals("Circle")) {
				MainFrame.toolName = "Circle";
				MainFrame.label.setText("[Circle]");
			}
		}
	};
}