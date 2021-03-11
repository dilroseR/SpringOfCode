# Cyclically rotating all the elements of an array on right by one

print("Enter the elements of an array: ")
res=input().split(" ")
for i in range(0,len(res)):
	num=int(res[i])
	res[i]=num
print(res)

lastVariable=res[len(res)-1]
for i in range(len(res)-1,0,-1):
	res[i]=res[i-1]
res[0]=lastVariable
print(res)