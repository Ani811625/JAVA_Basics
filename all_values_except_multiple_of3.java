public class all_values_except_multiple_of3 {
    public static void main(String[] args) {
        int i=1;
        while(i<=50){
            if(i%3==0){
                i++;
                continue;
            }else {
                System.out.println(i);
            }
           i++;
        }
    }
}
