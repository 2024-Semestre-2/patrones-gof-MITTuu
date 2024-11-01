package programa;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        Remote remote = new Remote(tv);
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);

        // Operaciones con el televisor
        System.out.println("\nEstado inicial del dispositivo:");
        System.out.println(tv);
        System.out.println("Controlando el TV:");
        remote.togglePower();
        System.out.println(tv);
        remote.volumeUp();
        System.out.println(tv);
        remote.channelUp();
        System.out.println(tv);

        // Operaciones con la radio
        System.out.println("\nEstado inicial del dispositivo:");
        System.out.println(radio);
        System.out.println("Controlando la Radio:");
        advancedRemote.togglePower();
        System.out.println(radio);
        advancedRemote.volumeDown();
        System.out.println(radio);
        advancedRemote.mute();
        System.out.println(radio);
    }
}
