import java.util.LinkedList;
import java.util.Queue;

public class C_54 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        String[] input = { "buy_red", "buy_blue", "buy_green", "fetch", "fetch", "buy_yellow", "fetch",
                "fetch", "fetch", "fetch"
        };

        for (String str : input) {
            if(str.contains("buy_")){
                String color=str.substring(4, str.length());
                queue.add(color);
            }else if(str.contains("fetch")){
                String color=queue.remove();
                System.out.println(color);
                queue.add(color);
            }
        }
        System.out.println("Queue : "+queue);
    }
}