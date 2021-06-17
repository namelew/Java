package cc_execices.list_0;

public class quest7 {
    public static void main(String[] args){
        int count = 1, i = 0, n = 2;

        while(count <= 15){
            boolean isprimo = true;
            for(i = 2; i < n; i++){
                if(n%i == 0){
                    isprimo = false;
                }
            }
            if(isprimo){
                count++;
                System.out.println(n);
            }
            n++;
        }
    }
}
