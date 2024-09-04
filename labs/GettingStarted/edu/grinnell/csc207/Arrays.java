import java.io.PrintWriter;
public class Arrays{
    public static void main(String[] args){
        int[] arr= new int[5];
        PrintWriter pen = new PrintWriter(System.out, true);
        for (int i=0; i<5; i++){
            pen.println(arr[i]);
        }
    }
}