import math
def sumofFactors(n): 
      
    # Traversing through all 
    # prime factors 
    res = 1
    for i in range(2, int(math.sqrt(n) + 1)): 
          
        curr_sum = 1
        curr_term = 1
          
        while n % i == 0: 
              
            n = n / i; 
  
            curr_term = curr_term * i; 
            curr_sum += curr_term; 
              
        res = res * curr_sum 
      
    # This condition is to handle the  
    # case when n is a prime number  
    # greater than 2 
    if n > 2: 
        res = res * (1 + n) 
  
    return res; 

cnt = 0
for i in range(5000, 9001):
    if i==(int(sumofFactors(i))-i):
        cnt+=1
print(cnt)