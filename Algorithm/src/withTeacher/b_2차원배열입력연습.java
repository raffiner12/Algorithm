package withTeacher;
import java.io.*;
import java.util.*;

public class b_2차원배열입력연습 {
	static Scanner sc = new Scanner(System.in); // 입력 세팅
	
	public static void main(String[] args) {
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[][] = new int[N][M];
		// M개씩 N개의 세트에 해당하는 data가 있을 것이다.
		// [ 입력의 몇 번째 줄인가? ][ 입력의 몇 번째 칸인가? ]

		
		for (int j = 0; j < N; j++) { // <- [j][] : 입력의 줄단위
			// [0][0 ~ M-1] -> [0 ~ N-1][]
			for (int i = 0; i < M; i++) { // <- [][i] : 입력의 칸 단위로 하나씩 받음
				arr[j][i] = sc.nextInt();
			}
		}
		
		
		
		for (int i = 0; i < M; i++) { // 출력의 줄 단위 -> 입력의 칸
			
			for (int j = 0; j < N; j++) // 출력의 칸 단위 -> 입력의 줄
			{
				System.out.printf(arr[j][i] + " ");
			}
			System.out.println();
		}
		/*		입력: 
					3 5 // N M 입력
					1 2 3 4 5
					5 4 2 1 6
					2 2 2 2 2 
		
					출력:
					1 5 2
					2 4 2
					3 2 2
					4 1 2
					5 6 2
					
					입력의 줄(세로크기) -> 출력의 칸
					입력의 칸(가로크기) -> 출력의 줄
		*/
		
		
		
	}
}

