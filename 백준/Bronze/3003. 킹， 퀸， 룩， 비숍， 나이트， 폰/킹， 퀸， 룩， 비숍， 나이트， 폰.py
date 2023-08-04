x = list(map(int, input().split()))
chess = [1,1,2,2,2,8]
diff = [j - i for i, j in zip(x, chess)]
result = ' '.join([str(x) for x in diff])
print(result)