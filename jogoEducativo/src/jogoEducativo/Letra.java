package jogoEducativo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Letra {

	private int x, y;
	private int dx, dy;
	private int largura, altura;
	private Image a;
	private boolean isVisivel;
	public static boolean teste;

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

	public Image getFundo() {
		return a;
	}

	public Letra() {
		ImageIcon letra = new ImageIcon("res//aa.gif");
		a = letra.getImage();
		altura = a.getHeight(null);
		largura = a.getWidth(null);
		this.x = 100;
		this.y = 100;

	}

	public Image getImagem() {
		return a;
	}

	public void mexer() {
		
	}

	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();

		if (codigo == KeyEvent.VK_A) {
			teste = true;
			System.out.println("A");
			
		}
	}

	public void keyReleased(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();

		if (codigo == KeyEvent.VK_A) {

		}
	}

	public void proximoNivel() {
		if (teste == true) {

		}
	}

}
