package treasurehunt.announcements;

public class Announcement {
    private String message;
    public Announcement(String message){
        this.message = message;
    }

    public void broadcast(){

    }

    public String getMessage(){
        return this.message;
    }
}
