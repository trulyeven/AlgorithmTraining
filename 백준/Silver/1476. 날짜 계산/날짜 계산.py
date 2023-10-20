import sys

input = sys.stdin.readline

E,S,M = map(int, input().split())
i = 1
while not ((E-i)%15 == 0 and (S-i)%28 == 0 and (M-i)%19 == 0):
    i += 1
print(i)