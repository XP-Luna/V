import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class VigenerePanel extends JPanel implements ActionListener{
    
    private Kryptographie gui;
    private JButton encode,decode;
    private JLabel lbVerschiebung,lbVText;
    private JTextField tfVerschiebung;
    private JScrollPane spVText;
    public JTextArea taVText;
   
    
    public VigenerePanel(Kryptographie gui){
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
        tfVerschiebung.setText("A");
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
   
        encode=new JButton("Verschlüsseln");
        encode.setAlignmentX(Component.LEFT_ALIGNMENT);
        encode.addActionListener(this);
        add(encode);
        decode=new JButton("Entschlüsseln");
        decode.setAlignmentX(Component.LEFT_ALIGNMENT);
        decode.addActionListener(this);
        add(decode);
        
    }
    
    public void actionPerformed(ActionEvent e){
       boolean ent;
         if (e.getSource() == encode) {     
         String  key=tfVerschiebung.getText();
         String vText=Krypt.encode(gui.textfeld.getText());
         taVText.setText(vText);
     }

    if (e.getSource() == decode) {
          String  key=tfVerschiebung.getText();
         String vText=Krypt.decode(gui.textfeld.getText());
         taVText.setText("Geheimtext: " + vText); 

     }
     
     
    
       
    }
    }