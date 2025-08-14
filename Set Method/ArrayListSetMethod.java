import java.util.ArrayList;

public class ArrayListSetMethod 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.set(0, 5);
        System.out.println("Elements of List after Set: "+list);
    }
}

