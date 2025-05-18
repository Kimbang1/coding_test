#첫째 줄에 테스트 케이스의 개수 T가 주어진다.
#각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와B가 주어진다.
# 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

#테스트 케이스 개수
# T = int(input())

# # 결과를 리스트에 저장해 한 번에 출력하기 위해 초기화
# results = []

# # 테스트 케이스 수만큼 반복 (번호는 1부터 시작)
# for i in range(1,T+1):

#     # 입력 값을 공백 기준으로 나눠 정수형 A, B로 변환
#     A,B = map(int,input().split())

#     # 출력할 문자열 형식을 result 변수에 저장
#     result = f"Case #{i}: {A + B}"

#     # result 값을 results 리스트에 추가
#     results.append(result)
    
# #값을 한번에 출력
# for res in results:
#     print(res)



#속도를 더 빠르게 한 버전
import sys

T = int(sys.stdin.readline())
results = []

for i in range(1, T + 1):
    A, B = map(int, sys.stdin.readline().split())
    results.append(f"Case #{i}: {A + B}") 

print('\n'.join(results))