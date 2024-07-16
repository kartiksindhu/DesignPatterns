package Creational.Prototype;

public class User implements Cloneable {
    private String userName;
    private String userId;

    private String importantData;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void setImportantData() throws InterruptedException {
        this.importantData = "importantData";
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
