# Implement DFS for a graph

#The task is to implement DFS for the given graph(using the starting vertex)


def recursive_dfs(graph, source,path = []):

       if source not in path:

           path.append(source)

           if source not in graph:
               # leaf node, backtrack
               return path

           for neighbour in graph[source]:

               path = recursive_dfs(graph, neighbour, path)


       return path



graph = {"1":["2","3"],
           "2":["3"],
           "3":["1","4"],
           "4":["4"],
             }


path = recursive_dfs(graph, "2")

print(" ".join(path))

