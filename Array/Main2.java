package Array;
// 정수 배열을 하나 받습니다. 
// 배열의 중복값을 제거하고 배열 데이터를 내림차순으로 정렬해서 반환하는 solution( ) 함수를 구현하세요.
import java.util.*;

public class Main2 {
    private static int[] solution(int[] arr){
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        for (int i = 0; i < result.length; i++ ){
            result[i] = set.pollFirst();
        }
        return result;
    }
    
}
