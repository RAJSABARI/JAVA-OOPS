package abstraction;

public class main {
    public static void main(String[] args) {
        bike obj= new royalenfield();
        obj.gear();

    }
}
/*
abstraction is uesd to hid the unwanted data showing necessary data
 */
abstract class bike{
    abstract void run();
    abstract void gear();
}
class royalenfield extends bike{
    void run(){
        System.out.println("running succesfully");
    }
    void gear(){
        System.out.println("gear chaning successfully");
    }
}
