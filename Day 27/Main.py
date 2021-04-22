#  Sort an array according to the increasing frequency of the digit K in the array elements

n=int(input("Enter no of elements: "))
arr=[]
a=[]

for i in range(0,n):
	ele=int(input("Enter the element: "))
	arr.append(ele)



j=int(input("Enter k: "))
for i in arr:
	count=0
	while i!=0:
		n=i%10
		if n==j:
			count=count+1
		i=i//10
	a.append(count)
#print(a)

dict={}

for i in range(0,len(arr)):
	dict[arr[i]]=a[i]

sorted_keys = sorted(dict, key=dict.get)
print(sorted_keys)