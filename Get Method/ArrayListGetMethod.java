
import java.util.ArrayList;

public class ArrayListGetMethod 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int firstElement = list.get(0);
        System.out.println("First Element: "+firstElement);
    }
}

