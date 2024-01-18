import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class HaeufigkeitPanel extends JPanel implements ActionListener{

    private Kryptographie gui;
    private JButton start;
    private JLabel lbDiagramm,lbTabelle;
    private JScrollPane sp,spHTabelle;
    private JTextArea taHTabelle;
    private Diagramm diagramm;

    public HaeufigkeitPanel(Kryptographie gui){
        this.gui=gui;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(10, 10, 10, 10));     
        setBackground(Color.green);
        //Button Start
        start=new JButton("Start");
        start.setAlignmentX(Component.LEFT_ALIGNMENT);
        start.addActionListener(this);
        add(start);     

        
        //Label Tabelle
        lbTabelle=new JLabel("Häufigkeitstabelle");
        add(lbTabelle);       

        //Häufigkeitstabelle
        taHTabelle=new JTextArea();
        spHTabelle=new JScrollPane(taHTabelle);
        spHTabelle.setAlignmentX(Component.LEFT_ALIGNMENT);
        spHTabelle.setPreferredSize(new Dimension(300,100));   
        spHTabelle.setMinimumSize(new Dimension(300, 50));
        spHTabelle.setMaximumSize(new Dimension(300, 100));
        add(spHTabelle);
        
        //Label lbDiagramm
        lbDiagramm=new JLabel("Häufigkeitsdiagramm");
        add(lbDiagramm);       
        //Diagramm
        diagramm=new Diagramm();
        diagramm.setPreferredSize(new Dimension(1000,100));   
        sp=new JScrollPane(diagramm);
        sp.setAlignmentX(Component.LEFT_ALIGNMENT);
        sp.setPreferredSize(new Dimension(300,200));
        sp.setMinimumSize(new Dimension(300, 100));
        add(sp);
    }

    public void starteAnalyse(){
         if (!gui.textfeld.getText().equals("")){
             double[] h=Krypt.hAnalyse(gui.textfeld.getText());
             String tabellenText="";
             char c;
             for(int i=0;i<26;i++){
                 c=(char)(i+65);
              
                 double prozent=Math.round(h[i]*1000)/10;
                 String balken="";
                 for(int j=0;j<prozent;j++){
                     balken+="x";
                 }
                 tabellenText+=c+": "+prozent+"%\t"+balken+"\n";
             }
             taHTabelle.setText(tabellenText);
             diagramm.setData(h);
         }
    }

    public void actionPerformed(ActionEvent e){
        starteAnalyse();
    }
}
