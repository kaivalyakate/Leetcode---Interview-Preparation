def mergeSort(arr):
    if len(arr) > 1:

        # Finding the mid of the array
        mid = len(arr)//2

        # Dividing the array elements
        L = arr[:mid]

        # into 2 halves
        R = arr[mid:]

        # Sorting the first half
        mergeSort(L)

        # Sorting the second half
        mergeSort(R)

        i = j = k = 0

        # Copy data to temp arrays L[] and R[]
        while i < len(L) and j < len(R):
            if L[i] > R[j]:
                if len(L[i]) == 2 and len(R[i]) == 2:
                    arr[k] = L[i]
                    i += 1
                elif len(L[i]) == 1 and len(R[i]) == 2:
                    if int(L[i][0]) > int(R[i][0]):
                        arr[k] = L[i]
                        i += 1

            else:
                arr[k] = R[j]
                j += 1
            k += 1

        # Checking if any element was left
        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1


a = [3, 30, 34, 5, 9]
a = mergeSort([str(i) for i in a])
print(''.join(i for i in a))
