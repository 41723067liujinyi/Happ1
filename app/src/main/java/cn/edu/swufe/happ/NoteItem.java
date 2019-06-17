package cn.edu.swufe.happ;

public class NoteItem {
    private int id;
    private String curNote;

//    private String curName;
//    private String curRate;

    public NoteItem() {
        //super();
//        this.curName = "";
//        this.curRate = "";

        this.curNote = "";
    }

    public NoteItem(String curNote) {
//        this.curName = curName;
//        this.curRate = curRate;

        this.curNote = curNote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurNote() {
        return curNote;
    }

    public void setCurNote(String curNote) {
        this.curNote = curNote;
    }
//
//    public String getCurName() {
//        return curName;
//    }
//
//    public void setCurName(String curName) {
//        this.curName = curName;
//    }
//
//    public String getCurRate() {
//        return curRate;
//    }
//
//    public void setCurRate(String curRate) {
//        this.curRate = curRate;
//    }


}
