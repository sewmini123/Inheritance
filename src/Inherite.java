public class Inherite {
    void run(){
        System.out.println("Can Run");
    }
}
class Inherit1 extends Inherite{
    void jump(){
        System.out.println("Can Jump");
    }
}
class Inherit2 extends Inherit1{
    void climb(){
        System.out.println("Can Climb");
    }
}
class Tset{
    public static void main(String[] args) {
        Inherit2 ab = new Inherit2();
        ab.run();
        ab.jump();
        ab.climb();
    }
}