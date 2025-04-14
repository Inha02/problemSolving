package Array;
import java.util.HashMap;

public class Main4 {
    public int[] solution(int N, int[] stages) {

        int[] challenger = new int[N +2];
        for (int i = 0; i < stages.length; i++){
            challenger[stages[i]] += 1; // 각 스테이지에 있는 사람 수
        }
        // 실패율
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length; // 전체 이용자 수

        for (int i = 1; i <= N; i++){
            if (challenger[i] == 0){
                fails.put(i,0.);
            }
            else{
                fails.put(i, challenger[i]/total);
                total -= challenger[i];
            }
        }

        return fails.entrySet().stream().sorted((o1,o2) -> Double.compare(o2.getValue(),o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}