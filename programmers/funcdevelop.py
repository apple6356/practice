def solution(progresses, speeds):
    answer = []
    t = 1   # 몇 회전 했는지
    n = 0   # 이번 회전에 기능 개발이 완료되는 개수

    # progresses의 길이가 0보다 큰 동안 실행
    while len(progresses) > 0:
        # progresses[0] + (t * speeds[0])의 합이 100 이상이면 n에 +1 큐의 제일 앞부분 삭제
        if progresses[0] + (t * speeds[0]) >= 100:
            n += 1
            progresses.pop(0)
            speeds.pop(0)
        else:
            if n > 0:
                answer.append(n)
                n = 0
            t += 1
    # 마지막 n을 answer에 추가
    if n > 0:
        answer.append(n)

    return answer

p = [93, 30, 55]
s = [1, 30, 5]
print(solution(p, s))

p = [95, 90, 99, 99, 80, 99]
s = [1, 1, 1, 1, 1, 1]
print(solution(p, s))