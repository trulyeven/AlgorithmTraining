import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
num = deque(map(int, input().split()), maxlen=N)
x = int(input())
print(num.count(x))