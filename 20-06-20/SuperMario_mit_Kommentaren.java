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
  import java.awt.Graphics;
  import javax.imageio.ImageIO;
  
  /**
  *
  * Beschreibung
  *
  * @version 1.3 vom 10.06.2020
  * @Marc St�we, Lars von Bandel, Niklas Goldschmidt und Dominik Schulz
  *
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
  int maxJumpHeight = 240;
  int currentJumpHeight = 0;
  
  //Abfragevariablen f�r Marios Aktionen
  boolean jumping = false;
  boolean moveRight = false;
  boolean moveLeft = false;
  boolean falling = false;
  boolean flagtouched = false;
  boolean sneaking = false;
  boolean sneak_confirm = true;
  boolean baby = true;
  boolean normal = false;
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
  private BufferedImage pedestalBoxImage;
  
  //Graphics werden definiert  
  private Graphics eventBoxGraphics;  
  private JTextField text_win = new JTextField();
  
  //Weitere Abfragen
  boolean poweruppickupable = false;
  boolean poweruppickuped = false;
  // Ende Attribute
  
  
  public void init() {
    Container cp = getContentPane();
    cp.setLayout(null);
    cp.setSize(1080, 720);
    cp.setBounds(0, 0, 957, 691);
    panels.add(powerUP);
    panels.add(ground);
    panels.add(flag);
    
    /*Boxen werden bei Panels & Boxes hinzugefügt
    * um bei paintLabels die Texturen leichter zu laden 
    * und um die Elemente leichter zu verschieben, wenn
    * Mario bewegt wird
    */
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
    
    /*EventBoxen werden bei Panels & eventBoxes hinzugefügt
    * um bei paintLabels die Texturen leichter zu laden 
    * und um die Elemente leichter zu verschieben, wenn
    * Mario bewegt wird
    */
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
    
    /*Podest Boxen werden bei Panels und PedestalBoxes hinzugefügt
    * um bei paintLabels die Texturen leichter zu laden 
    * und um die Elemente leichter zu verschieben, wenn
    * Mario bewegt wird
    */
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
    
    //Boxen werden plaziert
    box1.setBounds(784, 450, 32, 32);
    box1.setOpaque(false);
    cp.add(box1);
    box2.setBounds(816, 450, 32, 32);
    box2.setOpaque(false);
    cp.add(box2);
    box3.setBounds(848, 450, 32, 32);
    box3.setOpaque(false);
    cp.add(box3);
    box4.setBounds(1665, 450, 32, 32);
    box4.setOpaque(false);
    cp.add(box4);
    box5.setBounds(1729, 450, 32, 32);
    box5.setOpaque(false);
    cp.add(box5);
    box6.setBounds(1761, 450, 32, 32);
    box6.setOpaque(false);
    cp.add(box6);
    box7.setBounds(1793, 336, 32, 32);
    box7.setOpaque(false);
    cp.add(box7);
    box8.setBounds(1825, 336, 32, 32);
    box8.setOpaque(false);
    cp.add(box8);
    box9.setBounds(1857, 336, 32, 32);
    box9.setOpaque(false);
    cp.add(box9);
    box10.setBounds(1889, 336, 32, 32);
    box10.setOpaque(false);
    cp.add(box10);
    box11.setBounds(1921, 336, 32, 32);
    box11.setOpaque(false);
    cp.add(box11);
    box12.setBounds(1953, 336, 32, 32);
    box12.setOpaque(false);
    cp.add(box12);
    box13.setBounds(2075, 336, 32, 32);
    box13.setOpaque(false);
    cp.add(box13);
    box14.setBounds(2107, 336, 32, 32);
    box14.setOpaque(false);
    cp.add(box14);
    box15.setBounds(2139, 336, 32, 32);
    box15.setOpaque(false);
    cp.add(box15);
    box16.setBounds(2171, 336, 32, 32);
    box16.setOpaque(false);
    cp.add(box16);
    box17.setBounds(2203, 336, 32, 32);
    box17.setOpaque(false);
    cp.add(box17);
    box18.setBounds(2235, 450, 32, 32);
    box18.setOpaque(false);
    cp.add(box18);
    box19.setBounds(2835, 450, 32, 32);
    box19.setOpaque(false);
    cp.add(box19);
    box20.setBounds(2922, 336, 32, 32);
    box20.setOpaque(false);
    cp.add(box20);
    box21.setBounds(2954, 336, 32, 32);
    box21.setOpaque(false);
    cp.add(box21);
    box22.setBounds(2986, 336, 32, 32);
    box22.setOpaque(false);
    cp.add(box22);
    box23.setBounds(3114, 336, 32, 32);
    box23.setOpaque(false);
    cp.add(box23);
    box24.setBounds(3146, 450, 32, 32);
    box24.setOpaque(false);
    cp.add(box24);
    box25.setBounds(3178, 450, 32, 32);
    box25.setOpaque(false);
    cp.add(box25);
    box26.setBounds(3210, 336, 32, 32);
    box26.setOpaque(false);
    cp.add(box26);
    
    //EventBoxen werden gesetzt
    eventBox1.setBounds(262, 450, 32, 32);
    eventBox1.setOpaque(false);
    cp.add(eventBox1);
    eventBox2.setBounds(880, 450, 32, 32);
    eventBox2.setOpaque(false);
    cp.add(eventBox2);
    eventBox3.setBounds(1697, 450, 32, 32);
    eventBox3.setOpaque(false);
    cp.add(eventBox3);
    eventBox4.setBounds(2235, 336, 32, 32);
    eventBox4.setOpaque(false);
    cp.add(eventBox4);
    eventBox5.setBounds(2580, 450, 32, 32);
    eventBox5.setOpaque(false);
    cp.add(eventBox5);
    eventBox6.setBounds(2644, 450, 32, 32);
    eventBox6.setOpaque(false);
    cp.add(eventBox6);
    eventBox7.setBounds(2644, 336, 32, 32);
    eventBox7.setOpaque(false);
    cp.add(eventBox7);
    eventBox8.setBounds(2708, 450, 32, 32);
    eventBox9.setOpaque(false);
    cp.add(eventBox8);
    eventBox9.setBounds(3146, 336, 32, 32);
    eventBox9.setOpaque(false);
    cp.add(eventBox9);
    eventBox10.setBounds(3178, 336, 32, 32);
    eventBox10.setOpaque(false);
    cp.add(eventBox10);
    
    //Podstboxen werden gesetzt
    //Erstes Podest
    //erste Spalte
    pedestalBox1.setBounds(600, 598, 32, 32);
    pedestalBox1.setOpaque(false);
    cp.add(pedestalBox1);
    
    //zweite Spalte
    pedestalBox2.setBounds(632, 598, 32, 32);
    pedestalBox2.setOpaque(false);
    cp.add(pedestalBox2);
    pedestalBox3.setBounds(632, 566, 32, 32);
    pedestalBox3.setOpaque(false);
    cp.add(pedestalBox3);
    
    //dritte Spalte
    pedestalBox4.setBounds(696, 598, 32, 32);
    pedestalBox4.setOpaque(false);
    cp.add(pedestalBox4);
    pedestalBox5.setBounds(696, 566, 32, 32);
    pedestalBox5.setOpaque(false);
    cp.add(pedestalBox5);
    
    //vierte Spalte
    pedestalBox6.setBounds(728, 598, 32, 32);
    pedestalBox6.setOpaque(false);
    cp.add(pedestalBox6);
    
    //Zweites Podest
    //erste Spalte
    pedestalBox7.setBounds(1180, 598, 32, 32);
    pedestalBox7.setOpaque(false);
    cp.add(pedestalBox7);
    
    //zweite Spalte
    pedestalBox8.setBounds(1212, 598, 32, 32);
    pedestalBox8.setOpaque(false);
    cp.add(pedestalBox8);
    pedestalBox9.setBounds(1212, 566, 32, 32);
    pedestalBox9.setOpaque(false);
    cp.add(pedestalBox9);
    
    //dritte Spalte
    pedestalBox10.setBounds(1244, 598, 32, 32);
    pedestalBox10.setOpaque(false);
    cp.add(pedestalBox10);
    pedestalBox11.setBounds(1244, 566, 32, 32);
    pedestalBox11.setOpaque(false);
    cp.add(pedestalBox11);
    pedestalBox12.setBounds(1244, 534, 32, 32);
    pedestalBox12.setOpaque(false);
    cp.add(pedestalBox12);
    
    //vierte Spalte
    pedestalBox13.setBounds(1340, 598, 32, 32);
    pedestalBox13.setOpaque(false);
    cp.add(pedestalBox13);
    pedestalBox14.setBounds(1340, 566, 32, 32);
    pedestalBox14.setOpaque(false);
    cp.add(pedestalBox14);
    pedestalBox15.setBounds(1340, 534, 32, 32);
    pedestalBox15.setOpaque(false);
    cp.add(pedestalBox15);
    
    //fünfte Spalte
    pedestalBox16.setBounds(1372, 598, 32, 32);
    pedestalBox16.setOpaque(false);
    cp.add(pedestalBox16);
    pedestalBox17.setBounds(1372, 566, 32, 32);
    pedestalBox17.setOpaque(false);
    cp.add(pedestalBox17);
    
    //sechste Spalte
    pedestalBox18.setBounds(1404, 598, 32, 32);
    pedestalBox18.setOpaque(false);
    cp.add(pedestalBox18);
    
    //Ziel Podest
    pedestalBox19.setBounds(3550, 598, 32, 32);
    pedestalBox19.setOpaque(false);
    cp.add(pedestalBox19);
    
    //zweite Spalte
    pedestalBox20.setBounds(3582, 598, 32, 32);
    pedestalBox20.setOpaque(false);
    cp.add(pedestalBox20);
    pedestalBox21.setBounds(3582, 566, 32, 32);
    pedestalBox21.setOpaque(false);
    cp.add(pedestalBox21);
    
    //dritte Spalte
    pedestalBox22.setBounds(3614, 598, 32, 32);
    pedestalBox22.setOpaque(false);
    cp.add(pedestalBox22);
    pedestalBox23.setBounds(3614, 566, 32, 32);
    pedestalBox23.setOpaque(false);
    cp.add(pedestalBox23);
    pedestalBox24.setBounds(3614, 534, 32, 32);
    pedestalBox24.setOpaque(false);
    cp.add(pedestalBox24);
    
    //vierte Spalte
    pedestalBox25.setBounds(3646, 598, 32, 32);
    pedestalBox25.setOpaque(false);
    cp.add(pedestalBox25);
    pedestalBox26.setBounds(3646, 566, 32, 32);
    pedestalBox26.setOpaque(false);
    cp.add(pedestalBox26);
    pedestalBox27.setBounds(3646, 534, 32, 32);
    pedestalBox27.setOpaque(false);
    cp.add(pedestalBox27);
    pedestalBox28.setBounds(3646, 502, 32, 32);
    pedestalBox28.setOpaque(false);
    cp.add(pedestalBox28);
    
    //fünfte Spalte
    pedestalBox29.setBounds(3678, 598, 32, 32);
    pedestalBox29.setOpaque(false);
    cp.add(pedestalBox29);
    pedestalBox30.setBounds(3678, 566, 32, 32);
    pedestalBox30.setOpaque(false);
    cp.add(pedestalBox30);
    pedestalBox31.setBounds(3678, 534, 32, 32);
    pedestalBox31.setOpaque(false);
    cp.add(pedestalBox31);
    pedestalBox32.setBounds(3678, 502, 32, 32);
    pedestalBox32.setOpaque(false);
    cp.add(pedestalBox32);
    pedestalBox33.setBounds(3678, 470, 32, 32);
    pedestalBox33.setOpaque(false);
    cp.add(pedestalBox33);
    
    //sechste Spalte
    pedestalBox34.setBounds(3710, 598, 32, 32);
    pedestalBox34.setOpaque(false);
    cp.add(pedestalBox34);
    pedestalBox35.setBounds(3710, 566, 32, 32);
    pedestalBox35.setOpaque(false);
    cp.add(pedestalBox35);
    pedestalBox36.setBounds(3710, 534, 32, 32);
    pedestalBox36.setOpaque(false);
    cp.add(pedestalBox36);
    pedestalBox37.setBounds(3710, 502, 32, 32);
    pedestalBox37.setOpaque(false);
    cp.add(pedestalBox37);
    pedestalBox38.setBounds(3710, 470, 32, 32);
    pedestalBox38.setOpaque(false);
    cp.add(pedestalBox38);
    pedestalBox39.setBounds(3710, 438, 32, 32);
    pedestalBox39.setOpaque(false);
    cp.add(pedestalBox39);
    
    //siebte Spalte
    pedestalBox40.setBounds(3742, 598, 32, 32);
    pedestalBox40.setOpaque(false);
    cp.add(pedestalBox40);
    pedestalBox41.setBounds(3742, 566, 32, 32);
    pedestalBox41.setOpaque(false);
    cp.add(pedestalBox41);
    pedestalBox42.setBounds(3742, 534, 32, 32);
    pedestalBox42.setOpaque(false);
    cp.add(pedestalBox42);
    pedestalBox43.setBounds(3742, 502, 32, 32);
    pedestalBox43.setOpaque(false);
    cp.add(pedestalBox43);
    pedestalBox44.setBounds(3742, 470, 32, 32);
    pedestalBox44.setOpaque(false);
    cp.add(pedestalBox44);
    pedestalBox45.setBounds(3742, 438, 32, 32);
    pedestalBox45.setOpaque(false);
    cp.add(pedestalBox45);
    pedestalBox46.setBounds(3742, 406, 32, 32);
    pedestalBox46.setOpaque(false);
    cp.add(pedestalBox46);
    
    //achte Spalte
    pedestalBox47.setBounds(3774, 598, 32, 32);
    pedestalBox47.setOpaque(false);
    cp.add(pedestalBox47);
    pedestalBox48.setBounds(3774, 566, 32, 32);
    pedestalBox48.setOpaque(false);
    cp.add(pedestalBox48);
    pedestalBox49.setBounds(3774, 534, 32, 32);
    pedestalBox49.setOpaque(false);
    cp.add(pedestalBox49);
    pedestalBox50.setBounds(3774, 502, 32, 32);
    pedestalBox50.setOpaque(false);
    cp.add(pedestalBox50);
    pedestalBox51.setBounds(3774, 470, 32, 32);
    pedestalBox51.setOpaque(false);
    cp.add(pedestalBox51);
    pedestalBox52.setBounds(3774, 438, 32, 32);
    pedestalBox52.setOpaque(false);
    cp.add(pedestalBox52);
    pedestalBox53.setBounds(3774, 406, 32, 32);
    pedestalBox53.setOpaque(false);
    cp.add(pedestalBox53);
    
    powerUP.setVisible(false);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() { // Event f�r die Abfrage der Tasteneingaben wird definiert
      
      @Override
      public boolean dispatchKeyEvent(KeyEvent ke) {
        switch (ke.getID()) {
          //sollte irgendeine Taste heruntergedrückt werden, wird folgender Code abgefragt
          case KeyEvent.KEY_PRESSED:
            // Wenn die heruntergedrückte Taste die Leertaste ist
            if (ke.getKeyCode() == KeyEvent.VK_SPACE) { 
              if (currentJumpHeight == 0){
                jumping = true;  
              }
              if (contactwithbox_top(boxes, eventBoxes, pedestalBoxes)) {
                
              }
            }
            // folgender Befehl wird ausgeführt, sollte Taste 'D' gedrückt werden
            if (ke.getKeyCode() == KeyEvent.VK_D) {
              moveLeft = false;
              moveRight = true;
              moveSpeed = -2;
            }
            // folgender Befehl wird ausgef�hrt, sollte Taste 'A' gedrückt werden
            if (ke.getKeyCode() == KeyEvent.VK_A) { 
              moveRight = false;
              moveLeft = true;
              moveSpeed = 2; 
            }
            if (ke.getKeyCode() == KeyEvent.VK_SHIFT) {
              sneaking = true;
            } // end of if
            break;
          // Folgendes passiert, sollte eine Taste losgelassen werden
          case KeyEvent.KEY_RELEASED: 
            if (ke.getKeyCode() == KeyEvent.VK_D) {
              moveRight = false;
            }
            if (ke.getKeyCode() == KeyEvent.VK_A) {
              moveLeft = false;
            }
            if (ke.getKeyCode() == KeyEvent.VK_SHIFT) {
              sneaking = false;
              sneak_confirm = true;
              if (baby == false) {
                marioCharacter.setLocation(marioCharacter.getX(), marioCharacter.getY() - 16);
                marioCharacter.setSize(marioCharacter.getWidth(), marioCharacter.getHeight()*4/3);
              } 
            } 
            break;
        }
        return false;
      }
    });
    // Anfang Komponenten    
    marioCharacter.setBounds(230, 350, 32, 32);
    marioCharacter.setOpaque(true);
    marioCharacter.setBackground(Color.RED);
    
    cp.add(marioCharacter);
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
    flag.setBounds(4032, 406, 20, 20);
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
  
  //Methode für Bewegungen wird erstellt
  /**
   * Die Methode bewegt den Hintergrund.
   */
  public void move() {
    //wenn Mario nach links oder rechts geht, verschiebt sich der Hintergrund / die Panels passend
    if ((moveRight == true && this.contactwithbox_sideleft(boxes, eventBoxes, pedestalBoxes) == false) || (moveLeft == true && this.contactwithbox_sideright(boxes, eventBoxes, pedestalBoxes) == false)) {
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
    if (sneaking == true && sneak_confirm == true && baby == false) {
      marioCharacter.setLocation(marioCharacter.getX(), marioCharacter.getY() + 16);
      marioCharacter.setSize(marioCharacter.getWidth(), marioCharacter.getHeight()*3/4);
      sneak_confirm = false;
    } // end of if 
  }
  
  // Anfang Methoden
  /**
   * Die Methode wird durch ein Timer update ausgeführt,
   * und sorgt dafür, dass die Bewegungen von Mario flüssig aussehen.
   */
  public void timer_update_ActionPerformed(ActionEvent evt) {
    // Methoden zu Bewegung und die Schwerkraft werden bei jedem Tick des Timers (jede Millisekunde) abgerufen
    this.move();
    this.variablereset();
    this.paintLabels();
    this.opponetcontactleft();
    this.contactwithbox_bottom(boxes, eventBoxes);
    this.opponentjump();
    this.gravity();
    this.powerUP_pickup(panels);
    this.touched();
    this.opponentdie();
  } // end of timer_update_ActionPerformed
  
  /**
   * Beschreibt, was passiert, wenn Mario ein liegendes PowerUP berührt
   */
  public void powerUP_pickup(ArrayList<JPanel> allpnls){
    if (poweruppickupable == true && marioCharacter.getBounds().intersects(powerUP.getBounds()) == true) {
      marioCharacter.setLocation(marioCharacter.getX(), marioCharacter.getY() - marioCharacter.getHeight());
      marioCharacter.setSize(marioCharacter.getWidth(), marioCharacter.getHeight()*2);
      powerUP.setVisible(false);
      poweruppickupable = false;
      poweruppickuped = true;
      baby = false;
      normal = true;
      panels.remove(powerUP);
    } // end of if
  }
  /**
   * Die Methode wird ausgeführt, wenn der Start Knopf gedrückt wird.
   */
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
  /**
   * Setzt die Variablen zurück
   */
  public void variablereset() {
    // Wenn Mario bei seiner maximalen Sprungh�he angekommen ist, wird es auf nicht mehr springend gesetzt, damit die Schwerkraft wieder greift
    if (currentJumpHeight == maxJumpHeight) {
      currentJumpHeight = 1;
      jumping = false;
    } // end of if
  }
  /**
   * 
   */
  public void gravity() {
    // Sollte Mario nicht im Sprung sein oder auf dem Boden stehen, wird er nach unten verschoben, bis er den Boden ber�hrt
    if (jumping == false && this.contactwithground_top() == false && this.contactwithopponent() != true && this.contactwithbox_top(boxes, eventBoxes, pedestalBoxes) != true) {
      marioCharacter.setLocation(marioCharacter.getX(), marioCharacter.getY() + jumpSpeed);
      falling = true;
      if (this.contactwithground_top() == true){
        currentJumpHeight = 0;
      }
    } // end of if
    if (opponentjump == false && this.opponentcontactwithground() == false) {     //Wenn der Gegner nicht Springt und nicht den Boden ber?hrt,
      opponent.setLocation(opponent.getX(), opponent.getY() + jumpSpeed/2);         //dann f?llt er zur?ck auf den Boden
    } // end of if
  }
  /**
   * Überprüft, ob Mario den Boden berührt.
   */
  public boolean contactwithground_top() {
    //Wenn Mario den Boden berührt, gibt die Methode ein true zurück, damit er nicht durch den Boden fällt
    if ((marioCharacter.getY() + marioCharacter.getHeight()) == ground.getY()) {
      falling = false;
      return true;
    } else {
      return false;
    } 
  }
  /**
   * 
   */
  public boolean contactwithopponent(){
    if (marioCharacter.getBounds().intersects(opponent.getBounds())){
      return true;
    } else {
      return false;
    }
  }
  /**
   * 
   */
  public boolean opponentcontactwithground(){
    if ((opponent.getY() + opponent.getHeight()) == ground.getY()){     //Wenn der Gegner den Boden ber?hrt,
      return true;                                                       //wird zur?ckgegeben, dass er das tut
    } 
    else{
      return false;                                                      //oder es wird zur?ckgegeben, dass er den Boden nicht ber?hrt.
    }        
  }
  /**
   * 
   */
  public boolean opponetcontactleft(){
    if (opponent.getX() <= -opponent.getWidth()){          //Wenn der Gegner aus dem Bild gelaufen ist,
      return true;                                         //wird dies zur?ckgegeben
    }
    else{
      return false;                                       //oder zur?ckgegeben, dass er nicht aus dem Bild gelaufen ist.
    }
  }
  /**
   * Überprüft, ob Marios untere Kante Kontakt mit der oberen Kante irgendeiner Box hat (auf einer Box steht) 
   * und setzt Variablen dann so, dass Mario wieder springen kann
   * 
   * @return help1 (True oder false, je nachdem, ob Mario berührt)
   */
  public boolean contactwithbox_top(ArrayList<JPanel> pan_b, ArrayList<JPanel> pan_eb, ArrayList<JPanel> pan_pb) {
    boolean help1 = 0;
    for (int i = 0; i < pan_b.size(); i++) {
      JPanel boxpanel_b = (JPanel) pan_b.toArray()[i];
      if ((marioCharacter.getY() + marioCharacter.getHeight() == boxpanel_b.getY() && marioCharacter.getX() + marioCharacter.getWidth() > boxpanel_b.getX() && marioCharacter.getX() < boxpanel_b.getX() + boxpanel_b.getWidth())) {
        currentJumpHeight = 0;
        help1 = true;
        falling = false;
        break;                                                                                                                           
      } else {
        help1 = false;
      }
    }
    for (int j = 0; j < pan_eb.size(); j++) {
      if (help1 == true) {
        break;
      }
      JPanel boxpanel_eb = (JPanel) pan_eb.toArray()[j];
      if ((marioCharacter.getY() + marioCharacter.getHeight() == boxpanel_eb.getY() && marioCharacter.getX() + marioCharacter.getWidth() > boxpanel_eb.getX() && marioCharacter.getX() < boxpanel_eb.getX() + boxpanel_eb.getWidth())) {
        currentJumpHeight = 0;
        help1 = true;
        falling = false;
        break;                                                                                                                           
      } else {
        help1 = false;
      }
    }
    for (int h = 0; h < pan_pb.size(); h++) {
      if (help1 == true) {
        break;
      }
      JPanel boxpanel_pb = (JPanel) pan_pb.toArray()[h];
      if ((marioCharacter.getY() + marioCharacter.getHeight() == boxpanel_pb.getY() && marioCharacter.getX() + marioCharacter.getWidth() > boxpanel_pb.getX() && marioCharacter.getX() < boxpanel_pb.getX() + boxpanel_pb.getWidth())) {
        currentJumpHeight = 0;
        help1 = true;
        falling = false;
        break;                                                                                                                           
      } else {
        help1 = false;
      }
    }
    return help1;                                               
  }
  /**
   * Überprüft, ob Marios obere Kante Kontakt mit der unteren Kante einer Box hat (er also gegen einen Block springt) und beschreibt, was daraufhin passiert
   * 
   * @return help2 (True oder false, je nachdem, ob Mario berührt)
   */
  public boolean contactwithbox_bottom(ArrayList<JPanel> pan_b, ArrayList<JPanel> pan_eb) {
    int help2 = 0;
    for (int i = 0; i < pan_b.size(); i++) {
      JPanel boxpanel_b = (JPanel) pan_b.toArray()[i];
      //Wenn Mario gegen einen normalen Block von untern gegenspringt, verschwindet die Box und wird gelöscht
      if (marioCharacter.getY() == boxpanel_b.getY() + boxpanel_b.getHeight() && marioCharacter.getX() + marioCharacter.getWidth()> boxpanel_b.getX() && marioCharacter.getX() < boxpanel_b.getX() + boxpanel_b.getWidth()) {
        jumping = false;
        if (falling == false) {
          boxpanel_b.setVisible(false);
          boxpanel_b.setEnabled(false);
          boxes.remove(i);
        } // end of if
        help2 = 1;
        break;
      } else {
        help2 = 0;
      }
    }
    for (int j = 0; j < pan_eb.size(); j++) {
      if (help2 == 1) {
        break;
      }
      JPanel boxpanel_eb = (JPanel) pan_eb.toArray()[j];
      // Wenn Mario von unten gegen eine Eventbox gegenspringt, wird ein PowerUP über die Box geschoben und sichtbar gemacht zum Einsammeln
      if (marioCharacter.getY() == boxpanel_eb.getY() + boxpanel_eb.getHeight() && marioCharacter.getX() + marioCharacter.getWidth()> boxpanel_eb.getX() && marioCharacter.getX() < boxpanel_eb.getX() + boxpanel_eb.getWidth()) {
        powerUP.setLocation(boxpanel_eb.getX(), boxpanel_eb.getY() - 32);
        jumping = false;
        if ((boxpanel_eb.getX() == powerUP.getX()) && boxpanel_eb.getY() == (powerUP.getY() + powerUP.getHeight()) && falling == false) {
          if (poweruppickuped == false) {
            powerUP.setVisible(true);
            poweruppickupable = true;
          } // end of if
        } // end of if
        help2 = 1;
        break;
      } else {
        help2 = 0;
      }
    }
    if (help2 == 1) {
      return true;
    } else {
      return false;  
    } // end of if-else                    
  }
  /**
   * Überprüft, ob Mario gegen die linke Seite einer Box o. Eventbox o. Pedestalbox läuft 
   * bzw. an der linken Seite einer Box o. Eventbox o. Pedestalboxsteht
   * 
   * @return help3 (true oder false, je nachdem ob Bedingungén zutreffen)
   */
  
  public boolean contactwithbox_sideleft(ArrayList<JPanel> pan_b, ArrayList<JPanel> pan_eb, ArrayList<JPanel> pan_pb){
    int help3 = 0;
    for (int i = 0; i < pan_b.size(); i++) {
      JPanel boxpanel_b = (JPanel) pan_b.toArray()[i];
      if (marioCharacter.getX() + marioCharacter.getWidth() == boxpanel_b.getX() && (marioCharacter.getY() <  boxpanel_b.getY() + boxpanel_b.getHeight() && marioCharacter.getY() + marioCharacter.getHeight() > boxpanel_b.getY())) {
        help3 = 1;
        break;
      } else {                                                                                                                                          
        help3 = 0;  
      } // end of if-else 
    }
    for (int j = 0; j < pan_eb.size(); j++) {
      if (help3 == 1) {
        break;
      }
      JPanel boxpanel_eb = (JPanel) pan_eb.toArray()[j];
      if (marioCharacter.getX() + marioCharacter.getWidth() == boxpanel_eb.getX() && (marioCharacter.getY() <  boxpanel_eb.getY() + boxpanel_eb.getHeight() && marioCharacter.getY() + marioCharacter.getHeight() > boxpanel_eb.getY())) {
        help3 = 1;
        break;
      } else {                                                                                                                                          
        help3 = 0;  
      } // end of if-else 
    }
    for (int h = 0; h < pan_pb.size(); h++) {
      if (help3 == 1) {
        break;
      }
      JPanel boxpanel_pb = (JPanel) pan_pb.toArray()[h];
      if (marioCharacter.getX() + marioCharacter.getWidth() == boxpanel_pb.getX() && (marioCharacter.getY() <  boxpanel_pb.getY() + boxpanel_pb.getHeight() && marioCharacter.getY() + marioCharacter.getHeight() > boxpanel_pb.getY())) {
        help3 = 1;
        break;
      } else {                                                                                                                                          
        help3 = 0;  
      } // end of if-else 
    }
    if (help3 == 1) {
      return true;
    } else {
      return false;  
    } // end of if-else        
  }
  /**
   * Überprüft, ob Mario gegen die rechte Seite irgendeiner Box läuft bzw.
   * an der rechten Seite von irgendeiner Box steht
   * 
   * @return help4 (true or false, je nachdem, ob die Bedingung bei einer Box zutrifft)
   */
  public boolean contactwithbox_sideright(ArrayList<JPanel> pan_b, ArrayList<JPanel> pan_eb, ArrayList<JPanel> pan_pb){
    int help4 = 0;
    for (int i = 0; i < pan_b.size(); i++) {
      JPanel boxpanel_b = (JPanel) pan_b.toArray()[i];
      if (marioCharacter.getX() == boxpanel_b.getX() + boxpanel_b.getWidth() && (marioCharacter.getY() < boxpanel_b.getY() + boxpanel_b.getHeight() && marioCharacter.getY() + marioCharacter.getHeight() > boxpanel_b.getY())) {
        help4 = 1;
        break;
      } else {
        help4 = 0;                                                     
      } 
    }
    for (int j = 0; j < pan_eb.size(); j++){ 
      if (help4 == 1) {
        break;
      }
      JPanel boxpanel_eb = (JPanel) pan_eb.toArray()[j];
      if (marioCharacter.getX() == boxpanel_eb.getX() + boxpanel_eb.getWidth() && (marioCharacter.getY() < boxpanel_eb.getY() + boxpanel_eb.getHeight() && marioCharacter.getY() + marioCharacter.getHeight() > boxpanel_eb.getY())) {
        help4 = 1;
        break;
      } else {
        help4 = 0;  
      } 
    }
    for (int h = 0; h < pan_pb.size(); h++) {
      if (help4 == 1) {
        break;
      }
      JPanel boxpanel_pb = (JPanel) pan_pb.toArray()[h];
      if (marioCharacter.getX() == boxpanel_pb.getX() + boxpanel_pb.getWidth() && (marioCharacter.getY() < boxpanel_pb.getY() + boxpanel_pb.getHeight() && marioCharacter.getY() + marioCharacter.getHeight() > boxpanel_pb.getY())) {
        help4 = 1;
        break;
      } else {
        help4 = 0;  
      } 
    }
    if (help4 == 1) {
      return true;
    } else {
      return false;  
    } // end of if-else                        
  }                            
  /**
   * 
   */
  public void opponent_jump_ActionPerformed(ActionEvent evt) {
    int random;
    random = (int) (Math.random() * 10);                      //Die Zufallszahll wird ausgelost
    switch(random){                                           //Switch mit der Zufallszahl
      case 0:                                                 //Wenn die Zufallszahl 0 ist trift der case ein, dass der Gegner springt
        opponentjump = true;  
    }
    
  } // end of opponent_jump_ActionPerformed
  
  /**
   * 
   */
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
  /**
   * 
   */
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
  /**
   * Es wird überprüft, ob Mario beim Ziel angekommen ist
   */
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
  
  /**
   * Methode lädt die Texutren 
   */
  private void loadBuffedImages(){  
    //Es wird versucht die BufferedImages zu laden
    try {
      boxImage = ImageIO.read(new File("box.jpg"));
      eventBoxImage = ImageIO.read(new File("eventBox.jpg"));
      pedestalBoxImage = ImageIO.read(new File("pedestalBox.jpg"));
    } catch(Exception e) {
      System.out.println(e.toString());
    }
  }
  
  /**
   * Methode färbt die JLabels
   */ 
  private void paintLabels(){
    //Graphics werden geladen und zeichnen ein Bild
    for (JPanel box : boxes) {
      Graphics boxGraphics = box.getGraphics();
      boxGraphics.drawImage(boxImage,0,0,this);
    } // end of for  
    for (JPanel eventBox : eventBoxes) {
      Graphics eventBoxGraphics = eventBox.getGraphics();
      eventBoxGraphics.drawImage(eventBoxImage,0,0,this);
    } // end of for 
    for (JPanel eventBox : pedestalBoxes) {
      Graphics pedestalBoxGraphics = eventBox.getGraphics();
      pedestalBoxGraphics.drawImage(pedestalBoxImage,0,0,this);
    } // end of for
  }
}
