class Box{
    double height;
    double width;
    double depth;
    void setDim(double h, double w, double d)
    {
        height = h;
        width = w;
        depth = d;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class BoxExample{
    public static void main(String args[])
    {
        Box myb = new Box();
        double vol=0;
        myb.setDim(10,5,2.5);

        vol = myb.volume();
        System.out.print("volume = "+vol);
    }
}

