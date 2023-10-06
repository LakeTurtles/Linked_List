package org.example;



//Big O Notation O(1)
public class LinkedListCustom {
    private static class Node {
        int data;
        Node next;

        public Node(int data){ this.data = data;}

    }


    private Node head;

    public void addFront(int data){

//        Create a new Node
        Node newNode = new Node(data);

//         if head...
        if(head == null){
            head = newNode;
            return;
        }

//        Set its next pointer to the current head
        newNode.next = head;

//        set current head be the new head
        head = newNode;
    }

    public int getFirst(){
//        if head is null
        if(head == null){
            throw new IllegalArgumentException("Empty List!");
        }

        return head.data;

    }

    public int getLast(){
        if(head == null){
            throw new IllegalArgumentException("Empty List!");
        }

        Node current = head;

//        while we are not at the tail
//        Big O Notation of O(n)
        while(current.next != null){
            current = current.next;
        }

        return current.data;

    }


    public void addBack(int data){
        Node newNode = new Node(data);

//        if head ... set and return
                if(head == null){
                    head = newNode;
                    return;
                }

//        start at the head

        Node current = head;

//                walk back node = null
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }


    public int size(){
        if(head == null){
            return 0;
        }
        int count = 1;
        Node current = head;

        while(current.next != null){
            current = current.next;
            count++;
        }

        return count;
    }



    public void clear(){
        head = null;
    }



    public void deleteValue(int data){
//        if head
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }



//        else walk the list

        Node current = head;

        while(current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }


}
