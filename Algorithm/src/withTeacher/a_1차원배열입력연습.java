package withTeacher;
import java.io.*;
import java.util.*;

public class a_1차원배열입력연습 {
	static Scanner sc = new Scanner(System.in); // 입력 세팅
	
	public static void main(String[] args) {
		
		int N = sc.nextInt();
		// N개의 data가 입력, 모두 저장
		int arr[] = new int[N]; // N개의 data를 저장할 배열
		// [0 ~ N-1]
		for(int i = 0; i < N; i++)
		{
			arr[i] = sc.nextInt(); // arr[0 ~ N-1]
		}
		
		// 역순으로 출력(N-1 ~ 0)
		for(int i = N-1; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
}
