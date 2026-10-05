package Lesson10;

public class EncapsulationClass {

    private String title;
    private int pageCount;

    public EncapsulationClass(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

 /*   public String titleAccessor() {
        return this.title;
    }

    public void titleMutator (String newTitle) {
        this.title = newTitle;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

  /*  public int pageAccessor() {
        return this.pageCount;
    }

    public void pageMutator (int newPage) {
        this.pageCount = newPage;
    }*/

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
