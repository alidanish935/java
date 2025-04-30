package segmentTree;

import java.util.Arrays;

public class RangeSum {
    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 7, 2, 1, 2, 3 };
        int n = nums.length;

        int seg[] = new int[2 * n];
        Build(0, 0, n - 1, seg, nums);
        // Arrays.stream(seg).forEach(x -> System.out.print(x + " "));
        int sum =rangeSum(0, 0, n - 1, 2, 7,seg);
        System.out.println(sum);
    }

    private static int rangeSum(int i, int l, int r, int st, int ed,int seg[]) {
        // TODO Auto-generated method stub
        if(r<st || l>ed){
            return 0;
        }else if(l>= st && r<=ed){
            return seg[i];
        }
        int mid = (l+r)/2;
        return rangeSum(2*i+1, l, mid, st, ed, seg)+ rangeSum(2*i+2, mid+1, r, st, ed, seg);
    }

    private static void Build(int i, int l, int r, int seg[], int nums[]) {
        // TODO Auto-generated method stub
        if (l == r) {
            seg[i] = nums[r];
            return;
        }
        int mid = (l + r) / 2;
        Build(2 * i + 1, l, mid, seg, nums);
        Build(2 * i + 2, mid + 1, r, seg, nums);
        seg[i] = seg[2 * i + 1] + seg[2 * i + 2];
    }
}
