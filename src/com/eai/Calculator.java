package com.eai;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.text.NumberFormat;
import javax.swing.border.*;
public class Calculator extends JFrame
{
	JButton button1;
	JLabel label1, label2, label3;
	JTextField textField1, textField2;
	JCheckBox dollarSign, commaSeperator;
	JRadioButton addNums, subNums, mulNums, divNums;
	JSlider howManyTimes;
	
	double num1, num2, totalCal;
	
	public static void main(String[] args) 
	{
		new Calculator();
	}
	
}
