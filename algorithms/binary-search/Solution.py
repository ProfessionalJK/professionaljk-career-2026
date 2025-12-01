def binary_search(array, element):
    left = 0
    right = len(array) - 1
    while left <= right:
        mid = int(left + (right - left)/2)
        if array[mid] == element:
            return mid
        if array[mid] < element:
            left = mid + 1
        else:
            left = mid - 1
    return -1

print(binary_search([1, 2, 3, 4, 5], 4))
print(binary_search([1, 2, 3, 4, 5], 6))