list1 = ['a','b','c','d','A']
list1 = [i.lower() for i in list1]
duplicate = []
sd = set()
sd2 = set()

for i in range(len(list1)):
    for j in range(i+1, len(list1)):
        if list1[i] == list1[j] and list1[i] not in duplicate:
            duplicate.append(list1[i])
#print(duplicate)

for i in list1:
    if i in sd:
        sd2.add(i)
    else:
        sd.add(i)    
print (sd2)        

#print ("\n".join([str(x) for x in range(10)]))

s = "hello i am nikhil"
li = s.split()
#print(len(li))

p = "malayalam"
if p == p[::-1]:
    print("YES")

for i in range(int(len(p)/2)):
    if p[i] != p[len(p)-i-1]:
        print("no")
    else :
        print("yes")


import pandas as pd
import numpy as np
data = pd.read_csv(r"C:\\Users\nikhi\Documents\Databases\fifa.csv")
#print (data.describe())

import matplotlib.pyplot as plt

xpoints = np.array([0, 6])
ypoints = np.array([0, 250])

plt.plot(xpoints, ypoints)
#plt.show()

import seaborn as sb
current_palette = sb.color_palette()
sb.palplot(current_palette)
#plt.show()




