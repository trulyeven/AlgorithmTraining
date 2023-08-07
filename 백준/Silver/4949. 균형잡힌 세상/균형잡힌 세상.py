import sys

input = sys.stdin.readline

while True:
    s = input().rstrip()
    if s == ".":
        break
    lst = []
    for i in s:
        if i in ("(","["):
            lst.append(i)
        if i == ")":
            if "(" not in lst:
                lst.append(i)
                break
            elif lst[len(lst)-1] == "(":
                lst.pop()
            else:
                lst.append(i)
                break
        if i == "]":
            if "[" not in lst:
                lst.append(i)
                break
            elif lst[len(lst)-1] == "[":
                lst.pop()
            else:
                lst.append(i)
                break
    if lst == []:
        print("yes")
    else:
        print("no")