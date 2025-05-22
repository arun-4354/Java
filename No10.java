package nrec;

class DeviceFailureException extends Exception {
    public DeviceFailureException(String message) {
        super(message);
    }
}

public class No10{

    public void use(String deviceName) throws DeviceFailureException {
        if (deviceName.equalsIgnoreCase("printer1") || deviceName.equalsIgnoreCase("printer3")) {
            System.out.println("Available");
        } else {
            throw new DeviceFailureException("Device failure: Not Available");
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("No device name provided.");
            }

            String deviceName = args[0];
            No10 device = new No10();
            device.use(deviceName);

        } catch (DeviceFailureException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
