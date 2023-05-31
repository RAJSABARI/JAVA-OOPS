package abstraction.inter;

public class main {
    public static void main(String[] args) {
    brake obj=new car();
    obj.brake();


    }
}

class car implements brake{
    public void brake(){
        System.out.println("it is used to slow down the car");
    }
    public void media(){
        System.out.println("its is used for media properse");
    }
}
