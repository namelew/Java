package cc_execices.list_0;

public class quest8 {
    public static void main(String[] args){
        int count = 1, i = 0, n = 100;

        while(count <= 100){
            boolean isprimo = true;
            for(i = 2; i < n; i++){
                if(n%i == 0){
                    isprimo = false;
                }
            }
            if(isprimo){
                System.out.println(n);
            }
            n++;
            count++;
        }
    }
}
