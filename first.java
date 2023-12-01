class first{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,9};
        int n = arr.length;
        int x = 2;

        int l = 0,r=n-1;
        while (l<=r) {
            int mid = (l+r)/2;
            if(arr[mid]==x){
                System.out.print("x is found at : "+mid);
                return;
            }
            if(x<arr[mid]){
                r=mid-1;
            }
            if(x>arr[mid]){
                l=mid+1;
            }
        }
        System.out.println("x is not found");
    }
}