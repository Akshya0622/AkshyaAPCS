public class TwelveDays {
    public static void main (String[] args) {
        first();
        second();
        third();
        fourth();


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
}
