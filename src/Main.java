public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4;
        System.out.println(Math.PI);
//        Math m = new Math();

        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);
    }
}



//public class Main {
//    public static void main(String[] args) {
//        SomeClass one=new SomeClass("one");
//        SomeClass two=new SomeClass("two");
//        SomeClass three=new SomeClass("three");
//
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        //one.instanceNumber=4// not possibel sinnce "instanceNumber" is final 2 point
//
//    }
//}
//



//=========================NOTE==================================
//1.Final doesn't mean constant because they can be modified BUT ONLY ONCE AND
//ANY MODIFICATION MUST BE PERFORMED BEFORE THE CLASS CONSTRUCTOR FINISHES
//WHICH MEANS WE CAN ASSIGN A VALUE TO FINAL WHEN WE FIRST DECLARE IT OR IN THE CONSTRUCTOR
