package programs;
import java.util.Arrays;
import java.util.*;

public class Array_to_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] arr={"private","public","protected","default","private"};
       System.out.println("array:"+Arrays.toString(arr));
       List<String> list=new ArrayList<String>();
       for(String a:arr){
    	   list.add(a);
       }
       System.out.println("list:"+list);

       
	}

}
