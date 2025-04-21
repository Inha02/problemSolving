package Array;
import java.awt.Point;
import java.util.HashMap;
import java.util.HashSet;

public class Main5 {
    public int solution(String dirs) {

        String[] dir = dirs.split(""); //디렉션 배열로
        int total = dirs.length(); // 총 디렉션 개수
        // 이동한 길 확인하는 배열

        HashMap<Integer,Point> position = new HashMap<>();
        position.put(0, new Point(0,0));

        HashSet<String> answer = new HashSet<>();

        for (int i =1; i <= total; i++){
            int X = position.get(i-1).x;
            int Y = position.get(i-1).y;

            int nx = X;
            int ny = Y;

            if (dir[i-1].equals("U") && (Y < 5) ){
                ny = Y + 1;

            } else if (dir[i - 1].equals("D") && Y > -5) {
                ny = Y - 1;

            } else if (dir[i - 1].equals("L") && X > -5) {
                nx = X - 1;

            } else if (dir[i - 1].equals("R") && X < 5) {
                nx = X + 1;

            } else {
                position.put(i, new Point(X, Y)); // 이동 불가 → 제자리
            }

            if (nx != X || ny != Y) {
                answer.add(X + " " + Y + " " + nx + " " + ny);
                answer.add(nx + " " + ny + " " + X + " " + Y);
            }

            position.put(i, new Point(nx, ny)); // 다음 위치 저장
        }


        return answer.size() / 2;
    }
}
