package codePractice;
class duparray {
      
      static int removedup(int[] arr) {
      int rd = 0;
      for(int i = 1;i<arr.length;i++){
      	if(arr[rd]!=arr[i]){
      		rd++;
      		arr[rd]=arr[i];
      }
    }
	return rd+1;
  }
 
public static void main(String args[]){
 int[] arr={2,2,3,3,4,5,6,7};
 for(int i=0;i<arr.length;i++){
 	System.out.println(arr[i] + " ");
       }
 int rd = removedup(arr);
 System.out.println("After removing");
 for(int i=0;i<rd;i++){
 	System.out.println(arr[i] + " ");
       }
 }
}