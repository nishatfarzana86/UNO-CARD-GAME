package Interfaces;
import java.awt.Color;

public interface UNOConstants {
	

	public static Color RED = new Color(250,80,77);
	public static Color BLUE = new Color(5,73,125);
	public static Color GREEN = new Color(0,153,0);
	public static Color YELLOW = new Color(255,204,0);
	
	public static Color BLACK = new Color(0,0,0);
	
	
	public static int NUMBERS = 1;
	public static int ACTION = 2;
	public static int WILD = 3;
	
	
	Character charREVERSE = (char) 8634;						
	Character charSKIP    = (char) Integer.parseInt("2718",16); 
	
	
	String REVERSE = charREVERSE.toString();
	String SKIP	= charSKIP.toString();
	String DRAW2PLUS = "2+";
	
	
	String W_COLORPICKER = "W";
	String W_DRAW4PLUS = "4+";	
}
