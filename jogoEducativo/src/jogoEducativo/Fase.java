package jogoEducativo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	private Image fundo;
	public Letra a;
	private Timer timer;
	public boolean game;
	
	
	public Fase()
	{
		//setDoubleBuffered(true);
		setFocusable(true);
		addKeyListener(new TecladoAdapter());
		ImageIcon referencia = new ImageIcon("res//fundo.gif");
		fundo = referencia.getImage();
		a = new Letra();
		game = true;
		
		
		
		

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		a.mexer();
		game = false;
		repaint();
		
		
		
	}
	
	public void paint(Graphics g) {
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		if (game){
		graficos.drawImage(a.getImagem(), a.getX(), a.getY(), this);
		graficos.setFont(new Font("Sketch Match", Font.PLAIN, 30));
		graficos.setColor(Color.YELLOW);
		graficos.drawString("QUAL DAS LETRAS E A LETRA 'A'? ", 250, 100);
		graficos.setFont(new Font("Sketch Match", Font.PLAIN, 100));
		graficos.setColor(Color.RED);
		graficos.drawString("A ", 300, 250);
		graficos.setColor(Color.BLUE);
		graficos.drawString("B ", 450, 250);
		graficos.setColor(Color.GREEN);
		graficos.drawString("C ", 620, 250);
		}
		else
			
		{
			ImageIcon referencia = new ImageIcon("res//fundo.gif");
			graficos.drawImage(referencia.getImage(), 0, 0, null);
			graficos.setFont(new Font("SPACEMAN", Font.PLAIN, 50));
			graficos.setColor(Color.GREEN);
			graficos.drawString("VOCE MATOU: ", 300, 500);
			
		}
		
	g.dispose();	
	}




	
	private class TecladoAdapter extends KeyAdapter
	{

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			a.keyPressed(arg0);
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			a.keyReleased(arg0);
		}
		
	}

		

	}
	

