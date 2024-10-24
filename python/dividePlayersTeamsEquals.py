class Solution(object):
    def dividePlayers(self, skill):
        """
        :type skill: List[int]
        :rtype: int
        """

        n = len(skill)
        if n % 2 != 0: return -1

        suma = sum(skill)
        equipos = n // 2

        if(suma % equipos != 0): return -1

        suma_objetivo = suma // equipos

        #Ordenamos para usar doble puntero
        skill.sort()

        quimica = 0
        #Los punteros al inicio y al final
        i = 0
        j = n-1
        while i < j:
            if (skill[i] + skill[j] == suma_objetivo):
                quimica += skill[i] * skill[j]
                i +=1
                j -=1
            else:
                return -1
            
        return quimica

solucion = Solution()

print(solucion.dividePlayers([3,2,5,1,3,4]))