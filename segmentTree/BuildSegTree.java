package segmentTree;

import java.util.Arrays;

public class BuildSegTree {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 7 };
        int n = arr.length;
        int seg[] = new int[2 * n];
        Build(0, 0, n - 1,seg,arr);
        Arrays.stream(seg).forEach(x -> System.out.print(x+" "));
    }

    private static void Build(int i, int l, int r,int seg[],int arr[]) {
        // TODO Auto-generated method stub
        if(l==r){
            seg[i]=arr[r];return;
        }
        int mid = (l + r)/2;
        Build(2*i+1, l, mid, seg, arr);
        Build(2*i+2, mid+1,r, seg, arr);
        seg[i]=seg[2*i+1]+seg[2*i+2];
    }
}
