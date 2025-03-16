//package UsacoBronze2.decembercontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class mooingtime {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer t1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(t1.nextToken());
        int F = Integer.parseInt(t1.nextToken());

        String cows = br.readLine();
        ArrayList<String> ans = new ArrayList<>();
        Map<String, Integer> original = moocount(cows);

        for (String i : original.keySet()) {
            int f = original.get(i);
            if (f>=F){
                ans.add(i);
            }

        }
        //int a = 1;

        for (int i = 0; i < N; i++) {

            Map<String, Integer> moocount = new HashMap<>(original);

//            for (int j = 97; j < 123; j++) {
//                if (j == cows.charAt(i)) continue;
//                Map<String, Integer> moocount = new HashMap<>(original);
//                String change = cows.substring(0, i) + (char)j + cows.substring(i+1);
//                Map<String, Integer> changecount = moocount(change);
//                for (String k : changecount.keySet()) {
//                    Integer f = changecount.get(k);
//                    if (f>=F){
//                        if(!ans.contains(k)){
//                            ans.add(k);
//                        }
//
//                    }
//
//                }
//            }
        }

        Collections.sort(ans);
        System.out.println(ans.size());
        for (String i: ans){
            System.out.println(i);
        }
    }
    static Map<String, Integer> moocount(String s) {
        Map<String, Integer> r = new HashMap<>();
        for (int i = 0; i + 2 < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            char c3 = s.charAt(i+2);
            if (c1 != c2 && c2 == c3) {
                String moo = s.substring(i, i+3);
                r.put(moo, r.getOrDefault(moo, 0) + 1);
            }
        }
        return r;
    }
}