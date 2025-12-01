def search_rotated_array(array, element):
    left = 0
    right = len(array) - 1
    while left <= right:
        mid = int(left + (right - left) / 2)
        if array[mid] == element:
            return mid
        if element <= array[mid]:
            if element >= array[left] and element < array[mid]:
                right = mid - 1
            else:
                left = mid + 1
        else:
            if element <= array[right] and element > array[mid]:
                left = mid + 1
            else:
                right = mid - 1
    return -1

print(search_rotated_array([4, 5, 6, 7, 0, 1, 2], 0))
print(search_rotated_array([4, 5, 6, 7, 0, 1, 2], 3))
