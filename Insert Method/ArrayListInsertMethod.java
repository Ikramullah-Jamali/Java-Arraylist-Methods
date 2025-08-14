    
import java.util.ArrayList;

public class ArrayListInsertMethod 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(1, 1); // insert 1 at index 1
        System.out.println("Elements of List after Inserting: "+list);
    }
}
