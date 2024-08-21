public class TestGenericClass 
{ 
    public static void main (String[] args) 
    { 
       Book book = new Book("The Hunger Games");
       GenericClass<Integer> integerObj = new GenericClass<Integer>(37); 
       GenericClass<String> stringObj = new GenericClass<String>("Zebra"); 
       GenericClass<Book> bookObj = new GenericClass<Book>(book); 
       System.out.println("The integer is " + integerObj.getObject());
       System.out.println("The String is " + stringObj.getObject());
       System.out.println("The Book is " + bookObj.getObject().getTitle());
    } 
}