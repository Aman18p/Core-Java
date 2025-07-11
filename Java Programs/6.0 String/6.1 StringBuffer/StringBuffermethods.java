public class StringBuffermethods
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Aman Kumar Pandey");
        StringBuffer sb1 = new StringBuffer("Aman Pandey");

        //capacity() method. // it returns how many characters this object can store.
        System.out.println(sb.capacity());

        //append() method.
        sb.append("Hello");
        System.out.println(sb.capacity());

        //length() method. //it returns how many characters the object has.
        System.out.println(sb.length());

        //charAt() method.
        System.out.println(sb.charAt(3));

        //delete() method.
        System.out.println(sb.delete(1,3));

        //deleteCharAt() method.
        System.out.println(sb.deleteCharAt(2));

        //equals() method.  // this methods compares the reference of the object unlike String.
        System.out.println(sb.equals(sb1));

        //indexOf() method.
        System.out.println(sb.indexOf("m"));

        //lastIndexOf() method.
        System.out.println(sb.lastIndexOf("a"));

        //insert() method.
        System.out.println(sb1.insert(0,"Ra"));

        //replace() method.
        System.out.println(sb.replace(1,3,"mar"));

        //reverse() method.
        System.out.println(sb.reverse());

        //sbuSequence() method.
        System.out.println(sb.subSequence(1,3));

        //substring() method.
        System.out.println(sb1.substring(3,9));

        //ensureCapacity() method.
        sb.ensureCapacity(1900);

        //setCharAt() mehod.
        sb1.setCharAt(3, 'r');
        System.out.println(sb1);

        //setLength() method.
        sb.setLength(10);
        System.out.println(sb);

        //trimToSize() method.
        sb1.trimToSize();
        System.out.println(sb1);


    }
}