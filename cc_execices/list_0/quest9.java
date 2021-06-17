package cc_execices.list_0;

public class quest9 {
    public static void main(String[] args){
        int count = 1, i = 0, n = 2, resto = 0;
        int temp[] = {0, 0};

        while(count <= 15){
            boolean isprimo = true;
            for(i = 2; i < n; i++){
                temp[0] = i;
                temp[1] = n;
                while(temp[1] >= 1){
                    resto = temp[1] - temp[0];
                    temp[1] -= temp[0];
                }
                if(resto == 0){
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
