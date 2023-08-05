import sys

input = sys.stdin.readline

for _ in range(int(input())):
    s = list(input())
    result = "YES"
    if s.count("(") != s.count(")"):
        result = "NO"
        print(result)
        continue
    for i in range(s.count("(")):
        if s.index(")") < s.index("("):
            result = "NO"
            break
        else:
            s.remove("(")
            s.remove(")")
    print(result)