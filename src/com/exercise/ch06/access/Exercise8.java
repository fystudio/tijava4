package com.exercise.ch06.access;
import static net.mindview.util.Print.print;

class Connection1{
    private Connection1(){
        print("Create connection1");
    }
    private static Connection1 cons = new Connection1();
    public static Connection1 access(){
        return cons;
    }
}

class Connection2{
    private Connection2(){
        print("Create connection2");
    }
    public static Connection2 makeConnection(){
        return new Connection2();
    }
}
class ConnectionManager{
   public void testConnection1(){
       for(int i=0;i<5;i++)
       Connection1.access();
   }

   public void testConnection2(){
       for(int i=0;i<5;i++)
       Connection2.makeConnection();
   }
}
public class Exercise8 {

    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        cm.testConnection1();
        cm.testConnection2();
    }
}
