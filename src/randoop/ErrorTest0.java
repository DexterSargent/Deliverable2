import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = client0.cancelBooking();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = client0.checkIn();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = client0.checkIn();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = client0.cancelBooking();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ParkingSystem.Booking booking1 = client0.getBookingDetails();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getUsername();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = client0.cancelBooking();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        client0.setClientInfo("Jane", "", "pass", "pass", "pass", "hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = client0.editBooking("", (int) ' ');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        java.lang.String str2 = client0.getClientId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = client0.checkIn();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ParkingSystem.Booking booking11 = client0.getBookingDetails();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("hi!", "disabled", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        manager0.validateClient("Paid $ -1.0 with Mobile Pay");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        superManager11.validateClient("empty");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        java.lang.String str2 = client0.getClientId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = client0.cancelBooking();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry6 = superManager4.registry;
        java.lang.String str7 = superManager4.getManagerId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        superManager4.validateClient("Jane");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("hi!", "disabled", "hi!");
        java.lang.String str5 = manager0.getPassword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        manager0.displayPendingValidations();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        user0.register("", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "disabled", "pass", "Refunded total cost of $1.0");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        manager0.displayPendingValidations();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ParkingSystem.User user0 = new ParkingSystem.User();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        user0.register("staff", "Paid $ -1.0 with Mobile Pay", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "2afd610d-a8cb-413a-bbee-7927f86b526c");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        ParkingSystem.Manager manager7 = accountRegistry3.autoGenerateManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        manager7.displayPendingValidations();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Manager manager11 = accountRegistry8.autoGenerateManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        manager11.displayPendingValidations();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.PaymentManager paymentManager3 = new ParkingSystem.PaymentManager();
        java.lang.String str4 = paymentManager3.refundMessage;
        boolean boolean6 = paymentManager3.refundTotalCost((-1.0d));
        paymentManager3.refundMessage = "disabled";
        boolean boolean13 = paymentManager3.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        boolean boolean16 = paymentManager3.refundWithoutDeposit(165.0d, 10.0d);
        user0.user = boolean16;
        java.lang.Object obj18 = user0.user;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj21 = user0.login("empty", "Card number should be 16 digits");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        user0.register("pass", "staff", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        superManager4.displayPendingValidations();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.PaymentManager paymentManager3 = new ParkingSystem.PaymentManager();
        java.lang.String str4 = paymentManager3.refundMessage;
        boolean boolean6 = paymentManager3.refundTotalCost((-1.0d));
        paymentManager3.refundMessage = "disabled";
        boolean boolean13 = paymentManager3.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        boolean boolean16 = paymentManager3.refundWithoutDeposit(165.0d, 10.0d);
        user0.user = boolean16;
        java.lang.Object obj18 = user0.user;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        user0.register("Paid $ 100.0 with Mobile Pay", "ST001", "", "Refunded without deposit ($0.0)", "ST001");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.PaymentManager paymentManager3 = new ParkingSystem.PaymentManager();
        java.lang.String str4 = paymentManager3.refundMessage;
        boolean boolean6 = paymentManager3.refundTotalCost((-1.0d));
        paymentManager3.refundMessage = "disabled";
        boolean boolean13 = paymentManager3.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        boolean boolean16 = paymentManager3.refundWithoutDeposit(165.0d, 10.0d);
        user0.user = boolean16;
        ParkingSystem.CSVManager cSVManager18 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList20 = cSVManager18.readCSV("");
        user0.user = strArrayList20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj24 = user0.login("Refunded without deposit ($-42.0)", "Refunded without deposit ($-42.0)");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        superManager4.displayPendingValidations();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade1.checkIn("");
        ParkingSystem.BookingManager bookingManager4 = parkingSpaceFacade1.getBookingManager();
        parkingSpaceFacade1.toggleLot("Paid $ -1.0 with Mobile Pay", false);
        user0.user = "Paid $ -1.0 with Mobile Pay";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        user0.register("Paid $ 10.0 with Mobile Pay", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "Refunded without deposit ($-42.0)", "Paid $ 0.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade1.checkIn("");
        ParkingSystem.BookingManager bookingManager4 = parkingSpaceFacade1.getBookingManager();
        parkingSpaceFacade1.toggleLot("Paid $ -1.0 with Mobile Pay", false);
        user0.user = "Paid $ -1.0 with Mobile Pay";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj11 = user0.login("", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        user0.register("2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "Paid $ 0.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", "Refunded total cost of $1.0");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.PaymentManager paymentManager3 = new ParkingSystem.PaymentManager();
        java.lang.String str4 = paymentManager3.refundMessage;
        boolean boolean6 = paymentManager3.refundTotalCost((-1.0d));
        paymentManager3.refundMessage = "disabled";
        boolean boolean13 = paymentManager3.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        boolean boolean16 = paymentManager3.refundWithoutDeposit(165.0d, 10.0d);
        user0.user = boolean16;
        java.lang.Object obj18 = user0.user;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj21 = user0.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Refunded without deposit ($0.0)");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        java.lang.String str2 = client0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = client0.extendBooking((int) '4');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.PaymentManager paymentManager3 = new ParkingSystem.PaymentManager();
        java.lang.String str4 = paymentManager3.refundMessage;
        boolean boolean6 = paymentManager3.refundTotalCost((-1.0d));
        paymentManager3.refundMessage = "disabled";
        boolean boolean13 = paymentManager3.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        boolean boolean16 = paymentManager3.refundWithoutDeposit(165.0d, 10.0d);
        user0.user = boolean16;
        java.lang.Object obj18 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = user0.parkingProxy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        user0.register("", "Paid $ -1.0 with Mobile Pay", "hi!", "Paid $ 0.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.Manager manager5 = superManager4.autoGenerateManager();
        java.lang.String str6 = superManager4.getPassword();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.registry;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        superManager4.validateClient("hi!");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Manager manager11 = superManager4.autoGenerateManager();
        superManager4.setManagerInfo("Paid $ 100.0 with Mobile Pay", "disabled", "staff");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        superManager4.validateClient("ST001");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.PaymentManager paymentManager3 = new ParkingSystem.PaymentManager();
        java.lang.String str4 = paymentManager3.refundMessage;
        boolean boolean6 = paymentManager3.refundTotalCost((-1.0d));
        paymentManager3.refundMessage = "disabled";
        boolean boolean13 = paymentManager3.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        boolean boolean16 = paymentManager3.refundWithoutDeposit(165.0d, 10.0d);
        user0.user = boolean16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj20 = user0.login("CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", "disabled");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = user0.parkingProxy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj4 = user0.login("0b35479f-5869-423e-9abc-e4ab9cef903d", "empty");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade1.checkIn("");
        ParkingSystem.BookingManager bookingManager4 = parkingSpaceFacade1.getBookingManager();
        parkingSpaceFacade1.toggleLot("Paid $ -1.0 with Mobile Pay", false);
        user0.user = "Paid $ -1.0 with Mobile Pay";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        user0.register("CLT-23b57c8a-84c7-41fe-9781-bfe8a8f3fc04", "Refunded total cost of $0.0", "25527a32-01ef-45ba-816a-1d0a2fc2a52d", "FNuxCiXmkP", "CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.Manager manager8 = superManager4.autoGenerateManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        superManager4.displayPendingValidations();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = user0.parkingProxy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj4 = user0.login("CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", "hi!");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.PaymentManager paymentManager3 = new ParkingSystem.PaymentManager();
        java.lang.String str4 = paymentManager3.refundMessage;
        boolean boolean6 = paymentManager3.refundTotalCost((-1.0d));
        paymentManager3.refundMessage = "disabled";
        boolean boolean13 = paymentManager3.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        boolean boolean16 = paymentManager3.refundWithoutDeposit(165.0d, 10.0d);
        user0.user = boolean16;
        ParkingSystem.CSVManager cSVManager18 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList20 = cSVManager18.readCSV("");
        user0.user = strArrayList20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj24 = user0.login("CLT-390234b0-d56e-4275-bd7b-122280609c69", "Refunded without deposit ($-15.0)");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        java.lang.String str13 = client0.getPassword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = client0.checkIn();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = user0.login("2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-035180a0-4707-410d-a011-2a4f0f46838b");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
        java.lang.String str7 = parkingSpaceProxy3.scanSpace("empty", "hi!");
        boolean boolean17 = parkingSpaceProxy3.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy3.autoGenerateManager();
        user0.user = parkingSpaceProxy3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        user0.register("Refunded without deposit ($-68.0)", "cf448544-0e6d-4a41-94c2-e67f848ae8df", "K6PkM9rcCx", "ua4ppOLtSl", "Refunded without deposit ($1.0)");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.PaymentManager paymentManager3 = new ParkingSystem.PaymentManager();
        java.lang.String str4 = paymentManager3.refundMessage;
        boolean boolean6 = paymentManager3.refundTotalCost((-1.0d));
        paymentManager3.refundMessage = "disabled";
        boolean boolean13 = paymentManager3.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        boolean boolean16 = paymentManager3.refundWithoutDeposit(165.0d, 10.0d);
        user0.user = boolean16;
        ParkingSystem.CSVManager cSVManager18 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList20 = cSVManager18.readCSV("");
        user0.user = strArrayList20;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = user0.parkingProxy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj25 = user0.login("62c76d5a-13ab-4e01-9a2c-8e91dd8f4d54", "WxoDOyjI");
    }
}

