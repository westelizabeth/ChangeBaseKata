public class ChangeBase {
    public static String convertNumber(int number, int base) {
        if (number < 0 || base < 2) {
            throw new IllegalArgumentException("Invalid input!");
        }


        if (number < 2) {
            return Integer.toString(number);

        }
        if (number % 2 == 0) {
            return convertNumber(number / 2, 2) + '0';
        }
//        if(number % 2 == 1){
        return convertNumber((number - 1) / 2, 2) + '1';


    }
}