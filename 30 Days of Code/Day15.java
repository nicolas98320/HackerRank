    public static  Node insert(Node head,int data) {
        
        Node node = new Node(data);

        if (head == null)
            return node;

        Node start = head;
        while (start.next != null) {
            start = start.next;
        }

        start.next = node;
        
        return head;
    }