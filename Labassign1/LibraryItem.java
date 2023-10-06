public class LibraryItem {
    protected String title;
    protected String author;
    protected int year;
    protected boolean isBorrowed;
    protected LibraryItemType itemType;



    LibraryItem(String title,String author,int year,boolean isBorrowed,LibraryItemType itemType){
       this.title=title;
       this.author=author;
       this.year=year;
       this.isBorrowed=isBorrowed;
       this.LibraryItem=LibraryItem;

     }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
           this.title = title;
}
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
}
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;}
    
    public boolean getIsBorrowed(){
        return isBorrowed;
    }
    public  void setIsBorrowed(boolean isBorrowed){
        this.isBorrowed=isBorrowed;
    }
    public LibraryItemType getItemType(){
    
        return itemType;
    }
    public  void setItemType(LibraryItemType itemType){
        this.itemType=itemType;
    }

    public String equals() {
        if (this == null ) {
            return false;
            } else {
                return true ;

        
    }

}
}


