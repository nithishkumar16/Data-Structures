public class DoublyLLOps {
    DoublyLLPojo head = null;
    DoublyLLPojo tail = null;

    public DoublyLLOps() {
    }

    public void insert(int data) {
        DoublyLLPojo node = new DoublyLLPojo(data);
        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            while(true) {
                if (this.tail.next == null) {
                    this.tail.next = node;
                    node.prev = this.tail;
                    this.tail = node;
                    break;
                }

                this.tail = this.tail.next;
            }
        }
    }

    public void insert(int data, int position) {
        DoublyLLPojo newNode = new DoublyLLPojo(data);
        if (position == 1) {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        } else {
            DoublyLLPojo currNode = this.head;

            for(int currPos = 2; currNode.next != null && currPos < position; ++currPos) {
                currNode = currNode.next;
            }

            currNode.next.next.prev = newNode;
            newNode.next = currNode.next;
            currNode.next = newNode;
            newNode.prev = currNode;
            System.out.println("NEW NODE 2 " + newNode.data);
            System.out.println("CURRENT NODE 2 " + currNode.data);
        }
    }

    public void show() {
        DoublyLLPojo node = head;

        while(node.next!=null)
        {
            System.out.println("VALUE" + node.data);
            node=node.next;
        }

        System.out.println("VALUE" + node.data);
    }

    public void delete(int position) {
        if (position == 1) {
            this.head = this.head.next;
            this.head.prev = null;
        } else {
            DoublyLLPojo currNode = this.head;

            for(int currPos = 2; currNode.next != null && currPos < position; ++currPos) {
                currNode = currNode.next;
            }

            DoublyLLPojo nodeToBeDeleted = currNode.next;
            if (nodeToBeDeleted != null && nodeToBeDeleted.next != null) {
                currNode.next = nodeToBeDeleted.next;
                nodeToBeDeleted.next.prev = currNode;
            }
        }
    }

    public void reverse() {
        //10 20 30 40
        DoublyLLPojo currNode = head;
        DoublyLLPojo prevNode = null;
        DoublyLLPojo nextNode;

        while(currNode!=null)
        {
            prevNode = currNode.prev;  //null     //10              //20        //30
            nextNode = currNode.next;  //20     //30              //40        //null
            currNode.prev = nextNode;  //20     //20.prev = 30    //40        //null
            currNode.next = prevNode;  //null     //20.next = 10    //20        //30
            currNode = nextNode;       //20     //30              //40        //null
        }
        head = prevNode.prev;
    }
}
