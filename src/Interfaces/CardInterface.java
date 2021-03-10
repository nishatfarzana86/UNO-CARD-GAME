package Interfaces;
import java.awt.*;

public interface CardInterface{
	
	int WIDTH = 50;
	int HEIGHT = 75;

	Dimension MEDIUM = new Dimension(WIDTH*2,HEIGHT*2);
		
	
	
	Dimension CARDSIZE = MEDIUM;
	
	int OFFSET = 71;
	
	void setColor(Color newColor);
	Color getColor();
	
	void setValue(String newValue);
	String getValue();
	
	void setType(int newType);
	int getType();
}