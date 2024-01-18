import java.awt.*;
import javax.swing.*;

public class Diagramm extends JPanel{

    private double[] data;
    private final int skalierungX=13;
    private final int offsetX=5;
    private final int balkenbreite=6;
    private double maxValue;    

    public Diagramm(){
        data=null;
    }
    
    public void setData(double[] data){
        if (data!=null){
            this.data=data.clone();
            maxValue=0;
            for(double h:data){
                if (h>maxValue) maxValue=h;
            }
            setPreferredSize(new Dimension(data.length*skalierungX,getHeight()));
            revalidate();
        } else this.data=null;
        repaint();
    }
    
    private int getPanelY(double yValue){
        return (int)(getHeight()-35-yValue/maxValue*(getHeight()-40));
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.gray);
        int y=0;
        for(int i=0;i<maxValue*100;i++){
            y=getPanelY(i*0.01);
            g.drawLine(0,y,getWidth(),y);
        }
        if (data!=null){
            int h;
            for(int i=0;i<data.length;i++){
                y=getHeight()-25;
                g.setColor(Color.black);
                g.drawString((char)(i+65)+"",i*skalierungX+offsetX,y+5);
                g.setColor(Color.red);
                g.fillRect(i*skalierungX+offsetX,getPanelY(data[i]),balkenbreite,getPanelY(0)-getPanelY(data[i]));
            }
        }
    }
}
