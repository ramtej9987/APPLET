import java.awt.*; 
import javax.swing.*; 

public class JLabelDemo extends JApplet { 
public void init() { 
try { 
SwingUtilities.invokeAndWait( 
new Runnable() { 
public void run() { 
makeGUI(); 
} 
} 
); 
} catch (Exception exc) { 
System.out.println("Can't create because of " + exc); 
} 
} 
private void makeGUI() { 
// Create an icon. 
ImageIcon ii = new ImageIcon("france.gif"); 
// Create a label. 
JLabel jl = new JLabel("France", ii, JLabel.CENTER); 
// Add the label to the content pane. 
add(jl); 
} 
} 