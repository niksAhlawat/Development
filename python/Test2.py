# import module
import numpy as np
  
# explicit function to normalize array
def normalize(arr, t_min, t_max):
    norm_arr = []
    diff = t_max - t_min
    diff_arr = max(arr) - min(arr)    
    for i in arr:
        temp = (((i - min(arr))*diff)/diff_arr) + t_min
        norm_arr.append(temp)
    return norm_arr
  
# gives range staring from 1 and ending at 3  
array_1d = np.array([26,102,100])
range_to_normalize = (0,255)
normalized_array_1d = normalize(array_1d, 
                                range_to_normalize[0], 
                                range_to_normalize[1])


  
# display original and normalized array
print("Original Array = ",array_1d)
print("Normalized Array = ",normalized_array_1d)


l = [26, 102, 100]
l = [int(x*2.5) for x in l]
print(l)