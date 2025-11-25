def is_valid_parentheses(input_stream):
    stack = []
    mapping = {')' : '(', ']' : '[', '}' : '{'}

    for c in input_stream:
        if c in mapping.values():
            stack.append(c)
        elif c in mapping.keys():
            if not stack or stack.pop() != mapping[c]:
                return False
        else:
            return False

    return len(stack) == 0

print(is_valid_parentheses("()[]{}"))
print(is_valid_parentheses("(]"))
print(is_valid_parentheses("([)"))
print(is_valid_parentheses("{[]}"))