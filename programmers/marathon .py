def solution(participant, completion):
    answer = ''

    # 리스트 정렬
    participant.sort()
    completion.sort()

    # 리스트 비교 후 answer 변경
    for i in range(0, len(completion)):
        if participant[i] != completion[i]:
            answer = participant[i]
            break
        if i == len(completion)-1:
            answer = participant[-1]
            break

    return answer

p1 = ["leo", "kiki", "eden"]
c1 = ["eden", "kiki"]

p2 = ["marina", "josipa", "nikola", "vinko", "filipa"]
c2 = ["josipa", "filipa", "marina", "nikola"]

p3 = ["mislav", "stanko", "mislav", "ana"]
c3 = ["stanko", "ana", "mislav"]

print(solution(p1, c1))
print(solution(p2, c2))
print(solution(p3, c3))


'''
해시를 이용한 다른 풀이

def solution(participant, completion):
    answer = ''
    temp = 0
    dic = {}

    해시를 사용해 key값에 해시한 값이 들어가고, value값에 참가자의 이름이 들어간다.
    temp에 key값인 hash값이 들어간다.
    for part in participant:
        dic[hash(part)] = part
        temp += int(hash(part))

    temp에서 completion을 해시한 값을 빼서 남은 값을 key로 가진 값이 답이다.
    for com in completion:
        temp -= hash(com)

    answer = dic[temp]

    return answer

'''