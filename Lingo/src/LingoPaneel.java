// Paneel met twee knoppen en een tekstvak
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Font;

public class LingoPaneel extends JPanel {
  private JButton raadKnop;
  private JTextField invoerVak, uitvoerVak1,uitvoerVak2,uitvoerVak3,uitvoerVak4,uitvoerVak5,eindresultaatVak;
  private ArrayList woordenLijst=new ArrayList(); 
  private ArrayList oplossingsLijst=new ArrayList();
  private String raadWoord="";
  private StringBuffer beurtOplossing=new StringBuffer();
  private StringBuffer totaalOplossing=new StringBuffer();
  private int aantalBeurten=0;
  private Font lettertype = new Font("Courier", Font.BOLD,26);

  

  public LingoPaneel() {
	//this.setLayout(null); 
	super(null);

    raadKnop = new JButton( "RADEN" );
    raadKnop.addActionListener( new RaadKnopHandler() );
    raadKnop.setBounds(50, 50, 140, 40);
    raadKnop.setFont(lettertype);
   
    invoerVak = new JTextField(  );
    invoerVak.setBounds(210, 50, 200, 40);
    
    eindresultaatVak=new JTextField();
    eindresultaatVak.setBounds(210, 600, 200, 40);
    eindresultaatVak.setEditable(false);
    
    uitvoerVak1 = new JTextField(  );  
    uitvoerVak1.setBounds(210, 100, 200, 40);
    uitvoerVak1.setEditable(false);
    
    uitvoerVak2 = new JTextField(  );
    uitvoerVak2.setBounds(210, 150, 200, 40);
    uitvoerVak2.setEditable(false);
   
    uitvoerVak3 = new JTextField(  );
    uitvoerVak3.setBounds(210, 200, 200, 40);
    uitvoerVak3.setEditable(false);
   
    uitvoerVak4 = new JTextField(  );
    uitvoerVak4.setBounds(210, 250, 200, 40);
    uitvoerVak4.setEditable(false);
  
    uitvoerVak5 = new JTextField(  );
    uitvoerVak5.setBounds(210, 300, 200, 40);
    uitvoerVak5.setEditable(false);
   
    // lettertypen instellen
    invoerVak.setFont(lettertype);
    uitvoerVak1.setFont(lettertype);
    uitvoerVak2.setFont(lettertype);
    uitvoerVak3.setFont(lettertype);
    uitvoerVak4.setFont(lettertype);
    uitvoerVak5.setFont(lettertype);
    eindresultaatVak.setFont(lettertype);
    
    
    
    add( raadKnop );
    add( invoerVak );
    add( uitvoerVak1 );
    add( uitvoerVak2 );
    add( uitvoerVak3 );
    add( uitvoerVak4 );
    add( uitvoerVak5 );
    add(eindresultaatVak);
        
    
    // nodig om het invoervak fijner te gebruiken.
    invoerVak.addFocusListener(new FocusListener() {
        @Override  public void focusLost(final FocusEvent pE) {}
        @Override  public void focusGained(final FocusEvent pE) {
            invoerVak.selectAll();
        }
    });
    
   
     raadWoord=haalWoordop("6letterwoorden.txt"); 
    
    System.out.println(raadWoord);
    for (int index=0;index<raadWoord.length();index++){
    	totaalOplossing.append('X');
    	beurtOplossing.append('X');
    }
    
  }
  
  
  public String haalWoordop(String bestandsNaam){
		String woord=""; 
		int index,aantalWoorden=0;
		
		BufferedReader in;
		String regel;
		try {  
		    in = new BufferedReader( new FileReader( bestandsNaam ) );
		    while ( ( regel = in.readLine() ) != null ) {
		    	System.out.println( regel );
		    	try {
		    		woordenLijst.add(regel);
		    		aantalWoorden++;
		    	}
		    	catch (Exception e){
		    		e.printStackTrace();	   	   
		    	}
		    }
		    in.close();
		}
		catch( FileNotFoundException e ) {
		   	System.out.println( "Kan bestand niet vinden" );
		}
		catch( IOException e ) {
		   	System.out.println( "Fout bij het lezen of sluiten bestand" );
		   	e.printStackTrace();
		}
		catch( Exception e ) {
		   	System.out.println( "Fout bij het lezen of sluiten bestand" );
		    e.printStackTrace();
		}
		index=(int) ( Math.random()*(aantalWoorden-1));
		System.out.println(""+index+"   aantalwoorden= "+aantalWoorden);
		woord= (String)woordenLijst.get(index);
		  
		return (woord);  
  }
	  
  
  
  
  
  class RaadKnopHandler implements ActionListener  {
    public void actionPerformed( ActionEvent e ) {
    int aantalLetters;
    aantalBeurten++;
        	
    for (int index=0;index<raadWoord.length();index++){    
    	beurtOplossing.setCharAt(index,'X');
    }    	
    String woord=invoerVak.getText( );
      
    if (woord.length()<raadWoord.length()){
    	   aantalLetters= woord.length();
    }else {
    	  aantalLetters= raadWoord.length();
    }
        
    for (int teller=0;teller<aantalLetters;teller++){
    	 if ( woord.charAt(teller)==raadWoord.charAt(teller)){
    		beurtOplossing.setCharAt(teller, woord.charAt(teller));
    	 	if (totaalOplossing.charAt(teller) =='X'){ totaalOplossing.setCharAt(teller, woord.charAt(teller));}
    	 }
     }
      oplossingsLijst.add(beurtOplossing);
      System.out.println(woord);
      System.out.println(totaalOplossing.toString());
      System.out.println("na beurt: "+beurtOplossing.toString());
      switch (aantalBeurten){
      

      		case 1:	uitvoerVak1.setText(beurtOplossing.toString());
      				break;
      		case 2:	uitvoerVak2.setText(beurtOplossing.toString());
      				break;
      		case 3:	uitvoerVak3.setText(beurtOplossing.toString());
      				break;
      		case 4:	uitvoerVak4.setText(beurtOplossing.toString());
      				break;
      		case 5:	uitvoerVak5.setText(beurtOplossing.toString());
      			break;
      
      
      
      }
      
      // for each om alle oplssinge uit5 de lijst af te drukken....for (string tekst)
      
      eindresultaatVak.setText(totaalOplossing.toString());
      
      
      // nodig om het invoervak fijner te gebruiken.
      invoerVak.addFocusListener(new FocusListener() {
          @Override  public void focusLost(final FocusEvent pE) {}
          @Override  public void focusGained(final FocusEvent pE) {
              invoerVak.selectAll();
          }
      });
      
      
     
      
    }
  }
  

}
