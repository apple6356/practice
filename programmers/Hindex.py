def solution(citations):
    answer = 0
    
    citations.sort(reverse = True)
    for i in citations:
        b = 0
        s = 0
        for j in citations:
            if j > i:
                b = b + 1
            elif j < i:
                s = s + 1
        if b >= i and s <= i:
            answer = b
            break
        if i > len(citations):
            answer = len(citations)

    return answer

a = [3, 0, 6, 1, 5]

print(solution(a))