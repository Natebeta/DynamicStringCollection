public class DynamicStringListElement {
    private DynamicStringListElement next;
    private String value;

    public DynamicStringListElement(String value){
        this.value = value;
    }

    public DynamicStringListElement getNext() {
        return next;
    }

    public void setNext(DynamicStringListElement next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }
}
