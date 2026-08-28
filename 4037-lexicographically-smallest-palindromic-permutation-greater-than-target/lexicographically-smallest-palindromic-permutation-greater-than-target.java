class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // A palindrome can have at most one odd-frequency character.
        int oddCount = 0;
        char middle = '\0';

        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                oddCount++;
                middle = (char) ('a' + i);
            }
        }

        if (oddCount > 1) {
            return "";
        }

        int halfLength = n / 2;
        int[] halfCount = new int[26];

        for (int i = 0; i < 26; i++) {
            halfCount[i] = count[i] / 2;
        }

        // Find the smallest valid left half >= target's left half.
        char[] half = smallestHalfAtLeast(target, halfCount, halfLength);

        if (half == null) {
            return "";
        }

        String candidate = buildPalindrome(half, middle, n % 2 == 1);

        // If it is already strictly greater, it is the answer.
        if (candidate.compareTo(target) > 0) {
            return candidate;
        }

        // Candidate equals or is not greater than target.
        // Move left half to its next lexicographic permutation.
        if (!nextPermutation(half)) {
            return "";
        }

        return buildPalindrome(half, middle, n % 2 == 1);
    }

    // Smallest permutation of the available half characters
    // that is >= target[0...halfLength-1].
    private char[] smallestHalfAtLeast(String target, int[] available, int halfLength) {
        char[] half = new char[halfLength];

        for (int i = 0; i < halfLength; i++) {
            int wanted = target.charAt(i) - 'a';

            if (available[wanted] > 0) {
                half[i] = target.charAt(i);
                available[wanted]--;
            } else {
                // Cannot match target at index i.
                // Backtrack and make one earlier position larger.
                for (int pos = i; pos >= 0; pos--) {
                    int targetChar = target.charAt(pos) - 'a';

                    for (int c = targetChar + 1; c < 26; c++) {
                        if (available[c] > 0) {
                            half[pos] = (char) ('a' + c);
                            available[c]--;

                            // Fill remaining positions with smallest letters.
                            int write = pos + 1;
                            for (int letter = 0; letter < 26; letter++) {
                                while (available[letter] > 0) {
                                    half[write++] = (char) ('a' + letter);
                                    available[letter]--;
                                }
                            }
                            return half;
                        }
                    }

                    // Restore the character used at the prior matching position.
                    if (pos > 0) {
                        available[half[pos - 1] - 'a']++;
                    }
                }

                return null;
            }
        }

        return half; // Exactly matches target's left half.
    }

    private String buildPalindrome(char[] half, char middle, boolean hasMiddle) {
        StringBuilder result = new StringBuilder();

        for (char c : half) {
            result.append(c);
        }

        if (hasMiddle) {
            result.append(middle);
        }

        for (int i = half.length - 1; i >= 0; i--) {
            result.append(half[i]);
        }

        return result.toString();
    }

    private boolean nextPermutation(char[] a) {
        int i = a.length - 2;

        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }

        if (i < 0) {
            return false;
        }

        int j = a.length - 1;
        while (a[j] <= a[i]) {
            j--;
        }

        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        reverse(a, i + 1, a.length - 1);
        return true;
    }

    private void reverse(char[] a, int left, int right) {
        while (left < right) {
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}