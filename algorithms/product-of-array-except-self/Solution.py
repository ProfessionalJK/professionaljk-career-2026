def product_of_array_except_self(input_array):
    output_array = []
    if len(input_array) >= 1:
        for i in range(0, len(input_array)):
            product = 1
            for j in range(0, len(input_array)):
                if j != i:
                    product *= input_array[j]
            output_array.append(product)
    return output_array

def product_of_array_except_self_optimized(input_array):
    if not input_array:
        return []
    output_array = [1] * len(input_array)

    for i in range(1, len(input_array)):
        output_array[i] *= output_array[i-1] * input_array[i-1]

    right_product = 1
    for i in range(len(input_array) - 1, -1, -1):
        output_array[i] *= right_product
        right_product *= input_array[i]

    return output_array

print(product_of_array_except_self_optimized([1, 2, 3, 4]))
print(product_of_array_except_self_optimized([-1, 1, 0, -3, 3]))
print(product_of_array_except_self_optimized([0, 0]))
print(product_of_array_except_self_optimized([5]))
print(product_of_array_except_self_optimized([2, 3]))
print(product_of_array_except_self_optimized([]))
