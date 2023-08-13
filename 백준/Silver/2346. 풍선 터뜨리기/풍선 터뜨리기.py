import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
num = list(map(int, input().split()))
que = deque(i for i in range(1,n+1))
lst = []
for i in range(n):
    y = que.popleft()
    if i != n-1:
        if num[y-1] > 0:
            for _ in range(abs(num[y-1])-1):
                x = que.popleft()
                que.append(x)
        else:
            for _ in range(abs(num[y-1])):
                x = que.pop()
                que.appendleft(x)
    lst.append(y)
print(' '.join(map(str,lst)))