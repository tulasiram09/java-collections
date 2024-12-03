
public class SequenceLetters {
    public static void main(String[] args) {
        
        int n;
        n = Integer.parseInt(args[0]);
        char ch1;
        ch1 = args[1].charAt(0);
        int yourInt;
        if (ch1=='U'){
            yourInt = 65;
        }else{
            yourInt = 97;
        }
        for (int i = 0; i < n; i++) {
            int temp = yourInt +i;
            char ch = (char) temp;
            System.out.print(ch+"\t");
        }
    }
}
