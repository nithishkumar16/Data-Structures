public class DoublyLLPojo {
    int data;
    DoublyLLPojo next;
    DoublyLLPojo prev;

    public DoublyLLPojo(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLLPojo getNext() {
        return this.next;
    }

    public String toString() {
        return "DoublyLLPojo{data=" + this.data + ", next=" + this.next + ", prev=" + this.prev + "}";
    }

    public void setNext(DoublyLLPojo next) {
        this.next = next;
    }

    public DoublyLLPojo getPrev() {
        return this.prev;
    }

    public void setPrev(DoublyLLPojo prev) {
        this.prev = prev;
    }
}
