interface DynamicStringCollectionMethods {
    // Includes an element on the end
    public void append(String value);

    //Putting a string on wanted index
    public void insert(String value, int index);

    // Get the element by index
    public String get(int index);

    // Deltes an element by index
    public void delete(int index);

    // Presents length of list/array
    public int getLength();
}