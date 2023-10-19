import sys

input = sys.stdin.readline

S = set()
for _ in range(int(input())):
	arr = list(input().split())
	c = arr[0]
	
	if c == 'add':
		S.add(int(arr[1]))
	elif c == 'remove':
		S.discard(int(arr[1]))
	elif c == 'check':
		if int(arr[1]) in S:
			print(1)
		else:
			print(0)
	elif c == 'toggle':
		if int(arr[1]) in S:
			S.discard(int(arr[1]))
		else:
			S.add(int(arr[1]))
	elif c == 'all':
		S = set([i for i in range(1,21)])
	else:
		S = set()