package GarbageCollector;

/**
 * Cat
 */
class Cat {
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;

    public Cat(){
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }

    void meow(){
        System.out.println("Meow");
    }
}

public class GarbageCollector {
    public static void main(String[] args) {
        Cat mycat = new Cat();
        mycat.meow();
        System.out.println("I'm done doing cat stuff");

        System.out.println(Cat.getCatCount());
    }
    private static void DoCatStuff(){
        Cat Mycat = new Cat();
        Mycat.meow();
    }
}
