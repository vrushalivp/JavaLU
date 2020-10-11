public class Employee {
    String name="Shweta";
    String city="Pune";
    int age=21;
    public void displayemp()
    {
         System.out.println("The name is "+name);
         System.out.println("The age is "+age);
         System.out.println("The city is "+city);
    }

    public static void main(String[] args) {
         Employee emp=new Employee();
         emp.displayemp();
    }
}
