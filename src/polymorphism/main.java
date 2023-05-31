package polymorphism;

public class main {
    public static void main(String[] args) {
    maths obj= new maths();
        System.out.println(obj.add(10,20));
        animal animal=new animal();
        animal cat= new cat();
       animal dog = new dog();
       animal.animalsound();
       cat.animalsound();
       dog.animalsound();

    }
}
/*
*POLYMORPHISM
 there are two types of polymorphism
 * compail -- method overloading --
 * run time-- method overriding -- dynamic polymorphosm
 */
// compail time poymorphism
class maths{
    public int add(int a,int b){
       return  a+b;
    }
    public int add(int a, int b,int c){
        return a+b+b;
    }
}

// run time
class animal {
    public void animalsound(){
        System.out.println("animal make sound");
    }
}
class dog extends animal{
    @Override
    public void animalsound(){
        System.out.println("dog sound like bow bow");
    }
}
class cat extends animal{
    public void animalsound(){
        System.out.println("cat sound like meow meow");
    }
}