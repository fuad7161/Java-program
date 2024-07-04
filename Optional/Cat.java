package Optional;

class Cat {
    public static final int MaxLive = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;

    public Cat(String name , int age){
        livesRemaining = MaxLive;
        this.name = name;
        this.age = age;
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }

    void meow(){
        System.out.println("Meow");
    }
}