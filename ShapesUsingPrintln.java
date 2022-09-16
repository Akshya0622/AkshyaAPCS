/* Name: Akshya Subbaraman
* Purpose: Chapter 1 Exercise 9 - Make a program that prints out these shapes.
* Pseudocode: Call methods drawShapes, drawShapes2, and drawShapes3 into main to print out
each half of the hexagon and the dotted line.
* Maintenance Log: 9/14/22- Made drawShapes method. 9/15/22- Made drawShapes2 and drawShapes3 methods
and called all three into main.
*/
public class ShapesUsingPrintln {
    public static void main(String[] args) {
        drawShapes();
        drawShapes2();
        System.out.println();
        drawShapes3();
        drawShapes();
        drawShapes2();
        System.out.println();
        drawShapes3();
        drawShapes2();
        drawShapes();
        drawShapes3();
        drawShapes2();
    }
    public static void drawShapes() {
        System.out.println("   ________");
        System.out.println("  /        \\");
        System.out.println(" /          \\");
    }
    public static void drawShapes2() {
        System.out.println(" \\          /");
        System.out.println("  \\________/");
    }
    public static void drawShapes3() {
        System.out.println("  -\"-'-\"-'-\"-");
    }
}
