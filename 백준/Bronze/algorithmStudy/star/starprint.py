# 문제
# 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

# 입력
# 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

# 출력
# 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

# 예제 입력 1 
# 1
# 예제 출력 1 
# *
# 예제 입력 2 
# 2
# 예제 출력 2 
#  *
# * *
# 예제 입력 3 
# 3
# 예제 출력 3 
#   *
#  * *
# * * *
# 예제 입력 4 
# 4
# 예제 출력 4 
#    *
#   * *
#  * * *
# * * * *

import sys

N = int(sys.stdin.readline())

for i in range(1, N+1):

    #현재 줄(i)에서 필요한 시작 공백의 개수 : n-i
    leading_spaces = N - i

    #별과 별 사이의 공백을 포함하여 문자열을 만듭니다.
    #예 : i=3 "* * *"
    stars_pattern = "* " * i

    #마지막에 추가된 불필요한 공백 제거(예 : "* * "-> "* *")
    #rstrip() 함수를 사용해서 문자열의 오른쪽 끝의 공백을 삭제
    stars_pattern = stars_pattern.rstrip()

    print(" " * leading_spaces + stars_pattern)