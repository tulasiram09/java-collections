import java.util.*;

public class FrequencyinName {
    public static void main(String[] args) {
        Map <Character,Integer> freqMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        for(int i=0;i<Name.length();i++){
            Character ch = Name.charAt(i);
            if(freqMap.containsKey(ch)){
                int temp = freqMap.get(ch);
                freqMap.put(ch,temp+1);
            }else{
                freqMap.put(ch,1);
            }
        }
        sc.close();
        System.out.println(freqMap);
    }
}
