import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class VAnalysePanel extends JPanel implements ActionListener{
    
    private Kryptographie gui;
    private JButton encode,decode;
    private JLabel lbVerschiebung,lbVText;
    private JTextField tfVerschiebung;
    private JScrollPane spVText;
    public JTextArea taVText;
   
    
    public VAnalysePanel(Kryptographie gui){
        this.gui=gui;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setBackground(Color.yellow);
        //Label Verschiebung
        lbVerschiebung=new JLabel("Schlüsselwort");
        lbVerschiebung.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(lbVerschiebung);
        //Textfeld Verschiebung
        tfVerschiebung=new JTextField();
        tfVerschiebung.setText("0");
        tfVerschiebung.setAlignmentX(Component.LEFT_ALIGNMENT);
        tfVerschiebung.setMaximumSize(new Dimension(Short.MAX_VALUE,200));
        add(tfVerschiebung);
                
        //Label lbVText
        lbVText=new JLabel("Verschlüsselter Text");
        lbVText.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(lbVText);

        //VText
        taVText=new JTextArea();
        taVText.setLineWrap(true);
        spVText=new JScrollPane(taVText);
        spVText.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(spVText);
        

        //Buttons 
   
        encode=new JButton("Zerlege");
        encode.setAlignmentX(Component.LEFT_ALIGNMENT);
        encode.addActionListener(this);
        add(encode);
        decode=new JButton("Zerlege und Zähle ");
        decode.setAlignmentX(Component.LEFT_ALIGNMENT);
        decode.addActionListener(this);
        add(decode);
        
    }
    
    public void actionPerformed(ActionEvent e){
        // String ztext ="Block: \r\n";
        // int  key=Integer.parseInt(tfVerschiebung.getText());
        // String[] tbloecke=Krypt.zerlege(gui.textfeld.getText(),key);
          // for (String t: tbloecke)
        // {
          // ztext += t + "\r\n \r\n  Block: \r\n";
        // }
       
         // taVText.setText(ztext);
    


       
    }
  }