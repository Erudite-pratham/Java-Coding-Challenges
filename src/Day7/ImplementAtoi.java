package Day7;

public class ImplementAtoi {
    public static void main(String[] args) {
        String s = "-223";
        System.out.println(atoi(s));
    }

    static int atoi(String s) {
        int ans = 0;
        int flag = s.charAt(0) != '-' ? 0 : 1;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                ans = ans * 10 + ((int) s.charAt(i) - 48);
            } else if (i != 0 && (s.charAt(i) == '-' || s.charAt(i) != '-')) {
                flag = 2;
                break;
            }
        }

        if (flag == 2) {
            return -1;
        }

        if (flag == 1) {
            ans = ans * -1;
        }

        return ans;
    }
}
