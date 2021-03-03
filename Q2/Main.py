#Print the word with more than one occurrence from the given String Program

def wordOccur(s):
	counter=[]
	st=""
	answer=[]
	res=list(set(s))
	for i in res:
		count=0
		for j in range(0,len(s)):
			if i==s[j]:
				count=count+1
		counter.append(count)
	for i in range(0,len(counter)):
		if counter[i]>1:
			index=i
			element=res[index]
			answer.append(element)
	print(" ")
	print("The words with more than one occurence are: ")
	for i in answer:
		print(i)
			

print("Enter the string: ")
s=input().split(" ")
wordOccur(s)
