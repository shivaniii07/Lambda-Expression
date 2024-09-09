package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("System starts");

//        MyInter i=new MyInter() {
//            @Override
//            public void sayhello() {
//                System.out.println("i am saying hello from 1st ");
//            }
//        };
//
//        i.sayhello();
//
//        MyInter i2=new MyInter() {
//            @Override
//            public void sayhello() {
//                System.out.println("i am saying hello from second");
//            }
//        };
//        i2.sayhello();

//        using our interface with the help of lambda

        MyInter i=()->
        {
            System.out.println("this is first time i am using lambda");
        };
        i.sayhello();



//        implementing interface sumInter using lambda

        SumInter s=(a,b)->
        {
            System.out.println(a+b);
        };

        s.sum(2,3);


//        implementing LengthInter using lambda

        LengthInter l=(str)->
        {
            return str.length();
        };
        System.out.println("length of string is"+" "+l.length("shivani"));
    }

}
