nums_array = [3, 3]
target_digit = 6

def find_indices(nums, target):
    for i in range(0, len(nums)-1):
        for j in range(i+1, len(nums)):
            sums = nums[i] + nums[j]
            if sums == target:
                return [i, j]
    return None


print(find_indices(nums_array, target_digit))