#Count single node isolated sub-graphs in a disconnected graph

graph=[[] for i in range(6)]

n=int(input("Enter no of vertices:"))

graph[0].append(2)
graph[1].append(1)

graph[1].append(3)
graph[2].append(2)

graph[3].append(6)
graph[4].append(5)


count=0
for i in range(0,n):
	if (len(graph[i])==0):
		count=count+1
print(count)
