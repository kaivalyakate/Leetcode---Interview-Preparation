test_list = sorted([1,2,3,5,7,8,9])
temp = ( test_list[i : i + N] for i in range(len(test_list) - N + 1) ) 
res = any( sum(ele % 2 for ele in temps) % N == 0 for temps in temp )