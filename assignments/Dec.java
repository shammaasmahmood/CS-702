public class Dec { 
    public void StudentAge() 
    { 
        // local variable age 
        int age = 0; 
        age = age + 5; 
        System.out.println("Student age is : " + age + "Years"); 
    } 
  
    public static void main(String args[]) 
    { 
        Dec obj = new Dec(); 
        obj.StudentAge(); 
    } 
}