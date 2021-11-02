public class Main {
    public static void main(String[] args) {
        int [] bookshelf ={14, 16, 19, 32, 32, 32, 56, 69, 72};
        int book=72;
        placeBook(book,bookshelf);
    }

    public static void placeBook (int book,int [] bookshelf){
        int left = 0;
        int right = bookshelf.length-1;
        while(left < right) {
            int middle = (left + right) / 2;
            if (bookshelf[middle] == book){
                if(bookshelf[middle+1] > book ){
                    left=middle+1;
                }
                else{
                    left=middle-1;
                }
            }
            // если средний элемент меньше,идём вправо
            if (bookshelf[middle] < book){
                left = middle + 1;
            }
            // если средний элемент больше,идём влево
            if (bookshelf[middle] > book){
                right = middle - 1;
            }
        }
        System.out.println(bookshelf.length-left);
    }
}
