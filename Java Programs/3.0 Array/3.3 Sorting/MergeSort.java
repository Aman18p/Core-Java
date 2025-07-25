// Merge Sort

public class MergeSort
{
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args)
    {
        int[] inputArr = {48, 38, 13, 41, 21, 61, 19};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);

        for(int i: inputArr)
        {
            System.out.print(i+" ");
        }
    }
    public void sort(int inputArr[])
    {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length-1);
    }
    public void divideArray(int lowerIndex, int higherIndex)
    {
        if(lowerIndex < higherIndex)
        {
            int middle = lowerIndex +(higherIndex-lowerIndex)/2;
            divideArray(lowerIndex,middle); //left side of the array

            divideArray(middle+1, higherIndex);//Right side of the array

            mergeArray(lowerIndex, middle, higherIndex);
        }
    }
    public void mergeArray(int lowerIndex, int middle, int higherIndex)
    {
        for(int i=lowerIndex; i<=higherIndex; i++)
        {
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;

        while (i<=middle && j<=higherIndex)
        {
            if(tempMergeArr[i] <= tempMergeArr[j])
            {
                array[k] = tempMergeArr[i];
                i++;
            }
            else
            {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i<=middle)
        {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}

