import sys;
from collections import deque

people = ["Rajeev", "Chris", "John", "Ken"];

stackA = deque();
queueB = deque();

for person in people:
    stackA.append(person);
    queueB.append(person);

# LIFO last-in-first-out
print("Pop the stack:");
while( len(stackA) > 0):
    print(stackA.pop());

# FIFO first-in-first-out
print("\nDequeue the queue:");
while(len(queueB) > 0):
    print(queueB.popleft());
