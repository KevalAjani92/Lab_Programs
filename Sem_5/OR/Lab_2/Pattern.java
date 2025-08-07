public class Pattern {
    public static void main(String[] args) {

        // Vertical Half-Diamond

        // int n = 4;
        // int nsp = n-1,nst = 1;
        // for(int i = 1;i<=n*2-1;i++){
        //     for(int j=1;j<=nsp;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=nst;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     if(i<n){
        //         nsp--;
        //         nst++;
        //     }else{
        //         nsp++;
        //         nst--;
        //     }
        //     System.out.println();
        // }

        // Swastik Pattern
        int n = 5;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i<=n){
                    if((i==1 && j>n) || (j==1 || j==n) || i==n){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if((i==2*n-1 && j<n) || (j==n || j==2*n-1)){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
