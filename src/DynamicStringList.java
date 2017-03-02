public class DynamicStringList implements DynamicStringCollectionMethods{

    private DynamicStringListElement first = null;
    private int length = 0;

    // Using insert for append
    public void append(String value) {
        insert(value, length);
    }

    public void insert(String value, int index) {
        try {

            if (index > length || index < 0) {
                throw new DynamicStringCollectionException();
            }
            if(index == 0) {
                DynamicStringListElement tmp = first;
                first = new DynamicStringListElement(value);
                first.setNext(tmp);
            } else {
                DynamicStringListElement newListElement = new DynamicStringListElement(value);
                DynamicStringListElement element = getListElement(index-1);
                newListElement.setNext(element.getNext());
                element.setNext(newListElement);
            }
            length++;
        } catch (DynamicStringCollectionException e) {
            e.printStackTrace();
        }
    }

    public String get(int index) {
        if (index >= length ||index < 0) {
            throw new DynamicStringCollectionException();
        }
        DynamicStringListElement e = getListElement(index);
        return e.getValue();
    }

    public void delete(int index) {
        if (index > length-1 || index < 0) {
            throw new DynamicStringCollectionException();
        }

        if (index == 0) {
            first = first.getNext();
        }
        else if (index == length - 1) {
            DynamicStringListElement n = getListElement(length - 2);
            n.setNext(null);
        }
        else {
            DynamicStringListElement element = getListElement(index - 1);
            element.setNext(element.getNext().getNext());
        }
        length--;
    }

    public int getLength() {
        return length;
    }

    private DynamicStringListElement getListElement(int index){
        DynamicStringListElement firstElement = first;
        for (int i=0; i < index; i++) {
            firstElement = firstElement.getNext();
        }
        return firstElement;
    }
}