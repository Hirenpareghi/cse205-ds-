#include <iostream>
#include <vector>

class Solution {
public:
    std::vector<int> memo; // Memoization table

    Solution() {
        memo.resize(100, -1); // Initialize memoization table
    }

    int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        if (memo[n] != -1) {
            return memo[n]; // Return memoized result if available
        }

        memo[n] = fibonacci(n - 1) + fibonacci(n - 2); // Memoize the result
        return memo[n];
    }
};

int main() {
    Solution solution;

    int n;
    std::cout << "Enter the value of n: ";
    std::cin >> n;

    std::cout << "F(" << n << ") = " << solution.fibonacci(n) << std::endl;

    return 0;
}
