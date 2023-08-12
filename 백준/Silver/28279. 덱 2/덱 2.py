import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
que = deque()
for _ in range(n):
    c = list(map(int, input().split()))
    match c[0]:
        case 1:
            que.appendleft(c[1])
        case 2:
            que.append(c[1])
        case 3:
            if que:
                print(que.popleft())
            else:
                print(-1)
        case 4:
            if que:
                print(que.pop())
            else:
                print(-1)
        case 5:
            print(len(que))
        case 6:
            print(0 if que else 1)
        case 7:
            if que:
                print(que[0])
            else:
                print(-1)
        case 8:
            if que:
                print(que[-1])
            else:
                print(-1)