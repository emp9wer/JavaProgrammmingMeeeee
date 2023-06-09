package week12.morning.app;

public class App {

private String name;
private double version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }


    public App(String name, double version) {
        setName(name);
        setVersion(version);
    }


    public void download(){
        System.out.println("app is downloaded");
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
