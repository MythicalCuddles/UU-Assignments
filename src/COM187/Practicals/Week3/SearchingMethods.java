package COM187.Practicals.Week3;

public class SearchingMethods {
    //linear search
    public static void linearSearch(int[] num, int target){
        int location;
        boolean found;

        location = 0;
        found = false;
        do {
            if(num[location] == target)   {
                found = true;
            }//end if

            else{

                location++;
            }//end else

        }while((location < num.length ) && (found == false));

        if (!found){
            System.out.println("The number "+target+" was not found");
        }//end if
        else
        {

            System.out.println("The number "+target+ " found at array location "+ location);
        }//else
    }//end linearSearch method


    //binary search
    public static void binarySearch(int [] num, int target){

        int top, bottom, middle, location;
        boolean found, finished;

        location =0;
        found = false;

        top = num.length - 1;
        bottom = 0;

        do {
            middle = (top + bottom) /2;
            if (num[middle] == target){

                found = true;
                location = middle;

            }//end if

            else if (num[middle] < target){

                bottom = middle + 1;
            }//end else if

            else{
                top = middle - 1;

            }//end else

            finished = found || (top < bottom);

        } while (!finished);


        if (!found){

            System.out.println("The number "+target+" was not found");


        }//end if

        else{
            System.out.println("The number "+target+" was found successfully at index position "+location);
        } //end else

    }//end binarySearch method

    //bubblesort
    public static void bubbleSort( int [ ] num )
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                if ( num[ j ] > num[j+1] )   // change to < for descending sort
                {
                    temp = num[ j ];                //swap elements
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }//end if
            }//end for
        }//end while
    }  //end bubbleSort method

    //selection sort
    public static void selectionSort (int[] num)
    {

        int i, j, highest, temp;
        for ( i = num.length - 1; i >= 0; i -- )      //start at the end of the array
        {
            highest = i;   //initialize to default value of the highest element index
            for(j = i; j>= 0;  j--) //loop from the end of unsorted zone to the
            //  beginning of the array.
            {
                if( num[j] > num[highest] ){  // compare current element to highest
                    highest = j;		// if it's higher, it becomes the new highest
                }//end if
            }//end inner for
            temp = num[ i ];   //swap smallest found with element in position i.
            num[i] = num[highest];
            num[highest] = temp;

        }//end outer for
    }//end selectionSort method

    //insertion sort
    public static void insertionSort(int[] num){

        int i, j, newValue;
        for (i = 1; i < num.length; i++) {
            newValue = num[i];
            j = i;
            while (j > 0 && num[j - 1] > newValue) {
                num[j] = num[j - 1];
                j--;
            }//end while
            num[j] = newValue;
        }   //end for

    } //end insertionSort method


}
