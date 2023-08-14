#include <iostream>

class Solution {
public:
    void reverseString(char* s, int size) {
        int left = 0;
        int right = size - 1;

        while (left < right) {
            std::swap(s[left], s[right]);
            left++;
            right--;
        }
    }
};

int main() {
    char s[] = "hello";
    int size = sizeof(s) - 1; // Exclude the null terminator

    Solution solution;
    std::cout << "Original string: " << s << std::endl;
    solution.reverseString(s, size);
    std::cout << "Reversed string: " << s << std::endl;

    return 0;
}
