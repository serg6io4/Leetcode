def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dict = {}
        for i in range(0, len(nums)):
            complemento = target - nums[i]
            if(complemento in dict):
                return [dict[complemento], i]
            dict[nums[i]] = i
        return []

print(twoSum(1,[2, 7, 11, 15], 9))
print(twoSum(1,[3, 2, 4], 6))