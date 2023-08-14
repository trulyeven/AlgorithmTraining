import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
struc = list(map(int, input().split()))
lst = deque(map(int, input().split()))
m = int(input())
c_lst = deque(map(int, input().split()))
sel = []
for idx, i in enumerate(lst):
    if struc[idx] == 0:
        c_lst.appendleft(i)
result = list(c_lst)[:m]
print(' '.join(map(str, result)))