public class SomeClass {
private static int classCounter=0;
public final int instanceNumber;
private final String name;

public SomeClass(String name){
    this.name=name;
    classCounter++;
    instanceNumber=classCounter;
    System.out.println(name + " created,instance is "+ instanceNumber);
}


    public int getInstanceNumber() {
        return instanceNumber;
    }
}



















//=======================NOTE================
//1.Intialize data in constructor when it is passed by something else(code or db)
//2.per each instance we can change the final variable only ONCE but after that you can't change it