public class RectangleRunner {
    public static void main(String [] args){
        Rectangle plot1 = new Rectangle(10, 20 );
        Rectangle plot2 = new Rectangle(10);
        Rectangle plot3 = new Rectangle();
        System.out.println("Plot 1 length: "+ plot1.getLength());
        System.out.println("Plot 1 width:  "+ plot1.getWidth());
        System.out.println("Plot 1 length: "+ plot1.calculateArea());
        System.out.println();
        System.out.println("Plot 2 length: "+ plot2.getLength());
        System.out.println("Plot 2 width:  "+ plot2.getWidth());
        System.out.println("Plot 2 length: "+ plot2.calculateArea());
        System.out.println();
        System.out.println("Plot 3 length: "+ plot3.getLength());
        System.out.println("Plot 3 width:  "+ plot3.getWidth());
        System.out.println("Plot 3 length: "+ plot3.calculateArea());
        System.out.println();

    }
}
