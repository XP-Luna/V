import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.EmptyBorder;
import java.io.*;

public class Kryptographie extends JFrame implements ActionListener{
    private JLabel lbTextfeld;
    public JTextArea textfeld;
    private JScrollPane spTA;
    private JTabbedPane tabbedPane; 
    private JButton dlese;

    public Kryptographie(){
        setTitle("V - A very secure Verschlüsselung");
        setBounds(100,100,400,400);
        setMinimumSize(new Dimension(200,300));
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        ((JPanel)getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));        
        
        Box reihe = Box.createHorizontalBox();
      
        //Label über dem Textfeld
        lbTextfeld=new JLabel("Text");
        lbTextfeld.setPreferredSize(new Dimension(0,25));
        lbTextfeld.setMaximumSize(new Dimension(Short.MAX_VALUE,25));
        lbTextfeld.setAlignmentX(Component.LEFT_ALIGNMENT);
        reihe.add(lbTextfeld);
        reihe.add(Box.createHorizontalGlue());
           
        //Button Start
        dlese=new JButton("Lade");
        dlese.setAlignmentX(Component.RIGHT_ALIGNMENT);
        dlese.addActionListener(this);
        reihe.add(dlese);  
        add(reihe);
        
        //Textfeld
        textfeld=new JTextArea();
        textfeld.setLineWrap(true);
        spTA=new JScrollPane(textfeld);
        spTA.setPreferredSize(new Dimension(300,190));
        spTA.setMinimumSize(new Dimension(Short.MAX_VALUE,50));
        spTA.setMaximumSize(new Dimension(Short.MAX_VALUE,200));
        spTA.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(spTA);
        
        //Tabs
        tabbedPane= new JTabbedPane();
        tabbedPane.addTab("V",new VigenerePanel(this));
        tabbedPane.addTab("Caesar",new CaesarPanel(this));
        tabbedPane.addTab("Häufigkeitsanalyse",new HaeufigkeitPanel(this));
        tabbedPane.addTab("Vig. Analyse",new VAnalysePanel(this));
        add(tabbedPane);
        pack();
        setVisible(true);
    }

    public static void main(String[] a){
        new Kryptographie();
    }

 public void actionPerformed(ActionEvent e){
         //To do
    textfeld.setText("");
    DLesen dlesen = new DLesen(); 
    String t =  dlesen.ladeDatei("klar.txt");
    textfeld.setText(t);
    }
}
