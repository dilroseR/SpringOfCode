#Find the first non-repeating character in the given String

def findChar(s):
	d={}
	for i in range(0,len(s)):
		count=1
		a=s[i]
		if a not in d:
			d[a]=count
		else:
			count=d.get(a)
			count=count +1
			d[a]=count
	
	firstOccurrence=1
	for character,occurrence in d.items():
		if firstOccurrence==occurrence:

			print("The first non-repeating character: ",character)
			break
print("Enter a string: ")
s=input()
findChar(s)
