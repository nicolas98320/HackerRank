/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

    
void Print(Node head) {
    if (head != null){
        Node current = head;
        while(true){
            System.out.println(current.data);
            if (current.next != null){
                current = current.next;
            } else {
                break;
            }
        }
    }
}