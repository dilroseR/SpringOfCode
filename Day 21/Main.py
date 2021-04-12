#Find maximum (or minimum) in Binary Tree
class Node:
	def __init__(self,key):
		self.left = None
		self.right = None
		self.value = key

# A function to insert a new node with the given key value
def insert(root,node):
	if root is None:
		root=node
	else:
		if root.value<node.value:
			if root.right is None:
				root.right=node
			else:
				insert(root.right,node)
		else:
			if root.left is None:
				root.left = node
			else:
				insert(root.left,node)

# A function for inorder tree traversal
res=[]
def inorder(root):
	
	if root:

		inorder(root.left)
		res.append(root.value)
		#print(root.value)
		inorder(root.right)
	return res
	


root=Node(10)
insert(root,Node(20))
insert(root,Node(50))
insert(root,Node(1))
insert(root,Node(3))
insert(root,Node(90))
ans=inorder(root)
print("Min: ", ans[0])
print("Max: ",ans[len(ans)-1])