package accio.assignment.TwoDarray;

public class maximaMinima {
    public static void main(String[] args) {
        int arr[][]={ {1 ,2 ,3},{4 ,5 ,6},{7 ,8 ,9}};
        int n= arr.length,m=arr[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean flag = true;
                for(int c=0;c<m;c++){
                    if(arr[i][j]>arr[i][c]){
                        flag = false;
                        break;
                    }
                }

                for(int r=0;r<m;r++){
                    if(arr[r][j]>arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(arr[i][j]);
                    return;
                }
            }
        }
        System.out.print(-1);
    }
}
