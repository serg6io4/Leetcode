def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if (len(nums) == 0): return 0
        nums = sorted(set(nums))
        longConsec = 1
        temporal = 1
        for i in range(len(nums)-1):
            if(nums[i]+1 == nums[i+1]):
                temporal += 1
            else:
                 longConsec = max(longConsec, temporal)
                 temporal = 1
        longConsec = max(longConsec, temporal)
        return longConsec

print(longestConsecutive('', nums=[0,3,7,2,5,8,4,6,0,1]))