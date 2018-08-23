
public class ChangeTheBase {
    private static Character[] array = new Character[]{
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l' ,'m', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'};

    public static String convertNumber(int number, int base) {
        if (number < 0 || base < 2) {
            throw new IllegalArgumentException("Input cannot be negative! Base must be greater than 1!");
        }
        if (number < base) {
//            return Integer.toString(number);
            return Character.toString(array[number]);
        }
//        return convertNumber(number / base, base) + Integer.toString(number%base);
        return convertNumber(number / base, base) + array[number%base];
//        if (number % base == 0) {
//            return convertNumber(number / base, base) + "0";
//        }
//        if(number % base == 1) {
//            return convertNumber((number - 1) / base, base) + "1";
//        }
//        return convertNumber((number - 1) / base, base) + "2";
    }
}