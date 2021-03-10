package unocard;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import View.MainFrame;
/**
 *
 * @author USER
 */
public class UNOCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        	
		SwingUtilities.invokeLater(new Runnable() {					
			public void run() {
			JFrame frame = new MainFrame();
				frame.setVisible(true);
				frame.setResizable(false);
				frame.setLocation(200, 100);
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				

			}
		});
    }
    
}
