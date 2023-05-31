package inhertence;

public class main {
    public static void main(String[] args) {
    bmw obj= new bmw(2,500,10,5455,"bmw",4);
        System.out.println(obj.mailage);
    }
}
class car{
    int regnummber;
    String name;
    int wheels;
    public car(int regnummber,String name,int wheels){
        this.regnummber=regnummber;
        this.wheels=wheels;
        this.name=name;
    }
}
class bmw extends car{
    int seat;
    int speed;
    int mailage;
        public bmw(int seat,int speed,int mailage,int regnmber,String name,int wheels){
            super(regnmber,name,wheels);
            this.seat=seat;
            this.speed=speed;
            this.mailage=mailage;

        }
}