def StringChallenge(strArr):
  # code goes here              #5624 (1010111111000)         #0010111111001 
  result = 0
  s = strArr[1]
  binary = str(bin(int(strArr[0])).replace("0b", ""))
  for i, j in zip(binary, s):
      if i != j:
          result += 1


  return result

# keep this function call here 
print(StringChallenge(input().split()))