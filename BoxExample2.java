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
class BoxExample2{
    public static void main(String args[])
    {
        Box myb1 = new Box();
        Box myb2 = new Box();
        double vol1,vol2;
        myb1.setDim(10,5,2.5);
        myb2.setDim(5.2,3.5,2.5);

        vol1 = myb1.volume();
        vol2 = myb2.volume();
        System.out.println("volume of Box1 = "+vol1);
        System.out.println("volume of Box2 = "+vol2);
    }
}