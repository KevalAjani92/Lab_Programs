import java.util.Scanner;
public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Line:");
        String s1=sc.nextLine().toLowerCase();
        int vowel=0,consonent=0;
        char x;
        
        for(int i=0;i<s1.length();i++){
            x=s1.charAt(i);
            if((x>='a'&&x<='z')||(x>='A'&&x<='Z')){
                if(x=='a' || x=='e'||x=='i'||x=='o'||x=='u'||x=='A' || x=='E'||x=='I'||x=='O'||x=='U'){
                    vowel++;
                }else consonent++;
            }else{
                continue;
            }
        }
        System.out.println("Vowel="+vowel+"\nConsonant="+consonent);
        sc.close();
    }
}
