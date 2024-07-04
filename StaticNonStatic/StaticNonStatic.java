package StaticNonStatic;

/**
 * Cat
 * you access all staic method through the class not from the object.
 */
class Cat {
    public static final int MaxLive = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;

    public Cat(){
        livesRemaining = MaxLive;
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }

    void meow(){
        System.out.println("Meow");
    }
}
public class StaticNonStatic {
    public static void main(String[] args) {
        Cat mycat = new Cat();
        mycat.meow();
        System.out.println("I'm done doing cat stuff");
        System.out.println(mycat.livesRemaining);
        System.out.println(Cat.getCatCount());
    }
}
