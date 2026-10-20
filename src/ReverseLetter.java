public class ReverseLetter {
    public static void main(String[] args) {
        String str = "J@va the be$t!123";
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            char tempLeft = chars[left];
            char tempRight = chars[right];

            if (!Character.isLetter(tempLeft)) {
                left++;
            } else if (!Character.isLetter(tempRight)) {
                right--;
            } else {
                chars[left] = tempRight;
                chars[right] = tempLeft;
                left++;
                right--;
            }
        }

        System.out.println(new String(chars));

    }
}
