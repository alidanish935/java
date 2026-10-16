package arraylist;

public class Implement2 {
    static class MyArrayList{
        int arr[];
        int size;
        MyArrayList(){
            arr= new int[10];
            size=0;
        }
        void add(int x){
            if(size>=arr.length){
                resize();
            }
            arr[size]=x;
            size++;
        }
        int get(int idx){
            if(size<=0){
                throw new RuntimeException("List is emplty");
            }
            return arr[idx];
        }
        void resize(){
            
            int newArr[]= new int[2 * arr.length];
            for(int i=0;i<arr.length;i++){
                newArr[i]=arr[i];
            }
            arr = newArr;
        }
    }
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(5);
        myArrayList.add(9);
        myArrayList.add(7);
        myArrayList.add(1);
        myArrayList.add(7);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(0);
        myArrayList.add(7);
        System.out.println(myArrayList.get(5));
    }
}
