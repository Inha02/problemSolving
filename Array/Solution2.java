package Array;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length; //arr1 행
        int c1 = arr1[0].length; //arr1 열 
        int c2 = arr2[0].length; //arr2 열 
        
        for (int i = 0; i < r1; i++){
            
        }
        int[][] answer = new int[r1][c2];

    
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
        for (int k = 0; k < c1; k++) {
          answer[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }

    return answer;
  }
}
