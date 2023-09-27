import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WhileLoops extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g.drawRect(10, 10, 760, 540);
		
		//2) Draw a horizontal line to bisect the Rectangle
		g.drawLine (10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g.drawLine (380, 10, 380, 550);
		
		// small rectangles on top-left
		g.drawLine (190, 10, 190, 270);
		
		// print hellow world 10x to console
		int var = 0;
		while (var < 10) {
			System.out.println("Hello World");
			var++;
			
		} 
		int n = 0;
		int y2 = 90;
		while (n < 10) {
			g.drawLine (10, 10, 180, y2);
			y2 +=10;
			n++;
		}
		int l = 0;
		int y1 = 160;
		while (l < 10) {
			y1 += 8;
			g.drawLine (25,y1, 175, y1);
			l++;
		} // squares
		int s= 0;
		int x2 = 190;
		int w3 = 25;
		int y3 = 100;
		while (s < 5) {
			x2 += 10;
			w3 += 10;
			y3 += 10;
			g.drawRect(x2, y3, w3, w3);
			s++;
		}
		int m = 0;
		int x4 = 90;
		int x5 = 200;
		int y5 = 15;
		while (m < 5) {
			x5 += 5;
			x4 -= 10;
			y5 += 5;
			g.drawOval(x5, y5, x4, x4);
			m++;
		}
		int f = 2;
		int sum = f;
		int x6 = 415;
		int y6 = 180;
		while (f < 32) {
			sum += f;
			if (f <31) {
			g.drawString( (f + "+"), x6, y6);
			x6 += 10;
			} else if (f == 31) {
			g.drawString((f + "= " + sum), x6, y6);
			}
			
		f++;
		x6 += 10;
		if (x6 > 725) {
			y6 += 20;
			x6 = 450;
		}
		}
		int h = (int)((Math.random()*6)+ 5);
		int pro = h;
		int x7 = 45;
		int o = 0;
		while (o < 11) {
			pro *= h;
			if (h == 1) {
				g.drawString((h + "=" + pro), x7, 350);
			} else if (h > 1) {
				g.drawString((h + " * "), x7, 350);
			}
			h--;
			x7 += 25;
			o++;
			
			
		}
		
	
		int circlNum = 0;
		while (circlNum < 25) {
			int x8 = (int)(Math.random()*200) + 400;
			int y8 = (int)(Math.random()*100) + 300;
			int w8 = (int)(Math.random()*100) + 45;
			
			g.drawOval (x8, y8, w8, w8);
			circlNum++;
		}
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		WhileLoops m = new WhileLoops();
	}
	
	public WhileLoops() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
