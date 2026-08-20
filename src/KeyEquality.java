import java.util.*;

public class KeyEquality 
{
    public static void main(String[] args) 
    {
        HashMap<Employee, String> map = new HashMap<>();
        map.put(new Employee(101), "Scott");
        map.put(new Employee(101), "Smith");
        System.out.println(map.size());
    }
}
class Employee 
{
    int id;

    Employee(int id) 
    {
        this.id = id;
    }
}