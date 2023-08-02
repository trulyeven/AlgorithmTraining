import sys

input = sys.stdin.readline

N = int(input())
cnt = 1
for i in range(2,int(N**0.5)+1):
    cnt += 1
print(cnt)