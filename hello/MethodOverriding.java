class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass
{
    void methodOfSuperClass()
    {
                
        System.out.println("From Sub Class");
    }
    void display(){
    	System.out.print("hellow its in subclass other methode..!");
    }
}
 
public class MethodOverriding
{
    public static void main(String[] args)
    {
        SuperClass superclass = new SuperClass();
        superclass.methodOfSuperClass();         
        SubClass subclass = new SubClass();
        subclass.methodOfSuperClass();        
        
        SubClass s = (subclass);
        subclass.methodOfSuperClass();
        s.display();
        
    }
}