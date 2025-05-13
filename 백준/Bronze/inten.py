# 🔍 문제 해석
# 입력

# 첫 줄에 작업 수 n이 주어집니다. (1 ≤ n ≤ 50)

# 그 다음 n개의 줄에는 각각의 작업에 대해 두 정수가 주어집니다.

# a: 첫 번째 인턴이 이 작업을 처리하는 데 걸리는 시간 (분)

# b: 두 번째 인턴이 이 작업을 처리하는 데 걸리는 시간 (분)

# 조건

# 각 작업은 오직 한 명의 인턴만 처리할 수 있습니다.

# 두 인턴은 동시에 독립적으로 작업합니다.

# 각 인턴은 자신이 맡은 작업을 순서대로 하나씩 처리합니다.

# 전체 작업이 끝나는 시간은 두 인턴 중 더 오래 걸리는 쪽의 총 작업 시간입니다.

# 🎯 목표
# 모든 작업을 두 인턴에게 적절히 분배해서,

# 두 인턴 중 더 오래 걸리는 쪽의 총 작업 시간을 최소화하는 것입니다.

n = int(input())
tasks = [tuple(map(int, input().split())) for _ in range(n)]

max_sum = sum(a for a, _ in tasks)
dp = [float('inf')] * (max_sum + 1)
dp[0] = 0  # 인턴1이 0분이면 인턴2는 0분 필요

for a, b in tasks:
    new_dp = [float('inf')] * (max_sum + 1)
    for t1 in range(max_sum + 1):
        if dp[t1] != float('inf'):
            # 이 작업을 인턴1에게 할당
            if t1 + a <= max_sum:
                new_dp[t1 + a] = min(new_dp[t1 + a], dp[t1])
            # 이 작업을 인턴2에게 할당
            new_dp[t1] = min(new_dp[t1], dp[t1] + b)
    dp = new_dp

# 최소의 두 인턴 시간 중 최대값을 구한다
min_time = float('inf')
for t1 in range(max_sum + 1):
    t2 = dp[t1]
    min_time = min(min_time, max(t1, t2))

print(min_time)