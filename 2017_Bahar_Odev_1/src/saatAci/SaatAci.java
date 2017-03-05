package saatAci;

import javax.swing.JOptionPane;
//https://en.wikipedia.org/wiki/Clock_angle_problem
public class SaatAci {
	public static void main(String[] args) {
		int a,y; 
		try{
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Saat:"));
		y = Integer.parseInt(JOptionPane.showInputDialog(null, "Dakika:"));
		
		while (a>23){
			JOptionPane.showMessageDialog(null, "Saat 23'tan büyük olamaz.");
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Saat:"));		
		}
		while (y>59){
			JOptionPane.showMessageDialog(null, "Dakika 59'tan büyük olamaz.");
			y = Integer.parseInt(JOptionPane.showInputDialog(null, "Dakika:"));
		}
		JOptionPane.showMessageDialog(null, "Akrep ve Yelkovan Arasındaki Açı: " + Math.abs(0.5*(60*a-11*y)));
		
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Lütfen Bir Rakam Giriniz","ERROR", JOptionPane.ERROR_MESSAGE);	
		}
	}
}
