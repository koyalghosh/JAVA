/*          MULTI THREADING(Reduces time to do a process)
It is based on a small part of software.
It is the ability of a CPU to provide multiple threads of execution concurrently.
It is based on Round Robin Queue.
Equal time is divided to each process.
There are two types of thread i.e.
i)  Single Thread(main thread)
ii) Multi Thread(main thread and child Threads)

Thread can be created by Thread class as well as Runnable interface.
A thread must have a start() and run()
Thread class have run() but it's dummy so override is must
*/

// This program is using Thread class.

//import java.lang.*;//package of Thread class and Runnable interface

class MyThread extends Thread{
    public void run(){
        //contains task of child thread
        for(int i=0;i<5;i++){
            System.out.println("Child Thread printing " + i);
        }
    }
}
public class UsingThreadClass {
    public static void main(String args[]){
        MyThread t1=new MyThread();//child thread created
        t1.start();//child thread loaded to queue
         
        // task for main thread
        for(int i=0;i<5;i++){
            System.out.println("Main Thread printing " + i);
        }
    }
}


/*
OUTPUT (may vary)
Main Thread printing 0
Child Thread printing 0
Main Thread printing 1
Child Thread printing 1
Main Thread printing 2
Main Thread printing 3
Main Thread printing 4
Child Thread printing 2
Child Thread printing 3
Child Thread printing 4
 */
