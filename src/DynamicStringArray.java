public class DynamicStringArray implements DynamicStringCollectionMethods {

    //Array with length of 10
    private String[] array = new String[10];
    private int length = 0;

    public void append(String value){
        array[length] = value;
        length++;
    }

    public void insert(String value, int index){
        try {

            if (index > length) {
                throw new DynamicStringCollectionException();
            }

            for (int i = length; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            length++;
        } catch (DynamicStringCollectionException e) {
            e.printStackTrace();
        }
    }

    public String get(int index) {
        try {

            if (index > length-1) {
                throw new DynamicStringCollectionException();
            }

            return array[index];
        } catch (DynamicStringCollectionException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void delete(int index) {
        try {

            if (index > length-1) {
                throw new DynamicStringCollectionException();
            }

            for (int i = index; i < length; i++) {
                array[i] = array[i + 1];
            }
            length--;
        } catch (DynamicStringCollectionException e) {
            e.printStackTrace();
        }
    }

    public int getLength() {
        return length;
    }

    //Special methods for Arrays

    private void doubleArraySize() {
        String[] array2 = new String[array.length*2];
        for (int i=0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;

    }

    private void bisectArraySize(){
        String[] array2 = new String[array.length/2];
        for (int i=0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

}
