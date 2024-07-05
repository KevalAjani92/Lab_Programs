import java.util.Scanner;
class StringVowel{
    String str;
    int count_a,count_e,count_i,count_o,count_u;
    StringVowel(String str){
        this.str=str;
    }
    void VowelCount(){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                this.count_a++;
            }else if(str.charAt(i)=='e'){
                this.count_e++;
            }else if(str.charAt(i)=='i'){
                this.count_i++;
            }else if(str.charAt(i)=='o'){
                this.count_o++;
            }else if(str.charAt(i)=='u'){
                this.count_u++;
            }
        }
        System.out.println("\nVowelCount For This Line:\na="+count_a+",e="+count_e+",i="+count_i+",o="+count_o+",u="+count_u);
    }
}
public class StringVowelDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Enter Line:");
            String str=sc.nextLine().toLowerCase();
            if(str.equals("quit")){
                break;
            }else{
                StringVowel s1=new StringVowel(str);
                s1.VowelCount();
            }
        }
        sc.close();
    }
}
