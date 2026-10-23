#include <iostream>
using namespace std;

class Stack {
private:
    int arr[6];  // Stack with 6 elements
    int top;     // Top of stack pointer

public:
    // Constructor
    Stack() {
        top = -1;
    }

    // Check if stack is full
    bool isFull() {
        return top == 5;  // 6 elements (0-5)
    }

    // Check if stack is empty
    bool isEmpty() {
        return top == -1;
    }

    // Push element to stack
    void push(int value) {
        if (isFull()) {
            cout << "Stack Overflow! Cannot push " << value << endl;
            return;
        }
        arr[++top] = value;
        cout << "Pushed: " << value << endl;
    }

    // Pop element from stack
    int pop() {
        if (isEmpty()) {
            cout << "Stack Underflow! Cannot pop" << endl;
            return -1;
        }
        int value = arr[top--];
        cout << "Popped: " << value << endl;
        return value;
    }

    // Display top element
    void displayTop() {
        if (isEmpty()) {
            cout << "Stack is empty! No top element" << endl;
            return;
        }
        cout << "Top element: " << arr[top] << endl;
    }

    // Display entire stack
    void displayStack() {
        if (isEmpty()) {
            cout << "Stack is empty!" << endl;
            return;
        }
        cout << "Stack contents (top to bottom): ";
        for (int i = top; i >= 0; i--) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    Stack stack;

    cout << "===== STACK OPERATIONS =====" << endl << endl;

    // 1. Push until stack is full
    cout << "1. Pushing 6 elements until stack is full:" << endl;
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.push(60);
    cout << endl;

    // 2. Display the stack
    cout << "2. Display the stack:" << endl;
    stack.displayStack();
    cout << endl;

    // 3. Pop one element
    cout << "3. Pop one element:" << endl;
    stack.pop();
    cout << endl;

    // 4. Display the top element
    cout << "4. Display the top element:" << endl;
    stack.displayTop();
    cout << endl;

    // 5. Pop another element
    cout << "5. Pop another element:" << endl;
    stack.pop();
    cout << endl;

    // 6. Display the stack again
    cout << "6. Display the stack again:" << endl;
    stack.displayStack();
    cout << endl;

    cout << "===== END OF OPERATIONS =====" << endl;

    return 0;
}
