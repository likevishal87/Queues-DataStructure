package com.bridgelabz;

public class QueueOperations {
	public static void main(String[] args) {
		Queues<Integer> queue = new Queues<Integer>(3);

		System.out.println("Creating the Queue of 56->30->70");
		queue.enqueue(56);
		queue.printQueue();
		queue.enqueue(30);
		queue.printQueue();
		queue.enqueue(70);
		queue.printQueue();
	}
}
