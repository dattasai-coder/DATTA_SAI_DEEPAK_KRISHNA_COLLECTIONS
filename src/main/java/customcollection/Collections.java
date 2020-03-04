package customcollection;
import java.util.*;
public class Collections {
	   @SuppressWarnings("resource")
	public static void main(String args[])
	   {
		  CustomCollectiontask object = new CustomCollectiontask();
		  for(int i=6;i<10;i++)
			  object.addelements(i);
		  for(int i=66;i<70;i++)
		  {
			  int a=i;
			  char c=(char)a;  
			  object.addelements(c);
		  }
		  object.addelements("epam");
		  for(int i=6;i<=7;i++)
		  { 
			  int count=(i+i+1)/2;
			  object.addelements(count);  
		  }
		  System.out.println("Capacity of collection_object :"+object.capacity());
		  System.out.println("Size of collection_object :"+object.size());
		  System.out.println("Enter the position of the element you want to retrieve");
		  Scanner sc = new Scanner(System.in);
		  int index=sc.nextInt();
		  Object k=object.get(index);
		  System.out.println(k);
		  System.out.println("Enter the position of the element you want to delete");
		  int remove=sc.nextInt();
		  object.remove(remove);
		  System.out.println("Available elements are: ");
		  object.print();	 
		  System.out.println("Capacity of collection_object :"+object.capacity());
		  System.out.println("Size of collection_object :"+object.size());

	   }
}