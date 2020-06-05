import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.KeyEvent;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 01.06.2020
 * @Marc St�we, Lars von Bandel, Niklas Goldschmidt und Dominik Schult 
 */

public class SuperMario_mit_Kommentaren_test extends JApplet {
  // Anfang Attribute
  private JPanel marioCharacter = new JPanel(null, true);                       //Panel marioCharacter wird definiert
  private JPanel eventBox = new JPanel(null, true);                             //Panel eventBox wird definiert
  private JPanel powerUP = new JPanel(null, true);                              //Panel powerUP wird definiert
  int jumpspeed = 2;
  int movespeed;                                                     
  boolean jumping = false;
  boolean moveright = false;
  boolean moveleft = false;
  private Timer timer_update = new Timer(1000, null);
  private JButton bStart = new JButton();
  int maxjumpheight = 220;
  int currentjumpheight = 0;
  int mariowidth = marioCharacter.getWidth();
  int mariobottom = marioCharacter.getY() + marioCharacter.getHeight();
  private JPanel ground = new JPanel(null, true);
  // Ende Attribute
  
  public void init() {
    Container cp = getContentPane();
    cp.setLayout(null);
    cp.setSize(1080,720);                          
    cp.setBounds(0, 0, 1280, 720);
    powerUP.hide();
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {         //Event f�r die Abfrage der Tasteneingaben wird definiert

            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                  switch (ke.getID()) {
                    case KeyEvent.KEY_PRESSED:                                                                 //sollte irgendeine Taste heruntergedr�ckt werden, wird folgender Code abgefragt
                        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {                                            //Wenn die heruntergedr�ckte Taste die Leertaste ist
                            jumping = true;
                            if(contactwithbox_top()){
                            powerUP.show();
                            }
                        }
                        if(ke.getKeyCode() == KeyEvent.VK_D){
                           movespeed = 2;
                           moveright = true;                                                  //folgender Befehl wird ausgef�hrt, sollte Taste 'D' gedr�ckt werden
                           //moveSidewards(movespeed);
                        }
                        if(ke.getKeyCode() == KeyEvent.VK_A){                                                  //folgender Befehl wird ausgef�hrt, sollte Taste 'A' gedr�ckt werden
                           movespeed = -2;
                           moveleft = true;
                           //moveSidewards(movespeed);
                        }
                        break;
            
                    case KeyEvent.KEY_RELEASED:                                                                //Folgendes passiert, sollte eine Taste losgelassen werden
                        if(ke.getKeyCode() == KeyEvent.VK_D){
                           moveright = false;                                                 
                        }
                        if(ke.getKeyCode() == KeyEvent.VK_A){
                           moveleft = false;                                                 
                        }
                        break;
                    }
                    return false;
            }
        });
    // Anfang Komponenten
    
    marioCharacter.setBounds(230, 350, 100, 100);
    marioCharacter.setOpaque(true);
    marioCharacter.setBackground(Color.CYAN);
    cp.add(marioCharacter);
    eventBox.setBounds(230, 450, 50, 50);
    eventBox.setOpaque(true);
    eventBox.setBackground(new Color(0xFFC800));
    cp.add(eventBox);
    powerUP.setBounds(eventBox.getX(), eventBox.getY() - eventBox.getHeight(), 50, 50);
    powerUP.setOpaque(true);
    powerUP.setBackground(Color.CYAN); 
    cp.add(powerUP);
    timer_update.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        timer_update_ActionPerformed(evt);
      }
    });
    timer_update.setRepeats(true);
    timer_update.setInitialDelay(0);
    bStart.setBounds(1172, 7, 75, 25);
    bStart.setText("Start");
    bStart.setMargin(new Insets(2, 2, 2, 2));
    bStart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bStart_ActionPerformed(evt);
      }
    });
    cp.add(bStart);
    timer_update.setDelay(1);
    ground.setBounds(0, 630, 1280, 55);
    ground.setOpaque(true);
    ground.setBackground(Color.GREEN);
    cp.add(ground);
    // Ende Komponenten
    
  } // end of init
  public void move(int a){
    if (moveright == true || moveleft == true) {
      marioCharacter.setLocation(marioCharacter.getX() + movespeed, marioCharacter.getY()); 
    }
    if (jumping == true && currentjumpheight <= maxjumpheight) {
      marioCharacter.setLocation(marioCharacter.getX(), (marioCharacter.getY() - jumpspeed));
      currentjumpheight= currentjumpheight + jumpspeed;
    } // end of if
  }

  // Anfang Methoden
  public void timer_update_ActionPerformed(ActionEvent evt) {
    //Methoden zu Bewegung ud die Schwerkraft werden bei jedem Pick abgerufen
    this.move(movespeed);
    this.variablereset();
    this.gravity();
  } // end of timer_update_ActionPerformed

  public void bStart_ActionPerformed(ActionEvent evt) {
    //Updatetimer wird gestartet
    timer_update.start();
  }
  public void variablereset() {
    if (currentjumpheight == maxjumpheight) {
      currentjumpheight = 0;
      jumping = false;
    } // end of if
  }
  public void gravity(){
    if (jumping == false && this.contactwithground_top() == false) {
      marioCharacter.setLocation(marioCharacter.getX(), marioCharacter.getY() + jumpspeed);
    } // end of if                            
  }
  public boolean contactwithground_top(){
    if ((marioCharacter.getY() + marioCharacter.getHeight()) == ground.getY()) {
      return true;
    } else {
      return false; 
    } // end of if-else         
  }
  public boolean contactwithbox_top(){
    if (marioCharacter.getY()-100 <= eventBox.getY() && (marioCharacter.getX() >= eventBox.getX() && marioCharacter.getX() <= eventBox.getX() + 50)) {
      return true;
    } else {
      return false; 
    } // end of if-else         
  }// Ende Methoden
  
} // end of class SuperMario_mit_Kommentaren_test

