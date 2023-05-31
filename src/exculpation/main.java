package exculpation;

public class main {
    public static void main(String[] args) {
    amount obj= new amount();
        System.out.println(obj.getamount());
        System.out.println(obj.setamount(1000));
        System.out.println(obj.getamount());
    }
}
class amount{
    private int amount=500;
    public int getamount(){
        return amount;
    }
    public int setamount(int cash){
        return this.amount=cash;
    }
}
