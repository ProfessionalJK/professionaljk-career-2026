def move_zeroes(input_array):
    if not input_array:
        return []
    lastNonZero = 0

    for i in range(0, len(input_array)):
        if input_array[i] != 0:
            temp = input_array[lastNonZero]
            input_array[lastNonZero] = input_array[i]
            input_array[i] = temp
            lastNonZero += 1

    return input_array

print(move_zeroes([0, 1, 0, 3, 12]))
print(move_zeroes([0]))
print(move_zeroes([1, 2, 3]))
print(move_zeroes([0, 0, 0]))
print(move_zeroes([4, 0, 5]))
print(move_zeroes([]))