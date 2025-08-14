import java.util.ArrayList;

public class ArrayListRemoveMethod 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0); // remove element at index 0
        System.out.println("Elements of List after Removing: "+list);
    }
}
