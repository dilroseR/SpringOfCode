# Swap the positions of even elements & odd elements and vice-versa in an array

print("Enter the elements of an array: ")
res=input().split(" ")
even=[]
odd=[]
answer=[]
j=0
k=0
for i in range(0,len(res)):
	num=int(res[i])
	if num%2==0:
		even.append(num)
	else:
		odd.append(num)
	res[i]=num

for i in range(0,len(res)):
	if res[i]%2==0:
		answer.append(odd[j])
		j=j+1
		
	else:
		answer.append(even[k])
		k=k+1
print(answer)
	 
	