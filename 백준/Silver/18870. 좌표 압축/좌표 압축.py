import sys

input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))
lst_s = sorted(set(lst))
idx_dict = {value: idx for idx, value in enumerate(lst_s)}
for i in lst:
    print(idx_dict[i])