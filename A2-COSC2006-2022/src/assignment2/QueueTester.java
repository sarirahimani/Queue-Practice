package assignment2;

public class QueueTester{
	public static void main(String[] args){
		try{
			//create queue and print
			Queue<Integer> myQueue = new Queue<Integer>();
			System.out.println(myQueue);
			

			System.out.println("Size before adding elements: "+myQueue.size());
			System.out.println("Is the Queue empty? (before adding elements) "+myQueue.empty());
		
			
			myQueue.enqueue(5);
			myQueue.enqueue(3);
			myQueue.enqueue(12);
			myQueue.enqueue(7);
			myQueue.enqueue(1);
			myQueue.enqueue(4);
			myQueue.enqueue(2);
			myQueue.enqueue(9);
			myQueue.enqueue(10);
			myQueue.enqueue(0);
		
			System.out.println("Length of line: " + myQueue.size());
			System.out.println(myQueue);
			
			System.out.println("Next number in line:  " + myQueue.dequeue());
			System.out.println(myQueue);
			
			System.out.println("Next number in line: " + myQueue.dequeue());
			System.out.println(myQueue);
			
			System.out.println("Length of line: " + myQueue.size());
			myQueue.enqueue(9);
			System.out.println(myQueue);
			
			System.out.println("Next number in line: " + myQueue.dequeue());
			System.out.println(myQueue);
			
			System.out.println("Peeking at next in line: " + myQueue.front());
			System.out.println(myQueue);
			
			System.out.println("Is the queue empty? " + myQueue.empty());
			System.out.println(myQueue);
			myQueue.clear();
			
			System.out.println("Is the queue empty? " + myQueue.empty());
			System.out.println(myQueue);
			
			myQueue.enqueue(1);
			myQueue.enqueue(2);
			myQueue.enqueue(3);
			myQueue.enqueue(4);
			myQueue.enqueue(5);
			myQueue.enqueue(6);
			myQueue.enqueue(7);
			myQueue.enqueue(8);
			myQueue.enqueue(9);
			myQueue.enqueue(10);
			
			System.out.println(myQueue);
			
			myQueue.dequeue();
			myQueue.dequeue();
			myQueue.dequeue();
			myQueue.dequeue();
			myQueue.dequeue();
			myQueue.dequeue();
			System.out.println(myQueue);
			
			myQueue.enqueue(11);
			System.out.println(myQueue);
		
			
			System.out.println("Length of line: " + myQueue.size());
			
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
    
