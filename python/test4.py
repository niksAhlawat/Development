#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'findSum' function below.
#
# The function is expected to return a LONG_INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER_ARRAY numbers
#  2. 2D_INTEGER_ARRAY queries
#
import time

def findSum(numbers, queries):
    
    # Write your code here
    if not isinstance(numbers, list) and not isinstance(queries, list):
        return
    result = []
    total = 0
    for query in queries:
        if len(query) == 3:
            start = query[0]
            end = query[1]
            additional = query[2]
            
            selection = numbers[start-1:end]
            has_zeros = False
            
            test_zero_set = set(selection)
            if 0 in test_zero_set:
                has_zeros = True
            
            
            total = sum(selection)
            if has_zeros:
                total += additional
            result.append(total)
    return result


numbers = [5, 10, 10]
queries = [[1,2,5]]
start_time = time.time()
print (findSum(numbers, queries))    
print("--- %s seconds ---" % (time.time() - start_time))