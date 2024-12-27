class Solution {
public:
    string longestPalindrome(string s) {
        if (s.length() <= 1) return s; // If the string is empty or a single character, it's already a palindrome

    int start = 0, maxLength = 1; // Start index and the length of the longest palindrome

    // Helper function to expand around the center
    auto expandAroundCenter = [&](int left, int right) {
        while (left >= 0 && right < s.length() && s[left] == s[right]) {
            left--;
            right++;
        }
        // After expanding, return the length of the current palindrome
        return right - left - 1;
    };

    for (int i = 0; i < s.length(); i++) {
        // Check for odd length palindrome (expand around single character)
        int len1 = expandAroundCenter(i, i);
        // Check for even length palindrome (expand around the gap between two characters)
        int len2 = expandAroundCenter(i, i + 1);
        
        int len = max(len1, len2);
        if (len > maxLength) {
            maxLength = len;
            start = i - (maxLength - 1) / 2; // Update the start index of the palindrome
        }
    }
    
    return s.substr(start, maxLength); // Return the longest palindrome substring
    }
};
