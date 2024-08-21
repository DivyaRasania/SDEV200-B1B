public class GenericClass<T> 
{ 
   T obj; 
   public GenericClass(T obj)
   {
      this.obj = obj;
   } 
   public T getObject()
   {
      return this.obj;
   } 
} 
   