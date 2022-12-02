def solution(nums):
    answer = 0
    r = int(len(nums)/2)
    dict1 = {n : '' for n in nums}

    if r > len(dict1):
        answer = len(dict1)
    elif r<=len(dict1):
        answer = r

    return answer

nums = [3,1,2,3]
print(solution(nums))

nums = [3,3,3,2,2,4]
print(solution(nums))

nums = [3,3,3,2,2,2]
print(solution(nums))

'''
다른 사람의 풀이

min 함수를 사용해 두 수 중 더 작은 수 리턴
len(list)/2 와 set함수를 사용해 중복을 제거한 리스트의 크기 비교

def solution(ls):
    return min(len(ls)/2, len(set(ls)))
'''