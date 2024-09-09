package work;

public class ThreadDemo {
    public static void main(String[] args) {

//         first thread: thread JOHN

        Runnable thread1=()->{
//           this is body of the thread

            for(int i=0;i<=10;i++)
            {
                System.out.println("Value of i is"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t=new Thread(thread1);
        t.setName("john");
        t.start();


        Runnable t2=()->{
          try{
              for(int i=10;i<=20;i++)
              {
                  System.out.println(i);
                  Thread.sleep(2000);
              }
          }catch(InterruptedException e)
          {
              e.printStackTrace();
          }
        };
        Thread t22=new Thread(t2);
        t22.start();
    }
}
