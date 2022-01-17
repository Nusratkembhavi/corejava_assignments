package lamada_assignment;
import java.util.ArrayList;
import java.util.List; 
import java.util.function.Consumer;

public class assign_8 {

     public static void main(String[] args){

        Print t=new Print();

        t.start();
        }

}

class Print extends Thread{

         @Override
          public void run() {
               List<Integer> l=new ArrayList<>();

                 l.add(29);

                l.add(19);

                l.add(6);

                l.add(18);

             Consumer<Integer> C=(n)->{ 
                                          System.out.println(n);
                 };

    l.forEach(C);
 }
}