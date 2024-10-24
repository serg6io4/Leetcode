class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dic = {}
        for i in range(len(strs)):
            ordenado = ''.join(sorted(strs[i]))
            if (ordenado in dic):
                dic.get(ordenado).append(strs[i])
            else:
                dic[ordenado] = [strs[i]]
                
        return list(dic.values())
    
solucion = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
print(solucion.groupAnagrams(strs=strs))