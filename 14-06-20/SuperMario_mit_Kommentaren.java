import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Hashtable;
import java.awt.font.TextAttribute;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

/**
 *
 * Beschreibung
 *
 * @version 1.3 vom 10.06.2020
 * @Marc St�we, Lars von Bandel, Niklas Goldschmidt und Dominik Schulz
 *
 * Bekannte Bugs/Baustellen:
  * Springen resettet sich nicht vern�nftig, Fliegen m�glich (muss noch umgecodet werden, gerade sehr unelegant gel�st)
  * groundpanel bewegt sich nicht mit <- bewegt sich mit, ist größer als das Fenster
  * Marios Boxinteraktionen sind nicht fertig
  * Programmieren eines Gegners und weiterer Spielelemente
 */

public class SuperMario_mit_Kommentaren extends JApplet {
  //Benutzte Objekte (Charakter, Box, PowerUp, Boden und ein Array zum Speichern der zu bewegenden Panels wird definiert
  // Anfang Attribute
  //JPanels werden definiert
  private JPanel marioCharacter = new JPanel(null, true);   
  private JPanel powerUP = new JPanel(null, true); 
  private JPanel ground = new JPanel(null, true);
  private JPanel opponent = new JPanel(null, true);
  private JPanel flag = new JPanel(null, true);
  
  
  //Boxen werden definiert
  private JPanel box1 = new JPanel(null, true);
  private JPanel box2 = new JPanel(null, true);
  private JPanel box3 = new JPanel(null, true);
  private JPanel box4 = new JPanel(null, true);
  private JPanel box5 = new JPanel(null, true);
  private JPanel box6 = new JPanel(null, true);
  private JPanel box7 = new JPanel(null, true);
  private JPanel box8 = new JPanel(null, true);
  private JPanel box9 = new JPanel(null, true);
  private JPanel box10 = new JPanel(null, true);
  private JPanel box11 = new JPanel(null, true);
  private JPanel box12 = new JPanel(null, true);
  private JPanel box13 = new JPanel(null, true);
  private JPanel box14 = new JPanel(null, true);
  private JPanel box15 = new JPanel(null, true);
  private JPanel box16 = new JPanel(null, true);
  private JPanel box17 = new JPanel(null, true);
  private JPanel box18 = new JPanel(null, true);
  private JPanel box19 = new JPanel(null, true);
  private JPanel box20 = new JPanel(null, true);
  private JPanel box21 = new JPanel(null, true);
  private JPanel box22 = new JPanel(null, true);
  private JPanel box23 = new JPanel(null, true);
  private JPanel box24 = new JPanel(null, true);
  private JPanel box25 = new JPanel(null, true);
  private JPanel box26 = new JPanel(null, true);
  
  //EventBoxen werden definiert
  private JPanel eventBox1 = new JPanel(null, true);
  private JPanel eventBox2 = new JPanel(null, true);  
  private JPanel eventBox3 = new JPanel(null, true);
  private JPanel eventBox4 = new JPanel(null, true);
  private JPanel eventBox5 = new JPanel(null, true);
  private JPanel eventBox6 = new JPanel(null, true);
  private JPanel eventBox7 = new JPanel(null, true);
  private JPanel eventBox8 = new JPanel(null, true);
  private JPanel eventBox9 = new JPanel(null, true);
  private JPanel eventBox10 = new JPanel(null, true);
  private JPanel eventBox11 = new JPanel(null, true);
  
  //Röhren werden definiert
  private JPanel tube1 = new JPanel(null, true);
  
  //Podest Boxen werden definiert
  private JPanel pedestalBox1 = new JPanel(null, true);
  private JPanel pedestalBox2 = new JPanel(null, true);
  private JPanel pedestalBox3 = new JPanel(null, true);
  private JPanel pedestalBox4 = new JPanel(null, true);
  private JPanel pedestalBox5 = new JPanel(null, true);
  private JPanel pedestalBox6 = new JPanel(null, true);
  private JPanel pedestalBox7 = new JPanel(null, true);
  private JPanel pedestalBox8 = new JPanel(null, true);
  private JPanel pedestalBox9 = new JPanel(null, true);
  private JPanel pedestalBox10 = new JPanel(null, true);
  private JPanel pedestalBox11 = new JPanel(null, true);
  private JPanel pedestalBox12 = new JPanel(null, true);
  private JPanel pedestalBox13 = new JPanel(null, true);
  private JPanel pedestalBox14 = new JPanel(null, true);
  private JPanel pedestalBox15 = new JPanel(null, true);
  private JPanel pedestalBox16 = new JPanel(null, true);
  private JPanel pedestalBox17 = new JPanel(null, true);
  private JPanel pedestalBox18 = new JPanel(null, true);
  private JPanel pedestalBox19 = new JPanel(null, true);
  private JPanel pedestalBox20 = new JPanel(null, true);
  private JPanel pedestalBox21 = new JPanel(null, true);
  private JPanel pedestalBox22 = new JPanel(null, true);
  private JPanel pedestalBox23 = new JPanel(null, true);
  private JPanel pedestalBox24 = new JPanel(null, true);
  private JPanel pedestalBox25 = new JPanel(null, true);
  private JPanel pedestalBox26 = new JPanel(null, true);
  private JPanel pedestalBox27 = new JPanel(null, true);
  private JPanel pedestalBox28 = new JPanel(null, true);
  private JPanel pedestalBox29 = new JPanel(null, true);
  private JPanel pedestalBox30 = new JPanel(null, true);
  private JPanel pedestalBox31 = new JPanel(null, true);
  private JPanel pedestalBox32 = new JPanel(null, true);
  private JPanel pedestalBox33 = new JPanel(null, true);
  private JPanel pedestalBox34 = new JPanel(null, true);
  private JPanel pedestalBox35 = new JPanel(null, true);
  private JPanel pedestalBox36 = new JPanel(null, true);
  private JPanel pedestalBox37 = new JPanel(null, true);
  private JPanel pedestalBox38 = new JPanel(null, true);
  private JPanel pedestalBox39 = new JPanel(null, true);
  private JPanel pedestalBox40 = new JPanel(null, true);
  private JPanel pedestalBox41 = new JPanel(null, true);
  private JPanel pedestalBox42 = new JPanel(null, true);
  private JPanel pedestalBox43 = new JPanel(null, true);
  private JPanel pedestalBox44 = new JPanel(null, true);
  private JPanel pedestalBox45 = new JPanel(null, true);
  private JPanel pedestalBox46 = new JPanel(null, true);
  private JPanel pedestalBox47 = new JPanel(null, true);
  private JPanel pedestalBox48 = new JPanel(null, true);
  private JPanel pedestalBox49 = new JPanel(null, true);
  private JPanel pedestalBox50 = new JPanel(null, true);
  private JPanel pedestalBox51 = new JPanel(null, true);
  private JPanel pedestalBox52 = new JPanel(null, true);
  private JPanel pedestalBox53 = new JPanel(null, true);
  
  
  
  //ArrayLists werden definiert
  ArrayList<JPanel> panels = new ArrayList<JPanel>();
  ArrayList<JPanel> boxes = new ArrayList<JPanel>();  
  ArrayList<JPanel> eventBoxes = new ArrayList<JPanel>();
  ArrayList<JPanel> pedestalBoxes = new ArrayList<JPanel>();
  
  //Definition zus�tzlicher Objekte
  private Timer timer_update = new Timer(1000, null);
  private JButton bStart = new JButton();
  
  //Essentielle globale Bewegungsvariablen f�r Mario
  int jumpSpeed = 2;
  int moveSpeed = 2;
  int maxJumpHeight = 260;
  int currentJumpHeight = 0;
  
  //Abfragevariablen f�r Marios Aktionen
  boolean jumping = false;
  boolean moveRight = false;
  boolean moveLeft = false;
  boolean flagtouched = false;
  boolean sneaking = false;
  boolean sneak_confirm = true;
  private Timer opponent_jump = new Timer(1000, null);
  private Timer opponentleft = new Timer(1000, null);
  private JTextField text_fail = new JTextField();
  private Timer chek_for_finishline = new Timer(1000, null);

  //Abfragevariablen fuer den Gegner
  int maxJumpHeightOpponent = 110;
  int currentJumpHeightOpponent = 0;
  int opponentheight = 50;
  int opponentwidth = 50;
  boolean opponentjump = false;
  boolean opponentdie = false;
  boolean nottouched = true;
  
  //BufferedImages werden definiert
  private BufferedImage boxImage;     
  private BufferedImage eventBoxImage; 
  
  //Graphics werden definiert
  private Graphics BoxGraphics;       
  private Graphics eventBoxGraphics;  
  private JTextField text_win = new JTextField();
  // Ende Attribute


  public void init() {
    Container cp = getContentPane();
    cp.setLayout(null);
    cp.setSize(1080, 720);
    cp.setBounds(0, 0, 957, 691);
    panels.add(powerUP);
    panels.add(ground);
    panels.add(flag);
  
  //Boxen werden bei Panels & Boxes hinzugefügt
  panels.add(box1);
  panels.add(box2);
  panels.add(box3);
  panels.add(box4);
  panels.add(box5);
  panels.add(box6);
  panels.add(box7);
  panels.add(box8);
  panels.add(box9);
  panels.add(box10);
  panels.add(box11);
  panels.add(box12);
  panels.add(box13);
  panels.add(box14);
  panels.add(box15);
  panels.add(box16);
  panels.add(box17);
  panels.add(box18);
  panels.add(box19);
  panels.add(box20);
  panels.add(box21);
  panels.add(box22);
  panels.add(box23);
  panels.add(box24);
  panels.add(box25);
  panels.add(box26);
  
  boxes.add(box1);
  boxes.add(box2);
  boxes.add(box3);
  boxes.add(box4);
  boxes.add(box5);
  boxes.add(box6);
  boxes.add(box7);
  boxes.add(box8);
  boxes.add(box9);
  boxes.add(box10);
  boxes.add(box11);
  boxes.add(box12);
  boxes.add(box13);
  boxes.add(box14);
  boxes.add(box15);
  boxes.add(box16);
  boxes.add(box17);
  boxes.add(box18);
  boxes.add(box19);
  boxes.add(box20);
  boxes.add(box21);
  boxes.add(box22);
  boxes.add(box23);
  boxes.add(box24);
  boxes.add(box25);
  boxes.add(box26);
  
  //EventBoxen werden bei Panels und EventBoxes hinzugefügt
  panels.add(eventBox1);
  panels.add(eventBox2);
  panels.add(eventBox3);
  panels.add(eventBox4);
  panels.add(eventBox5);
  panels.add(eventBox6);
  panels.add(eventBox7);
  panels.add(eventBox8);
  panels.add(eventBox9);
  panels.add(eventBox10);
  panels.add(eventBox11);
  
  eventBoxes.add(eventBox1);
  eventBoxes.add(eventBox2);
  eventBoxes.add(eventBox3);
  eventBoxes.add(eventBox4);
  eventBoxes.add(eventBox5);
  eventBoxes.add(eventBox6);
  eventBoxes.add(eventBox7);
  eventBoxes.add(eventBox8);
  eventBoxes.add(eventBox9);
  eventBoxes.add(eventBox10);
  eventBoxes.add(eventBox11);
  
  //Podest Boxen werden bei Panels und PedestalBoxes hinzugefügt
  panels.add(pedestalBox1);
  panels.add(pedestalBox2);
  panels.add(pedestalBox3);
  panels.add(pedestalBox4);
  panels.add(pedestalBox5);
  panels.add(pedestalBox6);
  panels.add(pedestalBox7);
  panels.add(pedestalBox8);
  panels.add(pedestalBox9);
  panels.add(pedestalBox10);
  panels.add(pedestalBox11);
  panels.add(pedestalBox12);
  panels.add(pedestalBox13);
  panels.add(pedestalBox14);
  panels.add(pedestalBox15);
  panels.add(pedestalBox16);
  panels.add(pedestalBox17);
  panels.add(pedestalBox18);
  panels.add(pedestalBox19);
  panels.add(pedestalBox20);
  panels.add(pedestalBox21);
  panels.add(pedestalBox22);
  panels.add(pedestalBox23);
  panels.add(pedestalBox24);
  panels.add(pedestalBox25);
  panels.add(pedestalBox26);
  panels.add(pedestalBox27);
  panels.add(pedestalBox28);
  panels.add(pedestalBox29);
  panels.add(pedestalBox30);
  panels.add(pedestalBox31);
  panels.add(pedestalBox32);
  panels.add(pedestalBox33);
  panels.add(pedestalBox34);
  panels.add(pedestalBox35);
  panels.add(pedestalBox36);
  panels.add(pedestalBox37);
  panels.add(pedestalBox38);
  panels.add(pedestalBox39);
  panels.add(pedestalBox40);
  panels.add(pedestalBox41);
  panels.add(pedestalBox42);
  panels.add(pedestalBox43);
  panels.add(pedestalBox44);
  panels.add(pedestalBox45);
  panels.add(pedestalBox46);
  panels.add(pedestalBox47);
  panels.add(pedestalBox48);
  panels.add(pedestalBox49);
  panels.add(pedestalBox50);
  panels.add(pedestalBox51);
  panels.add(pedestalBox52);
  panels.add(pedestalBox53);
  
  pedestalBoxes.add(pedestalBox1);
  pedestalBoxes.add(pedestalBox2);
  pedestalBoxes.add(pedestalBox3);
  pedestalBoxes.add(pedestalBox4);
  pedestalBoxes.add(pedestalBox5);
  pedestalBoxes.add(pedestalBox6);
  pedestalBoxes.add(pedestalBox7);
  pedestalBoxes.add(pedestalBox8);
  pedestalBoxes.add(pedestalBox9);
  pedestalBoxes.add(pedestalBox10);
  pedestalBoxes.add(pedestalBox11);
  pedestalBoxes.add(pedestalBox12);
  pedestalBoxes.add(pedestalBox13);
  pedestalBoxes.add(pedestalBox14);
  pedestalBoxes.add(pedestalBox15);
  pedestalBoxes.add(pedestalBox16);
  pedestalBoxes.add(pedestalBox17);
  pedestalBoxes.add(pedestalBox18);
  pedestalBoxes.add(pedestalBox19);
  pedestalBoxes.add(pedestalBox20);
  pedestalBoxes.add(pedestalBox21);
  pedestalBoxes.add(pedestalBox22);
  pedestalBoxes.add(pedestalBox23);
  pedestalBoxes.add(pedestalBox24);
  pedestalBoxes.add(pedestalBox25);
  pedestalBoxes.add(pedestalBox26);
  pedestalBoxes.add(pedestalBox27);
  pedestalBoxes.add(pedestalBox28);
  pedestalBoxes.add(pedestalBox29);
  pedestalBoxes.add(pedestalBox30);
  pedestalBoxes.add(pedestalBox31);
  pedestalBoxes.add(pedestalBox32);
  pedestalBoxes.add(pedestalBox33);
  pedestalBoxes.add(pedestalBox34);
  pedestalBoxes.add(pedestalBox35);
  pedestalBoxes.add(pedestalBox36);
  pedestalBoxes.add(pedestalBox37);
  pedestalBoxes.add(pedestalBox38);
  pedestalBoxes.add(pedestalBox39);
  pedestalBoxes.add(pedestalBox40);
  pedestalBoxes.add(pedestalBox41);
  pedestalBoxes.add(pedestalBox42);
  pedestalBoxes.add(pedestalBox43);
  pedestalBoxes.add(pedestalBox44);
  pedestalBoxes.add(pedestalBox45);
  pedestalBoxes.add(pedestalBox46);
  pedestalBoxes.add(pedestalBox47);
  pedestalBoxes.add(pedestalBox48);
  pedestalBoxes.add(pedestalBox49);
  pedestalBoxes.add(pedestalBox50);
  pedestalBoxes.add(pedestalBox51);
  pedestalBoxes.add(pedestalBox52);
  pedestalBoxes.add(pedestalBox53);
  
    powerUP.setVisible(false);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() { // Event f�r die Abfrage der Tasteneingaben wird definiert

      @Override
      public boolean dispatchKeyEvent(KeyEvent ke) {
        switch (ke.getID()) {
          case KeyEvent.KEY_PRESSED: // sollte irgendeine Taste heruntergedr�ckt werden, wird folgender Code abgefragt
            if (ke.getKeyCode() == KeyEvent.VK_SPACE) { // Wenn die heruntergedr�ckte Taste die Leertaste ist
              if (currentJumpHeight == 0){
              jumping = true;  
              }
              if (contactwithbox_top()) {
                powerUP.setVisible(true);
            }
          }
            if (ke.getKeyCode() == KeyEvent.VK_D) {
              moveSpeed = -2;
              moveRight = true; // folgender Befehl wird ausgef�hrt, sollte Taste 'D' gedr�ckt werden
            // moveSidewards(movespeed);
          }
            if (ke.getKeyCode() == KeyEvent.VK_A) { // folgender Befehl wird ausgef�hrt, sollte Taste 'A' gedr�ckt werden
              moveSpeed = 2;
              moveLeft = true;
            // moveSidewards(movespeed);
          }
            if (ke.getKeyCode() == KeyEvent.VK_SHIFT) {
              sneaking = true;
            } // end of if
          break;

          case KeyEvent.KEY_RELEASED: // Folgendes passiert, sollte eine Taste losgelassen werden
            if (ke.getKeyCode() == KeyEvent.VK_D) {
              moveRight = false;
          }
            if (ke.getKeyCode() == KeyEvent.VK_A) {
              moveLeft = false;
          }
            if (ke.getKeyCode() == KeyEvent.VK_SHIFT) {
              sneaking = false;
              marioCharacter.setLocation(marioCharacter.getX(), marioCharacter.getY() - 30);
              marioCharacter.setSize(marioCharacter.getWidth(), 100);
              sneak_confirm = true;
            } // end of if
          break;
        }
        return false;
      }
    });
    // Anfang Komponenten

    marioCharacter.setBounds(230, 350, 32, 64);
    marioCharacter.setOpaque(true);
    marioCharacter.setBackground(Color.RED);

    cp.add(marioCharacter);
    eventBox1.setBounds(262, 450, 32, 32);
    eventBox1.setOpaque(false);
    cp.add(eventBox1);
    box1.setBounds(262, 450, 32, 32);
    box1.setOpaque(false);
    //cp.add(box1);
    powerUP.setBounds(eventBox1.getX(), eventBox1.getY() - eventBox1.getHeight(), 32, 32);
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
    opponent.setBounds(1500, 575, opponentwidth, opponentheight);
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
    flag.setBounds(493, 365, 20, 20);
    flag.setOpaque(true);
    flag.setBackground(new Color(0xFFAFAF));
    cp.add(flag);
    text_win.setBounds(300, 104, 690, 68);
    text_win.setEditable(false);
    text_win.setText("Congratulations! Goal achieved!");
    text_win.setBackground(Color.GREEN);
    text_win.setVisible(false);
    Hashtable<TextAttribute, Object> text_win_map = new Hashtable<TextAttribute, Object>();
    text_win_map.put(TextAttribute.FAMILY, "Dialog");
    text_win_map.put(TextAttribute.SIZE, new Integer(48));
    text_win_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    text_win.setFont(new Font(text_win_map));
    text_win.setForeground(Color.WHITE);
    cp.add(text_win);
    // Ende Komponenten
    loadBuffedImages();
  } // end of init
    
  //Methode f�r Bewegungen wird erstellt
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
    if (sneaking == true && sneak_confirm == true) {
      marioCharacter.setSize(marioCharacter.getWidth(), 70);
      marioCharacter.setLocation(marioCharacter.getX(), marioCharacter.getY() + 30);
      sneak_confirm = false;
    } // end of if 
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
    this.opponentdie();
    this.paintLabels();
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
    // Wenn Mario bei seiner maximalen Sprungh�he angekommen ist, wird es auf nicht mehr springend gesetzt, damit die Schwerkraft wieder greift
    if (currentJumpHeight == maxJumpHeight) {
      currentJumpHeight = 1;
      jumping = false;
    } // end of if
  }

  public void gravity() {
    // Sollte Mario nicht im Sprung sein oder auf dem Boden stehen, wird er nach unten verschoben, bis er den Boden ber�hrt
    if (jumping == false && this.contactwithground_top() == false && this.contactwithopponent() != true) {
      /*if (contactwithbox_top() == false) {
        
      }       */
      marioCharacter.setLocation(marioCharacter.getX(), marioCharacter.getY() + jumpSpeed);
      if (this.contactwithground_top() == true){
        currentJumpHeight = 0;
      }
    } // end of if
    if (opponentjump == false && this.opponentcontactwithground() == false) {     //Wenn der Gegner nicht Springt und nicht den Boden ber?hrt,
      opponent.setLocation(opponent.getX(), opponent.getY() + jumpSpeed/2);         //dann f?llt er zur?ck auf den Boden
    } // end of if
  }
  //Wenn Mario den Boden ber�hrt (Marios Y + H�he = Y des Bodes), gibt die Methode true aus, um die Schwerkraft zu stoppen
  public boolean contactwithground_top() {
    if ((marioCharacter.getY() + marioCharacter.getHeight()) == ground.getY()) {
      return true;
    } else {
      return false;
    } 
  }
  
  public boolean contactwithopponent(){
    if (marioCharacter.getBounds().intersects(opponent.getBounds())){
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
    if (marioCharacter.getY() - marioCharacter.getHeight() <= eventBox1.getY()
        && (marioCharacter.getX() >= eventBox1.getX() && marioCharacter.getX() <= eventBox1.getX() + 50)) {
      return true;
    } else {
      return false;
    } 
  }
  public boolean contactwithbox_bottom() {
    if (marioCharacter.getY()<= eventBox1.getY() - eventBox1.getHeight()
        && (marioCharacter.getX() >= eventBox1.getX() && marioCharacter.getX() <= eventBox1.getX() + 50)) {
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
      opponent.setLocation(opponent.getX(), opponent.getY() - jumpSpeed/2);           //Y-Koordinate um jumpSpeed erh?hen
      currentJumpHeightOpponent += jumpSpeed/2;                                       //currentJumpHeightOpponent wird um jumpSpeed erh?ht
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
        opponent.setLocation(opponent.getX() -1, opponent.getY());        //sont l?uft der gegner alle 10ms um 2 Einheiten in Richtung des Gegners
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
    if (marioCharacter.getBounds().intersects(opponent.getBounds())){
      if (marioCharacter.getBounds().contains(opponent.getBounds().x, opponent.getBounds().y) && marioCharacter.getBounds().contains(opponent.getBounds().x + 5, opponent.getBounds().y) || (marioCharacter.getBounds().contains(opponent.getBounds().x + opponent.getBounds().width, opponent.getBounds().y) && marioCharacter.getBounds().contains(opponent.getBounds().x + (opponent.getBounds().width -5), opponent.getBounds().y)) ){
        opponentdie = true;
      } else if (nottouched == true) {
      text_fail.setVisible(true);
      timer_update.stop();
      opponent_jump.stop();    
      opponentleft.stop();
      }
    }
  }

  public void opponentdie(){
    if (opponentdie == true) {
      nottouched = !true;
      opponent.setBounds(opponent.getBounds().x, opponent.getBounds().y +1, opponent.getSize().width , opponent.getSize().height -1);
    }
    if (opponent.getBounds().height == -2){
      opponentdie = false;
      nottouched = true;
      opponent.setBounds(1500, 575, opponentwidth, opponentheight);
    }
  }
    
  public void chek_for_finishline_ActionPerformed(ActionEvent evt) {
    if (marioCharacter.getBounds().intersects(flag.getBounds())) {
      flagtouched = true;
      text_win.setVisible(true);
      timer_update.stop();
      opponent_jump.stop();    
      opponentleft.stop(); 
    } // end of if
    if (flagtouched == true){
      if(this.contactwithground_top() != true){
      marioCharacter.setBounds(marioCharacter.getBounds().x, marioCharacter.getBounds().y +1, marioCharacter.getBounds().width, marioCharacter.getBounds().height);
      flag.setBounds(flag.getBounds().x, flag.getBounds().y +1, flag.getBounds().width, flag.getBounds().height);
      }
    }
  
  } // end of chek_for_finishline_ActionPerformed

  private void loadBuffedImages(){
    
  //Es wird versucht die BufferedImages zu laden
    try {
      boxImage = ImageIO.read((getClass().getResourceAsStream("box.jpg")));
      eventBoxImage = ImageIO.read((getClass().getResourceAsStream("eventBox.jpg")));
    } catch(Exception e) {
      System.out.println(e.toString());
    }
  }
  
  
  private void paintLabels(){
    //Graphics werden geladen und zeichnen ein Bild
    
    //BoxGraphics = box1.getGraphics();
    eventBoxGraphics = eventBox1.getGraphics();
    //BoxGraphics.drawImage(boxImage,0,0,this);
    eventBoxGraphics.drawImage(eventBoxImage,0,0,this);
    
  }
  // Ende Methoden
}
