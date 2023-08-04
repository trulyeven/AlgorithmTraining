import sys

input = sys.stdin.readline

N, M = map(int, input().split())
lst_W = ["W","B"]*4
lst_B = ["B","W"]*4
lst_BW = [lst_B,lst_W]*4
lst_WB = [lst_W,lst_B]*4
lst = []
for i in range(N):
    lst.append(list(input()))
dic= {}
for ro in range(N-7):
    for co in range(M-7):
        cnt_w, cnt_b = 0, 0
        for i in range(8):
            for j in range(8):
                if lst[ro+i][co+j] != lst_BW[i][j]:
                    cnt_b += 1
                if lst[ro+i][co+j] != lst_WB[i][j]:
                    cnt_w += 1
        dic[min(cnt_b,cnt_w)] = [ro,co]
print(min(dic))