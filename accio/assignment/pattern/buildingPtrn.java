package accio.assignment.pattern;

public class buildingPtrn {
   public static void main(String[] args) {
     int arr[]={9,3,7,6,2,0,4};
     int n = arr.length;
     int max = Integer.MAX_VALUE;
     for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
     }
     int k=max;
     for(int i=1;i<=max;i++){
        for(int j=0;j<n;j++){
            if(arr[j]>=k){
                System.out.print("*");
            }else{
                System.out.print("\t");   
            }
            System.out.println();
            k--;
        }
     }
     System.out.println("0000");
   } 
}
