public class CommandLine1 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < args.length; i++) {
            sum+=Integer.parseInt(args[i]); //return as integer type
        }
        double avg=(double)sum/args.length;
        System.out.println(avg);

        System.out.println(args[0]+args[1]); //return as String Type
    }
}
