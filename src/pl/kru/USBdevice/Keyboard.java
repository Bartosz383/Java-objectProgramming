package pl.kru.USBdevice;

public class Keyboard implements USBDevice{
    private String name;

    public Keyboard(String name) {this.name = name; }

    @Override
    public boolean connect() {
        System.out.println("Keyboard disconnected");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Keyboard disconnected");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
