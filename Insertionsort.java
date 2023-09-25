package DataStructuure;

public class Insertionsort {
	
	 public static void main(String args[]){
	      int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;

	      for (int i=1 ;i< size; i++){
	         int val = array[i];
	         int pos = i;

	         while(array[pos-1]>val && pos>0){
	            array[pos] = array[pos-1];
	            pos = pos-1;
	         }
	         array[pos] = val;
	      }

	      for (int i=0 ;i< size; i++){
	         System.out.print(" "+array[i]);
	      }
	   }
}
