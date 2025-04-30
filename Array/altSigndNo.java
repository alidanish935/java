package Array;

public class altSigndNo {
    public static void main(String[] args) {
        // https://course.acciojob.com/idle?question=41ec8fa1-0379-498c-8bc5-7afb2991f9b5
    }
    static void isAlternate(int arr[], int n)
    {
        for(int i=0;i<n-1;i++){
            if(arr[i]*arr[i+1]>=0){
                System.out.print("No");return;
            }
        }
                System.out.print("Yes");
        
    }
}
