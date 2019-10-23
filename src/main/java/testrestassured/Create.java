package testrestassured;

public class Create {

    private String name;
    private String job;


    public Create(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Create(String name) {
        this.name = name;
    }

    public Create() {

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
