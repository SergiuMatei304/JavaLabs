package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {
        DoorLockController doorLockController = new DoorLockController();
        try {
            doorLockController.addTenant("1111", "John");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.addTenant("0312", "Michael");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.addTenant("0312", "Michael");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.addTenant("8787", "Trevor");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.addTenant("1564", "Franklin");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.addTenant("3515", "Amanda");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.enterPin("0311");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.removeTenant("Michael");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.enterPin("0312");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.enterPin("0311");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.enterPin("0311");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.enterPin("0311");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.enterPin("0311");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.enterPin("0000");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.enterPin("8787");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.removeTenant("Michael");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            doorLockController.removeTenant("Michael");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
