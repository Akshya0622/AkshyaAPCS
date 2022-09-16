/* Name: Akshya Subbaraman
* Purpose: Chapter 1 Project 3 - Use static methods to print out the lyrics to
"There was an old lady who swallowed a fly"
* Pseudocode: Each method returns a verse from the song. Main calls all of these methods and prints out the song
* Maintenance Log: 9/15/22 - Finished Program */
public class KidSongs {
    public static void main(String[] args) {
       flyLady();
       fly();
       spiderLady();
       swallowSpider();
       flyLady();
       birdLady();
       swallowBird();
       swallowSpider();
       fly();
       birdLady();
       swallowBird();
       swallowSpider();
       fly();
       catLady();
       swallowCat();
       swallowBird();
       swallowSpider();
       fly();
       dogLady();
       swallowDog();
       swallowCat();
       swallowBird();
       swallowSpider();
       fly();
       horse();
    }
    public static void fly() {
        System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.");
    }
    public static void flyLady() {
        System.out.println("There was an old lady who swallowed a fly.");
    }
    public static void spiderLady() {
        System.out.println("There was an old lady who swallowed a spider,\nThat wriggled and iggled and jiggled inside her.");
    }
    public static void swallowSpider() {
        System.out.println("She swallowed the spider to catch the fly,");
    }
    public static void birdLady() {
        System.out.println("There was an old lady who swallowed a bird,\nHow absurd to swallow a bird,");
    }
    public static void swallowBird() {
        System.out.println("She swallowed the bird to catch the spider,");
    }
    public static void catLady() {
        System.out.println("There was an old lady who swallowed a cat,\nImagine that to swallow a cat.");
    }
    public static void swallowCat() {
        System.out.println("She swallowed the cat to catch the bird,");
    }
    public static void dogLady() {
        System.out.println("There was an old lady who swallowed a dog,\nWhat a hog to swallow a dog.");
    }
    public static void swallowDog() {
        System.out.println("She swallowed the dog to catch the cat,");
    }
    public static void horse() {
        System.out.println("There was an old lady who swallowed a horse,\nShe died of course.");
    }
}
