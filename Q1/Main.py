"""
Q.) Find the maximum occurring character in the string
"""

def maxOccur(s):
	letters=[]
	countOfeachLetter=[]
	answer=0
	for i in range(0,len(s)):
		if s[i] not in letters:
			letters.append(s[i])
	
	for i in letters:
		count=0
		for j in range(0,len(s)):
			if i==s[j]:
				count=count+1
		countOfeachLetter.append(count)

	maximum=countOfeachLetter[0]
	for i in range(0,len(countOfeachLetter)):
		if maximum>countOfeachLetter[i]:
			continue
		else:
			maximum=countOfeachLetter[i]
			answer=i
	
	return letters[answer]
		
	 


print("Enter the string: ")
s=input()
answer=maxOccur(s)
print("The max. occurence of a letter: ",answer)
