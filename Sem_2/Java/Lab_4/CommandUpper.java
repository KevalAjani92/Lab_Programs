public class CommandUpper {
    public static void main(String[] args) {
       for(int i=0;i<args.length;i++){
        if(args[i].charAt(0)<'A'||args[i].charAt(0)>'Z'){
            System.out.println("String"+(i+1)+"'s First Character Is Not In Uppercase");
        }
       }     
    }
}
