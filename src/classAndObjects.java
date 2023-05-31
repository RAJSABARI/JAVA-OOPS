public class classAndObjects {


    public static void main(String[] args) {

/*
Object:
1.An object is an pysical thing that present in the wolrd.
2.Many objects can be created for a class.
3.New keyword is used to allocate memory for a new object .
4.It occupies memory.
5.ClassName variable= new ClassName(); like this we need to create the object.
 */
        //Object
        Student loga= new Student();
        Student raj= new Student();
        Student tamil= new Student();
        Student subash= new Student();


    }


/*
Class:
1.A class is an just a template.It is only logical .It is not a physical thing.
2.Instance variable:It is the state of the object.It is declared out the method declaration.Every object of the class has the copy  of instance.
3.A class is a group of objects of same properties.but the value of the properties are differ.
4.A class can contain method,constructor,nested classes,instance variable.
5.class does not occupy memory.
5.The first letter of the class starts with caps.
 */
}
class Student{
    //Instance variable
    int rollNo;
    String name;

    //Method
    public  static  void welcome(){
        System.out.println("welcome");
    }

    Student(){

    }
}