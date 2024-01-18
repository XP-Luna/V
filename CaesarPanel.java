import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class CaesarPanel extends JPanel implements ActionListener{
    
    private Kryptographie gui;
    private JButton start,dlese;
    private JLabel lbVerschiebung,lbVText;
    private JTextField tfVerschiebung;
    private JScrollPane spVText;
    public JTextArea taVText;
    
    public CaesarPanel(Kryptographie gui){
        this.gui=gui;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setBackground(Color.orange);
        //Label Verschiebung
        lbVerschiebung=new JLabel("Verschiebung");
        lbVerschiebung.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(lbVerschiebung);
        //Textfeld Verschiebung
        tfVerschiebung=new JTextField();
        tfVerschiebung.setText("0");
        tfVerschiebung.setAlignmentX(Component.LEFT_ALIGNMENT);
        tfVerschiebung.setMaximumSize(new Dimension(Short.MAX_VALUE,200));
        add(tfVerschiebung);
        //Button Start
        start=new JButton("Start");
        start.setAlignmentX(Component.LEFT_ALIGNMENT);
        start.addActionListener(this);
        
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
        add(start);
    }
    
    public void actionPerformed(ActionEvent e){
        int verschiebung=Integer.valueOf(tfVerschiebung.getText());
        String vText=Krypt.caesar(gui.textfeld.getText());
        taVText.setText(vText);
    }
    }

