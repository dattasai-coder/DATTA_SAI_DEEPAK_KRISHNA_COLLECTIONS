package customcollection;
public class CustomCollectiontask
{
	private int i=0;
	private Object[] objarray=new Object[10];
   public void increasecapacity()
   {
	  int newcapacity=2*objarray.length;
	  Object[] newarray=new Object[newcapacity];
	  for(int j=0;j<objarray.length;j++)
		  newarray[j]=objarray[j];
	  objarray=newarray;
   }
   public void addelements(Object obj)
   {
	  if(i==objarray.length)
		  increasecapacity();
	  objarray[i++]=obj;
   }
   public int capacity()
   {
	   return objarray.length;
   }
   public int size()
   {
	   return i;
   }
   public Object get(int index)
   { 
	  if(index<0 || index>=size())
	  {
		  System.out.println("Index-Out-Of-Bound-Exception");
		  return index;
	  }
	  else
		  return (objarray[index]);
   }
   private int kk=0;
   public void print()
   {
	   for(int j=kk;j<i;j++)
		   System.out.print(objarray[j]+" ");
   }
   public void remove(int index)
   {
	  if(index<0 || index>=size())
		  System.out.println("Index out of bound exception");
	  else
	  {
		  while(index<size()-1)
		  {
			  objarray[index]=objarray[index+1];
			  index++;
		  }
		  objarray[index]=null;
		  i--;
	  }
   }
}
