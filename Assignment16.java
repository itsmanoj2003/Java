package Training;


//  1st Program

//public class Assignment16 {
//
//    public static int findNumberOfLIS(int[] nums) {
//        int n = nums.length;
//        if (n == 0) return 0;
//
//        int[] length = new int[n]; // Length of LIS ending at i
//        int[] count = new int[n];  // Number of LIS ending at i
//        int maxLen = 0;
//
//        for (int i = 0; i < n; i++) {
//            length[i] = 1;
//            count[i] = 1;
//
//            for (int j = 0; j < i; j++) {
//                if (nums[i] > nums[j]) {
//                    if (length[j] + 1 > length[i]) {
//                        length[i] = length[j] + 1;
//                        count[i] = count[j]; // Reset count
//                    } else if (length[j] + 1 == length[i]) {
//                        count[i] += count[j]; // Add more combinations
//                    }
//                }
//            }
//
//            maxLen = Math.max(maxLen, length[i]);
//        }
//
//        int result = 0;
//        for (int i = 0; i < n; i++) {
//            if (length[i] == maxLen) {
//                result += count[i];
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] nums1 = {1, 3, 5, 4, 7};
//        int[] nums2 = {2, 2, 2, 2, 2};
//
//        System.out.println(findNumberOfLIS(nums1)); // Output: 2
//        System.out.println(findNumberOfLIS(nums2)); // Output: 5
//    }
//}





//  2nd Program

public class Assignment16 {

    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (pc == '?' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));     // false
        System.out.println(isMatch("aa", "*"));     // true
        System.out.println(isMatch("cb", "?a"));    // false
    }
}
