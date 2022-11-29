def solution(brown, yellow):
    answer = []

    sum = brown + yellow

    # yellow의 약수의 배열
    yellow_divisor = []

    # yellow의 약수 구하는 반복문
    for i in range(1, yellow+1):
        if yellow % i == 0:
            yellow_divisor.append(i)

    # yellow의 약수만큼 반복
    for i in range(0, len(yellow_divisor)):
        # 약수가 1밖에 없는 경우 brown + yellow의 제곱근을 값으로 넣어준다
        if len(yellow_divisor) == 1:
            answer.append(int(sum**(1/2)))
            answer.append(int(sum**(1/2)))
            break
        # ((yellow의 가로*2) + (yellow의 세로*2) + 4(꼭지점 부분 4개)) = brown이면 조건 충족
        elif (yellow_divisor[i] * 2) + (yellow_divisor[-(i+1)] * 2) + 4 == brown:
            # yellow의 가로 + 2(겉을 감싼 brown)을 삽입
            answer.append(yellow_divisor[-(i+1)]+2)
            # yellow의 세로 + 2(겉을 감싼 brown)을 삽입
            answer.append(yellow_divisor[i]+2)
            break
            
    return answer

print(solution(10, 2))
print(solution(8, 1))
print(solution(24, 24))