package arraylist;

public class Implement {

    static class ArrayList{
        int arr[];
        int size=0;

        ArrayList(){
            arr = new int[10];
        }

        void add(int x){
            if(size>=arr.length){
                resize();
            }
            
            arr[size++]=x;
        }
        void resize() {
            // TODO Auto-generated method stub
            int newArr[] = new int[2*arr.length];
            for(int i=0;i<arr.length;i++){
                newArr[i]=arr[i];
            }
            arr = newArr;
        }

        int get(int idx){
            if(idx>=size){
                throw new RuntimeException("Index Out of bound");
            }
            return arr[idx];
        }
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        
        System.out.println(list.get(2));
    }
}
