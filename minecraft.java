//package UsacoBronze2.decembercontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class minecraft {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer t1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(t1.nextToken());
        int Q = Integer.parseInt(t1.nextToken());
        //boolean[][][] open = new boolean[N][N][N];

        int[][] linex = new int[N][N];//1y2z
        int[][] liney = new int[N][N];//1x2z
        int[][] linez = new int[N][N];//1x2y

        long spots = 0;
        for (int i = 0; i<Q;i++){
            StringTokenizer t2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(t2.nextToken());
            int y= Integer.parseInt(t2.nextToken());
            int z = Integer.parseInt(t2.nextToken());
            linex[y][z]++;
            liney[x][z]++;
            linez[x][y]++;
            if (linex[y][z]==N){
                spots++;
            }
            if (liney[x][z]==N){
                spots++;
            }
            if(linez[x][y]==N){
                spots++;
            }
            System.out.println(spots);
            //pen[x][y][z] = true;
//            if (x==N-1){
//                //gotta check right
//                boolean opened = true;
//                for (int j = N-1;j>=0;j--){
//                    if (!open[j][y][z])opened=false;
//                }
//                if (opened)spots++;
//            }
            //System.out.println(spots);
        }
    }
}