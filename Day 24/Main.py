# Find maximum and minimum of an array using minimum number of comparisons

n=int(input("Enter the no of elements: "))
arr=[]
for i in range(0,n):
	ele=int(input("Enter the element: "))
	arr.append(ele)



if len(arr)==1:
	min=max=arr[0]
else:
	min=arr[0]
	max=arr[1]
	for i in range(2,len(arr)):
		if arr[i]<min:
			min=arr[i]
		if arr[i]>max:
			max=arr[i]

print("Min:",min, "&","Max:",max)
