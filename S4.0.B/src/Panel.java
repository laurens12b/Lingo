import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame {
	public static void main(String args[]) {
	    JFrame frame = new Panel();
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame.setTitle( "LINGO" );
	    JPanel lingopaneel = new Lingo();
	    frame.setContentPane( lingopaneel );
	    frame.pack();
	    frame.setVisible( true );
	  }
}
