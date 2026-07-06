package Library2;

public class Magazine extends LibraryItem{
    private long issuesNo;

    public Magazine(long issuesNo){
        this.issuesNo=issuesNo;
    }

    public long getIssuesNo() {
        return issuesNo;
    }

    public void setIssuesNo(long issuesNo) {
        this.issuesNo = issuesNo;
    }
}
