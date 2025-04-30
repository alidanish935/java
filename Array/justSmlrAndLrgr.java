package Array;

public class justSmlrAndLrgr {
    public static void main(String[] args) {
        int arr[]={2,1,5,9,6,8,7,4};int k=5;
        // find just smaller and just larger number then k i.e 4 and 6
        int justSmlr = Integer.MIN_VALUE; int justLrgr = Integer.MAX_VALUE;
        for(int i=0;i<8;i++){
            if(arr[i]>justSmlr && arr[i]<k){
                justSmlr = arr[i];
            }
            if(arr[i]<justLrgr && arr[i]>k){
                justLrgr=arr[i];
            }
        }
        System.out.print(justSmlr+" ->"+justLrgr);

    }
}
