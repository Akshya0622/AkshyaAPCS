/* Name: Akshya Subbaraman
* Purpose: Chapter 1 Project 3 - Use static methods to print out the lyrics to
"There was an old lady who swallowed a fly"
* Pseudocode: Each ___Lady method returns a verse of the song by calling a swallow___ method.
Main calls all of these methods
* Maintenance Log: 9/15/22 - Finished Program. 9/15/22 - Changed program to call methods within other methods */
public class KidSongs {
    public static void main(String[] args) {
       flyLady();
       spiderLady();
       birdLady();
       catLady();
       dogLady();
       horse();
    }
    public static void fly() {
        System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.");
    }
    public static void flyLady() {
        System.out.println("There was an old lady who swallowed a fly.");
        fly();
    }
    public static void spiderLady() {
        System.out.println("There was an old lady who swallowed a spider,\nThat wriggled and iggled and jiggled inside her.");
        swallowSpider();
    }
    public static void swallowSpider() {
        System.out.println("She swallowed the spider to catch the fly,");
        fly();
    }
    public static void birdLady() {
        System.out.println("There was an old lady who swallowed a bird,\nHow absurd to swallow a bird,");
        swallowBird();
    }
    public static void swallowBird() {
        System.out.println("She swallowed the bird to catch the spider,");
        swallowSpider();
    }
    public static void catLady() {
        System.out.println("There was an old lady who swallowed a cat,\nImagine that to swallow a cat.");
        swallowCat();
    }
    public static void swallowCat() {
        System.out.println("She swallowed the cat to catch the bird,");
        swallowBird();
    }
    public static void dogLady() {
        System.out.println("There was an old lady who swallowed a dog,\nWhat a hog to swallow a dog.");
        swallowDog();
    }
    public static void swallowDog() {
        System.out.println("She swallowed the dog to catch the cat,");
        swallowCat();
    }
    public static void horse() {
        System.out.println("There was an old lady who swallowed a horse,\nShe died of course.");
    }
}
