/* Java Collection Framework unified architecture for storing and manipulating a group of objects.
java.util package
Collection Framework
ARRAYS CLASS
----> Builtin Methods
----> Arrays.functionname();
Methods:
	Size is static
	And is Faster
	Its homogeneous
	Arrays.toString(array_name);
	Arrays.sort(Array_name);//ascending order
	Arrays.binarySearch(arr_name,element);
	Arrays.fill(arr_name,element_to_be_filled)
	Arrays.compare(arr1, arr2);//Lexicographically compared return type positive or negative numbers
	Arrays.equals(arr1,arr2);//return type boolean
	Arrays.copyOf(arr1,length);//to expand the memory size returns object
	Arrays.copyOfRange(arr1,index1,index2);//returns a sub array
	Arrays.toString(arr1);//
	Arrays.mismatch(arr1,arr2);
ARRAYLIST CLASS:
	ArrayList aarlist = new ArrayList(n);
	ArrayList<Integer> = new ArrayList();
	Dynamic in array size(grows and shrinks)
	Slower than standard arrays
	size increases by 50% of current array size
	Autoboxing and unboxing takes place and no matter what primitive datatype we pass as an argument it is always treated as an object
	add(object)
	add(int index, object)
	remove(Object)
	arrname.get()//not in vector
	arrname.set(2,5)//changes the element at that index to a different number here 5
	remove(int index);
	get(index)
	clear()
	clone()
	index_d(O)
	lastIndexOf(O)
	isEmpty()
	Iterator i = arrname.iterator();
	size()//its a method whereas length is a property not a method
VECTORS
	vectors are synchronised one thread at a time execution thread safe//accurate results
	add and addElement both are present
	Size and Capacity both are present
	Vector v1 = new Vector(4)
	v1.size() //size is 0 when vector is just declared but capacity is 4 and is doubled when size becomes 5 or when capacity overflows
	v1.ensureCapacity(10);//ensure capacity and original capacity max of the two is considered as the capacity 
*/