import sys
from collections import deque

input = sys.stdin.readline
def print(x):
    sys.stdout.write(str(x)+'\n')
queue = deque()
n = int(input())
def Que(x):
    match x[0]:
        case "push":
            queue.append(x[1])
        case "pop":
            if queue:
                print(queue.popleft())
            else:
                print(-1)
        case "size":
            print(len(queue))
        case "empty":
            print(0 if queue else 1)
        case "front":
            if queue:
                print(queue[0])
            else:
                print(-1)
        case "back":
            if queue:
                print(queue[-1])
            else:
                print(-1)
for _ in range(n):
    Que(input().split())