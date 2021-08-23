package classwork.radio_alarm;

import lombok.Delegate;
import lombok.Setter;

@Setter
public class RadioAlarm implements Alarm, Radio {
    @Delegate
    private Radio radio = new RadioImpl();
    @Delegate
    private Alarm alarm = new AlarmImpl();

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.radioA();
        radioAlarm.radioB();
        radioAlarm.alarmC();
        radioAlarm.alarmD();
    }
}
