print("Enter the elements: ")
res=input().split(" ")
ans=[]
res.sort(key=len,reverse=True)
firstElement=len(res[0])
for i in res:
	if len(i)==firstElement:
		ans.append(i)
print(ans)
