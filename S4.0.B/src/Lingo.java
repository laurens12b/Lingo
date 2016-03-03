import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lingo extends JPanel {
	private JButton check;
	private JButton newGame;
	private JTextField invoer, uitvoer1, uitvoer2, uitvoer3, uitvoer4, uitvoer5, endresult;
	private List<StringBuffer> woordenLijst = new ArrayList<StringBuffer>();
	private List<StringBuffer> oplossingsLijst = new ArrayList<StringBuffer>();
	private String raadwoord;
	private StringBuffer beurtOplossing = new StringBuffer();
	private StringBuffer totaalOplossing = new StringBuffer();
	private int aantalBeurten = 0;
	private int amount = 6;			//Aantal letters lingo
	
	public Lingo() {
		check = new JButton("check");
		check.addActionListener(new CheckHandler());
		
		newGame = new JButton("opnieuw spelen");
		newGame.addActionListener(new newGameHandler());
		
		invoer = new JTextField(6);
		
		endresult = new JTextField(6);
		endresult.setEditable(false);
		
		uitvoer1 = new JTextField(6);
		uitvoer1.setEditable(false);
		uitvoer2 = new JTextField(6);
		uitvoer2.setEditable(false);
		uitvoer3 = new JTextField(6);
		uitvoer3.setEditable(false);
		uitvoer4 = new JTextField(6);
		uitvoer4.setEditable(false);
		uitvoer5 = new JTextField(6);
		uitvoer5.setEditable(false);
		
		add(check);
		add(invoer);
		add(uitvoer1);
		add(uitvoer2);
		add(uitvoer3);
		add(uitvoer4);
		add(uitvoer5);
		add(endresult);
		add(newGame);
		
		raadwoord = getWord("6letterwoorden.txt");
		System.out.println(raadwoord);
		
		for (int i = 0; i < amount; i++) {
			totaalOplossing.append("X");
			beurtOplossing.append("X");
		}
	}
	
	public String getWord(String bestandsNaam) {
		String woord;
		int index = 0; 
		int aantalwoorden = 0;
		
		BufferedReader in;
		String regel;
		try {
			in = new BufferedReader(new FileReader( bestandsNaam));
			while((regel = in.readLine()) != null) {
				System.out.println(regel);
				try {
					StringBuffer sb = new StringBuffer();
					sb.append(regel);
					woordenLijst.add(sb);
					aantalwoorden++;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch( FileNotFoundException e) {
			System.out.println("Could not find file!");
		} catch( IOException e ) {
		   	System.out.println( "Fout bij het lezen of sluiten bestand" );
		   	e.printStackTrace();
		} catch( Exception e ) {
		   	System.out.println( "Fout bij het lezen of sluiten bestand" );
		    e.printStackTrace();
		}
		index=(int) ( Math.random()*(aantalwoorden - 1));
		System.out.println(index + "   aantalwoorden = " + aantalwoorden);
		woord = woordenLijst.get(index).toString();  
		return woord; 
	}
	
	class CheckHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int aantalLetters = 0;
			aantalBeurten++;
		    for (int index = 0; index < raadwoord.length(); index++) {
		    	beurtOplossing.setCharAt(index,'X');
		    }    	
		    String woord=invoer.getText();
		      
		    if (woord.length()<raadwoord.length()){
		    	   aantalLetters= woord.length();
		    } else {
		    	  aantalLetters= raadwoord.length();
		    }
		        
		    for (int teller=0;teller<aantalLetters;teller++){
		    	 if ( woord.charAt(teller)==raadwoord.charAt(teller)){
		    		beurtOplossing.setCharAt(teller, woord.charAt(teller));
		    	 	if (totaalOplossing.charAt(teller) =='X'){ totaalOplossing.setCharAt(teller, woord.charAt(teller));}
		    	 }
		     }
		      oplossingsLijst.add(beurtOplossing);
		      System.out.println(woord);
		      System.out.println(totaalOplossing.toString());
		      System.out.println("na beurt: "+beurtOplossing.toString());
		      switch (aantalBeurten){
		      		case 1:	uitvoer1.setText(beurtOplossing.toString());
		      				break;
		      		case 2:	uitvoer2.setText(beurtOplossing.toString());
		      				break;
		      		case 3:	uitvoer3.setText(beurtOplossing.toString());
		      				break;
		      		case 4:	uitvoer4.setText(beurtOplossing.toString());
		      				break;
		      		case 5:	uitvoer5.setText(beurtOplossing.toString());
		      				break;
		  
		      }
		      
		      // for each om alle oplssinge uit5 de lijst af te drukken....for (string tekst)
		      
		      endresult.setText(totaalOplossing.toString());
		      
		      
		      // nodig om het invoervak fijner te gebruiken.
		      invoer.addFocusListener(new FocusListener() {
		          @Override  public void focusLost(final FocusEvent pE) {}
		          @Override  public void focusGained(final FocusEvent pE) {
		              invoer.selectAll();
		          }
		      });
		      
		      
		     
		      
		}
		
	}
	class newGameHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			raadwoord = getWord("6letterwoorden.txt");
			amount = 0;
			for (int i = 0; i < amount; i++) {
				totaalOplossing.append("X");
				beurtOplossing.append("X");
				uitvoer1.setText("");
			}
		}
		}
		
	
}
