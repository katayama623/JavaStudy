class Human{
    String name;

    public void sum(int math,int english){
        System.out.println(math + english);
    }
}

public class Greeting{
    public static void main(String[] args){
        Human human0 = new Human();
        human0.name = "sato";
        System.out.println(human0.name);
        human0.sum(90, 20);

        Human human1 = new Human();
        human1.name = "kimura";
        System.out.println(human1.name);
        human1.sum(40, 50);
    }

}