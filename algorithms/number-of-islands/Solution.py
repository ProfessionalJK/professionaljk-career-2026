def number_of_islands(grid):
    if not grid:
        return 0

    rows, cols = len(grid), len(grid[0])
    visited = set()
    island_count = 0

    def dfs(r, c):
        if (r < 0 or r >= rows or
            c < 0 or c >= cols or
            grid[r][c] == '0'):
            return
        grid[r][c] = '0'
        dfs(r - 1, c)
        dfs(r + 1, c)
        dfs(r, c - 1)
        dfs(r, c + 1)

    for r in range(rows):
        for c in range(cols):
            if grid[r][c] == '1':
                island_count += 1
                dfs(r, c)

    return island_count

grid = [
    ["1","1","0","0","0"],
    ["1","1","0","0","0"],
    ["0","0","1","0","0"],
    ["0","0","0","1","1"]
]
print(number_of_islands(grid))