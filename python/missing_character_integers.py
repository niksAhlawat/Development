from string import digits, ascii_lowercase

def missingCharacters(Str):
    
    MAX_CHAR = 26
    
    x = [False for i in range(MAX_CHAR)]
    y = []
    

    for i in range(len(Str)):
        if (Str[i] >= 'a' and Str[i] <= 'z'):
            x[ord(Str[i]) - ord('a')] = True
        if (Str[i].isdigit()):
            y.append(int(Str[i]))
        
    
    result = "".join(str(x) for x in range(10) if x not in y)

    for i in range(MAX_CHAR):
        if (x[i] == False):
          result += chr(i + ord('a'))
    
    #return "".join(c for c in digits + ascii_lowercase if c not in s)    
    return result



s = "3629aghrjlsbwofhe"
print (missingCharacters(s))




