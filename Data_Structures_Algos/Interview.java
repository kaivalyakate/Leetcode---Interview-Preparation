public class Interview{
   
    public int getDuplicateElement(int[] arr){
        // arr = [1, 2, 3, 3, 4, 5]
        // count = 1, a[0] = 1
        // count = 2, a[1] = 2
        // count = 3, a[2] = 3
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=(i+1)){
                return arr[i];
            }
            count++;
        }
        return -1;
    }
    
}


class Theatre{

}

// Theatre -> (List Movies, Location, Screens)
// Location -> ()
// Screen -> (NoOfSeats, Movie)
// Movie -> (Theatres, Timing)
// MovieInformation -> id Name theatre_id Timing
// MovieDetails -> id Name Review
// Screen -> id theatre_id NoOfSeats
// [5, 2, 3, 4, 3, 1] 
// [1, 2, 3, 3, 4, 5] 
// count = 1, a[0] = 1
// count = 2, a[1] = 2
// count = 3, a[2] = 3 