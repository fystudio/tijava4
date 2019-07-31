package com.exercise.ch05.initialization;
import static net.mindview.util.Print.print;
class  Book{
    Book(int mk){
        print("buy a  book"+mk);
    }
}
public class Exercise14 {
        static String s1 ="ops";
        static Book book1;
        static  Book book2;
        static{
           book1 = new Book(1);
           book2 = new Book(2);
        }

    public static void main(String[] args) {
        Exercise14 ex14= new Exercise14();
        print(s1);
    }
}
