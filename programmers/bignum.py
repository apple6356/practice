def solution(number, k):
    answer = ''
    number = list(number)
    stack = []

    # number의 길이만큼 반복
    for n in range(len(number)):
        # stack이 비어있거나 stack의 마지막 수가 number[n]보다 크거나 같으면 stack에 추가
        if len(stack) == 0 or stack[-1] >= number[n]:
            stack.append(number[n])
        else:
            # k > 0 크고 stack에 하나라도 있다면 stack을 pop시키고 k를 1뺀다
            while k > 0 and len(stack) > 0:
                # stack의 마직막이 number[n]보다 크거나 같으면 break
                if stack[-1] >= number[n]:
                    break
                stack.pop()
                k -= 1
            stack.append(number[n])

    # k가 남아있다면 스택의 끝에서부터 빼준다
    if k>0:
        stack = stack[:-k]

    answer = ''.join(stack)
    
    return answer

print(solution("1924", 2))
print(solution("1231234", 3))
print(solution("4177252841", 4))