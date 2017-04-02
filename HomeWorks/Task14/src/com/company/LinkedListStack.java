package com.company;

    public class LinkedListStack {
        private Node head;
        private int count;

        public LinkedListStack() {
            head = null;
            count = 0;
        }

        public void push(Human value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
            } else {
                newNode.setNext(head);
                head = newNode;
            }
            count++;
        }

        public Human pop() {
            Human result = head.getValue();
            head = head.getNext();
            count--;
            return result;
        }

        public Human peek() {
            return head.getValue();
        }

        public int getCount() {
            return count;
        }
    }

