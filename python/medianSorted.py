def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums = [0]*(len(nums1) + len(nums2))
        i = 0
        j = 0
        k = 0
        while (i<len(nums1)) and (j < len(nums2)):
            if(nums1[i] <= nums2[j]):
                nums[k] = nums1[i]
                i+=1
            else:
                nums[k] = nums2[j]
                j+=1
            k+=1
        while (i<len(nums1)):
            nums[k] = nums1[i]
            k+=1
            i+=1
        while (j < len(nums2)):
            nums[k] = nums2[j]
            k+=1
            j+=1
        n = len(nums)
        if n % 2 != 0:
            return nums[n//2]
        else:
            return (nums[n//2] + nums[n//2 -1]) / 2.0

n1 = [1,2]
n2 = [3,4]       
print(findMedianSortedArrays(1,n1,n2))