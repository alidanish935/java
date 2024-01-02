package accio.String;

public class ctNoOfWrds {
    public static void main(String[] args) {
        String s = "      I am Danish Ali   ";
        int n = s.length();
        // ct no of space before first char i.e I
        int st =0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                st++;
            }else{
                break;
            }
        }
        // ct no of space  char till last char i.e  i
        int ed =n-1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                ed--;
            }else{
                break;
            }
        }
        int ct=0;
        for(int i=st;i<=ed;i++){
            if(s.charAt(i)==' '){
                ct++;
            }
        }
        System.out.println(ct+1);;
    }
}
