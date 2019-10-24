package testrestassured;

public class Update {

    private String name;
    private String job;


    public Update(String name, String job) {
        this.name = name;
        this.job = job;
    }


    public Update(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
