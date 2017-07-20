
import java.awt.*;
import java.applet.*;

/*<applet code="TextAreaDemo" width=300 height=3000>
</applet>*/

public class TextAreaDemo extends Applet {
	public void init() {
				String val = "This is just a random text, and I'm checking it, whether it is working or not";	

				TextArea text = new TextArea(val, 10, 30);
				add(text);		
		}
}