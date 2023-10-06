import java.lang.reflect.Method;
import java.util.Scanner;
public class Library {
    int[] arr=new arr(100);
    public void addItem(){
       // Scanner sc = new Scanner (System.in) ;
       // System.out.println ("Enter number of elements in array : ");
       // Scanner in =in.nextInt();
              for (int i= 0;i<100;i++){
                       System.out.print("enter element "+(i+1)+" :");
                          this.arr[i]=in.nextDouble() ;
                              }
                              
    }

  public String borrowItem() {
        
  if ((bookname == "Moth Smoke") ) {
         System.out.printf("%s is available" ,bookname );
                 } else {
                      System.out.printf("%s not found", bookname );
                          }
                 return bookname;

    
  }
public void returnitem() {
    if((bookname=="Moth smoke")){
        System.out.printf("%s has been returned.", bookname);
        }else{
            System.out.printf("%s was never issued by library!", bookname);
        }
    }

public void displayBorrowedItems() {
    for (int i = 0; i < 100; ++i){
        if (booksIssuedByLibrary [i] != null ){
                     booksIssuedByLibrary [i].displayBookDetails ();
                     System.out.println("\n\t"+booksIssuedByLibrary [i]);
            }

    
}
}
public void displayAvailableItems() {
    for (int i = 0; i < 100; ++i){
        if (booksIssuedByLibrary [i]==null && !isTaken[i]){
                       System.out.println("available item: "+booksList[i]);
                               System.out.println("");
        }
    
}

}












}
