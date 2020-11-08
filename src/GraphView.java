import javax.swing.*;
import java.awt.*;


public class GraphView extends JFrame {

    int n1;
    int n2;
    int n3;

    public GraphView(int n1, int n2, int n3)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;

        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void updateGraph(int n1, int n2, int n3)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        repaint();
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        int y1 = getHeight() - n1 - 15;

        int y2 = getHeight() - n2 - 15;

        int y3 = getHeight() - n3 - 15;




        g2.setColor(Color.RED);
        Rectangle redRect = new Rectangle(10, y1, 50, n1);
        g2.draw(redRect);
        g2.fill(redRect);

        g2.setColor(Color.GREEN);
        Rectangle greenRect = new Rectangle(200,y2,50,n2);
        g2.draw(greenRect);
        g2.fill(greenRect);

        g2.setColor(Color.BLUE);
        Rectangle blueRect = new Rectangle(400,y3,50,n3);
        g2.draw(blueRect);
        g2.fill(blueRect);


    }


}

