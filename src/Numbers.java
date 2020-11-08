public class Numbers {

    private int red;
    private int green;
    private int blue;

    GraphView gView;

    public Numbers(int r, int g, int b)
    {
        this.red = r;
        this.green = g;
        this.blue = b;

    }

    public void attach(GraphView gView)
    {
        this.gView = gView;
    }

    public void updateValues(int n1, int n2, int n3)
    {
        this.red = n1;
        this.green = n2;
        this.blue = n3;

        gView.updateGraph(n1, n2, n3);

    }




}
