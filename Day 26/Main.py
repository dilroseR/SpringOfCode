# Sort all even numbers in ascending order and all odd numbers in the descending order

n=int(input("Enter no of elements: "))
odd=[]
even=[]
for i in range(0,n):
	ele=int(input("Enter the element: "))
	if ele%2!=0:
		odd.append(ele)
	else:
		even.append(ele)

odd.sort(reverse=True)
even.sort()
for i in even:
	odd.append(i)
print(odd)