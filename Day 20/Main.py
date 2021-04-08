# Convert a Binary Search Tree into a Skewed tree in increasing or decreasing order
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
print("-----------Increasing Order------------")
def inorder(root):
	if root:
		
		inorder(root.left)
		print(root.value)
		inorder(root.right)


root=Node(10)
insert(root,Node(2))
insert(root,Node(50))
insert(root,Node(1))
insert(root,Node(3))
inorder(root)