# Check if a Mth fibonacci number divides Nth fibonacci number

m=int(input("Enter Mth fibonacci no: "))
n=int(input("Enter Nth fibonacci no: "))

a=1
b=1
arr=[]
arr.append(a)
arr.append(b)
for i in range(2,n):
	c=a+b
	arr.append(c)
	a=b
	b=c
print(arr)
ele1=arr[m-1]
ele2=arr[n-1]
if ele2%ele1==0:
	print("Yes")
else:
	print("No")