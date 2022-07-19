/*  When a class is already extended to our thread than we can't extend more because multiple inheritance is not suppported.
    So to make thread we can also implement Runnable interface.
    But runnable interface don't have start() and run() is abstract.
*/

class MyThread1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello by C.T.");
            try{
                Thread.sleep(2000);//for delay
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class UsingRunnableInterface {
    public static void main(String args[]){
        MyThread1 m1=new MyThread1();
        Thread t1=new Thread(m1);//becoz runnable don't have start()
        
        boolean flag=t1.isAlive();//false if thread is new born or in dead state
        System.out.println(flag);

        t1.start();//loading child thread to queue

        //work of main thread
        for(int i=0;i<5;i++){
            System.out.println("Hii by M.T.");
            try{
                //sleep() moves the thread to waiting state
                Thread.sleep(1000);//for delay
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


/*  OUTPUT(may vary)

false
Hii by M.T.
Hello by C.T.
Hii by M.T.
Hii by M.T.
Hello by C.T.
Hii by M.T.
Hello by C.T.
Hii by M.T.
Hello by C.T.
Hello by C.T.

 */
