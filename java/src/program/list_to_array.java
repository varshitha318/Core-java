package program;

import java.util.ArrayList;
import java.util.List;
public class list_to_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> list=new ArrayList<String>();
         list.add("jan");
         list.add("feb");
         list.add("march");
         list.add("april");
         list.add("may");
//         String[] array=list.toArray(new String[list.size()]);
//         System.out.println("array:"+Arrays.toString(array));
//         System.out.println("list:"+list);
         String[] array=new String[list.size()];
         for (int i=0;i<list.size();i++) {
        	 array[i]=list.get(i);
         }
         System.out.print("array:");

         for (String a:list) {
           System.out.print("  "+a);
         }
         System.out.println("");

         System.out.println("list:"+list);

	}

}
