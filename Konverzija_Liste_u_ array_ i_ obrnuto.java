import java.util.*;

public class Convert_List_to_array_and_array_to_List
{
    // Konvertovanje List<Integer> u int[]
	
    Integer[] arr = list.toArray(new Integer[0]);
	
    public static int[] List_Integer_to_int_array(List<Integer> list)
    {
        int[] arr = new int[list.size()];
		
	for (int i = 0; i < arr.length; i++)
	    arr[i] = list.get(i);
	
	return arr;
    }
	
     // Konvertovanje int[] u List<Integer>
	
    List<Integer> list = Arrays.asList(arr);
   
    public static List<Integer>  Int_array_to_List_Integer(int[] arr)
    {
        List<Integer> list = new ArrayList<Integer>();
 
	for (int i = 0; i < arr.length; i++)
	    list.add( arr[i] );
	
	return list;
    }

   // Pravljenje List<Integer> sa slucajnim brojevima
    public static List<Integer>  Make_A_List_Integer(int n, int max)
    {
        Random random = new Random();
	List<Integer> list = new ArrayList<Integer>();
		
	for(int i = 0; i < n; i++)
	    list.add(random.nextInt(max));
	
	return list;
   }	
    

    public static void main (String[] args)
    {
   	List<Integer> list =  Make_A_List_Integer(7, 9);
   	   
	for (int i = 0; i < list.size(); i++)
	    System.out.print(	list.get(i) + " " );
	    	    
	System.out.println( );
	   
	int[] a = List_Integer_to_int_array(list);
	   
	for (int i = 0; i < a.length; i++)
	    System.out.print(  a[i] + " "  ); 
	     
	List<Integer> list_2 = Int_array_to_List_Integer( a );
	    
	System.out.println( );
	    
	for (int i = 0; i < list_2.size(); i++)
	    System.out.print(	list_2.get(i) + " " );
	    	    
	System.out.println( );
	   
	int[] a_2 = List_Integer_to_int_array(list_2);
	    
	for (int i = 0; i < a_2.length; i++)
	    System.out.print(  a_2[i] + " "  ); 
		
    }		

}
     
