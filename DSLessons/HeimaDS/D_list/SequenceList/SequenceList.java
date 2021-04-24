package D_list.SequenceList;

public class SequenceList<T> {

    private T[] elements;
    private int length;

    public SequenceList(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.length = 0;
    }

    public SequenceList(T[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.length; i++) {
            sb.append(this.elements[i]);
            if (i != this.length -1) {
                sb.append(", ");
            }
        }
        return "SequenceList{" + sb.toString() + "}";
    }

}
