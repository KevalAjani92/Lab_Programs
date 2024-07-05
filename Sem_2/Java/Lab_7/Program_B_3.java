interface Transport{
    void deliver();
}
abstract class Animal{
    public void print(){}
}
class Tiger extends Animal{
    public void print(){
        System.out.println("Print Method Of Tiger Class");
    }
}
class Camel extends Animal implements Transport{
    public void print(){
        System.out.println("Print Method Of Camel Class");
    }
    public void deliver(){
        System.out.println("Deliver Method Of Camel Class");
    }
}
class Deer extends Animal{
    public void print(){
        System.out.println("Print Method Of Deer Class");
    }
}
class Donkey extends Animal implements Transport{
    public void print(){
        System.out.println("Print Method Of Donkey Class");
    }
    public void deliver(){
        System.out.println("Deliver Method Of Donkey Class");
    }
}
public class Program_B_3 {
    public static void main(String[] args) {
        Animal A[]=new Animal[4];
        A[0]=new Tiger();
        A[1]=new Camel();
        A[2]=new Deer();
        A[3]=new Donkey();
        if(A[0] instanceof Transport){
            ((Transport)A[0]).deliver();
        }else{
            A[0].print();
        }
        if(A[1] instanceof Transport){
            ((Transport)A[1]).deliver();
        }else{
            A[1].print();
        }
        if(A[2] instanceof Transport){
            ((Transport)A[2]).deliver();
        }else{
            A[2].print();
        }
        if(A[3] instanceof Transport){
            ((Transport)A[3]).deliver();
        }else{
            A[3].print();
        }
    }
}
