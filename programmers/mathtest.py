def solution(answers):
    answer = []

    # 1번, 2번, 3번의 찍기 리스트
    list1 = [1, 2, 3, 4, 5]
    list2 = [2, 1, 2, 3, 2, 4, 2, 5]
    list3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    # 1, 2, 3번의 정답 횟수
    a = [0, 0, 0]

    # 이 부분에 막혀서 인터넷을 약간 참고했음
    # 답과 수포자의 답을 비교해서 정답 횟수를 늘린다
    # 각 사람의 리스트의 크기로 answers의 인덱스의 나머지를 구해 비교
    for i in range(0, len(answers)):
        if list1[i%len(list1)] == answers[i]:
            a[0] += 1
        if list2[i%len(list2)] == answers[i]:
            a[1] += 1
        if list3[i%len(list3)] == answers[i]:
            a[2] += 1
    
    # 가장 많이 맞은 사람 찾기 max함수 사용
    for i in range(0, len(a)):
        if a[i] == max(a):
            answer.append(i+1)

    return answer

answers = [1,2,3,4,5]
print(solution(answers))

answers = [1,3,2,4,2]
print(solution(answers))