def lengthOfLongestSubstring(self,s):
    """
    :type s: str
    :rtype: int
    """
    maximo = 0  # Longitud máxima de subcadena sin repetir
    inicio = 0  # Índice de inicio de la ventana actual
    posiciones = {}  # Diccionario para almacenar las posiciones de los caracteres

    for i in range(len(s)):
        if s[i] in posiciones and posiciones[s[i]] >= inicio:
            inicio = posiciones[s[i]] + 1
        posiciones[s[i]] = i
        maximo = max(maximo, i - inicio + 1)

    return maximo

print(lengthOfLongestSubstring(1,"Holamundo"))