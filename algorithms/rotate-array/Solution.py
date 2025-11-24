def rotate_array(input_array, k):
    if not input_array:
        return []

    k %= len(input_array)

    input_array[:] = input_array[::-1]
    input_array[:k] = input_array[:k][::-1]
    input_array[k:] = input_array[k:][::-1]
    return input_array

print(rotate_array([1, 2, 3, 4, 5, 6, 7], 3))
print(rotate_array([1, 2], 3))
print(rotate_array([1, 2, 3], 0))
print(rotate_array([1], 10))
print(rotate_array([1, 2, 3, 4], 1))