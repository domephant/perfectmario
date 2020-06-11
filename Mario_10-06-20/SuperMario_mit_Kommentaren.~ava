import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Hashtable;
import java.awt.font.TextAttribute;

/**
 *
 * Beschreibung
 *
 * @version 1.3 vom 10.06.2020
 * @Marc Stüwe, Lars von Bandel, Niklas Goldschmidt und Dominik Schulz
 *
 * Bekannte Bugs/Baustellen:
  * Springen resettet sich nicht vernünftig, Fliegen möglich (muss noch umgecodet werden, gerade sehr unelegant gelöst)
  * groundpanel bewegt sich nicht mit
  * Marios Boxinteraktionen sind nicht fertig
  * Schleichen muss noch integriert werden
  * Zielabfrage / Wie wird das Level beendet?
  * Programmieren eines Gegners und weiterer Spielelemente
 */

public class SuperMario_mit_Kommentaren extends JApplet {
  //Benutzte Objekte (Charakter, Box, PowerUp, Boden und ein Array zum Speichern der zu bewegenden Panels wird definiert
  // Anfang Attribute
  private JPanel marioCharacter = new JPanel(null, true);
  private JPanel eventBox = new JPanel(null, true);
  private JPanel powerUP = new JPanel(null, true);
  private JPanel ground = new JPanel(null, true);
  private JPanel opponent = new JPanel(null, true);  //Panel opponent wird definiert
  ArrayList<JPanel> panels = new ArrayList<JPanel>(); 
  //Definition zusätzlicher Objekte
  private Timer timer_update = new Timer(1000, null);
  private JButton bStart = new JButton();
  //Essentielle globale Bewegungsvariablen für Mario
  int jumpSpeed = 2;
  int moveSpeed;
  int maxJumpHeight = 220;
  int currentJumpHeight = 0;
  //Abfragevariablen für Marios Aktionen
  int maxJumpHeightOpponent = 220;
  int currentJumpHeightOpponent = 0;
  boolean jumping = false;
  boolean moveRight = false;
  boolean moveLeft = false;
  boolean opponentjump = false;
  private Timer opponent_jump = new Timer(1000, null);
  private Timer opponentleft = new Timer(1000, null);
  private JTextField text_fail = new JTextField();
  private Timer chek_for_finishline = new Timer(1000, null);
  // Ende Attribute


  public void init() {
    Container cp = getContentPane();
    cp.setLayout(null);
    cp.setSize(1080, 720);
    cp.setBounds(0, 0, 356, 501);
    panels.add(eventBox);
    panels.add(powerUP);
    panels.add(ground);
    powerUP.hide();
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() { // Event für die Abfrage der Tasteneingaben wird definiert

      @Override
      public boolean dispatchKeyEvent(KeyEvent ke) {
        switch (ke.getID()) {
        case KeyEvent.KEY_PRESSED: // sollte irgendeine Taste heruntergedrückt werden, wird folgender Code abgefragt
          if (ke.getKeyCode() == KeyEvent.VK_SPACE) { // Wenn die heruntergedrückte Taste die Leertaste ist
            jumping = true;
            if (contactwithbox_top()) {
              powerUP.show();
            }
          }
          if (ke.getKeyCode() == KeyEvent.VK_D) {
            moveSpeed = -2;
            moveRight = true; // folgender Befehl wird ausgeführt, sollte Taste 'D' gedrückt werden
            // moveSidewards(movespeed);
          }
          if (ke.getKeyCode() == KeyEvent.VK_A) { // folgender Befehl wird ausgeführt, sollte Taste 'A' gedrückt werden
            moveSpeed = 2;
            moveLeft = true;
            // moveSidewards(movespeed);
          }
          break;

        case KeyEvent.KEY_RELEASED: // Folgendes passiert, sollte eine Taste losgelassen werden
          if (ke.getKeyCode() == KeyEvent.VK_D) {
            moveRight = false;
          }
          if (ke.getKeyCode() == KeyEvent.VK_A) {
            moveLeft = false;
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
    ground.setBounds(0, 630, 5000, 55);
    ground.setOpaque(true);
    ground.setBackground(Color.GREEN);
    cp.add(ground);
    opponent.setBounds(941, 350, 50, 50);
    opponent.setOpaque(true);
    opponent.setBackground(Color.MAGENTA);
    cp.add(opponent);
    opponent_jump.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        opponent_jump_ActionPerformed(evt);
      }
    });
    opponent_jump.setRepeats(true);
    opponent_jump.setInitialDelay(0);
    opponent_jump.setDelay(200);
    opponentleft.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        opponentleft_ActionPerformed(evt);
      }
    });
    opponentleft.setRepeats(true);
    opponentleft.setInitialDelay(0);
    opponentleft.setDelay(10);
    text_fail.setBounds(400, 104, 518, 68);
    text_fail.setEditable(false);
    text_fail.setText("I am sorry but you failed");
    text_fail.setBackground(Color.RED);
    text_fail.setVisible(false);
    Hashtable<TextAttribute, Object> text_feil_map = new Hashtable<TextAttribute, Object>();
    text_feil_map.put(TextAttribute.SIZE, new Integer(48));
    text_feil_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    Hashtable<TextAttribute, Object> text_fail_map = new Hashtable<TextAttribute, Object>();
    text_fail_map.put(TextAttribute.FAMILY, "Dialog");
    text_fail_map.put(TextAttribute.SIZE, new Integer(48));
    text_fail_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    text_fail.setFont(new Font(text_fail_map));
    text_fail.setForeground(Color.WHITE);
    cp.add(text_fail);
    chek_for_finishline.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        chek_for_finishline_ActionPerformed(evt);
      }
    });
    chek_for_finishline.setRepeats(true);
    chek_for_finishline.setInitialDelay(0);
    chek_for_finishline.setDelay(1);
    // Ende Komponenten

  } // end of init
  
  //Methode für Bewegungen wird erstellt
  public void move(int a) {
    //wenn Mario nach links oder rechts geht, verschiebt sich der Hintergrund / die Panels passend
    if (moveRight == true || moveLeft == true) {
      for (int i = 0; i < panels.size(); i++) {
        JPanel panel = (JPanel) panels.toArray()[i];
        panel.setLocation(panel.getX() + moveSpeed, panel.getY());
      }
    }
    // Beim Springen wird Marios Y-Koordinate verschoben
    if (jumping == true && currentJumpHeight <= maxJumpHeight) {
      marioCharacter.setLocation(marioCharacter.getX(), (marioCharacter.getY() - jumpSpeed));
      currentJumpHeight = currentJumpHeight + jumpSpeed;
    } 
  }

  // Anfang Methoden
  public void timer_update_ActionPerformed(ActionEvent evt) {
    // Methoden zu Bewegung und die Schwerkraft werden bei jedem Tick des Timers (jede Millisekunde) abgerufen
    this.move(moveSpeed);
    this.variablereset();
    this.opponetcontactleft();
    this.opponentjump();
    this.gravity();
    this.touched();
  } // end of timer_update_ActionPerformed

  public void bStart_ActionPerformed(ActionEvent evt) {
    // Updatetimer wird gestartet
    timer_update.start();
    //opponent_jump wird gestartet
    opponent_jump.start();    //Alle 200ms wird Math.random ausgef?hrt. Wenn dabei 0 rauskommt, springt der Gegner
    //opponentleft wird gestartet
    opponentleft.start();     //Dadurch bewegt sich der Gegner jede 10ms um -2 ausser einer der Sonderf?lle trift ein
    //check_for_finishline wird gestertet
    chek_for_finishline.start();   //Jede ms wird kontrolliert ob Mario im Ziel angekommen ist
  }

  public void variablereset() {
    // Wenn Mario bei seiner maximalen Sprunghöhe angekommen ist, wird es auf nicht mehr springend gesetzt, damit die Schwerkraft wieder greift
    if (currentJumpHeight == maxJumpHeight) {
      currentJumpHeight = 0;
      jumping = false;
    } // end of if
  }

  public void gravity() {
    // Sollte Mario nicht im Sprung sein oder auf dem Boden stehen, wird er nach unten verschoben, bis er den Boden berührt
    if (jumping == false && this.contactwithground_top() == false) {
      marioCharacter.setLocation(marioCharacter.getX(), marioCharacter.getY() + jumpSpeed);
    } // end of if
    if (opponentjump == false && this.opponentcontactwithground() == false) {     //Wenn der Gegner nicht Springt und nicht den Boden ber?hrt,
      opponent.setLocation(opponent.getX(), opponent.getY() + jumpSpeed);         //dann f?llt er zur?ck auf den Boden
    } // end of if
  }
  //Wenn Mario den Boden berührt (Marios Y + Höhe = Y des Bodes), gibt die Methode true aus, um die Schwerkraft zu stoppen
  public boolean contactwithground_top() {
    if ((marioCharacter.getY() + marioCharacter.getHeight()) == ground.getY()) {
      return true;
    } else {
      return false;
    } 
  }
  
  public boolean opponentcontactwithground(){
     if ((opponent.getY() + opponent.getHeight()) == ground.getY()){     //Wenn der Gegner den Boden ber?hrt,
      return true;                                                       //wird zur?ckgegeben, dass er das tut
      } 
     else{
      return false;                                                      //oder es wird zur?ckgegeben, dass er den Boden nicht ber?hrt.
     }        
    }
  public boolean opponetcontactleft(){
    if (opponent.getX() <= -opponent.getWidth()){          //Wenn der Gegner aus dem Bild gelaufen ist,
      return true;                                         //wird dies zur?ckgegeben
      }
    else{
      return false;                                       //oder zur?ckgegeben, dass er nicht aus dem Bild gelaufen ist.
      }
    }
  
  //Noch nicht integriert
  public boolean contactwithbox_top() {
    if (marioCharacter.getY() - 100 <= eventBox.getY()
        && (marioCharacter.getX() >= eventBox.getX() && marioCharacter.getX() <= eventBox.getX() + 50)) {
      return true;
    } else {
      return false;
    } 
  }
  
  public void opponent_jump_ActionPerformed(ActionEvent evt) {
    int random;
    random = (int) (Math.random() * 10);                      //Die Zufallszahll wird ausgelost
    switch(random){                                           //Switch mit der Zufallszahl
      case 0:                                                 //Wenn die Zufallszahl 0 ist trift der case ein, dass der Gegner springt
        opponentjump = true;  
      }
  
  } // end of opponent_jump_ActionPerformed
  
  public void opponentjump() {
    if (opponentjump == true && currentJumpHeightOpponent <= maxJumpHeightOpponent) {      //Wenn der Gegner springen soll und die maximale Springh?he noch nicht erreicht ist, springt er jede ms um 2 Einheiten nach oben
      opponent.setLocation(opponent.getX(), opponent.getY() - jumpSpeed);           //Y-Koordinate um jumpSpeed erh?hen
      currentJumpHeightOpponent += jumpSpeed;                                       //currentJumpHeightOpponent wird um jumpSpeed erh?ht
      if (currentJumpHeightOpponent == maxJumpHeightOpponent) {                     //Wenn currentJumpHeightOpponent gleich der maximalen Springh?he ist,
        opponentjump = false;                                                       //soll der Gegner nicht mehr springen
        currentJumpHeightOpponent = 0;                                              //und die Sprungh?he wird auf 0 zur?ckgesetzt
        } //end of if
    } // end of if
  }
  
  public void opponentleft_ActionPerformed(ActionEvent evt) {
    if (opponetcontactleft() != true && moveLeft != true) {               //Wenn der Gegner nicht links rausgeleufen und Mario nicht nach links l?uft
      if (opponent.getX() - marioCharacter.getX() >= 1200) {              //Wenn dann auch noch der Abstand zwischen dem Gegnjer und Mario gr??er als 1200 einheiten ist,
        opponent.setLocation(opponent.getX() -100, opponent.getY());      //wird l?uft der Gegner mit 100 Einheiten pro 10ms richtung Mario, bis dieser n?her als 1200 einheiten ist
      } // end of if
      else {
        opponent.setLocation(opponent.getX() -2, opponent.getY());        //sont l?uft der gegner alle 10ms um 2 Einheiten in Richtung des Gegners
      } // end of if-else
    } // end of if
    if (moveLeft == true && moveRight != true) {                         //Falls jedoch Mario nach links l?uft,
      opponent.setLocation(opponent.getX() +10, opponent.getY());        //l?uft der Gegner langsamer
    } // end of if
    if (moveRight == true && moveLeft != true) {                         //Falls jedoch MArio nach rechts l?uft,
      opponent.setLocation(opponent.getX() -5, opponent.getY());         //l?uft der Gegner schneller
    } // end of if
    if (opponetcontactleft() == true) {                                  //Falls der Gegner links aus dem Bild l?uft,
      opponent.setLocation(opponent.getX() + 1500, opponent.getY());     //wird er nach rechts ausserhalb des Bildes gesetzt und l?uft dann wieder nach links weiter
    } // end of if
    } // end of opponentleft_ActionPerformed
  
  public void touched(){
    if ((opponent.getX() - marioCharacter.getX() <=50 && opponent.getY() - marioCharacter.getY() <=50)) {
      text_fail.setVisible(true);
      timer_update.stop();
      opponent_jump.stop();    
      opponentleft.stop();
     } // end of if
    }
    
  public void chek_for_finishline_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfÃ¼gen
  
  } // end of chek_for_finishline_ActionPerformed

  }// Ende Methoden
    
    
    
        
    
  
  
  
  
  
  
  
  
  
  
  

