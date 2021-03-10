package CardModel;
import java.awt.Color;

import View.UNOCard;
import static javafx.event.ActionEvent.ACTION;
/**
 *
 * @author USER
 */
public class ActionCard extends UNOCard
{
    
	
	private int Function = 0;
	
	
	public ActionCard()
        {
            
	}
	
	public ActionCard(Color cardColor, String cardValue)
        {
		super(cardColor,ACTION, cardValue);		
	}	
}
