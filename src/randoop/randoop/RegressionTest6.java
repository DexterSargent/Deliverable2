package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        boolean boolean9 = bookingManager0.editBooking("hi!", "ST001", (int) ' ');
        boolean boolean14 = bookingManager0.extendBooking("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", 32, "CLT-035180a0-4707-410d-a011-2a4f0f46838b", "");
        double double16 = bookingManager0.getHourlyRate("H33Itw4InT");
        ParkingSystem.Booking booking18 = bookingManager0.getBooking("8812812f-8c58-440e-9188-ca0b1f996ced");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertNull(booking18);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.Client client3 = ParkingSystem.Client.getInstance();
        java.lang.String str4 = client3.getName();
        client3.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy7 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry8 = parkingSpaceProxy7.getRegistry();
        boolean boolean10 = parkingSpaceProxy7.checkIn("");
        client3.assignProxy(parkingSpaceProxy7);
        boolean boolean12 = client3.cancelBooking();
        java.lang.String str13 = client3.getExtraId();
        java.lang.String str14 = client3.getName();
        client3.setClientInfo("pass", "empty", "Jane", "pass", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", false);
        cSVManager0.saveClient(client3);
        ParkingSystem.Client client24 = ParkingSystem.Client.getInstance();
        java.lang.String str25 = client24.getName();
        client24.setValidated(true);
        ParkingSystem.Booking booking28 = client24.getBookingDetails();
        java.lang.String str29 = client24.getUsername();
        java.lang.String str30 = client24.getUsername();
        ParkingSystem.Booking booking31 = client24.getBookingDetails();
        cSVManager0.saveClient(client24);
        ParkingSystem.Client client33 = ParkingSystem.Client.getInstance();
        java.lang.String str34 = client33.getName();
        client33.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str43 = client33.getUsername();
        java.lang.String str44 = client33.getPassword();
        java.lang.String str45 = client33.getUsername();
        boolean boolean46 = client33.checkIn();
        client33.setClientInfo("staff", "2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Paid $ 100.0 with Mobile Pay", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", true);
        boolean boolean55 = client33.cancelBooking();
        java.lang.String str56 = client33.getPassword();
        cSVManager0.saveClient(client33);
        ParkingSystem.SpaceManager spaceManager58 = new ParkingSystem.SpaceManager();
        spaceManager58.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str64 = spaceManager58.scanSpace("hi!", "disabled");
        spaceManager58.removeBooking("Refunded without deposit ($-42.0)", (int) ' ');
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap68 = spaceManager58.getParkingLots();
        cSVManager0.loadParkingLots(strMap68);
        org.junit.Assert.assertNotNull(strArray1);
// flaky "1) test3002(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "1) test3002(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client3);
// flaky "1) test3002(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "qMzKSKOI" + "'", str4, "qMzKSKOI");
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "1) test3002(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Refunded without deposit ($-42.0)" + "'", str13, "Refunded without deposit ($-42.0)");
// flaky "1) test3002(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "qMzKSKOI" + "'", str14, "qMzKSKOI");
        org.junit.Assert.assertNotNull(client24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "empty" + "'", str25, "empty");
        org.junit.Assert.assertNull(booking28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Jane" + "'", str29, "Jane");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Jane" + "'", str30, "Jane");
        org.junit.Assert.assertNull(booking31);
        org.junit.Assert.assertNotNull(client33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "empty" + "'", str34, "empty");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "disabled" + "'", str44, "disabled");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "7aecb00c-028c-4dcf-96cc-14d25bd709ab" + "'", str56, "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "disabled" + "'", str64, "disabled");
        org.junit.Assert.assertNotNull(strMap68);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        ParkingSystem.AccountRegistry accountRegistry14 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager15 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry14);
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap16 = accountRegistry14.getManagers();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy18 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry19 = parkingSpaceProxy18.getRegistry();
        java.lang.String str22 = parkingSpaceProxy18.scanSpace("empty", "hi!");
        boolean boolean32 = parkingSpaceProxy18.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy18.toggleSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "", true);
        boolean boolean42 = parkingSpaceProxy18.register("jane", "Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($0.0)", "disabled", "Refunded total cost of $1.0");
        accountRegistry14.assignProxyToManager("7aecb00c-028c-4dcf-96cc-14d25bd709ab", parkingSpaceProxy18);
        accountRegistry6.assignProxyToManager("CLT-30fd593b-dedd-41b3-a919-c48700301f41", parkingSpaceProxy18);
        ParkingSystem.SuperManager superManager45 = ParkingSystem.SuperManager.createFromCSV("hi!", "hi!", "pass", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry49 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager50 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry49);
        java.lang.String str51 = superManager50.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry52 = superManager50.registry;
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap53 = accountRegistry52.getManagers();
        ParkingSystem.Client client55 = ParkingSystem.Client.getInstance();
        java.lang.String str56 = client55.getName();
        client55.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str65 = client55.getUsername();
        java.lang.String str66 = client55.getPassword();
        java.lang.String str67 = client55.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy68 = null;
        client55.assignProxy(parkingSpaceProxy68);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy70 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj73 = parkingSpaceProxy70.login("empty", "Jane");
        client55.assignProxy(parkingSpaceProxy70);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy75 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking77 = parkingSpaceProxy75.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry78 = parkingSpaceProxy75.getRegistry();
        parkingSpaceProxy75.autoGenerateManager();
        client55.assignProxy(parkingSpaceProxy75);
        boolean boolean84 = parkingSpaceProxy75.editBooking("13b04414-31a5-407f-8ea3-fba4613c73d1", "Refunded total cost of $100.0", (int) (byte) 0);
        accountRegistry52.assignProxyToManager("Paid $ 100.0 with Mobile Pay", parkingSpaceProxy75);
        superManager45.registry = accountRegistry52;
        java.util.List<ParkingSystem.Client> clientList87 = accountRegistry52.displayPendingValidations();
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "disabled" + "'", str22, "disabled");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(superManager45);
        org.junit.Assert.assertNotNull(superManager50);
// flaky "2) test3003(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str51, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(accountRegistry52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(client55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "jane" + "'", str56, "jane");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "disabled" + "'", str66, "disabled");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(booking77);
        org.junit.Assert.assertNotNull(accountRegistry78);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(clientList87);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str3 = parkingSpaceFacade0.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleSpace("Refunded total cost of $-1.0", "disabled", true);
        ParkingSystem.Booking booking10 = parkingSpaceFacade0.getBookingDetails("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNull(booking10);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = null;
        accountRegistry3.assignProxyToManager("disabled", parkingSpaceProxy6);
        boolean boolean9 = accountRegistry3.requiresValidation("disabled");
        boolean boolean11 = accountRegistry3.requiresValidation("Paid $ 10.0 with Mobile Pay");
        java.lang.Object obj14 = accountRegistry3.login("", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        boolean boolean16 = accountRegistry3.requiresValidation("Refunded total cost of $100.0");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = parkingSpaceProxy0.getFacade();
        ParkingSystem.Booking booking3 = parkingSpaceFacade1.getBookingDetails("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        ParkingSystem.BookingManager bookingManager4 = parkingSpaceFacade1.getBookingManager();
        double double6 = bookingManager4.getDeposit("Refunded total cost of $100.0");
        org.junit.Assert.assertNotNull(parkingSpaceFacade1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(bookingManager4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        boolean boolean13 = accountRegistry6.requiresValidation("CLT-035180a0-4707-410d-a011-2a4f0f46838b");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking17 = parkingSpaceProxy15.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry18 = parkingSpaceProxy15.getRegistry();
        parkingSpaceProxy15.autoGenerateManager();
        parkingSpaceProxy15.toggleSpace("staff", "Jane", false);
        parkingSpaceProxy15.displayPendingValidations();
        accountRegistry6.assignProxyToClient("8ca2ec61-774c-409d-89d5-5b9171b40497", parkingSpaceProxy15);
        int int26 = accountRegistry6.getManagersSize();
        java.lang.Object obj29 = accountRegistry6.login("CLT-b6a8264c-f386-4429-b59c-b7f465002e13", "FNuxCiXmkP");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(booking17);
        org.junit.Assert.assertNotNull(accountRegistry18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry18 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry18);
        java.lang.String str20 = superManager19.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry24 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager25 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry24);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = null;
        accountRegistry24.assignProxyToManager("disabled", parkingSpaceProxy27);
        superManager19.registry = accountRegistry24;
        superManager4.registry = accountRegistry24;
        java.util.List<ParkingSystem.Client> clientList31 = accountRegistry24.displayPendingValidations();
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap32 = accountRegistry24.getManagers();
        boolean boolean34 = accountRegistry24.requiresValidation("H33Itw4InT");
        java.lang.Object obj37 = accountRegistry24.login("CLT-2d7011d7-cb71-4953-84cc-0d7adf2da0d4", "CLT-be0c8baf-d002-4bd3-a0a4-b45542b3f61e");
        org.junit.Assert.assertNotNull(superManager4);
// flaky "3) test3008(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str5, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager19);
// flaky "2) test3008(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str20, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(clientList31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        java.lang.String str9 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry10 = superManager4.registry;
        java.lang.String str11 = superManager4.getName();
        org.junit.Assert.assertNotNull(superManager4);
// flaky "4) test3009(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str5, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
// flaky "3) test3009(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str6, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
// flaky "2) test3009(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str9, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(accountRegistry10);
// flaky "2) test3009(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CLT-22138484-eb59-490e-9c41-9fd9c319dcda" + "'", str11, "CLT-22138484-eb59-490e-9c41-9fd9c319dcda");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap18 = bookingManager0.getActiveBookings();
        ParkingSystem.SpaceManager spaceManager19 = bookingManager0.getSpaceManager();
        spaceManager19.addParkingLot("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap22 = spaceManager19.getParkingLots();
        spaceManager19.addParkingLot("ST001");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(spaceManager19);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        boolean boolean8 = parkingLotIterator7.hasNext();
        ParkingSystem.ParkingSpace parkingSpace9 = parkingLotIterator7.next();
        ParkingSystem.ParkingLot parkingLot11 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking13 = null;
        boolean boolean14 = parkingLot11.assignBooking(0, booking13);
        boolean boolean16 = parkingLot11.isSpaceAvailable((int) '#');
        boolean boolean18 = parkingLot11.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace20 = parkingLot11.getParkingSpace((int) (byte) 10);
        int int21 = parkingSpace20.getSpaceId();
        ParkingSystem.Booking booking22 = parkingSpace20.getCurrentBooking();
        java.lang.String str23 = parkingSpace20.scanSpace();
        ParkingSystem.Enabled enabled24 = new ParkingSystem.Enabled();
        parkingSpace20.setState((ParkingSystem.SpaceState) enabled24);
        parkingSpace9.setState((ParkingSystem.SpaceState) enabled24);
        ParkingSystem.Disabled disabled27 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace28 = null;
        java.lang.String str29 = disabled27.scanSpace(parkingSpace28);
        ParkingSystem.ParkingSpace parkingSpace30 = null;
        java.lang.String str31 = disabled27.scanSpace(parkingSpace30);
        ParkingSystem.ParkingLot parkingLot33 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking35 = null;
        boolean boolean36 = parkingLot33.assignBooking(0, booking35);
        boolean boolean38 = parkingLot33.isSpaceAvailable((int) '#');
        boolean boolean40 = parkingLot33.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace42 = parkingLot33.getParkingSpace((int) (byte) 10);
        int int43 = parkingSpace42.getSpaceId();
        ParkingSystem.Booking booking44 = parkingSpace42.getCurrentBooking();
        java.lang.String str45 = parkingSpace42.scanSpace();
        ParkingSystem.Enabled enabled46 = new ParkingSystem.Enabled();
        parkingSpace42.setState((ParkingSystem.SpaceState) enabled46);
        java.lang.String str48 = disabled27.scanSpace(parkingSpace42);
        parkingSpace9.setState((ParkingSystem.SpaceState) disabled27);
        ParkingSystem.Disabled disabled50 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingLot parkingLot52 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking54 = null;
        boolean boolean55 = parkingLot52.assignBooking(0, booking54);
        boolean boolean57 = parkingLot52.isSpaceAvailable((int) '#');
        boolean boolean59 = parkingLot52.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace61 = parkingLot52.getParkingSpace((int) (byte) 10);
        int int62 = parkingSpace61.getSpaceId();
        ParkingSystem.Booking booking63 = parkingSpace61.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager64 = new ParkingSystem.SpaceManager();
        boolean boolean67 = spaceManager64.isSpaceAvailable("hi!", (int) '#');
        spaceManager64.toggleLot("disabled", false);
        ParkingSystem.Booking booking80 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean81 = spaceManager64.assignBooking("empty", (int) (short) 0, booking80);
        boolean boolean82 = parkingSpace61.assignBooking(booking80);
        java.lang.String str83 = disabled50.scanSpace(parkingSpace61);
        java.lang.String str84 = disabled27.scanSpace(parkingSpace61);
        ParkingSystem.ParkingLot parkingLot86 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking88 = null;
        boolean boolean89 = parkingLot86.assignBooking(0, booking88);
        boolean boolean91 = parkingLot86.isSpaceAvailable((int) '#');
        boolean boolean93 = parkingLot86.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace95 = parkingLot86.getParkingSpace((int) (byte) 10);
        int int96 = parkingSpace95.getSpaceId();
        parkingSpace95.removeBooking();
        java.lang.String str98 = disabled27.scanSpace(parkingSpace95);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(booking22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "empty" + "'", str23, "empty");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "disabled" + "'", str29, "disabled");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "disabled" + "'", str31, "disabled");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNull(booking44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "empty" + "'", str45, "empty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "disabled" + "'", str48, "disabled");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(parkingSpace61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNull(booking63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "disabled" + "'", str83, "disabled");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "disabled" + "'", str84, "disabled");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(parkingSpace95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 10 + "'", int96 == 10);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "disabled" + "'", str98, "disabled");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade3.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = spaceManager4.getParkingLots();
        cSVManager0.saveParkingLots(strMap5);
        ParkingSystem.SpaceManager spaceManager7 = new ParkingSystem.SpaceManager();
        boolean boolean10 = spaceManager7.isSpaceAvailable("hi!", (int) '#');
        spaceManager7.toggleLot("disabled", false);
        ParkingSystem.Booking booking23 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean24 = spaceManager7.assignBooking("empty", (int) (short) 0, booking23);
        spaceManager7.removeBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) '4');
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap28 = spaceManager7.getParkingLots();
        cSVManager0.loadParkingLots(strMap28);
        java.lang.String[] strArray30 = cSVManager0.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade31 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager32 = parkingSpaceFacade31.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap33 = spaceManager32.getParkingLots();
        cSVManager0.saveParkingLots(strMap33);
        ParkingSystem.BookingManager bookingManager35 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager36 = new ParkingSystem.CheckInManager(bookingManager35);
        ParkingSystem.SpaceManager spaceManager37 = bookingManager35.getSpaceManager();
        double double40 = bookingManager35.calculateCost("", (int) (byte) 10);
        ParkingSystem.SpaceManager spaceManager41 = bookingManager35.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap42 = spaceManager41.getParkingLots();
        cSVManager0.saveParkingLots(strMap42);
        cSVManager0.updateClientValidation("CLT-32d5cdc9-3c20-4f30-9d68-0be20fdf349c", false);
        ParkingSystem.Client client47 = ParkingSystem.Client.getInstance();
        java.lang.String str48 = client47.getClientType();
        java.lang.String str49 = client47.getUsername();
        client47.setValidated(false);
        client47.setClientInfo("staff", "Refunded total cost of $1.0", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", "Jane", "Paid $ 10.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", true);
        boolean boolean60 = client47.checkIn();
        java.lang.String str61 = client47.getPassword();
        client47.setClientInfo("CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5", "TXCrKOGD", "disabled", "Paid $ 1470.0 with Mobile Pay", "", "Paid $ 100.0 with Mobile Pay", false);
        java.lang.String str70 = client47.getClientId();
        cSVManager0.saveClient(client47);
        boolean boolean72 = client47.checkOut();
        org.junit.Assert.assertNotNull(strArray1);
// flaky "5) test3012(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "4) test3012(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strArray30);
// flaky "3) test3012(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(spaceManager37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 165.0d + "'", double40 == 165.0d);
        org.junit.Assert.assertNotNull(spaceManager41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(client47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "disabled" + "'", str48, "disabled");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Jane" + "'", str61, "Jane");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5" + "'", str70, "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        ParkingSystem.Disabled disabled0 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace1 = null;
        java.lang.String str2 = disabled0.scanSpace(parkingSpace1);
        ParkingSystem.ParkingLot parkingLot4 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking6 = null;
        boolean boolean7 = parkingLot4.assignBooking(0, booking6);
        boolean boolean9 = parkingLot4.isSpaceAvailable((int) '#');
        boolean boolean11 = parkingLot4.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace13 = parkingLot4.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking14 = parkingSpace13.getCurrentBooking();
        ParkingSystem.Disabled disabled15 = new ParkingSystem.Disabled();
        parkingSpace13.setState((ParkingSystem.SpaceState) disabled15);
        java.lang.String str17 = disabled0.scanSpace(parkingSpace13);
        ParkingSystem.ParkingLot parkingLot19 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking21 = null;
        boolean boolean22 = parkingLot19.assignBooking(0, booking21);
        boolean boolean24 = parkingLot19.isSpaceAvailable((int) '#');
        boolean boolean26 = parkingLot19.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace28 = parkingLot19.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking29 = parkingSpace28.getCurrentBooking();
        java.lang.String str30 = disabled0.scanSpace(parkingSpace28);
        ParkingSystem.ParkingLot parkingLot32 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking34 = null;
        boolean boolean35 = parkingLot32.assignBooking(0, booking34);
        boolean boolean37 = parkingLot32.isSpaceAvailable((int) '#');
        boolean boolean39 = parkingLot32.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace41 = parkingLot32.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking42 = parkingSpace41.getCurrentBooking();
        parkingSpace41.removeBooking();
        ParkingSystem.Booking booking44 = parkingSpace41.getCurrentBooking();
        parkingSpace41.removeBooking();
        java.lang.String str46 = disabled0.scanSpace(parkingSpace41);
        ParkingSystem.ParkingSpace parkingSpace47 = null;
        java.lang.String str48 = disabled0.scanSpace(parkingSpace47);
        ParkingSystem.ParkingLot parkingLot50 = new ParkingSystem.ParkingLot("");
        parkingLot50.setEnabled(true);
        ParkingSystem.ParkingSpace parkingSpace54 = parkingLot50.getParkingSpace((int) (byte) -1);
        java.lang.String str55 = disabled0.scanSpace(parkingSpace54);
        ParkingSystem.ParkingLot parkingLot57 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking59 = null;
        boolean boolean60 = parkingLot57.assignBooking(0, booking59);
        boolean boolean62 = parkingLot57.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator63 = parkingLot57.getIterator();
        boolean boolean64 = parkingLotIterator63.hasNext();
        ParkingSystem.ParkingSpace parkingSpace65 = parkingLotIterator63.next();
        ParkingSystem.ParkingLot parkingLot67 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking69 = null;
        boolean boolean70 = parkingLot67.assignBooking(0, booking69);
        boolean boolean72 = parkingLot67.isSpaceAvailable((int) '#');
        boolean boolean74 = parkingLot67.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace76 = parkingLot67.getParkingSpace((int) (byte) 10);
        int int77 = parkingSpace76.getSpaceId();
        ParkingSystem.Booking booking78 = parkingSpace76.getCurrentBooking();
        java.lang.String str79 = parkingSpace76.scanSpace();
        ParkingSystem.Enabled enabled80 = new ParkingSystem.Enabled();
        parkingSpace76.setState((ParkingSystem.SpaceState) enabled80);
        parkingSpace65.setState((ParkingSystem.SpaceState) enabled80);
        ParkingSystem.ParkingLot parkingLot84 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator85 = parkingLot84.getIterator();
        ParkingSystem.Booking booking87 = null;
        boolean boolean88 = parkingLot84.assignBooking((int) (short) 1, booking87);
        ParkingSystem.ParkingSpace parkingSpace90 = parkingLot84.getParkingSpace((int) ' ');
        java.lang.String str91 = enabled80.scanSpace(parkingSpace90);
        int int92 = parkingSpace90.getSpaceId();
        ParkingSystem.Booking booking93 = parkingSpace90.getCurrentBooking();
        java.lang.String str94 = disabled0.scanSpace(parkingSpace90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "disabled" + "'", str2, "disabled");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disabled" + "'", str17, "disabled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertNull(booking29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "disabled" + "'", str30, "disabled");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertNull(booking42);
        org.junit.Assert.assertNull(booking44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "disabled" + "'", str46, "disabled");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "disabled" + "'", str48, "disabled");
        org.junit.Assert.assertNotNull(parkingSpace54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "disabled" + "'", str55, "disabled");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(parkingSpace65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(parkingSpace76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertNull(booking78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "empty" + "'", str79, "empty");
        org.junit.Assert.assertNotNull(parkingLotIterator85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(parkingSpace90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "empty" + "'", str91, "empty");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 32 + "'", int92 == 32);
        org.junit.Assert.assertNull(booking93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "disabled" + "'", str94, "disabled");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        java.lang.String str8 = superManager7.getManagerId();
        java.lang.String str9 = superManager7.getManagerId();
        ParkingSystem.Manager manager10 = superManager7.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry11 = superManager7.registry;
        java.lang.String str12 = superManager7.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry13 = superManager7.registry;
        ParkingSystem.SuperManager superManager14 = ParkingSystem.SuperManager.createFromCSV("CLT-b6a8264c-f386-4429-b59c-b7f465002e13", "Paid $ 1470.0 with Mobile Pay", "Refunded total cost of $-1.0", accountRegistry13);
        java.lang.Object obj17 = accountRegistry13.login("", "WxoDOyjI");
        org.junit.Assert.assertNotNull(superManager7);
// flaky "6) test3014(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str8, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
// flaky "5) test3014(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str9, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(manager10);
        org.junit.Assert.assertNotNull(accountRegistry11);
// flaky "4) test3014(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str12, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(accountRegistry13);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        java.lang.Object obj19 = user0.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "staff");
        java.lang.Object obj22 = user0.login("CLT-93b11069-2e34-4ef4-bf17-b3bb8758882b", "Refunded without deposit ($-96.0)");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy23 = user0.parkingProxy;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade24 = parkingSpaceProxy23.getFacade();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TXCrKOGD" + "'", str6, "TXCrKOGD");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(parkingSpaceProxy23);
        org.junit.Assert.assertNotNull(parkingSpaceFacade24);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        java.lang.String str2 = client0.getClientId();
        java.lang.String str3 = client0.getClientType();
        java.lang.String str4 = client0.getPassword();
        boolean boolean5 = client0.cancelBooking();
        java.lang.String str6 = client0.getClientId();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "disabled" + "'", str1, "disabled");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5" + "'", str2, "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Paid $ 1470.0 with Mobile Pay" + "'", str4, "Paid $ 1470.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5" + "'", str6, "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        java.lang.Object obj4 = accountRegistry1.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        boolean boolean6 = accountRegistry1.requiresValidation("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        java.lang.Object obj9 = accountRegistry1.login("86z9Z9e0MN", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        ParkingSystem.AccountRegistry accountRegistry14 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager15 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry14);
        java.lang.String str16 = superManager15.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry17 = superManager15.registry;
        java.lang.String str18 = superManager15.getManagerId();
        ParkingSystem.Client client19 = ParkingSystem.Client.getInstance();
        java.lang.String str20 = client19.getName();
        client19.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy23 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry24 = parkingSpaceProxy23.getRegistry();
        boolean boolean26 = parkingSpaceProxy23.checkIn("");
        client19.assignProxy(parkingSpaceProxy23);
        boolean boolean28 = client19.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy29 = new ParkingSystem.ParkingSpaceProxy();
        client19.assignProxy(parkingSpaceProxy29);
        superManager15.assignProxy(parkingSpaceProxy29);
        boolean boolean33 = parkingSpaceProxy29.checkIn("CLT-45a3d895-9bc3-45d3-9068-d4559eae3183");
        accountRegistry1.assignProxyToManager("CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", parkingSpaceProxy29);
        parkingSpaceProxy29.addParkingLot("CLT-d2153556-bc61-49e7-b73d-6af2a45e5167");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(superManager15);
// flaky "7) test3017(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str16, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(accountRegistry17);
// flaky "6) test3017(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str18, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(client19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "TXCrKOGD" + "'", str20, "TXCrKOGD");
        org.junit.Assert.assertNotNull(accountRegistry24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        java.lang.String str7 = parkingSpaceFacade0.scanSpace("jane", "Refunded without deposit ($0.0)");
        java.lang.String str10 = parkingSpaceFacade0.scanSpace("Jane", "");
        ParkingSystem.Booking booking12 = parkingSpaceFacade0.getBookingDetails("Refunded without deposit ($0.0)");
        ParkingSystem.SpaceManager spaceManager13 = parkingSpaceFacade0.getSpaceManager();
        boolean boolean15 = parkingSpaceFacade0.checkOut("disabled");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disabled" + "'", str7, "disabled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertNotNull(spaceManager13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        manager7.setManagerInfo("pass", "", "staff");
        java.lang.String str12 = manager7.getName();
        java.lang.String str13 = manager7.getPassword();
// flaky "8) test3019(RegressionTest6)":         manager7.validateClient("09622cbf-e665-45db-b1ad-365065947a20");
        org.junit.Assert.assertNotNull(superManager4);
// flaky "7) test3019(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str5, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
// flaky "5) test3019(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str6, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        boolean boolean2 = parkingSpaceProxy0.cancelBooking("pass");
        parkingSpaceProxy0.addParkingLot("pass");
        boolean boolean6 = parkingSpaceProxy0.checkIn("Paid $ 100.0 with Mobile Pay");
        boolean boolean12 = parkingSpaceProxy0.register("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Refunded without deposit ($-42.0)", "Paid $ 0.0 with Mobile Pay", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "disabled");
        ParkingSystem.AccountRegistry accountRegistry13 = parkingSpaceProxy0.getRegistry();
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap14 = accountRegistry13.getManagers();
        java.util.List<ParkingSystem.Client> clientList15 = accountRegistry13.displayPendingValidations();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy17 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj20 = parkingSpaceProxy17.login("empty", "Jane");
        parkingSpaceProxy17.validateClient("Jane");
        parkingSpaceProxy17.toggleSpace("", "staff", false);
        boolean boolean28 = parkingSpaceProxy17.cancelBooking("");
        java.lang.String str31 = parkingSpaceProxy17.scanSpace("staff", "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        boolean boolean34 = parkingSpaceProxy17.extendBooking("jane", (int) ' ');
        boolean boolean36 = parkingSpaceProxy17.checkIn("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        boolean boolean38 = parkingSpaceProxy17.checkOut("Refunded without deposit ($-42.0)");
        accountRegistry13.assignProxyToClient("Refunded total cost of $1.0", parkingSpaceProxy17);
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry13.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(accountRegistry13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(clientList15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "disabled" + "'", str31, "disabled");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry12 = superManager11.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry15 = parkingSpaceProxy14.getRegistry();
        boolean boolean21 = parkingSpaceProxy14.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean25 = parkingSpaceProxy14.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean35 = parkingSpaceProxy14.confirmBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff", "disabled", (int) (short) 0, "Paid $ 100.0 with Mobile Pay", (int) (short) 10, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        accountRegistry12.assignProxyToManager("empty", parkingSpaceProxy14);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy38 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade39 = parkingSpaceProxy38.getFacade();
        accountRegistry12.assignProxyToManager("", parkingSpaceProxy38);
        parkingSpaceProxy38.addParkingLot("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        boolean boolean44 = parkingSpaceProxy38.cancelBooking("Paid $ 0.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry45 = parkingSpaceProxy38.getRegistry();
        accountRegistry45.validateClient("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        accountRegistry45.validateClient("Refunded without deposit ($0.0)");
        boolean boolean55 = accountRegistry45.registerClient("Refunded without deposit ($-42.0)", "fhd49ADb", "12fea0ad-7859-47d9-95f1-1985d2c4ed33", "kYN6YZxC3k", "848f508e-e1d2-4f02-9fc9-e95eee425d36");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(accountRegistry45);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        boolean boolean26 = bookingManager0.confirmBooking("empty", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Refunded total cost of $1.0", (int) (byte) 1, "Card number should be 16 digits", 32, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "disabled");
        ParkingSystem.BookingManager bookingManager27 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager28 = new ParkingSystem.CheckInManager(bookingManager27);
        ParkingSystem.SpaceManager spaceManager29 = bookingManager27.getSpaceManager();
        double double32 = bookingManager27.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit33 = new ParkingSystem.DebitOrCredit();
        bookingManager27.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit33);
        boolean boolean39 = debitOrCredit33.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str40 = debitOrCredit33.getPaymentMessage();
        boolean boolean43 = debitOrCredit33.validateCard("pass", (double) 100.0f);
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit33);
        double double46 = bookingManager0.getHourlyRate("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        ParkingSystem.SpaceManager spaceManager47 = bookingManager0.getSpaceManager();
        ParkingSystem.SpaceManager spaceManager48 = bookingManager0.getSpaceManager();
        boolean boolean51 = spaceManager48.isSpaceAvailable("Refunded without deposit ($-15.0)", (int) ' ');
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(spaceManager29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 165.0d + "'", double32 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Card number should be 16 digits" + "'", str40, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 15.0d + "'", double46 == 15.0d);
        org.junit.Assert.assertNotNull(spaceManager47);
        org.junit.Assert.assertNotNull(spaceManager48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap5 = accountRegistry3.getManagers();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy7 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry8 = parkingSpaceProxy7.getRegistry();
        java.lang.String str11 = parkingSpaceProxy7.scanSpace("empty", "hi!");
        boolean boolean21 = parkingSpaceProxy7.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy7.toggleSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "", true);
        boolean boolean31 = parkingSpaceProxy7.register("jane", "Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($0.0)", "disabled", "Refunded total cost of $1.0");
        accountRegistry3.assignProxyToManager("7aecb00c-028c-4dcf-96cc-14d25bd709ab", parkingSpaceProxy7);
        ParkingSystem.User user34 = new ParkingSystem.User();
        java.lang.Object obj35 = user34.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy36 = user34.parkingProxy;
        ParkingSystem.User user37 = new ParkingSystem.User();
        java.lang.Object obj38 = user37.user;
        ParkingSystem.Client client39 = ParkingSystem.Client.getInstance();
        java.lang.String str40 = client39.getName();
        client39.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy43 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry44 = parkingSpaceProxy43.getRegistry();
        boolean boolean46 = parkingSpaceProxy43.checkIn("");
        client39.assignProxy(parkingSpaceProxy43);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade48 = parkingSpaceProxy43.getFacade();
        user37.assignProxy(parkingSpaceProxy43);
        user34.parkingProxy = parkingSpaceProxy43;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade51 = parkingSpaceProxy43.getFacade();
        boolean boolean55 = parkingSpaceProxy43.editBooking("empty", "Refunded without deposit ($0.0)", 100);
        parkingSpaceProxy43.autoGenerateManager();
        accountRegistry3.assignProxyToClient("qPYDfDnbtD", parkingSpaceProxy43);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade58 = parkingSpaceProxy43.getFacade();
        parkingSpaceFacade58.toggleLot("SRiN5ev00N", true);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(parkingSpaceProxy36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(client39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "jane" + "'", str40, "jane");
        org.junit.Assert.assertNotNull(accountRegistry44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade48);
        org.junit.Assert.assertNotNull(parkingSpaceFacade51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade58);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        ParkingSystem.User user2 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.validateClient("Jane");
        parkingSpaceProxy3.toggleSpace("", "staff", false);
        boolean boolean14 = parkingSpaceProxy3.cancelBooking("");
        user2.assignProxy(parkingSpaceProxy3);
        client0.assignProxy(parkingSpaceProxy3);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy17 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry18 = parkingSpaceProxy17.getRegistry();
        boolean boolean20 = parkingSpaceProxy17.checkIn("");
        client0.assignProxy(parkingSpaceProxy17);
        java.lang.String str22 = client0.getPassword();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str1, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(accountRegistry18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Refunded without deposit ($0.0)" + "'", str22, "Refunded without deposit ($0.0)");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        java.lang.String str4 = client0.getExtraId();
        java.lang.String str5 = client0.getUsername();
        java.lang.String str6 = client0.getPassword();
        ParkingSystem.Booking booking7 = client0.getBookingDetails();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Refunded total cost of $1.0" + "'", str4, "Refunded total cost of $1.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str5, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Refunded without deposit ($0.0)" + "'", str6, "Refunded without deposit ($0.0)");
        org.junit.Assert.assertNull(booking7);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        ParkingSystem.Disabled disabled0 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingLot parkingLot2 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking4 = null;
        boolean boolean5 = parkingLot2.assignBooking(0, booking4);
        boolean boolean7 = parkingLot2.isSpaceAvailable((int) '#');
        boolean boolean9 = parkingLot2.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot2.getParkingSpace((int) (byte) 10);
        int int12 = parkingSpace11.getSpaceId();
        ParkingSystem.Booking booking13 = parkingSpace11.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager14 = new ParkingSystem.SpaceManager();
        boolean boolean17 = spaceManager14.isSpaceAvailable("hi!", (int) '#');
        spaceManager14.toggleLot("disabled", false);
        ParkingSystem.Booking booking30 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean31 = spaceManager14.assignBooking("empty", (int) (short) 0, booking30);
        boolean boolean32 = parkingSpace11.assignBooking(booking30);
        java.lang.String str33 = disabled0.scanSpace(parkingSpace11);
        java.lang.String str34 = parkingSpace11.scanSpace();
        parkingSpace11.removeBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "disabled" + "'", str33, "disabled");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "disabled" + "'", str34, "disabled");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        spaceManager0.addParkingLot("");
        spaceManager0.addParkingLot("disabled");
        ParkingSystem.ParkingLot parkingLot11 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking13 = null;
        boolean boolean14 = parkingLot11.assignBooking(0, booking13);
        boolean boolean16 = parkingLot11.isSpaceAvailable((int) '#');
        boolean boolean18 = parkingLot11.isSpaceAvailable((int) (short) 10);
        ParkingSystem.SpaceManager spaceManager20 = new ParkingSystem.SpaceManager();
        spaceManager20.toggleLot("Jane", false);
        spaceManager20.removeBooking("disabled", 10);
        ParkingSystem.SpaceManager spaceManager29 = new ParkingSystem.SpaceManager();
        boolean boolean32 = spaceManager29.isSpaceAvailable("hi!", (int) '#');
        spaceManager29.toggleLot("disabled", false);
        ParkingSystem.Booking booking45 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean46 = spaceManager29.assignBooking("empty", (int) (short) 0, booking45);
        boolean boolean47 = spaceManager20.assignBooking("hi!", 0, booking45);
        double double48 = booking45.getTotalCost();
        java.lang.String str49 = booking45.getStartTime();
        java.lang.String str50 = booking45.getLotId();
        boolean boolean51 = parkingLot11.assignBooking((int) (byte) -1, booking45);
        int int52 = booking45.getSpaceId();
        boolean boolean53 = spaceManager0.assignBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab", (int) (short) 10, booking45);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap54 = spaceManager0.getParkingLots();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Jane" + "'", str49, "Jane");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "jane" + "'", str50, "jane");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap54);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking2 = parkingSpaceProxy0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry3 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.Manager manager4 = accountRegistry3.autoGenerateManager();
        ParkingSystem.User user6 = new ParkingSystem.User();
        java.lang.Object obj7 = user6.user;
        ParkingSystem.Client client8 = ParkingSystem.Client.getInstance();
        java.lang.String str9 = client8.getName();
        client8.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry13 = parkingSpaceProxy12.getRegistry();
        boolean boolean15 = parkingSpaceProxy12.checkIn("");
        client8.assignProxy(parkingSpaceProxy12);
        boolean boolean17 = client8.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy18 = new ParkingSystem.ParkingSpaceProxy();
        client8.assignProxy(parkingSpaceProxy18);
        ParkingSystem.AccountRegistry accountRegistry20 = parkingSpaceProxy18.getRegistry();
        boolean boolean22 = parkingSpaceProxy18.checkIn("hi!");
        user6.parkingProxy = parkingSpaceProxy18;
        user6.register("Card number should be 16 digits", "Paid $ 100.0 with Mobile Pay", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", "Paid $ 0.0 with Mobile Pay");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy30 = user6.parkingProxy;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy31 = new ParkingSystem.ParkingSpaceProxy();
        user6.assignProxy(parkingSpaceProxy31);
        boolean boolean42 = parkingSpaceProxy31.confirmBooking("CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "09622cbf-e665-45db-b1ad-365065947a20", "Paid $ 15.0 with Mobile Pay", (int) (byte) -1, "Refunded without deposit ($0.0)", 0, "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "13b04414-31a5-407f-8ea3-fba4613c73d1");
        accountRegistry3.assignProxyToClient("tbHxuilT", parkingSpaceProxy31);
        java.lang.Object obj46 = accountRegistry3.login("e578d6f7-8a26-46f0-8e2f-f3b1be5242ca", "TXCrKOGD");
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(accountRegistry3);
        org.junit.Assert.assertNotNull(manager4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jane" + "'", str9, "jane");
        org.junit.Assert.assertNotNull(accountRegistry13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(accountRegistry20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingSpaceProxy30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking11 = parkingSpace10.getCurrentBooking();
        ParkingSystem.ParkingLot parkingLot13 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking15 = null;
        boolean boolean16 = parkingLot13.assignBooking(0, booking15);
        boolean boolean18 = parkingLot13.isSpaceAvailable((int) '#');
        boolean boolean20 = parkingLot13.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace22 = parkingLot13.getParkingSpace((int) (byte) 10);
        ParkingSystem.ParkingLot parkingLot24 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking26 = null;
        boolean boolean27 = parkingLot24.assignBooking(0, booking26);
        boolean boolean29 = parkingLot24.isSpaceAvailable((int) '#');
        boolean boolean31 = parkingLot24.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace33 = parkingLot24.getParkingSpace((int) (byte) 10);
        int int34 = parkingSpace33.getSpaceId();
        ParkingSystem.Booking booking35 = parkingSpace33.getCurrentBooking();
        java.lang.String str36 = parkingSpace33.scanSpace();
        ParkingSystem.Enabled enabled37 = new ParkingSystem.Enabled();
        parkingSpace33.setState((ParkingSystem.SpaceState) enabled37);
        ParkingSystem.Disabled disabled39 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace40 = null;
        java.lang.String str41 = disabled39.scanSpace(parkingSpace40);
        ParkingSystem.Enabled enabled42 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot44 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking46 = null;
        boolean boolean47 = parkingLot44.assignBooking(0, booking46);
        boolean boolean49 = parkingLot44.isSpaceAvailable((int) '#');
        boolean boolean51 = parkingLot44.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace53 = parkingLot44.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking54 = parkingSpace53.getCurrentBooking();
        parkingSpace53.removeBooking();
        java.lang.String str56 = enabled42.scanSpace(parkingSpace53);
        ParkingSystem.ParkingLot parkingLot58 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking60 = null;
        boolean boolean61 = parkingLot58.assignBooking(0, booking60);
        boolean boolean63 = parkingLot58.isSpaceAvailable((int) '#');
        boolean boolean65 = parkingLot58.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace67 = parkingLot58.getParkingSpace((int) (byte) 10);
        int int68 = parkingSpace67.getSpaceId();
        ParkingSystem.Booking booking69 = parkingSpace67.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager70 = new ParkingSystem.SpaceManager();
        boolean boolean73 = spaceManager70.isSpaceAvailable("hi!", (int) '#');
        spaceManager70.toggleLot("disabled", false);
        ParkingSystem.Booking booking86 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean87 = spaceManager70.assignBooking("empty", (int) (short) 0, booking86);
        boolean boolean88 = parkingSpace67.assignBooking(booking86);
        java.lang.String str89 = enabled42.scanSpace(parkingSpace67);
        java.lang.String str90 = disabled39.scanSpace(parkingSpace67);
        java.lang.String str91 = enabled37.scanSpace(parkingSpace67);
        parkingSpace22.setState((ParkingSystem.SpaceState) enabled37);
        ParkingSystem.SpaceState spaceState93 = parkingSpace22.getState();
        parkingSpace10.setState(spaceState93);
        ParkingSystem.Booking booking95 = parkingSpace10.getCurrentBooking();
        boolean boolean96 = parkingSpace10.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(parkingSpace33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNull(booking35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "empty" + "'", str36, "empty");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "disabled" + "'", str41, "disabled");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(parkingSpace53);
        org.junit.Assert.assertNull(booking54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "empty" + "'", str56, "empty");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(parkingSpace67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertNull(booking69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "disabled" + "'", str89, "disabled");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "disabled" + "'", str90, "disabled");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "disabled" + "'", str91, "disabled");
        org.junit.Assert.assertNotNull(spaceState93);
        org.junit.Assert.assertNull(booking95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
        ParkingSystem.BookingManager bookingManager18 = parkingSpaceFacade17.getBookingManager();
        ParkingSystem.BookingManager bookingManager19 = parkingSpaceFacade17.getBookingManager();
        ParkingSystem.AccountRegistry accountRegistry20 = bookingManager19.getAccountRegistry();
        java.util.List<ParkingSystem.Client> clientList21 = accountRegistry20.displayPendingValidations();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Card number should be 16 digits" + "'", str6, "Card number should be 16 digits");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertNotNull(bookingManager18);
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertNotNull(accountRegistry20);
        org.junit.Assert.assertNotNull(clientList21);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getPassword();
        client0.setClientInfo("cf448544-0e6d-4a41-94c2-e67f848ae8df", "CLT-0173ebd7-c50a-4d20-8ab3-f6039f068cff", "aswfJGJtdF", "83a51dc6-0c8f-4f21-ae40-68699828f95d", "Paid $ 10.0 with Mobile Pay", "SRiN5ev00N", true);
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Refunded total cost of $1.0" + "'", str1, "Refunded total cost of $1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLT-30fd593b-dedd-41b3-a919-c48700301f41" + "'", str2, "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        java.util.List<ParkingSystem.Client> clientList11 = accountRegistry8.displayPendingValidations();
        ParkingSystem.Client client13 = accountRegistry8.getClient("Paid $ 1.0 with Mobile Pay");
        boolean boolean19 = accountRegistry8.registerClient("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "62c76d5a-13ab-4e01-9a2c-8e91dd8f4d54", "0K5j4sX8PY", "pass");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNotNull(clientList11);
        org.junit.Assert.assertNull(client13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        double double5 = bookingManager0.getHourlyRate("Paid $ 10.0 with Mobile Pay");
        boolean boolean10 = bookingManager0.extendBooking("hi!", (int) (short) 1, "Paid $ 100.0 with Mobile Pay", "Jane");
        double double13 = bookingManager0.calculateCost("CLT-f02c481e-1504-4abf-b598-76152da8586a", 52);
        ParkingSystem.BookingManager bookingManager14 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager15 = new ParkingSystem.CheckInManager(bookingManager14);
        ParkingSystem.Booking booking17 = bookingManager14.getBooking("");
        ParkingSystem.SpaceManager spaceManager18 = bookingManager14.getSpaceManager();
        boolean boolean28 = bookingManager14.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double30 = bookingManager14.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit31 = new ParkingSystem.DebitOrCredit();
        bookingManager14.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit31);
        java.lang.String str33 = debitOrCredit31.getPaymentMessage();
        java.lang.String str34 = debitOrCredit31.getPaymentMessage();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit31);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 795.0d + "'", double13 == 795.0d);
        org.junit.Assert.assertNull(booking17);
        org.junit.Assert.assertNotNull(spaceManager18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 15.0d + "'", double30 == 15.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        double double5 = bookingManager0.getHourlyRate("disabled");
        ParkingSystem.BookingManager bookingManager6 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager7 = new ParkingSystem.CheckInManager(bookingManager6);
        ParkingSystem.SpaceManager spaceManager8 = bookingManager6.getSpaceManager();
        double double11 = bookingManager6.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit12 = new ParkingSystem.DebitOrCredit();
        bookingManager6.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit12);
        boolean boolean18 = debitOrCredit12.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit12);
        ParkingSystem.CheckInManager checkInManager20 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean22 = checkInManager20.checkOut("06b0adae-5a80-41cd-b7f6-6da51afdd4f5");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 165.0d + "'", double11 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade3.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = spaceManager4.getParkingLots();
        cSVManager0.saveParkingLots(strMap5);
        ParkingSystem.SpaceManager spaceManager7 = new ParkingSystem.SpaceManager();
        boolean boolean10 = spaceManager7.isSpaceAvailable("hi!", (int) '#');
        spaceManager7.toggleLot("disabled", false);
        ParkingSystem.Booking booking23 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean24 = spaceManager7.assignBooking("empty", (int) (short) 0, booking23);
        spaceManager7.removeBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) '4');
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap28 = spaceManager7.getParkingLots();
        cSVManager0.loadParkingLots(strMap28);
        ParkingSystem.Client client30 = ParkingSystem.Client.getInstance();
        java.lang.String str31 = client30.getName();
        client30.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        boolean boolean40 = client30.cancelBooking();
        ParkingSystem.User user41 = new ParkingSystem.User();
        java.lang.Object obj42 = user41.user;
        ParkingSystem.Client client43 = ParkingSystem.Client.getInstance();
        java.lang.String str44 = client43.getName();
        client43.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy47 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry48 = parkingSpaceProxy47.getRegistry();
        boolean boolean50 = parkingSpaceProxy47.checkIn("");
        client43.assignProxy(parkingSpaceProxy47);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade52 = parkingSpaceProxy47.getFacade();
        user41.assignProxy(parkingSpaceProxy47);
        java.lang.String str56 = parkingSpaceProxy47.scanSpace("disabled", "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        parkingSpaceProxy47.toggleLot("empty", true);
        client30.assignProxy(parkingSpaceProxy47);
        java.lang.String str61 = client30.getPassword();
        cSVManager0.saveClient(client30);
        client30.setClientInfo("Refunded without deposit ($-68.0)", "", "kYN6YZxC3k", "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753", "Refunded without deposit ($0.0)", "disabled", true);
        org.junit.Assert.assertNotNull(strArray1);
// flaky "9) test3035(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "8) test3035(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(client30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3" + "'", str31, "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(client43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(accountRegistry48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "disabled" + "'", str56, "disabled");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "disabled" + "'", str61, "disabled");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator18 = parkingLot17.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator19 = parkingLot17.getIterator();
        user0.user = parkingLot17;
        ParkingSystem.User user21 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj25 = parkingSpaceProxy22.login("empty", "Jane");
        parkingSpaceProxy22.validateClient("Jane");
        parkingSpaceProxy22.toggleSpace("", "staff", false);
        boolean boolean33 = parkingSpaceProxy22.cancelBooking("");
        user21.assignProxy(parkingSpaceProxy22);
        user0.user = parkingSpaceProxy22;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy36 = user0.parkingProxy;
        java.lang.Object obj39 = user0.login("CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6", "89de8237-29df-4908-9de4-6dc1ce90de94");
        java.lang.Object obj40 = user0.user;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parkingSpaceProxy36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        boolean boolean16 = accountRegistry6.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy18 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj21 = parkingSpaceProxy18.login("empty", "Jane");
        parkingSpaceProxy18.validateClient("Jane");
        parkingSpaceProxy18.toggleSpace("", "staff", false);
        boolean boolean29 = parkingSpaceProxy18.cancelBooking("Jane");
        accountRegistry6.assignProxyToClient("pass", parkingSpaceProxy18);
        boolean boolean32 = accountRegistry6.requiresValidation("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        ParkingSystem.SuperManager superManager33 = ParkingSystem.SuperManager.createFromCSV("CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6", "hi!", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry40 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager41 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry40);
        java.lang.String str42 = superManager41.getManagerId();
        java.lang.String str43 = superManager41.getManagerId();
        ParkingSystem.Manager manager44 = superManager41.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry45 = superManager41.registry;
        java.lang.String str46 = superManager41.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry47 = superManager41.registry;
        java.lang.String str48 = superManager41.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry49 = superManager41.getRegistry();
        accountRegistry49.validateClient("CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        ParkingSystem.SuperManager superManager52 = ParkingSystem.SuperManager.createFromCSV("CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Paid $ 100.0 with Mobile Pay", accountRegistry49);
        int int53 = accountRegistry49.getManagersSize();
        superManager33.registry = accountRegistry49;
        ParkingSystem.AccountRegistry accountRegistry58 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager59 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry58);
        java.lang.String str60 = superManager59.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry61 = superManager59.registry;
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap62 = accountRegistry61.getManagers();
        ParkingSystem.Client client64 = ParkingSystem.Client.getInstance();
        java.lang.String str65 = client64.getName();
        client64.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str74 = client64.getUsername();
        java.lang.String str75 = client64.getPassword();
        java.lang.String str76 = client64.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy77 = null;
        client64.assignProxy(parkingSpaceProxy77);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy79 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj82 = parkingSpaceProxy79.login("empty", "Jane");
        client64.assignProxy(parkingSpaceProxy79);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy84 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking86 = parkingSpaceProxy84.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry87 = parkingSpaceProxy84.getRegistry();
        parkingSpaceProxy84.autoGenerateManager();
        client64.assignProxy(parkingSpaceProxy84);
        boolean boolean93 = parkingSpaceProxy84.editBooking("13b04414-31a5-407f-8ea3-fba4613c73d1", "Refunded total cost of $100.0", (int) (byte) 0);
        accountRegistry61.assignProxyToManager("Paid $ 100.0 with Mobile Pay", parkingSpaceProxy84);
        superManager33.assignProxy(parkingSpaceProxy84);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(superManager33);
        org.junit.Assert.assertNotNull(superManager41);
// flaky "10) test3037(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str42, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
// flaky "9) test3037(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str43, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(manager44);
        org.junit.Assert.assertNotNull(accountRegistry45);
// flaky "6) test3037(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str46, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(accountRegistry47);
// flaky "3) test3037(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str48, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(accountRegistry49);
        org.junit.Assert.assertNotNull(superManager52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(superManager59);
// flaky "2) test3037(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str60, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(accountRegistry61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(client64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "jane" + "'", str65, "jane");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "disabled" + "'", str75, "disabled");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(booking86);
        org.junit.Assert.assertNotNull(accountRegistry87);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getPassword();
        java.lang.String str3 = client0.getClientId();
        java.lang.String str4 = client0.getPassword();
        java.lang.String str5 = client0.getName();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "disabled" + "'", str1, "disabled");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "disabled" + "'", str2, "disabled");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        parkingSpaceFacade0.addParkingLot("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceFacade0.toggleSpace("", "Paid $ -1.0 with Mobile Pay", false);
        boolean boolean10 = parkingSpaceFacade0.extendBooking("13b04414-31a5-407f-8ea3-fba4613c73d1", (int) (byte) 100);
        ParkingSystem.CheckInManager checkInManager11 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean21 = parkingSpaceFacade0.confirmBooking("jane", "CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d", "CLT-849ed8c4-58ed-4643-99dc-d9a0cdbc1188", "62c76d5a-13ab-4e01-9a2c-8e91dd8f4d54", 0, "721fcb72-c57d-4e99-81b7-06e4c7e1ed40", 0, "kYN6YZxC3k", "disabled");
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(checkInManager11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean4 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) 10);
        boolean boolean7 = parkingSpaceFacade0.extendBooking("Refunded without deposit ($-96.0)", 1);
        ParkingSystem.SpaceManager spaceManager8 = parkingSpaceFacade0.getSpaceManager();
        ParkingSystem.CheckInManager checkInManager9 = parkingSpaceFacade0.getCheckInManager();
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertNotNull(checkInManager9);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("Paid $ 100.0 with Mobile Pay", "CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d", (int) (short) 10, "CLT-7df99776-6818-4843-8c88-c29a926a9d29", 100, "CLT-f02c481e-1504-4abf-b598-76152da8586a", (double) (byte) 100);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        ParkingSystem.Booking booking16 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean17 = spaceManager0.assignBooking("empty", (int) (short) 0, booking16);
        java.lang.String str18 = booking16.getClientId();
        java.lang.String str19 = booking16.getStartTime();
        java.lang.String str20 = booking16.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime21 = booking16.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Jane' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Jane" + "'", str19, "Jane");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        ParkingSystem.CSVManager cSVManager14 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList16 = cSVManager14.readCSV("");
        java.util.List<java.lang.String[]> strArrayList18 = cSVManager14.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap19 = null;
        cSVManager14.loadParkingLots(strMap19);
        ParkingSystem.AccountRegistry accountRegistry24 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager25 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry24);
        ParkingSystem.Manager manager26 = superManager25.autoGenerateManager();
        cSVManager14.saveManager((ParkingSystem.Manager) superManager25);
        ParkingSystem.SpaceManager spaceManager28 = new ParkingSystem.SpaceManager();
        boolean boolean31 = spaceManager28.isSpaceAvailable("hi!", (int) '#');
        spaceManager28.toggleLot("disabled", false);
        ParkingSystem.Booking booking44 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean45 = spaceManager28.assignBooking("empty", (int) (short) 0, booking44);
        spaceManager28.loadParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap47 = spaceManager28.getParkingLots();
        cSVManager14.loadParkingLots(strMap47);
        ParkingSystem.SpaceManager spaceManager49 = new ParkingSystem.SpaceManager();
        boolean boolean52 = spaceManager49.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str55 = spaceManager49.scanSpace("disabled", "");
        spaceManager49.addParkingLot("hi!");
        java.lang.String str60 = spaceManager49.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap61 = spaceManager49.getParkingLots();
        cSVManager14.saveParkingLots(strMap61);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade63 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str66 = parkingSpaceFacade63.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager67 = parkingSpaceFacade63.getSpaceManager();
        spaceManager67.addParkingLot("hi!");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap70 = spaceManager67.getParkingLots();
        cSVManager14.saveParkingLots(strMap70);
        cSVManager0.loadParkingLots(strMap70);
        ParkingSystem.Client client73 = ParkingSystem.Client.getInstance();
        java.lang.String str74 = client73.getUsername();
        cSVManager0.saveClient(client73);
        client73.setClientInfo("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", "CLT-c3ce9a25-7555-430c-9330-9203c36530f8", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "", "79e86af2-7061-42df-ba07-6f6ce7f1b89c", "5XQfkf24zK", true);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
        org.junit.Assert.assertNotNull(strArrayList16);
        org.junit.Assert.assertNotNull(strArrayList18);
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(manager26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "disabled" + "'", str55, "disabled");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "disabled" + "'", str60, "disabled");
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "disabled" + "'", str66, "disabled");
        org.junit.Assert.assertNotNull(spaceManager67);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNotNull(client73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade9 = parkingSpaceProxy4.getFacade();
        parkingSpaceProxy4.addParkingLot("Jane");
        parkingSpaceProxy4.toggleSpace("", "Refunded without deposit ($-42.0)", true);
        java.lang.String str18 = parkingSpaceProxy4.scanSpace("3b453211-7dd1-4452-8741-a206711c1217", "fhd49ADb");
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLT-c3ce9a25-7555-430c-9330-9203c36530f8" + "'", str1, "CLT-c3ce9a25-7555-430c-9330-9203c36530f8");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        boolean boolean4 = parkingLot1.isSpaceAvailable(52);
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        java.lang.String str11 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap12 = spaceManager0.getParkingLots();
        boolean boolean15 = spaceManager0.isSpaceAvailable("staff", (int) '4');
        spaceManager0.toggleLot("Refunded total cost of $-1.0", true);
        boolean boolean21 = spaceManager0.isSpaceAvailable("9701df9a-2178-4ad5-8076-46ff5f05b3e8", 0);
        spaceManager0.addParkingLot("CLT-0018b5f2-4f8d-4ac6-8c8d-394f6b7b51a1");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap1 = null;
        cSVManager0.loadParkingLots(strMap1);
        java.lang.String[] strArray3 = cSVManager0.loadSuperManager();
        ParkingSystem.Client client4 = ParkingSystem.Client.getInstance();
        java.lang.String str5 = client4.getClientType();
        java.lang.String str6 = client4.getUsername();
        cSVManager0.saveClient(client4);
        java.lang.String str8 = client4.getUsername();
        org.junit.Assert.assertNotNull(strArray3);
// flaky "11) test3047(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "79e86af2-7061-42df-ba07-6f6ce7f1b89c" + "'", str5, "79e86af2-7061-42df-ba07-6f6ce7f1b89c");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str6, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str8, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry12 = superManager11.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry15 = parkingSpaceProxy14.getRegistry();
        boolean boolean21 = parkingSpaceProxy14.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean25 = parkingSpaceProxy14.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean35 = parkingSpaceProxy14.confirmBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff", "disabled", (int) (short) 0, "Paid $ 100.0 with Mobile Pay", (int) (short) 10, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        accountRegistry12.assignProxyToManager("empty", parkingSpaceProxy14);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy38 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade39 = parkingSpaceProxy38.getFacade();
        accountRegistry12.assignProxyToManager("", parkingSpaceProxy38);
        parkingSpaceProxy38.addParkingLot("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        boolean boolean44 = parkingSpaceProxy38.cancelBooking("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.Booking booking46 = parkingSpaceProxy38.getBookingDetails("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(booking46);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isSpaceAvailable((int) (byte) 100);
        ParkingSystem.ParkingLotIterator parkingLotIterator10 = parkingLot1.getIterator();
        boolean boolean11 = parkingLotIterator10.hasNext();
        boolean boolean12 = parkingLotIterator10.hasNext();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean4 = paymentManager0.refundWithoutDeposit((double) (short) 10, (double) '4');
        java.lang.String str5 = paymentManager0.refundMessage;
        java.lang.String str6 = paymentManager0.paymentMessage;
        boolean boolean11 = paymentManager0.processPayment("CLT-390234b0-d56e-4275-bd7b-122280609c69", (double) (-1.0f), "Paid $ 1470.0 with Mobile Pay", "H33Itw4InT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Refunded without deposit ($-42.0)" + "'", str5, "Refunded without deposit ($-42.0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        java.util.List<ParkingSystem.Client> clientList7 = accountRegistry3.displayPendingValidations();
        ParkingSystem.Client client9 = accountRegistry3.getClient("Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(clientList7);
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap5 = accountRegistry3.getManagers();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy7 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry8 = parkingSpaceProxy7.getRegistry();
        java.lang.String str11 = parkingSpaceProxy7.scanSpace("empty", "hi!");
        boolean boolean21 = parkingSpaceProxy7.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy7.toggleSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "", true);
        boolean boolean31 = parkingSpaceProxy7.register("jane", "Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($0.0)", "disabled", "Refunded total cost of $1.0");
        accountRegistry3.assignProxyToManager("7aecb00c-028c-4dcf-96cc-14d25bd709ab", parkingSpaceProxy7);
        java.lang.Object obj35 = accountRegistry3.login("Paid $ 10.0 with Mobile Pay", "Paid $ -1.0 with Mobile Pay");
        boolean boolean37 = accountRegistry3.requiresValidation("Refunded total cost of $10.0");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", (int) (byte) 10, "CLT-f02c481e-1504-4abf-b598-76152da8586a", 52, "staff", (double) (byte) 1);
        java.lang.String str8 = booking7.getLotId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f" + "'", str8, "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        java.lang.String str13 = client0.getName();
        ParkingSystem.User user14 = new ParkingSystem.User();
        java.lang.Object obj15 = user14.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy16 = user14.parkingProxy;
        ParkingSystem.User user17 = new ParkingSystem.User();
        java.lang.Object obj18 = user17.user;
        ParkingSystem.Client client19 = ParkingSystem.Client.getInstance();
        java.lang.String str20 = client19.getName();
        client19.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy23 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry24 = parkingSpaceProxy23.getRegistry();
        boolean boolean26 = parkingSpaceProxy23.checkIn("");
        client19.assignProxy(parkingSpaceProxy23);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade28 = parkingSpaceProxy23.getFacade();
        user17.assignProxy(parkingSpaceProxy23);
        user14.parkingProxy = parkingSpaceProxy23;
        ParkingSystem.AccountRegistry accountRegistry34 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager35 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry34);
        java.lang.String str36 = superManager35.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry37 = superManager35.registry;
        java.lang.String str38 = superManager35.getManagerId();
        ParkingSystem.Client client39 = ParkingSystem.Client.getInstance();
        java.lang.String str40 = client39.getName();
        client39.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy43 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry44 = parkingSpaceProxy43.getRegistry();
        boolean boolean46 = parkingSpaceProxy43.checkIn("");
        client39.assignProxy(parkingSpaceProxy43);
        boolean boolean48 = client39.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy49 = new ParkingSystem.ParkingSpaceProxy();
        client39.assignProxy(parkingSpaceProxy49);
        superManager35.assignProxy(parkingSpaceProxy49);
        user14.assignProxy(parkingSpaceProxy49);
        ParkingSystem.AccountRegistry accountRegistry53 = parkingSpaceProxy49.getRegistry();
        java.lang.String str56 = parkingSpaceProxy49.scanSpace("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "");
        java.lang.Object obj59 = parkingSpaceProxy49.login("jane", "Refunded without deposit ($0.0)");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade60 = parkingSpaceProxy49.getFacade();
        client0.assignProxy(parkingSpaceProxy49);
        parkingSpaceProxy49.toggleSpace("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", true);
        ParkingSystem.AccountRegistry accountRegistry66 = parkingSpaceProxy49.getRegistry();
        ParkingSystem.Client client68 = accountRegistry66.getClient("CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d");
        boolean boolean74 = accountRegistry66.registerClient("qPYDfDnbtD", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "hi!", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "");
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(parkingSpaceProxy16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(client19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(accountRegistry24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade28);
        org.junit.Assert.assertNotNull(superManager35);
// flaky "12) test3054(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str36, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(accountRegistry37);
// flaky "10) test3054(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str38, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(client39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(accountRegistry44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(accountRegistry53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "disabled" + "'", str56, "disabled");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(parkingSpaceFacade60);
        org.junit.Assert.assertNotNull(accountRegistry66);
        org.junit.Assert.assertNull(client68);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit17 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit17);
        boolean boolean23 = bookingManager0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "", "Jane");
        double double25 = bookingManager0.getHourlyRate("CLT-23b57c8a-84c7-41fe-9781-bfe8a8f3fc04");
        boolean boolean30 = bookingManager0.extendBooking("lL3e2yIMXI", (-1), "CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", "CLT-0018b5f2-4f8d-4ac6-8c8d-394f6b7b51a1");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 15.0d + "'", double25 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
        boolean boolean6 = parkingSpaceProxy3.checkIn("");
        parkingSpaceProxy3.validateClient("");
        user0.assignProxy(parkingSpaceProxy3);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy10 = user0.parkingProxy;
        java.lang.Object obj13 = user0.login("13b04414-31a5-407f-8ea3-fba4613c73d1", "Paid $ 10.0 with Mobile Pay");
        ParkingSystem.User user14 = new ParkingSystem.User();
        java.lang.Object obj15 = user14.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy16 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj19 = parkingSpaceProxy16.login("empty", "Jane");
        parkingSpaceProxy16.validateClient("Jane");
        java.lang.String str24 = parkingSpaceProxy16.scanSpace("", "");
        parkingSpaceProxy16.toggleSpace("", "disabled", true);
        user14.parkingProxy = parkingSpaceProxy16;
        parkingSpaceProxy16.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry31 = parkingSpaceProxy16.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry32 = parkingSpaceProxy16.getRegistry();
        user0.assignProxy(parkingSpaceProxy16);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parkingSpaceProxy10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "disabled" + "'", str24, "disabled");
        org.junit.Assert.assertNotNull(accountRegistry31);
        org.junit.Assert.assertNotNull(accountRegistry32);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        java.lang.String str4 = paymentManager0.paymentMessage;
        ParkingSystem.BookingManager bookingManager5 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager6 = new ParkingSystem.CheckInManager(bookingManager5);
        ParkingSystem.Booking booking8 = bookingManager5.getBooking("");
        ParkingSystem.SpaceManager spaceManager9 = bookingManager5.getSpaceManager();
        boolean boolean19 = bookingManager5.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double21 = bookingManager5.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit22 = new ParkingSystem.DebitOrCredit();
        bookingManager5.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit22);
        paymentManager0.setStrategy((ParkingSystem.Strategy) debitOrCredit22);
        java.lang.String str25 = paymentManager0.refundMessage;
        ParkingSystem.BookingManager bookingManager26 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager27 = new ParkingSystem.CheckInManager(bookingManager26);
        ParkingSystem.SpaceManager spaceManager28 = bookingManager26.getSpaceManager();
        double double31 = bookingManager26.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit32 = new ParkingSystem.DebitOrCredit();
        bookingManager26.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit32);
        boolean boolean38 = debitOrCredit32.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str39 = debitOrCredit32.getPaymentMessage();
        boolean boolean42 = debitOrCredit32.validateCard("pass", (double) 100.0f);
        paymentManager0.setStrategy((ParkingSystem.Strategy) debitOrCredit32);
        boolean boolean46 = debitOrCredit32.validateCard("CLT-5be1cd5a-d829-4101-9cd3-6006338eb786", 1.0d);
        java.lang.String str47 = debitOrCredit32.getPaymentMessage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(spaceManager9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Refunded total cost of $-1.0" + "'", str25, "Refunded total cost of $-1.0");
        org.junit.Assert.assertNotNull(spaceManager28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 165.0d + "'", double31 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Card number should be 16 digits" + "'", str39, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Card number should be 16 digits" + "'", str47, "Card number should be 16 digits");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.MobilePay mobilePay6 = new ParkingSystem.MobilePay();
        boolean boolean11 = mobilePay6.processPayment("hi!", (-1.0d), "", "");
        boolean boolean16 = mobilePay6.processPayment("hi!", (double) 100, "jane", "disabled");
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) mobilePay6);
        boolean boolean22 = bookingManager0.extendBooking("9701df9a-2178-4ad5-8076-46ff5f05b3e8", (int) (short) 0, "Jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        ParkingSystem.Booking booking24 = bookingManager0.getBooking("4c45f11e-b09a-4d81-adf1-86cfd519dc3c");
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(booking24);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking2 = parkingSpaceProxy0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = parkingSpaceProxy0.getFacade();
        boolean boolean5 = parkingSpaceProxy0.checkOut("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        boolean boolean15 = parkingSpaceProxy0.confirmBooking("iHAHREGIAH", "0b35479f-5869-423e-9abc-e4ab9cef903d", "4c45f11e-b09a-4d81-adf1-86cfd519dc3c", "CLT-93b11069-2e34-4ef4-bf17-b3bb8758882b", (-1), "ua4ppOLtSl", 0, "CLT-08489cd1-5899-4594-ad65-2f6dcf0a9e5d", "Jane");
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(parkingSpaceFacade3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str3 = parkingSpaceFacade0.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleLot("Refunded total cost of $1.0", false);
        ParkingSystem.SpaceManager spaceManager8 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleLot("Paid $ 100.0 with Mobile Pay", false);
        ParkingSystem.CheckInManager checkInManager12 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean14 = parkingSpaceFacade0.checkOut("433f3d1f-f758-4ae3-972b-7fb179aedfd7");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertNotNull(checkInManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager1 = parkingSpaceFacade0.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap2 = spaceManager1.getParkingLots();
        boolean boolean5 = spaceManager1.isSpaceAvailable("Refunded without deposit ($-42.0)", (int) '4');
        java.lang.String str8 = spaceManager1.scanSpace("", "433f3d1f-f758-4ae3-972b-7fb179aedfd7");
        spaceManager1.toggleSpace("2afd610d-a8cb-413a-bbee-7927f86b526c", "", true);
        spaceManager1.toggleLot("4c45f11e-b09a-4d81-adf1-86cfd519dc3c", true);
        spaceManager1.toggleSpace("I673kmcH", "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", true);
        org.junit.Assert.assertNotNull(spaceManager1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "disabled" + "'", str8, "disabled");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.util.List<java.lang.String[]> strArrayList3 = cSVManager0.readCSV("");
        org.junit.Assert.assertNotNull(strArray1);
// flaky "13) test3062(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArrayList3);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("jane", "");
        spaceManager0.toggleLot("Jane", true);
        boolean boolean12 = spaceManager0.isSpaceAvailable("4CGFxoSEo5", 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.toggleLot("Jane", false);
        spaceManager0.removeBooking("disabled", 10);
        spaceManager0.toggleLot("CLT-30fd593b-dedd-41b3-a919-c48700301f41", false);
        spaceManager0.addParkingLot("0b35479f-5869-423e-9abc-e4ab9cef903d");
        java.lang.String str14 = spaceManager0.scanSpace("CLT-23b57c8a-84c7-41fe-9781-bfe8a8f3fc04", "4a1f2343-8b2e-4dea-ba69-efd105414390");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap15 = spaceManager0.getParkingLots();
        spaceManager0.loadParkingLots();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disabled" + "'", str14, "disabled");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean7 = parkingSpaceFacade0.editBooking("Card number should be 16 digits", "", (int) (short) 0);
        java.lang.String str10 = parkingSpaceFacade0.scanSpace("staff", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.CheckInManager checkInManager11 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean13 = checkInManager11.checkOut("86z9Z9e0MN");
        checkInManager11.refundMessage = "09622cbf-e665-45db-b1ad-365065947a20";
        java.lang.String str16 = checkInManager11.refundMessage;
        boolean boolean18 = checkInManager11.checkIn("CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        java.lang.String str19 = checkInManager11.refundMessage;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(checkInManager11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "09622cbf-e665-45db-b1ad-365065947a20" + "'", str16, "09622cbf-e665-45db-b1ad-365065947a20");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "09622cbf-e665-45db-b1ad-365065947a20" + "'", str19, "09622cbf-e665-45db-b1ad-365065947a20");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        java.lang.String str9 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.lang.String str12 = spaceManager0.scanSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "Card number should be 16 digits");
        boolean boolean15 = spaceManager0.isSpaceAvailable("Refunded total cost of $100.0", (int) (byte) 0);
        boolean boolean18 = spaceManager0.isSpaceAvailable("0b35479f-5869-423e-9abc-e4ab9cef903d", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "disabled" + "'", str9, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator3 = parkingLot1.getIterator();
        parkingLot1.removeBooking((int) '4');
        ParkingSystem.ParkingLotIterator parkingLotIterator6 = parkingLot1.getIterator();
        parkingLot1.removeBooking((int) (short) 100);
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertNotNull(parkingLotIterator3);
        org.junit.Assert.assertNotNull(parkingLotIterator6);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.paymentMessage = "staff";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (short) 0);
        boolean boolean7 = paymentManager0.refundWithoutDeposit((double) (-1.0f), (double) (short) -1);
        java.lang.String str8 = paymentManager0.refundMessage;
        paymentManager0.paymentMessage = "CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841";
        paymentManager0.refundMessage = "CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc";
        java.lang.String str13 = paymentManager0.refundMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Refunded without deposit ($0.0)" + "'", str8, "Refunded without deposit ($0.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc" + "'", str13, "CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
        boolean boolean6 = parkingSpaceProxy3.checkIn("");
        parkingSpaceProxy3.validateClient("");
        user0.assignProxy(parkingSpaceProxy3);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy10 = user0.parkingProxy;
        java.lang.Object obj13 = user0.login("empty", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.Client client14 = ParkingSystem.Client.getInstance();
        java.lang.String str15 = client14.getUsername();
        client14.setValidated(false);
        java.lang.String str18 = client14.getPassword();
        user0.user = client14;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parkingSpaceProxy10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str15, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList7 = cSVManager0.loadManagers();
// flaky "14) test3070(RegressionTest6)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry15 = superManager4.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy16 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry17 = parkingSpaceProxy16.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj22 = parkingSpaceProxy19.login("empty", "Jane");
        parkingSpaceProxy19.validateClient("Jane");
        parkingSpaceProxy19.toggleSpace("", "staff", false);
        accountRegistry17.assignProxyToManager("pass", parkingSpaceProxy19);
        java.lang.Object obj32 = accountRegistry17.login("CLT-390234b0-d56e-4275-bd7b-122280609c69", "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5");
        superManager4.registry = accountRegistry17;
        ParkingSystem.Client client34 = ParkingSystem.Client.getInstance();
        java.lang.String str35 = client34.getUsername();
        ParkingSystem.User user36 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy37 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj40 = parkingSpaceProxy37.login("empty", "Jane");
        parkingSpaceProxy37.validateClient("Jane");
        parkingSpaceProxy37.toggleSpace("", "staff", false);
        boolean boolean48 = parkingSpaceProxy37.cancelBooking("");
        user36.assignProxy(parkingSpaceProxy37);
        client34.assignProxy(parkingSpaceProxy37);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy51 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry52 = parkingSpaceProxy51.getRegistry();
        boolean boolean54 = parkingSpaceProxy51.checkIn("");
        client34.assignProxy(parkingSpaceProxy51);
        parkingSpaceProxy51.validateClient("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        parkingSpaceProxy51.toggleLot("empty", true);
        java.lang.Object obj63 = parkingSpaceProxy51.login("3b453211-7dd1-4452-8741-a206711c1217", "86z9Z9e0MN");
        parkingSpaceProxy51.toggleLot("", false);
        superManager4.assignProxy(parkingSpaceProxy51);
        superManager4.setManagerInfo("4CGFxoSEo5", "433f3d1f-f758-4ae3-972b-7fb179aedfd7", "");
        org.junit.Assert.assertNotNull(superManager4);
// flaky "15) test3071(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-92729d37-9255-42b4-9361-c1978aadacb0" + "'", str5, "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(accountRegistry17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(client34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str35, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(accountRegistry52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj4 = parkingSpaceProxy1.login("empty", "Jane");
        parkingSpaceProxy1.validateClient("Jane");
        parkingSpaceProxy1.toggleSpace("", "staff", false);
        boolean boolean12 = parkingSpaceProxy1.cancelBooking("");
        user0.assignProxy(parkingSpaceProxy1);
        parkingSpaceProxy1.displayPendingValidations();
        parkingSpaceProxy1.addParkingLot("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy1.getFacade();
        ParkingSystem.AccountRegistry accountRegistry18 = parkingSpaceProxy1.getRegistry();
        boolean boolean21 = parkingSpaceProxy1.extendBooking("2d0fc45e-f79a-4bfb-ba07-3322876cac6b", 3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertNotNull(accountRegistry18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        java.lang.String str13 = client0.getName();
        boolean boolean15 = client0.extendBooking((int) (short) 0);
        java.lang.String str16 = client0.getUsername();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "qPYDfDnbtD" + "'", str1, "qPYDfDnbtD");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        paymentManager0.paymentMessage = "";
        paymentManager0.paymentMessage = "Paid $ -1.0 with Mobile Pay";
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        boolean boolean13 = client0.getIsValidated();
        java.lang.String str14 = client0.getUsername();
        java.lang.String str15 = client0.getPassword();
        java.lang.String str16 = client0.getUsername();
        boolean boolean17 = client0.cancelBooking();
        boolean boolean20 = client0.editBooking("3b453211-7dd1-4452-8741-a206711c1217", 3);
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "disabled" + "'", str15, "disabled");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        ParkingSystem.Enabled enabled0 = new ParkingSystem.Enabled();
        ParkingSystem.Disabled disabled1 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace2 = null;
        java.lang.String str3 = disabled1.scanSpace(parkingSpace2);
        ParkingSystem.ParkingLot parkingLot5 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking7 = null;
        boolean boolean8 = parkingLot5.assignBooking(0, booking7);
        boolean boolean10 = parkingLot5.isSpaceAvailable((int) '#');
        boolean boolean12 = parkingLot5.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace14 = parkingLot5.getParkingSpace((int) (byte) 10);
        ParkingSystem.ParkingSpace parkingSpace16 = parkingLot5.getParkingSpace((int) (byte) 0);
        ParkingSystem.Booking booking17 = parkingSpace16.getCurrentBooking();
        java.lang.String str18 = disabled1.scanSpace(parkingSpace16);
        java.lang.String str19 = enabled0.scanSpace(parkingSpace16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(booking17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "empty" + "'", str19, "empty");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade3.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = spaceManager4.getParkingLots();
        cSVManager0.saveParkingLots(strMap5);
        ParkingSystem.Client client7 = ParkingSystem.Client.getInstance();
        java.lang.String str8 = client7.getName();
        client7.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry12 = parkingSpaceProxy11.getRegistry();
        boolean boolean14 = parkingSpaceProxy11.checkIn("");
        client7.assignProxy(parkingSpaceProxy11);
        boolean boolean16 = client7.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy17 = new ParkingSystem.ParkingSpaceProxy();
        client7.assignProxy(parkingSpaceProxy17);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = null;
        client7.assignProxy(parkingSpaceProxy19);
        cSVManager0.saveClient(client7);
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.updateClientValidation("79e86af2-7061-42df-ba07-6f6ce7f1b89c", false);
// flaky "16) test3077(RegressionTest6)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
// flaky "11) test3077(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "7) test3077(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        double double5 = bookingManager0.getHourlyRate("disabled");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap6 = bookingManager0.getActiveBookings();
        boolean boolean11 = bookingManager0.extendBooking("disabled", 32, "e578d6f7-8a26-46f0-8e2f-f3b1be5242ca", "Refunded without deposit ($-42.0)");
        boolean boolean15 = bookingManager0.editBooking("Paid $ 10.0 with Mobile Pay", "12fea0ad-7859-47d9-95f1-1985d2c4ed33", 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        ParkingSystem.AccountRegistry accountRegistry12 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager13 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry12);
        ParkingSystem.AccountRegistry accountRegistry17 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager18 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry17);
        superManager13.registry = accountRegistry17;
        ParkingSystem.SuperManager superManager20 = ParkingSystem.SuperManager.createFromCSV("pass", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry17);
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("Paid $ -1.0 with Mobile Pay", "", "Jane", accountRegistry17);
        ParkingSystem.SuperManager superManager22 = ParkingSystem.SuperManager.createFromCSV("staff", "Paid $ 0.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", accountRegistry17);
        ParkingSystem.AccountRegistry accountRegistry23 = superManager22.registry;
        org.junit.Assert.assertNotNull(superManager13);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertNotNull(superManager22);
        org.junit.Assert.assertNotNull(accountRegistry23);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        boolean boolean19 = bookingManager0.cancelBooking("Paid $ 1470.0 with Mobile Pay");
        boolean boolean23 = bookingManager0.editBooking("CLT-d2153556-bc61-49e7-b73d-6af2a45e5167", "CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable(0);
        parkingLot1.removeBooking((int) (byte) 1);
        ParkingSystem.SpaceManager spaceManager12 = new ParkingSystem.SpaceManager();
        spaceManager12.toggleLot("Jane", false);
        spaceManager12.removeBooking("disabled", 10);
        ParkingSystem.SpaceManager spaceManager21 = new ParkingSystem.SpaceManager();
        boolean boolean24 = spaceManager21.isSpaceAvailable("hi!", (int) '#');
        spaceManager21.toggleLot("disabled", false);
        ParkingSystem.Booking booking37 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean38 = spaceManager21.assignBooking("empty", (int) (short) 0, booking37);
        boolean boolean39 = spaceManager12.assignBooking("hi!", 0, booking37);
        boolean boolean40 = parkingLot1.assignBooking((int) (short) 1, booking37);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime41 = booking37.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Jane' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj9 = parkingSpaceProxy6.login("empty", "Jane");
        parkingSpaceProxy6.validateClient("Jane");
        parkingSpaceProxy6.toggleSpace("", "staff", false);
        accountRegistry4.assignProxyToManager("pass", parkingSpaceProxy6);
        ParkingSystem.Client client18 = accountRegistry4.getClient("");
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry4);
        boolean boolean25 = accountRegistry4.registerClient("hi!", "Refunded total cost of $1.0", "2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        java.lang.Object obj28 = accountRegistry4.login("Paid $ 100.0 with Mobile Pay", "staff");
        ParkingSystem.User user30 = new ParkingSystem.User();
        java.lang.Object obj31 = user30.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy32 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj35 = parkingSpaceProxy32.login("empty", "Jane");
        parkingSpaceProxy32.validateClient("Jane");
        java.lang.String str40 = parkingSpaceProxy32.scanSpace("", "");
        parkingSpaceProxy32.toggleSpace("", "disabled", true);
        user30.parkingProxy = parkingSpaceProxy32;
        ParkingSystem.ParkingLot parkingLot47 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator48 = parkingLot47.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator49 = parkingLot47.getIterator();
        user30.user = parkingLot47;
        ParkingSystem.User user51 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy52 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj55 = parkingSpaceProxy52.login("empty", "Jane");
        parkingSpaceProxy52.validateClient("Jane");
        parkingSpaceProxy52.toggleSpace("", "staff", false);
        boolean boolean63 = parkingSpaceProxy52.cancelBooking("");
        user51.assignProxy(parkingSpaceProxy52);
        user30.user = parkingSpaceProxy52;
        ParkingSystem.User user66 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy67 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj70 = parkingSpaceProxy67.login("empty", "Jane");
        parkingSpaceProxy67.validateClient("Jane");
        parkingSpaceProxy67.toggleSpace("", "staff", false);
        boolean boolean78 = parkingSpaceProxy67.cancelBooking("");
        user66.assignProxy(parkingSpaceProxy67);
        parkingSpaceProxy67.displayPendingValidations();
        user30.parkingProxy = parkingSpaceProxy67;
        accountRegistry4.assignProxyToClient("pass", parkingSpaceProxy67);
        ParkingSystem.AccountRegistry accountRegistry83 = parkingSpaceProxy67.getRegistry();
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(client18);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "disabled" + "'", str40, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator48);
        org.junit.Assert.assertNotNull(parkingLotIterator49);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(accountRegistry83);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        int int7 = accountRegistry3.getManagersSize();
        boolean boolean13 = accountRegistry3.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj18 = parkingSpaceProxy15.login("empty", "Jane");
        parkingSpaceProxy15.validateClient("Jane");
        parkingSpaceProxy15.toggleSpace("", "staff", false);
        boolean boolean26 = parkingSpaceProxy15.cancelBooking("Jane");
        accountRegistry3.assignProxyToClient("pass", parkingSpaceProxy15);
        parkingSpaceProxy15.autoGenerateManager();
        parkingSpaceProxy15.toggleSpace("Paid $ 100.0 with Mobile Pay", "Jane", true);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade33 = parkingSpaceProxy15.getFacade();
        boolean boolean35 = parkingSpaceFacade33.checkOut("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        boolean boolean37 = parkingSpaceFacade33.cancelBooking("Jane");
        boolean boolean47 = parkingSpaceFacade33.confirmBooking("CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d", "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-d1718d6a-d18c-4eab-8cd1-c51deadfbd2f", 35, "disabled", (int) (short) 1, "8812812f-8c58-440e-9188-ca0b1f996ced", "");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parkingSpaceFacade33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("09622cbf-e665-45db-b1ad-365065947a20");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        ParkingSystem.Enabled enabled0 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot2 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking4 = null;
        boolean boolean5 = parkingLot2.assignBooking(0, booking4);
        boolean boolean7 = parkingLot2.isSpaceAvailable((int) '#');
        boolean boolean9 = parkingLot2.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot2.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking12 = parkingSpace11.getCurrentBooking();
        parkingSpace11.removeBooking();
        java.lang.String str14 = enabled0.scanSpace(parkingSpace11);
        ParkingSystem.ParkingLot parkingLot16 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking18 = null;
        boolean boolean19 = parkingLot16.assignBooking(0, booking18);
        boolean boolean21 = parkingLot16.isSpaceAvailable((int) '#');
        boolean boolean23 = parkingLot16.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace25 = parkingLot16.getParkingSpace((int) (byte) 10);
        int int26 = parkingSpace25.getSpaceId();
        ParkingSystem.Booking booking27 = parkingSpace25.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager28 = new ParkingSystem.SpaceManager();
        boolean boolean31 = spaceManager28.isSpaceAvailable("hi!", (int) '#');
        spaceManager28.toggleLot("disabled", false);
        ParkingSystem.Booking booking44 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean45 = spaceManager28.assignBooking("empty", (int) (short) 0, booking44);
        boolean boolean46 = parkingSpace25.assignBooking(booking44);
        java.lang.String str47 = enabled0.scanSpace(parkingSpace25);
        boolean boolean48 = parkingSpace25.isAvailable();
        int int49 = parkingSpace25.getSpaceId();
        ParkingSystem.Disabled disabled50 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace51 = null;
        java.lang.String str52 = disabled50.scanSpace(parkingSpace51);
        ParkingSystem.ParkingLot parkingLot54 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking56 = null;
        boolean boolean57 = parkingLot54.assignBooking(0, booking56);
        boolean boolean59 = parkingLot54.isSpaceAvailable((int) '#');
        boolean boolean61 = parkingLot54.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace63 = parkingLot54.getParkingSpace((int) (byte) 10);
        ParkingSystem.ParkingSpace parkingSpace65 = parkingLot54.getParkingSpace((int) (byte) 0);
        ParkingSystem.Booking booking66 = parkingSpace65.getCurrentBooking();
        java.lang.String str67 = disabled50.scanSpace(parkingSpace65);
        parkingSpace25.setState((ParkingSystem.SpaceState) disabled50);
        ParkingSystem.Booking booking76 = new ParkingSystem.Booking("9fJ5pCUl", "Refunded total cost of $10.0", (int) (byte) 0, "fhd49ADb", 1, "Refunded total cost of $-1.0", (double) (byte) 100);
        boolean boolean77 = parkingSpace25.assignBooking(booking76);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "empty" + "'", str14, "empty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNull(booking27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "disabled" + "'", str47, "disabled");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "disabled" + "'", str52, "disabled");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(parkingSpace63);
        org.junit.Assert.assertNotNull(parkingSpace65);
        org.junit.Assert.assertNull(booking66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "disabled" + "'", str67, "disabled");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        ParkingSystem.Booking booking4 = null;
        boolean boolean5 = parkingLot1.assignBooking((int) (short) 1, booking4);
        parkingLot1.removeBooking((int) (short) 0);
        parkingLot1.removeBooking(10);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot1.getParkingSpace((int) (short) 10);
        ParkingSystem.ParkingLot parkingLot13 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking15 = null;
        boolean boolean16 = parkingLot13.assignBooking(0, booking15);
        boolean boolean18 = parkingLot13.isSpaceAvailable((int) '#');
        boolean boolean20 = parkingLot13.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace22 = parkingLot13.getParkingSpace((int) (byte) 10);
        ParkingSystem.ParkingSpace parkingSpace24 = parkingLot13.getParkingSpace((int) (byte) 0);
        java.lang.String str25 = parkingSpace24.scanSpace();
        ParkingSystem.Disabled disabled26 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace27 = null;
        java.lang.String str28 = disabled26.scanSpace(parkingSpace27);
        ParkingSystem.ParkingSpace parkingSpace29 = null;
        java.lang.String str30 = disabled26.scanSpace(parkingSpace29);
        ParkingSystem.ParkingLot parkingLot32 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking34 = null;
        boolean boolean35 = parkingLot32.assignBooking(0, booking34);
        boolean boolean37 = parkingLot32.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator38 = parkingLot32.getIterator();
        boolean boolean39 = parkingLotIterator38.hasNext();
        ParkingSystem.ParkingSpace parkingSpace40 = parkingLotIterator38.next();
        ParkingSystem.ParkingSpace parkingSpace41 = parkingLotIterator38.next();
        java.lang.String str42 = disabled26.scanSpace(parkingSpace41);
        parkingSpace24.setState((ParkingSystem.SpaceState) disabled26);
        parkingSpace11.setState((ParkingSystem.SpaceState) disabled26);
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertNotNull(parkingSpace24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "empty" + "'", str25, "empty");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "disabled" + "'", str28, "disabled");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "disabled" + "'", str30, "disabled");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "disabled" + "'", str42, "disabled");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.util.List<java.lang.String[]> strArrayList7 = cSVManager0.readCSV("staff");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList8 = cSVManager0.loadManagers();
// flaky "17) test3087(RegressionTest6)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList7);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry11 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager12 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry11);
        superManager7.registry = accountRegistry11;
        ParkingSystem.SuperManager superManager14 = ParkingSystem.SuperManager.createFromCSV("empty", "empty", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", accountRegistry11);
        java.lang.Object obj17 = accountRegistry11.login("CLT-08489cd1-5899-4594-ad65-2f6dcf0a9e5d", "CLT-5be1cd5a-d829-4101-9cd3-6006338eb786");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertNotNull(superManager12);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        paymentManager0.paymentMessage = "pass";
        paymentManager0.paymentMessage = "Paid $ -1.0 with Mobile Pay";
        paymentManager0.paymentMessage = "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7";
        ParkingSystem.Strategy strategy10 = null;
        paymentManager0.setStrategy(strategy10);
        boolean boolean16 = paymentManager0.processPayment("12fea0ad-7859-47d9-95f1-1985d2c4ed33", (-1.0d), "Paid $ 10.0 with Mobile Pay", "CLT-55105d92-54d6-44d2-965a-736022b7f7cd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        java.lang.String str7 = paymentManager0.refundMessage;
        boolean boolean9 = paymentManager0.refundTotalCost((double) (short) 100);
        boolean boolean14 = paymentManager0.processPayment("hi!", (double) 0.0f, "empty", "Paid $ 10.0 with Mobile Pay");
        paymentManager0.paymentMessage = "Paid $ -1.0 with Mobile Pay";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Refunded total cost of $1.0" + "'", str7, "Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable(0);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) ' ');
        boolean boolean11 = parkingLot1.isEnabled();
        ParkingSystem.ParkingSpace parkingSpace13 = parkingLot1.getParkingSpace((int) 'a');
        ParkingSystem.ParkingSpace parkingSpace15 = parkingLot1.getParkingSpace((int) (short) -1);
        parkingSpace15.removeBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertNotNull(parkingSpace15);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade9 = parkingSpaceProxy4.getFacade();
        boolean boolean11 = parkingSpaceFacade9.checkOut("Paid $ 0.0 with Mobile Pay");
        ParkingSystem.BookingManager bookingManager12 = parkingSpaceFacade9.getBookingManager();
        ParkingSystem.BookingManager bookingManager13 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager14 = new ParkingSystem.CheckInManager(bookingManager13);
        ParkingSystem.SpaceManager spaceManager15 = bookingManager13.getSpaceManager();
        double double18 = bookingManager13.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit19 = new ParkingSystem.DebitOrCredit();
        bookingManager13.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit19);
        boolean boolean25 = debitOrCredit19.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str26 = debitOrCredit19.getPaymentMessage();
        boolean boolean29 = debitOrCredit19.validateCard("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", (double) (short) 1);
        bookingManager12.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit19);
        boolean boolean33 = debitOrCredit19.validateCard("staff", (double) 1L);
        java.lang.String str34 = debitOrCredit19.getPaymentMessage();
        boolean boolean37 = debitOrCredit19.validateCard("83a51dc6-0c8f-4f21-ae40-68699828f95d", (double) (short) -1);
        org.junit.Assert.assertNotNull(client0);
// flaky "18) test3092(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Refunded total cost of $1.0" + "'", str1, "Refunded total cost of $1.0");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookingManager12);
        org.junit.Assert.assertNotNull(spaceManager15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 165.0d + "'", double18 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Card number should be 16 digits" + "'", str26, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Card number should be 16 digits" + "'", str34, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        ParkingSystem.Booking booking12 = parkingSpace10.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager13 = new ParkingSystem.SpaceManager();
        boolean boolean16 = spaceManager13.isSpaceAvailable("hi!", (int) '#');
        spaceManager13.toggleLot("disabled", false);
        ParkingSystem.Booking booking29 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean30 = spaceManager13.assignBooking("empty", (int) (short) 0, booking29);
        boolean boolean31 = parkingSpace10.assignBooking(booking29);
        ParkingSystem.SpaceManager spaceManager32 = new ParkingSystem.SpaceManager();
        boolean boolean35 = spaceManager32.isSpaceAvailable("hi!", (int) '#');
        spaceManager32.toggleLot("disabled", false);
        ParkingSystem.Booking booking48 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean49 = spaceManager32.assignBooking("empty", (int) (short) 0, booking48);
        boolean boolean50 = booking48.isCheckedIn();
        java.lang.String str51 = booking48.getClientId();
        boolean boolean52 = parkingSpace10.assignBooking(booking48);
        ParkingSystem.Booking booking53 = parkingSpace10.getCurrentBooking();
        boolean boolean54 = booking53.isCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "staff" + "'", str51, "staff");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(booking53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        ParkingSystem.AccountRegistry accountRegistry3 = null;
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "433f3d1f-f758-4ae3-972b-7fb179aedfd7", "4a1f2343-8b2e-4dea-ba69-efd105414390", accountRegistry3);
        java.lang.String str5 = superManager4.getPassword();
        superManager4.validateClient("Jane");
        superManager4.validateClient("Paid $ 1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        ParkingSystem.AccountRegistry accountRegistry3 = null;
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "433f3d1f-f758-4ae3-972b-7fb179aedfd7", "4a1f2343-8b2e-4dea-ba69-efd105414390", accountRegistry3);
        java.lang.String str5 = superManager4.getPassword();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.getRegistry();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4CGFxoSEo5" + "'", str6, "4CGFxoSEo5");
        org.junit.Assert.assertNotNull(accountRegistry7);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        boolean boolean11 = parkingSpace10.isAvailable();
        int int12 = parkingSpace10.getSpaceId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap3 = bookingManager0.getActiveBookings();
        double double6 = bookingManager0.calculateCost("CLT-035180a0-4707-410d-a011-2a4f0f46838b", (int) (short) 0);
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap7 = bookingManager0.getActiveBookings();
        ParkingSystem.Booking booking9 = bookingManager0.getBooking("FNuxCiXmkP");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap10 = bookingManager0.getActiveBookings();
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(booking9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.validateClient("Jane");
        parkingSpaceProxy3.toggleSpace("", "staff", false);
        boolean boolean14 = parkingSpaceProxy3.cancelBooking("");
        boolean boolean20 = parkingSpaceProxy3.register("jane", "jane", "Jane", "hi!", "disabled");
        accountRegistry1.assignProxyToManager("empty", parkingSpaceProxy3);
        parkingSpaceProxy3.toggleSpace("89de8237-29df-4908-9de4-6dc1ce90de94", "CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c", true);
        boolean boolean27 = parkingSpaceProxy3.cancelBooking("K6PkM9rcCx");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
        parkingSpaceFacade17.addParkingLot("Paid $ 10.0 with Mobile Pay");
        parkingSpaceFacade17.toggleSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", false);
        ParkingSystem.Booking booking25 = parkingSpaceFacade17.getBookingDetails("staff");
        boolean boolean27 = parkingSpaceFacade17.cancelBooking("CLT-93b11069-2e34-4ef4-bf17-b3bb8758882b");
        ParkingSystem.BookingManager bookingManager28 = parkingSpaceFacade17.getBookingManager();
        boolean boolean32 = parkingSpaceFacade17.editBooking("WxoDOyjI", "8bf217fa-1769-4d04-858b-ce78fe94bf0c", 32);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jane" + "'", str6, "jane");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertNull(booking25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(bookingManager28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.paymentMessage = "staff";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (short) 0);
        boolean boolean7 = paymentManager0.refundWithoutDeposit((double) (-1.0f), (double) (short) -1);
        java.lang.String str8 = paymentManager0.refundMessage;
        paymentManager0.paymentMessage = "CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841";
        boolean boolean15 = paymentManager0.processPayment("89de8237-29df-4908-9de4-6dc1ce90de94", (double) 2, "Paid $ 100.0 with Mobile Pay", "Paid $ 1470.0 with Mobile Pay");
        java.lang.String str16 = paymentManager0.refundMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Refunded without deposit ($0.0)" + "'", str8, "Refunded without deposit ($0.0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Refunded without deposit ($0.0)" + "'", str16, "Refunded without deposit ($0.0)");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking11 = parkingSpace10.getCurrentBooking();
        ParkingSystem.Booking booking12 = parkingSpace10.getCurrentBooking();
        ParkingSystem.Disabled disabled13 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace14 = null;
        java.lang.String str15 = disabled13.scanSpace(parkingSpace14);
        ParkingSystem.ParkingSpace parkingSpace16 = null;
        java.lang.String str17 = disabled13.scanSpace(parkingSpace16);
        parkingSpace10.setState((ParkingSystem.SpaceState) disabled13);
        ParkingSystem.ParkingLot parkingLot20 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking22 = null;
        boolean boolean23 = parkingLot20.assignBooking(0, booking22);
        boolean boolean25 = parkingLot20.isSpaceAvailable((int) '#');
        boolean boolean27 = parkingLot20.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace29 = parkingLot20.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking30 = parkingSpace29.getCurrentBooking();
        parkingSpace29.removeBooking();
        parkingSpace29.removeBooking();
        java.lang.String str33 = disabled13.scanSpace(parkingSpace29);
        ParkingSystem.ParkingLot parkingLot35 = new ParkingSystem.ParkingLot("");
        ParkingSystem.ParkingLotIterator parkingLotIterator36 = parkingLot35.getIterator();
        ParkingSystem.ParkingSpace parkingSpace38 = parkingLot35.getParkingSpace((int) (byte) -1);
        java.lang.String str39 = disabled13.scanSpace(parkingSpace38);
        ParkingSystem.Enabled enabled40 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot42 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking44 = null;
        boolean boolean45 = parkingLot42.assignBooking(0, booking44);
        boolean boolean47 = parkingLot42.isSpaceAvailable((int) '#');
        boolean boolean49 = parkingLot42.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace51 = parkingLot42.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking52 = parkingSpace51.getCurrentBooking();
        parkingSpace51.removeBooking();
        java.lang.String str54 = enabled40.scanSpace(parkingSpace51);
        ParkingSystem.ParkingLot parkingLot56 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking58 = null;
        boolean boolean59 = parkingLot56.assignBooking(0, booking58);
        boolean boolean61 = parkingLot56.isSpaceAvailable((int) '#');
        boolean boolean63 = parkingLot56.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace65 = parkingLot56.getParkingSpace((int) (byte) 10);
        int int66 = parkingSpace65.getSpaceId();
        ParkingSystem.Booking booking67 = parkingSpace65.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager68 = new ParkingSystem.SpaceManager();
        boolean boolean71 = spaceManager68.isSpaceAvailable("hi!", (int) '#');
        spaceManager68.toggleLot("disabled", false);
        ParkingSystem.Booking booking84 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean85 = spaceManager68.assignBooking("empty", (int) (short) 0, booking84);
        boolean boolean86 = parkingSpace65.assignBooking(booking84);
        java.lang.String str87 = enabled40.scanSpace(parkingSpace65);
        boolean boolean88 = parkingSpace65.isAvailable();
        ParkingSystem.SpaceState spaceState89 = parkingSpace65.getState();
        int int90 = parkingSpace65.getSpaceId();
        java.lang.String str91 = disabled13.scanSpace(parkingSpace65);
        ParkingSystem.SpaceState spaceState92 = parkingSpace65.getState();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "disabled" + "'", str15, "disabled");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disabled" + "'", str17, "disabled");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertNull(booking30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "disabled" + "'", str33, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator36);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "disabled" + "'", str39, "disabled");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(parkingSpace51);
        org.junit.Assert.assertNull(booking52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "empty" + "'", str54, "empty");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(parkingSpace65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNull(booking67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "disabled" + "'", str87, "disabled");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(spaceState89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "disabled" + "'", str91, "disabled");
        org.junit.Assert.assertNotNull(spaceState92);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isSpaceAvailable((int) (byte) 100);
        boolean boolean10 = parkingLot1.isEnabled();
        boolean boolean11 = parkingLot1.isEnabled();
        ParkingSystem.ParkingLot parkingLot14 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking16 = null;
        boolean boolean17 = parkingLot14.assignBooking(0, booking16);
        boolean boolean19 = parkingLot14.isSpaceAvailable((int) '#');
        boolean boolean21 = parkingLot14.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace23 = parkingLot14.getParkingSpace((int) (byte) 10);
        int int24 = parkingSpace23.getSpaceId();
        ParkingSystem.Booking booking25 = parkingSpace23.getCurrentBooking();
        java.lang.String str26 = parkingSpace23.scanSpace();
        ParkingSystem.Enabled enabled27 = new ParkingSystem.Enabled();
        parkingSpace23.setState((ParkingSystem.SpaceState) enabled27);
        ParkingSystem.Enabled enabled29 = new ParkingSystem.Enabled();
        parkingSpace23.setState((ParkingSystem.SpaceState) enabled29);
        ParkingSystem.Booking booking38 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        double double39 = booking38.getTotalCost();
        java.lang.String str40 = booking38.getLotId();
        boolean boolean41 = booking38.isCheckedIn();
        booking38.setStartTime("Refunded total cost of $1.0");
        boolean boolean44 = parkingSpace23.assignBooking(booking38);
        boolean boolean45 = parkingLot1.assignBooking((int) (short) 1, booking38);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(booking25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "empty" + "'", str26, "empty");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "jane" + "'", str40, "jane");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        boolean boolean8 = bookingManager0.extendBooking("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", (int) ' ', "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "Paid $ 0.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry9 = bookingManager0.getAccountRegistry();
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(accountRegistry9);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        boolean boolean26 = bookingManager0.confirmBooking("empty", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Refunded total cost of $1.0", (int) (byte) 1, "Card number should be 16 digits", 32, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "disabled");
        ParkingSystem.BookingManager bookingManager27 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager28 = new ParkingSystem.CheckInManager(bookingManager27);
        ParkingSystem.SpaceManager spaceManager29 = bookingManager27.getSpaceManager();
        double double32 = bookingManager27.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit33 = new ParkingSystem.DebitOrCredit();
        bookingManager27.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit33);
        boolean boolean39 = debitOrCredit33.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str40 = debitOrCredit33.getPaymentMessage();
        boolean boolean43 = debitOrCredit33.validateCard("pass", (double) 100.0f);
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit33);
        java.lang.String str45 = debitOrCredit33.getPaymentMessage();
        boolean boolean50 = debitOrCredit33.processPayment("89de8237-29df-4908-9de4-6dc1ce90de94", 1515.0d, "Refunded total cost of $-1.0", "CLT-035180a0-4707-410d-a011-2a4f0f46838b");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(spaceManager29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 165.0d + "'", double32 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Card number should be 16 digits" + "'", str40, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Card number should be 16 digits" + "'", str45, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        parkingLot1.removeBooking((int) ' ');
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot1.getParkingSpace(0);
        ParkingSystem.ParkingSpace parkingSpace13 = parkingLot1.getParkingSpace((int) '#');
        ParkingSystem.ParkingLot parkingLot15 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking17 = null;
        boolean boolean18 = parkingLot15.assignBooking(0, booking17);
        boolean boolean20 = parkingLot15.isSpaceAvailable((int) '#');
        boolean boolean22 = parkingLot15.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace24 = parkingLot15.getParkingSpace((int) (byte) 10);
        int int25 = parkingSpace24.getSpaceId();
        ParkingSystem.Booking booking26 = parkingSpace24.getCurrentBooking();
        java.lang.String str27 = parkingSpace24.scanSpace();
        ParkingSystem.Enabled enabled28 = new ParkingSystem.Enabled();
        parkingSpace24.setState((ParkingSystem.SpaceState) enabled28);
        ParkingSystem.ParkingLot parkingLot31 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking33 = null;
        boolean boolean34 = parkingLot31.assignBooking(0, booking33);
        boolean boolean36 = parkingLot31.isSpaceAvailable((int) '#');
        boolean boolean38 = parkingLot31.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace40 = parkingLot31.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking41 = parkingSpace40.getCurrentBooking();
        parkingSpace40.removeBooking();
        int int43 = parkingSpace40.getSpaceId();
        ParkingSystem.Booking booking51 = new ParkingSystem.Booking("jane", "Paid $ 10.0 with Mobile Pay", (-1), "Paid $ 10.0 with Mobile Pay", (int) (short) 1, "hi!", (double) 100);
        boolean boolean52 = parkingSpace40.assignBooking(booking51);
        java.lang.String str53 = enabled28.scanSpace(parkingSpace40);
        ParkingSystem.Booking booking61 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        double double62 = booking61.getTotalCost();
        java.lang.String str63 = booking61.getLotId();
        int int64 = booking61.getDuration();
        boolean boolean65 = parkingSpace40.assignBooking(booking61);
        boolean boolean66 = parkingSpace13.assignBooking(booking61);
        booking61.setStartTime("CLT-32d5cdc9-3c20-4f30-9d68-0be20fdf349c");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(parkingSpace24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(booking26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "empty" + "'", str27, "empty");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertNull(booking41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "jane" + "'", str63, "jane");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 32 + "'", int64 == 32);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        boolean boolean7 = parkingSpaceProxy0.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean11 = parkingSpaceProxy0.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean14 = parkingSpaceProxy0.extendBooking("", 0);
        parkingSpaceProxy0.validateClient("Paid $ -1.0 with Mobile Pay");
        boolean boolean18 = parkingSpaceProxy0.checkOut("721fcb72-c57d-4e99-81b7-06e4c7e1ed40");
        ParkingSystem.Booking booking20 = parkingSpaceProxy0.getBookingDetails("H33Itw4InT");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(booking20);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        java.lang.String str11 = client0.getName();
        client0.setClientInfo("pass", "empty", "Jane", "pass", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", false);
        client0.setValidated(true);
        ParkingSystem.Booking booking22 = client0.getBookingDetails();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "jane" + "'", str10, "jane");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "empty" + "'", str11, "empty");
        org.junit.Assert.assertNull(booking22);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        double double7 = bookingManager0.getDeposit("staff");
        boolean boolean11 = bookingManager0.editBooking("", "Paid $ -1.0 with Mobile Pay", (int) 'a');
        boolean boolean15 = bookingManager0.editBooking("jane", "pass", (int) '4');
        boolean boolean17 = bookingManager0.cancelBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        ParkingSystem.CheckInManager checkInManager18 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking20 = bookingManager0.getBooking("CLT-6bf41de3-8b5a-4cee-8fc7-f8abc4e5b750");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(booking20);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        boolean boolean13 = client0.checkIn();
        boolean boolean14 = client0.checkIn();
        boolean boolean15 = client0.checkOut();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        double double8 = booking7.getTotalCost();
        java.lang.String str9 = booking7.getLotId();
        boolean boolean10 = booking7.isCheckedIn();
        booking7.setDuration((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = booking7.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jane" + "'", str9, "jane");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        ParkingSystem.BookingManager bookingManager3 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager4 = new ParkingSystem.CheckInManager(bookingManager3);
        ParkingSystem.Booking booking6 = bookingManager3.getBooking("");
        ParkingSystem.SpaceManager spaceManager7 = bookingManager3.getSpaceManager();
        double double9 = bookingManager3.getDeposit("Jane");
        ParkingSystem.AccountRegistry accountRegistry10 = bookingManager3.getAccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("Refunded total cost of $-1.0", "hi!", "Refunded without deposit ($-42.0)", accountRegistry10);
        ParkingSystem.AccountRegistry accountRegistry12 = superManager11.getRegistry();
        java.lang.String str13 = superManager11.getPassword();
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertNotNull(spaceManager7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        java.lang.String str11 = client0.getName();
        java.lang.String str12 = client0.getName();
        boolean boolean13 = client0.checkIn();
        java.lang.String str14 = client0.getPassword();
        java.lang.String str15 = client0.getUsername();
        ParkingSystem.Client client16 = ParkingSystem.Client.getInstance();
        java.lang.String str17 = client16.getName();
        client16.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy20 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry21 = parkingSpaceProxy20.getRegistry();
        boolean boolean23 = parkingSpaceProxy20.checkIn("");
        client16.assignProxy(parkingSpaceProxy20);
        boolean boolean25 = client16.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy26 = new ParkingSystem.ParkingSpaceProxy();
        client16.assignProxy(parkingSpaceProxy26);
        boolean boolean37 = parkingSpaceProxy26.confirmBooking("staff", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "", "Paid $ -1.0 with Mobile Pay", 10, "Refunded without deposit ($0.0)", (int) (short) 0, "Paid $ 0.0 with Mobile Pay", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        boolean boolean41 = parkingSpaceProxy26.editBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Paid $ 0.0 with Mobile Pay", 0);
        client0.assignProxy(parkingSpaceProxy26);
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disabled" + "'", str14, "disabled");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(client16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(accountRegistry21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        ParkingSystem.AccountRegistry accountRegistry3 = null;
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("disabled", "staff", "staff", accountRegistry3);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy8 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry9 = parkingSpaceProxy8.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj14 = parkingSpaceProxy11.login("empty", "Jane");
        parkingSpaceProxy11.validateClient("Jane");
        parkingSpaceProxy11.toggleSpace("", "staff", false);
        accountRegistry9.assignProxyToManager("pass", parkingSpaceProxy11);
        ParkingSystem.Client client23 = accountRegistry9.getClient("");
        ParkingSystem.SuperManager superManager24 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry9);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry26 = superManager4.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry31 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager32 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry31);
        superManager32.setManagerInfo("Paid $ 0.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", "Refunded total cost of $1.0");
        ParkingSystem.User user37 = new ParkingSystem.User();
        java.lang.Object obj38 = user37.user;
        ParkingSystem.Client client39 = ParkingSystem.Client.getInstance();
        java.lang.String str40 = client39.getName();
        client39.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy43 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry44 = parkingSpaceProxy43.getRegistry();
        boolean boolean46 = parkingSpaceProxy43.checkIn("");
        client39.assignProxy(parkingSpaceProxy43);
        boolean boolean48 = client39.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy49 = new ParkingSystem.ParkingSpaceProxy();
        client39.assignProxy(parkingSpaceProxy49);
        ParkingSystem.AccountRegistry accountRegistry51 = parkingSpaceProxy49.getRegistry();
        boolean boolean53 = parkingSpaceProxy49.checkIn("hi!");
        user37.parkingProxy = parkingSpaceProxy49;
        superManager32.assignProxy(parkingSpaceProxy49);
        accountRegistry26.assignProxyToManager("jane", parkingSpaceProxy49);
        boolean boolean58 = accountRegistry26.requiresValidation("3b453211-7dd1-4452-8741-a206711c1217");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(accountRegistry9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(client23);
        org.junit.Assert.assertNotNull(superManager24);
        org.junit.Assert.assertNotNull(accountRegistry26);
        org.junit.Assert.assertNotNull(superManager32);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(client39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(accountRegistry44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(accountRegistry51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        ParkingSystem.Booking booking6 = null;
        boolean boolean7 = parkingLot1.assignBooking(1, booking6);
        ParkingSystem.ParkingLot parkingLot10 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking12 = null;
        boolean boolean13 = parkingLot10.assignBooking(0, booking12);
        boolean boolean15 = parkingLot10.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking24 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean25 = parkingLot10.assignBooking((int) (short) -1, booking24);
        java.lang.String str26 = booking24.getLotId();
        boolean boolean27 = parkingLot1.assignBooking(0, booking24);
        ParkingSystem.ParkingLotIterator parkingLotIterator28 = parkingLot1.getIterator();
        ParkingSystem.ParkingSpace parkingSpace29 = parkingLotIterator28.next();
        boolean boolean30 = parkingLotIterator28.hasNext();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "jane" + "'", str26, "jane");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator28);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.AccountRegistry accountRegistry20 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry20);
        java.lang.String str22 = superManager21.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry23 = superManager21.registry;
        java.lang.String str24 = superManager21.getManagerId();
        ParkingSystem.Client client25 = ParkingSystem.Client.getInstance();
        java.lang.String str26 = client25.getName();
        client25.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy29 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry30 = parkingSpaceProxy29.getRegistry();
        boolean boolean32 = parkingSpaceProxy29.checkIn("");
        client25.assignProxy(parkingSpaceProxy29);
        boolean boolean34 = client25.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy35 = new ParkingSystem.ParkingSpaceProxy();
        client25.assignProxy(parkingSpaceProxy35);
        superManager21.assignProxy(parkingSpaceProxy35);
        user0.assignProxy(parkingSpaceProxy35);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy39 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry40 = parkingSpaceProxy39.getRegistry();
        boolean boolean46 = parkingSpaceProxy39.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean50 = parkingSpaceProxy39.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean60 = parkingSpaceProxy39.confirmBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff", "disabled", (int) (short) 0, "Paid $ 100.0 with Mobile Pay", (int) (short) 10, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        boolean boolean62 = parkingSpaceProxy39.checkOut("Card number should be 16 digits");
        parkingSpaceProxy39.autoGenerateManager();
        user0.parkingProxy = parkingSpaceProxy39;
        java.lang.Object obj65 = user0.user;
        ParkingSystem.AccountRegistry accountRegistry69 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager70 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry69);
        java.lang.String str71 = superManager70.getManagerId();
        java.lang.String str72 = superManager70.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry73 = superManager70.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry80 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager81 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry80);
        boolean boolean83 = accountRegistry80.requiresValidation("disabled");
        int int84 = accountRegistry80.getManagersSize();
        ParkingSystem.SuperManager superManager85 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry80);
        ParkingSystem.AccountRegistry accountRegistry86 = superManager85.getRegistry();
        superManager70.registry = accountRegistry86;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy88 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade89 = parkingSpaceProxy88.getFacade();
        superManager70.assignProxy(parkingSpaceProxy88);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade91 = parkingSpaceProxy88.getFacade();
        ParkingSystem.AccountRegistry accountRegistry92 = parkingSpaceProxy88.getRegistry();
        user0.assignProxy(parkingSpaceProxy88);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str22, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str24, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(accountRegistry30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(accountRegistry40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(superManager70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str71, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str72, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry73);
        org.junit.Assert.assertNotNull(superManager81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(superManager85);
        org.junit.Assert.assertNotNull(accountRegistry86);
        org.junit.Assert.assertNotNull(parkingSpaceFacade89);
        org.junit.Assert.assertNotNull(parkingSpaceFacade91);
        org.junit.Assert.assertNotNull(accountRegistry92);
    }

//    @Test
//    public void test3116() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest6.test3116");
//        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
//        boolean boolean5 = mobilePay0.processPayment("hi!", (-1.0d), "", "");
//        boolean boolean10 = mobilePay0.processPayment("staff", (double) (-1L), "disabled", "pass");
//        java.lang.String str11 = mobilePay0.getPaymentMessage();
//        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
//        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str11, "Paid $ -1.0 with Mobile Pay");
//    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        ParkingSystem.ParkingSpace parkingSpace1 = new ParkingSystem.ParkingSpace(10);
        ParkingSystem.ParkingLot parkingLot3 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking5 = null;
        boolean boolean6 = parkingLot3.assignBooking(0, booking5);
        boolean boolean8 = parkingLot3.isSpaceAvailable((int) '#');
        boolean boolean10 = parkingLot3.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot3.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking13 = parkingSpace12.getCurrentBooking();
        ParkingSystem.Booking booking14 = parkingSpace12.getCurrentBooking();
        ParkingSystem.Disabled disabled15 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace16 = null;
        java.lang.String str17 = disabled15.scanSpace(parkingSpace16);
        ParkingSystem.ParkingSpace parkingSpace18 = null;
        java.lang.String str19 = disabled15.scanSpace(parkingSpace18);
        parkingSpace12.setState((ParkingSystem.SpaceState) disabled15);
        parkingSpace1.setState((ParkingSystem.SpaceState) disabled15);
        ParkingSystem.ParkingLot parkingLot23 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking25 = null;
        boolean boolean26 = parkingLot23.assignBooking(0, booking25);
        boolean boolean28 = parkingLot23.isSpaceAvailable((int) '#');
        boolean boolean30 = parkingLot23.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace32 = parkingLot23.getParkingSpace((int) (byte) 10);
        int int33 = parkingSpace32.getSpaceId();
        java.lang.String str34 = parkingSpace32.scanSpace();
        java.lang.String str35 = disabled15.scanSpace(parkingSpace32);
        ParkingSystem.ParkingLot parkingLot37 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking39 = null;
        boolean boolean40 = parkingLot37.assignBooking(0, booking39);
        ParkingSystem.Booking booking42 = null;
        boolean boolean43 = parkingLot37.assignBooking(1, booking42);
        ParkingSystem.ParkingLotIterator parkingLotIterator44 = parkingLot37.getIterator();
        ParkingSystem.ParkingSpace parkingSpace45 = parkingLotIterator44.next();
        boolean boolean46 = parkingSpace45.isAvailable();
        ParkingSystem.Booking booking47 = parkingSpace45.getCurrentBooking();
        java.lang.String str48 = disabled15.scanSpace(parkingSpace45);
        ParkingSystem.ParkingLot parkingLot50 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking52 = null;
        boolean boolean53 = parkingLot50.assignBooking(0, booking52);
        ParkingSystem.Booking booking55 = null;
        boolean boolean56 = parkingLot50.assignBooking(1, booking55);
        ParkingSystem.ParkingLot parkingLot59 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking61 = null;
        boolean boolean62 = parkingLot59.assignBooking(0, booking61);
        boolean boolean64 = parkingLot59.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking73 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean74 = parkingLot59.assignBooking((int) (short) -1, booking73);
        java.lang.String str75 = booking73.getLotId();
        boolean boolean76 = parkingLot50.assignBooking(0, booking73);
        java.lang.String str77 = booking73.getStartTime();
        boolean boolean78 = parkingSpace45.assignBooking(booking73);
        java.lang.String str79 = booking73.getLicensePlate();
        java.lang.String str80 = booking73.getLicensePlate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disabled" + "'", str17, "disabled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "empty" + "'", str34, "empty");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "disabled" + "'", str35, "disabled");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator44);
        org.junit.Assert.assertNotNull(parkingSpace45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(booking47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "disabled" + "'", str48, "disabled");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "jane" + "'", str75, "jane");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Jane" + "'", str77, "Jane");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "disabled" + "'", str79, "disabled");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "disabled" + "'", str80, "disabled");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        ParkingSystem.ParkingSpace parkingSpace1 = new ParkingSystem.ParkingSpace((int) (short) -1);
        java.lang.String str2 = parkingSpace1.scanSpace();
        ParkingSystem.Booking booking10 = new ParkingSystem.Booking("disabled", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (short) 1, "13b04414-31a5-407f-8ea3-fba4613c73d1", (int) (byte) 100, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", (double) 0L);
        boolean boolean11 = parkingSpace1.assignBooking(booking10);
        java.lang.String str12 = booking10.getClientId();
        java.lang.String str13 = booking10.getStartTime();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "empty" + "'", str2, "empty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13b04414-31a5-407f-8ea3-fba4613c73d1" + "'", str13, "13b04414-31a5-407f-8ea3-fba4613c73d1");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean4 = parkingSpaceFacade0.editBooking("empty", "9fJ5pCUl", (int) (byte) 10);
        parkingSpaceFacade0.addParkingLot("Paid $ 1470.0 with Mobile Pay");
        boolean boolean8 = parkingSpaceFacade0.cancelBooking("Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkOut("");
        boolean boolean5 = checkInManager1.checkIn("jane");
        boolean boolean7 = checkInManager1.checkOut("e8686ac8-1df7-4a9b-b299-8fbcdd585528");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        superManager4.setManagerInfo("Paid $ 0.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", "Refunded total cost of $1.0");
        superManager4.validateClient("CLT-b6a8264c-f386-4429-b59c-b7f465002e13");
        ParkingSystem.AccountRegistry accountRegistry11 = superManager4.registry;
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(accountRegistry11);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        boolean boolean9 = client0.confirmBooking("", "pass", (int) (byte) 0, "Paid $ 10.0 with Mobile Pay", (int) (byte) 0, "", "Jane");
        java.lang.String str10 = client0.getUsername();
        boolean boolean12 = client0.extendBooking((-1));
        boolean boolean13 = client0.getIsValidated();
        client0.setClientInfo("CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "hi!", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "CLT-b6a8264c-f386-4429-b59c-b7f465002e13", true);
        java.lang.String str22 = client0.getClientId();
        org.junit.Assert.assertNotNull(client0);
// flaky "19) test3122(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLT-30fd593b-dedd-41b3-a919-c48700301f41" + "'", str1, "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "12) test3122(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Refunded total cost of $1.0" + "'", str10, "Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str22, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        ParkingSystem.ParkingSpace parkingSpace1 = new ParkingSystem.ParkingSpace((int) '4');
        ParkingSystem.SpaceState spaceState2 = parkingSpace1.getState();
        ParkingSystem.Booking booking3 = parkingSpace1.getCurrentBooking();
        org.junit.Assert.assertNotNull(spaceState2);
        org.junit.Assert.assertNull(booking3);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        boolean boolean16 = accountRegistry6.registerClient("Paid $ 10.0 with Mobile Pay", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        accountRegistry6.validateClient("staff");
        boolean boolean24 = accountRegistry6.registerClient("Refunded without deposit ($-96.0)", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        ParkingSystem.SuperManager superManager25 = ParkingSystem.SuperManager.createFromCSV("qPYDfDnbtD", "hi!", "", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry26 = superManager25.getRegistry();
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(accountRegistry26);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean10 = parkingSpaceFacade0.confirmBooking("staff", "", "disabled", "hi!", (int) 'a', "jane", (int) 'a', "hi!", "");
        parkingSpaceFacade0.toggleLot("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", true);
        boolean boolean15 = parkingSpaceFacade0.checkOut("4a1f2343-8b2e-4dea-ba69-efd105414390");
        ParkingSystem.BookingManager bookingManager16 = parkingSpaceFacade0.getBookingManager();
        boolean boolean18 = parkingSpaceFacade0.cancelBooking("Paid $ -1.0 with Mobile Pay");
        boolean boolean20 = parkingSpaceFacade0.checkIn("721fcb72-c57d-4e99-81b7-06e4c7e1ed40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.toggleSpace("Refunded without deposit ($0.0)", "disabled", false);
        spaceManager0.toggleSpace("CLT-55105d92-54d6-44d2-965a-736022b7f7cd", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        ParkingSystem.MobilePay mobilePay4 = new ParkingSystem.MobilePay();
        boolean boolean9 = mobilePay4.processPayment("hi!", (-1.0d), "", "");
        boolean boolean14 = mobilePay4.processPayment("staff", (double) (-1L), "disabled", "pass");
        paymentManager0.setStrategy((ParkingSystem.Strategy) mobilePay4);
        java.lang.String str16 = paymentManager0.paymentMessage;
        boolean boolean18 = paymentManager0.refundTotalCost(100.0d);
        java.lang.String str19 = paymentManager0.paymentMessage;
        ParkingSystem.PaymentManager paymentManager20 = new ParkingSystem.PaymentManager();
        paymentManager20.refundMessage = "";
        boolean boolean24 = paymentManager20.refundTotalCost((double) (byte) 1);
        paymentManager20.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        boolean boolean29 = paymentManager20.refundWithoutDeposit((double) 1L, (double) 'a');
        java.lang.String str30 = paymentManager20.paymentMessage;
        boolean boolean35 = paymentManager20.processPayment("disabled", (double) (short) 1, "ST001", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.MobilePay mobilePay36 = new ParkingSystem.MobilePay();
        boolean boolean41 = mobilePay36.processPayment("disabled", 10.0d, "disabled", "disabled");
        boolean boolean46 = mobilePay36.processPayment("jane", 15.0d, "jane", "");
        paymentManager20.setStrategy((ParkingSystem.Strategy) mobilePay36);
        boolean boolean49 = paymentManager20.refundTotalCost((double) 0L);
        paymentManager20.refundMessage = "empty";
        ParkingSystem.DebitOrCredit debitOrCredit52 = new ParkingSystem.DebitOrCredit();
        java.lang.String str53 = debitOrCredit52.getPaymentMessage();
        boolean boolean56 = debitOrCredit52.validateCard("25527a32-01ef-45ba-816a-1d0a2fc2a52d", 1470.0d);
        paymentManager20.setStrategy((ParkingSystem.Strategy) debitOrCredit52);
        paymentManager0.setStrategy((ParkingSystem.Strategy) debitOrCredit52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str30, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        ParkingSystem.Manager manager7 = accountRegistry3.autoGenerateManager();
        java.util.List<ParkingSystem.Client> clientList8 = accountRegistry3.displayPendingValidations();
        accountRegistry3.validateClient("Jane");
        java.lang.Object obj13 = accountRegistry3.login("CLT-23b57c8a-84c7-41fe-9781-bfe8a8f3fc04", "CLT-92729d37-9255-42b4-9361-c1978aadacb0");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(clientList8);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        boolean boolean2 = client0.getIsValidated();
        client0.setValidated(false);
        java.lang.String str5 = client0.getExtraId();
        boolean boolean13 = client0.confirmBooking("Paid $ 1.0 with Mobile Pay", "Refunded total cost of $100.0", 1, "CLT-ee40679d-6eaa-440b-8126-6ccceac50ddc", (-1), "disabled", "Card number should be 16 digits");
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9701df9a-2178-4ad5-8076-46ff5f05b3e8" + "'", str1, "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str5, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry18 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry18);
        java.lang.String str20 = superManager19.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry24 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager25 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry24);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = null;
        accountRegistry24.assignProxyToManager("disabled", parkingSpaceProxy27);
        superManager19.registry = accountRegistry24;
        superManager4.registry = accountRegistry24;
        java.util.List<ParkingSystem.Client> clientList31 = accountRegistry24.displayPendingValidations();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy33 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry34 = parkingSpaceProxy33.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy36 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj39 = parkingSpaceProxy36.login("empty", "Jane");
        parkingSpaceProxy36.validateClient("Jane");
        parkingSpaceProxy36.toggleSpace("", "staff", false);
        accountRegistry34.assignProxyToManager("pass", parkingSpaceProxy36);
        accountRegistry24.assignProxyToManager("2afd610d-a8cb-413a-bbee-7927f86b526c", parkingSpaceProxy36);
        ParkingSystem.Manager manager48 = accountRegistry24.autoGenerateManager();
        int int49 = accountRegistry24.getManagersSize();
        boolean boolean51 = accountRegistry24.requiresValidation("CLT-631eb509-a6c4-407c-b16d-582a6faabddb");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str20, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(clientList31);
        org.junit.Assert.assertNotNull(accountRegistry34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(manager48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        java.lang.Object obj4 = accountRegistry1.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        boolean boolean6 = accountRegistry1.requiresValidation("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        java.lang.Object obj9 = accountRegistry1.login("86z9Z9e0MN", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        ParkingSystem.User user11 = new ParkingSystem.User();
        java.lang.Object obj12 = user11.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy13 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj16 = parkingSpaceProxy13.login("empty", "Jane");
        parkingSpaceProxy13.validateClient("Jane");
        java.lang.String str21 = parkingSpaceProxy13.scanSpace("", "");
        parkingSpaceProxy13.toggleSpace("", "disabled", true);
        user11.parkingProxy = parkingSpaceProxy13;
        boolean boolean28 = parkingSpaceProxy13.checkIn("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        accountRegistry1.assignProxyToManager("empty", parkingSpaceProxy13);
        parkingSpaceProxy13.autoGenerateManager();
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "disabled" + "'", str21, "disabled");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getHourlyRate("4a1f2343-8b2e-4dea-ba69-efd105414390");
        ParkingSystem.BookingManager bookingManager17 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager18 = new ParkingSystem.CheckInManager(bookingManager17);
        ParkingSystem.Booking booking20 = bookingManager17.getBooking("");
        ParkingSystem.SpaceManager spaceManager21 = bookingManager17.getSpaceManager();
        boolean boolean31 = bookingManager17.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double33 = bookingManager17.getDeposit("Paid $ 10.0 with Mobile Pay");
        boolean boolean43 = bookingManager17.confirmBooking("empty", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Refunded total cost of $1.0", (int) (byte) 1, "Card number should be 16 digits", 32, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "disabled");
        ParkingSystem.BookingManager bookingManager44 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager45 = new ParkingSystem.CheckInManager(bookingManager44);
        ParkingSystem.SpaceManager spaceManager46 = bookingManager44.getSpaceManager();
        double double49 = bookingManager44.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit50 = new ParkingSystem.DebitOrCredit();
        bookingManager44.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit50);
        boolean boolean56 = debitOrCredit50.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str57 = debitOrCredit50.getPaymentMessage();
        boolean boolean60 = debitOrCredit50.validateCard("pass", (double) 100.0f);
        bookingManager17.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit50);
        boolean boolean64 = debitOrCredit50.validateCard("Refunded without deposit ($-42.0)", 100.0d);
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit50);
        ParkingSystem.CheckInManager checkInManager66 = new ParkingSystem.CheckInManager(bookingManager0);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertNull(booking20);
        org.junit.Assert.assertNotNull(spaceManager21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 15.0d + "'", double33 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(spaceManager46);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 165.0d + "'", double49 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Card number should be 16 digits" + "'", str57, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        java.lang.String str7 = paymentManager0.refundMessage;
        boolean boolean9 = paymentManager0.refundTotalCost((double) (short) 100);
        boolean boolean11 = paymentManager0.refundTotalCost(0.0d);
        paymentManager0.paymentMessage = "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f";
        boolean boolean15 = paymentManager0.refundDeposit(15.0d);
        boolean boolean20 = paymentManager0.processPayment("", 795.0d, "aa9c00f6-ec11-46c5-a72b-a7f620703e51", "CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Refunded total cost of $1.0" + "'", str7, "Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade9 = parkingSpaceProxy4.getFacade();
        boolean boolean11 = parkingSpaceFacade9.checkOut("Paid $ 0.0 with Mobile Pay");
        ParkingSystem.SpaceManager spaceManager12 = parkingSpaceFacade9.getSpaceManager();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Refunded without deposit ($-96.0)" + "'", str1, "Refunded without deposit ($-96.0)");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(spaceManager12);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        double double5 = bookingManager0.getHourlyRate("disabled");
        ParkingSystem.BookingManager bookingManager6 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager7 = new ParkingSystem.CheckInManager(bookingManager6);
        ParkingSystem.SpaceManager spaceManager8 = bookingManager6.getSpaceManager();
        double double11 = bookingManager6.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit12 = new ParkingSystem.DebitOrCredit();
        bookingManager6.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit12);
        boolean boolean18 = debitOrCredit12.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit12);
        ParkingSystem.CheckInManager checkInManager20 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean22 = bookingManager0.cancelBooking("9fJ5pCUl");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 165.0d + "'", double11 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("4a1f2343-8b2e-4dea-ba69-efd105414390", "CLT-be0c8baf-d002-4bd3-a0a4-b45542b3f61e", 10, "", (int) (byte) -1, "CLT-23b57c8a-84c7-41fe-9781-bfe8a8f3fc04", (double) (byte) 0);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        boolean boolean6 = parkingSpaceFacade0.editBooking("Jane", "staff", (int) (short) 100);
        boolean boolean9 = parkingSpaceFacade0.extendBooking("empty", 100);
        ParkingSystem.CheckInManager checkInManager10 = parkingSpaceFacade0.getCheckInManager();
        checkInManager10.refundMessage = "hi!";
        boolean boolean14 = checkInManager10.checkOut("4a1f2343-8b2e-4dea-ba69-efd105414390");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInManager10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy13 = null;
        client0.assignProxy(parkingSpaceProxy13);
        client0.setClientInfo("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "Paid $ -1.0 with Mobile Pay", "2afd610d-a8cb-413a-bbee-7927f86b526c", "2afd610d-a8cb-413a-bbee-7927f86b526c", "empty", "disabled", false);
        java.lang.String str23 = client0.getClientType();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Refunded without deposit ($-96.0)" + "'", str1, "Refunded without deposit ($-96.0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "empty" + "'", str23, "empty");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        int int12 = accountRegistry6.getManagersSize();
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        java.lang.String str11 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap12 = spaceManager0.getParkingLots();
        boolean boolean15 = spaceManager0.isSpaceAvailable("staff", (int) '4');
        spaceManager0.removeBooking("Paid $ 100.0 with Mobile Pay", (int) (byte) 0);
        ParkingSystem.Booking booking28 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        int int29 = booking28.getDuration();
        java.lang.String str30 = booking28.getClientId();
        booking28.setCheckedIn(true);
        booking28.setStartTime("Paid $ -1.0 with Mobile Pay");
        boolean boolean35 = spaceManager0.assignBooking("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", (int) (byte) 1, booking28);
        int int36 = booking28.getDuration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "staff" + "'", str30, "staff");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit6 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit6);
        boolean boolean12 = debitOrCredit6.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str13 = debitOrCredit6.getPaymentMessage();
        boolean boolean18 = debitOrCredit6.processPayment("9701df9a-2178-4ad5-8076-46ff5f05b3e8", 0.0d, "disabled", "");
        boolean boolean21 = debitOrCredit6.validateCard("empty", (double) '4');
        java.lang.String str22 = debitOrCredit6.getPaymentMessage();
        java.lang.String str23 = debitOrCredit6.getPaymentMessage();
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Card number should be 16 digits" + "'", str13, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Card number should be 16 digits" + "'", str22, "Card number should be 16 digits");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Card number should be 16 digits" + "'", str23, "Card number should be 16 digits");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
        parkingSpaceProxy9.toggleSpace("CLT-0173ebd7-c50a-4d20-8ab3-f6039f068cff", "Paid $ 10.0 with Mobile Pay", true);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str6, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        parkingSpaceProxy0.toggleSpace("", "staff", false);
        boolean boolean11 = parkingSpaceProxy0.cancelBooking("Jane");
        boolean boolean13 = parkingSpaceProxy0.checkOut("empty");
        boolean boolean16 = parkingSpaceProxy0.extendBooking("3b453211-7dd1-4452-8741-a206711c1217", (int) (byte) 10);
        parkingSpaceProxy0.displayPendingValidations();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy13 = null;
        client0.assignProxy(parkingSpaceProxy13);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj18 = parkingSpaceProxy15.login("empty", "Jane");
        client0.assignProxy(parkingSpaceProxy15);
        java.lang.String str20 = client0.getClientType();
        java.lang.String str21 = client0.getClientId();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str1, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "disabled" + "'", str20, "disabled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleLot("staff", false);
        ParkingSystem.BookingManager bookingManager8 = parkingSpaceFacade0.getBookingManager();
        ParkingSystem.SpaceManager spaceManager9 = parkingSpaceFacade0.getSpaceManager();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(bookingManager8);
        org.junit.Assert.assertNotNull(spaceManager9);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot1.getParkingSpace((int) (byte) 0);
        ParkingSystem.ParkingSpace parkingSpace14 = parkingLot1.getParkingSpace((int) (byte) 0);
        parkingLot1.removeBooking(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(parkingSpace14);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        parkingSpaceFacade0.addParkingLot("");
        boolean boolean12 = parkingSpaceFacade0.confirmBooking("pass", "pass", "Jane", "", (int) (short) 10, "", (int) ' ', "hi!", "jane");
        parkingSpaceFacade0.addParkingLot("Refunded deposit of $1.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        client0.setValidated(true);
        java.lang.String str14 = client0.getPassword();
        java.lang.String str15 = client0.getPassword();
        java.lang.String str16 = client0.getClientType();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disabled" + "'", str14, "disabled");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "disabled" + "'", str15, "disabled");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "disabled" + "'", str16, "disabled");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy10 = new ParkingSystem.ParkingSpaceProxy();
        client0.assignProxy(parkingSpaceProxy10);
        ParkingSystem.AccountRegistry accountRegistry12 = parkingSpaceProxy10.getRegistry();
        boolean boolean14 = parkingSpaceProxy10.checkIn("hi!");
        boolean boolean16 = parkingSpaceProxy10.cancelBooking("Refunded deposit of $1.0");
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.Booking booking4 = client0.getBookingDetails();
        java.lang.String str5 = client0.getUsername();
        java.lang.String str6 = client0.getUsername();
        boolean boolean9 = client0.editBooking("pass", (int) (byte) 0);
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(booking4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        java.lang.String str11 = client0.getName();
        java.lang.String str12 = client0.getName();
        java.lang.String str13 = client0.getClientType();
        java.lang.String str14 = client0.getClientId();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "disabled" + "'", str13, "disabled");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        parkingLot1.removeBooking((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        boolean boolean2 = parkingSpaceProxy0.cancelBooking("pass");
        parkingSpaceProxy0.addParkingLot("pass");
        boolean boolean6 = parkingSpaceProxy0.checkIn("Paid $ 100.0 with Mobile Pay");
        boolean boolean12 = parkingSpaceProxy0.register("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Refunded without deposit ($-42.0)", "Paid $ 0.0 with Mobile Pay", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "disabled");
        ParkingSystem.AccountRegistry accountRegistry13 = parkingSpaceProxy0.getRegistry();
        java.lang.Object obj16 = parkingSpaceProxy0.login("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", "Refunded without deposit ($1.0)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(accountRegistry13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry12 = superManager11.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry15 = parkingSpaceProxy14.getRegistry();
        boolean boolean21 = parkingSpaceProxy14.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean25 = parkingSpaceProxy14.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean35 = parkingSpaceProxy14.confirmBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff", "disabled", (int) (short) 0, "Paid $ 100.0 with Mobile Pay", (int) (short) 10, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        accountRegistry12.assignProxyToManager("empty", parkingSpaceProxy14);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy38 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade39 = parkingSpaceProxy38.getFacade();
        accountRegistry12.assignProxyToManager("", parkingSpaceProxy38);
        ParkingSystem.User user42 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy43 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj46 = parkingSpaceProxy43.login("empty", "Jane");
        parkingSpaceProxy43.validateClient("Jane");
        parkingSpaceProxy43.toggleSpace("", "staff", false);
        boolean boolean54 = parkingSpaceProxy43.cancelBooking("");
        user42.assignProxy(parkingSpaceProxy43);
        parkingSpaceProxy43.displayPendingValidations();
        boolean boolean60 = parkingSpaceProxy43.editBooking("Paid $ -1.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", 100);
        accountRegistry12.assignProxyToManager("jane", parkingSpaceProxy43);
        ParkingSystem.Manager manager62 = accountRegistry12.autoGenerateManager();
        manager62.setManagerInfo("TXCrKOGD", "CLT-f02c481e-1504-4abf-b598-76152da8586a", "Refunded without deposit ($0.0)");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade39);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(manager62);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        java.lang.String str4 = parkingSpaceProxy0.scanSpace("empty", "hi!");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade5 = parkingSpaceProxy0.getFacade();
        boolean boolean11 = parkingSpaceProxy0.register("h40rNQ7kR1", "86z9Z9e0MN", "8812812f-8c58-440e-9188-ca0b1f996ced", "8812812f-8c58-440e-9188-ca0b1f996ced", "");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
        org.junit.Assert.assertNotNull(parkingSpaceFacade5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

//    @Test
//    public void test3156() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest6.test3156");
//        ParkingSystem.User user0 = new ParkingSystem.User();
//        java.lang.Object obj1 = user0.user;
//        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
//        ParkingSystem.User user3 = new ParkingSystem.User();
//        java.lang.Object obj4 = user3.user;
//        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
//        java.lang.String str6 = client5.getName();
//        client5.setValidated(true);
//        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
//        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
//        boolean boolean12 = parkingSpaceProxy9.checkIn("");
//        client5.assignProxy(parkingSpaceProxy9);
//        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
//        user3.assignProxy(parkingSpaceProxy9);
//        user0.parkingProxy = parkingSpaceProxy9;
//        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
//        ParkingSystem.BookingManager bookingManager18 = parkingSpaceFacade17.getBookingManager();
//        ParkingSystem.BookingManager bookingManager19 = parkingSpaceFacade17.getBookingManager();
//        ParkingSystem.SpaceManager spaceManager20 = bookingManager19.getSpaceManager();
//        double double22 = bookingManager19.getDeposit("02659ad3-0b5c-4c48-a915-a466f2b50775");
//        ParkingSystem.MobilePay mobilePay23 = new ParkingSystem.MobilePay();
//        boolean boolean28 = mobilePay23.processPayment("hi!", (-1.0d), "", "");
//        java.lang.String str29 = mobilePay23.getPaymentMessage();
//        bookingManager19.setPaymentStrategy((ParkingSystem.Strategy) mobilePay23);
//        ParkingSystem.SpaceManager spaceManager31 = bookingManager19.getSpaceManager();
//        ParkingSystem.CheckInManager checkInManager32 = new ParkingSystem.CheckInManager(bookingManager19);
//        org.junit.Assert.assertNull(obj1);
//        org.junit.Assert.assertNull(parkingSpaceProxy2);
//        org.junit.Assert.assertNull(obj4);
//        org.junit.Assert.assertNotNull(client5);
//        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h40rNQ7kR1" + "'", str6, "h40rNQ7kR1");
//        org.junit.Assert.assertNotNull(accountRegistry10);
//        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
//        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
//        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
//        org.junit.Assert.assertNotNull(bookingManager18);
//        org.junit.Assert.assertNotNull(bookingManager19);
//        org.junit.Assert.assertNotNull(spaceManager20);
//        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
//        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
//        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str29, "Paid $ -1.0 with Mobile Pay");
//        org.junit.Assert.assertNotNull(spaceManager31);
//    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        cSVManager0.updateClientValidation("pass", false);
        java.lang.String[] strArray9 = cSVManager0.loadSuperManager();
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArray9);
// flaky "20) test3157(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade9 = parkingSpaceProxy4.getFacade();
        boolean boolean11 = parkingSpaceFacade9.checkOut("Paid $ 0.0 with Mobile Pay");
        parkingSpaceFacade9.toggleLot("83a51dc6-0c8f-4f21-ae40-68699828f95d", false);
        parkingSpaceFacade9.toggleSpace("CLT-6bf41de3-8b5a-4cee-8fc7-f8abc4e5b750", "", true);
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h40rNQ7kR1" + "'", str1, "h40rNQ7kR1");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        ParkingSystem.Enabled enabled11 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot13 = new ParkingSystem.ParkingLot("");
        ParkingSystem.ParkingLotIterator parkingLotIterator14 = parkingLot13.getIterator();
        ParkingSystem.ParkingSpace parkingSpace16 = parkingLot13.getParkingSpace((int) (byte) -1);
        java.lang.String str17 = enabled11.scanSpace(parkingSpace16);
        parkingSpace10.setState((ParkingSystem.SpaceState) enabled11);
        ParkingSystem.Booking booking19 = parkingSpace10.getCurrentBooking();
        ParkingSystem.Booking booking27 = new ParkingSystem.Booking("qPYDfDnbtD", "CLT-32d5cdc9-3c20-4f30-9d68-0be20fdf349c", (int) '4', "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", (int) (byte) 1, "CLT-f02c481e-1504-4abf-b598-76152da8586a", 1470.0d);
        boolean boolean28 = parkingSpace10.assignBooking(booking27);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(parkingLotIterator14);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "empty" + "'", str17, "empty");
        org.junit.Assert.assertNull(booking19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        parkingSpaceProxy2.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry17 = parkingSpaceProxy2.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry18 = parkingSpaceProxy2.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry19 = parkingSpaceProxy2.getRegistry();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(accountRegistry17);
        org.junit.Assert.assertNotNull(accountRegistry18);
        org.junit.Assert.assertNotNull(accountRegistry19);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy20 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking22 = parkingSpaceProxy20.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry23 = parkingSpaceProxy20.getRegistry();
        java.lang.String str26 = parkingSpaceProxy20.scanSpace("staff", "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        ParkingSystem.Booking booking28 = parkingSpaceProxy20.getBookingDetails("ST001");
        user0.parkingProxy = parkingSpaceProxy20;
        user0.register("CLT-578de262-c6ef-49e3-b501-8fdbcb54d0f4", "25527a32-01ef-45ba-816a-1d0a2fc2a52d", "CLT-631eb509-a6c4-407c-b16d-582a6faabddb", "83a51dc6-0c8f-4f21-ae40-68699828f95d", "4CGFxoSEo5");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNull(parkingSpaceProxy19);
        org.junit.Assert.assertNull(booking22);
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "disabled" + "'", str26, "disabled");
        org.junit.Assert.assertNull(booking28);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        ParkingSystem.AccountRegistry accountRegistry6 = null;
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("disabled", "staff", "staff", accountRegistry6);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry12 = parkingSpaceProxy11.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj17 = parkingSpaceProxy14.login("empty", "Jane");
        parkingSpaceProxy14.validateClient("Jane");
        parkingSpaceProxy14.toggleSpace("", "staff", false);
        accountRegistry12.assignProxyToManager("pass", parkingSpaceProxy14);
        ParkingSystem.Client client26 = accountRegistry12.getClient("");
        ParkingSystem.SuperManager superManager27 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry12);
        superManager7.registry = accountRegistry12;
        ParkingSystem.AccountRegistry accountRegistry29 = superManager7.getRegistry();
        ParkingSystem.Manager manager30 = accountRegistry29.autoGenerateManager();
        ParkingSystem.SuperManager superManager31 = ParkingSystem.SuperManager.createFromCSV("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "", "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753", accountRegistry29);
        ParkingSystem.Manager manager32 = superManager31.autoGenerateManager();
        java.lang.String str33 = manager32.getManagerId();
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(client26);
        org.junit.Assert.assertNotNull(superManager27);
        org.junit.Assert.assertNotNull(accountRegistry29);
        org.junit.Assert.assertNotNull(manager30);
        org.junit.Assert.assertNotNull(superManager31);
        org.junit.Assert.assertNotNull(manager32);
// flaky "21) test3162(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "561e2348-335a-4fa0-b9d2-c94781740f91" + "'", str33, "561e2348-335a-4fa0-b9d2-c94781740f91");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        ParkingSystem.Manager manager9 = accountRegistry8.autoGenerateManager();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertNotNull(manager9);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking2 = parkingSpaceProxy0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry3 = parkingSpaceProxy0.getRegistry();
        parkingSpaceProxy0.autoGenerateManager();
        parkingSpaceProxy0.toggleSpace("staff", "Jane", false);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade9 = parkingSpaceProxy0.getFacade();
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(accountRegistry3);
        org.junit.Assert.assertNotNull(parkingSpaceFacade9);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap18 = bookingManager0.getActiveBookings();
        ParkingSystem.SpaceManager spaceManager19 = bookingManager0.getSpaceManager();
        double double21 = bookingManager0.getDeposit("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        boolean boolean26 = bookingManager0.extendBooking("Jane", (int) ' ', "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753", "4c45f11e-b09a-4d81-adf1-86cfd519dc3c");
        double double29 = bookingManager0.calculateCost("25527a32-01ef-45ba-816a-1d0a2fc2a52d", (int) (byte) 1);
        boolean boolean39 = bookingManager0.confirmBooking("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", "TXCrKOGD", "CLT-c3ce9a25-7555-430c-9330-9203c36530f8", "8812812f-8c58-440e-9188-ca0b1f996ced", 32, "", 3, "CLT-2caa2dd4-57bd-417a-ab73-f721cc092df3", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        boolean boolean43 = bookingManager0.editBooking("CLT-5be1cd5a-d829-4101-9cd3-6006338eb786", "4CGFxoSEo5", 2);
        boolean boolean53 = bookingManager0.confirmBooking("CLT-7df99776-6818-4843-8c88-c29a926a9d29", "8de59b10-a65c-4d90-b56c-a637505ce1de", "Refunded without deposit ($0.0)", "XBERLIguFg", (int) (byte) 0, "Refunded total cost of $100.0", (int) (short) 100, "empty", "ua4ppOLtSl");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(spaceManager19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 30.0d + "'", double29 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isSpaceAvailable((int) (byte) 100);
        ParkingSystem.ParkingLotIterator parkingLotIterator10 = parkingLot1.getIterator();
        ParkingSystem.Booking booking19 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        int int20 = booking19.getDuration();
        java.lang.String str21 = booking19.getClientId();
        booking19.setStartTime("hi!");
        boolean boolean24 = booking19.isCheckedIn();
        java.lang.String str25 = booking19.getLotId();
        boolean boolean26 = parkingLot1.assignBooking((int) '#', booking19);
        boolean boolean28 = parkingLot1.isSpaceAvailable(0);
        ParkingSystem.SpaceManager spaceManager30 = new ParkingSystem.SpaceManager();
        boolean boolean33 = spaceManager30.isSpaceAvailable("hi!", (int) '#');
        spaceManager30.toggleLot("disabled", false);
        java.lang.String str39 = spaceManager30.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.lang.String str42 = spaceManager30.scanSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "Card number should be 16 digits");
        ParkingSystem.Booking booking52 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        double double53 = booking52.getTotalCost();
        boolean boolean54 = spaceManager30.assignBooking("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", 0, booking52);
        boolean boolean55 = parkingLot1.assignBooking((int) (short) 0, booking52);
        java.lang.String str56 = booking52.getClientId();
        int int57 = booking52.getDuration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "jane" + "'", str25, "jane");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "disabled" + "'", str39, "disabled");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "disabled" + "'", str42, "disabled");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "staff" + "'", str56, "staff");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 32 + "'", int57 == 32);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        ParkingSystem.Booking booking12 = parkingSpace10.getCurrentBooking();
        java.lang.String str13 = parkingSpace10.scanSpace();
        ParkingSystem.Enabled enabled14 = new ParkingSystem.Enabled();
        parkingSpace10.setState((ParkingSystem.SpaceState) enabled14);
        boolean boolean16 = parkingSpace10.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "empty" + "'", str13, "empty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry18 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry18);
        java.lang.String str20 = superManager19.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry24 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager25 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry24);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = null;
        accountRegistry24.assignProxyToManager("disabled", parkingSpaceProxy27);
        superManager19.registry = accountRegistry24;
        superManager4.registry = accountRegistry24;
        boolean boolean36 = accountRegistry24.registerClient("staff", "staff", "pass", "disabled", "disabled");
        ParkingSystem.Manager manager37 = accountRegistry24.autoGenerateManager();
        java.lang.String str38 = manager37.getPassword();
        java.lang.String str39 = manager37.getName();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str20, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(manager37);
// flaky "22) test3168(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "MAgreP5XqK" + "'", str38, "MAgreP5XqK");
// flaky "13) test3168(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "b34WTxj8" + "'", str39, "b34WTxj8");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        ParkingSystem.Disabled disabled0 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace1 = null;
        java.lang.String str2 = disabled0.scanSpace(parkingSpace1);
        ParkingSystem.Enabled enabled3 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot5 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking7 = null;
        boolean boolean8 = parkingLot5.assignBooking(0, booking7);
        boolean boolean10 = parkingLot5.isSpaceAvailable((int) '#');
        boolean boolean12 = parkingLot5.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace14 = parkingLot5.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking15 = parkingSpace14.getCurrentBooking();
        parkingSpace14.removeBooking();
        java.lang.String str17 = enabled3.scanSpace(parkingSpace14);
        ParkingSystem.ParkingLot parkingLot19 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking21 = null;
        boolean boolean22 = parkingLot19.assignBooking(0, booking21);
        boolean boolean24 = parkingLot19.isSpaceAvailable((int) '#');
        boolean boolean26 = parkingLot19.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace28 = parkingLot19.getParkingSpace((int) (byte) 10);
        int int29 = parkingSpace28.getSpaceId();
        ParkingSystem.Booking booking30 = parkingSpace28.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager31 = new ParkingSystem.SpaceManager();
        boolean boolean34 = spaceManager31.isSpaceAvailable("hi!", (int) '#');
        spaceManager31.toggleLot("disabled", false);
        ParkingSystem.Booking booking47 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean48 = spaceManager31.assignBooking("empty", (int) (short) 0, booking47);
        boolean boolean49 = parkingSpace28.assignBooking(booking47);
        java.lang.String str50 = enabled3.scanSpace(parkingSpace28);
        java.lang.String str51 = disabled0.scanSpace(parkingSpace28);
        ParkingSystem.Booking booking52 = parkingSpace28.getCurrentBooking();
        int int53 = parkingSpace28.getSpaceId();
        boolean boolean54 = parkingSpace28.isAvailable();
        ParkingSystem.Booking booking55 = parkingSpace28.getCurrentBooking();
        int int56 = booking55.getDuration();
        java.lang.String str57 = booking55.getLicensePlate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "disabled" + "'", str2, "disabled");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNull(booking15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "empty" + "'", str17, "empty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNull(booking30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "disabled" + "'", str50, "disabled");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "disabled" + "'", str51, "disabled");
        org.junit.Assert.assertNotNull(booking52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(booking55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 32 + "'", int56 == 32);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "disabled" + "'", str57, "disabled");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Card number should be 16 digits");
        java.lang.String[] strArray5 = cSVManager0.loadSuperManager();
        ParkingSystem.SpaceManager spaceManager6 = new ParkingSystem.SpaceManager();
        spaceManager6.removeBooking("hi!", (int) (byte) 0);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap10 = spaceManager6.getParkingLots();
        cSVManager0.saveParkingLots(strMap10);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade12 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager13 = parkingSpaceFacade12.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager14 = parkingSpaceFacade12.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap15 = spaceManager14.getParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap16 = spaceManager14.getParkingLots();
        cSVManager0.loadParkingLots(strMap16);
        ParkingSystem.CSVManager cSVManager18 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList20 = cSVManager18.readCSV("");
        java.util.List<java.lang.String[]> strArrayList22 = cSVManager18.readCSV("Card number should be 16 digits");
        ParkingSystem.CSVManager cSVManager23 = new ParkingSystem.CSVManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap24 = null;
        cSVManager23.loadParkingLots(strMap24);
        ParkingSystem.CSVManager cSVManager26 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList28 = cSVManager26.readCSV("");
        java.util.List<java.lang.String[]> strArrayList30 = cSVManager26.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap31 = null;
        cSVManager26.loadParkingLots(strMap31);
        ParkingSystem.AccountRegistry accountRegistry36 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager37 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry36);
        ParkingSystem.Manager manager38 = superManager37.autoGenerateManager();
        cSVManager26.saveManager((ParkingSystem.Manager) superManager37);
        ParkingSystem.SpaceManager spaceManager40 = new ParkingSystem.SpaceManager();
        boolean boolean43 = spaceManager40.isSpaceAvailable("hi!", (int) '#');
        spaceManager40.toggleLot("disabled", false);
        ParkingSystem.Booking booking56 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean57 = spaceManager40.assignBooking("empty", (int) (short) 0, booking56);
        spaceManager40.loadParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap59 = spaceManager40.getParkingLots();
        cSVManager26.loadParkingLots(strMap59);
        ParkingSystem.SpaceManager spaceManager61 = new ParkingSystem.SpaceManager();
        boolean boolean64 = spaceManager61.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str67 = spaceManager61.scanSpace("disabled", "");
        spaceManager61.addParkingLot("hi!");
        java.lang.String str72 = spaceManager61.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap73 = spaceManager61.getParkingLots();
        cSVManager26.saveParkingLots(strMap73);
        cSVManager23.saveParkingLots(strMap73);
        cSVManager18.loadParkingLots(strMap73);
        cSVManager0.loadParkingLots(strMap73);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(strArray5);
// flaky "23) test3170(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(checkInManager13);
        org.junit.Assert.assertNotNull(spaceManager14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strArrayList20);
        org.junit.Assert.assertNotNull(strArrayList22);
        org.junit.Assert.assertNotNull(strArrayList28);
        org.junit.Assert.assertNotNull(strArrayList30);
        org.junit.Assert.assertNotNull(superManager37);
        org.junit.Assert.assertNotNull(manager38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "disabled" + "'", str67, "disabled");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "disabled" + "'", str72, "disabled");
        org.junit.Assert.assertNotNull(strMap73);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit17 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit17);
        ParkingSystem.CheckInManager checkInManager19 = new ParkingSystem.CheckInManager(bookingManager0);
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap20 = bookingManager0.getActiveBookings();
        double double22 = bookingManager0.getDeposit("TXCrKOGD");
        boolean boolean24 = bookingManager0.cancelBooking("I673kmcH");
        boolean boolean28 = bookingManager0.editBooking("hi!", "848f508e-e1d2-4f02-9fc9-e95eee425d36", 2);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        java.lang.String str8 = booking7.getClientId();
        java.lang.String str9 = booking7.getLotId();
        int int10 = booking7.getDuration();
        java.lang.String str11 = booking7.getLicensePlate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jane" + "'", str9, "jane");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        java.lang.Object obj19 = user0.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "staff");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy20 = user0.parkingProxy;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
// flaky "24) test3173(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "02659ad3-0b5c-4c48-a915-a466f2b50775" + "'", str6, "02659ad3-0b5c-4c48-a915-a466f2b50775");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(parkingSpaceProxy20);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        parkingLot1.removeBooking((int) '#');
        boolean boolean6 = parkingLot1.isSpaceAvailable(1);
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.toggleLot("Jane", false);
        ParkingSystem.ParkingLot parkingLot7 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking9 = null;
        boolean boolean10 = parkingLot7.assignBooking(0, booking9);
        boolean boolean12 = parkingLot7.isSpaceAvailable((int) '#');
        boolean boolean14 = parkingLot7.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace16 = parkingLot7.getParkingSpace((int) (byte) 10);
        int int17 = parkingSpace16.getSpaceId();
        ParkingSystem.Booking booking18 = parkingSpace16.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager19 = new ParkingSystem.SpaceManager();
        boolean boolean22 = spaceManager19.isSpaceAvailable("hi!", (int) '#');
        spaceManager19.toggleLot("disabled", false);
        ParkingSystem.Booking booking35 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean36 = spaceManager19.assignBooking("empty", (int) (short) 0, booking35);
        boolean boolean37 = parkingSpace16.assignBooking(booking35);
        ParkingSystem.SpaceManager spaceManager38 = new ParkingSystem.SpaceManager();
        boolean boolean41 = spaceManager38.isSpaceAvailable("hi!", (int) '#');
        spaceManager38.toggleLot("disabled", false);
        ParkingSystem.Booking booking54 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean55 = spaceManager38.assignBooking("empty", (int) (short) 0, booking54);
        ParkingSystem.SpaceManager spaceManager58 = new ParkingSystem.SpaceManager();
        boolean boolean61 = spaceManager58.isSpaceAvailable("hi!", (int) '#');
        spaceManager58.toggleLot("disabled", false);
        ParkingSystem.Booking booking74 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean75 = spaceManager58.assignBooking("empty", (int) (short) 0, booking74);
        boolean boolean76 = spaceManager38.assignBooking("disabled", (int) (byte) 0, booking74);
        boolean boolean77 = parkingSpace16.assignBooking(booking74);
        boolean boolean78 = spaceManager0.assignBooking("", (int) (short) 1, booking74);
        spaceManager0.loadParkingLots();
        spaceManager0.addParkingLot("CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5");
        spaceManager0.loadParkingLots();
        spaceManager0.toggleLot("Refunded deposit of $0.0", true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(booking18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("25527a32-01ef-45ba-816a-1d0a2fc2a52d");
        ParkingSystem.ParkingSpace parkingSpace3 = parkingLot1.getParkingSpace(0);
        ParkingSystem.ParkingLotIterator parkingLotIterator4 = parkingLot1.getIterator();
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertNotNull(parkingLotIterator4);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        int int7 = accountRegistry3.getManagersSize();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj12 = parkingSpaceProxy9.login("empty", "Jane");
        parkingSpaceProxy9.validateClient("Jane");
        parkingSpaceProxy9.toggleSpace("", "staff", false);
        boolean boolean20 = parkingSpaceProxy9.cancelBooking("Jane");
        accountRegistry3.assignProxyToClient("pass", parkingSpaceProxy9);
        parkingSpaceProxy9.toggleSpace("disabled", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", false);
        boolean boolean29 = parkingSpaceProxy9.editBooking("Paid $ 0.0 with Mobile Pay", "2afd610d-a8cb-413a-bbee-7927f86b526c", (int) (byte) 0);
        boolean boolean39 = parkingSpaceProxy9.confirmBooking("", "CLT-0018b5f2-4f8d-4ac6-8c8d-394f6b7b51a1", "", "2195f5f7-08e1-4b73-b5b8-a479a5b3e3c8", (int) (short) 0, "Refunded deposit of $1.0", (int) 'a', "CLT-6bf41de3-8b5a-4cee-8fc7-f8abc4e5b750", "CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841");
        parkingSpaceProxy9.displayPendingValidations();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        ParkingSystem.AccountRegistry accountRegistry12 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager13 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry12);
        boolean boolean15 = accountRegistry12.requiresValidation("disabled");
        int int16 = accountRegistry12.getManagersSize();
        boolean boolean22 = accountRegistry12.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy24 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj27 = parkingSpaceProxy24.login("empty", "Jane");
        parkingSpaceProxy24.validateClient("Jane");
        parkingSpaceProxy24.toggleSpace("", "staff", false);
        boolean boolean35 = parkingSpaceProxy24.cancelBooking("Jane");
        accountRegistry12.assignProxyToClient("pass", parkingSpaceProxy24);
        parkingSpaceProxy24.autoGenerateManager();
        parkingSpaceProxy24.toggleSpace("Paid $ 100.0 with Mobile Pay", "Jane", true);
        superManager4.assignProxy(parkingSpaceProxy24);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade43 = parkingSpaceProxy24.getFacade();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade44 = parkingSpaceProxy24.getFacade();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertNotNull(superManager13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(parkingSpaceFacade43);
        org.junit.Assert.assertNotNull(parkingSpaceFacade44);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking2 = parkingSpaceProxy0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry3 = parkingSpaceProxy0.getRegistry();
        parkingSpaceProxy0.autoGenerateManager();
        parkingSpaceProxy0.toggleSpace("staff", "Jane", false);
        parkingSpaceProxy0.displayPendingValidations();
        boolean boolean11 = parkingSpaceProxy0.checkIn("Refunded without deposit ($-42.0)");
        java.lang.String str14 = parkingSpaceProxy0.scanSpace("CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", "Refunded without deposit ($1.0)");
        boolean boolean24 = parkingSpaceProxy0.confirmBooking("ua4ppOLtSl", "jane", "FNuxCiXmkP", "CLT-df8d594d-9b12-496d-b1b5-eec06c37337a", (int) (short) -1, "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", (int) 'a', "13b04414-31a5-407f-8ea3-fba4613c73d1", "");
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(accountRegistry3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disabled" + "'", str14, "disabled");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        boolean boolean11 = client0.checkOut();
        boolean boolean13 = client0.extendBooking((int) ' ');
        boolean boolean16 = client0.editBooking("Jane", (int) (short) 0);
        java.lang.String str17 = client0.getExtraId();
        boolean boolean18 = client0.cancelBooking();
        boolean boolean21 = client0.editBooking("qPYDfDnbtD", (int) '#');
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.Client client3 = ParkingSystem.Client.getInstance();
        java.lang.String str4 = client3.getName();
        client3.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy7 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry8 = parkingSpaceProxy7.getRegistry();
        boolean boolean10 = parkingSpaceProxy7.checkIn("");
        client3.assignProxy(parkingSpaceProxy7);
        boolean boolean12 = client3.cancelBooking();
        java.lang.String str13 = client3.getExtraId();
        java.lang.String str14 = client3.getName();
        client3.setClientInfo("pass", "empty", "Jane", "pass", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", false);
        cSVManager0.saveClient(client3);
        java.util.List<java.lang.String[]> strArrayList25 = cSVManager0.readCSV("Jane");
        ParkingSystem.AccountRegistry accountRegistry35 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager36 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry35);
        boolean boolean38 = accountRegistry35.requiresValidation("disabled");
        int int39 = accountRegistry35.getManagersSize();
        ParkingSystem.SuperManager superManager40 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry35);
        ParkingSystem.AccountRegistry accountRegistry41 = superManager40.getRegistry();
        accountRegistry41.validateClient("pass");
        ParkingSystem.SuperManager superManager44 = ParkingSystem.SuperManager.createFromCSV("Refunded total cost of $1.0", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", accountRegistry41);
        cSVManager0.saveManager((ParkingSystem.Manager) superManager44);
        ParkingSystem.Manager manager46 = superManager44.autoGenerateManager();
        org.junit.Assert.assertNotNull(strArray1);
// flaky "25) test3181(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "14) test3181(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jane" + "'", str4, "jane");
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "jane" + "'", str14, "jane");
        org.junit.Assert.assertNotNull(strArrayList25);
        org.junit.Assert.assertNotNull(superManager36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertNotNull(accountRegistry41);
        org.junit.Assert.assertNotNull(superManager44);
        org.junit.Assert.assertNotNull(manager46);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        ParkingSystem.ParkingSpace parkingSpace1 = new ParkingSystem.ParkingSpace(10);
        ParkingSystem.ParkingLot parkingLot3 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking5 = null;
        boolean boolean6 = parkingLot3.assignBooking(0, booking5);
        boolean boolean8 = parkingLot3.isSpaceAvailable((int) '#');
        boolean boolean10 = parkingLot3.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot3.getParkingSpace((int) (byte) 10);
        int int13 = parkingSpace12.getSpaceId();
        ParkingSystem.Booking booking14 = parkingSpace12.getCurrentBooking();
        java.lang.String str15 = parkingSpace12.scanSpace();
        ParkingSystem.Enabled enabled16 = new ParkingSystem.Enabled();
        parkingSpace12.setState((ParkingSystem.SpaceState) enabled16);
        parkingSpace1.setState((ParkingSystem.SpaceState) enabled16);
        ParkingSystem.ParkingLot parkingLot20 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking22 = null;
        boolean boolean23 = parkingLot20.assignBooking(0, booking22);
        boolean boolean25 = parkingLot20.isSpaceAvailable((int) '#');
        boolean boolean27 = parkingLot20.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace29 = parkingLot20.getParkingSpace((int) (byte) 10);
        int int30 = parkingSpace29.getSpaceId();
        ParkingSystem.Booking booking31 = parkingSpace29.getCurrentBooking();
        java.lang.String str32 = parkingSpace29.scanSpace();
        int int33 = parkingSpace29.getSpaceId();
        ParkingSystem.SpaceManager spaceManager34 = new ParkingSystem.SpaceManager();
        boolean boolean37 = spaceManager34.isSpaceAvailable("hi!", (int) '#');
        spaceManager34.toggleLot("disabled", false);
        ParkingSystem.Booking booking50 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean51 = spaceManager34.assignBooking("empty", (int) (short) 0, booking50);
        java.lang.String str52 = booking50.getClientId();
        boolean boolean53 = parkingSpace29.assignBooking(booking50);
        parkingSpace29.removeBooking();
        ParkingSystem.SpaceState spaceState55 = parkingSpace29.getState();
        java.lang.String str56 = enabled16.scanSpace(parkingSpace29);
        java.lang.String str57 = parkingSpace29.scanSpace();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "empty" + "'", str15, "empty");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNull(booking31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "empty" + "'", str32, "empty");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "staff" + "'", str52, "staff");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(spaceState55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "empty" + "'", str56, "empty");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "empty" + "'", str57, "empty");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        boolean boolean18 = bookingManager0.cancelBooking("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        ParkingSystem.AccountRegistry accountRegistry19 = bookingManager0.getAccountRegistry();
        ParkingSystem.AccountRegistry accountRegistry20 = bookingManager0.getAccountRegistry();
        boolean boolean22 = accountRegistry20.requiresValidation("CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841");
        int int23 = accountRegistry20.getManagersSize();
        boolean boolean25 = accountRegistry20.requiresValidation("CLT-7df99776-6818-4843-8c88-c29a926a9d29");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertNotNull(accountRegistry20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean6 = parkingSpaceFacade0.extendBooking("disabled", 0);
        parkingSpaceFacade0.toggleSpace("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "", false);
        ParkingSystem.CheckInManager checkInManager11 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean14 = parkingSpaceFacade0.extendBooking("09622cbf-e665-45db-b1ad-365065947a20", (int) (byte) 1);
        java.lang.String str17 = parkingSpaceFacade0.scanSpace("CLT-08489cd1-5899-4594-ad65-2f6dcf0a9e5d", "CLT-91ad27d3-445b-4a5c-83e9-5aff7f25edbb");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(checkInManager11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disabled" + "'", str17, "disabled");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        java.util.List<java.lang.String[]> strArrayList8 = cSVManager0.readCSV("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.Client client9 = ParkingSystem.Client.getInstance();
        java.lang.String str10 = client9.getName();
        client9.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str19 = client9.getUsername();
        java.lang.String str20 = client9.getPassword();
        java.lang.String str21 = client9.getUsername();
        cSVManager0.saveClient(client9);
        java.lang.String str23 = client9.getPassword();
        ParkingSystem.Booking booking24 = client9.getBookingDetails();
        java.lang.String str25 = client9.getClientId();
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(strArrayList8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "empty" + "'", str10, "empty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "disabled" + "'", str20, "disabled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "disabled" + "'", str23, "disabled");
        org.junit.Assert.assertNull(booking24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap18 = bookingManager0.getActiveBookings();
        ParkingSystem.SpaceManager spaceManager19 = bookingManager0.getSpaceManager();
        ParkingSystem.Booking booking21 = bookingManager0.getBooking("Paid $ 100.0 with Mobile Pay");
        boolean boolean23 = bookingManager0.cancelBooking("Paid $ 10.0 with Mobile Pay");
        boolean boolean25 = bookingManager0.cancelBooking("4a1f2343-8b2e-4dea-ba69-efd105414390");
        boolean boolean30 = bookingManager0.extendBooking("Refunded total cost of $-1.0", (int) (short) 10, "I673kmcH", "staff");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(spaceManager19);
        org.junit.Assert.assertNull(booking21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        boolean boolean8 = paymentManager0.refundTotalCost((double) (short) 100);
        boolean boolean13 = paymentManager0.processPayment("", (double) 0, "Paid $ 100.0 with Mobile Pay", "Refunded without deposit ($-42.0)");
        boolean boolean18 = paymentManager0.processPayment("disabled", (double) 10.0f, "2afd610d-a8cb-413a-bbee-7927f86b526c", "pass");
        boolean boolean21 = paymentManager0.refundWithoutDeposit((double) 10.0f, 165.0d);
        ParkingSystem.BookingManager bookingManager22 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager23 = new ParkingSystem.CheckInManager(bookingManager22);
        ParkingSystem.Booking booking25 = bookingManager22.getBooking("");
        ParkingSystem.SpaceManager spaceManager26 = bookingManager22.getSpaceManager();
        boolean boolean36 = bookingManager22.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double38 = bookingManager22.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit39 = new ParkingSystem.DebitOrCredit();
        bookingManager22.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit39);
        java.lang.String str41 = debitOrCredit39.getPaymentMessage();
        boolean boolean46 = debitOrCredit39.processPayment("Refunded without deposit ($0.0)", (double) (-1L), "Refunded without deposit ($0.0)", "jane");
        java.lang.String str47 = debitOrCredit39.getPaymentMessage();
        paymentManager0.setStrategy((ParkingSystem.Strategy) debitOrCredit39);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(booking25);
        org.junit.Assert.assertNotNull(spaceManager26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 15.0d + "'", double38 == 15.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Card number should be 16 digits" + "'", str47, "Card number should be 16 digits");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.AccountRegistry accountRegistry20 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry20);
        java.lang.String str22 = superManager21.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry23 = superManager21.registry;
        java.lang.String str24 = superManager21.getManagerId();
        ParkingSystem.Client client25 = ParkingSystem.Client.getInstance();
        java.lang.String str26 = client25.getName();
        client25.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy29 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry30 = parkingSpaceProxy29.getRegistry();
        boolean boolean32 = parkingSpaceProxy29.checkIn("");
        client25.assignProxy(parkingSpaceProxy29);
        boolean boolean34 = client25.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy35 = new ParkingSystem.ParkingSpaceProxy();
        client25.assignProxy(parkingSpaceProxy35);
        superManager21.assignProxy(parkingSpaceProxy35);
        user0.assignProxy(parkingSpaceProxy35);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy39 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry40 = parkingSpaceProxy39.getRegistry();
        boolean boolean46 = parkingSpaceProxy39.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean50 = parkingSpaceProxy39.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean60 = parkingSpaceProxy39.confirmBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff", "disabled", (int) (short) 0, "Paid $ 100.0 with Mobile Pay", (int) (short) 10, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        boolean boolean62 = parkingSpaceProxy39.checkOut("Card number should be 16 digits");
        parkingSpaceProxy39.autoGenerateManager();
        user0.parkingProxy = parkingSpaceProxy39;
        boolean boolean70 = parkingSpaceProxy39.register("Refunded without deposit ($-42.0)", "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753", "CLT-b6a8264c-f386-4429-b59c-b7f465002e13", "Refunded without deposit ($0.0)", "83a51dc6-0c8f-4f21-ae40-68699828f95d");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str22, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str24, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(accountRegistry30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(accountRegistry40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        ParkingSystem.Disabled disabled0 = new ParkingSystem.Disabled();
        ParkingSystem.Enabled enabled1 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot3 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking5 = null;
        boolean boolean6 = parkingLot3.assignBooking(0, booking5);
        boolean boolean8 = parkingLot3.isSpaceAvailable((int) '#');
        boolean boolean10 = parkingLot3.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot3.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking13 = parkingSpace12.getCurrentBooking();
        parkingSpace12.removeBooking();
        java.lang.String str15 = enabled1.scanSpace(parkingSpace12);
        java.lang.String str16 = parkingSpace12.scanSpace();
        java.lang.String str17 = disabled0.scanSpace(parkingSpace12);
        java.lang.String str18 = parkingSpace12.scanSpace();
        java.lang.String str19 = parkingSpace12.scanSpace();
        ParkingSystem.Booking booking20 = parkingSpace12.getCurrentBooking();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "empty" + "'", str15, "empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "empty" + "'", str16, "empty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disabled" + "'", str17, "disabled");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "empty" + "'", str18, "empty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "empty" + "'", str19, "empty");
        org.junit.Assert.assertNull(booking20);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit6 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit6);
        boolean boolean12 = debitOrCredit6.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str13 = debitOrCredit6.getPaymentMessage();
        boolean boolean16 = debitOrCredit6.validateCard("pass", (double) 100.0f);
        java.lang.String str17 = debitOrCredit6.getPaymentMessage();
        java.lang.String str18 = debitOrCredit6.getPaymentMessage();
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Card number should be 16 digits" + "'", str13, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Card number should be 16 digits" + "'", str17, "Card number should be 16 digits");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Card number should be 16 digits" + "'", str18, "Card number should be 16 digits");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        double double7 = bookingManager0.getDeposit("staff");
        boolean boolean11 = bookingManager0.editBooking("", "Paid $ -1.0 with Mobile Pay", (int) 'a');
        boolean boolean15 = bookingManager0.editBooking("jane", "pass", (int) '4');
        boolean boolean17 = bookingManager0.cancelBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        ParkingSystem.Booking booking19 = bookingManager0.getBooking("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        double double22 = bookingManager0.calculateCost("25527a32-01ef-45ba-816a-1d0a2fc2a52d", 100);
        boolean boolean24 = bookingManager0.cancelBooking("CLT-91ad27d3-445b-4a5c-83e9-5aff7f25edbb");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(booking19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1515.0d + "'", double22 == 1515.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        ParkingSystem.AccountRegistry accountRegistry17 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager18 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry17);
        java.lang.String str19 = superManager18.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry20 = superManager18.registry;
        cSVManager0.saveManager((ParkingSystem.Manager) superManager18);
        ParkingSystem.Manager manager22 = superManager18.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry23 = superManager18.getRegistry();
        java.lang.String str24 = superManager18.getPassword();
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str19, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry20);
        org.junit.Assert.assertNotNull(manager22);
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Refunded total cost of $1.0" + "'", str24, "Refunded total cost of $1.0");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        boolean boolean18 = bookingManager0.cancelBooking("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        ParkingSystem.AccountRegistry accountRegistry19 = bookingManager0.getAccountRegistry();
        ParkingSystem.AccountRegistry accountRegistry20 = bookingManager0.getAccountRegistry();
        boolean boolean22 = accountRegistry20.requiresValidation("CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry20.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertNotNull(accountRegistry20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        java.lang.String str11 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        spaceManager0.toggleLot("pass", true);
        spaceManager0.addParkingLot("pass");
        java.lang.String str19 = spaceManager0.scanSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "Refunded total cost of $1.0");
        spaceManager0.toggleLot("Paid $ 100.0 with Mobile Pay", true);
        spaceManager0.loadParkingLots();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        boolean boolean9 = paymentManager0.refundWithoutDeposit((double) 1L, (double) 'a');
        java.lang.String str10 = paymentManager0.paymentMessage;
        boolean boolean15 = paymentManager0.processPayment("disabled", (double) (short) 1, "ST001", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.MobilePay mobilePay16 = new ParkingSystem.MobilePay();
        boolean boolean21 = mobilePay16.processPayment("disabled", 10.0d, "disabled", "disabled");
        boolean boolean26 = mobilePay16.processPayment("jane", 15.0d, "jane", "");
        paymentManager0.setStrategy((ParkingSystem.Strategy) mobilePay16);
        boolean boolean32 = mobilePay16.processPayment("K6PkM9rcCx", (double) 2, "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Paid $ 15.0 with Mobile Pay");
        boolean boolean37 = mobilePay16.processPayment("433f3d1f-f758-4ae3-972b-7fb179aedfd7", (double) 4, "Refunded without deposit ($-68.0)", "SRiN5ev00N");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str10, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy13 = null;
        client0.assignProxy(parkingSpaceProxy13);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj18 = parkingSpaceProxy15.login("empty", "Jane");
        client0.assignProxy(parkingSpaceProxy15);
        boolean boolean22 = parkingSpaceProxy15.extendBooking("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", (int) ' ');
        boolean boolean32 = parkingSpaceProxy15.confirmBooking("", "staff", "Refunded total cost of $1.0", "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", 0, "7aecb00c-028c-4dcf-96cc-14d25bd709ab", 1, "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        java.lang.Class<?> wildcardClass33 = parkingSpaceProxy15.getClass();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Refunded without deposit ($-42.0)" + "'", str1, "Refunded without deposit ($-42.0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingLotIterator parkingLotIterator9 = parkingLot1.getIterator();
        boolean boolean10 = parkingLot1.isEnabled();
        boolean boolean12 = parkingLot1.isSpaceAvailable((int) (short) -1);
        ParkingSystem.Booking booking21 = new ParkingSystem.Booking("Jane", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", 100, "jane", (int) (short) 1, "pass", (double) 10);
        boolean boolean22 = parkingLot1.assignBooking((int) '4', booking21);
        boolean boolean23 = booking21.isCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        ParkingSystem.Booking booking6 = null;
        boolean boolean7 = parkingLot1.assignBooking(1, booking6);
        ParkingSystem.ParkingLot parkingLot10 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking12 = null;
        boolean boolean13 = parkingLot10.assignBooking(0, booking12);
        boolean boolean15 = parkingLot10.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking24 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean25 = parkingLot10.assignBooking((int) (short) -1, booking24);
        java.lang.String str26 = booking24.getLotId();
        boolean boolean27 = parkingLot1.assignBooking(0, booking24);
        booking24.setCheckedIn(true);
        java.lang.String str30 = booking24.getLotId();
        int int31 = booking24.getSpaceId();
        booking24.setStartTime("Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "jane" + "'", str26, "jane");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "jane" + "'", str30, "jane");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.paymentMessage = "staff";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (short) 0);
        boolean boolean7 = paymentManager0.refundWithoutDeposit(0.0d, 15.0d);
        boolean boolean9 = paymentManager0.refundDeposit((double) (short) 0);
        boolean boolean12 = paymentManager0.refundWithoutDeposit(165.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        ParkingSystem.SpaceManager spaceManager14 = new ParkingSystem.SpaceManager();
        boolean boolean17 = spaceManager14.isSpaceAvailable("hi!", (int) '#');
        spaceManager14.toggleLot("disabled", false);
        ParkingSystem.Booking booking30 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean31 = spaceManager14.assignBooking("empty", (int) (short) 0, booking30);
        spaceManager14.loadParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap33 = spaceManager14.getParkingLots();
        cSVManager0.loadParkingLots(strMap33);
        ParkingSystem.SpaceManager spaceManager35 = new ParkingSystem.SpaceManager();
        boolean boolean38 = spaceManager35.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str41 = spaceManager35.scanSpace("disabled", "");
        spaceManager35.addParkingLot("hi!");
        java.lang.String str46 = spaceManager35.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap47 = spaceManager35.getParkingLots();
        cSVManager0.saveParkingLots(strMap47);
        cSVManager0.updateClientValidation("CLT-55105d92-54d6-44d2-965a-736022b7f7cd", false);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "disabled" + "'", str41, "disabled");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "disabled" + "'", str46, "disabled");
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        ParkingSystem.Enabled enabled0 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot2 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking4 = null;
        boolean boolean5 = parkingLot2.assignBooking(0, booking4);
        boolean boolean7 = parkingLot2.isSpaceAvailable((int) '#');
        boolean boolean9 = parkingLot2.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot2.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking12 = parkingSpace11.getCurrentBooking();
        parkingSpace11.removeBooking();
        java.lang.String str14 = enabled0.scanSpace(parkingSpace11);
        parkingSpace11.removeBooking();
        ParkingSystem.Booking booking16 = parkingSpace11.getCurrentBooking();
        parkingSpace11.removeBooking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "empty" + "'", str14, "empty");
        org.junit.Assert.assertNull(booking16);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        java.lang.String str7 = parkingSpaceFacade0.scanSpace("jane", "Refunded without deposit ($0.0)");
        java.lang.String str10 = parkingSpaceFacade0.scanSpace("Jane", "");
        ParkingSystem.Booking booking12 = parkingSpaceFacade0.getBookingDetails("4a1f2343-8b2e-4dea-ba69-efd105414390");
        boolean boolean22 = parkingSpaceFacade0.confirmBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", "02659ad3-0b5c-4c48-a915-a466f2b50775", 32, "02659ad3-0b5c-4c48-a915-a466f2b50775", (int) (short) 0, "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "89de8237-29df-4908-9de4-6dc1ce90de94");
        ParkingSystem.CheckInManager checkInManager23 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean27 = parkingSpaceFacade0.editBooking("8ca2ec61-774c-409d-89d5-5b9171b40497", "CLT-08489cd1-5899-4594-ad65-2f6dcf0a9e5d", (int) '4');
        boolean boolean37 = parkingSpaceFacade0.confirmBooking("Paid $ 15.0 with Mobile Pay", "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", "", "e578d6f7-8a26-46f0-8e2f-f3b1be5242ca", 1, "Refunded total cost of $1.0", 3, "", "CLT-7df99776-6818-4843-8c88-c29a926a9d29");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disabled" + "'", str7, "disabled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(checkInManager23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkOut("");
        checkInManager1.refundMessage = "staff";
        checkInManager1.refundMessage = "Refunded total cost of $1.0";
        java.lang.String str8 = checkInManager1.refundMessage;
        checkInManager1.refundMessage = "aa9c00f6-ec11-46c5-a72b-a7f620703e51";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Refunded total cost of $1.0" + "'", str8, "Refunded total cost of $1.0");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingLotIterator parkingLotIterator9 = parkingLot1.getIterator();
        boolean boolean10 = parkingLot1.isEnabled();
        boolean boolean12 = parkingLot1.isSpaceAvailable((int) (short) -1);
        ParkingSystem.Booking booking21 = new ParkingSystem.Booking("Jane", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", 100, "jane", (int) (short) 1, "pass", (double) 10);
        boolean boolean22 = parkingLot1.assignBooking((int) '4', booking21);
        int int23 = booking21.getSpaceId();
        boolean boolean24 = booking21.isCheckedIn();
        int int25 = booking21.getDuration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager2 = parkingSpaceFacade1.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager3 = parkingSpaceFacade1.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap4 = spaceManager3.getParkingLots();
        cSVManager0.loadParkingLots(strMap4);
        ParkingSystem.CSVManager cSVManager6 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList8 = cSVManager6.readCSV("");
        cSVManager6.updateClientValidation("pass", false);
        ParkingSystem.Client client12 = ParkingSystem.Client.getInstance();
        java.lang.String str13 = client12.getName();
        client12.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str22 = client12.getUsername();
        java.lang.String str23 = client12.getPassword();
        java.lang.String str24 = client12.getClientType();
        boolean boolean25 = client12.getIsValidated();
        boolean boolean33 = client12.confirmBooking("hi!", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "Paid $ 100.0 with Mobile Pay", (-1), "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "empty");
        java.lang.String str34 = client12.getName();
        cSVManager6.saveClient(client12);
        ParkingSystem.BookingManager bookingManager36 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager37 = new ParkingSystem.CheckInManager(bookingManager36);
        ParkingSystem.Booking booking39 = bookingManager36.getBooking("");
        ParkingSystem.SpaceManager spaceManager40 = bookingManager36.getSpaceManager();
        boolean boolean50 = bookingManager36.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double52 = bookingManager36.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit53 = new ParkingSystem.DebitOrCredit();
        bookingManager36.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit53);
        ParkingSystem.CheckInManager checkInManager55 = new ParkingSystem.CheckInManager(bookingManager36);
        ParkingSystem.CheckInManager checkInManager56 = new ParkingSystem.CheckInManager(bookingManager36);
        ParkingSystem.SpaceManager spaceManager57 = bookingManager36.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap58 = spaceManager57.getParkingLots();
        cSVManager6.loadParkingLots(strMap58);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade60 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str63 = parkingSpaceFacade60.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager64 = parkingSpaceFacade60.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap65 = spaceManager64.getParkingLots();
        cSVManager6.loadParkingLots(strMap65);
        cSVManager0.saveParkingLots(strMap65);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList68 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(checkInManager2);
        org.junit.Assert.assertNotNull(spaceManager3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strArrayList8);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "disabled" + "'", str23, "disabled");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "disabled" + "'", str24, "disabled");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(booking39);
        org.junit.Assert.assertNotNull(spaceManager40);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 15.0d + "'", double52 == 15.0d);
        org.junit.Assert.assertNotNull(spaceManager57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "disabled" + "'", str63, "disabled");
        org.junit.Assert.assertNotNull(spaceManager64);
        org.junit.Assert.assertNotNull(strMap65);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = null;
        cSVManager0.loadParkingLots(strMap6);
        ParkingSystem.Client client8 = ParkingSystem.Client.getInstance();
        java.lang.String str9 = client8.getClientType();
        cSVManager0.saveClient(client8);
        java.util.List<java.lang.String[]> strArrayList12 = cSVManager0.readCSV("8ca2ec61-774c-409d-89d5-5b9171b40497");
        ParkingSystem.AccountRegistry accountRegistry19 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager20 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry19);
        java.lang.String str21 = superManager20.getManagerId();
        java.lang.String str22 = superManager20.getManagerId();
        ParkingSystem.Manager manager23 = superManager20.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry24 = superManager20.registry;
        java.lang.String str25 = superManager20.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry26 = superManager20.registry;
        java.lang.String str27 = superManager20.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry28 = superManager20.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy30 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj33 = parkingSpaceProxy30.login("empty", "Jane");
        boolean boolean35 = parkingSpaceProxy30.checkIn("Paid $ 10.0 with Mobile Pay");
        accountRegistry28.assignProxyToClient("FNuxCiXmkP", parkingSpaceProxy30);
        ParkingSystem.SuperManager superManager37 = ParkingSystem.SuperManager.createFromCSV("staff", "Refunded without deposit ($0.0)", "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", accountRegistry28);
        cSVManager0.saveManager((ParkingSystem.Manager) superManager37);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(client8);
// flaky "26) test3206(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertNotNull(strArrayList12);
        org.junit.Assert.assertNotNull(superManager20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str21, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str22, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager23);
        org.junit.Assert.assertNotNull(accountRegistry24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str25, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str27, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(superManager37);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        boolean boolean6 = parkingSpaceFacade0.editBooking("Jane", "staff", (int) (short) 100);
        boolean boolean9 = parkingSpaceFacade0.extendBooking("empty", 100);
        ParkingSystem.SpaceManager spaceManager10 = parkingSpaceFacade0.getSpaceManager();
        boolean boolean14 = parkingSpaceFacade0.editBooking("Paid $ -1.0 with Mobile Pay", "qPYDfDnbtD", 52);
        parkingSpaceFacade0.toggleSpace("25527a32-01ef-45ba-816a-1d0a2fc2a52d", "CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", true);
        ParkingSystem.CheckInManager checkInManager19 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager20 = parkingSpaceFacade0.getSpaceManager();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(spaceManager10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(checkInManager19);
        org.junit.Assert.assertNotNull(spaceManager20);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap1 = null;
        cSVManager0.loadParkingLots(strMap1);
        java.lang.String[] strArray3 = cSVManager0.loadSuperManager();
        ParkingSystem.Client client4 = ParkingSystem.Client.getInstance();
        java.lang.String str5 = client4.getClientType();
        java.lang.String str6 = client4.getUsername();
        cSVManager0.saveClient(client4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList8 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky "27) test3208(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client4);
// flaky "15) test3208(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
// flaky "8) test3208(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jane" + "'", str6, "jane");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        boolean boolean13 = client0.getIsValidated();
        boolean boolean21 = client0.confirmBooking("hi!", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "Paid $ 100.0 with Mobile Pay", (-1), "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "empty");
        java.lang.String str22 = client0.getName();
        boolean boolean24 = client0.extendBooking((int) ' ');
        boolean boolean25 = client0.checkIn();
        boolean boolean28 = client0.editBooking("CLT-5e15ad0b-2221-4ef9-a477-c00f6c4e54d8", 100);
        org.junit.Assert.assertNotNull(client0);
// flaky "28) test3209(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jane" + "'", str1, "Jane");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade3.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = spaceManager4.getParkingLots();
        cSVManager0.saveParkingLots(strMap5);
        ParkingSystem.Client client7 = ParkingSystem.Client.getInstance();
        java.lang.String str8 = client7.getName();
        client7.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry12 = parkingSpaceProxy11.getRegistry();
        boolean boolean14 = parkingSpaceProxy11.checkIn("");
        client7.assignProxy(parkingSpaceProxy11);
        boolean boolean16 = client7.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy17 = new ParkingSystem.ParkingSpaceProxy();
        client7.assignProxy(parkingSpaceProxy17);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = null;
        client7.assignProxy(parkingSpaceProxy19);
        cSVManager0.saveClient(client7);
        ParkingSystem.CSVManager cSVManager22 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray23 = cSVManager22.loadSuperManager();
        java.lang.String[] strArray24 = cSVManager22.loadSuperManager();
        ParkingSystem.Client client25 = ParkingSystem.Client.getInstance();
        java.lang.String str26 = client25.getName();
        client25.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy29 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry30 = parkingSpaceProxy29.getRegistry();
        boolean boolean32 = parkingSpaceProxy29.checkIn("");
        client25.assignProxy(parkingSpaceProxy29);
        boolean boolean34 = client25.cancelBooking();
        java.lang.String str35 = client25.getExtraId();
        java.lang.String str36 = client25.getName();
        client25.setClientInfo("pass", "empty", "Jane", "pass", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", false);
        cSVManager22.saveClient(client25);
        ParkingSystem.AccountRegistry accountRegistry49 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager50 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry49);
        java.lang.String str51 = superManager50.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry55 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager56 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry55);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy58 = null;
        accountRegistry55.assignProxyToManager("disabled", parkingSpaceProxy58);
        superManager50.registry = accountRegistry55;
        cSVManager22.saveManager((ParkingSystem.Manager) superManager50);
        cSVManager0.saveManager((ParkingSystem.Manager) superManager50);
        ParkingSystem.AccountRegistry accountRegistry69 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager70 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry69);
        boolean boolean72 = accountRegistry69.requiresValidation("disabled");
        int int73 = accountRegistry69.getManagersSize();
        ParkingSystem.SuperManager superManager74 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry69);
        ParkingSystem.AccountRegistry accountRegistry75 = superManager74.getRegistry();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager74);
        java.lang.String str77 = superManager74.getName();
        org.junit.Assert.assertNotNull(strArray1);
// flaky "29) test3210(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "16) test3210(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
// flaky "9) test3210(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray24);
// flaky "4) test3210(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(accountRegistry30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(superManager50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str51, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager56);
        org.junit.Assert.assertNotNull(superManager70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(superManager74);
        org.junit.Assert.assertNotNull(accountRegistry75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str77, "Paid $ 0.0 with Mobile Pay");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade3.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = spaceManager4.getParkingLots();
        cSVManager0.saveParkingLots(strMap5);
        ParkingSystem.Client client7 = ParkingSystem.Client.getInstance();
        java.lang.String str8 = client7.getName();
        client7.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry12 = parkingSpaceProxy11.getRegistry();
        boolean boolean14 = parkingSpaceProxy11.checkIn("");
        client7.assignProxy(parkingSpaceProxy11);
        boolean boolean16 = client7.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy17 = new ParkingSystem.ParkingSpaceProxy();
        client7.assignProxy(parkingSpaceProxy17);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = null;
        client7.assignProxy(parkingSpaceProxy19);
        cSVManager0.saveClient(client7);
        ParkingSystem.CSVManager cSVManager22 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList24 = cSVManager22.readCSV("");
        java.util.List<java.lang.String[]> strArrayList26 = cSVManager22.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap27 = null;
        cSVManager22.loadParkingLots(strMap27);
        ParkingSystem.AccountRegistry accountRegistry32 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager33 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry32);
        ParkingSystem.Manager manager34 = superManager33.autoGenerateManager();
        cSVManager22.saveManager((ParkingSystem.Manager) superManager33);
        ParkingSystem.SpaceManager spaceManager36 = new ParkingSystem.SpaceManager();
        boolean boolean39 = spaceManager36.isSpaceAvailable("hi!", (int) '#');
        spaceManager36.toggleLot("disabled", false);
        ParkingSystem.Booking booking52 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean53 = spaceManager36.assignBooking("empty", (int) (short) 0, booking52);
        spaceManager36.loadParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap55 = spaceManager36.getParkingLots();
        cSVManager22.loadParkingLots(strMap55);
        ParkingSystem.SpaceManager spaceManager57 = new ParkingSystem.SpaceManager();
        boolean boolean60 = spaceManager57.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str63 = spaceManager57.scanSpace("disabled", "");
        spaceManager57.addParkingLot("hi!");
        java.lang.String str68 = spaceManager57.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap69 = spaceManager57.getParkingLots();
        cSVManager22.saveParkingLots(strMap69);
        cSVManager0.saveParkingLots(strMap69);
        cSVManager0.updateClientValidation("tbHxuilT", true);
        org.junit.Assert.assertNotNull(strArray1);
// flaky "30) test3211(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "17) test3211(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "empty" + "'", str8, "empty");
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArrayList24);
        org.junit.Assert.assertNotNull(strArrayList26);
        org.junit.Assert.assertNotNull(superManager33);
        org.junit.Assert.assertNotNull(manager34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "disabled" + "'", str63, "disabled");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "disabled" + "'", str68, "disabled");
        org.junit.Assert.assertNotNull(strMap69);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager2 = parkingSpaceFacade0.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap3 = spaceManager2.getParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap4 = spaceManager2.getParkingLots();
        spaceManager2.addParkingLot("Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.validateClient("Jane");
        parkingSpaceProxy3.toggleSpace("", "staff", false);
        accountRegistry1.assignProxyToManager("pass", parkingSpaceProxy3);
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap14 = accountRegistry1.getManagers();
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        boolean boolean6 = parkingSpaceFacade0.editBooking("Jane", "staff", (int) (short) 100);
        boolean boolean8 = parkingSpaceFacade0.checkOut("CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc");
        boolean boolean10 = parkingSpaceFacade0.checkIn("8bf217fa-1769-4d04-858b-ce78fe94bf0c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        java.lang.String str9 = superManager4.getPassword();
        superManager4.displayPendingValidations();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Refunded total cost of $1.0" + "'", str9, "Refunded total cost of $1.0");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator18 = parkingLot17.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator19 = parkingLot17.getIterator();
        user0.user = parkingLot17;
        ParkingSystem.Disabled disabled21 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace22 = null;
        java.lang.String str23 = disabled21.scanSpace(parkingSpace22);
        ParkingSystem.Enabled enabled24 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot26 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking28 = null;
        boolean boolean29 = parkingLot26.assignBooking(0, booking28);
        boolean boolean31 = parkingLot26.isSpaceAvailable((int) '#');
        boolean boolean33 = parkingLot26.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace35 = parkingLot26.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking36 = parkingSpace35.getCurrentBooking();
        parkingSpace35.removeBooking();
        java.lang.String str38 = enabled24.scanSpace(parkingSpace35);
        ParkingSystem.ParkingLot parkingLot40 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking42 = null;
        boolean boolean43 = parkingLot40.assignBooking(0, booking42);
        boolean boolean45 = parkingLot40.isSpaceAvailable((int) '#');
        boolean boolean47 = parkingLot40.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace49 = parkingLot40.getParkingSpace((int) (byte) 10);
        int int50 = parkingSpace49.getSpaceId();
        ParkingSystem.Booking booking51 = parkingSpace49.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager52 = new ParkingSystem.SpaceManager();
        boolean boolean55 = spaceManager52.isSpaceAvailable("hi!", (int) '#');
        spaceManager52.toggleLot("disabled", false);
        ParkingSystem.Booking booking68 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean69 = spaceManager52.assignBooking("empty", (int) (short) 0, booking68);
        boolean boolean70 = parkingSpace49.assignBooking(booking68);
        java.lang.String str71 = enabled24.scanSpace(parkingSpace49);
        java.lang.String str72 = disabled21.scanSpace(parkingSpace49);
        user0.user = str72;
        user0.register("tbHxuilT", "", "83a51dc6-0c8f-4f21-ae40-68699828f95d", "CLT-631eb509-a6c4-407c-b16d-582a6faabddb", "Jane");
        java.lang.Object obj82 = user0.login("Refunded total cost of $10.0", "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "disabled" + "'", str23, "disabled");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertNull(booking36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "empty" + "'", str38, "empty");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(parkingSpace49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNull(booking51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "disabled" + "'", str71, "disabled");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "disabled" + "'", str72, "disabled");
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        boolean boolean9 = paymentManager0.refundWithoutDeposit((double) 1L, (double) 'a');
        java.lang.String str10 = paymentManager0.paymentMessage;
        boolean boolean15 = paymentManager0.processPayment("disabled", (double) (short) 1, "ST001", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        boolean boolean18 = paymentManager0.refundWithoutDeposit((double) 0.0f, (double) (-1));
        ParkingSystem.BookingManager bookingManager19 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager20 = new ParkingSystem.CheckInManager(bookingManager19);
        ParkingSystem.SpaceManager spaceManager21 = bookingManager19.getSpaceManager();
        double double24 = bookingManager19.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit25 = new ParkingSystem.DebitOrCredit();
        bookingManager19.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit25);
        boolean boolean31 = debitOrCredit25.processPayment("2afd610d-a8cb-413a-bbee-7927f86b526c", (double) (-1), "Paid $ -1.0 with Mobile Pay", "");
        java.lang.String str32 = debitOrCredit25.getPaymentMessage();
        java.lang.String str33 = debitOrCredit25.getPaymentMessage();
        boolean boolean38 = debitOrCredit25.processPayment("7aecb00c-028c-4dcf-96cc-14d25bd709ab", (double) 100L, "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "0b35479f-5869-423e-9abc-e4ab9cef903d");
        paymentManager0.setStrategy((ParkingSystem.Strategy) debitOrCredit25);
        ParkingSystem.PaymentManager paymentManager40 = new ParkingSystem.PaymentManager();
        java.lang.String str41 = paymentManager40.refundMessage;
        boolean boolean44 = paymentManager40.refundWithoutDeposit((double) (short) 10, (double) '4');
        ParkingSystem.BookingManager bookingManager45 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager46 = new ParkingSystem.CheckInManager(bookingManager45);
        ParkingSystem.SpaceManager spaceManager47 = bookingManager45.getSpaceManager();
        double double50 = bookingManager45.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit51 = new ParkingSystem.DebitOrCredit();
        bookingManager45.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit51);
        boolean boolean57 = debitOrCredit51.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        paymentManager40.setStrategy((ParkingSystem.Strategy) debitOrCredit51);
        paymentManager0.setStrategy((ParkingSystem.Strategy) debitOrCredit51);
        boolean boolean64 = debitOrCredit51.processPayment("Refunded without deposit ($-96.0)", (double) 100, "", "ST001");
        java.lang.String str65 = debitOrCredit51.getPaymentMessage();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str10, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(spaceManager21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 165.0d + "'", double24 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Card number should be 16 digits" + "'", str32, "Card number should be 16 digits");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Card number should be 16 digits" + "'", str33, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(spaceManager47);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 165.0d + "'", double50 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Card number should be 16 digits" + "'", str65, "Card number should be 16 digits");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager1 = parkingSpaceFacade0.getSpaceManager();
        boolean boolean3 = parkingSpaceFacade0.cancelBooking("qPYDfDnbtD");
        java.lang.String str6 = parkingSpaceFacade0.scanSpace("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", "433f3d1f-f758-4ae3-972b-7fb179aedfd7");
        parkingSpaceFacade0.toggleSpace("2afd610d-a8cb-413a-bbee-7927f86b526c", "ua4ppOLtSl", false);
        org.junit.Assert.assertNotNull(spaceManager1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("Jane", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", 100, "jane", (int) (short) 1, "pass", (double) 10);
        int int8 = booking7.getDuration();
        int int9 = booking7.getDuration();
        boolean boolean10 = booking7.isCheckedIn();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
        ParkingSystem.BookingManager bookingManager18 = parkingSpaceFacade17.getBookingManager();
        ParkingSystem.BookingManager bookingManager19 = parkingSpaceFacade17.getBookingManager();
        double double21 = bookingManager19.getHourlyRate("Refunded without deposit ($-42.0)");
        double double24 = bookingManager19.calculateCost("Refunded without deposit ($0.0)", (int) (byte) 10);
        boolean boolean26 = bookingManager19.cancelBooking("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        ParkingSystem.AccountRegistry accountRegistry27 = bookingManager19.getAccountRegistry();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tbHxuilT" + "'", str6, "tbHxuilT");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertNotNull(bookingManager18);
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 165.0d + "'", double24 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(accountRegistry27);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        java.lang.String str11 = client0.getName();
        boolean boolean12 = client0.getIsValidated();
        ParkingSystem.User user13 = new ParkingSystem.User();
        java.lang.Object obj14 = user13.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = user13.parkingProxy;
        ParkingSystem.User user16 = new ParkingSystem.User();
        java.lang.Object obj17 = user16.user;
        ParkingSystem.Client client18 = ParkingSystem.Client.getInstance();
        java.lang.String str19 = client18.getName();
        client18.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry23 = parkingSpaceProxy22.getRegistry();
        boolean boolean25 = parkingSpaceProxy22.checkIn("");
        client18.assignProxy(parkingSpaceProxy22);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade27 = parkingSpaceProxy22.getFacade();
        user16.assignProxy(parkingSpaceProxy22);
        user13.parkingProxy = parkingSpaceProxy22;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade30 = parkingSpaceProxy22.getFacade();
        boolean boolean34 = parkingSpaceProxy22.editBooking("empty", "Refunded without deposit ($0.0)", 100);
        parkingSpaceProxy22.autoGenerateManager();
        boolean boolean37 = parkingSpaceProxy22.checkOut("4a1f2343-8b2e-4dea-ba69-efd105414390");
        client0.assignProxy(parkingSpaceProxy22);
        java.lang.String str39 = client0.getUsername();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tbHxuilT" + "'", str1, "tbHxuilT");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Jane" + "'", str10, "Jane");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tbHxuilT" + "'", str11, "tbHxuilT");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(parkingSpaceProxy15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(client18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tbHxuilT" + "'", str19, "tbHxuilT");
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade27);
        org.junit.Assert.assertNotNull(parkingSpaceFacade30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        java.lang.String str4 = paymentManager0.paymentMessage;
        boolean boolean6 = paymentManager0.refundTotalCost((double) (-1));
        boolean boolean9 = paymentManager0.refundWithoutDeposit((double) (byte) 1, 10.0d);
        paymentManager0.refundMessage = "CLT-23b57c8a-84c7-41fe-9781-bfe8a8f3fc04";
        java.lang.String str12 = paymentManager0.paymentMessage;
        boolean boolean15 = paymentManager0.refundWithoutDeposit((double) 35, (double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        ParkingSystem.AccountRegistry accountRegistry6 = null;
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("disabled", "staff", "staff", accountRegistry6);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry12 = parkingSpaceProxy11.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj17 = parkingSpaceProxy14.login("empty", "Jane");
        parkingSpaceProxy14.validateClient("Jane");
        parkingSpaceProxy14.toggleSpace("", "staff", false);
        accountRegistry12.assignProxyToManager("pass", parkingSpaceProxy14);
        ParkingSystem.Client client26 = accountRegistry12.getClient("");
        ParkingSystem.SuperManager superManager27 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry12);
        superManager7.registry = accountRegistry12;
        ParkingSystem.AccountRegistry accountRegistry29 = superManager7.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry34 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager35 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry34);
        superManager35.setManagerInfo("Paid $ 0.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", "Refunded total cost of $1.0");
        ParkingSystem.User user40 = new ParkingSystem.User();
        java.lang.Object obj41 = user40.user;
        ParkingSystem.Client client42 = ParkingSystem.Client.getInstance();
        java.lang.String str43 = client42.getName();
        client42.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy46 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry47 = parkingSpaceProxy46.getRegistry();
        boolean boolean49 = parkingSpaceProxy46.checkIn("");
        client42.assignProxy(parkingSpaceProxy46);
        boolean boolean51 = client42.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy52 = new ParkingSystem.ParkingSpaceProxy();
        client42.assignProxy(parkingSpaceProxy52);
        ParkingSystem.AccountRegistry accountRegistry54 = parkingSpaceProxy52.getRegistry();
        boolean boolean56 = parkingSpaceProxy52.checkIn("hi!");
        user40.parkingProxy = parkingSpaceProxy52;
        superManager35.assignProxy(parkingSpaceProxy52);
        accountRegistry29.assignProxyToManager("jane", parkingSpaceProxy52);
        ParkingSystem.SuperManager superManager60 = ParkingSystem.SuperManager.createFromCSV("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "", "13b04414-31a5-407f-8ea3-fba4613c73d1", accountRegistry29);
        boolean boolean62 = accountRegistry29.requiresValidation("Card number should be 16 digits");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(client26);
        org.junit.Assert.assertNotNull(superManager27);
        org.junit.Assert.assertNotNull(accountRegistry29);
        org.junit.Assert.assertNotNull(superManager35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(client42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "tbHxuilT" + "'", str43, "tbHxuilT");
        org.junit.Assert.assertNotNull(accountRegistry47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(accountRegistry54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(superManager60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        ParkingSystem.ParkingLot parkingLot7 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking9 = null;
        boolean boolean10 = parkingLot7.assignBooking(0, booking9);
        boolean boolean12 = parkingLot7.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking21 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean22 = parkingLot7.assignBooking((int) (short) -1, booking21);
        booking21.setCheckedIn(false);
        double double25 = booking21.getTotalCost();
        boolean boolean26 = parkingLot1.assignBooking((int) (short) 10, booking21);
        booking21.setCheckedIn(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        java.lang.String str7 = parkingSpaceFacade0.scanSpace("jane", "Refunded without deposit ($0.0)");
        java.lang.String str10 = parkingSpaceFacade0.scanSpace("2afd610d-a8cb-413a-bbee-7927f86b526c", "Paid $ -1.0 with Mobile Pay");
        ParkingSystem.BookingManager bookingManager11 = parkingSpaceFacade0.getBookingManager();
        java.lang.String str14 = parkingSpaceFacade0.scanSpace("I673kmcH", "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disabled" + "'", str7, "disabled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(bookingManager11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disabled" + "'", str14, "disabled");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        boolean boolean8 = parkingLotIterator7.hasNext();
        ParkingSystem.ParkingSpace parkingSpace9 = parkingLotIterator7.next();
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLotIterator7.next();
        boolean boolean11 = parkingLotIterator7.hasNext();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        java.lang.Object obj19 = user0.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "staff");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade20 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str23 = parkingSpaceFacade20.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager24 = parkingSpaceFacade20.getSpaceManager();
        spaceManager24.addParkingLot("hi!");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap27 = spaceManager24.getParkingLots();
        user0.user = spaceManager24;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy29 = user0.parkingProxy;
        parkingSpaceProxy29.displayPendingValidations();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tbHxuilT" + "'", str6, "tbHxuilT");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "disabled" + "'", str23, "disabled");
        org.junit.Assert.assertNotNull(spaceManager24);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(parkingSpaceProxy29);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        java.lang.String str7 = parkingSpaceFacade0.scanSpace("jane", "Refunded without deposit ($0.0)");
        java.lang.String str10 = parkingSpaceFacade0.scanSpace("Jane", "");
        ParkingSystem.Booking booking12 = parkingSpaceFacade0.getBookingDetails("4a1f2343-8b2e-4dea-ba69-efd105414390");
        boolean boolean22 = parkingSpaceFacade0.confirmBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", "02659ad3-0b5c-4c48-a915-a466f2b50775", 32, "02659ad3-0b5c-4c48-a915-a466f2b50775", (int) (short) 0, "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "89de8237-29df-4908-9de4-6dc1ce90de94");
        boolean boolean24 = parkingSpaceFacade0.checkOut("CLT-6bf41de3-8b5a-4cee-8fc7-f8abc4e5b750");
        boolean boolean26 = parkingSpaceFacade0.checkOut("Refunded total cost of $0.0");
        boolean boolean30 = parkingSpaceFacade0.editBooking("tbHxuilT", "CLT-ee40679d-6eaa-440b-8126-6ccceac50ddc", 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disabled" + "'", str7, "disabled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        client0.setValidated(true);
        java.lang.String str14 = client0.getPassword();
        java.lang.String str15 = client0.getPassword();
        boolean boolean17 = client0.extendBooking((int) (short) 10);
        boolean boolean18 = client0.checkOut();
        java.lang.String str19 = client0.getClientType();
        boolean boolean20 = client0.getIsValidated();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tbHxuilT" + "'", str1, "tbHxuilT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disabled" + "'", str14, "disabled");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "disabled" + "'", str15, "disabled");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("Paid $ 100.0 with Mobile Pay", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", (int) (short) 1, "2afd610d-a8cb-413a-bbee-7927f86b526c", 32, "", 30.0d);
        java.lang.String str8 = booking7.getLicensePlate();
        double double9 = booking7.getTotalCost();
        double double10 = booking7.getTotalCost();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        boolean boolean6 = paymentManager0.refundDeposit((double) 1);
        paymentManager0.paymentMessage = "Paid $ 10.0 with Mobile Pay";
        java.lang.String str9 = paymentManager0.paymentMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str9, "Paid $ 10.0 with Mobile Pay");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean10 = parkingSpaceFacade0.confirmBooking("staff", "", "disabled", "hi!", (int) 'a', "jane", (int) 'a', "hi!", "");
        parkingSpaceFacade0.toggleLot("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", true);
        boolean boolean15 = parkingSpaceFacade0.cancelBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        ParkingSystem.BookingManager bookingManager16 = parkingSpaceFacade0.getBookingManager();
        ParkingSystem.SpaceManager spaceManager17 = bookingManager16.getSpaceManager();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookingManager16);
        org.junit.Assert.assertNotNull(spaceManager17);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        parkingLot1.removeBooking(0);
        ParkingSystem.ParkingLotIterator parkingLotIterator10 = parkingLot1.getIterator();
        boolean boolean11 = parkingLotIterator10.hasNext();
        boolean boolean12 = parkingLotIterator10.hasNext();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertNotNull(parkingLotIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry12 = superManager11.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry15 = parkingSpaceProxy14.getRegistry();
        boolean boolean21 = parkingSpaceProxy14.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean25 = parkingSpaceProxy14.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean35 = parkingSpaceProxy14.confirmBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff", "disabled", (int) (short) 0, "Paid $ 100.0 with Mobile Pay", (int) (short) 10, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        accountRegistry12.assignProxyToManager("empty", parkingSpaceProxy14);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy38 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade39 = parkingSpaceProxy38.getFacade();
        accountRegistry12.assignProxyToManager("", parkingSpaceProxy38);
        ParkingSystem.User user42 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy43 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj46 = parkingSpaceProxy43.login("empty", "Jane");
        parkingSpaceProxy43.validateClient("Jane");
        parkingSpaceProxy43.toggleSpace("", "staff", false);
        boolean boolean54 = parkingSpaceProxy43.cancelBooking("");
        user42.assignProxy(parkingSpaceProxy43);
        parkingSpaceProxy43.displayPendingValidations();
        boolean boolean60 = parkingSpaceProxy43.editBooking("Paid $ -1.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", 100);
        accountRegistry12.assignProxyToManager("jane", parkingSpaceProxy43);
        parkingSpaceProxy43.validateClient("fhd49ADb");
        ParkingSystem.Booking booking65 = parkingSpaceProxy43.getBookingDetails("Card number should be 16 digits");
        boolean boolean67 = parkingSpaceProxy43.checkOut("8ca2ec61-774c-409d-89d5-5b9171b40497");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade39);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(booking65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        boolean boolean3 = parkingLot1.isSpaceAvailable((int) (byte) 1);
        ParkingSystem.ParkingLotIterator parkingLotIterator4 = parkingLot1.getIterator();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator4);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        boolean boolean7 = parkingSpaceProxy0.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean11 = parkingSpaceProxy0.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean13 = parkingSpaceProxy0.checkOut("Paid $ 15.0 with Mobile Pay");
        java.lang.String str16 = parkingSpaceProxy0.scanSpace("0b35479f-5869-423e-9abc-e4ab9cef903d", "4CGFxoSEo5");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "disabled" + "'", str16, "disabled");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        boolean boolean9 = bookingManager0.editBooking("hi!", "ST001", (int) ' ');
        boolean boolean14 = bookingManager0.extendBooking("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", 32, "CLT-035180a0-4707-410d-a011-2a4f0f46838b", "");
        boolean boolean24 = bookingManager0.confirmBooking("89de8237-29df-4908-9de4-6dc1ce90de94", "25527a32-01ef-45ba-816a-1d0a2fc2a52d", "8812812f-8c58-440e-9188-ca0b1f996ced", "CLT-6bf41de3-8b5a-4cee-8fc7-f8abc4e5b750", 52, "25527a32-01ef-45ba-816a-1d0a2fc2a52d", 0, "Paid $ 3.0 with Mobile Pay", "WxoDOyjI");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        boolean boolean11 = client0.extendBooking(100);
        client0.setValidated(true);
        boolean boolean16 = client0.editBooking("86z9Z9e0MN", 100);
        java.lang.String str17 = client0.getPassword();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str17, "Paid $ 10.0 with Mobile Pay");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkOut("");
        checkInManager1.refundMessage = "staff";
        checkInManager1.refundMessage = "Refunded total cost of $1.0";
        checkInManager1.refundMessage = "CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        boolean boolean6 = parkingSpaceProxy0.extendBooking("", 100);
        boolean boolean8 = parkingSpaceProxy0.checkOut("");
        java.lang.Object obj11 = parkingSpaceProxy0.login("4a1f2343-8b2e-4dea-ba69-efd105414390", "Refunded total cost of $0.0");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap7 = spaceManager0.getParkingLots();
        spaceManager0.removeBooking("CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit17 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit17);
        ParkingSystem.CheckInManager checkInManager19 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.CheckInManager checkInManager20 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager21 = bookingManager0.getSpaceManager();
        ParkingSystem.SpaceManager spaceManager22 = bookingManager0.getSpaceManager();
        double double25 = bookingManager0.calculateCost("aswfJGJtdF", 52);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertNotNull(spaceManager21);
        org.junit.Assert.assertNotNull(spaceManager22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 795.0d + "'", double25 == 795.0d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap18 = bookingManager0.getActiveBookings();
        ParkingSystem.SpaceManager spaceManager19 = bookingManager0.getSpaceManager();
        double double21 = bookingManager0.getDeposit("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        boolean boolean26 = bookingManager0.extendBooking("Jane", (int) ' ', "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753", "4c45f11e-b09a-4d81-adf1-86cfd519dc3c");
        double double29 = bookingManager0.calculateCost("25527a32-01ef-45ba-816a-1d0a2fc2a52d", (int) (byte) 1);
        boolean boolean39 = bookingManager0.confirmBooking("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", "TXCrKOGD", "CLT-c3ce9a25-7555-430c-9330-9203c36530f8", "8812812f-8c58-440e-9188-ca0b1f996ced", 32, "", 3, "CLT-2caa2dd4-57bd-417a-ab73-f721cc092df3", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        boolean boolean43 = bookingManager0.editBooking("CLT-5be1cd5a-d829-4101-9cd3-6006338eb786", "4CGFxoSEo5", 2);
        double double45 = bookingManager0.getDeposit("SRiN5ev00N");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(spaceManager19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 30.0d + "'", double29 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 15.0d + "'", double45 == 15.0d);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry14 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager15 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry14);
        boolean boolean17 = accountRegistry14.requiresValidation("disabled");
        int int18 = accountRegistry14.getManagersSize();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry14);
        ParkingSystem.AccountRegistry accountRegistry20 = superManager19.getRegistry();
        superManager4.registry = accountRegistry20;
        int int22 = accountRegistry20.getManagersSize();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertNotNull(accountRegistry20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.Client client3 = ParkingSystem.Client.getInstance();
        java.lang.String str4 = client3.getName();
        client3.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy7 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry8 = parkingSpaceProxy7.getRegistry();
        boolean boolean10 = parkingSpaceProxy7.checkIn("");
        client3.assignProxy(parkingSpaceProxy7);
        boolean boolean12 = client3.cancelBooking();
        java.lang.String str13 = client3.getExtraId();
        java.lang.String str14 = client3.getName();
        client3.setClientInfo("pass", "empty", "Jane", "pass", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", false);
        cSVManager0.saveClient(client3);
        ParkingSystem.AccountRegistry accountRegistry27 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager28 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry27);
        java.lang.String str29 = superManager28.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry33 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager34 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry33);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy36 = null;
        accountRegistry33.assignProxyToManager("disabled", parkingSpaceProxy36);
        superManager28.registry = accountRegistry33;
        cSVManager0.saveManager((ParkingSystem.Manager) superManager28);
        ParkingSystem.Client client40 = ParkingSystem.Client.getInstance();
        java.lang.String str41 = client40.getName();
        client40.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str50 = client40.getUsername();
        java.lang.String str51 = client40.getPassword();
        java.lang.String str52 = client40.getUsername();
        boolean boolean53 = client40.checkIn();
        cSVManager0.saveClient(client40);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy55 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry56 = parkingSpaceProxy55.getRegistry();
        java.lang.String str59 = parkingSpaceProxy55.scanSpace("empty", "hi!");
        parkingSpaceProxy55.addParkingLot("empty");
        parkingSpaceProxy55.addParkingLot("");
        client40.assignProxy(parkingSpaceProxy55);
        org.junit.Assert.assertNotNull(strArray1);
// flaky "31) test3245(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "18) test3245(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "empty" + "'", str4, "empty");
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "jane" + "'", str13, "jane");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "empty" + "'", str14, "empty");
        org.junit.Assert.assertNotNull(superManager28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str29, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager34);
        org.junit.Assert.assertNotNull(client40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "empty" + "'", str41, "empty");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "disabled" + "'", str51, "disabled");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(accountRegistry56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "disabled" + "'", str59, "disabled");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkOut("");
        boolean boolean5 = checkInManager1.checkIn("jane");
        boolean boolean7 = checkInManager1.checkOut("Paid $ 10.0 with Mobile Pay");
        boolean boolean9 = checkInManager1.checkIn("09622cbf-e665-45db-b1ad-365065947a20");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        ParkingSystem.AccountRegistry accountRegistry12 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager13 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry12);
        boolean boolean15 = accountRegistry12.requiresValidation("disabled");
        int int16 = accountRegistry12.getManagersSize();
        ParkingSystem.SuperManager superManager17 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry12);
        ParkingSystem.AccountRegistry accountRegistry18 = superManager17.getRegistry();
        accountRegistry18.validateClient("pass");
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("Refunded total cost of $1.0", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", accountRegistry18);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = null;
        superManager21.assignProxy(parkingSpaceProxy22);
        ParkingSystem.AccountRegistry accountRegistry24 = superManager21.getRegistry();
        ParkingSystem.Client client26 = accountRegistry24.getClient("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.SuperManager superManager27 = ParkingSystem.SuperManager.createFromCSV("Refunded without deposit ($-96.0)", "pass", "3b453211-7dd1-4452-8741-a206711c1217", accountRegistry24);
        ParkingSystem.AccountRegistry accountRegistry28 = superManager27.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry29 = superManager27.getRegistry();
        org.junit.Assert.assertNotNull(superManager13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(superManager17);
        org.junit.Assert.assertNotNull(accountRegistry18);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertNotNull(accountRegistry24);
        org.junit.Assert.assertNull(client26);
        org.junit.Assert.assertNotNull(superManager27);
        org.junit.Assert.assertNotNull(accountRegistry28);
        org.junit.Assert.assertNotNull(accountRegistry29);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        ParkingSystem.ParkingLot parkingLot10 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking12 = null;
        boolean boolean13 = parkingLot10.assignBooking(0, booking12);
        boolean boolean15 = parkingLot10.isSpaceAvailable((int) '#');
        boolean boolean17 = parkingLot10.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace19 = parkingLot10.getParkingSpace((int) (byte) 10);
        int int20 = parkingSpace19.getSpaceId();
        ParkingSystem.Booking booking21 = parkingSpace19.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager22 = new ParkingSystem.SpaceManager();
        boolean boolean25 = spaceManager22.isSpaceAvailable("hi!", (int) '#');
        spaceManager22.toggleLot("disabled", false);
        ParkingSystem.Booking booking38 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean39 = spaceManager22.assignBooking("empty", (int) (short) 0, booking38);
        boolean boolean40 = parkingSpace19.assignBooking(booking38);
        ParkingSystem.SpaceManager spaceManager41 = new ParkingSystem.SpaceManager();
        boolean boolean44 = spaceManager41.isSpaceAvailable("hi!", (int) '#');
        spaceManager41.toggleLot("disabled", false);
        ParkingSystem.Booking booking57 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean58 = spaceManager41.assignBooking("empty", (int) (short) 0, booking57);
        boolean boolean59 = booking57.isCheckedIn();
        java.lang.String str60 = booking57.getClientId();
        boolean boolean61 = parkingSpace19.assignBooking(booking57);
        boolean boolean62 = parkingLot1.assignBooking(1, booking57);
        boolean boolean64 = parkingLot1.isSpaceAvailable((int) (short) 100);
        ParkingSystem.ParkingLotIterator parkingLotIterator65 = parkingLot1.getIterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(booking21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "staff" + "'", str60, "staff");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator65);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        java.lang.String str11 = client0.getName();
        java.lang.String str12 = client0.getName();
        java.lang.String str13 = client0.getClientType();
        boolean boolean21 = client0.confirmBooking("disabled", "CLT-f02c481e-1504-4abf-b598-76152da8586a", 0, "Paid $ 10.0 with Mobile Pay", (int) (byte) 1, "CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc", "TXCrKOGD");
        ParkingSystem.Booking booking22 = client0.getBookingDetails();
        boolean boolean25 = client0.editBooking("hi!", 32);
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "disabled" + "'", str13, "disabled");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(booking22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        boolean boolean12 = accountRegistry9.requiresValidation("disabled");
        int int13 = accountRegistry9.getManagersSize();
        ParkingSystem.SuperManager superManager14 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry9);
        ParkingSystem.AccountRegistry accountRegistry15 = superManager14.getRegistry();
        accountRegistry15.validateClient("pass");
        ParkingSystem.SuperManager superManager18 = ParkingSystem.SuperManager.createFromCSV("Refunded total cost of $1.0", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", accountRegistry15);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = null;
        superManager18.assignProxy(parkingSpaceProxy19);
        ParkingSystem.AccountRegistry accountRegistry21 = superManager18.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry22 = superManager18.registry;
        java.lang.String str23 = superManager18.getName();
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertNotNull(accountRegistry21);
        org.junit.Assert.assertNotNull(accountRegistry22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str23, "Paid $ 0.0 with Mobile Pay");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit6 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit6);
        boolean boolean12 = debitOrCredit6.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str13 = debitOrCredit6.getPaymentMessage();
        boolean boolean18 = debitOrCredit6.processPayment("Paid $ 0.0 with Mobile Pay", 30.0d, "Paid $ -1.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay");
        boolean boolean21 = debitOrCredit6.validateCard("Jane", (double) '4');
        java.lang.String str22 = debitOrCredit6.getPaymentMessage();
        boolean boolean27 = debitOrCredit6.processPayment("86z9Z9e0MN", (double) 0, "jane", "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5");
        boolean boolean32 = debitOrCredit6.processPayment("qPYDfDnbtD", (double) 10L, "CLT-d2153556-bc61-49e7-b73d-6af2a45e5167", "");
        boolean boolean37 = debitOrCredit6.processPayment("Refunded total cost of $100.0", (double) (short) 1, "13b04414-31a5-407f-8ea3-fba4613c73d1", "25527a32-01ef-45ba-816a-1d0a2fc2a52d");
        boolean boolean40 = debitOrCredit6.validateCard("aa9c00f6-ec11-46c5-a72b-a7f620703e51", 15.0d);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Card number should be 16 digits" + "'", str13, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Card number should be 16 digits" + "'", str22, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("hi!", "disabled");
        spaceManager0.addParkingLot("Card number should be 16 digits");
        spaceManager0.loadParkingLots();
        spaceManager0.addParkingLot("CLT-2d7011d7-cb71-4953-84cc-0d7adf2da0d4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        java.lang.String str2 = client0.getName();
        java.lang.String str3 = client0.getClientType();
        java.lang.String str4 = client0.getClientType();
        boolean boolean5 = client0.cancelBooking();
        boolean boolean13 = client0.confirmBooking("0b35479f-5869-423e-9abc-e4ab9cef903d", "Refunded total cost of $-1.0", 32, "13b04414-31a5-407f-8ea3-fba4613c73d1", (int) (byte) 10, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0");
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.AccountRegistry accountRegistry14 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager15 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry14);
        superManager10.registry = accountRegistry14;
        ParkingSystem.SuperManager superManager17 = ParkingSystem.SuperManager.createFromCSV("pass", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry14);
        ParkingSystem.SuperManager superManager18 = ParkingSystem.SuperManager.createFromCSV("Paid $ -1.0 with Mobile Pay", "", "Jane", accountRegistry14);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking21 = parkingSpaceProxy19.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry22 = parkingSpaceProxy19.getRegistry();
        parkingSpaceProxy19.autoGenerateManager();
        superManager18.assignProxy(parkingSpaceProxy19);
        ParkingSystem.AccountRegistry accountRegistry25 = parkingSpaceProxy19.getRegistry();
        java.lang.String str28 = parkingSpaceProxy19.scanSpace("CLT-631eb509-a6c4-407c-b16d-582a6faabddb", "CLT-631eb509-a6c4-407c-b16d-582a6faabddb");
        parkingSpaceProxy19.displayPendingValidations();
        boolean boolean32 = parkingSpaceProxy19.extendBooking("Refunded deposit of $1.0", (-1));
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertNotNull(superManager17);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertNull(booking21);
        org.junit.Assert.assertNotNull(accountRegistry22);
        org.junit.Assert.assertNotNull(accountRegistry25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "disabled" + "'", str28, "disabled");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        boolean boolean19 = bookingManager0.cancelBooking("Paid $ 1470.0 with Mobile Pay");
        ParkingSystem.Booking booking21 = bookingManager0.getBooking("lL3e2yIMXI");
        ParkingSystem.BookingManager bookingManager22 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager23 = new ParkingSystem.CheckInManager(bookingManager22);
        ParkingSystem.Booking booking25 = bookingManager22.getBooking("");
        ParkingSystem.SpaceManager spaceManager26 = bookingManager22.getSpaceManager();
        boolean boolean36 = bookingManager22.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double38 = bookingManager22.getDeposit("Paid $ 10.0 with Mobile Pay");
        boolean boolean40 = bookingManager22.cancelBooking("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        ParkingSystem.AccountRegistry accountRegistry41 = bookingManager22.getAccountRegistry();
        ParkingSystem.AccountRegistry accountRegistry42 = bookingManager22.getAccountRegistry();
        ParkingSystem.DebitOrCredit debitOrCredit43 = new ParkingSystem.DebitOrCredit();
        bookingManager22.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit43);
        ParkingSystem.BookingManager bookingManager45 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager46 = new ParkingSystem.CheckInManager(bookingManager45);
        ParkingSystem.SpaceManager spaceManager47 = bookingManager45.getSpaceManager();
        double double50 = bookingManager45.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit51 = new ParkingSystem.DebitOrCredit();
        bookingManager45.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit51);
        boolean boolean57 = debitOrCredit51.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str58 = debitOrCredit51.getPaymentMessage();
        boolean boolean63 = debitOrCredit51.processPayment("9701df9a-2178-4ad5-8076-46ff5f05b3e8", 0.0d, "disabled", "");
        bookingManager22.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit51);
        boolean boolean69 = debitOrCredit51.processPayment("Paid $ 0.0 with Mobile Pay", (double) 1, "CLT-55105d92-54d6-44d2-965a-736022b7f7cd", "TXCrKOGD");
        boolean boolean74 = debitOrCredit51.processPayment("", (double) (byte) -1, "", "e8686ac8-1df7-4a9b-b299-8fbcdd585528");
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit51);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(booking21);
        org.junit.Assert.assertNull(booking25);
        org.junit.Assert.assertNotNull(spaceManager26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 15.0d + "'", double38 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(accountRegistry41);
        org.junit.Assert.assertNotNull(accountRegistry42);
        org.junit.Assert.assertNotNull(spaceManager47);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 165.0d + "'", double50 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Card number should be 16 digits" + "'", str58, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.BookingManager bookingManager1 = parkingSpaceFacade0.getBookingManager();
        ParkingSystem.Booking booking3 = parkingSpaceFacade0.getBookingDetails("");
        ParkingSystem.Booking booking5 = parkingSpaceFacade0.getBookingDetails("09622cbf-e665-45db-b1ad-365065947a20");
        org.junit.Assert.assertNotNull(bookingManager1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNull(booking5);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        ParkingSystem.Booking booking16 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean17 = spaceManager0.assignBooking("empty", (int) (short) 0, booking16);
        spaceManager0.loadParkingLots();
        java.lang.String str21 = spaceManager0.scanSpace("Refunded total cost of $0.0", "TXCrKOGD");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap22 = spaceManager0.getParkingLots();
        boolean boolean25 = spaceManager0.isSpaceAvailable("Refunded without deposit ($-42.0)", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "disabled" + "'", str21, "disabled");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        ParkingSystem.ParkingSpace parkingSpace1 = new ParkingSystem.ParkingSpace(10);
        ParkingSystem.ParkingLot parkingLot3 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking5 = null;
        boolean boolean6 = parkingLot3.assignBooking(0, booking5);
        boolean boolean8 = parkingLot3.isSpaceAvailable((int) '#');
        boolean boolean10 = parkingLot3.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot3.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking13 = parkingSpace12.getCurrentBooking();
        ParkingSystem.Booking booking14 = parkingSpace12.getCurrentBooking();
        ParkingSystem.Disabled disabled15 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace16 = null;
        java.lang.String str17 = disabled15.scanSpace(parkingSpace16);
        ParkingSystem.ParkingSpace parkingSpace18 = null;
        java.lang.String str19 = disabled15.scanSpace(parkingSpace18);
        parkingSpace12.setState((ParkingSystem.SpaceState) disabled15);
        parkingSpace1.setState((ParkingSystem.SpaceState) disabled15);
        ParkingSystem.ParkingLot parkingLot23 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking25 = null;
        boolean boolean26 = parkingLot23.assignBooking(0, booking25);
        boolean boolean28 = parkingLot23.isSpaceAvailable((int) '#');
        boolean boolean30 = parkingLot23.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace32 = parkingLot23.getParkingSpace((int) (byte) 10);
        int int33 = parkingSpace32.getSpaceId();
        java.lang.String str34 = parkingSpace32.scanSpace();
        java.lang.String str35 = disabled15.scanSpace(parkingSpace32);
        ParkingSystem.ParkingLot parkingLot37 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator38 = parkingLot37.getIterator();
        ParkingSystem.ParkingSpace parkingSpace40 = parkingLot37.getParkingSpace((int) (short) 10);
        boolean boolean41 = parkingSpace40.isAvailable();
        java.lang.String str42 = disabled15.scanSpace(parkingSpace40);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disabled" + "'", str17, "disabled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "empty" + "'", str34, "empty");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "disabled" + "'", str35, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator38);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "disabled" + "'", str42, "disabled");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.toggleSpace("jane", "Paid $ 10.0 with Mobile Pay", true);
        java.lang.Object obj10 = parkingSpaceProxy0.login("Refunded total cost of $-1.0", "3b453211-7dd1-4452-8741-a206711c1217");
        boolean boolean20 = parkingSpaceProxy0.confirmBooking("CLT-d2153556-bc61-49e7-b73d-6af2a45e5167", "CLT-035180a0-4707-410d-a011-2a4f0f46838b", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "Refunded total cost of $100.0", (int) (byte) 1, "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", (int) 'a', "CLT-035180a0-4707-410d-a011-2a4f0f46838b", "Paid $ 15.0 with Mobile Pay");
        ParkingSystem.Booking booking22 = parkingSpaceProxy0.getBookingDetails("lL3e2yIMXI");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(booking22);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator18 = parkingLot17.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator19 = parkingLot17.getIterator();
        user0.user = parkingLot17;
        ParkingSystem.User user21 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj25 = parkingSpaceProxy22.login("empty", "Jane");
        parkingSpaceProxy22.validateClient("Jane");
        parkingSpaceProxy22.toggleSpace("", "staff", false);
        boolean boolean33 = parkingSpaceProxy22.cancelBooking("");
        user21.assignProxy(parkingSpaceProxy22);
        user0.user = parkingSpaceProxy22;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy36 = user0.parkingProxy;
        parkingSpaceProxy36.addParkingLot("pass");
        boolean boolean40 = parkingSpaceProxy36.cancelBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        parkingSpaceProxy36.toggleLot("staff", false);
        parkingSpaceProxy36.displayPendingValidations();
        boolean boolean46 = parkingSpaceProxy36.cancelBooking("CLT-631eb509-a6c4-407c-b16d-582a6faabddb");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parkingSpaceProxy36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit17 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit17);
        boolean boolean23 = bookingManager0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "", "Jane");
        ParkingSystem.AccountRegistry accountRegistry24 = bookingManager0.getAccountRegistry();
        ParkingSystem.Manager manager25 = accountRegistry24.autoGenerateManager();
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(accountRegistry24);
        org.junit.Assert.assertNotNull(manager25);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        ParkingSystem.AccountRegistry accountRegistry3 = null;
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("disabled", "staff", "staff", accountRegistry3);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy8 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry9 = parkingSpaceProxy8.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj14 = parkingSpaceProxy11.login("empty", "Jane");
        parkingSpaceProxy11.validateClient("Jane");
        parkingSpaceProxy11.toggleSpace("", "staff", false);
        accountRegistry9.assignProxyToManager("pass", parkingSpaceProxy11);
        ParkingSystem.Client client23 = accountRegistry9.getClient("");
        ParkingSystem.SuperManager superManager24 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry9);
        superManager4.registry = accountRegistry9;
        superManager4.setManagerInfo("Refunded without deposit ($1.0)", "86z9Z9e0MN", "5XQfkf24zK");
        java.lang.String str30 = superManager4.getPassword();
        java.lang.String str31 = superManager4.getPassword();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(accountRegistry9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(client23);
        org.junit.Assert.assertNotNull(superManager24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "5XQfkf24zK" + "'", str30, "5XQfkf24zK");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "5XQfkf24zK" + "'", str31, "5XQfkf24zK");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Paid $ 10.0 with Mobile Pay", (int) (short) 0, "7aecb00c-028c-4dcf-96cc-14d25bd709ab", 1, "2afd610d-a8cb-413a-bbee-7927f86b526c", (-1.0d));
        boolean boolean8 = booking7.isCheckedIn();
        java.lang.String str9 = booking7.getLotId();
        java.lang.String str10 = booking7.getLicensePlate();
        boolean boolean11 = booking7.isCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str9, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str10, "2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
        ParkingSystem.BookingManager bookingManager18 = parkingSpaceFacade17.getBookingManager();
        boolean boolean23 = bookingManager18.extendBooking("Paid $ 0.0 with Mobile Pay", (int) 'a', "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        double double25 = bookingManager18.getHourlyRate("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        boolean boolean30 = bookingManager18.extendBooking("ST001", (int) (byte) 1, "86z9Z9e0MN", "disabled");
        ParkingSystem.SpaceManager spaceManager31 = bookingManager18.getSpaceManager();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertNotNull(bookingManager18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 15.0d + "'", double25 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(spaceManager31);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        java.lang.String str2 = client0.getUsername();
        java.lang.String str3 = client0.getExtraId();
        java.lang.String str4 = client0.getPassword();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        paymentManager0.refundMessage = "disabled";
        boolean boolean10 = paymentManager0.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        java.lang.String str11 = paymentManager0.paymentMessage;
        java.lang.String str12 = paymentManager0.refundMessage;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        ParkingSystem.BookingManager bookingManager8 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager9 = new ParkingSystem.CheckInManager(bookingManager8);
        ParkingSystem.SpaceManager spaceManager10 = bookingManager8.getSpaceManager();
        double double13 = bookingManager8.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit14 = new ParkingSystem.DebitOrCredit();
        bookingManager8.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit14);
        boolean boolean20 = debitOrCredit14.processPayment("2afd610d-a8cb-413a-bbee-7927f86b526c", (double) (-1), "Paid $ -1.0 with Mobile Pay", "");
        java.lang.String str21 = debitOrCredit14.getPaymentMessage();
        java.lang.String str22 = debitOrCredit14.getPaymentMessage();
        java.lang.String str23 = debitOrCredit14.getPaymentMessage();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(spaceManager10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 165.0d + "'", double13 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Card number should be 16 digits" + "'", str21, "Card number should be 16 digits");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Card number should be 16 digits" + "'", str22, "Card number should be 16 digits");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Card number should be 16 digits" + "'", str23, "Card number should be 16 digits");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        java.lang.Object obj18 = user0.login("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Paid $ 0.0 with Mobile Pay");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = new ParkingSystem.ParkingSpaceProxy();
        boolean boolean21 = parkingSpaceProxy19.cancelBooking("pass");
        parkingSpaceProxy19.addParkingLot("pass");
        boolean boolean25 = parkingSpaceProxy19.checkIn("Paid $ 100.0 with Mobile Pay");
        boolean boolean31 = parkingSpaceProxy19.register("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Refunded without deposit ($-42.0)", "Paid $ 0.0 with Mobile Pay", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "disabled");
        user0.parkingProxy = parkingSpaceProxy19;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", (int) (short) 1, "", (int) (byte) 10, "5XQfkf24zK", (double) 10.0f);
        java.lang.String str8 = booking7.getClientId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
        boolean boolean21 = parkingSpaceProxy9.editBooking("empty", "Refunded without deposit ($0.0)", 100);
        parkingSpaceProxy9.autoGenerateManager();
        boolean boolean24 = parkingSpaceProxy9.checkOut("4a1f2343-8b2e-4dea-ba69-efd105414390");
        boolean boolean26 = parkingSpaceProxy9.cancelBooking("CLT-2d7011d7-cb71-4953-84cc-0d7adf2da0d4");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7aecb00c-028c-4dcf-96cc-14d25bd709ab" + "'", str6, "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        java.lang.String str4 = paymentManager0.paymentMessage;
        boolean boolean6 = paymentManager0.refundTotalCost((double) (-1));
        boolean boolean11 = paymentManager0.processPayment("Paid $ 10.0 with Mobile Pay", (double) (byte) -1, "e578d6f7-8a26-46f0-8e2f-f3b1be5242ca", "Refunded without deposit ($0.0)");
        boolean boolean13 = paymentManager0.refundTotalCost(495.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

//    @Test
//    public void test3272() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest6.test3272");
//        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
//        java.lang.String str1 = paymentManager0.refundMessage;
//        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
//        paymentManager0.refundMessage = "disabled";
//        boolean boolean10 = paymentManager0.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
//        ParkingSystem.MobilePay mobilePay11 = new ParkingSystem.MobilePay();
//        boolean boolean16 = mobilePay11.processPayment("disabled", 10.0d, "disabled", "disabled");
//        java.lang.String str17 = mobilePay11.getPaymentMessage();
//        java.lang.String str18 = mobilePay11.getPaymentMessage();
//        paymentManager0.setStrategy((ParkingSystem.Strategy) mobilePay11);
//        boolean boolean21 = paymentManager0.refundTotalCost((double) (byte) 10);
//        paymentManager0.paymentMessage = "4a1f2343-8b2e-4dea-ba69-efd105414390";
//        java.lang.String str24 = paymentManager0.paymentMessage;
//        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
//        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
//        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
//        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
//        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str17, "Paid $ 10.0 with Mobile Pay");
//        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str18, "Paid $ 10.0 with Mobile Pay");
//        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
//        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4a1f2343-8b2e-4dea-ba69-efd105414390" + "'", str24, "4a1f2343-8b2e-4dea-ba69-efd105414390");
//    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        ParkingSystem.Client client20 = ParkingSystem.Client.getInstance();
        java.lang.String str21 = client20.getName();
        client20.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy24 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry25 = parkingSpaceProxy24.getRegistry();
        boolean boolean27 = parkingSpaceProxy24.checkIn("");
        client20.assignProxy(parkingSpaceProxy24);
        boolean boolean29 = client20.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy30 = new ParkingSystem.ParkingSpaceProxy();
        client20.assignProxy(parkingSpaceProxy30);
        ParkingSystem.AccountRegistry accountRegistry32 = parkingSpaceProxy30.getRegistry();
        boolean boolean34 = parkingSpaceProxy30.checkIn("hi!");
        user0.assignProxy(parkingSpaceProxy30);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy36 = new ParkingSystem.ParkingSpaceProxy();
        boolean boolean38 = parkingSpaceProxy36.cancelBooking("pass");
        user0.parkingProxy = parkingSpaceProxy36;
        java.lang.Object obj42 = user0.login("CLT-2d7011d7-cb71-4953-84cc-0d7adf2da0d4", "2195f5f7-08e1-4b73-b5b8-a479a5b3e3c8");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNull(parkingSpaceProxy19);
        org.junit.Assert.assertNotNull(client20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "7aecb00c-028c-4dcf-96cc-14d25bd709ab" + "'", str21, "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertNotNull(accountRegistry25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(accountRegistry32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry18 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry18);
        java.lang.String str20 = superManager19.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry24 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager25 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry24);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = null;
        accountRegistry24.assignProxyToManager("disabled", parkingSpaceProxy27);
        superManager19.registry = accountRegistry24;
        superManager4.registry = accountRegistry24;
        java.util.List<ParkingSystem.Client> clientList31 = accountRegistry24.displayPendingValidations();
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap32 = accountRegistry24.getManagers();
        ParkingSystem.Manager manager33 = accountRegistry24.autoGenerateManager();
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap34 = accountRegistry24.getManagers();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Refunded without deposit ($1.0)" + "'", str5, "Refunded without deposit ($1.0)");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Refunded without deposit ($1.0)" + "'", str20, "Refunded without deposit ($1.0)");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(clientList31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(manager33);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj9 = parkingSpaceProxy6.login("empty", "Jane");
        parkingSpaceProxy6.validateClient("Jane");
        parkingSpaceProxy6.toggleSpace("", "staff", false);
        accountRegistry4.assignProxyToManager("pass", parkingSpaceProxy6);
        ParkingSystem.Client client18 = accountRegistry4.getClient("");
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry4);
        ParkingSystem.AccountRegistry accountRegistry23 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager24 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry23);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy26 = null;
        accountRegistry23.assignProxyToManager("disabled", parkingSpaceProxy26);
        boolean boolean29 = accountRegistry23.requiresValidation("disabled");
        int int30 = accountRegistry23.getManagersSize();
        superManager19.registry = accountRegistry23;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy33 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry34 = parkingSpaceProxy33.getRegistry();
        java.lang.String str37 = parkingSpaceProxy33.scanSpace("empty", "hi!");
        parkingSpaceProxy33.addParkingLot("empty");
        boolean boolean49 = parkingSpaceProxy33.confirmBooking("disabled", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Paid $ -1.0 with Mobile Pay", "staff", (int) (short) 10, "Paid $ 10.0 with Mobile Pay", 0, "hi!", "Paid $ 10.0 with Mobile Pay");
        boolean boolean53 = parkingSpaceProxy33.editBooking("staff", "jane", (int) (byte) 0);
        accountRegistry23.assignProxyToClient("e8686ac8-1df7-4a9b-b299-8fbcdd585528", parkingSpaceProxy33);
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(client18);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertNotNull(superManager24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(accountRegistry34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "disabled" + "'", str37, "disabled");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = parkingSpaceProxy0.getFacade();
        ParkingSystem.CheckInManager checkInManager2 = parkingSpaceFacade1.getCheckInManager();
        boolean boolean4 = checkInManager2.checkIn("Paid $ -1.0 with Mobile Pay");
        boolean boolean6 = checkInManager2.checkOut("3b453211-7dd1-4452-8741-a206711c1217");
        checkInManager2.refundMessage = "jane";
        org.junit.Assert.assertNotNull(parkingSpaceFacade1);
        org.junit.Assert.assertNotNull(checkInManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        ParkingSystem.CheckInManager checkInManager18 = new ParkingSystem.CheckInManager(bookingManager0);
        java.lang.String str19 = checkInManager18.refundMessage;
        boolean boolean21 = checkInManager18.checkIn("25527a32-01ef-45ba-816a-1d0a2fc2a52d");
        boolean boolean23 = checkInManager18.checkOut("fhd49ADb");
        boolean boolean25 = checkInManager18.checkIn("lL3e2yIMXI");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        ParkingSystem.AccountRegistry accountRegistry3 = null;
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("pass", "empty", "Jane", accountRegistry3);
        java.lang.String str5 = superManager4.getName();
        ParkingSystem.AccountRegistry accountRegistry6 = superManager4.registry;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy7 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry8 = parkingSpaceProxy7.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry9 = parkingSpaceProxy7.getRegistry();
        superManager4.registry = accountRegistry9;
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "86z9Z9e0MN" + "'", str5, "86z9Z9e0MN");
        org.junit.Assert.assertNotNull(accountRegistry6);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertNotNull(accountRegistry9);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("jane", "");
        spaceManager0.toggleLot("Jane", true);
        spaceManager0.addParkingLot("Paid $ -1.0 with Mobile Pay");
        spaceManager0.toggleLot("hi!", false);
        spaceManager0.toggleSpace("CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6", "", true);
        java.lang.String str21 = spaceManager0.scanSpace("Refunded without deposit ($0.0)", "86z9Z9e0MN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "disabled" + "'", str21, "disabled");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy13 = null;
        client0.assignProxy(parkingSpaceProxy13);
        client0.setClientInfo("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "Paid $ -1.0 with Mobile Pay", "2afd610d-a8cb-413a-bbee-7927f86b526c", "2afd610d-a8cb-413a-bbee-7927f86b526c", "empty", "disabled", false);
        java.lang.String str23 = client0.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = client0.extendBooking((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.ParkingSpaceProxy.extendBooking(String, int)\" because \"this.parkingProxy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7aecb00c-028c-4dcf-96cc-14d25bd709ab" + "'", str1, "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str23, "2afd610d-a8cb-413a-bbee-7927f86b526c");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade1.checkIn("");
        ParkingSystem.BookingManager bookingManager4 = parkingSpaceFacade1.getBookingManager();
        parkingSpaceFacade1.toggleLot("Paid $ -1.0 with Mobile Pay", false);
        user0.user = "Paid $ -1.0 with Mobile Pay";
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj12 = parkingSpaceProxy9.login("empty", "Jane");
        boolean boolean15 = parkingSpaceProxy9.extendBooking("", 100);
        boolean boolean19 = parkingSpaceProxy9.editBooking("Paid $ 10.0 with Mobile Pay", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", (int) (short) 10);
        parkingSpaceProxy9.toggleLot("2afd610d-a8cb-413a-bbee-7927f86b526c", true);
        user0.parkingProxy = parkingSpaceProxy9;
        java.lang.Object obj26 = user0.login("2afd610d-a8cb-413a-bbee-7927f86b526c", "Jane");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj26);
    }

//    @Test
//    public void test3282() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest6.test3282");
//        ParkingSystem.User user0 = new ParkingSystem.User();
//        java.lang.Object obj1 = user0.user;
//        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
//        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
//        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
//        boolean boolean6 = parkingSpaceProxy3.checkIn("");
//        parkingSpaceProxy3.validateClient("");
//        user0.assignProxy(parkingSpaceProxy3);
//        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy10 = user0.parkingProxy;
//        java.lang.Object obj13 = user0.login("empty", "2afd610d-a8cb-413a-bbee-7927f86b526c");
//        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
//        ParkingSystem.Booking booking16 = parkingSpaceProxy14.getBookingDetails("Paid $ -1.0 with Mobile Pay");
//        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy14.getFacade();
//        boolean boolean19 = parkingSpaceProxy14.checkOut("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
//        user0.parkingProxy = parkingSpaceProxy14;
//        ParkingSystem.PaymentManager paymentManager21 = new ParkingSystem.PaymentManager();
//        java.lang.String str22 = paymentManager21.refundMessage;
//        boolean boolean24 = paymentManager21.refundTotalCost((-1.0d));
//        paymentManager21.refundMessage = "disabled";
//        boolean boolean31 = paymentManager21.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
//        ParkingSystem.MobilePay mobilePay32 = new ParkingSystem.MobilePay();
//        boolean boolean37 = mobilePay32.processPayment("disabled", 10.0d, "disabled", "disabled");
//        java.lang.String str38 = mobilePay32.getPaymentMessage();
//        java.lang.String str39 = mobilePay32.getPaymentMessage();
//        paymentManager21.setStrategy((ParkingSystem.Strategy) mobilePay32);
//        user0.user = paymentManager21;
//        java.lang.Object obj42 = user0.user;
//        org.junit.Assert.assertNull(obj1);
//        org.junit.Assert.assertNull(parkingSpaceProxy2);
//        org.junit.Assert.assertNotNull(accountRegistry4);
//        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
//        org.junit.Assert.assertNotNull(parkingSpaceProxy10);
//        org.junit.Assert.assertNull(obj13);
//        org.junit.Assert.assertNull(booking16);
//        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
//        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
//        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
//        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
//        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
//        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
//        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str38, "Paid $ 10.0 with Mobile Pay");
//        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str39, "Paid $ 10.0 with Mobile Pay");
//        org.junit.Assert.assertNotNull(obj42);
//    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.AccountRegistry accountRegistry20 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry20);
        java.lang.String str22 = superManager21.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry23 = superManager21.registry;
        java.lang.String str24 = superManager21.getManagerId();
        ParkingSystem.Client client25 = ParkingSystem.Client.getInstance();
        java.lang.String str26 = client25.getName();
        client25.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy29 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry30 = parkingSpaceProxy29.getRegistry();
        boolean boolean32 = parkingSpaceProxy29.checkIn("");
        client25.assignProxy(parkingSpaceProxy29);
        boolean boolean34 = client25.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy35 = new ParkingSystem.ParkingSpaceProxy();
        client25.assignProxy(parkingSpaceProxy35);
        superManager21.assignProxy(parkingSpaceProxy35);
        user0.assignProxy(parkingSpaceProxy35);
        ParkingSystem.AccountRegistry accountRegistry39 = parkingSpaceProxy35.getRegistry();
        java.lang.String str42 = parkingSpaceProxy35.scanSpace("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "");
        java.lang.Object obj45 = parkingSpaceProxy35.login("jane", "Refunded without deposit ($0.0)");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade46 = parkingSpaceProxy35.getFacade();
        boolean boolean48 = parkingSpaceFacade46.cancelBooking("CLT-ee40679d-6eaa-440b-8126-6ccceac50ddc");
        ParkingSystem.Booking booking50 = parkingSpaceFacade46.getBookingDetails("SRiN5ev00N");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str6, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Refunded without deposit ($1.0)" + "'", str22, "Refunded without deposit ($1.0)");
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Refunded without deposit ($1.0)" + "'", str24, "Refunded without deposit ($1.0)");
        org.junit.Assert.assertNotNull(client25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str26, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(accountRegistry39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "disabled" + "'", str42, "disabled");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(parkingSpaceFacade46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(booking50);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.Manager manager8 = superManager4.autoGenerateManager();
        java.lang.String str9 = superManager4.getPassword();
        superManager4.setManagerInfo("79e86af2-7061-42df-ba07-6f6ce7f1b89c", "CLT-32d5cdc9-3c20-4f30-9d68-0be20fdf349c", "CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Refunded without deposit ($1.0)" + "'", str5, "Refunded without deposit ($1.0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Refunded without deposit ($1.0)" + "'", str6, "Refunded without deposit ($1.0)");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(manager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5XQfkf24zK" + "'", str9, "5XQfkf24zK");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        ParkingSystem.Booking booking4 = null;
        boolean boolean5 = parkingLot1.assignBooking((int) (short) 1, booking4);
        parkingLot1.removeBooking((int) (short) 0);
        boolean boolean8 = parkingLot1.isEnabled();
        ParkingSystem.ParkingLotIterator parkingLotIterator9 = parkingLot1.getIterator();
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot1.getParkingSpace(0);
        ParkingSystem.ParkingLot parkingLot13 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking15 = null;
        boolean boolean16 = parkingLot13.assignBooking(0, booking15);
        boolean boolean18 = parkingLot13.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking27 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean28 = parkingLot13.assignBooking((int) (short) -1, booking27);
        java.lang.String str29 = booking27.getLotId();
        java.lang.String str30 = booking27.getLicensePlate();
        booking27.setStartTime("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        booking27.setStartTime("83a51dc6-0c8f-4f21-ae40-68699828f95d");
        boolean boolean35 = parkingSpace11.assignBooking(booking27);
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator9);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "jane" + "'", str29, "jane");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "disabled" + "'", str30, "disabled");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        superManager4.setManagerInfo("Paid $ 0.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", "Refunded total cost of $1.0");
        java.lang.String str9 = superManager4.getPassword();
        java.lang.String str10 = superManager4.getManagerId();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Refunded total cost of $1.0" + "'", str9, "Refunded total cost of $1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str10, "Paid $ 0.0 with Mobile Pay");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        boolean boolean8 = parkingLot1.isEnabled();
        boolean boolean10 = parkingLot1.isSpaceAvailable((int) (short) 100);
        ParkingSystem.ParkingLotIterator parkingLotIterator11 = parkingLot1.getIterator();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator11);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("Paid $ 100.0 with Mobile Pay", "Jane", "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        java.lang.String str5 = manager0.getName();
        java.lang.String str6 = manager0.getName();
        ParkingSystem.Client client7 = ParkingSystem.Client.getInstance();
        java.lang.String str8 = client7.getName();
        client7.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str17 = client7.getUsername();
        java.lang.String str18 = client7.getPassword();
        java.lang.String str19 = client7.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy20 = null;
        client7.assignProxy(parkingSpaceProxy20);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj25 = parkingSpaceProxy22.login("empty", "Jane");
        client7.assignProxy(parkingSpaceProxy22);
        parkingSpaceProxy22.validateClient("13b04414-31a5-407f-8ea3-fba4613c73d1");
        manager0.assignProxy(parkingSpaceProxy22);
        boolean boolean31 = parkingSpaceProxy22.cancelBooking("CLT-f02c481e-1504-4abf-b598-76152da8586a");
        org.junit.Assert.assertNotNull(manager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Jane" + "'", str5, "Jane");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Jane" + "'", str6, "Jane");
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str8, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        parkingSpaceFacade0.addParkingLot("");
        boolean boolean12 = parkingSpaceFacade0.confirmBooking("pass", "pass", "Jane", "", (int) (short) 10, "", (int) ' ', "hi!", "jane");
        ParkingSystem.BookingManager bookingManager13 = parkingSpaceFacade0.getBookingManager();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingManager13);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking15 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean16 = parkingLot1.assignBooking((int) (short) -1, booking15);
        java.lang.String str17 = booking15.getLotId();
        java.lang.String str18 = booking15.getLicensePlate();
        booking15.setStartTime("hi!");
        java.lang.String str21 = booking15.getStartTime();
        java.lang.String str22 = booking15.getLicensePlate();
        java.lang.String str23 = booking15.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime24 = booking15.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "jane" + "'", str17, "jane");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "disabled" + "'", str22, "disabled");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str3 = parkingSpaceFacade0.scanSpace("disabled", "empty");
        boolean boolean5 = parkingSpaceFacade0.cancelBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        ParkingSystem.SpaceManager spaceManager6 = parkingSpaceFacade0.getSpaceManager();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(spaceManager6);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("jane", "");
        spaceManager0.toggleLot("Jane", true);
        java.lang.String str12 = spaceManager0.scanSpace("CLT-0018b5f2-4f8d-4ac6-8c8d-394f6b7b51a1", "5IYmtlKE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        java.lang.Object obj19 = user0.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "staff");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade20 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str23 = parkingSpaceFacade20.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager24 = parkingSpaceFacade20.getSpaceManager();
        spaceManager24.addParkingLot("hi!");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap27 = spaceManager24.getParkingLots();
        user0.user = spaceManager24;
        java.lang.Object obj29 = null;
        user0.user = obj29;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy34 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry35 = parkingSpaceProxy34.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy37 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj40 = parkingSpaceProxy37.login("empty", "Jane");
        parkingSpaceProxy37.validateClient("Jane");
        parkingSpaceProxy37.toggleSpace("", "staff", false);
        accountRegistry35.assignProxyToManager("pass", parkingSpaceProxy37);
        ParkingSystem.Client client49 = accountRegistry35.getClient("");
        ParkingSystem.SuperManager superManager50 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry35);
        boolean boolean56 = accountRegistry35.registerClient("hi!", "Refunded total cost of $1.0", "2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy58 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry59 = parkingSpaceProxy58.getRegistry();
        boolean boolean61 = parkingSpaceProxy58.checkIn("");
        parkingSpaceProxy58.toggleLot("", true);
        accountRegistry35.assignProxyToManager("", parkingSpaceProxy58);
        user0.parkingProxy = parkingSpaceProxy58;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy67 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj70 = parkingSpaceProxy67.login("empty", "Jane");
        boolean boolean73 = parkingSpaceProxy67.extendBooking("pass", 0);
        boolean boolean75 = parkingSpaceProxy67.checkOut("Paid $ 10.0 with Mobile Pay");
        java.lang.String str78 = parkingSpaceProxy67.scanSpace("hi!", "Jane");
        boolean boolean80 = parkingSpaceProxy67.cancelBooking("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        boolean boolean82 = parkingSpaceProxy67.checkIn("86z9Z9e0MN");
        boolean boolean85 = parkingSpaceProxy67.extendBooking("staff", (int) (short) -1);
        user0.assignProxy(parkingSpaceProxy67);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy87 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking89 = parkingSpaceProxy87.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        boolean boolean95 = parkingSpaceProxy87.register("staff", "pass", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "Refunded without deposit ($0.0)", "hi!");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade96 = parkingSpaceProxy87.getFacade();
        user0.assignProxy(parkingSpaceProxy87);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "disabled" + "'", str23, "disabled");
        org.junit.Assert.assertNotNull(spaceManager24);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(accountRegistry35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(client49);
        org.junit.Assert.assertNotNull(superManager50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(accountRegistry59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "disabled" + "'", str78, "disabled");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(booking89);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(parkingSpaceFacade96);
    }

//    @Test
//    public void test3294() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest6.test3294");
//        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
//        paymentManager0.refundMessage = "";
//        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
//        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
//        boolean boolean8 = paymentManager0.refundTotalCost((double) (short) 100);
//        boolean boolean13 = paymentManager0.processPayment("", (double) 0, "Paid $ 100.0 with Mobile Pay", "Refunded without deposit ($-42.0)");
//        ParkingSystem.PaymentManager paymentManager14 = new ParkingSystem.PaymentManager();
//        paymentManager14.refundMessage = "";
//        boolean boolean18 = paymentManager14.refundTotalCost((double) (byte) 1);
//        paymentManager14.paymentMessage = "Paid $ 100.0 with Mobile Pay";
//        boolean boolean23 = paymentManager14.refundWithoutDeposit((double) 1L, (double) 'a');
//        java.lang.String str24 = paymentManager14.paymentMessage;
//        boolean boolean29 = paymentManager14.processPayment("disabled", (double) (short) 1, "ST001", "2afd610d-a8cb-413a-bbee-7927f86b526c");
//        ParkingSystem.Strategy strategy30 = null;
//        paymentManager14.setStrategy(strategy30);
//        java.lang.String str32 = paymentManager14.refundMessage;
//        ParkingSystem.MobilePay mobilePay33 = new ParkingSystem.MobilePay();
//        boolean boolean38 = mobilePay33.processPayment("disabled", 10.0d, "disabled", "disabled");
//        java.lang.String str39 = mobilePay33.getPaymentMessage();
//        java.lang.String str40 = mobilePay33.getPaymentMessage();
//        boolean boolean45 = mobilePay33.processPayment("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", 1.0d, "disabled", "Refunded without deposit ($0.0)");
//        paymentManager14.setStrategy((ParkingSystem.Strategy) mobilePay33);
//        paymentManager0.setStrategy((ParkingSystem.Strategy) mobilePay33);
//        java.lang.String str48 = paymentManager0.refundMessage;
//        paymentManager0.paymentMessage = "CLT-ee40679d-6eaa-440b-8126-6ccceac50ddc";
//        boolean boolean53 = paymentManager0.refundWithoutDeposit((double) (short) -1, 75.0d);
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
//        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
//        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
//        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
//        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str24, "Paid $ 100.0 with Mobile Pay");
//        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
//        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Refunded without deposit ($-96.0)" + "'", str32, "Refunded without deposit ($-96.0)");
//        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
//        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str39, "Paid $ 10.0 with Mobile Pay");
//        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str40, "Paid $ 10.0 with Mobile Pay");
//        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
//        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Refunded total cost of $100.0" + "'", str48, "Refunded total cost of $100.0");
//        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
//    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking2 = parkingSpaceProxy0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry3 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.Manager manager4 = accountRegistry3.autoGenerateManager();
        java.lang.String str5 = manager4.getName();
        java.lang.String str6 = manager4.getManagerId();
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(accountRegistry3);
        org.junit.Assert.assertNotNull(manager4);
// flaky "32) test3295(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ago0FeIU" + "'", str5, "Ago0FeIU");
// flaky "19) test3295(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "568d2917-ce6c-4764-8c9a-df0e104148a4" + "'", str6, "568d2917-ce6c-4764-8c9a-df0e104148a4");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        parkingLot1.setEnabled(true);
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        ParkingSystem.ParkingSpace parkingSpace8 = parkingLotIterator7.next();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertNotNull(parkingSpace8);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.lang.String[] strArray6 = cSVManager0.loadSuperManager();
        ParkingSystem.Client client7 = ParkingSystem.Client.getInstance();
        java.lang.String str8 = client7.getName();
        client7.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str17 = client7.getUsername();
        java.lang.String str18 = client7.getPassword();
        java.lang.String str19 = client7.getClientType();
        boolean boolean20 = client7.getIsValidated();
        boolean boolean28 = client7.confirmBooking("hi!", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "Paid $ 100.0 with Mobile Pay", (-1), "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "empty");
        java.lang.String str29 = client7.getName();
        boolean boolean30 = client7.getIsValidated();
        cSVManager0.saveClient(client7);
        java.lang.String[] strArray32 = cSVManager0.loadSuperManager();
        ParkingSystem.SpaceManager spaceManager33 = new ParkingSystem.SpaceManager();
        boolean boolean36 = spaceManager33.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str39 = spaceManager33.scanSpace("disabled", "");
        spaceManager33.addParkingLot("hi!");
        java.lang.String str44 = spaceManager33.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap45 = spaceManager33.getParkingLots();
        cSVManager0.loadParkingLots(strMap45);
        ParkingSystem.CSVManager cSVManager47 = new ParkingSystem.CSVManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade48 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager49 = parkingSpaceFacade48.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager50 = parkingSpaceFacade48.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap51 = spaceManager50.getParkingLots();
        cSVManager47.loadParkingLots(strMap51);
        java.lang.String[] strArray53 = cSVManager47.loadSuperManager();
        ParkingSystem.SpaceManager spaceManager54 = new ParkingSystem.SpaceManager();
        boolean boolean57 = spaceManager54.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str60 = spaceManager54.scanSpace("disabled", "");
        spaceManager54.toggleSpace("Refunded without deposit ($0.0)", "disabled", false);
        spaceManager54.removeBooking("qPYDfDnbtD", (int) (byte) 1);
        spaceManager54.removeBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab", (int) (byte) 100);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap71 = spaceManager54.getParkingLots();
        cSVManager47.saveParkingLots(strMap71);
        cSVManager0.loadParkingLots(strMap71);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArray6);
// flaky "33) test3297(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray32);
// flaky "20) test3297(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "disabled" + "'", str39, "disabled");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "disabled" + "'", str44, "disabled");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(checkInManager49);
        org.junit.Assert.assertNotNull(spaceManager50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(strArray53);
// flaky "10) test3297(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "disabled" + "'", str60, "disabled");
        org.junit.Assert.assertNotNull(strMap71);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        java.lang.String str8 = parkingSpaceProxy0.scanSpace("", "");
        boolean boolean10 = parkingSpaceProxy0.checkIn("5IYmtlKE");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "disabled" + "'", str8, "disabled");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj4 = parkingSpaceProxy1.login("empty", "Jane");
        parkingSpaceProxy1.validateClient("Jane");
        parkingSpaceProxy1.toggleSpace("", "staff", false);
        boolean boolean12 = parkingSpaceProxy1.cancelBooking("");
        user0.assignProxy(parkingSpaceProxy1);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry15 = parkingSpaceProxy14.getRegistry();
        boolean boolean21 = parkingSpaceProxy14.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean25 = parkingSpaceProxy14.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        user0.parkingProxy = parkingSpaceProxy14;
        ParkingSystem.Client client27 = ParkingSystem.Client.getInstance();
        java.lang.String str28 = client27.getClientType();
        java.lang.String str29 = client27.getPassword();
        user0.user = client27;
        ParkingSystem.Client client31 = ParkingSystem.Client.getInstance();
        java.lang.String str32 = client31.getName();
        client31.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy35 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry36 = parkingSpaceProxy35.getRegistry();
        boolean boolean38 = parkingSpaceProxy35.checkIn("");
        client31.assignProxy(parkingSpaceProxy35);
        boolean boolean40 = client31.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy41 = new ParkingSystem.ParkingSpaceProxy();
        client31.assignProxy(parkingSpaceProxy41);
        boolean boolean52 = parkingSpaceProxy41.confirmBooking("staff", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "", "Paid $ -1.0 with Mobile Pay", 10, "Refunded without deposit ($0.0)", (int) (short) 0, "Paid $ 0.0 with Mobile Pay", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        boolean boolean62 = parkingSpaceProxy41.confirmBooking("jane", "Paid $ 0.0 with Mobile Pay", "Refunded without deposit ($0.0)", "", 32, "empty", (int) (short) 0, "Paid $ 0.0 with Mobile Pay", "Card number should be 16 digits");
        parkingSpaceProxy41.displayPendingValidations();
        user0.assignProxy(parkingSpaceProxy41);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(client27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "empty" + "'", str28, "empty");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str29, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "empty" + "'", str32, "empty");
        org.junit.Assert.assertNotNull(accountRegistry36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj9 = parkingSpaceProxy6.login("empty", "Jane");
        parkingSpaceProxy6.validateClient("Jane");
        parkingSpaceProxy6.toggleSpace("", "staff", false);
        accountRegistry4.assignProxyToManager("pass", parkingSpaceProxy6);
        ParkingSystem.Client client18 = accountRegistry4.getClient("");
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry4);
        boolean boolean25 = accountRegistry4.registerClient("hi!", "Refunded total cost of $1.0", "2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry28 = parkingSpaceProxy27.getRegistry();
        boolean boolean30 = parkingSpaceProxy27.checkIn("");
        parkingSpaceProxy27.toggleLot("", true);
        accountRegistry4.assignProxyToManager("", parkingSpaceProxy27);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade35 = parkingSpaceProxy27.getFacade();
        parkingSpaceFacade35.toggleSpace("qPYDfDnbtD", "Refunded without deposit ($-42.0)", true);
        boolean boolean49 = parkingSpaceFacade35.confirmBooking("staff", "02659ad3-0b5c-4c48-a915-a466f2b50775", "13b04414-31a5-407f-8ea3-fba4613c73d1", "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", (int) '#', "Paid $ 15.0 with Mobile Pay", (int) (short) 10, "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        boolean boolean51 = parkingSpaceFacade35.checkOut("iHAHREGIAH");
        boolean boolean55 = parkingSpaceFacade35.editBooking("Paid $ 100.0 with Mobile Pay", "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", (int) (byte) -1);
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(client18);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(accountRegistry28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade35);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        ParkingSystem.BookingManager bookingManager3 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager4 = new ParkingSystem.CheckInManager(bookingManager3);
        ParkingSystem.Booking booking6 = bookingManager3.getBooking("");
        ParkingSystem.Booking booking8 = bookingManager3.getBooking("Refunded without deposit ($0.0)");
        boolean boolean18 = bookingManager3.confirmBooking("CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", "CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc", (int) (short) 0, "25527a32-01ef-45ba-816a-1d0a2fc2a52d", (int) (short) 1, "", "Paid $ 100.0 with Mobile Pay");
        ParkingSystem.Booking booking20 = bookingManager3.getBooking("3b453211-7dd1-4452-8741-a206711c1217");
        ParkingSystem.AccountRegistry accountRegistry21 = bookingManager3.getAccountRegistry();
        ParkingSystem.SuperManager superManager22 = ParkingSystem.SuperManager.createFromCSV("4c45f11e-b09a-4d81-adf1-86cfd519dc3c", "Paid $ 0.0 with Mobile Pay", "CLT-5e15ad0b-2221-4ef9-a477-c00f6c4e54d8", accountRegistry21);
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(booking20);
        org.junit.Assert.assertNotNull(accountRegistry21);
        org.junit.Assert.assertNotNull(superManager22);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.validateClient("Jane");
        parkingSpaceProxy3.toggleSpace("", "staff", false);
        boolean boolean14 = parkingSpaceProxy3.cancelBooking("");
        boolean boolean20 = parkingSpaceProxy3.register("jane", "jane", "Jane", "hi!", "disabled");
        accountRegistry1.assignProxyToManager("empty", parkingSpaceProxy3);
        parkingSpaceProxy3.toggleSpace("89de8237-29df-4908-9de4-6dc1ce90de94", "CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c", true);
        boolean boolean35 = parkingSpaceProxy3.confirmBooking("2195f5f7-08e1-4b73-b5b8-a479a5b3e3c8", "Refunded without deposit ($1.0)", "Refunded total cost of $10.0", "CLT-d7ac7477-2083-415e-84c8-8e0763f03efc", 0, "CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d", (int) (byte) 1, "CLT-d7ac7477-2083-415e-84c8-8e0763f03efc", "Refunded total cost of $1.0");
        parkingSpaceProxy3.validateClient("9fJ5pCUl");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        ParkingSystem.Booking booking12 = parkingSpace10.getCurrentBooking();
        java.lang.String str13 = parkingSpace10.scanSpace();
        ParkingSystem.Enabled enabled14 = new ParkingSystem.Enabled();
        parkingSpace10.setState((ParkingSystem.SpaceState) enabled14);
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking19 = null;
        boolean boolean20 = parkingLot17.assignBooking(0, booking19);
        boolean boolean22 = parkingLot17.isSpaceAvailable((int) '#');
        boolean boolean24 = parkingLot17.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace26 = parkingLot17.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking27 = parkingSpace26.getCurrentBooking();
        parkingSpace26.removeBooking();
        ParkingSystem.Booking booking29 = parkingSpace26.getCurrentBooking();
        java.lang.String str30 = enabled14.scanSpace(parkingSpace26);
        ParkingSystem.Disabled disabled31 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace32 = null;
        java.lang.String str33 = disabled31.scanSpace(parkingSpace32);
        ParkingSystem.Enabled enabled34 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot36 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking38 = null;
        boolean boolean39 = parkingLot36.assignBooking(0, booking38);
        boolean boolean41 = parkingLot36.isSpaceAvailable((int) '#');
        boolean boolean43 = parkingLot36.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace45 = parkingLot36.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking46 = parkingSpace45.getCurrentBooking();
        parkingSpace45.removeBooking();
        java.lang.String str48 = enabled34.scanSpace(parkingSpace45);
        ParkingSystem.ParkingLot parkingLot50 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking52 = null;
        boolean boolean53 = parkingLot50.assignBooking(0, booking52);
        boolean boolean55 = parkingLot50.isSpaceAvailable((int) '#');
        boolean boolean57 = parkingLot50.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace59 = parkingLot50.getParkingSpace((int) (byte) 10);
        int int60 = parkingSpace59.getSpaceId();
        ParkingSystem.Booking booking61 = parkingSpace59.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager62 = new ParkingSystem.SpaceManager();
        boolean boolean65 = spaceManager62.isSpaceAvailable("hi!", (int) '#');
        spaceManager62.toggleLot("disabled", false);
        ParkingSystem.Booking booking78 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean79 = spaceManager62.assignBooking("empty", (int) (short) 0, booking78);
        boolean boolean80 = parkingSpace59.assignBooking(booking78);
        java.lang.String str81 = enabled34.scanSpace(parkingSpace59);
        java.lang.String str82 = disabled31.scanSpace(parkingSpace59);
        java.lang.String str83 = enabled14.scanSpace(parkingSpace59);
        int int84 = parkingSpace59.getSpaceId();
        boolean boolean85 = parkingSpace59.isAvailable();
        java.lang.String str86 = parkingSpace59.scanSpace();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "empty" + "'", str13, "empty");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertNull(booking27);
        org.junit.Assert.assertNull(booking29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "empty" + "'", str30, "empty");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "disabled" + "'", str33, "disabled");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(parkingSpace45);
        org.junit.Assert.assertNull(booking46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "empty" + "'", str48, "empty");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(parkingSpace59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNull(booking61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "disabled" + "'", str81, "disabled");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "disabled" + "'", str82, "disabled");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "disabled" + "'", str83, "disabled");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "disabled" + "'", str86, "disabled");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager2 = parkingSpaceFacade0.getSpaceManager();
        boolean boolean5 = spaceManager2.isSpaceAvailable("Paid $ 0.0 with Mobile Pay", (int) (short) 1);
        ParkingSystem.SpaceManager spaceManager8 = new ParkingSystem.SpaceManager();
        spaceManager8.toggleLot("Jane", false);
        spaceManager8.removeBooking("disabled", 10);
        ParkingSystem.SpaceManager spaceManager17 = new ParkingSystem.SpaceManager();
        boolean boolean20 = spaceManager17.isSpaceAvailable("hi!", (int) '#');
        spaceManager17.toggleLot("disabled", false);
        ParkingSystem.Booking booking33 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean34 = spaceManager17.assignBooking("empty", (int) (short) 0, booking33);
        boolean boolean35 = spaceManager8.assignBooking("hi!", 0, booking33);
        double double36 = booking33.getTotalCost();
        booking33.setDuration((-1));
        boolean boolean39 = booking33.isCheckedIn();
        int int40 = booking33.getDuration();
        boolean boolean41 = spaceManager2.assignBooking("89de8237-29df-4908-9de4-6dc1ce90de94", 32, booking33);
        boolean boolean42 = booking33.isCheckedIn();
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking11 = parkingSpace10.getCurrentBooking();
        java.lang.String str12 = parkingSpace10.scanSpace();
        int int13 = parkingSpace10.getSpaceId();
        boolean boolean14 = parkingSpace10.isAvailable();
        ParkingSystem.SpaceState spaceState15 = parkingSpace10.getState();
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking19 = null;
        boolean boolean20 = parkingLot17.assignBooking(0, booking19);
        boolean boolean22 = parkingLot17.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator23 = parkingLot17.getIterator();
        boolean boolean24 = parkingLotIterator23.hasNext();
        ParkingSystem.ParkingSpace parkingSpace25 = parkingLotIterator23.next();
        ParkingSystem.SpaceManager spaceManager26 = new ParkingSystem.SpaceManager();
        boolean boolean29 = spaceManager26.isSpaceAvailable("hi!", (int) '#');
        spaceManager26.toggleLot("disabled", false);
        ParkingSystem.Booking booking42 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean43 = spaceManager26.assignBooking("empty", (int) (short) 0, booking42);
        ParkingSystem.SpaceManager spaceManager46 = new ParkingSystem.SpaceManager();
        boolean boolean49 = spaceManager46.isSpaceAvailable("hi!", (int) '#');
        spaceManager46.toggleLot("disabled", false);
        ParkingSystem.Booking booking62 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean63 = spaceManager46.assignBooking("empty", (int) (short) 0, booking62);
        boolean boolean64 = spaceManager26.assignBooking("disabled", (int) (byte) 0, booking62);
        boolean boolean65 = parkingSpace25.assignBooking(booking62);
        boolean boolean66 = parkingSpace10.assignBooking(booking62);
        parkingSpace10.removeBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "empty" + "'", str12, "empty");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(spaceState15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap3 = bookingManager0.getActiveBookings();
        double double6 = bookingManager0.calculateCost("CLT-035180a0-4707-410d-a011-2a4f0f46838b", (int) (short) 0);
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap7 = bookingManager0.getActiveBookings();
        boolean boolean12 = bookingManager0.extendBooking("CLT-f02c481e-1504-4abf-b598-76152da8586a", (int) 'a', "Refunded total cost of $1.0", "CLT-5be1cd5a-d829-4101-9cd3-6006338eb786");
        ParkingSystem.CheckInManager checkInManager13 = new ParkingSystem.CheckInManager(bookingManager0);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

//    @Test
//    public void test3307() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest6.test3307");
//        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
//        double double3 = bookingManager0.calculateCost("", 0);
//        boolean boolean13 = bookingManager0.confirmBooking("empty", "Jane", "disabled", "pass", (int) (byte) 0, "hi!", (int) 'a', "hi!", "");
//        double double15 = bookingManager0.getHourlyRate("Jane");
//        double double17 = bookingManager0.getHourlyRate("Paid $ 0.0 with Mobile Pay");
//        ParkingSystem.PaymentManager paymentManager18 = new ParkingSystem.PaymentManager();
//        paymentManager18.paymentMessage = "staff";
//        boolean boolean22 = paymentManager18.refundTotalCost((double) (short) 0);
//        boolean boolean25 = paymentManager18.refundWithoutDeposit((double) (-1.0f), (double) (short) -1);
//        java.lang.String str26 = paymentManager18.refundMessage;
//        paymentManager18.paymentMessage = "CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841";
//        boolean boolean33 = paymentManager18.processPayment("89de8237-29df-4908-9de4-6dc1ce90de94", (double) 2, "Paid $ 100.0 with Mobile Pay", "Paid $ 1470.0 with Mobile Pay");
//        ParkingSystem.MobilePay mobilePay34 = new ParkingSystem.MobilePay();
//        boolean boolean39 = mobilePay34.processPayment("disabled", 10.0d, "disabled", "disabled");
//        java.lang.String str40 = mobilePay34.getPaymentMessage();
//        boolean boolean45 = mobilePay34.processPayment("Jane", (double) 10L, "jane", "Paid $ 10.0 with Mobile Pay");
//        boolean boolean50 = mobilePay34.processPayment("Jane", (double) (byte) 0, "hi!", "Jane");
//        paymentManager18.setStrategy((ParkingSystem.Strategy) mobilePay34);
//        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) mobilePay34);
//        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
//        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
//        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
//        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
//        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
//        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
//        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Refunded without deposit ($0.0)" + "'", str26, "Refunded without deposit ($0.0)");
//        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
//        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
//        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str40, "Paid $ 10.0 with Mobile Pay");
//        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
//        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
//    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager2 = parkingSpaceFacade0.getSpaceManager();
        ParkingSystem.CheckInManager checkInManager3 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean5 = parkingSpaceFacade0.checkIn("CLT-93b11069-2e34-4ef4-bf17-b3bb8758882b");
        boolean boolean8 = parkingSpaceFacade0.extendBooking("Paid $ 15.0 with Mobile Pay", 10);
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertNotNull(checkInManager3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.toggleLot("Jane", false);
        spaceManager0.removeBooking("disabled", 10);
        spaceManager0.toggleLot("CLT-30fd593b-dedd-41b3-a919-c48700301f41", false);
        spaceManager0.addParkingLot("0b35479f-5869-423e-9abc-e4ab9cef903d");
        java.lang.String str14 = spaceManager0.scanSpace("CLT-23b57c8a-84c7-41fe-9781-bfe8a8f3fc04", "4a1f2343-8b2e-4dea-ba69-efd105414390");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap15 = spaceManager0.getParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap16 = spaceManager0.getParkingLots();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disabled" + "'", str14, "disabled");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator18 = parkingLot17.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator19 = parkingLot17.getIterator();
        user0.user = parkingLot17;
        ParkingSystem.Disabled disabled21 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace22 = null;
        java.lang.String str23 = disabled21.scanSpace(parkingSpace22);
        ParkingSystem.Enabled enabled24 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot26 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking28 = null;
        boolean boolean29 = parkingLot26.assignBooking(0, booking28);
        boolean boolean31 = parkingLot26.isSpaceAvailable((int) '#');
        boolean boolean33 = parkingLot26.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace35 = parkingLot26.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking36 = parkingSpace35.getCurrentBooking();
        parkingSpace35.removeBooking();
        java.lang.String str38 = enabled24.scanSpace(parkingSpace35);
        ParkingSystem.ParkingLot parkingLot40 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking42 = null;
        boolean boolean43 = parkingLot40.assignBooking(0, booking42);
        boolean boolean45 = parkingLot40.isSpaceAvailable((int) '#');
        boolean boolean47 = parkingLot40.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace49 = parkingLot40.getParkingSpace((int) (byte) 10);
        int int50 = parkingSpace49.getSpaceId();
        ParkingSystem.Booking booking51 = parkingSpace49.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager52 = new ParkingSystem.SpaceManager();
        boolean boolean55 = spaceManager52.isSpaceAvailable("hi!", (int) '#');
        spaceManager52.toggleLot("disabled", false);
        ParkingSystem.Booking booking68 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean69 = spaceManager52.assignBooking("empty", (int) (short) 0, booking68);
        boolean boolean70 = parkingSpace49.assignBooking(booking68);
        java.lang.String str71 = enabled24.scanSpace(parkingSpace49);
        java.lang.String str72 = disabled21.scanSpace(parkingSpace49);
        user0.user = str72;
        user0.register("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Paid $ 100.0 with Mobile Pay", "Jane", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.Client client80 = ParkingSystem.Client.getInstance();
        java.lang.String str81 = client80.getName();
        java.lang.String str82 = client80.getClientId();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy83 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj86 = parkingSpaceProxy83.login("empty", "Jane");
        parkingSpaceProxy83.toggleSpace("jane", "Paid $ 10.0 with Mobile Pay", true);
        client80.assignProxy(parkingSpaceProxy83);
        user0.user = parkingSpaceProxy83;
        user0.register("CLT-631eb509-a6c4-407c-b16d-582a6faabddb", "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753", "Refunded total cost of $1.0", "ST001", "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753");
        java.lang.Object obj99 = user0.user;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "disabled" + "'", str23, "disabled");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertNull(booking36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "empty" + "'", str38, "empty");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(parkingSpace49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNull(booking51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "disabled" + "'", str71, "disabled");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "disabled" + "'", str72, "disabled");
        org.junit.Assert.assertNotNull(client80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "CLT-30fd593b-dedd-41b3-a919-c48700301f41" + "'", str81, "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
// flaky "34) test3310(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "CLT-b617f4e8-13b0-4862-9aea-73970e2b5471" + "'", str82, "CLT-b617f4e8-13b0-4862-9aea-73970e2b5471");
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(obj99);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        boolean boolean13 = client0.getIsValidated();
        boolean boolean21 = client0.confirmBooking("hi!", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "Paid $ 100.0 with Mobile Pay", (-1), "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "empty");
        java.lang.String str22 = client0.getName();
        boolean boolean24 = client0.extendBooking((int) ' ');
        boolean boolean25 = client0.checkIn();
        java.lang.String str26 = client0.getClientType();
        boolean boolean27 = client0.getIsValidated();
        java.lang.String str28 = client0.getExtraId();
        java.lang.String str29 = client0.getUsername();
        java.lang.String str30 = client0.getClientId();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLT-631eb509-a6c4-407c-b16d-582a6faabddb" + "'", str1, "CLT-631eb509-a6c4-407c-b16d-582a6faabddb");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "disabled" + "'", str26, "disabled");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator18 = parkingLot17.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator19 = parkingLot17.getIterator();
        user0.user = parkingLot17;
        ParkingSystem.User user21 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj25 = parkingSpaceProxy22.login("empty", "Jane");
        parkingSpaceProxy22.validateClient("Jane");
        parkingSpaceProxy22.toggleSpace("", "staff", false);
        boolean boolean33 = parkingSpaceProxy22.cancelBooking("");
        user21.assignProxy(parkingSpaceProxy22);
        user0.user = parkingSpaceProxy22;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy36 = null;
        user0.assignProxy(parkingSpaceProxy36);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy38 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking40 = parkingSpaceProxy38.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry41 = parkingSpaceProxy38.getRegistry();
        parkingSpaceProxy38.autoGenerateManager();
        parkingSpaceProxy38.toggleLot("qMzKSKOI", false);
        user0.assignProxy(parkingSpaceProxy38);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(booking40);
        org.junit.Assert.assertNotNull(accountRegistry41);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        boolean boolean7 = parkingSpaceProxy0.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean11 = parkingSpaceProxy0.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean21 = parkingSpaceProxy0.confirmBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff", "disabled", (int) (short) 0, "Paid $ 100.0 with Mobile Pay", (int) (short) 10, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        boolean boolean23 = parkingSpaceProxy0.cancelBooking("fhd49ADb");
        java.lang.String str26 = parkingSpaceProxy0.scanSpace("Refunded without deposit ($1.0)", "13b04414-31a5-407f-8ea3-fba4613c73d1");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "disabled" + "'", str26, "disabled");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        ParkingSystem.AccountRegistry accountRegistry12 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager13 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry12);
        boolean boolean15 = accountRegistry12.requiresValidation("disabled");
        int int16 = accountRegistry12.getManagersSize();
        ParkingSystem.SuperManager superManager17 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry12);
        ParkingSystem.AccountRegistry accountRegistry18 = superManager17.getRegistry();
        accountRegistry18.validateClient("pass");
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("Refunded total cost of $1.0", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", accountRegistry18);
        ParkingSystem.SuperManager superManager22 = ParkingSystem.SuperManager.createFromCSV("Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($-42.0)", "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", accountRegistry18);
        ParkingSystem.AccountRegistry accountRegistry23 = superManager22.getRegistry();
        org.junit.Assert.assertNotNull(superManager13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(superManager17);
        org.junit.Assert.assertNotNull(accountRegistry18);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertNotNull(superManager22);
        org.junit.Assert.assertNotNull(accountRegistry23);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry15 = superManager4.getRegistry();
        ParkingSystem.Manager manager16 = accountRegistry15.autoGenerateManager();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy18 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry19 = parkingSpaceProxy18.getRegistry();
        boolean boolean25 = parkingSpaceProxy18.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        parkingSpaceProxy18.toggleLot("hi!", false);
        accountRegistry15.assignProxyToClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41", parkingSpaceProxy18);
        ParkingSystem.User user31 = new ParkingSystem.User();
        java.lang.Object obj32 = user31.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy33 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj36 = parkingSpaceProxy33.login("empty", "Jane");
        parkingSpaceProxy33.validateClient("Jane");
        java.lang.String str41 = parkingSpaceProxy33.scanSpace("", "");
        parkingSpaceProxy33.toggleSpace("", "disabled", true);
        user31.parkingProxy = parkingSpaceProxy33;
        ParkingSystem.ParkingLot parkingLot48 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator49 = parkingLot48.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator50 = parkingLot48.getIterator();
        user31.user = parkingLot48;
        ParkingSystem.User user52 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy53 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj56 = parkingSpaceProxy53.login("empty", "Jane");
        parkingSpaceProxy53.validateClient("Jane");
        parkingSpaceProxy53.toggleSpace("", "staff", false);
        boolean boolean64 = parkingSpaceProxy53.cancelBooking("");
        user52.assignProxy(parkingSpaceProxy53);
        user31.user = parkingSpaceProxy53;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy67 = user31.parkingProxy;
        parkingSpaceProxy67.addParkingLot("pass");
        accountRegistry15.assignProxyToManager("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", parkingSpaceProxy67);
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap71 = accountRegistry15.getManagers();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry15.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(manager16);
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "disabled" + "'", str41, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator49);
        org.junit.Assert.assertNotNull(parkingLotIterator50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(parkingSpaceProxy67);
        org.junit.Assert.assertNotNull(strMap71);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap8 = accountRegistry6.getManagers();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("Paid $ 10.0 with Mobile Pay", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "disabled", accountRegistry6);
        java.util.List<ParkingSystem.Client> clientList10 = accountRegistry6.displayPendingValidations();
        ParkingSystem.Client client12 = ParkingSystem.Client.getInstance();
        java.lang.String str13 = client12.getClientType();
        java.lang.String str14 = client12.getPassword();
        ParkingSystem.Client client15 = ParkingSystem.Client.getInstance();
        java.lang.String str16 = client15.getName();
        client15.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str25 = client15.getUsername();
        java.lang.String str26 = client15.getPassword();
        java.lang.String str27 = client15.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy28 = null;
        client15.assignProxy(parkingSpaceProxy28);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy30 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj33 = parkingSpaceProxy30.login("empty", "Jane");
        client15.assignProxy(parkingSpaceProxy30);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy35 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj38 = parkingSpaceProxy35.login("empty", "Jane");
        parkingSpaceProxy35.toggleSpace("jane", "Paid $ 10.0 with Mobile Pay", true);
        parkingSpaceProxy35.displayPendingValidations();
        client15.assignProxy(parkingSpaceProxy35);
        client12.assignProxy(parkingSpaceProxy35);
        boolean boolean55 = parkingSpaceProxy35.confirmBooking("Refunded without deposit ($-42.0)", "4a1f2343-8b2e-4dea-ba69-efd105414390", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5", (int) (short) 100, "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", (int) (byte) 100, "4a1f2343-8b2e-4dea-ba69-efd105414390", "Refunded total cost of $1.0");
        accountRegistry6.assignProxyToManager("ST001", parkingSpaceProxy35);
        java.lang.Object obj59 = accountRegistry6.login("4c45f11e-b09a-4d81-adf1-86cfd519dc3c", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap60 = accountRegistry6.getManagers();
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNotNull(clientList10);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "empty" + "'", str13, "empty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str14, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "empty" + "'", str16, "empty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "disabled" + "'", str26, "disabled");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(strMap60);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        int int7 = accountRegistry3.getManagersSize();
        boolean boolean13 = accountRegistry3.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj18 = parkingSpaceProxy15.login("empty", "Jane");
        parkingSpaceProxy15.validateClient("Jane");
        parkingSpaceProxy15.toggleSpace("", "staff", false);
        boolean boolean26 = parkingSpaceProxy15.cancelBooking("Jane");
        accountRegistry3.assignProxyToClient("pass", parkingSpaceProxy15);
        parkingSpaceProxy15.autoGenerateManager();
        parkingSpaceProxy15.toggleSpace("Paid $ 100.0 with Mobile Pay", "Jane", true);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade33 = parkingSpaceProxy15.getFacade();
        boolean boolean35 = parkingSpaceFacade33.checkOut("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        boolean boolean37 = parkingSpaceFacade33.cancelBooking("Jane");
        boolean boolean40 = parkingSpaceFacade33.extendBooking("jane", (int) ' ');
        ParkingSystem.SpaceManager spaceManager41 = parkingSpaceFacade33.getSpaceManager();
        boolean boolean51 = parkingSpaceFacade33.confirmBooking("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "CLT-035180a0-4707-410d-a011-2a4f0f46838b", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", (int) '#', "Paid $ -1.0 with Mobile Pay", (int) (short) -1, "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        boolean boolean53 = parkingSpaceFacade33.checkOut("Paid $ 10.0 with Mobile Pay");
        boolean boolean63 = parkingSpaceFacade33.confirmBooking("K6PkM9rcCx", "", "K6PkM9rcCx", "staff", (int) (short) 10, "", (int) '#', "Refunded without deposit ($-96.0)", "CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d");
        ParkingSystem.SpaceManager spaceManager64 = parkingSpaceFacade33.getSpaceManager();
        spaceManager64.addParkingLot("Refunded without deposit ($-42.0)");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parkingSpaceFacade33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(spaceManager41);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(spaceManager64);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        ParkingSystem.AccountRegistry accountRegistry3 = null;
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("pass", "empty", "Jane", accountRegistry3);
        java.lang.String str5 = superManager4.getName();
        ParkingSystem.Manager manager6 = superManager4.autoGenerateManager();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.getRegistry();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager6);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", (int) '#', "CLT-035180a0-4707-410d-a011-2a4f0f46838b", 52, "ST001", (-1.0d));
        int int8 = booking7.getSpaceId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        boolean boolean2 = parkingSpaceProxy0.cancelBooking("pass");
        parkingSpaceProxy0.addParkingLot("pass");
        boolean boolean6 = parkingSpaceProxy0.checkIn("Paid $ 100.0 with Mobile Pay");
        boolean boolean12 = parkingSpaceProxy0.register("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Refunded without deposit ($-42.0)", "Paid $ 0.0 with Mobile Pay", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "disabled");
        ParkingSystem.AccountRegistry accountRegistry13 = parkingSpaceProxy0.getRegistry();
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap14 = accountRegistry13.getManagers();
        java.util.List<ParkingSystem.Client> clientList15 = accountRegistry13.displayPendingValidations();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy17 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj20 = parkingSpaceProxy17.login("empty", "Jane");
        parkingSpaceProxy17.validateClient("Jane");
        parkingSpaceProxy17.toggleSpace("", "staff", false);
        boolean boolean28 = parkingSpaceProxy17.cancelBooking("");
        java.lang.String str31 = parkingSpaceProxy17.scanSpace("staff", "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        boolean boolean34 = parkingSpaceProxy17.extendBooking("jane", (int) ' ');
        boolean boolean36 = parkingSpaceProxy17.checkIn("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        boolean boolean38 = parkingSpaceProxy17.checkOut("Refunded without deposit ($-42.0)");
        accountRegistry13.assignProxyToClient("Refunded total cost of $1.0", parkingSpaceProxy17);
        boolean boolean49 = parkingSpaceProxy17.confirmBooking("Refunded without deposit ($0.0)", "0b35479f-5869-423e-9abc-e4ab9cef903d", "CLT-93b11069-2e34-4ef4-bf17-b3bb8758882b", "hi!", 52, "CLT-92729d37-9255-42b4-9361-c1978aadacb0", (int) (byte) 10, "cf448544-0e6d-4a41-94c2-e67f848ae8df", "Refunded without deposit ($-68.0)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(accountRegistry13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(clientList15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "disabled" + "'", str31, "disabled");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        ParkingSystem.Booking booking12 = parkingSpace10.getCurrentBooking();
        java.lang.String str13 = parkingSpace10.scanSpace();
        parkingSpace10.removeBooking();
        boolean boolean15 = parkingSpace10.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "empty" + "'", str13, "empty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap5 = accountRegistry3.getManagers();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy7 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry8 = parkingSpaceProxy7.getRegistry();
        java.lang.String str11 = parkingSpaceProxy7.scanSpace("empty", "hi!");
        boolean boolean21 = parkingSpaceProxy7.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy7.toggleSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "", true);
        boolean boolean31 = parkingSpaceProxy7.register("jane", "Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($0.0)", "disabled", "Refunded total cost of $1.0");
        accountRegistry3.assignProxyToManager("7aecb00c-028c-4dcf-96cc-14d25bd709ab", parkingSpaceProxy7);
        ParkingSystem.User user34 = new ParkingSystem.User();
        java.lang.Object obj35 = user34.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy36 = user34.parkingProxy;
        ParkingSystem.User user37 = new ParkingSystem.User();
        java.lang.Object obj38 = user37.user;
        ParkingSystem.Client client39 = ParkingSystem.Client.getInstance();
        java.lang.String str40 = client39.getName();
        client39.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy43 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry44 = parkingSpaceProxy43.getRegistry();
        boolean boolean46 = parkingSpaceProxy43.checkIn("");
        client39.assignProxy(parkingSpaceProxy43);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade48 = parkingSpaceProxy43.getFacade();
        user37.assignProxy(parkingSpaceProxy43);
        user34.parkingProxy = parkingSpaceProxy43;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade51 = parkingSpaceProxy43.getFacade();
        boolean boolean55 = parkingSpaceProxy43.editBooking("empty", "Refunded without deposit ($0.0)", 100);
        parkingSpaceProxy43.autoGenerateManager();
        accountRegistry3.assignProxyToClient("qPYDfDnbtD", parkingSpaceProxy43);
        ParkingSystem.Client client59 = accountRegistry3.getClient("CLT-08489cd1-5899-4594-ad65-2f6dcf0a9e5d");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(parkingSpaceProxy36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(client39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "jane" + "'", str40, "jane");
        org.junit.Assert.assertNotNull(accountRegistry44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade48);
        org.junit.Assert.assertNotNull(parkingSpaceFacade51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(client59);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.Booking booking4 = client0.getBookingDetails();
        java.lang.String str5 = client0.getUsername();
        client0.setValidated(false);
        java.lang.String str8 = client0.getClientId();
        boolean boolean9 = client0.checkIn();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertNull(booking4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str5, "Paid $ -1.0 with Mobile Pay");
// flaky "35) test3323(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLT-f29b50f4-73fb-4365-adeb-1cd99d161fd9" + "'", str8, "CLT-f29b50f4-73fb-4365-adeb-1cd99d161fd9");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = user0.parkingProxy;
        ParkingSystem.Client client2 = ParkingSystem.Client.getInstance();
        java.lang.String str3 = client2.getName();
        client2.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry7 = parkingSpaceProxy6.getRegistry();
        boolean boolean9 = parkingSpaceProxy6.checkIn("");
        client2.assignProxy(parkingSpaceProxy6);
        boolean boolean11 = client2.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = new ParkingSystem.ParkingSpaceProxy();
        client2.assignProxy(parkingSpaceProxy12);
        ParkingSystem.AccountRegistry accountRegistry14 = parkingSpaceProxy12.getRegistry();
        user0.parkingProxy = parkingSpaceProxy12;
        java.lang.Object obj18 = user0.login("hi!", "Card number should be 16 digits");
        org.junit.Assert.assertNull(parkingSpaceProxy1);
        org.junit.Assert.assertNotNull(client2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jane" + "'", str3, "jane");
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(accountRegistry14);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        java.util.List<java.lang.String[]> strArrayList8 = cSVManager0.readCSV("Paid $ -1.0 with Mobile Pay");
        java.lang.String[] strArray9 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray10 = cSVManager0.loadSuperManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap11 = null;
        cSVManager0.loadParkingLots(strMap11);
        ParkingSystem.CSVManager cSVManager13 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList15 = cSVManager13.readCSV("");
        java.util.List<java.lang.String[]> strArrayList17 = cSVManager13.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap18 = null;
        cSVManager13.loadParkingLots(strMap18);
        java.util.List<java.lang.String[]> strArrayList21 = cSVManager13.readCSV("Paid $ -1.0 with Mobile Pay");
        java.lang.String[] strArray22 = cSVManager13.loadSuperManager();
        ParkingSystem.CSVManager cSVManager23 = new ParkingSystem.CSVManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade24 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager25 = parkingSpaceFacade24.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager26 = parkingSpaceFacade24.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap27 = spaceManager26.getParkingLots();
        cSVManager23.loadParkingLots(strMap27);
        java.lang.String[] strArray29 = cSVManager23.loadSuperManager();
        ParkingSystem.CSVManager cSVManager30 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray31 = cSVManager30.loadSuperManager();
        java.lang.String[] strArray32 = cSVManager30.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade33 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager34 = parkingSpaceFacade33.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap35 = spaceManager34.getParkingLots();
        cSVManager30.saveParkingLots(strMap35);
        cSVManager23.saveParkingLots(strMap35);
        cSVManager13.loadParkingLots(strMap35);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade39 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager40 = parkingSpaceFacade39.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap41 = spaceManager40.getParkingLots();
        cSVManager13.loadParkingLots(strMap41);
        cSVManager0.saveParkingLots(strMap41);
        ParkingSystem.AccountRegistry accountRegistry47 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager48 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry47);
        boolean boolean50 = accountRegistry47.requiresValidation("disabled");
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap51 = accountRegistry47.getManagers();
        ParkingSystem.Manager manager52 = accountRegistry47.autoGenerateManager();
        java.lang.String str53 = manager52.getName();
        manager52.setManagerInfo("CLT-5e15ad0b-2221-4ef9-a477-c00f6c4e54d8", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        cSVManager0.saveManager(manager52);
        java.lang.String[] strArray59 = cSVManager0.loadSuperManager();
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(strArrayList8);
        org.junit.Assert.assertNotNull(strArray9);
// flaky "36) test3325(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray10);
// flaky "21) test3325(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArrayList15);
        org.junit.Assert.assertNotNull(strArrayList17);
        org.junit.Assert.assertNotNull(strArrayList21);
        org.junit.Assert.assertNotNull(strArray22);
// flaky "11) test3325(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(checkInManager25);
        org.junit.Assert.assertNotNull(spaceManager26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strArray29);
// flaky "5) test3325(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray31);
// flaky "3) test3325(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray32);
// flaky "1) test3325(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(spaceManager40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(superManager48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(manager52);
// flaky "1) test3325(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "15Kqw93z" + "'", str53, "15Kqw93z");
        org.junit.Assert.assertNotNull(strArray59);
// flaky "1) test3325(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        ParkingSystem.Booking booking12 = parkingSpace10.getCurrentBooking();
        java.lang.String str13 = parkingSpace10.scanSpace();
        int int14 = parkingSpace10.getSpaceId();
        ParkingSystem.SpaceManager spaceManager15 = new ParkingSystem.SpaceManager();
        boolean boolean18 = spaceManager15.isSpaceAvailable("hi!", (int) '#');
        spaceManager15.toggleLot("disabled", false);
        ParkingSystem.Booking booking31 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean32 = spaceManager15.assignBooking("empty", (int) (short) 0, booking31);
        java.lang.String str33 = booking31.getClientId();
        boolean boolean34 = parkingSpace10.assignBooking(booking31);
        java.lang.String str35 = booking31.getClientId();
        double double36 = booking31.getTotalCost();
        java.lang.String str37 = booking31.getClientId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "empty" + "'", str13, "empty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "staff" + "'", str33, "staff");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "staff" + "'", str35, "staff");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "staff" + "'", str37, "staff");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        java.lang.Object obj17 = user0.user;
        ParkingSystem.User user18 = new ParkingSystem.User();
        java.lang.Object obj19 = user18.user;
        ParkingSystem.Client client20 = ParkingSystem.Client.getInstance();
        java.lang.String str21 = client20.getName();
        client20.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy24 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry25 = parkingSpaceProxy24.getRegistry();
        boolean boolean27 = parkingSpaceProxy24.checkIn("");
        client20.assignProxy(parkingSpaceProxy24);
        boolean boolean29 = client20.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy30 = new ParkingSystem.ParkingSpaceProxy();
        client20.assignProxy(parkingSpaceProxy30);
        ParkingSystem.AccountRegistry accountRegistry32 = parkingSpaceProxy30.getRegistry();
        boolean boolean34 = parkingSpaceProxy30.checkIn("hi!");
        user18.parkingProxy = parkingSpaceProxy30;
        user18.register("Card number should be 16 digits", "Paid $ 100.0 with Mobile Pay", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", "Paid $ 0.0 with Mobile Pay");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy42 = user18.parkingProxy;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy43 = new ParkingSystem.ParkingSpaceProxy();
        user18.assignProxy(parkingSpaceProxy43);
        user0.user = user18;
        user0.register("ST001", "CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d", "CLT-b6a8264c-f386-4429-b59c-b7f465002e13", "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753", "qPYDfDnbtD");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy52 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry53 = parkingSpaceProxy52.getRegistry();
        java.lang.String str56 = parkingSpaceProxy52.scanSpace("empty", "hi!");
        boolean boolean66 = parkingSpaceProxy52.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy52.toggleSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "", true);
        boolean boolean76 = parkingSpaceProxy52.register("jane", "Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($0.0)", "disabled", "Refunded total cost of $1.0");
        boolean boolean80 = parkingSpaceProxy52.editBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", (int) (short) 10);
        java.lang.String str83 = parkingSpaceProxy52.scanSpace("qPYDfDnbtD", "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        user0.assignProxy(parkingSpaceProxy52);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jane" + "'", str6, "jane");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(client20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jane" + "'", str21, "jane");
        org.junit.Assert.assertNotNull(accountRegistry25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(accountRegistry32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parkingSpaceProxy42);
        org.junit.Assert.assertNotNull(accountRegistry53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "disabled" + "'", str56, "disabled");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "disabled" + "'", str83, "disabled");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        parkingLot1.removeBooking(0);
        ParkingSystem.ParkingLotIterator parkingLotIterator10 = parkingLot1.getIterator();
        boolean boolean11 = parkingLotIterator10.hasNext();
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLotIterator10.next();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertNotNull(parkingLotIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        boolean boolean4 = client0.editBooking("jane", (int) (short) 0);
        java.lang.String str5 = client0.getExtraId();
        java.lang.String str6 = client0.getClientId();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Refunded total cost of $1.0" + "'", str5, "Refunded total cost of $1.0");
// flaky "37) test3329(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-023ce7f8-da88-4705-8c79-ca74855310e0" + "'", str6, "CLT-023ce7f8-da88-4705-8c79-ca74855310e0");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry12 = superManager11.getRegistry();
        ParkingSystem.User user13 = new ParkingSystem.User();
        java.lang.Object obj14 = user13.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = user13.parkingProxy;
        ParkingSystem.User user16 = new ParkingSystem.User();
        java.lang.Object obj17 = user16.user;
        ParkingSystem.Client client18 = ParkingSystem.Client.getInstance();
        java.lang.String str19 = client18.getName();
        client18.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry23 = parkingSpaceProxy22.getRegistry();
        boolean boolean25 = parkingSpaceProxy22.checkIn("");
        client18.assignProxy(parkingSpaceProxy22);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade27 = parkingSpaceProxy22.getFacade();
        user16.assignProxy(parkingSpaceProxy22);
        user13.parkingProxy = parkingSpaceProxy22;
        ParkingSystem.AccountRegistry accountRegistry33 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager34 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry33);
        java.lang.String str35 = superManager34.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry36 = superManager34.registry;
        java.lang.String str37 = superManager34.getManagerId();
        ParkingSystem.Client client38 = ParkingSystem.Client.getInstance();
        java.lang.String str39 = client38.getName();
        client38.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy42 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry43 = parkingSpaceProxy42.getRegistry();
        boolean boolean45 = parkingSpaceProxy42.checkIn("");
        client38.assignProxy(parkingSpaceProxy42);
        boolean boolean47 = client38.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy48 = new ParkingSystem.ParkingSpaceProxy();
        client38.assignProxy(parkingSpaceProxy48);
        superManager34.assignProxy(parkingSpaceProxy48);
        user13.assignProxy(parkingSpaceProxy48);
        ParkingSystem.AccountRegistry accountRegistry52 = parkingSpaceProxy48.getRegistry();
        java.lang.String str55 = parkingSpaceProxy48.scanSpace("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "");
        boolean boolean58 = parkingSpaceProxy48.extendBooking("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", (int) (byte) 1);
        superManager11.assignProxy(parkingSpaceProxy48);
        parkingSpaceProxy48.addParkingLot("8bf217fa-1769-4d04-858b-ce78fe94bf0c");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(parkingSpaceProxy15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(client18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "jane" + "'", str19, "jane");
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade27);
        org.junit.Assert.assertNotNull(superManager34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str35, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str37, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "jane" + "'", str39, "jane");
        org.junit.Assert.assertNotNull(accountRegistry43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(accountRegistry52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "disabled" + "'", str55, "disabled");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isSpaceAvailable((int) (byte) 100);
        boolean boolean10 = parkingLot1.isEnabled();
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot1.getParkingSpace((int) (short) 10);
        ParkingSystem.ParkingLot parkingLot14 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking16 = null;
        boolean boolean17 = parkingLot14.assignBooking(0, booking16);
        boolean boolean19 = parkingLot14.isSpaceAvailable((int) '#');
        boolean boolean21 = parkingLot14.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace23 = parkingLot14.getParkingSpace((int) (byte) 10);
        int int24 = parkingSpace23.getSpaceId();
        ParkingSystem.Booking booking25 = parkingSpace23.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager26 = new ParkingSystem.SpaceManager();
        boolean boolean29 = spaceManager26.isSpaceAvailable("hi!", (int) '#');
        spaceManager26.toggleLot("disabled", false);
        ParkingSystem.Booking booking42 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean43 = spaceManager26.assignBooking("empty", (int) (short) 0, booking42);
        boolean boolean44 = parkingSpace23.assignBooking(booking42);
        ParkingSystem.SpaceManager spaceManager45 = new ParkingSystem.SpaceManager();
        boolean boolean48 = spaceManager45.isSpaceAvailable("hi!", (int) '#');
        spaceManager45.toggleLot("disabled", false);
        ParkingSystem.Booking booking61 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean62 = spaceManager45.assignBooking("empty", (int) (short) 0, booking61);
        boolean boolean63 = booking61.isCheckedIn();
        java.lang.String str64 = booking61.getClientId();
        boolean boolean65 = parkingSpace23.assignBooking(booking61);
        ParkingSystem.SpaceState spaceState66 = parkingSpace23.getState();
        parkingSpace12.setState(spaceState66);
        ParkingSystem.SpaceState spaceState68 = parkingSpace12.getState();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(booking25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "staff" + "'", str64, "staff");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(spaceState66);
        org.junit.Assert.assertNotNull(spaceState68);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6", "CLT-2d7011d7-cb71-4953-84cc-0d7adf2da0d4", (int) (byte) 10, "Paid $ 100.0 with Mobile Pay", (int) (byte) 1, "13b04414-31a5-407f-8ea3-fba4613c73d1", 60.0d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy13 = null;
        client0.assignProxy(parkingSpaceProxy13);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj18 = parkingSpaceProxy15.login("empty", "Jane");
        client0.assignProxy(parkingSpaceProxy15);
        java.lang.String str20 = client0.getName();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry14 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager15 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry14);
        boolean boolean17 = accountRegistry14.requiresValidation("disabled");
        int int18 = accountRegistry14.getManagersSize();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry14);
        ParkingSystem.AccountRegistry accountRegistry20 = superManager19.getRegistry();
        superManager4.registry = accountRegistry20;
        ParkingSystem.AccountRegistry accountRegistry25 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager26 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry25);
        boolean boolean28 = accountRegistry25.requiresValidation("disabled");
        int int29 = accountRegistry25.getManagersSize();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy31 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj34 = parkingSpaceProxy31.login("empty", "Jane");
        parkingSpaceProxy31.validateClient("Jane");
        parkingSpaceProxy31.toggleSpace("", "staff", false);
        boolean boolean42 = parkingSpaceProxy31.cancelBooking("Jane");
        accountRegistry25.assignProxyToClient("pass", parkingSpaceProxy31);
        boolean boolean49 = parkingSpaceProxy31.register("Jane", "Paid $ -1.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", "", "Refunded total cost of $1.0");
        boolean boolean55 = parkingSpaceProxy31.register("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "jane", "", "jane", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        java.lang.String str58 = parkingSpaceProxy31.scanSpace("13b04414-31a5-407f-8ea3-fba4613c73d1", "Jane");
        superManager4.assignProxy(parkingSpaceProxy31);
        superManager4.validateClient("Paid $ 100.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry62 = superManager4.registry;
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertNotNull(accountRegistry20);
        org.junit.Assert.assertNotNull(superManager26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "disabled" + "'", str58, "disabled");
        org.junit.Assert.assertNotNull(accountRegistry62);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry15 = superManager4.getRegistry();
        ParkingSystem.Manager manager16 = accountRegistry15.autoGenerateManager();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy18 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry19 = parkingSpaceProxy18.getRegistry();
        boolean boolean25 = parkingSpaceProxy18.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        parkingSpaceProxy18.toggleLot("hi!", false);
        accountRegistry15.assignProxyToClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41", parkingSpaceProxy18);
        ParkingSystem.Manager manager30 = accountRegistry15.autoGenerateManager();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(manager16);
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(manager30);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Card number should be 16 digits");
        java.lang.String[] strArray5 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray6 = cSVManager0.loadSuperManager();
        ParkingSystem.BookingManager bookingManager7 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager8 = new ParkingSystem.CheckInManager(bookingManager7);
        ParkingSystem.SpaceManager spaceManager9 = bookingManager7.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap10 = bookingManager7.getActiveBookings();
        ParkingSystem.SpaceManager spaceManager11 = bookingManager7.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap12 = spaceManager11.getParkingLots();
        cSVManager0.saveParkingLots(strMap12);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(strArray5);
// flaky "38) test3336(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray6);
// flaky "22) test3336(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(spaceManager11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.Manager manager8 = superManager4.autoGenerateManager();
        ParkingSystem.User user9 = new ParkingSystem.User();
        java.lang.Object obj10 = user9.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = user9.parkingProxy;
        ParkingSystem.User user12 = new ParkingSystem.User();
        java.lang.Object obj13 = user12.user;
        ParkingSystem.Client client14 = ParkingSystem.Client.getInstance();
        java.lang.String str15 = client14.getName();
        client14.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy18 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry19 = parkingSpaceProxy18.getRegistry();
        boolean boolean21 = parkingSpaceProxy18.checkIn("");
        client14.assignProxy(parkingSpaceProxy18);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade23 = parkingSpaceProxy18.getFacade();
        user12.assignProxy(parkingSpaceProxy18);
        user9.parkingProxy = parkingSpaceProxy18;
        ParkingSystem.AccountRegistry accountRegistry29 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager30 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry29);
        boolean boolean32 = accountRegistry29.requiresValidation("disabled");
        int int33 = accountRegistry29.getManagersSize();
        boolean boolean39 = accountRegistry29.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy41 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj44 = parkingSpaceProxy41.login("empty", "Jane");
        parkingSpaceProxy41.validateClient("Jane");
        parkingSpaceProxy41.toggleSpace("", "staff", false);
        boolean boolean52 = parkingSpaceProxy41.cancelBooking("Jane");
        accountRegistry29.assignProxyToClient("pass", parkingSpaceProxy41);
        parkingSpaceProxy41.autoGenerateManager();
        parkingSpaceProxy41.toggleSpace("Paid $ 100.0 with Mobile Pay", "Jane", true);
        user9.assignProxy(parkingSpaceProxy41);
        ParkingSystem.AccountRegistry accountRegistry60 = parkingSpaceProxy41.getRegistry();
        manager8.assignProxy(parkingSpaceProxy41);
        parkingSpaceProxy41.displayPendingValidations();
        parkingSpaceProxy41.displayPendingValidations();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(manager8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(parkingSpaceProxy11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(client14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "empty" + "'", str15, "empty");
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade23);
        org.junit.Assert.assertNotNull(superManager30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(accountRegistry60);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        ParkingSystem.AccountRegistry accountRegistry17 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager18 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry17);
        java.lang.String str19 = superManager18.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry20 = superManager18.registry;
        cSVManager0.saveManager((ParkingSystem.Manager) superManager18);
        java.lang.String str22 = superManager18.getPassword();
        ParkingSystem.AccountRegistry accountRegistry23 = superManager18.getRegistry();
        int int24 = accountRegistry23.getManagersSize();
        java.util.List<ParkingSystem.Client> clientList25 = accountRegistry23.displayPendingValidations();
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str19, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Refunded total cost of $1.0" + "'", str22, "Refunded total cost of $1.0");
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(clientList25);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        java.lang.String str11 = client0.getName();
        client0.setClientInfo("pass", "empty", "Jane", "pass", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", false);
        boolean boolean22 = client0.editBooking("jane", 0);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy23 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking25 = parkingSpaceProxy23.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        client0.assignProxy(parkingSpaceProxy23);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade27 = parkingSpaceProxy23.getFacade();
        boolean boolean29 = parkingSpaceProxy23.checkOut("89de8237-29df-4908-9de4-6dc1ce90de94");
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "jane" + "'", str11, "jane");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(booking25);
        org.junit.Assert.assertNotNull(parkingSpaceFacade27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        ParkingSystem.Enabled enabled0 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot2 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking4 = null;
        boolean boolean5 = parkingLot2.assignBooking(0, booking4);
        boolean boolean7 = parkingLot2.isSpaceAvailable((int) '#');
        boolean boolean9 = parkingLot2.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot2.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking12 = parkingSpace11.getCurrentBooking();
        parkingSpace11.removeBooking();
        java.lang.String str14 = enabled0.scanSpace(parkingSpace11);
        ParkingSystem.ParkingLot parkingLot16 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking18 = null;
        boolean boolean19 = parkingLot16.assignBooking(0, booking18);
        boolean boolean21 = parkingLot16.isSpaceAvailable((int) '#');
        boolean boolean23 = parkingLot16.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace25 = parkingLot16.getParkingSpace((int) (byte) 10);
        int int26 = parkingSpace25.getSpaceId();
        ParkingSystem.Booking booking27 = parkingSpace25.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager28 = new ParkingSystem.SpaceManager();
        boolean boolean31 = spaceManager28.isSpaceAvailable("hi!", (int) '#');
        spaceManager28.toggleLot("disabled", false);
        ParkingSystem.Booking booking44 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean45 = spaceManager28.assignBooking("empty", (int) (short) 0, booking44);
        boolean boolean46 = parkingSpace25.assignBooking(booking44);
        java.lang.String str47 = enabled0.scanSpace(parkingSpace25);
        ParkingSystem.ParkingLot parkingLot49 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking51 = null;
        boolean boolean52 = parkingLot49.assignBooking(0, booking51);
        boolean boolean54 = parkingLot49.isSpaceAvailable((int) '#');
        boolean boolean56 = parkingLot49.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace58 = parkingLot49.getParkingSpace((int) (byte) 10);
        ParkingSystem.Enabled enabled59 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot61 = new ParkingSystem.ParkingLot("");
        ParkingSystem.ParkingLotIterator parkingLotIterator62 = parkingLot61.getIterator();
        ParkingSystem.ParkingSpace parkingSpace64 = parkingLot61.getParkingSpace((int) (byte) -1);
        java.lang.String str65 = enabled59.scanSpace(parkingSpace64);
        parkingSpace58.setState((ParkingSystem.SpaceState) enabled59);
        ParkingSystem.ParkingLot parkingLot68 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking70 = null;
        boolean boolean71 = parkingLot68.assignBooking(0, booking70);
        boolean boolean73 = parkingLot68.isSpaceAvailable((int) '#');
        boolean boolean75 = parkingLot68.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace77 = parkingLot68.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking78 = parkingSpace77.getCurrentBooking();
        parkingSpace77.removeBooking();
        ParkingSystem.Booking booking80 = parkingSpace77.getCurrentBooking();
        parkingSpace77.removeBooking();
        java.lang.String str82 = enabled59.scanSpace(parkingSpace77);
        ParkingSystem.Booking booking83 = parkingSpace77.getCurrentBooking();
        java.lang.String str84 = enabled0.scanSpace(parkingSpace77);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "empty" + "'", str14, "empty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNull(booking27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "disabled" + "'", str47, "disabled");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(parkingSpace58);
        org.junit.Assert.assertNotNull(parkingLotIterator62);
        org.junit.Assert.assertNotNull(parkingSpace64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "empty" + "'", str65, "empty");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(parkingSpace77);
        org.junit.Assert.assertNull(booking78);
        org.junit.Assert.assertNull(booking80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "empty" + "'", str82, "empty");
        org.junit.Assert.assertNull(booking83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "empty" + "'", str84, "empty");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        int int7 = accountRegistry3.getManagersSize();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj12 = parkingSpaceProxy9.login("empty", "Jane");
        parkingSpaceProxy9.validateClient("Jane");
        parkingSpaceProxy9.toggleSpace("", "staff", false);
        boolean boolean20 = parkingSpaceProxy9.cancelBooking("Jane");
        accountRegistry3.assignProxyToClient("pass", parkingSpaceProxy9);
        parkingSpaceProxy9.toggleSpace("disabled", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", false);
        parkingSpaceProxy9.toggleSpace("Paid $ -1.0 with Mobile Pay", "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5", false);
        ParkingSystem.Booking booking31 = parkingSpaceProxy9.getBookingDetails("CLT-f29b50f4-73fb-4365-adeb-1cd99d161fd9");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(booking31);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        java.lang.String str11 = client0.getName();
        client0.setClientInfo("pass", "empty", "Jane", "pass", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", false);
        java.lang.String str20 = client0.getName();
        java.lang.String str21 = client0.getName();
        java.lang.String str22 = client0.getClientType();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Refunded total cost of $1.0" + "'", str10, "Refunded total cost of $1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "empty" + "'", str11, "empty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "empty" + "'", str20, "empty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "empty" + "'", str21, "empty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CLT-30fd593b-dedd-41b3-a919-c48700301f41" + "'", str22, "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        spaceManager0.removeBooking("jane", (int) (byte) 100);
        spaceManager0.loadParkingLots();
        ParkingSystem.ParkingLot parkingLot14 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking16 = null;
        boolean boolean17 = parkingLot14.assignBooking(0, booking16);
        boolean boolean19 = parkingLot14.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking28 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean29 = parkingLot14.assignBooking((int) (short) -1, booking28);
        booking28.setCheckedIn(false);
        double double32 = booking28.getTotalCost();
        java.lang.String str33 = booking28.getLicensePlate();
        double double34 = booking28.getTotalCost();
        java.lang.String str35 = booking28.getClientId();
        int int36 = booking28.getSpaceId();
        boolean boolean37 = spaceManager0.assignBooking("CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c", 5, booking28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "disabled" + "'", str33, "disabled");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "staff" + "'", str35, "staff");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.AccountRegistry accountRegistry20 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry20);
        java.lang.String str22 = superManager21.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry23 = superManager21.registry;
        java.lang.String str24 = superManager21.getManagerId();
        ParkingSystem.Client client25 = ParkingSystem.Client.getInstance();
        java.lang.String str26 = client25.getName();
        client25.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy29 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry30 = parkingSpaceProxy29.getRegistry();
        boolean boolean32 = parkingSpaceProxy29.checkIn("");
        client25.assignProxy(parkingSpaceProxy29);
        boolean boolean34 = client25.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy35 = new ParkingSystem.ParkingSpaceProxy();
        client25.assignProxy(parkingSpaceProxy35);
        superManager21.assignProxy(parkingSpaceProxy35);
        user0.assignProxy(parkingSpaceProxy35);
        ParkingSystem.AccountRegistry accountRegistry39 = parkingSpaceProxy35.getRegistry();
        boolean boolean41 = parkingSpaceProxy35.checkOut("Refunded total cost of $1.0");
        parkingSpaceProxy35.addParkingLot("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        boolean boolean46 = parkingSpaceProxy35.extendBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab", 0);
        ParkingSystem.Booking booking48 = parkingSpaceProxy35.getBookingDetails("Refunded without deposit ($-15.0)");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "empty" + "'", str6, "empty");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str22, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str24, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "empty" + "'", str26, "empty");
        org.junit.Assert.assertNotNull(accountRegistry30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(accountRegistry39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(booking48);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        double double5 = bookingManager0.getHourlyRate("disabled");
        ParkingSystem.BookingManager bookingManager6 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager7 = new ParkingSystem.CheckInManager(bookingManager6);
        ParkingSystem.SpaceManager spaceManager8 = bookingManager6.getSpaceManager();
        double double11 = bookingManager6.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit12 = new ParkingSystem.DebitOrCredit();
        bookingManager6.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit12);
        boolean boolean18 = debitOrCredit12.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit12);
        ParkingSystem.MobilePay mobilePay20 = new ParkingSystem.MobilePay();
        boolean boolean25 = mobilePay20.processPayment("hi!", (-1.0d), "", "");
        boolean boolean30 = mobilePay20.processPayment("hi!", (double) 100, "jane", "disabled");
        boolean boolean35 = mobilePay20.processPayment("2afd610d-a8cb-413a-bbee-7927f86b526c", (double) 10.0f, "staff", "empty");
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) mobilePay20);
        ParkingSystem.Booking booking38 = bookingManager0.getBooking("qPYDfDnbtD");
        boolean boolean42 = bookingManager0.editBooking("CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c", (int) (byte) -1);
        ParkingSystem.BookingManager bookingManager43 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager44 = new ParkingSystem.CheckInManager(bookingManager43);
        ParkingSystem.Booking booking46 = bookingManager43.getBooking("");
        ParkingSystem.SpaceManager spaceManager47 = bookingManager43.getSpaceManager();
        boolean boolean57 = bookingManager43.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double59 = bookingManager43.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit60 = new ParkingSystem.DebitOrCredit();
        bookingManager43.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit60);
        java.lang.String str62 = debitOrCredit60.getPaymentMessage();
        boolean boolean67 = debitOrCredit60.processPayment("Refunded without deposit ($0.0)", (double) (-1L), "Refunded without deposit ($0.0)", "jane");
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit60);
        java.lang.String str69 = debitOrCredit60.getPaymentMessage();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 165.0d + "'", double11 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(booking38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(booking46);
        org.junit.Assert.assertNotNull(spaceManager47);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 15.0d + "'", double59 == 15.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Card number should be 16 digits" + "'", str69, "Card number should be 16 digits");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean13 = bookingManager0.confirmBooking("empty", "Jane", "disabled", "pass", (int) (byte) 0, "hi!", (int) 'a', "hi!", "");
        double double15 = bookingManager0.getHourlyRate("Jane");
        boolean boolean20 = bookingManager0.extendBooking("CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5", (int) (byte) 10, "CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc", "CLT-f02c481e-1504-4abf-b598-76152da8586a");
        ParkingSystem.PaymentManager paymentManager21 = new ParkingSystem.PaymentManager();
        java.lang.String str22 = paymentManager21.refundMessage;
        boolean boolean24 = paymentManager21.refundTotalCost((-1.0d));
        java.lang.String str25 = paymentManager21.paymentMessage;
        ParkingSystem.BookingManager bookingManager26 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager27 = new ParkingSystem.CheckInManager(bookingManager26);
        ParkingSystem.Booking booking29 = bookingManager26.getBooking("");
        ParkingSystem.SpaceManager spaceManager30 = bookingManager26.getSpaceManager();
        boolean boolean40 = bookingManager26.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double42 = bookingManager26.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit43 = new ParkingSystem.DebitOrCredit();
        bookingManager26.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit43);
        paymentManager21.setStrategy((ParkingSystem.Strategy) debitOrCredit43);
        boolean boolean48 = debitOrCredit43.validateCard("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", (double) 10);
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit43);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(booking29);
        org.junit.Assert.assertNotNull(spaceManager30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 15.0d + "'", double42 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean10 = parkingSpaceFacade0.confirmBooking("staff", "", "disabled", "hi!", (int) 'a', "jane", (int) 'a', "hi!", "");
        ParkingSystem.CheckInManager checkInManager11 = parkingSpaceFacade0.getCheckInManager();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(checkInManager11);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.toggleSpace("jane", "Paid $ 10.0 with Mobile Pay", true);
        boolean boolean11 = parkingSpaceProxy0.editBooking("2afd610d-a8cb-413a-bbee-7927f86b526c", "", 10);
        java.lang.Object obj14 = parkingSpaceProxy0.login("8ca2ec61-774c-409d-89d5-5b9171b40497", "3b453211-7dd1-4452-8741-a206711c1217");
        boolean boolean16 = parkingSpaceProxy0.checkIn("09622cbf-e665-45db-b1ad-365065947a20");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        java.lang.Object obj19 = user0.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "staff");
        java.lang.Object obj22 = user0.login("CLT-93b11069-2e34-4ef4-bf17-b3bb8758882b", "Refunded without deposit ($-96.0)");
        ParkingSystem.CSVManager cSVManager23 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList25 = cSVManager23.readCSV("");
        java.util.List<java.lang.String[]> strArrayList27 = cSVManager23.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap28 = null;
        cSVManager23.loadParkingLots(strMap28);
        java.util.List<java.lang.String[]> strArrayList31 = cSVManager23.readCSV("Paid $ -1.0 with Mobile Pay");
        java.lang.String[] strArray32 = cSVManager23.loadSuperManager();
        user0.user = strArray32;
        java.lang.Object obj36 = user0.login("Paid $ 15.0 with Mobile Pay", "8de59b10-a65c-4d90-b56c-a637505ce1de");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "empty" + "'", str6, "empty");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strArrayList25);
        org.junit.Assert.assertNotNull(strArrayList27);
        org.junit.Assert.assertNotNull(strArrayList31);
        org.junit.Assert.assertNotNull(strArray32);
// flaky "39) test3349(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        boolean boolean5 = bookingManager0.extendBooking("jane", (int) (short) -1, "", "Paid $ 10.0 with Mobile Pay");
        double double7 = bookingManager0.getHourlyRate("disabled");
        ParkingSystem.SpaceManager spaceManager8 = bookingManager0.getSpaceManager();
        spaceManager8.removeBooking("CLT-2d7011d7-cb71-4953-84cc-0d7adf2da0d4", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertNotNull(spaceManager8);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator18 = parkingLot17.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator19 = parkingLot17.getIterator();
        user0.user = parkingLot17;
        ParkingSystem.User user21 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj25 = parkingSpaceProxy22.login("empty", "Jane");
        parkingSpaceProxy22.validateClient("Jane");
        parkingSpaceProxy22.toggleSpace("", "staff", false);
        boolean boolean33 = parkingSpaceProxy22.cancelBooking("");
        user21.assignProxy(parkingSpaceProxy22);
        user0.user = parkingSpaceProxy22;
        ParkingSystem.User user36 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy37 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj40 = parkingSpaceProxy37.login("empty", "Jane");
        parkingSpaceProxy37.validateClient("Jane");
        parkingSpaceProxy37.toggleSpace("", "staff", false);
        boolean boolean48 = parkingSpaceProxy37.cancelBooking("");
        user36.assignProxy(parkingSpaceProxy37);
        parkingSpaceProxy37.displayPendingValidations();
        user0.parkingProxy = parkingSpaceProxy37;
        ParkingSystem.Booking booking53 = parkingSpaceProxy37.getBookingDetails("CLT-23b57c8a-84c7-41fe-9781-bfe8a8f3fc04");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(booking53);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        boolean boolean24 = bookingManager0.confirmBooking("CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c", "Paid $ 1.0 with Mobile Pay", "2195f5f7-08e1-4b73-b5b8-a479a5b3e3c8", "XBERLIguFg", (int) (byte) 1, "8bf217fa-1769-4d04-858b-ce78fe94bf0c", 52, "aa9c00f6-ec11-46c5-a72b-a7f620703e51", "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator18 = parkingLot17.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator19 = parkingLot17.getIterator();
        user0.user = parkingLot17;
        ParkingSystem.User user21 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj25 = parkingSpaceProxy22.login("empty", "Jane");
        parkingSpaceProxy22.validateClient("Jane");
        parkingSpaceProxy22.toggleSpace("", "staff", false);
        boolean boolean33 = parkingSpaceProxy22.cancelBooking("");
        user21.assignProxy(parkingSpaceProxy22);
        user0.user = parkingSpaceProxy22;
        ParkingSystem.User user36 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy37 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj40 = parkingSpaceProxy37.login("empty", "Jane");
        parkingSpaceProxy37.validateClient("Jane");
        parkingSpaceProxy37.toggleSpace("", "staff", false);
        boolean boolean48 = parkingSpaceProxy37.cancelBooking("");
        user36.assignProxy(parkingSpaceProxy37);
        parkingSpaceProxy37.displayPendingValidations();
        user0.parkingProxy = parkingSpaceProxy37;
        java.lang.Object obj54 = parkingSpaceProxy37.login("CLT-2d7011d7-cb71-4953-84cc-0d7adf2da0d4", "25527a32-01ef-45ba-816a-1d0a2fc2a52d");
        boolean boolean56 = parkingSpaceProxy37.checkIn("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        parkingLot1.removeBooking(0);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot1.getParkingSpace(0);
        ParkingSystem.ParkingLotIterator parkingLotIterator12 = parkingLot1.getIterator();
        ParkingSystem.ParkingSpace parkingSpace14 = parkingLot1.getParkingSpace((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNotNull(parkingLotIterator12);
        org.junit.Assert.assertNotNull(parkingSpace14);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean4 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) 10);
        boolean boolean7 = parkingSpaceFacade0.extendBooking("Refunded without deposit ($-96.0)", 1);
        ParkingSystem.SpaceManager spaceManager8 = parkingSpaceFacade0.getSpaceManager();
        ParkingSystem.Booking booking18 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        java.lang.String str19 = booking18.getLotId();
        double double20 = booking18.getTotalCost();
        int int21 = booking18.getDuration();
        int int22 = booking18.getDuration();
        double double23 = booking18.getTotalCost();
        boolean boolean24 = spaceManager8.assignBooking("b34WTxj8", (int) (short) 1, booking18);
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "jane" + "'", str19, "jane");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.AccountRegistry accountRegistry20 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry20);
        boolean boolean23 = accountRegistry20.requiresValidation("disabled");
        int int24 = accountRegistry20.getManagersSize();
        boolean boolean30 = accountRegistry20.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy32 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj35 = parkingSpaceProxy32.login("empty", "Jane");
        parkingSpaceProxy32.validateClient("Jane");
        parkingSpaceProxy32.toggleSpace("", "staff", false);
        boolean boolean43 = parkingSpaceProxy32.cancelBooking("Jane");
        accountRegistry20.assignProxyToClient("pass", parkingSpaceProxy32);
        parkingSpaceProxy32.autoGenerateManager();
        parkingSpaceProxy32.toggleSpace("Paid $ 100.0 with Mobile Pay", "Jane", true);
        user0.assignProxy(parkingSpaceProxy32);
        java.lang.Object obj51 = user0.user;
        user0.register("13b04414-31a5-407f-8ea3-fba4613c73d1", "Refunded without deposit ($-42.0)", "Paid $ -1.0 with Mobile Pay", "25527a32-01ef-45ba-816a-1d0a2fc2a52d", "");
        java.lang.Object obj58 = user0.user;
        java.lang.Object obj59 = user0.user;
        ParkingSystem.User user60 = new ParkingSystem.User();
        java.lang.Object obj61 = user60.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy62 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj65 = parkingSpaceProxy62.login("empty", "Jane");
        parkingSpaceProxy62.validateClient("Jane");
        java.lang.String str70 = parkingSpaceProxy62.scanSpace("", "");
        parkingSpaceProxy62.toggleSpace("", "disabled", true);
        user60.parkingProxy = parkingSpaceProxy62;
        parkingSpaceProxy62.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry77 = parkingSpaceProxy62.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry78 = parkingSpaceProxy62.getRegistry();
        user0.assignProxy(parkingSpaceProxy62);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "empty" + "'", str6, "empty");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "disabled" + "'", str70, "disabled");
        org.junit.Assert.assertNotNull(accountRegistry77);
        org.junit.Assert.assertNotNull(accountRegistry78);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
        ParkingSystem.BookingManager bookingManager18 = parkingSpaceFacade17.getBookingManager();
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap19 = bookingManager18.getActiveBookings();
        ParkingSystem.CheckInManager checkInManager20 = new ParkingSystem.CheckInManager(bookingManager18);
        boolean boolean30 = bookingManager18.confirmBooking("CLT-0173ebd7-c50a-4d20-8ab3-f6039f068cff", "CLT-4fb51645-0cbc-48a2-9b9c-17fc2991039d", "848f508e-e1d2-4f02-9fc9-e95eee425d36", "", (-1), "", 0, "Refunded deposit of $1.0", "Refunded deposit of $0.0");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "13b04414-31a5-407f-8ea3-fba4613c73d1" + "'", str6, "13b04414-31a5-407f-8ea3-fba4613c73d1");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertNotNull(bookingManager18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        ParkingSystem.ParkingSpace parkingSpace4 = parkingLot1.getParkingSpace((int) (byte) -1);
        ParkingSystem.Booking booking5 = parkingSpace4.getCurrentBooking();
        ParkingSystem.ParkingLot parkingLot7 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking9 = null;
        boolean boolean10 = parkingLot7.assignBooking(0, booking9);
        boolean boolean12 = parkingLot7.isSpaceAvailable((int) '#');
        boolean boolean14 = parkingLot7.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace16 = parkingLot7.getParkingSpace((int) (byte) 10);
        int int17 = parkingSpace16.getSpaceId();
        ParkingSystem.Booking booking18 = parkingSpace16.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager19 = new ParkingSystem.SpaceManager();
        boolean boolean22 = spaceManager19.isSpaceAvailable("hi!", (int) '#');
        spaceManager19.toggleLot("disabled", false);
        ParkingSystem.Booking booking35 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean36 = spaceManager19.assignBooking("empty", (int) (short) 0, booking35);
        boolean boolean37 = parkingSpace16.assignBooking(booking35);
        ParkingSystem.SpaceManager spaceManager38 = new ParkingSystem.SpaceManager();
        boolean boolean41 = spaceManager38.isSpaceAvailable("hi!", (int) '#');
        spaceManager38.toggleLot("disabled", false);
        ParkingSystem.Booking booking54 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean55 = spaceManager38.assignBooking("empty", (int) (short) 0, booking54);
        boolean boolean56 = booking54.isCheckedIn();
        java.lang.String str57 = booking54.getClientId();
        boolean boolean58 = parkingSpace16.assignBooking(booking54);
        boolean boolean59 = parkingSpace4.assignBooking(booking54);
        parkingSpace4.removeBooking();
        int int61 = parkingSpace4.getSpaceId();
        java.lang.String str62 = parkingSpace4.scanSpace();
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(booking18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "staff" + "'", str57, "staff");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "empty" + "'", str62, "empty");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit6 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit6);
        boolean boolean12 = debitOrCredit6.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        boolean boolean15 = debitOrCredit6.validateCard("02659ad3-0b5c-4c48-a915-a466f2b50775", (double) (short) -1);
        boolean boolean20 = debitOrCredit6.processPayment("I673kmcH", (double) (byte) 100, "FNuxCiXmkP", "CLT-32d5cdc9-3c20-4f30-9d68-0be20fdf349c");
        boolean boolean25 = debitOrCredit6.processPayment("Refunded total cost of $-1.0", 1515.0d, "CLT-4aab5c22-53d4-41cb-8ccf-dd435bb7f17b", "hi!");
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.Booking booking3 = parkingSpaceFacade0.getBookingDetails("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f");
        boolean boolean6 = parkingSpaceFacade0.extendBooking("Jane", (int) (byte) 100);
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        java.lang.String str11 = client0.getName();
        java.lang.String str12 = client0.getName();
        java.lang.String str13 = client0.getClientType();
        boolean boolean16 = client0.editBooking("Jane", 100);
        boolean boolean18 = client0.extendBooking((int) '#');
        boolean boolean26 = client0.confirmBooking("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", (-1), "Card number should be 16 digits", (int) 'a', "staff", "Refunded without deposit ($-42.0)");
        java.lang.String str27 = client0.getClientId();
        boolean boolean28 = client0.checkOut();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "13b04414-31a5-407f-8ea3-fba4613c73d1" + "'", str1, "13b04414-31a5-407f-8ea3-fba4613c73d1");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "13b04414-31a5-407f-8ea3-fba4613c73d1" + "'", str11, "13b04414-31a5-407f-8ea3-fba4613c73d1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "13b04414-31a5-407f-8ea3-fba4613c73d1" + "'", str12, "13b04414-31a5-407f-8ea3-fba4613c73d1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "25527a32-01ef-45ba-816a-1d0a2fc2a52d" + "'", str13, "25527a32-01ef-45ba-816a-1d0a2fc2a52d");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "40) test3361(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CLT-a891d43c-fe31-4adb-8028-e8624d2cbb2a" + "'", str27, "CLT-a891d43c-fe31-4adb-8028-e8624d2cbb2a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        java.lang.String str4 = parkingSpaceProxy0.scanSpace("empty", "hi!");
        boolean boolean14 = parkingSpaceProxy0.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy0.addParkingLot("CLT-f02c481e-1504-4abf-b598-76152da8586a");
        boolean boolean18 = parkingSpaceProxy0.cancelBooking("CLT-f02c481e-1504-4abf-b598-76152da8586a");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        boolean boolean6 = parkingSpaceFacade0.editBooking("Jane", "staff", (int) (short) 100);
        parkingSpaceFacade0.toggleSpace("2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", false);
        parkingSpaceFacade0.toggleLot("CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade3.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = spaceManager4.getParkingLots();
        cSVManager0.saveParkingLots(strMap5);
        ParkingSystem.SpaceManager spaceManager7 = new ParkingSystem.SpaceManager();
        boolean boolean10 = spaceManager7.isSpaceAvailable("hi!", (int) '#');
        spaceManager7.toggleLot("disabled", false);
        ParkingSystem.Booking booking23 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean24 = spaceManager7.assignBooking("empty", (int) (short) 0, booking23);
        spaceManager7.removeBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) '4');
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap28 = spaceManager7.getParkingLots();
        cSVManager0.loadParkingLots(strMap28);
        java.lang.String[] strArray30 = cSVManager0.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade31 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager32 = parkingSpaceFacade31.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager33 = parkingSpaceFacade31.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap34 = spaceManager33.getParkingLots();
        cSVManager0.saveParkingLots(strMap34);
        java.util.List<java.lang.String[]> strArrayList37 = cSVManager0.readCSV("fhd49ADb");
        ParkingSystem.SpaceManager spaceManager38 = new ParkingSystem.SpaceManager();
        boolean boolean41 = spaceManager38.isSpaceAvailable("hi!", (int) '#');
        spaceManager38.toggleLot("disabled", false);
        java.lang.String str47 = spaceManager38.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.lang.String str50 = spaceManager38.scanSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "Card number should be 16 digits");
        java.lang.String str53 = spaceManager38.scanSpace("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap54 = spaceManager38.getParkingLots();
        cSVManager0.loadParkingLots(strMap54);
        org.junit.Assert.assertNotNull(strArray1);
// flaky "41) test3364(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "23) test3364(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strArray30);
// flaky "12) test3364(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(checkInManager32);
        org.junit.Assert.assertNotNull(spaceManager33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strArrayList37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "disabled" + "'", str47, "disabled");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "disabled" + "'", str50, "disabled");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "disabled" + "'", str53, "disabled");
        org.junit.Assert.assertNotNull(strMap54);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        superManager4.setManagerInfo("CLT-93b11069-2e34-4ef4-bf17-b3bb8758882b", "cf448544-0e6d-4a41-94c2-e67f848ae8df", "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry15 = superManager4.getRegistry();
        ParkingSystem.Manager manager16 = accountRegistry15.autoGenerateManager();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy18 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry19 = parkingSpaceProxy18.getRegistry();
        boolean boolean25 = parkingSpaceProxy18.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        parkingSpaceProxy18.toggleLot("hi!", false);
        accountRegistry15.assignProxyToClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41", parkingSpaceProxy18);
        java.lang.Object obj32 = parkingSpaceProxy18.login("", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        boolean boolean34 = parkingSpaceProxy18.cancelBooking("Refunded without deposit ($0.0)");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade35 = parkingSpaceProxy18.getFacade();
        boolean boolean37 = parkingSpaceFacade35.cancelBooking("");
        ParkingSystem.CheckInManager checkInManager38 = parkingSpaceFacade35.getCheckInManager();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-93b11069-2e34-4ef4-bf17-b3bb8758882b" + "'", str5, "CLT-93b11069-2e34-4ef4-bf17-b3bb8758882b");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(manager16);
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(parkingSpaceFacade35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(checkInManager38);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isSpaceAvailable((int) (byte) 100);
        boolean boolean10 = parkingLot1.isEnabled();
        parkingLot1.removeBooking(100);
        ParkingSystem.ParkingLot parkingLot15 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator16 = parkingLot15.getIterator();
        ParkingSystem.Booking booking18 = null;
        boolean boolean19 = parkingLot15.assignBooking((int) (short) 1, booking18);
        parkingLot15.removeBooking((int) (short) 0);
        boolean boolean22 = parkingLot15.isEnabled();
        ParkingSystem.ParkingLot parkingLot25 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking27 = null;
        boolean boolean28 = parkingLot25.assignBooking(0, booking27);
        boolean boolean30 = parkingLot25.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking39 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean40 = parkingLot25.assignBooking((int) (short) -1, booking39);
        boolean boolean41 = parkingLot15.assignBooking((int) (byte) 10, booking39);
        boolean boolean42 = parkingLot1.assignBooking((int) ' ', booking39);
        double double43 = booking39.getTotalCost();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap18 = bookingManager0.getActiveBookings();
        ParkingSystem.SpaceManager spaceManager19 = bookingManager0.getSpaceManager();
        double double21 = bookingManager0.getDeposit("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        double double23 = bookingManager0.getDeposit("Jane");
        boolean boolean25 = bookingManager0.cancelBooking("CLT-45a3d895-9bc3-45d3-9068-d4559eae3183");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(spaceManager19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 15.0d + "'", double23 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        parkingLot1.removeBooking((int) '#');
        ParkingSystem.ParkingSpace parkingSpace6 = parkingLot1.getParkingSpace(10);
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
        ParkingSystem.BookingManager bookingManager18 = parkingSpaceFacade17.getBookingManager();
        ParkingSystem.BookingManager bookingManager19 = parkingSpaceFacade17.getBookingManager();
        ParkingSystem.SpaceManager spaceManager20 = bookingManager19.getSpaceManager();
        ParkingSystem.AccountRegistry accountRegistry21 = bookingManager19.getAccountRegistry();
        boolean boolean31 = bookingManager19.confirmBooking("empty", "staff", "Refunded without deposit ($0.0)", "Paid $ 10.0 with Mobile Pay", (int) (byte) 10, "02659ad3-0b5c-4c48-a915-a466f2b50775", (-1), "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "06b0adae-5a80-41cd-b7f6-6da51afdd4f5");
        ParkingSystem.CheckInManager checkInManager32 = new ParkingSystem.CheckInManager(bookingManager19);
        double double34 = bookingManager19.getDeposit("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "empty" + "'", str6, "empty");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertNotNull(bookingManager18);
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertNotNull(spaceManager20);
        org.junit.Assert.assertNotNull(accountRegistry21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 15.0d + "'", double34 == 15.0d);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator18 = parkingLot17.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator19 = parkingLot17.getIterator();
        user0.user = parkingLot17;
        ParkingSystem.User user21 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj25 = parkingSpaceProxy22.login("empty", "Jane");
        parkingSpaceProxy22.validateClient("Jane");
        parkingSpaceProxy22.toggleSpace("", "staff", false);
        boolean boolean33 = parkingSpaceProxy22.cancelBooking("");
        user21.assignProxy(parkingSpaceProxy22);
        user0.user = parkingSpaceProxy22;
        ParkingSystem.User user36 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy37 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj40 = parkingSpaceProxy37.login("empty", "Jane");
        parkingSpaceProxy37.validateClient("Jane");
        parkingSpaceProxy37.toggleSpace("", "staff", false);
        boolean boolean48 = parkingSpaceProxy37.cancelBooking("");
        user36.assignProxy(parkingSpaceProxy37);
        parkingSpaceProxy37.displayPendingValidations();
        user0.parkingProxy = parkingSpaceProxy37;
        boolean boolean61 = parkingSpaceProxy37.confirmBooking("Paid $ 10.0 with Mobile Pay", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "", "jane", (int) (short) -1, "25527a32-01ef-45ba-816a-1d0a2fc2a52d", (int) (byte) 10, "Paid $ 0.0 with Mobile Pay", "0b35479f-5869-423e-9abc-e4ab9cef903d");
        ParkingSystem.Booking booking63 = parkingSpaceProxy37.getBookingDetails("e578d6f7-8a26-46f0-8e2f-f3b1be5242ca");
        boolean boolean73 = parkingSpaceProxy37.confirmBooking("empty", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "", "06b0adae-5a80-41cd-b7f6-6da51afdd4f5", 0, "Refunded without deposit ($0.0)", (-1), "K6PkM9rcCx", "CLT-d2153556-bc61-49e7-b73d-6af2a45e5167");
        boolean boolean76 = parkingSpaceProxy37.extendBooking("Paid $ 10.0 with Mobile Pay", (int) (byte) 1);
        boolean boolean80 = parkingSpaceProxy37.editBooking("8812812f-8c58-440e-9188-ca0b1f996ced", "Refunded deposit of $1.0", 35);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(booking63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("jane", "Paid $ 10.0 with Mobile Pay", (-1), "Paid $ 10.0 with Mobile Pay", (int) (short) 1, "hi!", (double) 100);
        boolean boolean8 = booking7.isCheckedIn();
        java.lang.String str9 = booking7.getLotId();
        int int10 = booking7.getSpaceId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str9, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.User user1 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        parkingSpaceProxy2.toggleSpace("", "staff", false);
        boolean boolean13 = parkingSpaceProxy2.cancelBooking("");
        user1.assignProxy(parkingSpaceProxy2);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry16 = parkingSpaceProxy15.getRegistry();
        boolean boolean22 = parkingSpaceProxy15.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean26 = parkingSpaceProxy15.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        user1.parkingProxy = parkingSpaceProxy15;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy28 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry29 = parkingSpaceProxy28.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy31 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj34 = parkingSpaceProxy31.login("empty", "Jane");
        parkingSpaceProxy31.validateClient("Jane");
        parkingSpaceProxy31.toggleSpace("", "staff", false);
        accountRegistry29.assignProxyToManager("pass", parkingSpaceProxy31);
        boolean boolean47 = parkingSpaceProxy31.register("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "disabled", "Refunded total cost of $1.0", "", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        user1.parkingProxy = parkingSpaceProxy31;
        java.lang.Object obj49 = user1.user;
        java.lang.Object obj50 = user1.user;
        ParkingSystem.AccountRegistry accountRegistry54 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager55 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry54);
        boolean boolean57 = accountRegistry54.requiresValidation("disabled");
        int int58 = accountRegistry54.getManagersSize();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy60 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj63 = parkingSpaceProxy60.login("empty", "Jane");
        parkingSpaceProxy60.validateClient("Jane");
        parkingSpaceProxy60.toggleSpace("", "staff", false);
        boolean boolean71 = parkingSpaceProxy60.cancelBooking("Jane");
        accountRegistry54.assignProxyToClient("pass", parkingSpaceProxy60);
        boolean boolean78 = parkingSpaceProxy60.register("Jane", "Paid $ -1.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", "", "Refunded total cost of $1.0");
        boolean boolean84 = parkingSpaceProxy60.register("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "jane", "", "jane", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        boolean boolean90 = parkingSpaceProxy60.register("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "staff", "Refunded total cost of $1.0", "Paid $ 10.0 with Mobile Pay", "jane");
        user1.assignProxy(parkingSpaceProxy60);
        boolean boolean93 = parkingSpaceProxy60.checkOut("hi!");
        user0.parkingProxy = parkingSpaceProxy60;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(accountRegistry16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(accountRegistry29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(superManager55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.Manager manager5 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry6 = superManager4.getRegistry();
        java.lang.String str7 = superManager4.getPassword();
        superManager4.displayPendingValidations();
        ParkingSystem.User user9 = new ParkingSystem.User();
        java.lang.Object obj10 = user9.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj14 = parkingSpaceProxy11.login("empty", "Jane");
        parkingSpaceProxy11.validateClient("Jane");
        java.lang.String str19 = parkingSpaceProxy11.scanSpace("", "");
        parkingSpaceProxy11.toggleSpace("", "disabled", true);
        user9.parkingProxy = parkingSpaceProxy11;
        parkingSpaceProxy11.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry26 = parkingSpaceProxy11.getRegistry();
        superManager4.registry = accountRegistry26;
        superManager4.setManagerInfo("4CGFxoSEo5", "WxoDOyjI", "62c76d5a-13ab-4e01-9a2c-8e91dd8f4d54");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(manager5);
        org.junit.Assert.assertNotNull(accountRegistry6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753" + "'", str7, "CLT-3ec6d712-8a64-40d1-bda2-2cbb8012a753");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
        org.junit.Assert.assertNotNull(accountRegistry26);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean10 = parkingSpaceFacade0.confirmBooking("staff", "", "disabled", "hi!", (int) 'a', "jane", (int) 'a', "hi!", "");
        parkingSpaceFacade0.toggleSpace("Paid $ 10.0 with Mobile Pay", "disabled", true);
        boolean boolean24 = parkingSpaceFacade0.confirmBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Paid $ 100.0 with Mobile Pay", "jane", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", (int) '4', "pass", (int) '4', "Paid $ -1.0 with Mobile Pay", "");
        java.lang.String str27 = parkingSpaceFacade0.scanSpace("pass", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        parkingSpaceFacade0.toggleSpace("ST001", "4CGFxoSEo5", true);
        boolean boolean34 = parkingSpaceFacade0.extendBooking("8bf217fa-1769-4d04-858b-ce78fe94bf0c", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "disabled" + "'", str27, "disabled");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        spaceManager0.addParkingLot("");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = spaceManager0.getParkingLots();
        spaceManager0.toggleSpace("CLT-22138484-eb59-490e-9c41-9fd9c319dcda", "5IYmtlKE", true);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        java.lang.String str4 = paymentManager0.paymentMessage;
        ParkingSystem.BookingManager bookingManager5 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager6 = new ParkingSystem.CheckInManager(bookingManager5);
        ParkingSystem.Booking booking8 = bookingManager5.getBooking("");
        ParkingSystem.SpaceManager spaceManager9 = bookingManager5.getSpaceManager();
        boolean boolean19 = bookingManager5.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double21 = bookingManager5.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit22 = new ParkingSystem.DebitOrCredit();
        bookingManager5.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit22);
        paymentManager0.setStrategy((ParkingSystem.Strategy) debitOrCredit22);
        java.lang.String str25 = debitOrCredit22.getPaymentMessage();
        boolean boolean30 = debitOrCredit22.processPayment("ST001", (double) 2, "pass", "pass");
        java.lang.String str31 = debitOrCredit22.getPaymentMessage();
        boolean boolean36 = debitOrCredit22.processPayment("CLT-22138484-eb59-490e-9c41-9fd9c319dcda", 1.0d, "", "Paid $ 3.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(spaceManager9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Card number should be 16 digits" + "'", str31, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("");
        parkingLot1.setEnabled(true);
        ParkingSystem.ParkingSpace parkingSpace5 = parkingLot1.getParkingSpace((int) (byte) -1);
        parkingLot1.removeBooking(0);
        parkingLot1.setEnabled(false);
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Client client12 = accountRegistry8.getClient("empty");
        accountRegistry8.validateClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        java.util.List<ParkingSystem.Client> clientList15 = accountRegistry8.displayPendingValidations();
        accountRegistry8.validateClient("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj22 = parkingSpaceProxy19.login("empty", "Jane");
        parkingSpaceProxy19.validateClient("Jane");
        parkingSpaceProxy19.toggleSpace("", "staff", false);
        boolean boolean30 = parkingSpaceProxy19.cancelBooking("Jane");
        boolean boolean32 = parkingSpaceProxy19.checkOut("empty");
        boolean boolean42 = parkingSpaceProxy19.confirmBooking("2afd610d-a8cb-413a-bbee-7927f86b526c", "Paid $ -1.0 with Mobile Pay", "", "", (int) (short) 0, "disabled", 32, "", "jane");
        parkingSpaceProxy19.addParkingLot("Paid $ -1.0 with Mobile Pay");
        accountRegistry8.assignProxyToManager("Refunded total cost of $-1.0", parkingSpaceProxy19);
        java.lang.Object obj48 = accountRegistry8.login("tbHxuilT", "Refunded total cost of $10.0");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNull(client12);
        org.junit.Assert.assertNotNull(clientList15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        parkingLot1.setEnabled(false);
        ParkingSystem.BookingManager bookingManager6 = new ParkingSystem.BookingManager();
        double double9 = bookingManager6.calculateCost("", 0);
        boolean boolean13 = bookingManager6.editBooking("Jane", "empty", 10);
        boolean boolean23 = bookingManager6.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap24 = bookingManager6.getActiveBookings();
        ParkingSystem.SpaceManager spaceManager25 = bookingManager6.getSpaceManager();
        ParkingSystem.Booking booking35 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        double double36 = booking35.getTotalCost();
        java.lang.String str37 = booking35.getLotId();
        boolean boolean38 = booking35.isCheckedIn();
        booking35.setStartTime("Refunded total cost of $1.0");
        boolean boolean41 = spaceManager25.assignBooking("empty", (int) '4', booking35);
        boolean boolean42 = parkingLot1.assignBooking(100, booking35);
        parkingLot1.setEnabled(false);
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(spaceManager25);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "jane" + "'", str37, "jane");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        paymentManager0.paymentMessage = "pass";
        java.lang.String str6 = paymentManager0.paymentMessage;
        boolean boolean9 = paymentManager0.refundWithoutDeposit((double) 2, (double) (short) 100);
        java.lang.String str10 = paymentManager0.refundMessage;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "pass" + "'", str6, "pass");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Refunded without deposit ($-98.0)" + "'", str10, "Refunded without deposit ($-98.0)");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        parkingSpaceFacade0.addParkingLot("Jane");
        ParkingSystem.BookingManager bookingManager6 = parkingSpaceFacade0.getBookingManager();
        boolean boolean9 = parkingSpaceFacade0.extendBooking("CLT-390234b0-d56e-4275-bd7b-122280609c69", 52);
        boolean boolean11 = parkingSpaceFacade0.checkIn("Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertNotNull(bookingManager6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        java.lang.String str8 = parkingSpaceProxy0.scanSpace("", "");
        java.lang.Object obj11 = parkingSpaceProxy0.login("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff");
        parkingSpaceProxy0.displayPendingValidations();
        java.lang.Object obj15 = parkingSpaceProxy0.login("4a1f2343-8b2e-4dea-ba69-efd105414390", "CLT-f5f3129f-6f77-4a04-a68b-486f89449455");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "disabled" + "'", str8, "disabled");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        ParkingSystem.User user18 = new ParkingSystem.User();
        java.lang.Object obj19 = user18.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy20 = user18.parkingProxy;
        ParkingSystem.User user21 = new ParkingSystem.User();
        java.lang.Object obj22 = user21.user;
        ParkingSystem.Client client23 = ParkingSystem.Client.getInstance();
        java.lang.String str24 = client23.getName();
        client23.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry28 = parkingSpaceProxy27.getRegistry();
        boolean boolean30 = parkingSpaceProxy27.checkIn("");
        client23.assignProxy(parkingSpaceProxy27);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade32 = parkingSpaceProxy27.getFacade();
        user21.assignProxy(parkingSpaceProxy27);
        user18.parkingProxy = parkingSpaceProxy27;
        ParkingSystem.AccountRegistry accountRegistry38 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager39 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry38);
        boolean boolean41 = accountRegistry38.requiresValidation("disabled");
        int int42 = accountRegistry38.getManagersSize();
        boolean boolean48 = accountRegistry38.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy50 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj53 = parkingSpaceProxy50.login("empty", "Jane");
        parkingSpaceProxy50.validateClient("Jane");
        parkingSpaceProxy50.toggleSpace("", "staff", false);
        boolean boolean61 = parkingSpaceProxy50.cancelBooking("Jane");
        accountRegistry38.assignProxyToClient("pass", parkingSpaceProxy50);
        parkingSpaceProxy50.autoGenerateManager();
        parkingSpaceProxy50.toggleSpace("Paid $ 100.0 with Mobile Pay", "Jane", true);
        user18.assignProxy(parkingSpaceProxy50);
        user0.assignProxy(parkingSpaceProxy50);
        java.lang.Object obj70 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy71 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry72 = parkingSpaceProxy71.getRegistry();
        boolean boolean74 = parkingSpaceProxy71.checkIn("");
        parkingSpaceProxy71.toggleLot("", true);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade78 = parkingSpaceProxy71.getFacade();
        user0.assignProxy(parkingSpaceProxy71);
        ParkingSystem.Client client80 = ParkingSystem.Client.getInstance();
        java.lang.String str81 = client80.getName();
        client80.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy84 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry85 = parkingSpaceProxy84.getRegistry();
        boolean boolean87 = parkingSpaceProxy84.checkIn("");
        client80.assignProxy(parkingSpaceProxy84);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade89 = parkingSpaceProxy84.getFacade();
        boolean boolean91 = parkingSpaceFacade89.checkOut("Paid $ 0.0 with Mobile Pay");
        ParkingSystem.BookingManager bookingManager92 = parkingSpaceFacade89.getBookingManager();
        boolean boolean96 = parkingSpaceFacade89.editBooking("CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", "25527a32-01ef-45ba-816a-1d0a2fc2a52d", 0);
        user0.user = parkingSpaceFacade89;
        ParkingSystem.CheckInManager checkInManager98 = parkingSpaceFacade89.getCheckInManager();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(parkingSpaceProxy20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(client23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7" + "'", str24, "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        org.junit.Assert.assertNotNull(accountRegistry28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade32);
        org.junit.Assert.assertNotNull(superManager39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + true + "'", obj70, true);
        org.junit.Assert.assertNotNull(accountRegistry72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade78);
        org.junit.Assert.assertNotNull(client80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "jane" + "'", str81, "jane");
        org.junit.Assert.assertNotNull(accountRegistry85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(bookingManager92);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(checkInManager98);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        ParkingSystem.CSVManager cSVManager1 = new ParkingSystem.CSVManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade2 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager3 = parkingSpaceFacade2.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade2.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = spaceManager4.getParkingLots();
        cSVManager1.loadParkingLots(strMap5);
        java.lang.String[] strArray7 = cSVManager1.loadSuperManager();
        ParkingSystem.CSVManager cSVManager8 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray9 = cSVManager8.loadSuperManager();
        java.lang.String[] strArray10 = cSVManager8.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade11 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager12 = parkingSpaceFacade11.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap13 = spaceManager12.getParkingLots();
        cSVManager8.saveParkingLots(strMap13);
        cSVManager1.saveParkingLots(strMap13);
        cSVManager0.loadParkingLots(strMap13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList17 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(checkInManager3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strArray7);
// flaky "42) test3385(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray9);
// flaky "24) test3385(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray10);
// flaky "13) test3385(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        double double6 = bookingManager0.getDeposit("Jane");
        ParkingSystem.AccountRegistry accountRegistry7 = bookingManager0.getAccountRegistry();
        boolean boolean17 = bookingManager0.confirmBooking("CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c", "Refunded total cost of $1.0", "CLT-45a3d895-9bc3-45d3-9068-d4559eae3183", "Refunded without deposit ($0.0)", 32, "ST001", (int) (short) 1, "", "CLT-035180a0-4707-410d-a011-2a4f0f46838b");
        boolean boolean19 = bookingManager0.cancelBooking("CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc");
        ParkingSystem.SpaceManager spaceManager20 = bookingManager0.getSpaceManager();
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(spaceManager20);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("CLT-5e15ad0b-2221-4ef9-a477-c00f6c4e54d8");
        ParkingSystem.Booking booking10 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        int int11 = booking10.getDuration();
        java.lang.String str12 = booking10.getClientId();
        booking10.setStartTime("hi!");
        boolean boolean15 = booking10.isCheckedIn();
        java.lang.String str16 = booking10.getLotId();
        int int17 = booking10.getDuration();
        boolean boolean18 = booking10.isCheckedIn();
        boolean boolean19 = parkingLot1.assignBooking((int) ' ', booking10);
        boolean boolean20 = parkingLot1.isEnabled();
        ParkingSystem.ParkingLotIterator parkingLotIterator21 = parkingLot1.getIterator();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "jane" + "'", str16, "jane");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator21);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        ParkingSystem.CheckInManager checkInManager18 = new ParkingSystem.CheckInManager(bookingManager0);
        double double21 = bookingManager0.calculateCost("Paid $ 10.0 with Mobile Pay", 10);
        double double23 = bookingManager0.getDeposit("7a3de84e-e9eb-49bb-a693-2de651c058e6");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 165.0d + "'", double21 == 165.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 15.0d + "'", double23 == 15.0d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj5 = parkingSpaceProxy2.login("empty", "Jane");
        parkingSpaceProxy2.validateClient("Jane");
        java.lang.String str10 = parkingSpaceProxy2.scanSpace("", "");
        parkingSpaceProxy2.toggleSpace("", "disabled", true);
        user0.parkingProxy = parkingSpaceProxy2;
        parkingSpaceProxy2.autoGenerateManager();
        boolean boolean26 = parkingSpaceProxy2.confirmBooking("Refunded without deposit ($-42.0)", "disabled", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", (int) (short) 1, "empty", (int) (short) 1, "Card number should be 16 digits", "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        ParkingSystem.AccountRegistry accountRegistry27 = parkingSpaceProxy2.getRegistry();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(accountRegistry27);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        ParkingSystem.AccountRegistry accountRegistry3 = null;
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("25527a32-01ef-45ba-816a-1d0a2fc2a52d", "09622cbf-e665-45db-b1ad-365065947a20", "13b04414-31a5-407f-8ea3-fba4613c73d1", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry5 = superManager4.getRegistry();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(accountRegistry5);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry18 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry18);
        java.lang.String str20 = superManager19.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry24 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager25 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry24);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = null;
        accountRegistry24.assignProxyToManager("disabled", parkingSpaceProxy27);
        superManager19.registry = accountRegistry24;
        superManager4.registry = accountRegistry24;
        ParkingSystem.AccountRegistry accountRegistry31 = superManager4.getRegistry();
        int int32 = accountRegistry31.getManagersSize();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4CGFxoSEo5" + "'", str5, "4CGFxoSEo5");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4CGFxoSEo5" + "'", str20, "4CGFxoSEo5");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(accountRegistry31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        ParkingSystem.User user3 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj7 = parkingSpaceProxy4.login("empty", "Jane");
        parkingSpaceProxy4.validateClient("Jane");
        parkingSpaceProxy4.toggleSpace("", "staff", false);
        boolean boolean15 = parkingSpaceProxy4.cancelBooking("");
        user3.assignProxy(parkingSpaceProxy4);
        parkingSpaceProxy4.displayPendingValidations();
        parkingSpaceProxy4.addParkingLot("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade20 = parkingSpaceProxy4.getFacade();
        ParkingSystem.AccountRegistry accountRegistry21 = parkingSpaceProxy4.getRegistry();
        accountRegistry21.validateClient("Paid $ 100.0 with Mobile Pay");
        ParkingSystem.SuperManager superManager24 = ParkingSystem.SuperManager.createFromCSV("I673kmcH", "ST001", "FNuxCiXmkP", accountRegistry21);
        ParkingSystem.AccountRegistry accountRegistry25 = superManager24.registry;
        java.lang.String str26 = superManager24.getName();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parkingSpaceFacade20);
        org.junit.Assert.assertNotNull(accountRegistry21);
        org.junit.Assert.assertNotNull(superManager24);
        org.junit.Assert.assertNotNull(accountRegistry25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "WxoDOyjI" + "'", str26, "WxoDOyjI");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = null;
        accountRegistry3.assignProxyToManager("disabled", parkingSpaceProxy6);
        ParkingSystem.AccountRegistry accountRegistry12 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager13 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry12);
        java.lang.String str14 = superManager13.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry18 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry18);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy21 = null;
        accountRegistry18.assignProxyToManager("disabled", parkingSpaceProxy21);
        superManager13.registry = accountRegistry18;
        ParkingSystem.AccountRegistry accountRegistry24 = superManager13.getRegistry();
        ParkingSystem.Manager manager25 = accountRegistry24.autoGenerateManager();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry28 = parkingSpaceProxy27.getRegistry();
        boolean boolean34 = parkingSpaceProxy27.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        parkingSpaceProxy27.toggleLot("hi!", false);
        accountRegistry24.assignProxyToClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41", parkingSpaceProxy27);
        accountRegistry3.assignProxyToClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41", parkingSpaceProxy27);
        accountRegistry3.validateClient("ST001");
        boolean boolean43 = accountRegistry3.requiresValidation("CLT-2d7011d7-cb71-4953-84cc-0d7adf2da0d4");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4CGFxoSEo5" + "'", str14, "4CGFxoSEo5");
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertNotNull(accountRegistry24);
        org.junit.Assert.assertNotNull(manager25);
        org.junit.Assert.assertNotNull(accountRegistry28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry18 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry18);
        java.lang.String str20 = superManager19.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry24 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager25 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry24);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = null;
        accountRegistry24.assignProxyToManager("disabled", parkingSpaceProxy27);
        superManager19.registry = accountRegistry24;
        superManager4.registry = accountRegistry24;
        ParkingSystem.AccountRegistry accountRegistry31 = superManager4.registry;
        superManager4.displayPendingValidations();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4CGFxoSEo5" + "'", str5, "4CGFxoSEo5");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4CGFxoSEo5" + "'", str20, "4CGFxoSEo5");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(accountRegistry31);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        parkingLot1.removeBooking((int) '#');
        boolean boolean5 = parkingLot1.isEnabled();
        ParkingSystem.Booking booking14 = new ParkingSystem.Booking("pass", "Jane", (int) '#', "Refunded without deposit ($0.0)", 0, "", (double) 0);
        boolean boolean15 = parkingLot1.assignBooking(2, booking14);
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getExtraId();
        java.lang.String str11 = client0.getName();
        java.lang.String str12 = client0.getName();
        boolean boolean13 = client0.checkIn();
        java.lang.String str14 = client0.getPassword();
        java.lang.String str15 = client0.getUsername();
        boolean boolean23 = client0.confirmBooking("CLT-035180a0-4707-410d-a011-2a4f0f46838b", "Jane", 0, "disabled", (int) (byte) 0, "4a1f2343-8b2e-4dea-ba69-efd105414390", "hi!");
        ParkingSystem.Booking booking24 = client0.getBookingDetails();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "jane" + "'", str10, "jane");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "empty" + "'", str11, "empty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "empty" + "'", str12, "empty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str14, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "disabled" + "'", str15, "disabled");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(booking24);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        boolean boolean9 = paymentManager0.refundWithoutDeposit((double) 1L, (double) 'a');
        java.lang.String str10 = paymentManager0.paymentMessage;
        boolean boolean15 = paymentManager0.processPayment("disabled", (double) (short) 1, "ST001", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.MobilePay mobilePay16 = new ParkingSystem.MobilePay();
        boolean boolean21 = mobilePay16.processPayment("disabled", 10.0d, "disabled", "disabled");
        boolean boolean26 = mobilePay16.processPayment("jane", 15.0d, "jane", "");
        paymentManager0.setStrategy((ParkingSystem.Strategy) mobilePay16);
        boolean boolean29 = paymentManager0.refundTotalCost((double) 0L);
        paymentManager0.refundMessage = "empty";
        ParkingSystem.DebitOrCredit debitOrCredit32 = new ParkingSystem.DebitOrCredit();
        java.lang.String str33 = debitOrCredit32.getPaymentMessage();
        boolean boolean36 = debitOrCredit32.validateCard("25527a32-01ef-45ba-816a-1d0a2fc2a52d", 1470.0d);
        paymentManager0.setStrategy((ParkingSystem.Strategy) debitOrCredit32);
        java.lang.String str38 = paymentManager0.refundMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str10, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "empty" + "'", str38, "empty");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        client0.setClientInfo("Jane", "", "pass", "pass", "pass", "hi!", true);
        java.lang.String str10 = client0.getName();
        client0.setClientInfo("qPYDfDnbtD", "7a3de84e-e9eb-49bb-a693-2de651c058e6", "Refunded total cost of $100.0", "jane", "CLT-f29b50f4-73fb-4365-adeb-1cd99d161fd9", "CLT-b6a8264c-f386-4429-b59c-b7f465002e13", true);
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "disabled" + "'", str1, "disabled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean6 = parkingSpaceFacade0.extendBooking("disabled", 0);
        boolean boolean16 = parkingSpaceFacade0.confirmBooking("Refunded without deposit ($-42.0)", "Refunded without deposit ($-42.0)", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Paid $ 100.0 with Mobile Pay", (int) '#', "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", 0, "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "Paid $ 10.0 with Mobile Pay");
        java.lang.String str19 = parkingSpaceFacade0.scanSpace("0b35479f-5869-423e-9abc-e4ab9cef903d", "CLT-a891d43c-fe31-4adb-8028-e8624d2cbb2a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade17 = parkingSpaceProxy9.getFacade();
        boolean boolean21 = parkingSpaceProxy9.editBooking("empty", "Refunded without deposit ($0.0)", 100);
        parkingSpaceProxy9.autoGenerateManager();
        boolean boolean24 = parkingSpaceProxy9.checkOut("4a1f2343-8b2e-4dea-ba69-efd105414390");
        java.lang.String str27 = parkingSpaceProxy9.scanSpace("Paid $ 0.0 with Mobile Pay", "pass");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade28 = parkingSpaceProxy9.getFacade();
        java.lang.Object obj31 = parkingSpaceProxy9.login("CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", "83a51dc6-0c8f-4f21-ae40-68699828f95d");
        parkingSpaceProxy9.addParkingLot("CLT-b617f4e8-13b0-4862-9aea-73970e2b5471");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7a3de84e-e9eb-49bb-a693-2de651c058e6" + "'", str6, "7a3de84e-e9eb-49bb-a693-2de651c058e6");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "disabled" + "'", str27, "disabled");
        org.junit.Assert.assertNotNull(parkingSpaceFacade28);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        ParkingSystem.Enabled enabled0 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot2 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking4 = null;
        boolean boolean5 = parkingLot2.assignBooking(0, booking4);
        boolean boolean7 = parkingLot2.isSpaceAvailable((int) '#');
        boolean boolean9 = parkingLot2.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot2.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking12 = parkingSpace11.getCurrentBooking();
        parkingSpace11.removeBooking();
        java.lang.String str14 = enabled0.scanSpace(parkingSpace11);
        parkingSpace11.removeBooking();
        ParkingSystem.SpaceState spaceState16 = parkingSpace11.getState();
        int int17 = parkingSpace11.getSpaceId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "empty" + "'", str14, "empty");
        org.junit.Assert.assertNotNull(spaceState16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getUsername();
        client0.setValidated(false);
        client0.setClientInfo("staff", "Refunded total cost of $1.0", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", "Jane", "Paid $ 10.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", true);
        boolean boolean15 = client0.editBooking("Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean18 = client0.editBooking("13b04414-31a5-407f-8ea3-fba4613c73d1", (int) 'a');
        boolean boolean19 = client0.cancelBooking();
        java.lang.String str20 = client0.getName();
        boolean boolean21 = client0.cancelBooking();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLT-f29b50f4-73fb-4365-adeb-1cd99d161fd9" + "'", str1, "CLT-f29b50f4-73fb-4365-adeb-1cd99d161fd9");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Refunded total cost of $100.0" + "'", str2, "Refunded total cost of $100.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Refunded total cost of $1.0" + "'", str20, "Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        ParkingSystem.AccountRegistry accountRegistry14 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager15 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry14);
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap16 = accountRegistry14.getManagers();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy18 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry19 = parkingSpaceProxy18.getRegistry();
        java.lang.String str22 = parkingSpaceProxy18.scanSpace("empty", "hi!");
        boolean boolean32 = parkingSpaceProxy18.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy18.toggleSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "", true);
        boolean boolean42 = parkingSpaceProxy18.register("jane", "Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($0.0)", "disabled", "Refunded total cost of $1.0");
        accountRegistry14.assignProxyToManager("7aecb00c-028c-4dcf-96cc-14d25bd709ab", parkingSpaceProxy18);
        accountRegistry6.assignProxyToManager("CLT-30fd593b-dedd-41b3-a919-c48700301f41", parkingSpaceProxy18);
        ParkingSystem.SuperManager superManager45 = ParkingSystem.SuperManager.createFromCSV("hi!", "hi!", "pass", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry49 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager50 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry49);
        java.lang.String str51 = superManager50.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry52 = superManager50.registry;
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap53 = accountRegistry52.getManagers();
        ParkingSystem.Client client55 = ParkingSystem.Client.getInstance();
        java.lang.String str56 = client55.getName();
        client55.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str65 = client55.getUsername();
        java.lang.String str66 = client55.getPassword();
        java.lang.String str67 = client55.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy68 = null;
        client55.assignProxy(parkingSpaceProxy68);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy70 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj73 = parkingSpaceProxy70.login("empty", "Jane");
        client55.assignProxy(parkingSpaceProxy70);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy75 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking77 = parkingSpaceProxy75.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry78 = parkingSpaceProxy75.getRegistry();
        parkingSpaceProxy75.autoGenerateManager();
        client55.assignProxy(parkingSpaceProxy75);
        boolean boolean84 = parkingSpaceProxy75.editBooking("13b04414-31a5-407f-8ea3-fba4613c73d1", "Refunded total cost of $100.0", (int) (byte) 0);
        accountRegistry52.assignProxyToManager("Paid $ 100.0 with Mobile Pay", parkingSpaceProxy75);
        superManager45.registry = accountRegistry52;
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap87 = accountRegistry52.getManagers();
        boolean boolean89 = accountRegistry52.requiresValidation("09622cbf-e665-45db-b1ad-365065947a20");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "disabled" + "'", str22, "disabled");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(superManager45);
        org.junit.Assert.assertNotNull(superManager50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4CGFxoSEo5" + "'", str51, "4CGFxoSEo5");
        org.junit.Assert.assertNotNull(accountRegistry52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(client55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "jane" + "'", str56, "jane");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "disabled" + "'", str66, "disabled");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(booking77);
        org.junit.Assert.assertNotNull(accountRegistry78);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strMap87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        boolean boolean9 = paymentManager0.refundWithoutDeposit((double) 1L, (double) 'a');
        java.lang.String str10 = paymentManager0.refundMessage;
        paymentManager0.paymentMessage = "CLT-be0c8baf-d002-4bd3-a0a4-b45542b3f61e";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Refunded without deposit ($-96.0)" + "'", str10, "Refunded without deposit ($-96.0)");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        java.lang.String str11 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap12 = spaceManager0.getParkingLots();
        boolean boolean15 = spaceManager0.isSpaceAvailable("staff", (int) '4');
        spaceManager0.removeBooking("Paid $ 100.0 with Mobile Pay", (int) (byte) 0);
        ParkingSystem.Booking booking28 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        int int29 = booking28.getDuration();
        java.lang.String str30 = booking28.getClientId();
        booking28.setCheckedIn(true);
        booking28.setStartTime("Paid $ -1.0 with Mobile Pay");
        boolean boolean35 = spaceManager0.assignBooking("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", (int) (byte) 1, booking28);
        java.lang.String str36 = booking28.getLicensePlate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "staff" + "'", str30, "staff");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "disabled" + "'", str36, "disabled");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.User user3 = new ParkingSystem.User();
        java.lang.Object obj4 = user3.user;
        ParkingSystem.Client client5 = ParkingSystem.Client.getInstance();
        java.lang.String str6 = client5.getName();
        client5.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry10 = parkingSpaceProxy9.getRegistry();
        boolean boolean12 = parkingSpaceProxy9.checkIn("");
        client5.assignProxy(parkingSpaceProxy9);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade14 = parkingSpaceProxy9.getFacade();
        user3.assignProxy(parkingSpaceProxy9);
        user0.parkingProxy = parkingSpaceProxy9;
        ParkingSystem.AccountRegistry accountRegistry20 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry20);
        boolean boolean23 = accountRegistry20.requiresValidation("disabled");
        int int24 = accountRegistry20.getManagersSize();
        boolean boolean30 = accountRegistry20.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy32 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj35 = parkingSpaceProxy32.login("empty", "Jane");
        parkingSpaceProxy32.validateClient("Jane");
        parkingSpaceProxy32.toggleSpace("", "staff", false);
        boolean boolean43 = parkingSpaceProxy32.cancelBooking("Jane");
        accountRegistry20.assignProxyToClient("pass", parkingSpaceProxy32);
        parkingSpaceProxy32.autoGenerateManager();
        parkingSpaceProxy32.toggleSpace("Paid $ 100.0 with Mobile Pay", "Jane", true);
        user0.assignProxy(parkingSpaceProxy32);
        java.lang.Object obj51 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy52 = user0.parkingProxy;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(parkingSpaceProxy52);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        parkingLot1.removeBooking(0);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot1.getParkingSpace(0);
        ParkingSystem.ParkingLotIterator parkingLotIterator12 = parkingLot1.getIterator();
        ParkingSystem.ParkingSpace parkingSpace14 = parkingLot1.getParkingSpace(0);
        ParkingSystem.ParkingLot parkingLot17 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking19 = null;
        boolean boolean20 = parkingLot17.assignBooking(0, booking19);
        boolean boolean22 = parkingLot17.isSpaceAvailable((int) '#');
        boolean boolean24 = parkingLot17.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace26 = parkingLot17.getParkingSpace((int) (byte) 10);
        int int27 = parkingSpace26.getSpaceId();
        ParkingSystem.Booking booking28 = parkingSpace26.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager29 = new ParkingSystem.SpaceManager();
        boolean boolean32 = spaceManager29.isSpaceAvailable("hi!", (int) '#');
        spaceManager29.toggleLot("disabled", false);
        ParkingSystem.Booking booking45 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean46 = spaceManager29.assignBooking("empty", (int) (short) 0, booking45);
        boolean boolean47 = parkingSpace26.assignBooking(booking45);
        ParkingSystem.SpaceManager spaceManager48 = new ParkingSystem.SpaceManager();
        boolean boolean51 = spaceManager48.isSpaceAvailable("hi!", (int) '#');
        spaceManager48.toggleLot("disabled", false);
        ParkingSystem.Booking booking64 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean65 = spaceManager48.assignBooking("empty", (int) (short) 0, booking64);
        ParkingSystem.SpaceManager spaceManager68 = new ParkingSystem.SpaceManager();
        boolean boolean71 = spaceManager68.isSpaceAvailable("hi!", (int) '#');
        spaceManager68.toggleLot("disabled", false);
        ParkingSystem.Booking booking84 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean85 = spaceManager68.assignBooking("empty", (int) (short) 0, booking84);
        boolean boolean86 = spaceManager48.assignBooking("disabled", (int) (byte) 0, booking84);
        boolean boolean87 = parkingSpace26.assignBooking(booking84);
        java.lang.String str88 = booking84.getLotId();
        booking84.setCheckedIn(true);
        java.lang.String str91 = booking84.getClientId();
        boolean boolean92 = parkingLot1.assignBooking(35, booking84);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNotNull(parkingLotIterator12);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(booking28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "jane" + "'", str88, "jane");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "staff" + "'", str91, "staff");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        ParkingSystem.User user3 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj7 = parkingSpaceProxy4.login("empty", "Jane");
        parkingSpaceProxy4.validateClient("Jane");
        parkingSpaceProxy4.toggleSpace("", "staff", false);
        boolean boolean15 = parkingSpaceProxy4.cancelBooking("");
        user3.assignProxy(parkingSpaceProxy4);
        parkingSpaceProxy4.displayPendingValidations();
        parkingSpaceProxy4.addParkingLot("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade20 = parkingSpaceProxy4.getFacade();
        ParkingSystem.AccountRegistry accountRegistry21 = parkingSpaceProxy4.getRegistry();
        accountRegistry21.validateClient("Paid $ 100.0 with Mobile Pay");
        ParkingSystem.SuperManager superManager24 = ParkingSystem.SuperManager.createFromCSV("I673kmcH", "ST001", "FNuxCiXmkP", accountRegistry21);
        ParkingSystem.AccountRegistry accountRegistry25 = superManager24.registry;
        ParkingSystem.AccountRegistry accountRegistry26 = superManager24.getRegistry();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parkingSpaceFacade20);
        org.junit.Assert.assertNotNull(accountRegistry21);
        org.junit.Assert.assertNotNull(superManager24);
        org.junit.Assert.assertNotNull(accountRegistry25);
        org.junit.Assert.assertNotNull(accountRegistry26);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        ParkingSystem.SpaceManager spaceManager14 = new ParkingSystem.SpaceManager();
        boolean boolean17 = spaceManager14.isSpaceAvailable("hi!", (int) '#');
        spaceManager14.toggleLot("disabled", false);
        ParkingSystem.Booking booking30 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean31 = spaceManager14.assignBooking("empty", (int) (short) 0, booking30);
        spaceManager14.loadParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap33 = spaceManager14.getParkingLots();
        cSVManager0.loadParkingLots(strMap33);
        java.lang.String[] strArray35 = cSVManager0.loadSuperManager();
        ParkingSystem.CSVManager cSVManager36 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList38 = cSVManager36.readCSV("");
        java.util.List<java.lang.String[]> strArrayList40 = cSVManager36.readCSV("Card number should be 16 digits");
        java.lang.String[] strArray41 = cSVManager36.loadSuperManager();
        ParkingSystem.SpaceManager spaceManager42 = new ParkingSystem.SpaceManager();
        spaceManager42.removeBooking("hi!", (int) (byte) 0);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap46 = spaceManager42.getParkingLots();
        cSVManager36.saveParkingLots(strMap46);
        cSVManager0.loadParkingLots(strMap46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList49 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strArray35);
// flaky "43) test3409(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArrayList38);
        org.junit.Assert.assertNotNull(strArrayList40);
        org.junit.Assert.assertNotNull(strArray41);
// flaky "25) test3409(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strMap46);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("jane", "");
        spaceManager0.toggleLot("Jane", true);
        spaceManager0.addParkingLot("Paid $ -1.0 with Mobile Pay");
        spaceManager0.toggleLot("hi!", false);
        spaceManager0.toggleSpace("CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6", "", true);
        spaceManager0.loadParkingLots();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.AccountRegistry accountRegistry14 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager15 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry14);
        superManager10.registry = accountRegistry14;
        ParkingSystem.Client client18 = accountRegistry14.getClient("empty");
        accountRegistry14.validateClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        java.lang.Object obj23 = accountRegistry14.login("ST001", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        accountRegistry14.validateClient("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.SuperManager superManager26 = ParkingSystem.SuperManager.createFromCSV("Jane", "Paid $ -1.0 with Mobile Pay", "pass", accountRegistry14);
        ParkingSystem.SuperManager superManager27 = ParkingSystem.SuperManager.createFromCSV("2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-390234b0-d56e-4275-bd7b-122280609c69", "iHAHREGIAH", accountRegistry14);
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertNull(client18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(superManager26);
        org.junit.Assert.assertNotNull(superManager27);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingLotIterator parkingLotIterator9 = parkingLot1.getIterator();
        boolean boolean11 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace13 = parkingLot1.getParkingSpace(0);
        ParkingSystem.SpaceState spaceState14 = parkingSpace13.getState();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertNotNull(spaceState14);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade1.checkIn("");
        ParkingSystem.BookingManager bookingManager4 = parkingSpaceFacade1.getBookingManager();
        parkingSpaceFacade1.toggleLot("Paid $ -1.0 with Mobile Pay", false);
        user0.user = "Paid $ -1.0 with Mobile Pay";
        ParkingSystem.User user9 = new ParkingSystem.User();
        java.lang.Object obj10 = user9.user;
        ParkingSystem.Client client11 = ParkingSystem.Client.getInstance();
        java.lang.String str12 = client11.getName();
        client11.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry16 = parkingSpaceProxy15.getRegistry();
        boolean boolean18 = parkingSpaceProxy15.checkIn("");
        client11.assignProxy(parkingSpaceProxy15);
        boolean boolean20 = client11.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy21 = new ParkingSystem.ParkingSpaceProxy();
        client11.assignProxy(parkingSpaceProxy21);
        ParkingSystem.AccountRegistry accountRegistry23 = parkingSpaceProxy21.getRegistry();
        boolean boolean25 = parkingSpaceProxy21.checkIn("hi!");
        user9.parkingProxy = parkingSpaceProxy21;
        user9.register("Card number should be 16 digits", "Paid $ 100.0 with Mobile Pay", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", "Paid $ 0.0 with Mobile Pay");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy33 = user9.parkingProxy;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy34 = new ParkingSystem.ParkingSpaceProxy();
        user9.assignProxy(parkingSpaceProxy34);
        boolean boolean45 = parkingSpaceProxy34.confirmBooking("CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "09622cbf-e665-45db-b1ad-365065947a20", "Paid $ 15.0 with Mobile Pay", (int) (byte) -1, "Refunded without deposit ($0.0)", 0, "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "13b04414-31a5-407f-8ea3-fba4613c73d1");
        boolean boolean51 = parkingSpaceProxy34.register("02659ad3-0b5c-4c48-a915-a466f2b50775", "5XQfkf24zK", "", "ua4ppOLtSl", "25527a32-01ef-45ba-816a-1d0a2fc2a52d");
        user0.assignProxy(parkingSpaceProxy34);
        java.lang.Object obj53 = user0.user;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookingManager4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(client11);
// flaky "44) test3413(RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Jane" + "'", str12, "Jane");
        org.junit.Assert.assertNotNull(accountRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parkingSpaceProxy33);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", obj53, "Paid $ -1.0 with Mobile Pay");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str3 = parkingSpaceFacade0.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleLot("Refunded total cost of $1.0", false);
        ParkingSystem.SpaceManager spaceManager8 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleLot("Paid $ 100.0 with Mobile Pay", false);
        boolean boolean21 = parkingSpaceFacade0.confirmBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "4a1f2343-8b2e-4dea-ba69-efd105414390", "06b0adae-5a80-41cd-b7f6-6da51afdd4f5", "", (int) (byte) 1, "pass", (int) (byte) 10, "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", "Paid $ 100.0 with Mobile Pay");
        ParkingSystem.BookingManager bookingManager22 = parkingSpaceFacade0.getBookingManager();
        double double24 = bookingManager22.getDeposit("e578d6f7-8a26-46f0-8e2f-f3b1be5242ca");
        ParkingSystem.BookingManager bookingManager25 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager26 = new ParkingSystem.CheckInManager(bookingManager25);
        ParkingSystem.SpaceManager spaceManager27 = bookingManager25.getSpaceManager();
        double double30 = bookingManager25.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit31 = new ParkingSystem.DebitOrCredit();
        bookingManager25.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit31);
        boolean boolean37 = debitOrCredit31.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str38 = debitOrCredit31.getPaymentMessage();
        boolean boolean43 = debitOrCredit31.processPayment("Paid $ 0.0 with Mobile Pay", 30.0d, "Paid $ -1.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay");
        boolean boolean46 = debitOrCredit31.validateCard("Jane", (double) '4');
        java.lang.String str47 = debitOrCredit31.getPaymentMessage();
        bookingManager22.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit31);
        double double50 = bookingManager22.getDeposit("I673kmcH");
        boolean boolean52 = bookingManager22.cancelBooking("02659ad3-0b5c-4c48-a915-a466f2b50775");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookingManager22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 15.0d + "'", double24 == 15.0d);
        org.junit.Assert.assertNotNull(spaceManager27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 165.0d + "'", double30 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Card number should be 16 digits" + "'", str38, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Card number should be 16 digits" + "'", str47, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 15.0d + "'", double50 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        ParkingSystem.CSVManager cSVManager14 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList16 = cSVManager14.readCSV("");
        java.util.List<java.lang.String[]> strArrayList18 = cSVManager14.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap19 = null;
        cSVManager14.loadParkingLots(strMap19);
        ParkingSystem.AccountRegistry accountRegistry24 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager25 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry24);
        ParkingSystem.Manager manager26 = superManager25.autoGenerateManager();
        cSVManager14.saveManager((ParkingSystem.Manager) superManager25);
        ParkingSystem.SpaceManager spaceManager28 = new ParkingSystem.SpaceManager();
        boolean boolean31 = spaceManager28.isSpaceAvailable("hi!", (int) '#');
        spaceManager28.toggleLot("disabled", false);
        ParkingSystem.Booking booking44 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean45 = spaceManager28.assignBooking("empty", (int) (short) 0, booking44);
        spaceManager28.loadParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap47 = spaceManager28.getParkingLots();
        cSVManager14.loadParkingLots(strMap47);
        ParkingSystem.SpaceManager spaceManager49 = new ParkingSystem.SpaceManager();
        boolean boolean52 = spaceManager49.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str55 = spaceManager49.scanSpace("disabled", "");
        spaceManager49.addParkingLot("hi!");
        java.lang.String str60 = spaceManager49.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap61 = spaceManager49.getParkingLots();
        cSVManager14.saveParkingLots(strMap61);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade63 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str66 = parkingSpaceFacade63.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager67 = parkingSpaceFacade63.getSpaceManager();
        spaceManager67.addParkingLot("hi!");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap70 = spaceManager67.getParkingLots();
        cSVManager14.saveParkingLots(strMap70);
        cSVManager0.loadParkingLots(strMap70);
        java.lang.String[] strArray73 = cSVManager0.loadSuperManager();
        java.util.List<java.lang.String[]> strArrayList75 = cSVManager0.readCSV("86z9Z9e0MN");
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
        org.junit.Assert.assertNotNull(strArrayList16);
        org.junit.Assert.assertNotNull(strArrayList18);
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(manager26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "disabled" + "'", str55, "disabled");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "disabled" + "'", str60, "disabled");
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "disabled" + "'", str66, "disabled");
        org.junit.Assert.assertNotNull(spaceManager67);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNotNull(strArray73);
// flaky "45) test3415(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArrayList75);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        ParkingSystem.Booking booking4 = null;
        boolean boolean5 = parkingLot1.assignBooking((int) (short) 1, booking4);
        parkingLot1.removeBooking((int) (short) 0);
        parkingLot1.removeBooking(10);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot1.getParkingSpace(32);
        boolean boolean12 = parkingSpace11.isAvailable();
        int int13 = parkingSpace11.getSpaceId();
        boolean boolean14 = parkingSpace11.isAvailable();
        ParkingSystem.Booking booking15 = parkingSpace11.getCurrentBooking();
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(booking15);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        boolean boolean8 = parkingLotIterator7.hasNext();
        ParkingSystem.ParkingSpace parkingSpace9 = parkingLotIterator7.next();
        ParkingSystem.SpaceManager spaceManager10 = new ParkingSystem.SpaceManager();
        boolean boolean13 = spaceManager10.isSpaceAvailable("hi!", (int) '#');
        spaceManager10.toggleLot("disabled", false);
        ParkingSystem.Booking booking26 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean27 = spaceManager10.assignBooking("empty", (int) (short) 0, booking26);
        ParkingSystem.SpaceManager spaceManager30 = new ParkingSystem.SpaceManager();
        boolean boolean33 = spaceManager30.isSpaceAvailable("hi!", (int) '#');
        spaceManager30.toggleLot("disabled", false);
        ParkingSystem.Booking booking46 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean47 = spaceManager30.assignBooking("empty", (int) (short) 0, booking46);
        boolean boolean48 = spaceManager10.assignBooking("disabled", (int) (byte) 0, booking46);
        boolean boolean49 = parkingSpace9.assignBooking(booking46);
        booking46.setDuration((-1));
        booking46.setStartTime("jane");
        int int54 = booking46.getDuration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        boolean boolean7 = parkingSpaceFacade0.extendBooking("Paid $ 0.0 with Mobile Pay", 0);
        boolean boolean9 = parkingSpaceFacade0.checkIn("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f");
        parkingSpaceFacade0.toggleSpace("cf448544-0e6d-4a41-94c2-e67f848ae8df", "4c45f11e-b09a-4d81-adf1-86cfd519dc3c", true);
        boolean boolean16 = parkingSpaceFacade0.extendBooking("Refunded total cost of $1.0", 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy10 = new ParkingSystem.ParkingSpaceProxy();
        client0.assignProxy(parkingSpaceProxy10);
        ParkingSystem.AccountRegistry accountRegistry12 = parkingSpaceProxy10.getRegistry();
        parkingSpaceProxy10.toggleLot("e8686ac8-1df7-4a9b-b299-8fbcdd585528", true);
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "02659ad3-0b5c-4c48-a915-a466f2b50775" + "'", str1, "02659ad3-0b5c-4c48-a915-a466f2b50775");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(accountRegistry12);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        double double5 = bookingManager3.getHourlyRate("jane");
        ParkingSystem.MobilePay mobilePay6 = new ParkingSystem.MobilePay();
        bookingManager3.setPaymentStrategy((ParkingSystem.Strategy) mobilePay6);
        double double10 = bookingManager3.calculateCost("CLT-c3ce9a25-7555-430c-9330-9203c36530f8", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 60.0d + "'", double10 == 60.0d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry12 = superManager11.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry15 = parkingSpaceProxy14.getRegistry();
        boolean boolean21 = parkingSpaceProxy14.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean25 = parkingSpaceProxy14.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean35 = parkingSpaceProxy14.confirmBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff", "disabled", (int) (short) 0, "Paid $ 100.0 with Mobile Pay", (int) (short) 10, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        accountRegistry12.assignProxyToManager("empty", parkingSpaceProxy14);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy38 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade39 = parkingSpaceProxy38.getFacade();
        accountRegistry12.assignProxyToManager("", parkingSpaceProxy38);
        parkingSpaceProxy38.addParkingLot("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        boolean boolean44 = parkingSpaceProxy38.cancelBooking("Paid $ 0.0 with Mobile Pay");
        boolean boolean54 = parkingSpaceProxy38.confirmBooking("13b04414-31a5-407f-8ea3-fba4613c73d1", "hi!", "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "staff", (int) 'a', "Refunded total cost of $-1.0", (-1), "hi!", "8ca2ec61-774c-409d-89d5-5b9171b40497");
        boolean boolean64 = parkingSpaceProxy38.confirmBooking("433f3d1f-f758-4ae3-972b-7fb179aedfd7", "CLT-b6a8264c-f386-4429-b59c-b7f465002e13", "CLT-d2153556-bc61-49e7-b73d-6af2a45e5167", "pass", (int) (byte) 0, "pass", (int) 'a', "13b04414-31a5-407f-8ea3-fba4613c73d1", "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.Client client3 = ParkingSystem.Client.getInstance();
        java.lang.String str4 = client3.getName();
        client3.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy7 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry8 = parkingSpaceProxy7.getRegistry();
        boolean boolean10 = parkingSpaceProxy7.checkIn("");
        client3.assignProxy(parkingSpaceProxy7);
        boolean boolean12 = client3.cancelBooking();
        java.lang.String str13 = client3.getExtraId();
        java.lang.String str14 = client3.getName();
        client3.setClientInfo("pass", "empty", "Jane", "pass", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", false);
        cSVManager0.saveClient(client3);
        ParkingSystem.Client client24 = ParkingSystem.Client.getInstance();
        java.lang.String str25 = client24.getName();
        client24.setValidated(true);
        ParkingSystem.Booking booking28 = client24.getBookingDetails();
        java.lang.String str29 = client24.getUsername();
        java.lang.String str30 = client24.getUsername();
        ParkingSystem.Booking booking31 = client24.getBookingDetails();
        cSVManager0.saveClient(client24);
        java.util.List<java.lang.String[]> strArrayList34 = cSVManager0.readCSV("CLT-6bf41de3-8b5a-4cee-8fc7-f8abc4e5b750");
        org.junit.Assert.assertNotNull(strArray1);
// flaky "46) test3422(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "26) test3422(RegressionTest6)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "empty" + "'", str4, "empty");
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "jane" + "'", str13, "jane");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "empty" + "'", str14, "empty");
        org.junit.Assert.assertNotNull(client24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "empty" + "'", str25, "empty");
        org.junit.Assert.assertNull(booking28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Jane" + "'", str29, "Jane");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Jane" + "'", str30, "Jane");
        org.junit.Assert.assertNull(booking31);
        org.junit.Assert.assertNotNull(strArrayList34);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj4 = parkingSpaceProxy1.login("empty", "Jane");
        parkingSpaceProxy1.validateClient("Jane");
        parkingSpaceProxy1.toggleSpace("", "staff", false);
        boolean boolean12 = parkingSpaceProxy1.cancelBooking("");
        user0.assignProxy(parkingSpaceProxy1);
        ParkingSystem.Booking booking15 = parkingSpaceProxy1.getBookingDetails("hi!");
        java.lang.String str18 = parkingSpaceProxy1.scanSpace("CLT-f5f3129f-6f77-4a04-a68b-486f89449455", "");
        boolean boolean20 = parkingSpaceProxy1.cancelBooking("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(booking15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking15 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean16 = parkingLot1.assignBooking((int) (short) -1, booking15);
        java.lang.String str17 = booking15.getLotId();
        java.lang.String str18 = booking15.getLicensePlate();
        int int19 = booking15.getDuration();
        booking15.setDuration(52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "jane" + "'", str17, "jane");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }
}
