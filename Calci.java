package JavaSwing1;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;

public class Calci extends JFrame {
private static int add,sub,mul,div,eql,operator=0,operator1=0;
public static JFrame f,f1;
private static double a=0,b=0,res=0,a1=0,b21=0,res1=0,sqr,inv;
	public static void calci(){
		
		JFrame f=new JFrame("KCalci");
		f.setVisible(true);
		f.setSize(300,330);
		Image icon=Toolkit.getDefaultToolkit().getImage("D:\\calci.png");
		f.setIconImage(icon);
		
		
		JPanel p=new JPanel();
		p.setLayout(null);
		f.add(p);
		
		JTextField t=new JTextField(20);
		t.setBounds(5,5,250,50);
		Font p1=new Font("Courier",Font.BOLD,20);
		t.setFont(p1);
		
		p.add(t);
		
		JButton b1=new JButton("Del");
		b1.setBounds(5,60,70,40);
		p.add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b1)
		            t.setText("");	
				}
		});
		
		JButton b2=new JButton("+");
		b2.setBounds(80,60,50,30);
		p.add(b2);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b2)
		            a=Double.parseDouble(t.getText());
				operator =1;
				t.setText("");
			}
		});
		JButton b3=new JButton("-");
		b3.setBounds(140,60,50,30);
		p.add(b3);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b3)
		            a=Double.parseDouble(t.getText());
				operator=2;
				t.setText("");
			}
		});
		
		JButton b4=new JButton("/");
		b4.setBounds(200,60,50,30);
		p.add(b4);
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b4)
		            a=Double.parseDouble(t.getText());
				operator=3;
				t.setText("");
			}
		});
		
		JButton b5=new JButton("*");
		b5.setBounds(200,110,50,30);
		p.add(b5);
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b5)
		            a=Double.parseDouble(t.getText());
				operator=4;
				t.setText("");
			}
		});
		
		JButton b6=new JButton("7");
		b6.setBounds(5,110,50,30);
		p.add(b6);
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b6)
		           t.setText(t.getText().concat("7"));
			}
		});
		
		JButton b7=new JButton("8");
		b7.setBounds(70,110,50,30);
		p.add(b7);
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b7)
		           t.setText(t.getText().concat("8"));
			}
		});
		
		JButton b8=new JButton("9");
		b8.setBounds(130,110,50,30);
		p.add(b8);
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			if(e.getSource()==b8)
			t.setText(t.getText().concat("9"));
			}
		});
		
		
		JButton b9=new JButton("4");
		b9.setBounds(5,150,50,30);
		p.add(b9);
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			if(e.getSource()==b9)
			t.setText(t.getText().concat("4"));
			}
		});
		
		
		JButton b10=new JButton("5");
		b10.setBounds(70,150,50,30);
		p.add(b10);
		b10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b10)
		           t.setText(t.getText().concat("5"));
			}
		});
		
		
		JButton b11=new JButton("6");
		b11.setBounds(130,150,50,30);
		p.add(b11);
		b11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b11)
		           t.setText(t.getText().concat("6"));
			}
		});
		
		
		JButton b12=new JButton("1");
		b12.setBounds(5,190,50,30);
		p.add(b12);
		
		b12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b12)
		           t.setText(t.getText().concat("1"));
			}
		});
		
		JButton b13=new JButton("2");
		b13.setBounds(70,190,50,30);
		p.add(b13);
		b13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b13)
		           t.setText(t.getText().concat("2"));
			}
		});
		
		
		JButton b14=new JButton("3");
		b14.setBounds(130,190,50,30);
		p.add(b14);
		b14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b14)
		           t.setText(t.getText().concat("3"));
			}
		});
		
		
		JButton b15=new JButton("0");
		b15.setBounds(5,230,70,30);
		p.add(b15);
		b15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b15)
		           t.setText(t.getText().concat("0"));
			}
		});
		
		
		JButton b16=new JButton(".");
		b16.setBounds(100,230,50,30);
		p.add(b16);
		b16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b16)
		           t.setText(t.getText().concat("."));
			}
		});
		
		
		JButton b17=new JButton("=");
		b17.setBounds(200,150,50,100);
		p.add(b17);
		b17.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b17){
					b=Double.parseDouble(t.getText());
					switch(operator){
					case 1:res=a+b;
					
					break;
					
					case 2:res=a-b;
					
					break;
					
					case 3:res=a/b;
					
					break;
					
					case 4:res=a*b;
					
					break;
					
						
					}
					t.setText(""+res);	
				}
				
			}
			
		});
		
		JMenuBar m=new JMenuBar();
		f.setJMenuBar(m);
		m.add(Box.createHorizontalStrut(10));
		
		JMenu m1=new JMenu("View");
		m.add(m1);
		m1.add(Box.createHorizontalBox());
		m1.add(Box.createVerticalBox());
		JMenu m2=new JMenu("Edit");
		m.add(m2);
		
		JMenu m3=new JMenu("Help");
		m.add(m3);
		
		JMenuItem mi=new JMenuItem("Standard");
		m1.add(mi);
		 Action aa2=new AbstractAction("Standard"){

			@Override
			public void actionPerformed(ActionEvent a) {
				if(a.getSource()==mi){
					
					f.setVisible(true);
					f1.dispose();
				}
				
			}
			 
		 };
		 aa2.putValue(Action.MNEMONIC_KEY,KeyEvent.VK_F4);
		 aa2.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_F4,KeyEvent.ALT_DOWN_MASK));
		 mi.setAction(aa2);
		

		
		JMenuItem mi1=new JMenuItem("Scientific");
		m1.add(mi1);
		Action aa1=new AbstractAction("Scientific"){

			@Override
			public void actionPerformed(ActionEvent a) {
				if(a.getSource()==mi1){
					
					
					f.dispose();
					f1.setVisible(true);
				}
				
			}
			 
		 };
		 aa1.putValue(Action.MNEMONIC_KEY,KeyEvent.VK_F3);
		 aa1.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_F3,KeyEvent.ALT_DOWN_MASK));
		 mi1.setAction(aa1);
		
		mi1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent a) {
				
				
				if(a.getSource()==mi1){
					
			
					
					JFrame f1=new JFrame("KCalci");
					f1.setVisible(true);
					f1.setSize(390,450);
					
					Image icon=Toolkit.getDefaultToolkit().getImage("D:\\calcu.png");
					f1.setIconImage(icon);
					
					JPanel pp=new JPanel();
					pp.setLayout(null);
					f1.add(pp);
			
					JTextField t4=new JTextField(20);
					t4.setBounds(5,5,370,90);
					Font p11=new Font("Courier",Font.BOLD,20);
					t4.setFont(p11);
					pp.add(t4);
					
					JRadioButton b0=new JRadioButton("Degree");
					b0.setBounds(5,110,90,20);
					pp.add(b0);
					b0.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b0){
								a1=Math.toDegrees(Double.parseDouble(t4.getText()));
								
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});

					
					JRadioButton b01=new JRadioButton("Radian");
					b01.setBounds(5,140,90,20);
					pp.add(b01);
					b01.addActionListener(new ActionListener(){
					
						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b01){
						
								a1=Math.toRadians(Double.parseDouble(t4.getText()));
								
								t4.setText("");
								t4.setText(t4.getText()+a1);
								}								
							}
							
						
						
					});

					
					
					JButton b202=new JButton("C");
					b202.setBounds(105,105,70,30);
					pp.add(b202);
					b202.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b202){
								
								t4.setText("");
								
								
							}
							
						}
						
					});
					
					JButton b214=new JButton("Exp");
					b214.setBounds(190,105,70,30);
					pp.add(b214);
					b214.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b214){
								a1=Math.exp(Double.parseDouble(t4.getText()));
								t4.setText("");
								t4.setText(t4.getText()+a1);
							}
							
						}
						
					});
					
					JButton b215=new JButton("Sqr");
					b215.setBounds(270,105,70,30);
					pp.add(b215);
					b215.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b215){
								a1=Double.parseDouble(t4.getText());
								sqr=a1*a1;
								t4.setText(""+sqr);
							}
							
						}
						
					});
					
					JButton b216=new JButton("1/x");
					b216.setBounds(270,140,70,30);
					pp.add(b216);
					b216.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b216){
								a1=Double.parseDouble(t4.getText());
								inv=1/a1;
								t4.setText(""+inv);
							}
							
						}
						
					});
				
					
					
					JButton b203=new JButton("Sqrt");
					b203.setBounds(105,138,70,30);
					pp.add(b203);
					b203.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b203){
								a1=Math.sqrt(Double.parseDouble(t4.getText()));
								
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
				
					JButton b204=new JButton("Ceil");
					b204.setBounds(190,138,70,30);
					pp.add(b204);
					b204.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b204){
								a1=Math.ceil(Double.parseDouble(t4.getText()));
								
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
				
					
					
					JButton b02=new JButton("sin");
					b02.setBounds(5,180,70,30);
					pp.add(b02);
					b02.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b02){
								a1=Math.sin(Double.parseDouble(t4.getText()));
								operator1=1;
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
					JButton b03=new JButton("cos");
					b03.setBounds(5,220,70,30);
					pp.add(b03);
					b03.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b03){
								a1=Math.cos(Double.parseDouble(t4.getText()));
								operator1=2;
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
					
					JButton b04=new JButton("tan");
					b04.setBounds(5,260,70,30);
					pp.add(b04);
					b04.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b04){
								a1=Math.atan(Double.parseDouble(t4.getText()));
								operator1=3;
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
				
					JButton b05=new JButton("In");
					b05.setBounds(5,300,70,30);
					pp.add(b05);
					b05.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b05){
								a1=Math.log(Double.parseDouble(t4.getText()));
								operator1=4;
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
					JButton b06=new JButton("sinh");
					b06.setBounds(100,180,70,30);
					pp.add(b06);
					b06.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b06){
								a1=Math.sinh(Double.parseDouble(t4.getText()));
								operator1=5;
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
					JButton b07=new JButton("cosh");
					b07.setBounds(100,220,70,30);
					pp.add(b07);
					b07.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b07){
								a1=Math.cosh(Double.parseDouble(t4.getText()));
								operator1=6;
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
					JButton b08=new JButton("tanh");
					b08.setBounds(100,260,70,30);
					pp.add(b08);
					b08.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b08){
								a1=Math.tanh(Double.parseDouble(t4.getText()));
								operator1=7;
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
					JButton b09=new JButton("Inv");
					b09.setBounds(100,300,70,30);
					pp.add(b09);
					b09.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b09){
								a1=Math.log10(Double.parseDouble(t4.getText()));
								operator1=8;
								t4.setText("");
								t4.setText(t4.getText()+a1);
								
							}
							
						}
						
					});
				
					
					JButton b10=new JButton("7");
					b10.setBounds(180,180,50,30);
					pp.add(b10);
					b10.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b10){
								t4.setText(t4.getText().concat("7"));
							}
							
						}
						
					});
				
					
					JButton b11=new JButton("4");
					b11.setBounds(180,220,50,30);
					pp.add(b11);
					b11.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b11){
								t4.setText(t4.getText().concat("4"));
							}
							
						}
						
					});
				
					
					JButton b12=new JButton("1");
					b12.setBounds(180,260,50,30);
					pp.add(b12);
					b12.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b12){
								t4.setText(t4.getText().concat("1"));
							}
							
						}
						
					});
				
					
					JButton b13=new JButton("0");
					b13.setBounds(180,300,70,30);
					pp.add(b13);
					b13.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b13){
								t4.setText(t4.getText().concat("0"));
							}
							
						}
						
					});
				
					
					JButton b14=new JButton("8");
					b14.setBounds(240,180,50,30);
					pp.add(b14);
					b14.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b14){
								t4.setText(t4.getText().concat("8"));
							}
							
						}
						
					});
				
				
					JButton b15=new JButton("5");
					b15.setBounds(240,220,50,30);
					pp.add(b15);
					b15.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b15){
								t4.setText(t4.getText().concat("5"));
							}
							
						}
						
					});
				
					
					JButton b16=new JButton("2");
					b16.setBounds(240,260,50,30);
					pp.add(b16);
					b16.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b16){
								t4.setText(t4.getText().concat("2"));
							}
							
						}
						
					});
				
					
					JButton b17=new JButton("9");
					b17.setBounds(300,180,50,30);
					pp.add(b17);
					b17.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b17){
								t4.setText(t4.getText().concat("9"));
							}
							
						}
						
					});
				
					
					JButton b18=new JButton("6");
					b18.setBounds(300,220,50,30);
					pp.add(b18);
					b18.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b18){
								t4.setText(t4.getText().concat("6"));
							}
							
						}
						
					});
				
					JButton b19=new JButton("3");
					b19.setBounds(300,260,50,30);
					pp.add(b19);
					b19.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b19){
								t4.setText(t4.getText().concat("3"));
							}
							
						}
						
					});
				
					JButton b20=new JButton(".");
					b20.setBounds(260,300,70,30);
					pp.add(b20);
					b20.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==b20){
								t4.setText(t4.getText().concat("."));
							}
							
						}
						
					});
				
					
					
					JMenuBar mm=new JMenuBar();
					f1.setJMenuBar(mm);
					mm.add(Box.createHorizontalStrut(10));
					
					JMenu me=new JMenu("View");
					mm.add(me);
					
					
					JMenu me1=new JMenu("Edit");
					mm.add(me1);
					
					JMenu me2=new JMenu("Help");
					mm.add(me2);
					
					
					JMenuItem mii1=new JMenuItem("Standard");
					me.add(mii1);
					 Action aa=new AbstractAction("Standard"){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==mii1){
								
								f.setVisible(true);
								f1.dispose();
							}
							
						}
						 
					 };
					 aa.putValue(Action.MNEMONIC_KEY,KeyEvent.VK_F4);
					 aa.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_F4,KeyEvent.ALT_DOWN_MASK));
					 mii1.setAction(aa);
					
					 JMenuItem ii=new JMenuItem("Scientific");
					 me.add(ii);
					 Action aaaaaa=new AbstractAction("Scientific"){

						@Override
						public void actionPerformed(ActionEvent a) {
							if(a.getSource()==ii){
								f1.setVisible(true);
								f.dispose();
								
							}
							
						}
						 
					 };
					 aaaaaa.putValue(Action.MNEMONIC_KEY,KeyEvent.VK_F3);
					 aaaaaa.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F3,KeyEvent.ALT_DOWN_MASK));
					 ii.setAction(aaaaaa);
					 
					 
					 
					JMenuItem mii3=new JMenuItem("Copy");
					me1.add(mii3);
					Action c1=new AbstractAction("Copy"){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println("Copying");
							
						}
						
					};
					c1.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_C);
					c1.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
					mii3.setAction(c1);
					JMenuItem mii4=new JMenuItem("Paste");
					me1.add(mii4);
				
					 Action p1=new AbstractAction("Paste"){

						@Override
						public void actionPerformed(ActionEvent arg0) {
						
						System.out.println("Pasting");
						}
						 
					 };
					p1.putValue(Action.MNEMONIC_KEY,KeyEvent.VK_V);
					p1.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));
					mii4.setAction(p1);
					
					
					JMenuItem mii5=new JMenuItem("History");
					me1.add(mii5);
					me1.addSeparator();
					
					JMenuItem mex=new JMenuItem("Exit");
					me1.add(mex);
					Action exit=new AbstractAction("Exit"){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							System.exit(0);
							
						}
						
					};
					exit.putValue(Action.MNEMONIC_KEY,KeyEvent.VK_X);
					exit.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK));
					mex.setAction(exit);
					
					JMenuItem mii6=new JMenuItem("Help");
					me2.add(mii6);
					me2.addSeparator();
					
					JMenuItem mii7=new JMenuItem("About");
					me2.add(mii7);
					mii7.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent a) {
							
								JOptionPane.showMessageDialog(f1,"Designed by"+"\nKrunal Kamble"+"\nManufactured in India");
							
							
						}
						
					});
				
					
					
				}
				
			}
			
		});
		
		
		JMenuItem mi3=new JMenuItem("Copy");
		m2.add(mi3);
		Action c=new AbstractAction("Copy"){

			@Override
			public void actionPerformed(ActionEvent a) {
				System.out.println("Copying");
				
			}
			
		};
		c.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_C);
		c.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
		mi3.setAction(c);
		
		JMenuItem mi4=new JMenuItem("Paste");
		m2.add(mi4);
		Action pa=new AbstractAction("Paste"){

			@Override
			public void actionPerformed(ActionEvent aa) {
				System.out.println("Paste");
				
			}
			
		};
		pa.putValue(Action.MNEMONIC_KEY,KeyEvent.VK_V);
		pa.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));
		mi4.setAction(pa);
		
		
		
		
		JMenuItem mi5=new JMenuItem("History");
		m2.add(mi5);
		m2.addSeparator();
		
		JMenuItem mi11=new JMenuItem("Exit");
		m2.add(mi11);
		Action ex=new AbstractAction("Exit"){

			@Override
			public void actionPerformed(ActionEvent a) {
				
					System.exit(0);
				
				
			}
			
		};
		ex.putValue(Action.MNEMONIC_KEY,KeyEvent.VK_X);
		ex.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK));
		mi11.setAction(ex);
		
		JMenuItem mi6=new JMenuItem("View Help");
		m3.add(mi6);
		m3.addSeparator();
		
		JMenuItem mi7=new JMenuItem("About Calculator");
		m3.add(mi7);
		mi7.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				JOptionPane.showMessageDialog(f,"Designed by"+"\nKrunal Kamble"+"\nManufactured in India");
				
			}
			
		});
		
		
		
		
		
		}
	public static void main(String[] args) {
		 calci();
	}
	
}
