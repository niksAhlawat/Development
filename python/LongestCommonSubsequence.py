def lcs (X, Y):
    m = len(X)
    n = len(Y)

    D = [[0 for _ in range(n+1)] for _ in range(m+1)]

    for i in range(m+1):
        for j in range(n+1):
            if i == 0 or j == 0:
                D[i][j] = 0
            elif X[i-1] == Y[j-1]:
                D[i][j] = D[i-1][j-1]+1
            else:
                D[i][j] = max(D[i-1][j] , D[i][j-1])            
    return D[m][n]


print (lcs(X = "NIKHILAHLAWAT", Y = "OPTIMUSPRIME"))