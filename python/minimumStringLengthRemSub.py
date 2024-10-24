class Solution(object):
    def minLength(self, s):
        """
        :type s: str
        :rtype: int
        """
        stack = []

        for i in range(len(s)):
            if(s[i] == 'D' and stack and stack[-1] == 'C'):
                stack.pop()
            elif(s[i] == 'B' and stack and stack[-1] == 'A'):
                stack.pop()
            else:
                stack.append(s[i])

        return len(stack)

solucion = Solution()

print(solucion.minLength("ABFCACDB"))