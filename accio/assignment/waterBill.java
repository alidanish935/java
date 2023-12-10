package accio.assignment;

public class waterBill {
    public static void main(String[] args) {
        // For first 100 litres: Rs. 15 per litre
        // For next 100 litres: Rs. 14 per litre
        // After 200 litres: Rs. 12 per litre
        int w = 105; // ans -- 1570
        int bill = 0;
        while(w!=0){
            if(w<=100){
                bill = bill+w*15;
            }
            if(w>200){

            }
        }
    }
}
