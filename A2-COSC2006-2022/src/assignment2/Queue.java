package assignment2;

public class Queue<E> {
	
			public E data[];
			public static final int DEFAULT_CAPACITY = 10;
			public int front;
			public int rear;
			public int size;
			
			// Unargumented constructor.
			// Total number of operations=5. Meaning that this is an O(1) method.
			public Queue(){
				data = (E[]) new Object[DEFAULT_CAPACITY]; //two operations
				front=0; //one operation
				rear=0; //one operation
				size=0; //one operation 
			}
			
		
			/*
			 * Adds an object to the queue
			 * If the queue is full the number of operations is=1+O(1) and it is an O(1) method
			 * If the queue is not full the number of operations is=7 and it is an O(1) method
			 * This is an O(1) method. 
			 */
			public void enqueue(E in) throws Exception{
				if(size==data.length) {//one operation
					throw new Exception("Queue is full!");//This an O(1) operation 
				}else {//one operation
					size++; //one operation
					data[rear]=in;//one operation
					rear++;//one operation
					
					if(rear==data.length) {//one operation
						rear=0;//one operation
					}
				}
			}
			
			/*
			 * Removes an object from the queue and returns it
			 * If the queue is empty the number of operations is=O(1)+O(1)+1 and it is an O(1) method
			 * If the queue is not empty the number of operations is=9+O(1) and it is an O(1) method
			 * This method is an O(1) method. 
			 */
			public E dequeue() throws Exception{
				if(empty()) {//one operation and the empty() method is an O(1) method		
					throw new Exception("Queue is empty and cannot be dequeued."); //This an O(1) operation 
				}else {//one operation
					size--;//one operation
					E temp=data[front];//one operation
					data[front]=null;//one operation
					front++;//one operation 
					
					if(front==data.length) {//one operation
						front=0;//one operation
					}
					return temp;//one operation
				}
			}
			
			/*
			 * Returns the next object in the queue without removing it
			 * If the queue is empty the number of operations is=O(1)+O(1)+1 and it is an O(1) method
			 * If the queue is not empty the number of operations is=3+O(1) and it is an O(1) method
			 * This method is an O(1) method. 
			 */
			public E front() throws Exception{
				if(empty()) {//one operation and the empty() method is an O(1) method	
					throw new Exception("Queue is empty and cannot be peek.");//This an O(1) operation 
				}else {//one operation
					return data[front];//one operation
				}
			}

			
			// Empties the queue
			// Total number of operations=5. Meaning that this is an O(1) method.
			public void clear(){
				size=0;//one operation
				data = (E[]) new Object[DEFAULT_CAPACITY];//two operations
				front=0;//one operation
				rear=0;//one operation
			}
			
			
			// Returns true if the queue has nothing in it, false if there is something
			// Total number of operations=2. Meaning that this is an O(1) method.
			public boolean empty(){
				return size==0; //two operations
			}
			
			// Returns the number of objects in the queue
			// Total number of operations=1. Meaning that this is an O(1) method.
			public int size(){
				return size;//one operation
			}
			

			public String toString() {
			
				StringBuilder str=new StringBuilder();//one operation
				
				str.append("front= "+ front + "; ");//10 characters are added/appended
				str.append("rear= "+ rear + "\n");//8 characters are added/appended
				
				for(int i=0; i<data.length;i++) {//n operations
				
					if(data[i]!=null) {//one operation
						str.append(i+" "+ data[i]);//3 characters are appended
					}else {//one operation
						str.append(i+" -");//3 characters are appended
					}if(i!=data.length-1) {//two operations
						str.append("\n");//one character is appended
					}
				}
				
				return str.toString();//one operation and the method call toString() is n operations
			}
			/*
			 * Number of operations excluding the for loop is= 20+n
			 * Number of operations of the for loop if data[i] is not equal to null=7n
			 * Number of operations of the for loop if data[i] is equal to null=8n
			 * Total number of operations=20+n+8n=20+9n=9n=n
			 * This is an O(n) method
			 */
			
}

