import sys

input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))
lst_a = []
lst_s = []
src = 1
idx = 0
while idx < n:
    i = lst[idx]
    if i == src:
        lst_a.append(i)
        src += 1
        idx += 1
    elif lst_s != [] and lst_s[-1] == src:
        lst_s.remove(src)
        lst_a.append(src)
        src += 1
    else:
        lst_s.append(i)
        idx += 1
lst_rs = lst_s[::-1]
lst_sort = sorted(lst)
if lst_sort == lst_a + lst_rs:
    print("Nice")
else:
    print("Sad")