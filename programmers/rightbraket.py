def solution(s):
    answer = True

    stack = []

    for i in s:
        # ( 괄호가 나오면 stack에 추가
        if i == "(":
            stack.append(i)
        # ) 괄호가 나오고 stack에 아무것도 없다면 False
        elif i == ")" and len(stack) == 0:
            answer = False
            break
        # ) 괄호가 나오고 stack에 존재한다면 pop
        elif i == ")" and len(stack) != 0:
            stack.pop()

    # stack이 완전히 비워지지 않았다면 False
    if len(stack) != 0:
        answer = False

    return answer

print(solution("()()"))
print(solution("(())()"))
print(solution(")()("))
print(solution("(()("))