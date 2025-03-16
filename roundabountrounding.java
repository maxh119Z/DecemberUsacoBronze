//package UsacoBronze2.decembercontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class roundabountrounding {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] ans = new long[T];
        for (int i = 0; i<T;i++){
            long N = Long.parseLong(br.readLine());
            int maxpowerof10 = 0;

            int value = 1;
            while (value < N) {
                value*=10;
                maxpowerof10++;
            }

            long count = 0;
            for (int j = 2; j<=maxpowerof10;j++){
                String lower = "";
                String upper = "4";
                for (int k = 1; k<j;k++){
                    lower += "4";
                    upper+= "9";
                }

                lower+="5";
                int lb = Integer.parseInt(lower);
                int ub = Integer.parseInt(upper);

                if (N>=lb){
                    if (N<=ub){
                        count+= N-lb+1;
                        ans[i] = count;
                        continue;
                    }
                    else{
                        count+= ub-lb+1;
                    }
                }
                else{
                    ans[i] = count;
                    continue;
                }
                ans[i] = count;
            }

        }
        for (long i: ans){
            System.out.println(i);
        }
    }

}
