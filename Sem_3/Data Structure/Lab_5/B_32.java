import java.util.Arrays;
import java.util.Scanner;

public class B_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n");
        int n=sc.nextInt();

        String[] words=new String[n];
        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter Element words["+i+"] : ");
            words[i]=sc.next().toLowerCase();
        }

        int random=(int)(Math.random()*(n-1));
        System.out.println("Random Word Of Array : "+words[random]);

        System.out.print("Enter a Word To Check Anagram : ");
        String word1=sc.next().toLowerCase();

        char[] randomWord=words[random].toCharArray();
        char[] userWord=word1.toCharArray();

        Arrays.sort(randomWord);
        Arrays.sort(userWord);

        if(word1.length()!=words[random].length()){
            System.out.println("Not Anagram");
        }else{
            for (int i = 0; i < userWord.length; i++) {
                if(randomWord[i]!=userWord[i]){
                    System.out.println(word1+" is Not Anagram Of "+words[random]);
                    return;
                }
            }
            System.out.println(word1+" is Anagram Of "+words[random]);
        }
    }
}
