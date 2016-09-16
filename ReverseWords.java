/*Google Code Jam - Reverse Words*/
import java.util.*;
class ReverseWords{
	public static void main(String[] args){
		Scanner scr=new Scanner(System.in);
		int N=scr.nextInt();// N - number of cases

		for(int i=0; i<N; i++){
			String line=scr.nextLine();
			String[] words=line.split(" ");
			int len=words.length-1;
			for(int j=len; j>=0;j--){
				System.out.print(words[j]+" ");
			}	
			System.out.print("\n");
		}
	}
}