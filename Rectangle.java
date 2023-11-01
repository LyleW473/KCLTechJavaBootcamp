public class Rectangle
{
    public int length;
    public int width;

    public static void main(String[] args)
    {
        Rectangle myRectangle = new Rectangle(5, 6);
    }

    public Rectangle(int desiredWidth, int desiredLength)
    {   /*
        - This is the constructor for the Rectangle class
        */
        this.width = desiredWidth;
        this.length = desiredLength;
        System.out.println(this.length + " " + this.width);
        System.out.println(this.calcArea());
    }   
    
    public int getWidth()
    {
        return this.width;
    }

    public int getLength()
    {
        return this.length;
    }

    public int calcArea()
    {
        return getWidth() * getLength();

    }
}
