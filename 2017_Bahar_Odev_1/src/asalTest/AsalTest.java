package asalTest;

import javax.swing.JOptionPane;
//http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
public class AsalTest {
	static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		int a; 
		try{
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Asal Testi İçin Bir Sayı Giriniz:"));
		
		if(isPrime(a))
			JOptionPane.showMessageDialog(null, "Girdiğiniz Sayı Bir Asal Sayıdır");
		else 
			JOptionPane.showMessageDialog(null, "Bu Bir Asal Sayı Değildir");
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Lütfen Bir Rakam Giriniz","ERROR", JOptionPane.ERROR_MESSAGE);	
		}
	}
}
