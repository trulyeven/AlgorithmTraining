import sys

input = sys.stdin.readline

def hamsu(x, y=0):
    if y != 0:
        i = y
    match x:
        case 1:
            lst.append(i)
        case 2:
            print(lst.pop() if lst else -1)
        case 3:
            print(len(lst))
        case 4:
            print(0 if lst else 1)
        case 5:
            print(lst[-1] if lst else -1)

lst = []
for _ in range(int(input())):
    n = list(map(int, input().split()))+[0]
    hamsu(n[0],n[1])