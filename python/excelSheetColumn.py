def titleToNumber(self, columnNumber):
        result = 0
        for x in columnNumber:
            result = result * 26 + (ord(x) - ord('A') + 1)
        
        return result

print(titleToNumber('',"ZY"))

def convertToTitle(self, columnNumber):
        """
        :type columnNumber: int
        :rtype: str
        """
        result = []
        while columnNumber > 0:
            columnNumber -= 1
            result.append(chr(65 + columnNumber % 26))
            columnNumber //= 26

        return ''.join(reversed(result))

#print(convertToTitle('',701))