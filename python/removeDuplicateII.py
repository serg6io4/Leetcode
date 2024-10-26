class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        i = 0
        count = 0
        
        for j in range(len(nums)):
            if j == 0 or nums[j] != nums[j - 1]:
                count = 1
                nums[i] = nums[j] 
                i += 1  
            elif count < 2:
                count += 1 
                nums[i] = nums[j]
                i += 1  
        
        return i

solucion = Solution()
nums = [1,1,1,2,2,3]
print(solucion.removeDuplicates(nums))