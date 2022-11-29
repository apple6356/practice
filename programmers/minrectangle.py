def solution(sizes):
    answer = 0

    w_max = 0 # 가장 긴 가로 길이
    h_max = 0 # 가장 긴 셀 길이
    sum = 0
    i = 0

    # 세로가 가로보다 길면 바꿈
    for size in sizes:
        if size[0] < size[1]:
            sizes[i][0], sizes[i][1] = sizes[i][1], sizes[i][0]
        i += 1

    # 가장 긴 길이를 찾는다. ( lambda식을 사용해 sort하면 더 쉽게 풀 수 있음)
    for size in sizes:
        if w_max < size[0]:
            w_max = size[0]
        if h_max < size[1]:
            h_max = size[1]

    sum = w_max * h_max
    answer = sum
    return answer

a = [[60, 50], [30, 70], [60, 30], [80, 40]]
print(solution(a))

b = [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]
print(solution(b))

c = [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]
print(solution(c))