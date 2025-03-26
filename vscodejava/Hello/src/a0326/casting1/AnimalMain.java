package a0326.casting1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal eagle = new Eagle();
        
        eagle.sleep();

        Eagle eagleOBJ = (Eagle)eagle;
        eagleOBJ.eat();
    }
}
