package classwork.radio_alarm;

public class RadioAlarm implements Alarm, Radio {
    @Override
    public void c() {
        System.out.println("Method C");
    }
    @Override
    public void d() {
        System.out.println("Method D");
    }
    @Override
    public void a() {
        System.out.println("Method A");
    }
    @Override
    public void b() {
        System.out.println("Method B");
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.b();
        radioAlarm.c();
        radioAlarm.d();
    }
}
