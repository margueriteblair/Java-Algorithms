public class PlusOne {
    public int[] plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {
            str += String.valueOf(digits[i]);
        }
        BigInteger num = new BigInteger(str);
        num = num.add(BigInteger.ONE);
        String str2 = String.valueOf(num);
        String[] strDig = str2.split("");
        int[] digits2 = new int[strDig.length];
        for (int i = 0; i < strDig.length; i++) {
            digits2[i] = Integer.parseInt(strDig[i]);
        }
        return digits2;
    }
}