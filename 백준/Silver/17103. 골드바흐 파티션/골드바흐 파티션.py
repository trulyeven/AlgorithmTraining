import sys

input = sys.stdin.readline

def sosu(x):
    prm = {k:True for k in range(x+1)}
    prm[0] = prm[1] = False
    for i in range(2, int(x**0.5) + 1):
        if prm[i]:
            for j in range(i*i, x + 1, i):
                prm[j] = False
    return {i:1 for i in range(2, x + 1) if prm[i]}

dic = sosu(1000000)
for a in range(int(input())):
    n = int(input())
    cnt = 0
    for i in dic:
        if i > n / 2:
            break
        if n - i in dic:
            cnt += 1
    print(cnt)