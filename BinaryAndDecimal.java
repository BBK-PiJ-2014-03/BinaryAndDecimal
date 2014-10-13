public class BinaryAndDecimal {
    public static void main (String[] args) {
        
        System.out.println(binaryToDecimal("01010101"));
        System.out.println(decimalToBinary(101));
    }
    
    public static int binaryToDecimal(String str) {
        return Integer.parseInt(str, 2);
    }
    
    public static String decimalToBinary(int n) {
        return Integer.toBinaryString(n);
    }
}