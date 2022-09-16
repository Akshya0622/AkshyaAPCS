/* Name: Akshya Subbaraman
* Purpose: Write a program that outputs the lyrics of the song "The 12 days of Christmas"
* Pseudocode: Each numbered method calls a non-numbered method that corresponds to what the person received
on that day of Christmas. For example, Third() calls hens(). The non-numbered method outputs a line
of the song, then calls the method that corresponds to what the person received on the previous day of Christmas.
For example, hens() outputs one line of the song then calls doves(), which outputs the line that should follow,
and also calls partridge() which outputs the next line that should follow. This sequence continues throughout
the song as the song lists what the person received on each of the 12 days, counting backwards from 12.
* Maintenance Log: 9/15/22 - Finished Program */
public class TwelveDays {
    public static void main (String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
        sixth();
        seventh();
        eighth();
        ninth();
        tenth();
        eleventh();
        twelfth();
    }
    public static void first() {
        System.out.println("On the first day of Christmas, my true love sent to me\nA partridge in a pear tree");
    }
    public static void partridge() {
        System.out.println("And a partridge in a pear tree.");
    }
    public static void second() {
        System.out.println("On the second day of Christmas, my true love sent to me");
        doves();
    }
    public static void doves() {
        System.out.println("Two turtle doves,");
        partridge();
    }
    public static void third() {
        System.out.println("On the third day of Christmas, my true love sent to me");
        hens();
    }
    public static void hens() {
        System.out.println("Three french hens,");
        doves();
    }
    public static void fourth() {
        System.out.println("On the fourth day of Christmas, my true love sent to me");
        birds();
    }
    public static void birds() {
        System.out.println("Four calling birds,");
        hens();
    }
    public static void fifth() {
        System.out.println("On the fifth day of Christmas, my true love sent to me");
        rings();
    }
    public static void rings() {
        System.out.println("Five gold rings (five golden rings),");
        birds();
    }
    public static void sixth() {
        System.out.println("On the sixth day of Christmas, my true love sent to me");
        geese();
    }
    public static void geese() {
        System.out.println("Six geese a-laying,");
        rings();
    }
    public static void seventh() {
        System.out.println("On the seventh day of Christmas, my true love sent to me");
        swans();
    }
    public static void swans() {
        System.out.println("Seven swans a-swimming,");
        geese();
    }
    public static void eighth() {
        System.out.println("On the eighth day of Christmas, my true love sent to me");
        maids();
    }
    public static void maids() {
        System.out.println("Eight maids a-milking,");
        swans();
    }
    public static void ninth() {
        System.out.println("On the ninth day of Christmas, my true love sent to me");
        ladies();
    }
    public static void ladies() {
        System.out.println("Nine ladies dancing,");
        maids();
    }
    public static void tenth() {
        System.out.println("On the tenth day of Christmas, my true love sent to me");
        lords();
    }
    public static void lords() {
        System.out.println("Ten lords a-leaping,");
        ladies();
    }
    public static void eleventh() {
        System.out.println("On the eleventh day of Christmas, my true love sent to me");
        pipers();
    }
    public static void pipers() {
        System.out.println("Eleven pipers piping,");
        lords();
    }
    public static void twelfth() {
        System.out.println("On the twelfth day of Christmas, my true love sent to me");
        drummers();
    }
    public static void drummers() {
        System.out.println("Twelve drummers drumming,");
        pipers();
    }
}
