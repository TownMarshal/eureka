package ShangXueTang.MyCollection;

/**
 * 自己实现一个ArrayList
 *理解数组扩容
 */
public class MyArrayList /*implements List*/  {
// TODO: 2021/3/30 数组扩容
        private Object[] elementData;
        private int size;
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public MyArrayList(){
            this(10);
        }

        private MyArrayList(int initialCapacity){
            if(initialCapacity<0){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            elementData = new Object[initialCapacity];
        }

        public void add(Object obj){
            //数组扩容和数据的拷贝
            if(size==elementData.length){
                Object[] newArray = new Object[size*2+1];
                System.arraycopy(elementData, 0, newArray, 0, elementData.length);
//			for(int i=0;i<elementData.length;i++){
//				newArray[i] = elementData[i];
//			}
                elementData = newArray;
            }

            elementData[size++]=obj;
//		size++;
        }

        public Object get(int index){
            rangeCheck(index);

            return elementData[index];
        }

        public void remove(int index){
            rangeCheck(index);
            //删除指定位置的对象
            //a b d e
            int numMoved = size - index - 1;
            if (numMoved > 0){
                System.arraycopy(elementData, index+1, elementData, index,
                        numMoved);
            }
            elementData[--size] = null; // Let gc do its work
        }

        public void remove(Object obj){
            for(int i=0;i<size;i++){
                if(get(i).equals(obj)){  //注意：底层调用的equals方法而不是==.
                    remove(i);
                }
            }
        }

        public Object set(int index,Object obj){
            rangeCheck(index);

            Object oldValue =  elementData[index];
            elementData[index] = obj;
            return oldValue;
        }

        public void add(int index,Object obj){
            rangeCheck(index);

            ensureCapacity();  //数组扩容

            System.arraycopy(elementData, index, elementData, index + 1,
                    size - index);
            elementData[index] = obj;
            size++;
        }

        private void ensureCapacity(){
            //数组扩容和数据的拷贝
            if(size==elementData.length){
                Object[] newArray = new Object[size*2+1];
                System.arraycopy(elementData, 0, newArray, 0, elementData.length);
//							for(int i=0;i<elementData.length;i++){
//								newArray[i] = elementData[i];
//							}
                elementData = newArray;
            }
        }

        private void rangeCheck(int index){
            if(index<0||index>=size){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            MyArrayList list = new MyArrayList(3);
            list.add("333");
            list.add("444");
            list.add("5");
            list.add("344433");
            list.add("333");
            list.add("333");
            System.out.println(list.size());
//		System.out.println(list.get(6));
            list.remove("444");
            System.out.println(list.size());
        }

    }


