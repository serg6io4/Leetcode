def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        i = len(digits)-1
        while i>=0:
            if(digits[i] < 9):
                  digits[i] +=1
                  return digits
            else:
                  digits[i] = 0
            i-=1
        return [1]+digits


print(plusOne( '',digits=[4,3,2,9]))