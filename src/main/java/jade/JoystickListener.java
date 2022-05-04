package jade;

// TODO: Finish this to work with controllers

public class JoystickListener {

    private static JoystickListener instance;

    private JoystickListener() {

    }

    private static JoystickListener get() {
        if (JoystickListener.instance == null) {
            JoystickListener.instance = new JoystickListener();
        }

        return JoystickListener.instance;
    }


}
