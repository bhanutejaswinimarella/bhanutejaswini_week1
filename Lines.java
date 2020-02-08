import java.io.*;
import java.awt.*;
import java.applet.*;
/*<applet code="Lines" width=300 height=200></applet>*/
public class Lines extends Applet
{
public void paint(Graphics g) 
{
setBackground(Color.cyan);
Color k=new Color(150,40,30);
g.drawLine(0,0,50,50);
setForeground(k);
g.drawRect(50,50,100,40);
g.fillRoundRect(150,90,50,50,15,15);
g.setColor(Color.green);
int xpoints[]={30,200,30,200,30};
int ypoints[]={330,330,500,500,330};
int num=5;
g.drawPolygon(xpoints,ypoints,num);
}
}