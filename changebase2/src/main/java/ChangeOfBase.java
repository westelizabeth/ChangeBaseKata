import java.util.Stack;

public class ChangeOfBase {
    Character[] array = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B',
            'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static String convert(int num, int base) {
        if (base == 2) {
//            if (num == 1) {
////                return "1";
////            }
////            if(num == 2) {
////                return "10";
////            }
////            if(num == 3) {
////                return "11";
////            }
////            return "100";
            //return Integer.toString(num % base);

          /*solution w/o dictionary*/
           Stack<Integer> remainders = new Stack();
            while(num > 0) {
                int temp = num % base;
                remainders.push(temp);
                num /= base;
            }
            String converted = "";
            while(!remainders.empty()){
                converted += Integer.toString(remainders.pop());
            }
            return converted;
        }
        if (base == 10) {
            return Integer.toString(num);
        }
        throw new IllegalArgumentException("Invalid Input");
    }

}