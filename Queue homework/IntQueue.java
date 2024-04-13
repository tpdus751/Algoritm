package queue;

public class IntQueue {
	private int queue[];
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	public IntQueue(int capacity) {
		front = size = rear = 0;
		this.capacity= capacity;
		this.queue = new int [capacity];
		
	}
	
	public boolean enqueue(int data) {
		// queue가 풀일때
		if (size == capacity) {
			return false;
		}
		
		// rear 가 capacity를 넘어갈때
		if (rear == capacity) {
			rear = 0;
		}
		// 정상 작동
		queue[rear++] = data;
		
		size++;
		return true;
	}
	
	public int dequeue() {
		if (size == 0) {
			return -1;
		}
		
		else {
		size--;
		return queue[front++];
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public int getFront() {
		return queue[front];
	}
	
	public int getSize() {
		return size;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void clear() {
		size = front = rear = 0;
	}
	
	public void dump() {
		if (isEmpty()) {
			System.out.println("비어있는 queue 입니다.");
		}

		// if front < rear
		if (front < rear) {
			for (int i = front; i < rear; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
		}
		
		// if front > rear
		if (front > rear) {
			for (int i = front; i < capacity; i++) {
				System.out.print(queue[i] + " ");
			}
			for (int i = 0; i < rear; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
		}
	}
	
}
