package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        ParkingSystem.Client.reset();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        ParkingSystem.Disabled disabled0 = new ParkingSystem.Disabled();
        java.lang.Class<?> wildcardClass1 = disabled0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotIterator2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        boolean boolean6 = spaceManager0.isSpaceAvailable("disabled", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        ParkingSystem.Manager.reset();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        ParkingSystem.AccountRegistry accountRegistry0 = new ParkingSystem.AccountRegistry();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry0.loadClientsFromCSV();
// flaky "1) test0006(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry3.loadClientsFromCSV();
// flaky "2) test0007(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        java.lang.String str2 = client0.getPassword();
        java.lang.Class<?> wildcardClass3 = client0.getClass();
        org.junit.Assert.assertNotNull(client0);
// flaky "3) test0008(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
// flaky "1) test0008(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pass" + "'", str2, "pass");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        ParkingSystem.SuperManager.reset();
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = cSVManager0.loadManagers();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList2 = cSVManager0.loadClients();
// flaky "4) test0010(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerList1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        // The following exception was thrown during execution in test generation
        try {
            ParkingSystem.ParkingSpace parkingSpace3 = parkingLotIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotIterator2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        double double5 = bookingManager0.getDeposit("hi!");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("hi!", "disabled", "hi!");
        java.lang.String str5 = manager0.getPassword();
        org.junit.Assert.assertNotNull(manager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("hi!", "disabled", "hi!");
        java.lang.String str5 = manager0.getManagerId();
        manager0.setManagerInfo("jane", "", "");
        org.junit.Assert.assertNotNull(manager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        client0.setValidated(true);
        org.junit.Assert.assertNotNull(client0);
// flaky "5) test0015(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        accountRegistry8.loadManagersFromCSV();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry8.loadClientsFromCSV();
// flaky "6) test0016(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.paymentMessage = "staff";
        java.lang.Class<?> wildcardClass3 = paymentManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = cSVManager0.loadManagers();
        ParkingSystem.Manager manager2 = ParkingSystem.Manager.getInstance();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = null;
        manager2.assignProxy(parkingSpaceProxy3);
        cSVManager0.saveManager(manager2);
        // The following exception was thrown during execution in test generation
        try {
            manager2.validateClient("Jane");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.ParkingSpaceProxy.validateClient(String)\" because \"this.parkingProxy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerList1);
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkIn("staff");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        boolean boolean2 = parkingSpaceProxy0.checkOut("staff");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        accountRegistry6.validateClient("staff");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.saveParkingLots(strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.values()\" because \"parkingLots\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
// flaky "7) test0022(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        java.lang.String str2 = client0.getClientId();
        boolean boolean5 = false; // flaky "8) test0023(RegressionTest0)": client0.editBooking("empty", (int) 'a');
        org.junit.Assert.assertNotNull(client0);
// flaky "2) test0023(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "disabled" + "'", str1, "disabled");
// flaky "1) test0023(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLT-30fd593b-dedd-41b3-a919-c48700301f41" + "'", str2, "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy13 = null;
        client0.assignProxy(parkingSpaceProxy13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = client0.extendBooking((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.ParkingSpaceProxy.extendBooking(String, int)\" because \"this.parkingProxy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(client0);
// flaky "9) test0024(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry3.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = null; // flaky "10) test0026(RegressionTest0)": cSVManager0.loadManagers();
        ParkingSystem.Manager manager2 = ParkingSystem.Manager.getInstance();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = null;
        manager2.assignProxy(parkingSpaceProxy3);
        cSVManager0.saveManager(manager2);
        java.lang.String str6 = manager2.getName();
// flaky "3) test0026(RegressionTest0)":         org.junit.Assert.assertNotNull(managerList1);
        org.junit.Assert.assertNotNull(manager2);
// flaky "2) test0026(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.paymentMessage = "staff";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (short) 0);
        boolean boolean6 = paymentManager0.refundTotalCost((double) (byte) 100);
        boolean boolean8 = paymentManager0.refundTotalCost((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        ParkingSystem.Manager manager7 = accountRegistry3.autoGenerateManager();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry3.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("hi!", (-1.0d), "", "");
        boolean boolean10 = mobilePay0.processPayment("staff", (double) (-1L), "disabled", "pass");
        java.lang.String str11 = mobilePay0.getPaymentMessage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str11, "Paid $ -1.0 with Mobile Pay");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        ParkingSystem.Booking booking16 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean17 = spaceManager0.assignBooking("empty", (int) (short) 0, booking16);
        boolean boolean18 = booking16.isCheckedIn();
        java.lang.String str19 = booking16.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime20 = booking16.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Jane' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        ParkingSystem.Manager manager7 = accountRegistry3.autoGenerateManager();
        java.lang.String str8 = manager7.getManagerId();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
// flaky "11) test0031(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str8, "2afd610d-a8cb-413a-bbee-7927f86b526c");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = null; // flaky "12) test0032(RegressionTest0)": cSVManager0.loadManagers();
        ParkingSystem.Client client2 = ParkingSystem.Client.getInstance();
        cSVManager0.saveClient(client2);
        boolean boolean4 = false; // flaky "4) test0032(RegressionTest0)": client2.checkIn();
        boolean boolean7 = false; // flaky "3) test0032(RegressionTest0)": client2.editBooking("2afd610d-a8cb-413a-bbee-7927f86b526c", (int) (byte) 0);
// flaky "1) test0032(RegressionTest0)":         org.junit.Assert.assertNotNull(managerList1);
        org.junit.Assert.assertNotNull(client2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        java.lang.String str2 = client0.getClientId();
        java.lang.String str3 = client0.getName();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean6 = parkingSpaceFacade0.extendBooking("disabled", 0);
        boolean boolean16 = parkingSpaceFacade0.confirmBooking("Paid $ -1.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", "staff", "Jane", (-1), "pass", (int) (short) 100, "", "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager1 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleLot("hi!", false);
        boolean boolean8 = parkingSpaceFacade0.editBooking("", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) 100);
        org.junit.Assert.assertNotNull(spaceManager1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking15 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean16 = parkingLot1.assignBooking((int) (short) -1, booking15);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime17 = booking15.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Jane' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.saveParkingLots(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.values()\" because \"parkingLots\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        int int7 = accountRegistry3.getManagersSize();
// flaky "13) test0038(RegressionTest0)":         accountRegistry3.loadManagersFromCSV();
        boolean boolean10 = accountRegistry3.requiresValidation("hi!");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = null; // flaky "14) test0039(RegressionTest0)": cSVManager0.loadManagers();
        ParkingSystem.Client client2 = ParkingSystem.Client.getInstance();
        cSVManager0.saveClient(client2);
        ParkingSystem.Client client4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.saveClient(client4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.Client.getClientId()\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "5) test0039(RegressionTest0)":         org.junit.Assert.assertNotNull(managerList1);
        org.junit.Assert.assertNotNull(client2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        parkingSpaceProxy0.toggleSpace("", "staff", false);
        boolean boolean11 = parkingSpaceProxy0.cancelBooking("");
        parkingSpaceProxy0.toggleLot("Paid $ 10.0 with Mobile Pay", true);
        parkingSpaceProxy0.toggleSpace("Paid $ 10.0 with Mobile Pay", "pass", false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry1.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountRegistry1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = null; // flaky "15) test0042(RegressionTest0)": cSVManager0.loadManagers();
        ParkingSystem.Client client2 = ParkingSystem.Client.getInstance();
        cSVManager0.saveClient(client2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList4 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "6) test0042(RegressionTest0)":         org.junit.Assert.assertNotNull(managerList1);
        org.junit.Assert.assertNotNull(client2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        java.lang.Class<?> wildcardClass52 = disabled0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = null; // flaky "16) test0044(RegressionTest0)": cSVManager0.loadManagers();
        ParkingSystem.Manager manager2 = ParkingSystem.Manager.getInstance();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = null;
        manager2.assignProxy(parkingSpaceProxy3);
        cSVManager0.saveManager(manager2);
        cSVManager0.updateClientValidation("Jane", true);
        java.util.List<java.lang.String[]> strArrayList10 = cSVManager0.readCSV("staff");
        java.util.List<java.lang.String[]> strArrayList12 = cSVManager0.readCSV("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
// flaky "7) test0044(RegressionTest0)":         org.junit.Assert.assertNotNull(managerList1);
        org.junit.Assert.assertNotNull(manager2);
        org.junit.Assert.assertNotNull(strArrayList10);
        org.junit.Assert.assertNotNull(strArrayList12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("hi!", "disabled", "hi!");
        java.lang.String str5 = manager0.getManagerId();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = null;
        manager0.assignProxy(parkingSpaceProxy6);
        // The following exception was thrown during execution in test generation
        try {
            manager0.displayPendingValidations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.ParkingSpaceProxy.displayPendingValidations()\" because \"this.parkingProxy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(manager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator3 = parkingLot1.getIterator();
        boolean boolean4 = parkingLotIterator3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            ParkingSystem.ParkingSpace parkingSpace5 = parkingLotIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertNotNull(parkingLotIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        java.lang.Class<?> wildcardClass1 = mobilePay0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = null; // flaky "17) test0048(RegressionTest0)": cSVManager0.loadManagers();
        ParkingSystem.Client client2 = ParkingSystem.Client.getInstance();
        cSVManager0.saveClient(client2);
        java.lang.String str4 = client2.getExtraId();
        boolean boolean5 = false; // flaky "8) test0048(RegressionTest0)": client2.cancelBooking();
// flaky "4) test0048(RegressionTest0)":         org.junit.Assert.assertNotNull(managerList1);
        org.junit.Assert.assertNotNull(client2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "2) test0048(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        java.util.List<ParkingSystem.Manager> managerList14 = null; // flaky "18) test0049(RegressionTest0)": cSVManager0.loadManagers();
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
// flaky "9) test0049(RegressionTest0)":         org.junit.Assert.assertNotNull(managerList14);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.validateClient("Jane");
        parkingSpaceProxy3.toggleSpace("", "staff", false);
        accountRegistry1.assignProxyToManager("pass", parkingSpaceProxy3);
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry1.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = null; // flaky "19) test0051(RegressionTest0)": cSVManager0.loadManagers();
        ParkingSystem.Manager manager2 = ParkingSystem.Manager.getInstance();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = null;
        manager2.assignProxy(parkingSpaceProxy3);
        cSVManager0.saveManager(manager2);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = null;
        cSVManager0.loadParkingLots(strMap6);
// flaky "10) test0051(RegressionTest0)":         org.junit.Assert.assertNotNull(managerList1);
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        boolean boolean24 = bookingManager0.confirmBooking("Paid $ 10.0 with Mobile Pay", "empty", "empty", "Paid $ 10.0 with Mobile Pay", 0, "Jane", (int) 'a', "Jane", "empty");
        boolean boolean34 = bookingManager0.confirmBooking("empty", "hi!", "Paid $ 10.0 with Mobile Pay", "staff", (int) (byte) -1, "staff", (int) (short) 10, "empty", "Paid $ -1.0 with Mobile Pay");
        ParkingSystem.Booking booking36 = bookingManager0.getBooking("empty");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(booking36);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<ParkingSystem.Manager> managerList1 = null; // flaky "20) test0053(RegressionTest0)": cSVManager0.loadManagers();
        ParkingSystem.Manager manager2 = ParkingSystem.Manager.getInstance();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = null;
        manager2.assignProxy(parkingSpaceProxy3);
        cSVManager0.saveManager(manager2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList6 = cSVManager0.loadManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "11) test0053(RegressionTest0)":         org.junit.Assert.assertNotNull(managerList1);
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        int int7 = accountRegistry3.getManagersSize();
        boolean boolean13 = accountRegistry3.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        java.util.List<ParkingSystem.Client> clientList14 = accountRegistry3.displayPendingValidations();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry3.loadManagersFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(clientList14);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.saveParkingLots(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.values()\" because \"parkingLots\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        java.lang.String str50 = booking46.getStartTime();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Jane" + "'", str50, "Jane");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList2 = cSVManager0.loadManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
// flaky "21) test0057(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        checkInManager1.refundMessage = "disabled";
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        ParkingSystem.Booking booking16 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean17 = spaceManager0.assignBooking("empty", (int) (short) 0, booking16);
        ParkingSystem.SpaceManager spaceManager20 = new ParkingSystem.SpaceManager();
        boolean boolean23 = spaceManager20.isSpaceAvailable("hi!", (int) '#');
        spaceManager20.toggleLot("disabled", false);
        ParkingSystem.Booking booking36 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean37 = spaceManager20.assignBooking("empty", (int) (short) 0, booking36);
        boolean boolean38 = spaceManager0.assignBooking("disabled", (int) (byte) 0, booking36);
        booking36.setStartTime("Jane");
        double double41 = booking36.getTotalCost();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        boolean boolean7 = parkingSpaceProxy0.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean11 = parkingSpaceProxy0.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean14 = parkingSpaceProxy0.extendBooking("", 0);
        parkingSpaceProxy0.displayPendingValidations();
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean10 = parkingSpaceFacade0.confirmBooking("staff", "", "disabled", "hi!", (int) 'a', "jane", (int) 'a', "hi!", "");
        boolean boolean12 = parkingSpaceFacade0.checkIn("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        java.lang.String str12 = parkingSpace10.scanSpace();
        parkingSpace10.removeBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "empty" + "'", str12, "empty");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("hi!", "disabled", "hi!");
        java.lang.String str5 = manager0.getManagerId();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = null;
        manager0.assignProxy(parkingSpaceProxy6);
        java.lang.String str8 = manager0.getManagerId();
        java.lang.Class<?> wildcardClass9 = manager0.getClass();
        org.junit.Assert.assertNotNull(manager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("hi!", "disabled", "hi!");
        manager0.setManagerInfo("2afd610d-a8cb-413a-bbee-7927f86b526c", "Paid $ 10.0 with Mobile Pay", "Jane");
        org.junit.Assert.assertNotNull(manager0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        boolean boolean13 = parkingSpaceProxy10.cancelBooking("Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client0);
// flaky "22) test0065(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        boolean boolean7 = parkingSpaceProxy0.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean11 = parkingSpaceProxy0.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        parkingSpaceProxy0.toggleLot("Paid $ -1.0 with Mobile Pay", false);
        boolean boolean18 = parkingSpaceProxy0.editBooking("empty", "Paid $ -1.0 with Mobile Pay", (int) (byte) -1);
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        checkInManager1.refundMessage = "";
        java.lang.String str4 = checkInManager1.refundMessage;
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean10 = parkingSpaceProxy4.checkIn("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        org.junit.Assert.assertNotNull(client0);
// flaky "23) test0068(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        boolean boolean13 = client0.getIsValidated();
        boolean boolean21 = client0.confirmBooking("hi!", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "Paid $ 100.0 with Mobile Pay", (-1), "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "empty");
        boolean boolean29 = client0.confirmBooking("empty", "staff", 32, "Paid $ 100.0 with Mobile Pay", (int) ' ', "pass", "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertNotNull(client0);
// flaky "24) test0069(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        client0.setClientInfo("2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "hi!", "staff", "pass", "", true);
        org.junit.Assert.assertNotNull(client0);
// flaky "25) test0070(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        ParkingSystem.Booking booking6 = null;
        boolean boolean7 = parkingLot1.assignBooking(1, booking6);
        ParkingSystem.ParkingLotIterator parkingLotIterator8 = parkingLot1.getIterator();
        ParkingSystem.ParkingSpace parkingSpace9 = parkingLotIterator8.next();
        int int10 = parkingSpace9.getSpaceId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator8);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        boolean boolean35 = parkingSpace10.isAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList5 = cSVManager0.loadManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.Manager manager15 = superManager4.autoGenerateManager();
        org.junit.Assert.assertNotNull(superManager4);
// flaky "26) test0074(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(manager15);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj9 = parkingSpaceProxy6.login("empty", "Jane");
        parkingSpaceProxy6.validateClient("Jane");
        parkingSpaceProxy6.toggleSpace("", "staff", false);
        accountRegistry4.assignProxyToManager("pass", parkingSpaceProxy6);
        ParkingSystem.Client client18 = accountRegistry4.getClient("");
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry4);
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry4.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(client18);
        org.junit.Assert.assertNotNull(superManager19);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        ParkingSystem.Booking booking15 = parkingSpace10.getCurrentBooking();
        parkingSpace10.removeBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "empty" + "'", str13, "empty");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(booking15);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.toggleLot("Jane", false);
        spaceManager0.removeBooking("disabled", 10);
        ParkingSystem.SpaceManager spaceManager9 = new ParkingSystem.SpaceManager();
        boolean boolean12 = spaceManager9.isSpaceAvailable("hi!", (int) '#');
        spaceManager9.toggleLot("disabled", false);
        ParkingSystem.Booking booking25 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean26 = spaceManager9.assignBooking("empty", (int) (short) 0, booking25);
        boolean boolean27 = spaceManager0.assignBooking("hi!", 0, booking25);
        double double28 = booking25.getTotalCost();
        booking25.setDuration((-1));
        java.lang.String str31 = booking25.getLotId();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime32 = booking25.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Jane' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "jane" + "'", str31, "jane");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj4 = parkingSpaceProxy1.login("empty", "Jane");
        parkingSpaceProxy1.validateClient("Jane");
        parkingSpaceProxy1.toggleSpace("", "staff", false);
        boolean boolean12 = parkingSpaceProxy1.cancelBooking("");
        user0.assignProxy(parkingSpaceProxy1);
        java.lang.Object obj16 = user0.login("staff", "Card number should be 16 digits");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        double double7 = bookingManager0.getDeposit("staff");
        boolean boolean11 = bookingManager0.editBooking("", "Paid $ -1.0 with Mobile Pay", (int) 'a');
        boolean boolean16 = bookingManager0.extendBooking("staff", (-1), "hi!", "pass");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        boolean boolean4 = parkingSpaceFacade0.cancelBooking("jane");
        boolean boolean7 = parkingSpaceFacade0.extendBooking("hi!", (-1));
        ParkingSystem.Booking booking9 = parkingSpaceFacade0.getBookingDetails("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(booking9);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("Paid $ 100.0 with Mobile Pay", "Jane", "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        manager0.setManagerInfo("Jane", "pass", "disabled");
        org.junit.Assert.assertNotNull(manager0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        java.lang.String str11 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        ParkingSystem.Booking booking14 = null;
        boolean boolean15 = spaceManager0.assignBooking("", 100, booking14);
        spaceManager0.toggleSpace("", "Paid $ -1.0 with Mobile Pay", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        java.lang.String str11 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        ParkingSystem.Booking booking14 = null;
        boolean boolean15 = spaceManager0.assignBooking("", 100, booking14);
        spaceManager0.addParkingLot("pass");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry12.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(client0);
// flaky "27) test0084(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(accountRegistry12);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("disabled", 10.0d, "disabled", "disabled");
        boolean boolean10 = mobilePay0.processPayment("jane", 15.0d, "jane", "");
        boolean boolean15 = mobilePay0.processPayment("Paid $ 100.0 with Mobile Pay", (double) (short) 0, "Jane", "Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList3 = cSVManager0.loadManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("hi!", (-1.0d), "", "");
        boolean boolean10 = mobilePay0.processPayment("hi!", (double) 100, "jane", "disabled");
        boolean boolean15 = mobilePay0.processPayment("2afd610d-a8cb-413a-bbee-7927f86b526c", (double) 10.0f, "staff", "empty");
        boolean boolean20 = mobilePay0.processPayment("Paid $ 100.0 with Mobile Pay", (double) (short) 0, "Paid $ -1.0 with Mobile Pay", "Jane");
        java.lang.String str21 = mobilePay0.getPaymentMessage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str21, "Paid $ 0.0 with Mobile Pay");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        double double5 = bookingManager0.getDeposit("hi!");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator28.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "jane" + "'", str26, "jane");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator28);
        org.junit.Assert.assertNotNull(parkingSpace29);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        ParkingSystem.Disabled disabled48 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace49 = null;
        java.lang.String str50 = disabled48.scanSpace(parkingSpace49);
        ParkingSystem.ParkingSpace parkingSpace51 = null;
        java.lang.String str52 = disabled48.scanSpace(parkingSpace51);
        ParkingSystem.ParkingLot parkingLot54 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking56 = null;
        boolean boolean57 = parkingLot54.assignBooking(0, booking56);
        boolean boolean59 = parkingLot54.isSpaceAvailable((int) '#');
        boolean boolean61 = parkingLot54.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace63 = parkingLot54.getParkingSpace((int) (byte) 10);
        int int64 = parkingSpace63.getSpaceId();
        ParkingSystem.Booking booking65 = parkingSpace63.getCurrentBooking();
        java.lang.String str66 = parkingSpace63.scanSpace();
        ParkingSystem.Enabled enabled67 = new ParkingSystem.Enabled();
        parkingSpace63.setState((ParkingSystem.SpaceState) enabled67);
        java.lang.String str69 = disabled48.scanSpace(parkingSpace63);
        java.lang.String str70 = enabled0.scanSpace(parkingSpace63);
        ParkingSystem.ParkingLot parkingLot72 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking74 = null;
        boolean boolean75 = parkingLot72.assignBooking(0, booking74);
        boolean boolean77 = parkingLot72.isSpaceAvailable((int) '#');
        boolean boolean79 = parkingLot72.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace81 = parkingLot72.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking82 = parkingSpace81.getCurrentBooking();
        java.lang.String str83 = parkingSpace81.scanSpace();
        int int84 = parkingSpace81.getSpaceId();
        parkingSpace81.removeBooking();
        java.lang.String str86 = enabled0.scanSpace(parkingSpace81);
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "disabled" + "'", str50, "disabled");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "disabled" + "'", str52, "disabled");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(parkingSpace63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNull(booking65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "empty" + "'", str66, "empty");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "disabled" + "'", str69, "disabled");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "empty" + "'", str70, "empty");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(parkingSpace81);
        org.junit.Assert.assertNull(booking82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "empty" + "'", str83, "empty");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "empty" + "'", str86, "empty");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        cSVManager0.updateClientValidation("empty", false);
        ParkingSystem.Client client4 = ParkingSystem.Client.getInstance();
        java.lang.String str5 = client4.getName();
        client4.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy14 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry15 = parkingSpaceProxy14.getRegistry();
        boolean boolean17 = parkingSpaceProxy14.checkIn("");
        client4.assignProxy(parkingSpaceProxy14);
        cSVManager0.saveClient(client4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList20 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(client4);
// flaky "28) test0091(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jane" + "'", str5, "jane");
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        checkInManager1.refundMessage = "Jane";
        org.junit.Assert.assertNotNull(checkInManager1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean10 = parkingSpaceFacade0.confirmBooking("staff", "", "disabled", "hi!", (int) 'a', "jane", (int) 'a', "hi!", "");
        parkingSpaceFacade0.addParkingLot("Refunded without deposit ($0.0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        java.lang.String str9 = superManager4.getManagerId();
// flaky "29) test0094(RegressionTest0)":         superManager4.validateClient("Refunded total cost of $1.0");
        org.junit.Assert.assertNotNull(superManager4);
// flaky "12) test0094(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
// flaky "5) test0094(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
// flaky "3) test0094(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str9, "Paid $ 0.0 with Mobile Pay");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotIterator2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        java.util.List<java.lang.String[]> strArrayList8 = cSVManager0.readCSV("Paid $ -1.0 with Mobile Pay");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList9 = cSVManager0.loadManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(strArrayList8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        ParkingSystem.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.saveClient(client14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.Client.getClientId()\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        ParkingSystem.Booking booking16 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean17 = spaceManager0.assignBooking("empty", (int) (short) 0, booking16);
        boolean boolean18 = booking16.isCheckedIn();
        java.lang.String str19 = booking16.getLicensePlate();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime20 = booking16.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Jane' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.BookingManager bookingManager1 = parkingSpaceFacade0.getBookingManager();
        boolean boolean3 = bookingManager1.cancelBooking("pass");
        org.junit.Assert.assertNotNull(bookingManager1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("disabled", 10.0d, "disabled", "disabled");
        java.lang.String str6 = mobilePay0.getPaymentMessage();
        java.lang.String str7 = mobilePay0.getPaymentMessage();
        boolean boolean12 = mobilePay0.processPayment("Paid $ 10.0 with Mobile Pay", (double) (byte) -1, "staff", "staff");
        boolean boolean17 = mobilePay0.processPayment("pass", (double) '#', "disabled", "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str6, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str7, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.validateClient("Jane");
        parkingSpaceProxy3.toggleSpace("", "staff", false);
        accountRegistry1.assignProxyToManager("pass", parkingSpaceProxy3);
        ParkingSystem.Client client15 = accountRegistry1.getClient("");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry1.loadManagersFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(client15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry7.loadManagersFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
// flaky "30) test0102(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str5, "Paid $ -1.0 with Mobile Pay");
// flaky "13) test0102(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str6, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.BookingManager bookingManager1 = parkingSpaceFacade0.getBookingManager();
        ParkingSystem.SpaceManager spaceManager2 = bookingManager1.getSpaceManager();
        ParkingSystem.Booking booking5 = null;
        boolean boolean6 = spaceManager2.assignBooking("pass", 10, booking5);
        org.junit.Assert.assertNotNull(bookingManager1);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.paymentMessage = "staff";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (short) 0);
        boolean boolean6 = paymentManager0.refundTotalCost((double) (byte) 100);
        boolean boolean11 = paymentManager0.processPayment("Card number should be 16 digits", (double) 0, "Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($0.0)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = parkingSpaceProxy0.getFacade();
        ParkingSystem.CheckInManager checkInManager2 = parkingSpaceFacade1.getCheckInManager();
        boolean boolean4 = checkInManager2.checkIn("Paid $ -1.0 with Mobile Pay");
        boolean boolean6 = checkInManager2.checkIn("Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(parkingSpaceFacade1);
        org.junit.Assert.assertNotNull(checkInManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("disabled", 10.0d, "disabled", "disabled");
        java.lang.String str6 = mobilePay0.getPaymentMessage();
        java.lang.String str7 = mobilePay0.getPaymentMessage();
        boolean boolean12 = mobilePay0.processPayment("pass", 0.0d, "empty", "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str6, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str7, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        ParkingSystem.Booking booking6 = null;
        boolean boolean7 = parkingLot1.assignBooking(1, booking6);
        ParkingSystem.ParkingLotIterator parkingLotIterator8 = parkingLot1.getIterator();
        boolean boolean9 = parkingLotIterator8.hasNext();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        java.lang.Object obj32 = accountRegistry15.login("", "Refunded total cost of $1.0");
        accountRegistry15.validateClient("Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager4);
// flaky "31) test0108(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str5, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(manager16);
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        java.lang.String str12 = parkingSpace10.scanSpace();
        ParkingSystem.SpaceState spaceState13 = parkingSpace10.getState();
        ParkingSystem.Enabled enabled14 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot16 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking18 = null;
        boolean boolean19 = parkingLot16.assignBooking(0, booking18);
        boolean boolean21 = parkingLot16.isSpaceAvailable((int) '#');
        boolean boolean23 = parkingLot16.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace25 = parkingLot16.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking26 = parkingSpace25.getCurrentBooking();
        parkingSpace25.removeBooking();
        java.lang.String str28 = enabled14.scanSpace(parkingSpace25);
        ParkingSystem.ParkingLot parkingLot30 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking32 = null;
        boolean boolean33 = parkingLot30.assignBooking(0, booking32);
        boolean boolean35 = parkingLot30.isSpaceAvailable((int) '#');
        boolean boolean37 = parkingLot30.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace39 = parkingLot30.getParkingSpace((int) (byte) 10);
        int int40 = parkingSpace39.getSpaceId();
        ParkingSystem.Booking booking41 = parkingSpace39.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager42 = new ParkingSystem.SpaceManager();
        boolean boolean45 = spaceManager42.isSpaceAvailable("hi!", (int) '#');
        spaceManager42.toggleLot("disabled", false);
        ParkingSystem.Booking booking58 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean59 = spaceManager42.assignBooking("empty", (int) (short) 0, booking58);
        boolean boolean60 = parkingSpace39.assignBooking(booking58);
        java.lang.String str61 = enabled14.scanSpace(parkingSpace39);
        ParkingSystem.ParkingLot parkingLot63 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking65 = null;
        boolean boolean66 = parkingLot63.assignBooking(0, booking65);
        boolean boolean68 = parkingLot63.isSpaceAvailable((int) '#');
        boolean boolean70 = parkingLot63.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace72 = parkingLot63.getParkingSpace((int) (byte) 10);
        int int73 = parkingSpace72.getSpaceId();
        ParkingSystem.Booking booking74 = parkingSpace72.getCurrentBooking();
        java.lang.String str75 = parkingSpace72.scanSpace();
        int int76 = parkingSpace72.getSpaceId();
        ParkingSystem.Booking booking77 = parkingSpace72.getCurrentBooking();
        java.lang.String str78 = enabled14.scanSpace(parkingSpace72);
        java.lang.String str79 = parkingSpace72.scanSpace();
        java.lang.String str80 = spaceState13.scanSpace(parkingSpace72);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "empty" + "'", str12, "empty");
        org.junit.Assert.assertNotNull(spaceState13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNull(booking26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "empty" + "'", str28, "empty");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNull(booking41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "disabled" + "'", str61, "disabled");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(parkingSpace72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertNull(booking74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "empty" + "'", str75, "empty");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertNull(booking77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "empty" + "'", str78, "empty");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "empty" + "'", str79, "empty");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "empty" + "'", str80, "empty");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str3 = parkingSpaceFacade0.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleLot("Refunded total cost of $1.0", false);
        ParkingSystem.SpaceManager spaceManager8 = parkingSpaceFacade0.getSpaceManager();
        boolean boolean12 = parkingSpaceFacade0.editBooking("", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        ParkingSystem.Booking booking16 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean17 = spaceManager0.assignBooking("empty", (int) (short) 0, booking16);
        boolean boolean18 = booking16.isCheckedIn();
        java.lang.String str19 = booking16.getClientId();
        java.lang.String str20 = booking16.getStartTime();
        double double21 = booking16.getTotalCost();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Jane" + "'", str20, "Jane");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        boolean boolean14 = client0.extendBooking((int) (short) -1);
        org.junit.Assert.assertNotNull(client0);
// flaky "32) test0112(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "14) test0112(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "6) test0112(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "4) test0112(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        boolean boolean7 = parkingSpaceProxy0.cancelBooking("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager2 = parkingSpaceFacade1.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager3 = parkingSpaceFacade1.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap4 = spaceManager3.getParkingLots();
        cSVManager0.loadParkingLots(strMap4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList6 = cSVManager0.loadManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(checkInManager2);
        org.junit.Assert.assertNotNull(spaceManager3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        ParkingSystem.ParkingLotIterator parkingLotIterator3 = parkingLot1.getIterator();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertNotNull(parkingLotIterator3);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean6 = bookingManager0.extendBooking("jane", (int) (byte) 100, "hi!", "jane");
        ParkingSystem.SpaceManager spaceManager7 = bookingManager0.getSpaceManager();
        boolean boolean12 = bookingManager0.extendBooking("Refunded without deposit ($0.0)", (int) (byte) 1, "hi!", "pass");
        boolean boolean14 = bookingManager0.cancelBooking("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(spaceManager7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = null;
        cSVManager0.loadParkingLots(strMap6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList8 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        paymentManager0.paymentMessage = "pass";
        boolean boolean10 = paymentManager0.processPayment("Refunded without deposit ($0.0)", (double) (short) 10, "Paid $ 10.0 with Mobile Pay", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        parkingLot1.setEnabled(true);
        boolean boolean7 = parkingLot1.isEnabled();
        ParkingSystem.ParkingSpace parkingSpace9 = parkingLot1.getParkingSpace(1);
        boolean boolean11 = parkingLot1.isSpaceAvailable(32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit17 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit17);
        java.lang.String str19 = debitOrCredit17.getPaymentMessage();
        boolean boolean24 = debitOrCredit17.processPayment("7aecb00c-028c-4dcf-96cc-14d25bd709ab", (double) (byte) 1, "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Paid $ 100.0 with Mobile Pay");
        java.lang.String str25 = debitOrCredit17.getPaymentMessage();
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Card number should be 16 digits" + "'", str25, "Card number should be 16 digits");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking15 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean16 = parkingLot1.assignBooking((int) (short) -1, booking15);
        int int17 = booking15.getSpaceId();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime18 = booking15.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Jane' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        cSVManager0.updateClientValidation("empty", false);
        java.util.List<java.lang.String[]> strArrayList5 = cSVManager0.readCSV("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList6 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getExtraId();
        boolean boolean3 = client0.checkOut();
        java.lang.String str4 = client0.getUsername();
        org.junit.Assert.assertNotNull(client0);
// flaky "33) test0123(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "staff" + "'", str1, "staff");
// flaky "15) test0123(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ST001" + "'", str2, "ST001");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "7) test0123(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jane" + "'", str4, "jane");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager1 = parkingSpaceFacade0.getSpaceManager();
        boolean boolean4 = spaceManager1.isSpaceAvailable("Jane", (int) 'a');
        spaceManager1.toggleSpace("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "2afd610d-a8cb-413a-bbee-7927f86b526c", true);
        org.junit.Assert.assertNotNull(spaceManager1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        booking46.setCheckedIn(false);
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
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        java.lang.String str4 = parkingSpaceProxy0.scanSpace("empty", "hi!");
        parkingSpaceProxy0.addParkingLot("empty");
        parkingSpaceProxy0.addParkingLot("");
        parkingSpaceProxy0.toggleLot("7aecb00c-028c-4dcf-96cc-14d25bd709ab", true);
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        client0.setClientInfo("", "Jane", "pass", "Refunded without deposit ($0.0)", "Paid $ 100.0 with Mobile Pay", "Jane", true);
        org.junit.Assert.assertNotNull(client0);
// flaky "34) test0127(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9701df9a-2178-4ad5-8076-46ff5f05b3e8" + "'", str1, "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("jane", "");
        spaceManager0.toggleLot("Jane", true);
        spaceManager0.toggleSpace("Paid $ -1.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj4 = parkingSpaceProxy1.login("empty", "Jane");
        parkingSpaceProxy1.validateClient("Jane");
        parkingSpaceProxy1.toggleSpace("", "staff", false);
        boolean boolean12 = parkingSpaceProxy1.cancelBooking("");
        user0.assignProxy(parkingSpaceProxy1);
        java.lang.String str16 = parkingSpaceProxy1.scanSpace("Refunded without deposit ($0.0)", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        java.lang.Object obj19 = parkingSpaceProxy1.login("jane", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "disabled" + "'", str16, "disabled");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        ParkingSystem.ParkingLot parkingLot12 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking14 = null;
        boolean boolean15 = parkingLot12.assignBooking(0, booking14);
        boolean boolean17 = parkingLot12.isSpaceAvailable((int) '#');
        boolean boolean19 = parkingLot12.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace21 = parkingLot12.getParkingSpace((int) (byte) 10);
        int int22 = parkingSpace21.getSpaceId();
        ParkingSystem.Booking booking23 = parkingSpace21.getCurrentBooking();
        java.lang.String str24 = parkingSpace21.scanSpace();
        ParkingSystem.Enabled enabled25 = new ParkingSystem.Enabled();
        parkingSpace21.setState((ParkingSystem.SpaceState) enabled25);
        ParkingSystem.Disabled disabled27 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace28 = null;
        java.lang.String str29 = disabled27.scanSpace(parkingSpace28);
        ParkingSystem.Enabled enabled30 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot32 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking34 = null;
        boolean boolean35 = parkingLot32.assignBooking(0, booking34);
        boolean boolean37 = parkingLot32.isSpaceAvailable((int) '#');
        boolean boolean39 = parkingLot32.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace41 = parkingLot32.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking42 = parkingSpace41.getCurrentBooking();
        parkingSpace41.removeBooking();
        java.lang.String str44 = enabled30.scanSpace(parkingSpace41);
        ParkingSystem.ParkingLot parkingLot46 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking48 = null;
        boolean boolean49 = parkingLot46.assignBooking(0, booking48);
        boolean boolean51 = parkingLot46.isSpaceAvailable((int) '#');
        boolean boolean53 = parkingLot46.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace55 = parkingLot46.getParkingSpace((int) (byte) 10);
        int int56 = parkingSpace55.getSpaceId();
        ParkingSystem.Booking booking57 = parkingSpace55.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager58 = new ParkingSystem.SpaceManager();
        boolean boolean61 = spaceManager58.isSpaceAvailable("hi!", (int) '#');
        spaceManager58.toggleLot("disabled", false);
        ParkingSystem.Booking booking74 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean75 = spaceManager58.assignBooking("empty", (int) (short) 0, booking74);
        boolean boolean76 = parkingSpace55.assignBooking(booking74);
        java.lang.String str77 = enabled30.scanSpace(parkingSpace55);
        java.lang.String str78 = disabled27.scanSpace(parkingSpace55);
        java.lang.String str79 = enabled25.scanSpace(parkingSpace55);
        parkingSpace10.setState((ParkingSystem.SpaceState) enabled25);
        ParkingSystem.SpaceState spaceState81 = parkingSpace10.getState();
        int int82 = parkingSpace10.getSpaceId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(booking23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "empty" + "'", str24, "empty");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "disabled" + "'", str29, "disabled");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertNull(booking42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "empty" + "'", str44, "empty");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(parkingSpace55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNull(booking57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "disabled" + "'", str77, "disabled");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "disabled" + "'", str78, "disabled");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "disabled" + "'", str79, "disabled");
        org.junit.Assert.assertNotNull(spaceState81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        ParkingSystem.SpaceManager spaceManager47 = new ParkingSystem.SpaceManager();
        boolean boolean50 = spaceManager47.isSpaceAvailable("hi!", (int) '#');
        spaceManager47.toggleLot("disabled", false);
        ParkingSystem.Booking booking63 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean64 = spaceManager47.assignBooking("empty", (int) (short) 0, booking63);
        ParkingSystem.SpaceManager spaceManager67 = new ParkingSystem.SpaceManager();
        boolean boolean70 = spaceManager67.isSpaceAvailable("hi!", (int) '#');
        spaceManager67.toggleLot("disabled", false);
        ParkingSystem.Booking booking83 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean84 = spaceManager67.assignBooking("empty", (int) (short) 0, booking83);
        boolean boolean85 = spaceManager47.assignBooking("disabled", (int) (byte) 0, booking83);
        boolean boolean86 = parkingSpace25.assignBooking(booking83);
        java.lang.String str87 = booking83.getLotId();
        boolean boolean88 = parkingSpace11.assignBooking(booking83);
        boolean boolean89 = booking83.isCheckedIn();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "jane" + "'", str87, "jane");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        ParkingSystem.Booking booking16 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean17 = spaceManager0.assignBooking("empty", (int) (short) 0, booking16);
        java.lang.String str18 = booking16.getClientId();
        java.lang.String str19 = booking16.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime20 = booking16.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Jane' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Jane" + "'", str19, "Jane");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        boolean boolean6 = parkingSpaceFacade0.cancelBooking("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        double double7 = bookingManager0.getDeposit("staff");
        boolean boolean11 = bookingManager0.editBooking("", "Paid $ -1.0 with Mobile Pay", (int) 'a');
        boolean boolean16 = bookingManager0.extendBooking("staff", (int) '#', "empty", "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap17 = bookingManager0.getActiveBookings();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.Manager manager5 = superManager4.autoGenerateManager();
        java.lang.String str6 = manager5.getManagerId();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(manager5);
// flaky "35) test0135(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "13b04414-31a5-407f-8ea3-fba4613c73d1" + "'", str6, "13b04414-31a5-407f-8ea3-fba4613c73d1");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean7 = parkingSpaceFacade0.editBooking("Card number should be 16 digits", "", (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = parkingSpaceFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade7 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager8 = parkingSpaceFacade7.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap9 = spaceManager8.getParkingLots();
        cSVManager0.loadParkingLots(strMap9);
        cSVManager0.updateClientValidation("pass", true);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager2 = parkingSpaceFacade0.getSpaceManager();
        ParkingSystem.CheckInManager checkInManager3 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean5 = checkInManager3.checkOut("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertNotNull(checkInManager3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        int int7 = accountRegistry3.getManagersSize();
        boolean boolean13 = accountRegistry3.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        java.util.List<ParkingSystem.Client> clientList14 = accountRegistry3.displayPendingValidations();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry3.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(clientList14);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        double double7 = bookingManager0.getDeposit("staff");
        boolean boolean11 = bookingManager0.editBooking("", "Paid $ -1.0 with Mobile Pay", (int) 'a');
        boolean boolean15 = bookingManager0.editBooking("jane", "pass", (int) '4');
        boolean boolean17 = bookingManager0.cancelBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        boolean boolean19 = bookingManager0.cancelBooking("Refunded total cost of $1.0");
        ParkingSystem.CheckInManager checkInManager20 = new ParkingSystem.CheckInManager(bookingManager0);
        checkInManager20.refundMessage = "Refunded total cost of $1.0";
        boolean boolean24 = checkInManager20.checkIn("empty");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade7 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager8 = parkingSpaceFacade7.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap9 = spaceManager8.getParkingLots();
        cSVManager0.loadParkingLots(strMap9);
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.updateClientValidation("2afd610d-a8cb-413a-bbee-7927f86b526c", false);
// flaky "36) test0141(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        ParkingSystem.Enabled enabled16 = new ParkingSystem.Enabled();
        parkingSpace10.setState((ParkingSystem.SpaceState) enabled16);
        parkingSpace10.removeBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "empty" + "'", str13, "empty");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit17 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit17);
        java.lang.Class<?> wildcardClass19 = debitOrCredit17.getClass();
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = parkingSpaceProxy0.getFacade();
        ParkingSystem.CheckInManager checkInManager2 = parkingSpaceFacade1.getCheckInManager();
        boolean boolean4 = checkInManager2.checkIn("Paid $ -1.0 with Mobile Pay");
        boolean boolean6 = checkInManager2.checkOut("");
        org.junit.Assert.assertNotNull(parkingSpaceFacade1);
        org.junit.Assert.assertNotNull(checkInManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("2afd610d-a8cb-413a-bbee-7927f86b526c");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        boolean boolean9 = paymentManager0.refundWithoutDeposit((double) 1L, (double) 'a');
        java.lang.String str10 = paymentManager0.paymentMessage;
        java.lang.String str11 = paymentManager0.paymentMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str10, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str11, "Paid $ 100.0 with Mobile Pay");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean4 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) 10);
        boolean boolean7 = parkingSpaceFacade0.extendBooking("Paid $ 0.0 with Mobile Pay", (int) (byte) 1);
        parkingSpaceFacade0.toggleSpace("Refunded without deposit ($-42.0)", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", true);
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy13 = null;
        client0.assignProxy(parkingSpaceProxy13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = client0.editBooking("Card number should be 16 digits", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.ParkingSpaceProxy.editBooking(String, String, int)\" because \"this.parkingProxy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(client0);
// flaky "37) test0148(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        ParkingSystem.Disabled disabled0 = new ParkingSystem.Disabled();
        ParkingSystem.ParkingSpace parkingSpace1 = null;
        java.lang.String str2 = disabled0.scanSpace(parkingSpace1);
        ParkingSystem.ParkingSpace parkingSpace3 = null;
        java.lang.String str4 = disabled0.scanSpace(parkingSpace3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "disabled" + "'", str2, "disabled");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean4 = paymentManager0.refundWithoutDeposit((double) (short) 10, (double) '4');
        java.lang.String str5 = paymentManager0.refundMessage;
        java.lang.String str6 = paymentManager0.paymentMessage;
        boolean boolean11 = paymentManager0.processPayment("7aecb00c-028c-4dcf-96cc-14d25bd709ab", (double) 1L, "Card number should be 16 digits", "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Refunded without deposit ($-42.0)" + "'", str5, "Refunded without deposit ($-42.0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        ParkingSystem.Client client33 = accountRegistry24.getClient("pass");
        org.junit.Assert.assertNotNull(superManager4);
// flaky "38) test0151(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str5, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager19);
// flaky "16) test0151(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str20, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(clientList31);
        org.junit.Assert.assertNull(client33);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap7 = accountRegistry3.getManagers();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry3.loadManagersFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry6 = superManager4.registry;
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap7 = accountRegistry6.getManagers();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry6.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
// flaky "39) test0153(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str5, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        boolean boolean40 = accountRegistry4.registerClient("Paid $ 100.0 with Mobile Pay", "empty", "Paid $ 0.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", "disabled");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry4.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(client18);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(accountRegistry28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.toggleLot("Paid $ 100.0 with Mobile Pay", true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.paymentMessage = "staff";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (short) 0);
        boolean boolean7 = paymentManager0.refundWithoutDeposit((double) (-1.0f), (double) (short) -1);
        boolean boolean9 = paymentManager0.refundDeposit((double) 0);
        java.lang.String str10 = paymentManager0.paymentMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        int int17 = accountRegistry15.getManagersSize();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry15.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
// flaky "40) test0157(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str5, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(manager16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.Object obj38 = user0.login("Refunded total cost of $-1.0", "Refunded without deposit ($0.0)");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean8 = parkingLot1.isEnabled();
        ParkingSystem.ParkingLotIterator parkingLotIterator9 = parkingLot1.getIterator();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        int int8 = booking7.getDuration();
        java.lang.String str9 = booking7.getClientId();
        booking7.setStartTime("hi!");
        int int12 = booking7.getSpaceId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        superManager4.setManagerInfo("Paid $ 0.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", "Refunded total cost of $1.0");
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
        superManager4.assignProxy(parkingSpaceProxy21);
        superManager4.displayPendingValidations();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(client11);
// flaky "41) test0161(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(accountRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        boolean boolean10 = client0.checkIn();
        boolean boolean18 = client0.confirmBooking("CLT-035180a0-4707-410d-a011-2a4f0f46838b", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", (int) (short) 10, "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", (int) (short) 100, "hi!", "empty");
        org.junit.Assert.assertNotNull(client0);
// flaky "42) test0162(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7aecb00c-028c-4dcf-96cc-14d25bd709ab" + "'", str1, "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean10 = parkingSpaceFacade0.confirmBooking("staff", "", "disabled", "hi!", (int) 'a', "jane", (int) 'a', "hi!", "");
        parkingSpaceFacade0.toggleLot("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", true);
        parkingSpaceFacade0.toggleLot("Refunded total cost of $1.0", false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        spaceManager0.loadParkingLots();
        spaceManager0.toggleLot("", false);
        spaceManager0.addParkingLot("Paid $ 10.0 with Mobile Pay");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap28 = accountRegistry3.getManagers();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy30 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj33 = parkingSpaceProxy30.login("empty", "Jane");
        parkingSpaceProxy30.validateClient("Jane");
        parkingSpaceProxy30.toggleSpace("", "staff", false);
        boolean boolean41 = parkingSpaceProxy30.cancelBooking("Jane");
        boolean boolean43 = parkingSpaceProxy30.checkOut("empty");
        boolean boolean53 = parkingSpaceProxy30.confirmBooking("2afd610d-a8cb-413a-bbee-7927f86b526c", "Paid $ -1.0 with Mobile Pay", "", "", (int) (short) 0, "disabled", 32, "", "jane");
        accountRegistry3.assignProxyToManager("2afd610d-a8cb-413a-bbee-7927f86b526c", parkingSpaceProxy30);
        ParkingSystem.User user56 = new ParkingSystem.User();
        java.lang.Object obj57 = user56.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy58 = user56.parkingProxy;
        ParkingSystem.User user59 = new ParkingSystem.User();
        java.lang.Object obj60 = user59.user;
        ParkingSystem.Client client61 = ParkingSystem.Client.getInstance();
        java.lang.String str62 = client61.getName();
        client61.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy65 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry66 = parkingSpaceProxy65.getRegistry();
        boolean boolean68 = parkingSpaceProxy65.checkIn("");
        client61.assignProxy(parkingSpaceProxy65);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade70 = parkingSpaceProxy65.getFacade();
        user59.assignProxy(parkingSpaceProxy65);
        user56.parkingProxy = parkingSpaceProxy65;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade73 = parkingSpaceProxy65.getFacade();
        accountRegistry3.assignProxyToClient("pass", parkingSpaceProxy65);
        ParkingSystem.Client client76 = accountRegistry3.getClient("Paid $ -1.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap77 = accountRegistry3.getManagers();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(parkingSpaceProxy58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(client61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "jane" + "'", str62, "jane");
        org.junit.Assert.assertNotNull(accountRegistry66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade70);
        org.junit.Assert.assertNotNull(parkingSpaceFacade73);
        org.junit.Assert.assertNull(client76);
        org.junit.Assert.assertNotNull(strMap77);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        ParkingSystem.AccountRegistry accountRegistry20 = parkingSpaceProxy19.getRegistry();
        java.lang.String str23 = parkingSpaceProxy19.scanSpace("empty", "hi!");
        boolean boolean33 = parkingSpaceProxy19.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        user0.assignProxy(parkingSpaceProxy19);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(accountRegistry20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "disabled" + "'", str23, "disabled");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        checkInManager1.refundMessage = "";
        boolean boolean5 = checkInManager1.checkOut("Paid $ 10.0 with Mobile Pay");
        boolean boolean7 = checkInManager1.checkIn("Card number should be 16 digits");
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        // The following exception was thrown during execution in test generation
        try {
            ParkingSystem.ParkingSpace parkingSpace3 = parkingLotIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotIterator2);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        java.lang.String str8 = booking7.getClientId();
        booking7.setCheckedIn(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager2 = parkingSpaceFacade1.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager3 = parkingSpaceFacade1.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap4 = spaceManager3.getParkingLots();
        cSVManager0.loadParkingLots(strMap4);
        java.lang.String[] strArray6 = cSVManager0.loadSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList7 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(checkInManager2);
        org.junit.Assert.assertNotNull(spaceManager3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strArray6);
// flaky "43) test0170(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Card number should be 16 digits" + "'", str13, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Card number should be 16 digits" + "'", str17, "Card number should be 16 digits");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.addParkingLot("2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        boolean boolean26 = bookingManager0.confirmBooking("empty", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Refunded total cost of $1.0", (int) (byte) 1, "Card number should be 16 digits", 32, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "disabled");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap27 = bookingManager0.getActiveBookings();
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade9 = parkingSpaceProxy4.getFacade();
        boolean boolean11 = parkingSpaceProxy4.cancelBooking("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        org.junit.Assert.assertNotNull(client0);
// flaky "44) test0174(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str1, "2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("disabled", 10.0d, "disabled", "disabled");
        java.lang.String str6 = mobilePay0.getPaymentMessage();
        java.lang.String str7 = mobilePay0.getPaymentMessage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str6, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str7, "Paid $ 10.0 with Mobile Pay");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        parkingSpace9.removeBooking();
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
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        boolean boolean53 = parkingSpace10.isAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        double double8 = booking7.getTotalCost();
        java.lang.String str9 = booking7.getLotId();
        java.lang.String str10 = booking7.getClientId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jane" + "'", str9, "jane");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("hi!", "disabled", "hi!");
        java.lang.String str5 = manager0.getManagerId();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = null;
        manager0.assignProxy(parkingSpaceProxy6);
        java.lang.String str8 = manager0.getPassword();
        org.junit.Assert.assertNotNull(manager0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.SpaceManager spaceManager6 = bookingManager0.getSpaceManager();
        ParkingSystem.ParkingLot parkingLot10 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking12 = null;
        boolean boolean13 = parkingLot10.assignBooking(0, booking12);
        boolean boolean15 = parkingLot10.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking24 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean25 = parkingLot10.assignBooking((int) (short) -1, booking24);
        java.lang.String str26 = booking24.getLotId();
        java.lang.String str27 = booking24.getLicensePlate();
        booking24.setStartTime("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        boolean boolean30 = spaceManager6.assignBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab", (int) (short) 0, booking24);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertNotNull(spaceManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "jane" + "'", str26, "jane");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "disabled" + "'", str27, "disabled");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap18 = bookingManager0.getActiveBookings();
        ParkingSystem.SpaceManager spaceManager19 = bookingManager0.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap20 = spaceManager19.getParkingLots();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(spaceManager19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy10 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry11 = parkingSpaceProxy10.getRegistry();
        boolean boolean13 = parkingSpaceProxy10.checkIn("");
        client0.assignProxy(parkingSpaceProxy10);
        client0.setValidated(false);
        org.junit.Assert.assertNotNull(client0);
// flaky "45) test0182(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str1, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNotNull(accountRegistry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        java.lang.Object obj27 = user0.user;
        java.lang.Object obj30 = user0.login("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        parkingLot1.removeBooking(0);
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot1.getParkingSpace(0);
        parkingSpace11.removeBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertNotNull(parkingSpace11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking2 = parkingSpaceProxy0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry3 = parkingSpaceProxy0.getRegistry();
        java.lang.String str6 = parkingSpaceProxy0.scanSpace("staff", "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        boolean boolean16 = parkingSpaceProxy0.confirmBooking("jane", "pass", "", "empty", 32, "", (int) (byte) 0, "", "jane");
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(accountRegistry3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        boolean boolean24 = bookingManager0.confirmBooking("Paid $ 10.0 with Mobile Pay", "empty", "empty", "Paid $ 10.0 with Mobile Pay", 0, "Jane", (int) 'a', "Jane", "empty");
        boolean boolean34 = bookingManager0.confirmBooking("empty", "hi!", "Paid $ 10.0 with Mobile Pay", "staff", (int) (byte) -1, "staff", (int) (short) 10, "empty", "Paid $ -1.0 with Mobile Pay");
        ParkingSystem.SpaceManager spaceManager35 = bookingManager0.getSpaceManager();
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(spaceManager35);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        java.lang.String str2 = client0.getPassword();
        boolean boolean3 = client0.getIsValidated();
        boolean boolean4 = client0.checkOut();
        org.junit.Assert.assertNotNull(client0);
// flaky "46) test0187(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jane" + "'", str1, "Jane");
// flaky "17) test0187(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pass" + "'", str2, "pass");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Manager manager11 = superManager4.autoGenerateManager();
        ParkingSystem.Manager manager12 = superManager4.autoGenerateManager();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNotNull(manager11);
        org.junit.Assert.assertNotNull(manager12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        parkingSpaceProxy9.displayPendingValidations();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
// flaky "47) test0189(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jane" + "'", str6, "jane");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        boolean boolean7 = spaceManager4.isSpaceAvailable("2afd610d-a8cb-413a-bbee-7927f86b526c", 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        spaceManager0.loadParkingLots();
        spaceManager0.toggleLot("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", true);
        boolean boolean10 = spaceManager0.isSpaceAvailable("Refunded without deposit ($0.0)", (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        boolean boolean50 = parkingSpace9.isAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        boolean boolean21 = parkingSpaceProxy9.editBooking("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "2afd610d-a8cb-413a-bbee-7927f86b526c", (int) (byte) 100);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "empty" + "'", str6, "empty");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = null;
        cSVManager0.loadParkingLots(strMap6);
        ParkingSystem.Client client8 = ParkingSystem.Client.getInstance();
        java.lang.String str9 = client8.getClientType();
        cSVManager0.saveClient(client8);
        java.lang.String str11 = client8.getName();
        boolean boolean13 = client8.extendBooking((int) '4');
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(client8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "empty" + "'", str9, "empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "empty" + "'", str11, "empty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean10 = parkingSpaceFacade0.confirmBooking("staff", "", "disabled", "hi!", (int) 'a', "jane", (int) 'a', "hi!", "");
        parkingSpaceFacade0.toggleLot("Paid $ 10.0 with Mobile Pay", true);
        java.lang.String str16 = parkingSpaceFacade0.scanSpace("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "empty");
        boolean boolean19 = parkingSpaceFacade0.extendBooking("2afd610d-a8cb-413a-bbee-7927f86b526c", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "disabled" + "'", str16, "disabled");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkOut("");
        boolean boolean5 = checkInManager1.checkIn("jane");
        java.lang.String str6 = checkInManager1.refundMessage;
        java.lang.String str7 = checkInManager1.refundMessage;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade9 = parkingSpaceProxy4.getFacade();
        boolean boolean11 = parkingSpaceFacade9.checkOut("Paid $ 0.0 with Mobile Pay");
        boolean boolean21 = parkingSpaceFacade9.confirmBooking("Card number should be 16 digits", "CLT-035180a0-4707-410d-a011-2a4f0f46838b", "13b04414-31a5-407f-8ea3-fba4613c73d1", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", (int) (short) 1, "", 1, "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        org.junit.Assert.assertNotNull(client0);
// flaky "48) test0197(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Refunded total cost of $-1.0" + "'", str1, "Refunded total cost of $-1.0");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.Manager manager5 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry6 = superManager4.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.registry;
        boolean boolean13 = accountRegistry7.registerClient("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Jane", "2afd610d-a8cb-413a-bbee-7927f86b526c", "Paid $ 0.0 with Mobile Pay", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry7.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(manager5);
        org.junit.Assert.assertNotNull(accountRegistry6);
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap20 = bookingManager19.getActiveBookings();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
// flaky "49) test0199(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertNotNull(bookingManager18);
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        boolean boolean6 = parkingSpaceFacade0.editBooking("Jane", "staff", (int) (short) 100);
        parkingSpaceFacade0.toggleLot("13b04414-31a5-407f-8ea3-fba4613c73d1", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Client client12 = accountRegistry8.getClient("empty");
        accountRegistry8.validateClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        java.lang.Object obj17 = accountRegistry8.login("ST001", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        accountRegistry8.validateClient("Paid $ -1.0 with Mobile Pay");
        accountRegistry8.validateClient("Card number should be 16 digits");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNull(client12);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        java.lang.Object obj2 = user0.user;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        int int59 = parkingSpace58.getSpaceId();
        ParkingSystem.Booking booking60 = parkingSpace58.getCurrentBooking();
        java.lang.String str61 = parkingSpace58.scanSpace();
        int int62 = parkingSpace58.getSpaceId();
        ParkingSystem.Booking booking63 = parkingSpace58.getCurrentBooking();
        java.lang.String str64 = enabled0.scanSpace(parkingSpace58);
        ParkingSystem.ParkingSpace parkingSpace65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = enabled0.scanSpace(parkingSpace65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.ParkingSpace.getCurrentBooking()\" because \"space\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNull(booking60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "empty" + "'", str61, "empty");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNull(booking63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "empty" + "'", str64, "empty");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkOut("");
        boolean boolean5 = checkInManager1.checkIn("jane");
        checkInManager1.refundMessage = "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean13 = bookingManager0.confirmBooking("empty", "Jane", "disabled", "pass", (int) (byte) 0, "hi!", (int) 'a', "hi!", "");
        double double15 = bookingManager0.getHourlyRate("Jane");
        double double17 = bookingManager0.getHourlyRate("Paid $ 0.0 with Mobile Pay");
        boolean boolean22 = bookingManager0.extendBooking("Paid $ -1.0 with Mobile Pay", 0, "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "empty");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkIn("Jane");
        boolean boolean5 = checkInManager1.checkOut("disabled");
        boolean boolean7 = checkInManager1.checkIn("");
        java.lang.String str8 = checkInManager1.refundMessage;
        checkInManager1.refundMessage = "empty";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isSpaceAvailable((int) (byte) 100);
        ParkingSystem.ParkingLotIterator parkingLotIterator10 = parkingLot1.getIterator();
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot1.getParkingSpace(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator10);
        org.junit.Assert.assertNotNull(parkingSpace12);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        double double7 = bookingManager0.getDeposit("staff");
        boolean boolean11 = bookingManager0.editBooking("", "Paid $ -1.0 with Mobile Pay", (int) 'a');
        boolean boolean15 = bookingManager0.editBooking("jane", "pass", (int) '4');
        boolean boolean25 = bookingManager0.confirmBooking("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "Paid $ 0.0 with Mobile Pay", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", 32, "9701df9a-2178-4ad5-8076-46ff5f05b3e8", 0, "jane", "CLT-035180a0-4707-410d-a011-2a4f0f46838b");
        double double27 = bookingManager0.getDeposit("ST001");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 15.0d + "'", double27 == 15.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        java.lang.Object obj4 = accountRegistry1.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry1.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        spaceManager0.loadParkingLots();
        java.lang.String str12 = spaceManager0.scanSpace("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        spaceManager0.addParkingLot("ST001");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("jane", "");
        spaceManager0.addParkingLot("disabled");
        spaceManager0.removeBooking("staff", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList3 = cSVManager0.loadManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
// flaky "50) test0212(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "18) test0212(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        boolean boolean27 = parkingSpaceProxy9.register("Jane", "Paid $ -1.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", "", "Refunded total cost of $1.0");
        boolean boolean33 = parkingSpaceProxy9.register("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "jane", "", "jane", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        boolean boolean37 = parkingSpaceProxy9.editBooking("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", "Refunded total cost of $-1.0", (int) '#');
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        java.lang.String str7 = paymentManager0.refundMessage;
        boolean boolean9 = paymentManager0.refundTotalCost((double) (short) 100);
        boolean boolean14 = paymentManager0.processPayment("hi!", (double) 0.0f, "empty", "Paid $ 10.0 with Mobile Pay");
        java.lang.String str15 = paymentManager0.refundMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Refunded total cost of $1.0" + "'", str7, "Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Refunded total cost of $100.0" + "'", str15, "Refunded total cost of $100.0");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        boolean boolean13 = client0.getIsValidated();
        boolean boolean21 = client0.confirmBooking("hi!", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "Paid $ 100.0 with Mobile Pay", (-1), "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "empty");
        boolean boolean22 = client0.getIsValidated();
        java.lang.String str23 = client0.getUsername();
        org.junit.Assert.assertNotNull(client0);
// flaky "51) test0215(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str1, "2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean13 = bookingManager0.confirmBooking("disabled", "Refunded total cost of $100.0", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "Paid $ 100.0 with Mobile Pay", (int) '4', "02659ad3-0b5c-4c48-a915-a466f2b50775", (-1), "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "jane");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        java.lang.String str4 = client0.getExtraId();
        java.lang.String str5 = client0.getClientType();
        boolean boolean13 = client0.confirmBooking("empty", "Paid $ -1.0 with Mobile Pay", (int) (byte) 1, "empty", (int) 'a', "2afd610d-a8cb-413a-bbee-7927f86b526c", "Jane");
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "disabled" + "'", str5, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        ParkingSystem.CheckInManager checkInManager20 = parkingSpaceFacade17.getCheckInManager();
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
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertNotNull(checkInManager20);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        ParkingSystem.SpaceManager spaceManager47 = new ParkingSystem.SpaceManager();
        boolean boolean50 = spaceManager47.isSpaceAvailable("hi!", (int) '#');
        spaceManager47.toggleLot("disabled", false);
        ParkingSystem.Booking booking63 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean64 = spaceManager47.assignBooking("empty", (int) (short) 0, booking63);
        ParkingSystem.SpaceManager spaceManager67 = new ParkingSystem.SpaceManager();
        boolean boolean70 = spaceManager67.isSpaceAvailable("hi!", (int) '#');
        spaceManager67.toggleLot("disabled", false);
        ParkingSystem.Booking booking83 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean84 = spaceManager67.assignBooking("empty", (int) (short) 0, booking83);
        boolean boolean85 = spaceManager47.assignBooking("disabled", (int) (byte) 0, booking83);
        boolean boolean86 = parkingSpace25.assignBooking(booking83);
        java.lang.String str87 = booking83.getLotId();
        boolean boolean88 = parkingSpace11.assignBooking(booking83);
        parkingSpace11.removeBooking();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "jane" + "'", str87, "jane");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit6 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit6);
        boolean boolean12 = debitOrCredit6.processPayment("jane", (double) '#', "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "jane");
        java.lang.String str13 = debitOrCredit6.getPaymentMessage();
        boolean boolean18 = debitOrCredit6.processPayment("Paid $ 0.0 with Mobile Pay", 30.0d, "Paid $ -1.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay");
        java.lang.String str19 = debitOrCredit6.getPaymentMessage();
        java.lang.String str20 = debitOrCredit6.getPaymentMessage();
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Card number should be 16 digits" + "'", str13, "Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Card number should be 16 digits" + "'", str19, "Card number should be 16 digits");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Card number should be 16 digits" + "'", str20, "Card number should be 16 digits");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkIn("Jane");
        boolean boolean5 = checkInManager1.checkIn("Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        boolean boolean5 = parkingSpaceProxy0.checkIn("Paid $ 10.0 with Mobile Pay");
        parkingSpaceProxy0.toggleLot("staff", true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getUsername();
        boolean boolean4 = client0.extendBooking(100);
        boolean boolean12 = client0.confirmBooking("Refunded without deposit ($0.0)", "Paid $ 10.0 with Mobile Pay", (int) ' ', "disabled", (int) (short) 1, "Refunded total cost of $100.0", "");
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "disabled" + "'", str1, "disabled");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList23 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(strArrayList8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "disabled" + "'", str20, "disabled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        java.lang.String str13 = client0.getName();
        boolean boolean14 = client0.checkIn();
        boolean boolean15 = client0.cancelBooking();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.BookingManager bookingManager1 = parkingSpaceFacade0.getBookingManager();
        ParkingSystem.Booking booking3 = parkingSpaceFacade0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(bookingManager1);
        org.junit.Assert.assertNull(booking3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isSpaceAvailable((int) (byte) 100);
        boolean boolean10 = parkingLot1.isEnabled();
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot1.getParkingSpace((-1));
        boolean boolean13 = parkingLot1.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        boolean boolean8 = parkingLotIterator7.hasNext();
        ParkingSystem.ParkingSpace parkingSpace9 = parkingLotIterator7.next();
        boolean boolean10 = parkingLotIterator7.hasNext();
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLotIterator7.next();
        // The following exception was thrown during execution in test generation
        try {
            ParkingSystem.ParkingSpace parkingSpace12 = parkingLotIterator7.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        java.lang.String str25 = client0.getName();
        org.junit.Assert.assertNotNull(client0);
// flaky "52) test0229(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap28 = accountRegistry3.getManagers();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy30 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj33 = parkingSpaceProxy30.login("empty", "Jane");
        parkingSpaceProxy30.validateClient("Jane");
        parkingSpaceProxy30.toggleSpace("", "staff", false);
        boolean boolean41 = parkingSpaceProxy30.cancelBooking("Jane");
        boolean boolean43 = parkingSpaceProxy30.checkOut("empty");
        boolean boolean53 = parkingSpaceProxy30.confirmBooking("2afd610d-a8cb-413a-bbee-7927f86b526c", "Paid $ -1.0 with Mobile Pay", "", "", (int) (short) 0, "disabled", 32, "", "jane");
        accountRegistry3.assignProxyToManager("2afd610d-a8cb-413a-bbee-7927f86b526c", parkingSpaceProxy30);
        ParkingSystem.User user56 = new ParkingSystem.User();
        java.lang.Object obj57 = user56.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy58 = user56.parkingProxy;
        ParkingSystem.User user59 = new ParkingSystem.User();
        java.lang.Object obj60 = user59.user;
        ParkingSystem.Client client61 = ParkingSystem.Client.getInstance();
        java.lang.String str62 = client61.getName();
        client61.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy65 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry66 = parkingSpaceProxy65.getRegistry();
        boolean boolean68 = parkingSpaceProxy65.checkIn("");
        client61.assignProxy(parkingSpaceProxy65);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade70 = parkingSpaceProxy65.getFacade();
        user59.assignProxy(parkingSpaceProxy65);
        user56.parkingProxy = parkingSpaceProxy65;
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade73 = parkingSpaceProxy65.getFacade();
        accountRegistry3.assignProxyToClient("pass", parkingSpaceProxy65);
        ParkingSystem.Client client76 = accountRegistry3.getClient("Paid $ -1.0 with Mobile Pay");
        boolean boolean78 = accountRegistry3.requiresValidation("");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(parkingSpaceProxy58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(client61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "jane" + "'", str62, "jane");
        org.junit.Assert.assertNotNull(accountRegistry66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade70);
        org.junit.Assert.assertNotNull(parkingSpaceFacade73);
        org.junit.Assert.assertNull(client76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.lang.Object obj39 = user0.user;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
// flaky "53) test0231(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str22, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str24, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client25);
// flaky "19) test0231(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(accountRegistry30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        boolean boolean19 = parkingSpaceProxy2.cancelBooking("Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(accountRegistry17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.validateClient("Jane");
        parkingSpaceProxy3.toggleSpace("", "staff", false);
        boolean boolean14 = parkingSpaceProxy3.cancelBooking("");
        boolean boolean20 = parkingSpaceProxy3.register("jane", "jane", "Jane", "hi!", "disabled");
        accountRegistry1.assignProxyToManager("empty", parkingSpaceProxy3);
        parkingSpaceProxy3.autoGenerateManager();
        boolean boolean24 = parkingSpaceProxy3.checkIn("CLT-035180a0-4707-410d-a011-2a4f0f46838b");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        boolean boolean26 = bookingManager0.confirmBooking("empty", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Refunded total cost of $1.0", (int) (byte) 1, "Card number should be 16 digits", 32, "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "disabled");
        ParkingSystem.Booking booking28 = bookingManager0.getBooking("ST001");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(booking28);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit17 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit17);
        ParkingSystem.CheckInManager checkInManager19 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean21 = checkInManager19.checkIn("Refunded without deposit ($-42.0)");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        ParkingSystem.Manager manager21 = superManager18.autoGenerateManager();
        // The following exception was thrown during execution in test generation
        try {
            superManager18.displayPendingValidations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.ParkingSpaceProxy.displayPendingValidations()\" because \"this.parkingProxy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertNotNull(manager21);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = parkingSpaceProxy0.getFacade();
        ParkingSystem.Booking booking3 = parkingSpaceFacade1.getBookingDetails("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        boolean boolean7 = parkingSpaceFacade1.editBooking("Paid $ -1.0 with Mobile Pay", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", (int) (byte) 0);
        boolean boolean9 = parkingSpaceFacade1.checkOut("Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(parkingSpaceFacade1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager2 = parkingSpaceFacade1.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager3 = parkingSpaceFacade1.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap4 = spaceManager3.getParkingLots();
        cSVManager0.loadParkingLots(strMap4);
        java.lang.String[] strArray6 = cSVManager0.loadSuperManager();
        cSVManager0.updateClientValidation("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList10 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(checkInManager2);
        org.junit.Assert.assertNotNull(spaceManager3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strArray6);
// flaky "54) test0238(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        boolean boolean48 = parkingSpaceProxy38.editBooking("02659ad3-0b5c-4c48-a915-a466f2b50775", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", 2);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        parkingSpaceProxy2.autoGenerateManager();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(accountRegistry17);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager2 = parkingSpaceFacade0.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap3 = spaceManager2.getParkingLots();
        boolean boolean6 = spaceManager2.isSpaceAvailable("CLT-035180a0-4707-410d-a011-2a4f0f46838b", (int) (short) 0);
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        boolean boolean10 = bookingManager0.extendBooking("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", 1, "", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        parkingSpaceFacade33.toggleLot("jane", false);
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
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Manager manager11 = superManager4.autoGenerateManager();
        java.lang.String str12 = manager11.getManagerId();
        manager11.setManagerInfo("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "staff", "disabled");
        manager11.setManagerInfo("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "CLT-035180a0-4707-410d-a011-2a4f0f46838b", "staff");
        manager11.setManagerInfo("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "ST001", "");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNotNull(manager11);
// flaky "55) test0244(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4a1f2343-8b2e-4dea-ba69-efd105414390" + "'", str12, "4a1f2343-8b2e-4dea-ba69-efd105414390");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Manager manager11 = superManager4.autoGenerateManager();
        java.lang.String str12 = manager11.getManagerId();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy16 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry17 = parkingSpaceProxy16.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj22 = parkingSpaceProxy19.login("empty", "Jane");
        parkingSpaceProxy19.validateClient("Jane");
        parkingSpaceProxy19.toggleSpace("", "staff", false);
        accountRegistry17.assignProxyToManager("pass", parkingSpaceProxy19);
        ParkingSystem.Client client31 = accountRegistry17.getClient("");
        ParkingSystem.SuperManager superManager32 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry17);
        boolean boolean38 = accountRegistry17.registerClient("hi!", "Refunded total cost of $1.0", "2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy40 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry41 = parkingSpaceProxy40.getRegistry();
        boolean boolean43 = parkingSpaceProxy40.checkIn("");
        parkingSpaceProxy40.toggleLot("", true);
        accountRegistry17.assignProxyToManager("", parkingSpaceProxy40);
        manager11.assignProxy(parkingSpaceProxy40);
        java.lang.String str49 = manager11.getManagerId();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNotNull(manager11);
// flaky "56) test0245(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "433f3d1f-f758-4ae3-972b-7fb179aedfd7" + "'", str12, "433f3d1f-f758-4ae3-972b-7fb179aedfd7");
        org.junit.Assert.assertNotNull(accountRegistry17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(client31);
        org.junit.Assert.assertNotNull(superManager32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(accountRegistry41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky "20) test0245(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "433f3d1f-f758-4ae3-972b-7fb179aedfd7" + "'", str49, "433f3d1f-f758-4ae3-972b-7fb179aedfd7");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        int int8 = booking7.getDuration();
        java.lang.String str9 = booking7.getClientId();
        booking7.setCheckedIn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime12 = booking7.getCheckedInDeadline();
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Jane' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        ParkingSystem.Manager manager7 = accountRegistry3.autoGenerateManager();
        manager7.setManagerInfo("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "jane", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.Client client12 = ParkingSystem.Client.getInstance();
        java.lang.String str13 = client12.getName();
        client12.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy16 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry17 = parkingSpaceProxy16.getRegistry();
        boolean boolean19 = parkingSpaceProxy16.checkIn("");
        client12.assignProxy(parkingSpaceProxy16);
        boolean boolean21 = client12.cancelBooking();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy22 = new ParkingSystem.ParkingSpaceProxy();
        client12.assignProxy(parkingSpaceProxy22);
        ParkingSystem.AccountRegistry accountRegistry24 = parkingSpaceProxy22.getRegistry();
        boolean boolean28 = parkingSpaceProxy22.editBooking("pass", "Refunded without deposit ($0.0)", 1);
        manager7.assignProxy(parkingSpaceProxy22);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountRegistry17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(accountRegistry24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList23 = cSVManager0.loadManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(strArrayList8);
        org.junit.Assert.assertNotNull(client9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "disabled" + "'", str20, "disabled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("pass");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingLotIterator2);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("jane", "");
        spaceManager0.removeBooking("jane", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        client0.setValidated(false);
        boolean boolean4 = client0.cancelBooking();
        org.junit.Assert.assertNotNull(client0);
// flaky "57) test0251(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "disabled" + "'", str1, "disabled");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        boolean boolean2 = parkingSpaceProxy0.cancelBooking("pass");
        parkingSpaceProxy0.toggleSpace("jane", "Paid $ -1.0 with Mobile Pay", false);
        boolean boolean8 = parkingSpaceProxy0.checkOut("Paid $ 0.0 with Mobile Pay");
        boolean boolean10 = parkingSpaceProxy0.cancelBooking("empty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj4 = parkingSpaceProxy1.login("empty", "Jane");
        parkingSpaceProxy1.validateClient("Jane");
        parkingSpaceProxy1.toggleSpace("", "staff", false);
        boolean boolean12 = parkingSpaceProxy1.cancelBooking("");
        user0.assignProxy(parkingSpaceProxy1);
        parkingSpaceProxy1.addParkingLot("staff");
        parkingSpaceProxy1.validateClient("06b0adae-5a80-41cd-b7f6-6da51afdd4f5");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        boolean boolean13 = client0.getIsValidated();
        boolean boolean21 = client0.confirmBooking("hi!", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "Paid $ 100.0 with Mobile Pay", (-1), "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "empty");
        java.lang.String str22 = client0.getName();
        boolean boolean23 = client0.getIsValidated();
        boolean boolean24 = client0.checkOut();
        org.junit.Assert.assertNotNull(client0);
// flaky "58) test0254(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        java.lang.String str1 = mobilePay0.getPaymentMessage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        java.lang.String str9 = superManager4.getPassword();
        ParkingSystem.AccountRegistry accountRegistry13 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager14 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry13);
        boolean boolean16 = accountRegistry13.requiresValidation("disabled");
        int int17 = accountRegistry13.getManagersSize();
        boolean boolean23 = accountRegistry13.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        java.util.List<ParkingSystem.Client> clientList24 = accountRegistry13.displayPendingValidations();
        superManager4.registry = accountRegistry13;
        ParkingSystem.AccountRegistry accountRegistry32 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager33 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry32);
        ParkingSystem.AccountRegistry accountRegistry37 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager38 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry37);
        superManager33.registry = accountRegistry37;
        ParkingSystem.SuperManager superManager40 = ParkingSystem.SuperManager.createFromCSV("pass", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry37);
        superManager4.registry = accountRegistry37;
        boolean boolean47 = accountRegistry37.registerClient("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Refunded total cost of $-1.0", "Refunded total cost of $1.0", "Refunded without deposit ($0.0)", "Refunded without deposit ($-42.0)");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Refunded total cost of $1.0" + "'", str9, "Refunded total cost of $1.0");
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(clientList24);
        org.junit.Assert.assertNotNull(superManager33);
        org.junit.Assert.assertNotNull(superManager38);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        boolean boolean4 = parkingSpaceFacade0.cancelBooking("jane");
        parkingSpaceFacade0.addParkingLot("Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        boolean boolean8 = parkingLotIterator7.hasNext();
        boolean boolean9 = parkingLotIterator7.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        ParkingSystem.ParkingLotIterator parkingLotIterator22 = parkingLot16.getIterator();
        boolean boolean23 = parkingLotIterator22.hasNext();
        ParkingSystem.ParkingSpace parkingSpace24 = parkingLotIterator22.next();
        java.lang.String str25 = enabled0.scanSpace(parkingSpace24);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "empty" + "'", str14, "empty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parkingSpace24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "empty" + "'", str25, "empty");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.Manager manager8 = superManager4.autoGenerateManager();
        ParkingSystem.Manager manager9 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry10 = superManager4.getRegistry();
// flaky "59) test0260(RegressionTest0)":         superManager4.validateClient("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(manager8);
        org.junit.Assert.assertNotNull(manager9);
        org.junit.Assert.assertNotNull(accountRegistry10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = bookingManager0.cancelBooking("02659ad3-0b5c-4c48-a915-a466f2b50775");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = user0.parkingProxy;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = null;
        user0.parkingProxy = parkingSpaceProxy2;
        org.junit.Assert.assertNull(parkingSpaceProxy1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        boolean boolean6 = parkingSpaceProxy0.extendBooking("pass", 0);
        parkingSpaceProxy0.toggleSpace("", "staff", false);
        java.lang.String str13 = parkingSpaceProxy0.scanSpace("jane", "CLT-035180a0-4707-410d-a011-2a4f0f46838b");
        boolean boolean23 = parkingSpaceProxy0.confirmBooking("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "13b04414-31a5-407f-8ea3-fba4613c73d1", "Refunded total cost of $-1.0", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", 0, "empty", (int) (short) -1, "Refunded without deposit ($0.0)", "02659ad3-0b5c-4c48-a915-a466f2b50775");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "disabled" + "'", str13, "disabled");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        boolean boolean96 = parkingSpaceProxy83.editBooking("empty", "Paid $ 0.0 with Mobile Pay", (int) (short) 100);
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
// flaky "60) test0264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f" + "'", str82, "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f");
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        boolean boolean6 = parkingSpaceProxy0.extendBooking("pass", 0);
        boolean boolean8 = parkingSpaceProxy0.checkOut("Paid $ 10.0 with Mobile Pay");
        java.lang.String str11 = parkingSpaceProxy0.scanSpace("hi!", "Jane");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade12 = parkingSpaceProxy0.getFacade();
        boolean boolean15 = parkingSpaceProxy0.extendBooking("CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", (int) 'a');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertNotNull(parkingSpaceFacade12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = null;
        cSVManager0.loadParkingLots(strMap6);
        ParkingSystem.Client client8 = ParkingSystem.Client.getInstance();
        java.lang.String str9 = client8.getClientType();
        cSVManager0.saveClient(client8);
        ParkingSystem.AccountRegistry accountRegistry14 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager15 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry14);
        ParkingSystem.Manager manager16 = superManager15.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry17 = superManager15.getRegistry();
        java.lang.String str18 = superManager15.getPassword();
// flaky "61) test0266(RegressionTest0)":         superManager15.displayPendingValidations();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager15);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(client8);
// flaky "21) test0266(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str9, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertNotNull(manager16);
        org.junit.Assert.assertNotNull(accountRegistry17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Refunded total cost of $1.0" + "'", str18, "Refunded total cost of $1.0");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        ParkingSystem.SpaceManager spaceManager52 = new ParkingSystem.SpaceManager();
        boolean boolean55 = spaceManager52.isSpaceAvailable("hi!", (int) '#');
        spaceManager52.toggleLot("disabled", false);
        ParkingSystem.Booking booking68 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean69 = spaceManager52.assignBooking("empty", (int) (short) 0, booking68);
        boolean boolean70 = spaceManager32.assignBooking("disabled", (int) (byte) 0, booking68);
        boolean boolean71 = parkingSpace10.assignBooking(booking68);
        java.lang.String str72 = booking68.getLotId();
        booking68.setCheckedIn(true);
        java.lang.String str75 = booking68.getClientId();
        java.lang.String str76 = booking68.getStartTime();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "jane" + "'", str72, "jane");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "staff" + "'", str75, "staff");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Jane" + "'", str76, "Jane");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry12 = superManager11.getRegistry();
        java.lang.Object obj15 = accountRegistry12.login("disabled", "pass");
        java.util.List<ParkingSystem.Client> clientList16 = accountRegistry12.displayPendingValidations();
        boolean boolean22 = accountRegistry12.registerClient("Refunded total cost of $100.0", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded without deposit ($0.0)", "433f3d1f-f758-4ae3-972b-7fb179aedfd7", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(clientList16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("disabled", 10.0d, "disabled", "disabled");
        java.lang.String str6 = mobilePay0.getPaymentMessage();
        java.lang.String str7 = mobilePay0.getPaymentMessage();
        boolean boolean12 = mobilePay0.processPayment("Refunded total cost of $100.0", (double) (short) 1, "9701df9a-2178-4ad5-8076-46ff5f05b3e8", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str6, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str7, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        java.lang.String str5 = parkingSpaceFacade0.scanSpace("Paid $ 10.0 with Mobile Pay", "hi!");
        ParkingSystem.CheckInManager checkInManager6 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean16 = parkingSpaceFacade0.confirmBooking("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "", "2afd610d-a8cb-413a-bbee-7927f86b526c", "Paid $ 0.0 with Mobile Pay", (int) (short) 100, "9701df9a-2178-4ad5-8076-46ff5f05b3e8", 1, "Paid $ 0.0 with Mobile Pay", "disabled");
        boolean boolean18 = parkingSpaceFacade0.checkOut("Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "disabled" + "'", str5, "disabled");
        org.junit.Assert.assertNotNull(checkInManager6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.lang.String str22 = client7.getExtraId();
        org.junit.Assert.assertNotNull(strArray1);
// flaky "62) test0271(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "22) test0271(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(client7);
// flaky "8) test0271(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLT-30fd593b-dedd-41b3-a919-c48700301f41" + "'", str8, "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "5) test0271(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CLT-30fd593b-dedd-41b3-a919-c48700301f41" + "'", str22, "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking2 = parkingSpaceProxy0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.AccountRegistry accountRegistry3 = parkingSpaceProxy0.getRegistry();
        boolean boolean9 = parkingSpaceProxy0.register("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", "hi!", "Jane", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(accountRegistry3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        boolean boolean5 = parkingSpaceFacade0.checkOut("Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingLotIterator parkingLotIterator9 = parkingLot1.getIterator();
        boolean boolean10 = parkingLot1.isEnabled();
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot1.getParkingSpace((int) '4');
        ParkingSystem.SpaceState spaceState13 = parkingSpace12.getState();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(spaceState13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        client7.setValidated(false);
        org.junit.Assert.assertNotNull(strArray1);
// flaky "63) test0275(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "23) test0275(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(client7);
// flaky "9) test0275(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
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
        boolean boolean16 = parkingSpaceProxy12.checkIn("hi!");
        user0.parkingProxy = parkingSpaceProxy12;
        parkingSpaceProxy12.displayPendingValidations();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(client2);
// flaky "64) test0276(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jane" + "'", str3, "jane");
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(accountRegistry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        parkingLot1.removeBooking((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        ParkingSystem.Client client6 = ParkingSystem.Client.getInstance();
        java.lang.String str7 = client6.getName();
        client6.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str16 = client6.getUsername();
        java.lang.String str17 = client6.getPassword();
        java.lang.String str18 = client6.getClientType();
        boolean boolean19 = client6.getIsValidated();
        boolean boolean27 = client6.confirmBooking("hi!", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "Paid $ 100.0 with Mobile Pay", (-1), "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "empty");
        java.lang.String str28 = client6.getName();
        cSVManager0.saveClient(client6);
        java.lang.String[] strArray30 = cSVManager0.loadSuperManager();
        ParkingSystem.SpaceManager spaceManager31 = new ParkingSystem.SpaceManager();
        boolean boolean34 = spaceManager31.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str37 = spaceManager31.scanSpace("disabled", "");
        spaceManager31.addParkingLot("hi!");
        java.lang.String str42 = spaceManager31.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap43 = spaceManager31.getParkingLots();
        cSVManager0.loadParkingLots(strMap43);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(client6);
// flaky "65) test0278(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str7, "2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disabled" + "'", str17, "disabled");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray30);
// flaky "24) test0278(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "disabled" + "'", str37, "disabled");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "disabled" + "'", str42, "disabled");
        org.junit.Assert.assertNotNull(strMap43);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        parkingLot1.setEnabled(false);
        ParkingSystem.Booking booking13 = new ParkingSystem.Booking("Paid $ 100.0 with Mobile Pay", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", (-1), "Paid $ 10.0 with Mobile Pay", (int) '#', "hi!", 0.0d);
        boolean boolean14 = parkingLot1.assignBooking(1, booking13);
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        boolean boolean3 = parkingSpaceProxy0.checkIn("");
        boolean boolean5 = parkingSpaceProxy0.cancelBooking("empty");
        ParkingSystem.Booking booking7 = parkingSpaceProxy0.getBookingDetails("staff");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(booking7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        parkingSpaceProxy10.toggleLot("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", true);
        ParkingSystem.Booking booking16 = parkingSpaceProxy10.getBookingDetails("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f");
        org.junit.Assert.assertNotNull(client0);
// flaky "66) test0281(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(booking16);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        parkingLot1.removeBooking(0);
        ParkingSystem.ParkingLot parkingLot12 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking14 = null;
        boolean boolean15 = parkingLot12.assignBooking(0, booking14);
        boolean boolean17 = parkingLot12.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking26 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean27 = parkingLot12.assignBooking((int) (short) -1, booking26);
        java.lang.String str28 = booking26.getLotId();
        java.lang.String str29 = booking26.getLicensePlate();
        boolean boolean30 = parkingLot1.assignBooking((int) (short) -1, booking26);
        ParkingSystem.ParkingLotIterator parkingLotIterator31 = parkingLot1.getIterator();
        ParkingSystem.ParkingLot parkingLot34 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking36 = null;
        boolean boolean37 = parkingLot34.assignBooking(0, booking36);
        boolean boolean39 = parkingLot34.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking48 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean49 = parkingLot34.assignBooking((int) (short) -1, booking48);
        java.lang.String str50 = booking48.getLotId();
        int int51 = booking48.getDuration();
        int int52 = booking48.getSpaceId();
        booking48.setStartTime("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        booking48.setDuration((int) 'a');
        boolean boolean57 = parkingLot1.assignBooking((int) (short) 1, booking48);
        java.lang.String str58 = booking48.getLicensePlate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "jane" + "'", str28, "jane");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "disabled" + "'", str29, "disabled");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "jane" + "'", str50, "jane");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32 + "'", int51 == 32);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "disabled" + "'", str58, "disabled");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        accountRegistry4.validateClient("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry4.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(client18);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.BookingManager bookingManager1 = parkingSpaceFacade0.getBookingManager();
        double double3 = bookingManager1.getHourlyRate("pass");
        ParkingSystem.Booking booking5 = bookingManager1.getBooking("jane");
        org.junit.Assert.assertNotNull(bookingManager1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        client7.setClientInfo("25527a32-01ef-45ba-816a-1d0a2fc2a52d", "Jane", "Refunded total cost of $100.0", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "", "Card number should be 16 digits", false);
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArray6);
// flaky "67) test0285(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client7);
// flaky "25) test0285(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Jane" + "'", str8, "Jane");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
// flaky "68) test0286(RegressionTest0)":         superManager4.validateClient("CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("disabled");
        java.lang.Class<?> wildcardClass2 = parkingLot1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        ParkingSystem.Booking booking12 = client0.getBookingDetails();
        ParkingSystem.Booking booking13 = client0.getBookingDetails();
        org.junit.Assert.assertNotNull(client0);
// flaky "69) test0288(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLT-30fd593b-dedd-41b3-a919-c48700301f41" + "'", str1, "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertNull(booking13);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkIn("Jane");
        boolean boolean5 = checkInManager1.checkOut("disabled");
        boolean boolean7 = checkInManager1.checkIn("");
        checkInManager1.refundMessage = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap1 = null;
        cSVManager0.loadParkingLots(strMap1);
        ParkingSystem.CSVManager cSVManager3 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList5 = cSVManager3.readCSV("");
        java.util.List<java.lang.String[]> strArrayList7 = cSVManager3.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap8 = null;
        cSVManager3.loadParkingLots(strMap8);
        ParkingSystem.AccountRegistry accountRegistry13 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager14 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry13);
        ParkingSystem.Manager manager15 = superManager14.autoGenerateManager();
        cSVManager3.saveManager((ParkingSystem.Manager) superManager14);
        ParkingSystem.SpaceManager spaceManager17 = new ParkingSystem.SpaceManager();
        boolean boolean20 = spaceManager17.isSpaceAvailable("hi!", (int) '#');
        spaceManager17.toggleLot("disabled", false);
        ParkingSystem.Booking booking33 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean34 = spaceManager17.assignBooking("empty", (int) (short) 0, booking33);
        spaceManager17.loadParkingLots();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap36 = spaceManager17.getParkingLots();
        cSVManager3.loadParkingLots(strMap36);
        ParkingSystem.SpaceManager spaceManager38 = new ParkingSystem.SpaceManager();
        boolean boolean41 = spaceManager38.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str44 = spaceManager38.scanSpace("disabled", "");
        spaceManager38.addParkingLot("hi!");
        java.lang.String str49 = spaceManager38.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap50 = spaceManager38.getParkingLots();
        cSVManager3.saveParkingLots(strMap50);
        cSVManager0.saveParkingLots(strMap50);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap53 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.saveParkingLots(strMap53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.values()\" because \"parkingLots\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList5);
        org.junit.Assert.assertNotNull(strArrayList7);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertNotNull(manager15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "disabled" + "'", str44, "disabled");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "disabled" + "'", str49, "disabled");
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        superManager18.setManagerInfo("CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "CLT-035180a0-4707-410d-a011-2a4f0f46838b", "25527a32-01ef-45ba-816a-1d0a2fc2a52d");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertNotNull(accountRegistry21);
        org.junit.Assert.assertNotNull(accountRegistry22);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.paymentMessage = "staff";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (short) 0);
        boolean boolean7 = paymentManager0.refundWithoutDeposit(0.0d, 15.0d);
        java.lang.String str8 = paymentManager0.paymentMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        double double21 = bookingManager0.getHourlyRate("");
        ParkingSystem.CheckInManager checkInManager22 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean24 = checkInManager22.checkIn("13b04414-31a5-407f-8ea3-fba4613c73d1");
        boolean boolean26 = checkInManager22.checkIn("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 165.0d + "'", double11 == 165.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit17 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit17);
        boolean boolean23 = bookingManager0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (short) 1, "hi!", "4a1f2343-8b2e-4dea-ba69-efd105414390");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        boolean boolean9 = client0.confirmBooking("", "pass", (int) (byte) 0, "Paid $ 10.0 with Mobile Pay", (int) (byte) 0, "", "Jane");
        boolean boolean17 = client0.confirmBooking("ST001", "CLT-035180a0-4707-410d-a011-2a4f0f46838b", (int) (short) 0, "jane", (int) (short) 0, "Refunded total cost of $100.0", "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client0);
// flaky "70) test0295(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit6 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit6);
        java.lang.String str8 = debitOrCredit6.getPaymentMessage();
        boolean boolean13 = debitOrCredit6.processPayment("pass", (double) 0, "", "Refunded total cost of $1.0");
        java.lang.Class<?> wildcardClass14 = debitOrCredit6.getClass();
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap25 = accountRegistry24.getManagers();
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(accountRegistry24);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap4 = bookingManager0.getActiveBookings();
        ParkingSystem.Booking booking6 = bookingManager0.getBooking("empty");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(booking6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking15 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean16 = parkingLot1.assignBooking((int) (short) -1, booking15);
        int int17 = booking15.getSpaceId();
        boolean boolean18 = booking15.isCheckedIn();
        booking15.setStartTime("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj4 = parkingSpaceProxy1.login("empty", "Jane");
        parkingSpaceProxy1.validateClient("Jane");
        parkingSpaceProxy1.toggleSpace("", "staff", false);
        boolean boolean12 = parkingSpaceProxy1.cancelBooking("");
        user0.assignProxy(parkingSpaceProxy1);
        parkingSpaceProxy1.displayPendingValidations();
        boolean boolean18 = parkingSpaceProxy1.editBooking("Paid $ -1.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", 100);
        parkingSpaceProxy1.validateClient("Paid $ 100.0 with Mobile Pay");
        parkingSpaceProxy1.displayPendingValidations();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str3 = parkingSpaceFacade0.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleLot("Refunded total cost of $1.0", false);
        ParkingSystem.SpaceManager spaceManager8 = parkingSpaceFacade0.getSpaceManager();
        spaceManager8.removeBooking("jane", (int) '#');
        ParkingSystem.ParkingLot parkingLot15 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking17 = null;
        boolean boolean18 = parkingLot15.assignBooking(0, booking17);
        boolean boolean20 = parkingLot15.isSpaceAvailable((int) '#');
        boolean boolean22 = parkingLot15.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace24 = parkingLot15.getParkingSpace((int) (byte) 10);
        int int25 = parkingSpace24.getSpaceId();
        ParkingSystem.Booking booking26 = parkingSpace24.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager27 = new ParkingSystem.SpaceManager();
        boolean boolean30 = spaceManager27.isSpaceAvailable("hi!", (int) '#');
        spaceManager27.toggleLot("disabled", false);
        ParkingSystem.Booking booking43 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean44 = spaceManager27.assignBooking("empty", (int) (short) 0, booking43);
        boolean boolean45 = parkingSpace24.assignBooking(booking43);
        boolean boolean46 = spaceManager8.assignBooking("2afd610d-a8cb-413a-bbee-7927f86b526c", (int) (short) 100, booking43);
        int int47 = booking43.getDuration();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(spaceManager8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(parkingSpace24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(booking26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        boolean boolean9 = client0.cancelBooking();
        java.lang.String str10 = client0.getClientId();
        boolean boolean11 = client0.getIsValidated();
        ParkingSystem.Booking booking12 = client0.getBookingDetails();
        org.junit.Assert.assertNotNull(client0);
// flaky "71) test0302(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str1, "2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "26) test0302(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(booking12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        int int22 = booking15.getSpaceId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "jane" + "'", str17, "jane");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        int int8 = booking7.getDuration();
        java.lang.String str9 = booking7.getLotId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jane" + "'", str9, "jane");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        boolean boolean24 = bookingManager0.confirmBooking("jane", "", "3b453211-7dd1-4452-8741-a206711c1217", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", 10, "jane", (int) (short) 100, "hi!", "disabled");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap31 = accountRegistry24.getManagers();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry24.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str5, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str20, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        ParkingSystem.BookingManager bookingManager19 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager20 = new ParkingSystem.CheckInManager(bookingManager19);
        ParkingSystem.Booking booking22 = bookingManager19.getBooking("");
        ParkingSystem.SpaceManager spaceManager23 = bookingManager19.getSpaceManager();
        boolean boolean33 = bookingManager19.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double35 = bookingManager19.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit36 = new ParkingSystem.DebitOrCredit();
        bookingManager19.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit36);
        boolean boolean42 = debitOrCredit36.processPayment("2afd610d-a8cb-413a-bbee-7927f86b526c", (double) 10, "", "Paid $ 10.0 with Mobile Pay");
        bookingManager18.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit36);
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
        org.junit.Assert.assertNull(booking22);
        org.junit.Assert.assertNotNull(spaceManager23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 15.0d + "'", double35 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking15 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean16 = parkingLot1.assignBooking((int) (short) -1, booking15);
        booking15.setCheckedIn(false);
        double double19 = booking15.getTotalCost();
        java.lang.String str20 = booking15.getLicensePlate();
        double double21 = booking15.getTotalCost();
        booking15.setStartTime("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "disabled" + "'", str20, "disabled");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        ParkingSystem.CheckInManager checkInManager18 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean20 = checkInManager18.checkOut("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry12 = superManager11.getRegistry();
        java.lang.Object obj15 = accountRegistry12.login("disabled", "pass");
        java.util.List<ParkingSystem.Client> clientList16 = accountRegistry12.displayPendingValidations();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry12.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(accountRegistry12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(clientList16);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        boolean boolean13 = client0.getIsValidated();
        boolean boolean21 = client0.confirmBooking("hi!", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", 0, "Paid $ 100.0 with Mobile Pay", (-1), "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "empty");
        boolean boolean22 = client0.getIsValidated();
        boolean boolean23 = client0.checkIn();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        ParkingSystem.Booking booking37 = parkingSpaceProxy22.getBookingDetails("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(parkingLotIterator18);
        org.junit.Assert.assertNotNull(parkingLotIterator19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(booking37);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        ParkingSystem.User user0 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy1 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj4 = parkingSpaceProxy1.login("empty", "Jane");
        parkingSpaceProxy1.validateClient("Jane");
        parkingSpaceProxy1.toggleSpace("", "staff", false);
        boolean boolean12 = parkingSpaceProxy1.cancelBooking("");
        user0.assignProxy(parkingSpaceProxy1);
        java.lang.Object obj16 = parkingSpaceProxy1.login("disabled", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        boolean boolean18 = parkingSpaceProxy1.cancelBooking("Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        double double7 = bookingManager0.getDeposit("staff");
        boolean boolean11 = bookingManager0.editBooking("", "Paid $ -1.0 with Mobile Pay", (int) 'a');
        boolean boolean15 = bookingManager0.editBooking("jane", "pass", (int) '4');
        boolean boolean17 = bookingManager0.cancelBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        ParkingSystem.Strategy strategy18 = null;
        bookingManager0.setPaymentStrategy(strategy18);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        ParkingSystem.Manager manager14 = superManager11.autoGenerateManager();
// flaky "72) test0315(RegressionTest0)":         superManager11.displayPendingValidations();
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
        org.junit.Assert.assertNotNull(manager14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        booking54.setCheckedIn(false);
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
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        ParkingSystem.Enabled enabled27 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot29 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking31 = null;
        boolean boolean32 = parkingLot29.assignBooking(0, booking31);
        boolean boolean34 = parkingLot29.isSpaceAvailable((int) '#');
        boolean boolean36 = parkingLot29.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace38 = parkingLot29.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking39 = parkingSpace38.getCurrentBooking();
        parkingSpace38.removeBooking();
        java.lang.String str41 = enabled27.scanSpace(parkingSpace38);
        ParkingSystem.ParkingLot parkingLot43 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking45 = null;
        boolean boolean46 = parkingLot43.assignBooking(0, booking45);
        boolean boolean48 = parkingLot43.isSpaceAvailable((int) '#');
        boolean boolean50 = parkingLot43.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace52 = parkingLot43.getParkingSpace((int) (byte) 10);
        int int53 = parkingSpace52.getSpaceId();
        ParkingSystem.Booking booking54 = parkingSpace52.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager55 = new ParkingSystem.SpaceManager();
        boolean boolean58 = spaceManager55.isSpaceAvailable("hi!", (int) '#');
        spaceManager55.toggleLot("disabled", false);
        ParkingSystem.Booking booking71 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean72 = spaceManager55.assignBooking("empty", (int) (short) 0, booking71);
        boolean boolean73 = parkingSpace52.assignBooking(booking71);
        java.lang.String str74 = enabled27.scanSpace(parkingSpace52);
        java.lang.String str75 = enabled24.scanSpace(parkingSpace52);
        ParkingSystem.Enabled enabled76 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot78 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking80 = null;
        boolean boolean81 = parkingLot78.assignBooking(0, booking80);
        boolean boolean83 = parkingLot78.isSpaceAvailable((int) '#');
        boolean boolean85 = parkingLot78.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace87 = parkingLot78.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking88 = parkingSpace87.getCurrentBooking();
        parkingSpace87.removeBooking();
        java.lang.String str90 = enabled76.scanSpace(parkingSpace87);
        java.lang.String str91 = enabled24.scanSpace(parkingSpace87);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertNull(booking39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "empty" + "'", str41, "empty");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNull(booking54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "disabled" + "'", str74, "disabled");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "disabled" + "'", str75, "disabled");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(parkingSpace87);
        org.junit.Assert.assertNull(booking88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "empty" + "'", str90, "empty");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "empty" + "'", str91, "empty");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        java.lang.String str8 = booking7.getClientId();
        java.lang.String str9 = booking7.getLotId();
        booking7.setDuration((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jane" + "'", str9, "jane");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy27 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry28 = parkingSpaceProxy27.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy30 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj33 = parkingSpaceProxy30.login("empty", "Jane");
        parkingSpaceProxy30.validateClient("Jane");
        parkingSpaceProxy30.toggleSpace("", "staff", false);
        accountRegistry28.assignProxyToManager("pass", parkingSpaceProxy30);
        boolean boolean46 = parkingSpaceProxy30.register("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "disabled", "Refunded total cost of $1.0", "", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        user0.parkingProxy = parkingSpaceProxy30;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy48 = user0.parkingProxy;
        ParkingSystem.BookingManager bookingManager49 = new ParkingSystem.BookingManager();
        double double52 = bookingManager49.calculateCost("", 0);
        user0.user = "";
        user0.register("Refunded without deposit ($0.0)", "0b35479f-5869-423e-9abc-e4ab9cef903d", "", "Refunded without deposit ($-42.0)", "staff");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(accountRegistry28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(parkingSpaceProxy48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 15.0d + "'", double52 == 15.0d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        boolean boolean6 = accountRegistry3.requiresValidation("disabled");
        ParkingSystem.Manager manager7 = accountRegistry3.autoGenerateManager();
        manager7.setManagerInfo("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "jane", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        java.lang.Class<?> wildcardClass12 = manager7.getClass();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        java.lang.String str8 = parkingSpaceProxy0.scanSpace("", "");
        java.lang.Object obj11 = parkingSpaceProxy0.login("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff");
        java.lang.Object obj14 = parkingSpaceProxy0.login("jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        boolean boolean20 = parkingSpaceProxy0.register("25527a32-01ef-45ba-816a-1d0a2fc2a52d", "disabled", "", "disabled", "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "disabled" + "'", str8, "disabled");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        java.lang.String str2 = client0.getPassword();
        boolean boolean3 = client0.getIsValidated();
        java.lang.String str4 = client0.getUsername();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "disabled" + "'", str1, "disabled");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry6 = superManager4.registry;
        java.lang.String str7 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry11 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager12 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry11);
        superManager4.registry = accountRegistry11;
        java.lang.Object obj16 = accountRegistry11.login("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-035180a0-4707-410d-a011-2a4f0f46838b");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str5, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNotNull(accountRegistry6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str7, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNotNull(superManager12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isSpaceAvailable((int) (byte) 100);
        parkingLot1.removeBooking((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Client client12 = accountRegistry8.getClient("empty");
        accountRegistry8.validateClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        java.lang.Object obj17 = accountRegistry8.login("ST001", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        accountRegistry8.validateClient("Paid $ -1.0 with Mobile Pay");
        java.util.List<ParkingSystem.Client> clientList20 = accountRegistry8.displayPendingValidations();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNull(client12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(clientList20);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getUsername();
        client0.setClientInfo("Jane", "", "pass", "pass", "pass", "hi!", true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy10 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj13 = parkingSpaceProxy10.login("empty", "Jane");
        parkingSpaceProxy10.validateClient("Jane");
        parkingSpaceProxy10.toggleSpace("", "staff", false);
        boolean boolean21 = parkingSpaceProxy10.cancelBooking("");
        boolean boolean27 = parkingSpaceProxy10.register("jane", "jane", "Jane", "hi!", "disabled");
        client0.assignProxy(parkingSpaceProxy10);
        parkingSpaceProxy10.toggleSpace("ST001", "Refunded total cost of $100.0", true);
        org.junit.Assert.assertNotNull(client0);
// flaky "73) test0326(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking11 = parkingSpace10.getCurrentBooking();
        parkingSpace10.removeBooking();
        int int13 = parkingSpace10.getSpaceId();
        ParkingSystem.Booking booking21 = new ParkingSystem.Booking("jane", "Paid $ 10.0 with Mobile Pay", (-1), "Paid $ 10.0 with Mobile Pay", (int) (short) 1, "hi!", (double) 100);
        boolean boolean22 = parkingSpace10.assignBooking(booking21);
        int int23 = booking21.getSpaceId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList72 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
// flaky "74) test0328(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "27) test0328(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(client7);
// flaky "10) test0328(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7" + "'", str8, "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry6 = superManager4.registry;
        java.lang.String str7 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry11 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager12 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry11);
        superManager4.registry = accountRegistry11;
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry11.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str5, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNotNull(accountRegistry6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str7, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNotNull(superManager12);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        superManager4.setManagerInfo("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "hi!", "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str5, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49" + "'", str6, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertNotNull(accountRegistry20);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        parkingLot1.removeBooking((int) '4');
        boolean boolean31 = parkingLot1.isSpaceAvailable((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "jane" + "'", str26, "jane");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        ParkingSystem.Booking booking14 = bookingManager12.getBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertNotNull(client0);
// flaky "75) test0332(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookingManager12);
        org.junit.Assert.assertNull(booking14);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy13 = null;
        client0.assignProxy(parkingSpaceProxy13);
        client0.setClientInfo("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "Paid $ -1.0 with Mobile Pay", "2afd610d-a8cb-413a-bbee-7927f86b526c", "2afd610d-a8cb-413a-bbee-7927f86b526c", "empty", "disabled", false);
        java.lang.String str23 = client0.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = client0.editBooking("02659ad3-0b5c-4c48-a915-a466f2b50775", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.ParkingSpaceProxy.editBooking(String, String, int)\" because \"this.parkingProxy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str23, "2afd610d-a8cb-413a-bbee-7927f86b526c");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        boolean boolean21 = bookingManager19.cancelBooking("");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ -1.0 with Mobile Pay" + "'", str6, "Paid $ -1.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertNotNull(bookingManager18);
        org.junit.Assert.assertNotNull(bookingManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        cSVManager0.updateClientValidation("empty", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList4 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = null;
        accountRegistry3.assignProxyToManager("disabled", parkingSpaceProxy6);
        boolean boolean9 = accountRegistry3.requiresValidation("disabled");
        int int10 = accountRegistry3.getManagersSize();
        java.lang.Object obj13 = accountRegistry3.login("ST001", "staff");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry3.loadManagersFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.Manager manager8 = superManager4.autoGenerateManager();
        ParkingSystem.Manager manager9 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry10 = superManager4.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry10.loadManagersFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str5, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str6, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(manager8);
        org.junit.Assert.assertNotNull(manager9);
        org.junit.Assert.assertNotNull(accountRegistry10);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Client client12 = accountRegistry8.getClient("empty");
        boolean boolean18 = accountRegistry8.registerClient("Paid $ -1.0 with Mobile Pay", "jane", "hi!", "Refunded total cost of $1.0", "");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry8.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNull(client12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getClientType();
        boolean boolean13 = client0.getIsValidated();
        java.lang.String str14 = client0.getClientId();
        org.junit.Assert.assertNotNull(client0);
// flaky "76) test0339(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jane" + "'", str1, "Jane");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        java.lang.String str12 = parkingSpace10.scanSpace();
        ParkingSystem.SpaceState spaceState13 = parkingSpace10.getState();
        int int14 = parkingSpace10.getSpaceId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "empty" + "'", str12, "empty");
        org.junit.Assert.assertNotNull(spaceState13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        superManager4.setManagerInfo("Paid $ 0.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", "Refunded total cost of $1.0");
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
        superManager4.assignProxy(parkingSpaceProxy21);
        boolean boolean33 = parkingSpaceProxy21.register("staff", "disabled", "", "", "02659ad3-0b5c-4c48-a915-a466f2b50775");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(client11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(accountRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(accountRegistry23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = null;
        cSVManager0.loadParkingLots(strMap6);
        ParkingSystem.Client client8 = ParkingSystem.Client.getInstance();
        java.lang.String str9 = client8.getClientType();
        cSVManager0.saveClient(client8);
        java.util.List<java.lang.String[]> strArrayList12 = cSVManager0.readCSV("Jane");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList13 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(client8);
// flaky "77) test0342(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "empty" + "'", str9, "empty");
        org.junit.Assert.assertNotNull(strArrayList12);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean9 = parkingLot1.isSpaceAvailable((int) (byte) 100);
        boolean boolean10 = parkingLot1.isEnabled();
        ParkingSystem.ParkingSpace parkingSpace12 = parkingLot1.getParkingSpace((-1));
        boolean boolean14 = parkingLot1.isSpaceAvailable(32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        ParkingSystem.AccountRegistry accountRegistry3 = null;
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("disabled", "staff", "staff", accountRegistry3);
        ParkingSystem.Manager manager5 = superManager4.autoGenerateManager();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry7 = parkingSpaceProxy6.getRegistry();
        java.lang.String str10 = parkingSpaceProxy6.scanSpace("empty", "hi!");
        parkingSpaceProxy6.addParkingLot("empty");
        parkingSpaceProxy6.addParkingLot("");
        superManager4.assignProxy(parkingSpaceProxy6);
        boolean boolean21 = parkingSpaceProxy6.register("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", "Refunded without deposit ($0.0)", "0b35479f-5869-423e-9abc-e4ab9cef903d", "", "jane");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(manager5);
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.toggleLot("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", true);
        spaceManager0.addParkingLot("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        parkingSpaceProxy0.toggleSpace("", "staff", false);
        boolean boolean11 = parkingSpaceProxy0.cancelBooking("");
        boolean boolean17 = parkingSpaceProxy0.register("jane", "jane", "Jane", "hi!", "disabled");
        boolean boolean19 = parkingSpaceProxy0.cancelBooking("disabled");
        parkingSpaceProxy0.autoGenerateManager();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean17 = bookingManager0.confirmBooking("pass", "disabled", "pass", "staff", (int) (short) 1, "empty", (int) '#', "hi!", "empty");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap18 = bookingManager0.getActiveBookings();
        boolean boolean28 = bookingManager0.confirmBooking("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "433f3d1f-f758-4ae3-972b-7fb179aedfd7", 2, "hi!", (int) (short) 0, "2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        ParkingSystem.Booking booking16 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean17 = spaceManager0.assignBooking("empty", (int) (short) 0, booking16);
        boolean boolean18 = booking16.isCheckedIn();
        java.lang.String str19 = booking16.getClientId();
        java.lang.String str20 = booking16.getStartTime();
        java.lang.Class<?> wildcardClass21 = booking16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Jane" + "'", str20, "Jane");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        int int10 = accountRegistry6.getManagersSize();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("disabled", "", "jane", accountRegistry6);
        superManager11.validateClient("");
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(superManager11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Client client12 = accountRegistry8.getClient("empty");
        accountRegistry8.validateClient("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        java.lang.Object obj17 = accountRegistry8.login("ST001", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        accountRegistry8.validateClient("Paid $ -1.0 with Mobile Pay");
        accountRegistry8.validateClient("433f3d1f-f758-4ae3-972b-7fb179aedfd7");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNull(client12);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        java.lang.String str13 = client0.getClientType();
        boolean boolean21 = client0.confirmBooking("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", (int) (byte) -1, "3b453211-7dd1-4452-8741-a206711c1217", (int) 'a', "CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", "");
        org.junit.Assert.assertNotNull(client0);
// flaky "78) test0351(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "disabled" + "'", str13, "disabled");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.AccountRegistry accountRegistry8 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager9 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry8);
        superManager4.registry = accountRegistry8;
        ParkingSystem.Manager manager11 = superManager4.autoGenerateManager();
        java.lang.String str12 = manager11.getPassword();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertNotNull(manager11);
// flaky "79) test0352(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "86z9Z9e0MN" + "'", str12, "86z9Z9e0MN");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("hi!", (-1.0d), "", "");
        boolean boolean10 = mobilePay0.processPayment("hi!", (double) 100, "jane", "disabled");
        java.lang.String str11 = mobilePay0.getPaymentMessage();
        boolean boolean16 = mobilePay0.processPayment("Refunded without deposit ($0.0)", (double) (-1L), "Refunded total cost of $1.0", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        boolean boolean21 = mobilePay0.processPayment("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", 1.0d, "disabled", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        boolean boolean26 = mobilePay0.processPayment("empty", 30.0d, "Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($0.0)");
        boolean boolean31 = mobilePay0.processPayment("ST001", (double) (-1L), "CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c", "Refunded total cost of $1.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str11, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        java.lang.String str9 = superManager4.getPassword();
        ParkingSystem.AccountRegistry accountRegistry13 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager14 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry13);
        boolean boolean16 = accountRegistry13.requiresValidation("disabled");
        int int17 = accountRegistry13.getManagersSize();
        boolean boolean23 = accountRegistry13.registerClient("jane", "", "", "Paid $ 10.0 with Mobile Pay", "staff");
        java.util.List<ParkingSystem.Client> clientList24 = accountRegistry13.displayPendingValidations();
        superManager4.registry = accountRegistry13;
        ParkingSystem.AccountRegistry accountRegistry32 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager33 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry32);
        ParkingSystem.AccountRegistry accountRegistry37 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager38 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry37);
        superManager33.registry = accountRegistry37;
        ParkingSystem.SuperManager superManager40 = ParkingSystem.SuperManager.createFromCSV("pass", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry37);
        superManager4.registry = accountRegistry37;
        ParkingSystem.AccountRegistry accountRegistry42 = superManager4.getRegistry();
        java.lang.Object obj45 = accountRegistry42.login("", "0b35479f-5869-423e-9abc-e4ab9cef903d");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Refunded total cost of $1.0" + "'", str9, "Refunded total cost of $1.0");
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(clientList24);
        org.junit.Assert.assertNotNull(superManager33);
        org.junit.Assert.assertNotNull(superManager38);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertNotNull(accountRegistry42);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry3.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        superManager4.displayPendingValidations();
        java.lang.String str44 = superManager4.getManagerId();
        org.junit.Assert.assertNotNull(superManager4);
// flaky "80) test0356(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str5, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
// flaky "28) test0356(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str6, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertNotNull(superManager13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "11) test0356(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str44, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        java.lang.String str8 = superManager7.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry12 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager13 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry12);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = null;
        accountRegistry12.assignProxyToManager("disabled", parkingSpaceProxy15);
        superManager7.registry = accountRegistry12;
        ParkingSystem.AccountRegistry accountRegistry18 = superManager7.getRegistry();
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("hi!", "02659ad3-0b5c-4c48-a915-a466f2b50775", "pass", accountRegistry18);
        org.junit.Assert.assertNotNull(superManager7);
// flaky "81) test0357(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str8, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertNotNull(superManager13);
        org.junit.Assert.assertNotNull(accountRegistry18);
        org.junit.Assert.assertNotNull(superManager19);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        ParkingSystem.SpaceManager spaceManager4 = bookingManager0.getSpaceManager();
        boolean boolean14 = bookingManager0.confirmBooking("disabled", "jane", "Jane", "Jane", (int) ' ', "jane", (int) (short) 100, "", "hi!");
        double double16 = bookingManager0.getDeposit("Paid $ 10.0 with Mobile Pay");
        ParkingSystem.DebitOrCredit debitOrCredit17 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit17);
        boolean boolean23 = debitOrCredit17.processPayment("25527a32-01ef-45ba-816a-1d0a2fc2a52d", (double) 'a', "4a1f2343-8b2e-4dea-ba69-efd105414390", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean13 = parkingSpaceFacade0.confirmBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", (int) (short) -1, "pass", (int) (short) 1, "Paid $ -1.0 with Mobile Pay", "hi!");
        boolean boolean23 = parkingSpaceFacade0.confirmBooking("Refunded total cost of $-1.0", "pass", "Refunded without deposit ($0.0)", "disabled", (int) (short) 100, "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", (int) (short) 1, "Refunded total cost of $1.0", "02659ad3-0b5c-4c48-a915-a466f2b50775");
        parkingSpaceFacade0.toggleLot("Refunded without deposit ($-96.0)", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        java.lang.String str12 = parkingSpace10.scanSpace();
        ParkingSystem.SpaceState spaceState13 = parkingSpace10.getState();
        ParkingSystem.Booking booking14 = parkingSpace10.getCurrentBooking();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "empty" + "'", str12, "empty");
        org.junit.Assert.assertNotNull(spaceState13);
        org.junit.Assert.assertNull(booking14);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.Manager manager5 = superManager4.autoGenerateManager();
        java.lang.String str6 = superManager4.getPassword();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.registry;
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry7.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(manager5);
// flaky "82) test0361(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str6, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertNotNull(accountRegistry7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking15 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean16 = parkingLot1.assignBooking((int) (short) -1, booking15);
        int int17 = booking15.getSpaceId();
        double double18 = booking15.getTotalCost();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        java.lang.String str43 = superManager4.getPassword();
        org.junit.Assert.assertNotNull(superManager4);
// flaky "83) test0363(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str5, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
// flaky "29) test0363(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str6, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertNotNull(superManager13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "12) test0363(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str43, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        ParkingSystem.AccountRegistry accountRegistry10 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager11 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry10);
        ParkingSystem.Manager manager12 = superManager11.autoGenerateManager();
        cSVManager0.saveManager((ParkingSystem.Manager) superManager11);
        ParkingSystem.Manager manager14 = superManager11.autoGenerateManager();
        java.lang.String str15 = manager14.getManagerId();
        java.lang.String str16 = manager14.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            manager14.validateClient("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
// flaky "84) test0364(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ParkingSystem.ParkingSpaceProxy.validateClient(String)\" because \"this.parkingProxy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(manager12);
        org.junit.Assert.assertNotNull(manager14);
// flaky "30) test0364(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "66332813-613d-4f16-845f-8415cfaaad7b" + "'", str15, "66332813-613d-4f16-845f-8415cfaaad7b");
// flaky "13) test0364(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "jiDDPq5x3c" + "'", str16, "jiDDPq5x3c");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy4 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry5 = parkingSpaceProxy4.getRegistry();
        boolean boolean7 = parkingSpaceProxy4.checkIn("");
        client0.assignProxy(parkingSpaceProxy4);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade9 = parkingSpaceProxy4.getFacade();
        parkingSpaceFacade9.toggleLot("ST001", false);
        ParkingSystem.Booking booking14 = parkingSpaceFacade9.getBookingDetails("3b453211-7dd1-4452-8741-a206711c1217");
        boolean boolean16 = parkingSpaceFacade9.checkIn("Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jane" + "'", str1, "jane");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade9);
        org.junit.Assert.assertNull(booking14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        ParkingSystem.Manager manager0 = ParkingSystem.Manager.getInstance();
        manager0.setManagerInfo("hi!", "disabled", "hi!");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy5 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj8 = parkingSpaceProxy5.login("empty", "Jane");
        parkingSpaceProxy5.validateClient("Jane");
        parkingSpaceProxy5.toggleSpace("", "staff", false);
        boolean boolean16 = parkingSpaceProxy5.cancelBooking("Jane");
        boolean boolean18 = parkingSpaceProxy5.checkOut("empty");
        boolean boolean28 = parkingSpaceProxy5.confirmBooking("2afd610d-a8cb-413a-bbee-7927f86b526c", "Paid $ -1.0 with Mobile Pay", "", "", (int) (short) 0, "disabled", 32, "", "jane");
        manager0.assignProxy(parkingSpaceProxy5);
        org.junit.Assert.assertNotNull(manager0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        java.lang.String str11 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap12 = spaceManager0.getParkingLots();
        boolean boolean15 = spaceManager0.isSpaceAvailable("staff", (int) '4');
        spaceManager0.removeBooking("Paid $ 100.0 with Mobile Pay", (int) (byte) 0);
        spaceManager0.loadParkingLots();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry9 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager10 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry9);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy12 = null;
        accountRegistry9.assignProxyToManager("disabled", parkingSpaceProxy12);
        superManager4.registry = accountRegistry9;
        ParkingSystem.AccountRegistry accountRegistry15 = superManager4.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry15.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
// flaky "85) test0368(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str5, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(accountRegistry15);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        ParkingSystem.ParkingSpace parkingSpace1 = new ParkingSystem.ParkingSpace((int) (byte) 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        int int59 = parkingSpace58.getSpaceId();
        ParkingSystem.Booking booking60 = parkingSpace58.getCurrentBooking();
        java.lang.String str61 = parkingSpace58.scanSpace();
        int int62 = parkingSpace58.getSpaceId();
        ParkingSystem.Booking booking63 = parkingSpace58.getCurrentBooking();
        java.lang.String str64 = enabled0.scanSpace(parkingSpace58);
        ParkingSystem.SpaceState spaceState65 = parkingSpace58.getState();
        java.lang.String str66 = parkingSpace58.scanSpace();
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNull(booking60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "empty" + "'", str61, "empty");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNull(booking63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "empty" + "'", str64, "empty");
        org.junit.Assert.assertNotNull(spaceState65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "empty" + "'", str66, "empty");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getPassword();
        java.lang.String str3 = client0.getClientId();
        boolean boolean4 = client0.cancelBooking();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str1, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "86) test0371(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6" + "'", str3, "CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        java.lang.String str74 = client73.getClientType();
        java.lang.String str75 = client73.getName();
        cSVManager0.saveClient(client73);
// flaky "87) test0372(RegressionTest0)":         cSVManager0.updateClientValidation("CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", true);
        cSVManager0.updateClientValidation("qPYDfDnbtD", false);
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str74, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "jane" + "'", str75, "jane");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.Booking booking3 = bookingManager0.getBooking("");
        double double5 = bookingManager0.getHourlyRate("Paid $ 10.0 with Mobile Pay");
        boolean boolean10 = bookingManager0.extendBooking("hi!", (int) (short) 1, "Paid $ 100.0 with Mobile Pay", "Jane");
        boolean boolean14 = bookingManager0.editBooking("Refunded without deposit ($-96.0)", "89de8237-29df-4908-9de4-6dc1ce90de94", (int) (byte) 1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.Class<?> wildcardClass21 = client0.getClass();
        org.junit.Assert.assertNotNull(client0);
// flaky "88) test0374(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9701df9a-2178-4ad5-8076-46ff5f05b3e8" + "'", str1, "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "31) test0374(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
// flaky "14) test0374(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9701df9a-2178-4ad5-8076-46ff5f05b3e8" + "'", str11, "9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "empty" + "'", str20, "empty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getExtraId();
        boolean boolean4 = client0.extendBooking((int) (byte) -1);
        java.lang.String str5 = client0.getClientId();
        org.junit.Assert.assertNotNull(client0);
// flaky "89) test0375(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
// flaky "32) test0375(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jane" + "'", str2, "jane");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "15) test0375(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5" + "'", str5, "CLT-5ea5e3c6-5e7b-4ad6-9ff4-2cb4f2bc1fe5");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        boolean boolean8 = parkingLotIterator7.hasNext();
        ParkingSystem.ParkingSpace parkingSpace9 = parkingLotIterator7.next();
        boolean boolean10 = parkingLotIterator7.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry12.loadSuperManagerFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager2 = parkingSpaceFacade0.getSpaceManager();
        ParkingSystem.CheckInManager checkInManager3 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean13 = parkingSpaceFacade0.confirmBooking("13b04414-31a5-407f-8ea3-fba4613c73d1", "Refunded total cost of $-1.0", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "Refunded without deposit ($0.0)", 0, "Refunded without deposit ($0.0)", (-1), "Jane", "Refunded total cost of $1.0");
        boolean boolean17 = parkingSpaceFacade0.editBooking("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", "Refunded without deposit ($-42.0)", (int) (short) 1);
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertNotNull(checkInManager3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        double double5 = bookingManager0.getHourlyRate("disabled");
        boolean boolean7 = bookingManager0.cancelBooking("13b04414-31a5-407f-8ea3-fba4613c73d1");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap8 = bookingManager0.getActiveBookings();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        boolean boolean6 = parkingSpaceFacade0.editBooking("Jane", "staff", (int) (short) 100);
        boolean boolean9 = parkingSpaceFacade0.extendBooking("empty", 100);
        ParkingSystem.SpaceManager spaceManager10 = parkingSpaceFacade0.getSpaceManager();
        ParkingSystem.Booking booking12 = parkingSpaceFacade0.getBookingDetails("433f3d1f-f758-4ae3-972b-7fb179aedfd7");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(spaceManager10);
        org.junit.Assert.assertNull(booking12);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        spaceManager0.addParkingLot("empty");
        spaceManager0.addParkingLot("13b04414-31a5-407f-8ea3-fba4613c73d1");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("Jane", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", 100, "jane", (int) (short) 1, "pass", (double) 10);
        java.lang.String str8 = booking7.getLotId();
        booking7.setStartTime("2afd610d-a8cb-413a-bbee-7927f86b526c");
        booking7.setStartTime("pass");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7aecb00c-028c-4dcf-96cc-14d25bd709ab" + "'", str8, "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking15 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean16 = parkingLot1.assignBooking((int) (short) -1, booking15);
        java.lang.String str17 = booking15.getLotId();
        java.lang.String str18 = booking15.getLicensePlate();
        booking15.setStartTime("hi!");
        java.lang.String str21 = booking15.getLotId();
        booking15.setCheckedIn(true);
        booking15.setDuration(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "jane" + "'", str17, "jane");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jane" + "'", str21, "jane");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        ParkingSystem.MobilePay mobilePay4 = new ParkingSystem.MobilePay();
        boolean boolean9 = mobilePay4.processPayment("hi!", (-1.0d), "", "");
        boolean boolean14 = mobilePay4.processPayment("staff", (double) (-1L), "disabled", "pass");
        paymentManager0.setStrategy((ParkingSystem.Strategy) mobilePay4);
        boolean boolean20 = mobilePay4.processPayment("Paid $ -1.0 with Mobile Pay", 1470.0d, "Paid $ 0.0 with Mobile Pay", "Refunded total cost of $1.0");
        java.lang.String str21 = mobilePay4.getPaymentMessage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Paid $ 1470.0 with Mobile Pay" + "'", str21, "Paid $ 1470.0 with Mobile Pay");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean7 = parkingSpaceFacade0.editBooking("Card number should be 16 digits", "", (int) (short) 0);
        java.lang.String str10 = parkingSpaceFacade0.scanSpace("staff", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        parkingSpaceFacade0.addParkingLot("7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        ParkingSystem.CheckInManager checkInManager13 = parkingSpaceFacade0.getCheckInManager();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNotNull(checkInManager13);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        ParkingSystem.AccountRegistry accountRegistry11 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager12 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry11);
        superManager7.registry = accountRegistry11;
        ParkingSystem.SuperManager superManager14 = ParkingSystem.SuperManager.createFromCSV("pass", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry11);
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap15 = accountRegistry11.getManagers();
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertNotNull(superManager12);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray1 = cSVManager0.loadSuperManager();
        java.lang.String[] strArray2 = cSVManager0.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade3.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = spaceManager4.getParkingLots();
        cSVManager0.saveParkingLots(strMap5);
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.updateClientValidation("3b453211-7dd1-4452-8741-a206711c1217", true);
// flaky "90) test0387(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
// flaky "33) test0387(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "16) test0387(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        boolean boolean7 = parkingSpaceProxy0.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean11 = parkingSpaceProxy0.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        parkingSpaceProxy0.toggleLot("Paid $ -1.0 with Mobile Pay", false);
        parkingSpaceProxy0.addParkingLot("");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        parkingLot1.removeBooking((int) ' ');
        ParkingSystem.ParkingSpace parkingSpace11 = parkingLot1.getParkingSpace(0);
        ParkingSystem.SpaceState spaceState12 = parkingSpace11.getState();
        ParkingSystem.Enabled enabled13 = new ParkingSystem.Enabled();
        ParkingSystem.ParkingLot parkingLot15 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking17 = null;
        boolean boolean18 = parkingLot15.assignBooking(0, booking17);
        boolean boolean20 = parkingLot15.isSpaceAvailable((int) '#');
        boolean boolean22 = parkingLot15.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace24 = parkingLot15.getParkingSpace((int) (byte) 10);
        ParkingSystem.Booking booking25 = parkingSpace24.getCurrentBooking();
        parkingSpace24.removeBooking();
        java.lang.String str27 = enabled13.scanSpace(parkingSpace24);
        ParkingSystem.ParkingLot parkingLot29 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking31 = null;
        boolean boolean32 = parkingLot29.assignBooking(0, booking31);
        boolean boolean34 = parkingLot29.isSpaceAvailable((int) '#');
        boolean boolean36 = parkingLot29.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace38 = parkingLot29.getParkingSpace((int) (byte) 10);
        int int39 = parkingSpace38.getSpaceId();
        ParkingSystem.Booking booking40 = parkingSpace38.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager41 = new ParkingSystem.SpaceManager();
        boolean boolean44 = spaceManager41.isSpaceAvailable("hi!", (int) '#');
        spaceManager41.toggleLot("disabled", false);
        ParkingSystem.Booking booking57 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean58 = spaceManager41.assignBooking("empty", (int) (short) 0, booking57);
        boolean boolean59 = parkingSpace38.assignBooking(booking57);
        java.lang.String str60 = enabled13.scanSpace(parkingSpace38);
        boolean boolean61 = parkingSpace38.isAvailable();
        ParkingSystem.SpaceState spaceState62 = parkingSpace38.getState();
        java.lang.String str63 = spaceState12.scanSpace(parkingSpace38);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNotNull(spaceState12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(parkingSpace24);
        org.junit.Assert.assertNull(booking25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "empty" + "'", str27, "empty");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNull(booking40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "disabled" + "'", str60, "disabled");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(spaceState62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "disabled" + "'", str63, "disabled");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean4 = paymentManager0.refundWithoutDeposit((double) (short) 10, (double) '4');
        boolean boolean6 = paymentManager0.refundDeposit((double) (short) 0);
        boolean boolean8 = paymentManager0.refundTotalCost(0.0d);
        ParkingSystem.MobilePay mobilePay9 = new ParkingSystem.MobilePay();
        java.lang.String str10 = mobilePay9.getPaymentMessage();
        boolean boolean15 = mobilePay9.processPayment("CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", (double) 10, "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "02659ad3-0b5c-4c48-a915-a466f2b50775");
        java.lang.String str16 = mobilePay9.getPaymentMessage();
        paymentManager0.setStrategy((ParkingSystem.Strategy) mobilePay9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str16, "Paid $ 10.0 with Mobile Pay");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        int int22 = accountRegistry3.getManagersSize();
        java.util.Map<java.lang.String, ParkingSystem.Manager> strMap23 = accountRegistry3.getManagers();
        ParkingSystem.CSVManager cSVManager25 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray26 = cSVManager25.loadSuperManager();
        java.lang.String[] strArray27 = cSVManager25.loadSuperManager();
        ParkingSystem.Client client28 = ParkingSystem.Client.getInstance();
        java.lang.String str29 = client28.getName();
        client28.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy32 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry33 = parkingSpaceProxy32.getRegistry();
        boolean boolean35 = parkingSpaceProxy32.checkIn("");
        client28.assignProxy(parkingSpaceProxy32);
        boolean boolean37 = client28.cancelBooking();
        java.lang.String str38 = client28.getExtraId();
        java.lang.String str39 = client28.getName();
        client28.setClientInfo("pass", "empty", "Jane", "pass", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Refunded total cost of $1.0", false);
        cSVManager25.saveClient(client28);
        ParkingSystem.AccountRegistry accountRegistry52 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager53 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry52);
        ParkingSystem.AccountRegistry accountRegistry57 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager58 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry57);
        superManager53.registry = accountRegistry57;
        ParkingSystem.Manager manager60 = superManager53.autoGenerateManager();
        java.lang.String str61 = manager60.getManagerId();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy65 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry66 = parkingSpaceProxy65.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy68 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj71 = parkingSpaceProxy68.login("empty", "Jane");
        parkingSpaceProxy68.validateClient("Jane");
        parkingSpaceProxy68.toggleSpace("", "staff", false);
        accountRegistry66.assignProxyToManager("pass", parkingSpaceProxy68);
        ParkingSystem.Client client80 = accountRegistry66.getClient("");
        ParkingSystem.SuperManager superManager81 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry66);
        boolean boolean87 = accountRegistry66.registerClient("hi!", "Refunded total cost of $1.0", "2afd610d-a8cb-413a-bbee-7927f86b526c", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy89 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry90 = parkingSpaceProxy89.getRegistry();
        boolean boolean92 = parkingSpaceProxy89.checkIn("");
        parkingSpaceProxy89.toggleLot("", true);
        accountRegistry66.assignProxyToManager("", parkingSpaceProxy89);
        manager60.assignProxy(parkingSpaceProxy89);
        client28.assignProxy(parkingSpaceProxy89);
        accountRegistry3.assignProxyToClient("pass", parkingSpaceProxy89);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strArray26);
// flaky "91) test0391(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray27);
// flaky "34) test0391(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "empty" + "'", str29, "empty");
        org.junit.Assert.assertNotNull(accountRegistry33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "jane" + "'", str38, "jane");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "empty" + "'", str39, "empty");
        org.junit.Assert.assertNotNull(superManager53);
        org.junit.Assert.assertNotNull(superManager58);
        org.junit.Assert.assertNotNull(manager60);
// flaky "17) test0391(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "83a51dc6-0c8f-4f21-ae40-68699828f95d" + "'", str61, "83a51dc6-0c8f-4f21-ae40-68699828f95d");
        org.junit.Assert.assertNotNull(accountRegistry66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(client80);
        org.junit.Assert.assertNotNull(superManager81);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(accountRegistry90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.lang.String str53 = parkingSpace28.scanSpace();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "disabled" + "'", str53, "disabled");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        boolean boolean19 = parkingSpaceFacade17.checkOut("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        ParkingSystem.BookingManager bookingManager20 = parkingSpaceFacade17.getBookingManager();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookingManager20);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str3 = parkingSpaceFacade0.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        spaceManager4.addParkingLot("hi!");
        boolean boolean9 = spaceManager4.isSpaceAvailable("Paid $ 0.0 with Mobile Pay", (int) ' ');
        spaceManager4.toggleSpace("89de8237-29df-4908-9de4-6dc1ce90de94", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy6 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj9 = parkingSpaceProxy6.login("empty", "Jane");
        parkingSpaceProxy6.validateClient("Jane");
        parkingSpaceProxy6.toggleSpace("", "staff", false);
        accountRegistry4.assignProxyToManager("pass", parkingSpaceProxy6);
        ParkingSystem.Client client18 = accountRegistry4.getClient("");
        ParkingSystem.SuperManager superManager19 = ParkingSystem.SuperManager.createFromCSV("", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry4);
        ParkingSystem.AccountRegistry accountRegistry20 = superManager19.registry;
        java.lang.String str21 = superManager19.getPassword();
        superManager19.setManagerInfo("09622cbf-e665-45db-b1ad-365065947a20", "Paid $ 1470.0 with Mobile Pay", "CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6");
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(client18);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertNotNull(accountRegistry20);
// flaky "92) test0395(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str21, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        client0.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str10 = client0.getUsername();
        java.lang.String str11 = client0.getPassword();
        java.lang.String str12 = client0.getUsername();
        boolean boolean13 = client0.checkIn();
        boolean boolean14 = client0.checkIn();
        boolean boolean15 = client0.getIsValidated();
        java.lang.String str16 = client0.getUsername();
        org.junit.Assert.assertNotNull(client0);
// flaky "93) test0396(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        paymentManager0.refundMessage = "9701df9a-2178-4ad5-8076-46ff5f05b3e8";
        boolean boolean30 = paymentManager0.refundWithoutDeposit((double) 10L, (double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(spaceManager9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Refunded total cost of $-1.0" + "'", str25, "Refunded total cost of $-1.0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        ParkingSystem.SpaceState spaceState50 = parkingSpace9.getState();
        java.lang.String str51 = parkingSpace9.scanSpace();
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
        org.junit.Assert.assertNotNull(spaceState50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "disabled" + "'", str51, "disabled");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        boolean boolean21 = parkingSpaceProxy10.confirmBooking("staff", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "", "Paid $ -1.0 with Mobile Pay", 10, "Refunded without deposit ($0.0)", (int) (short) 0, "Paid $ 0.0 with Mobile Pay", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        boolean boolean27 = parkingSpaceProxy10.register("Refunded without deposit ($0.0)", "disabled", "06b0adae-5a80-41cd-b7f6-6da51afdd4f5", "06b0adae-5a80-41cd-b7f6-6da51afdd4f5", "433f3d1f-f758-4ae3-972b-7fb179aedfd7");
        org.junit.Assert.assertNotNull(client0);
// flaky "94) test0399(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getClientType();
        org.junit.Assert.assertNotNull(client0);
// flaky "95) test0400(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str1, "Paid $ 10.0 with Mobile Pay");
// flaky "35) test0400(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str2, "Paid $ 10.0 with Mobile Pay");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        java.lang.String str11 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        spaceManager0.addParkingLot("Refunded total cost of $1.0");
        spaceManager0.addParkingLot("hi!");
        ParkingSystem.ParkingLot parkingLot19 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking21 = null;
        boolean boolean22 = parkingLot19.assignBooking(0, booking21);
        boolean boolean24 = parkingLot19.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator25 = parkingLot19.getIterator();
        boolean boolean26 = parkingLotIterator25.hasNext();
        ParkingSystem.ParkingSpace parkingSpace27 = parkingLotIterator25.next();
        ParkingSystem.SpaceManager spaceManager28 = new ParkingSystem.SpaceManager();
        boolean boolean31 = spaceManager28.isSpaceAvailable("hi!", (int) '#');
        spaceManager28.toggleLot("disabled", false);
        ParkingSystem.Booking booking44 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean45 = spaceManager28.assignBooking("empty", (int) (short) 0, booking44);
        ParkingSystem.SpaceManager spaceManager48 = new ParkingSystem.SpaceManager();
        boolean boolean51 = spaceManager48.isSpaceAvailable("hi!", (int) '#');
        spaceManager48.toggleLot("disabled", false);
        ParkingSystem.Booking booking64 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean65 = spaceManager48.assignBooking("empty", (int) (short) 0, booking64);
        boolean boolean66 = spaceManager28.assignBooking("disabled", (int) (byte) 0, booking64);
        boolean boolean67 = parkingSpace27.assignBooking(booking64);
        int int68 = booking64.getSpaceId();
        boolean boolean69 = spaceManager0.assignBooking("empty", (int) (byte) 1, booking64);
        java.lang.String str70 = booking64.getClientId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parkingSpace27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "staff" + "'", str70, "staff");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        int int63 = booking57.getDuration();
        java.lang.Class<?> wildcardClass64 = booking57.getClass();
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 32 + "'", int63 == 32);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        parkingSpaceProxy0.toggleSpace("", "staff", false);
        boolean boolean11 = parkingSpaceProxy0.cancelBooking("");
        parkingSpaceProxy0.validateClient("Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleSpace("pass", "staff", true);
        parkingSpaceFacade0.addParkingLot("Jane");
        boolean boolean12 = parkingSpaceFacade0.checkIn("Paid $ 1470.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        boolean boolean6 = parkingSpaceProxy0.extendBooking("pass", 0);
        boolean boolean8 = parkingSpaceProxy0.checkOut("Paid $ 10.0 with Mobile Pay");
        java.lang.String str11 = parkingSpaceProxy0.scanSpace("hi!", "Jane");
        boolean boolean17 = parkingSpaceProxy0.register("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", "pass", "Paid $ 100.0 with Mobile Pay", "CLT-035180a0-4707-410d-a011-2a4f0f46838b", "TXCrKOGD");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        boolean boolean6 = parkingSpaceFacade0.editBooking("Jane", "staff", (int) (short) 100);
        boolean boolean8 = parkingSpaceFacade0.cancelBooking("jane");
        boolean boolean10 = parkingSpaceFacade0.checkIn("Card number should be 16 digits");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getName();
        java.lang.String str2 = client0.getClientId();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.toggleSpace("jane", "Paid $ 10.0 with Mobile Pay", true);
        client0.assignProxy(parkingSpaceProxy3);
        boolean boolean12 = client0.getIsValidated();
        org.junit.Assert.assertNotNull(client0);
// flaky "96) test0407(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "36) test0407(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc" + "'", str2, "CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        paymentManager0.refundMessage = "disabled";
        boolean boolean10 = paymentManager0.processPayment("", (double) 0L, "Paid $ 10.0 with Mobile Pay", "pass");
        boolean boolean13 = paymentManager0.refundWithoutDeposit(165.0d, 10.0d);
        java.lang.Class<?> wildcardClass14 = paymentManager0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        ParkingSystem.Booking booking5 = bookingManager0.getBooking("");
        double double7 = bookingManager0.getDeposit("staff");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap8 = bookingManager0.getActiveBookings();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.lang.String str62 = superManager4.getName();
        org.junit.Assert.assertNotNull(superManager4);
// flaky "97) test0410(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str5, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
// flaky "37) test0410(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str6, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
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
// flaky "18) test0410(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "disabled" + "'", str41, "disabled");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "disabled" + "'", str46, "disabled");
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean6 = parkingSpaceFacade0.extendBooking("disabled", 0);
        boolean boolean16 = parkingSpaceFacade0.confirmBooking("Refunded without deposit ($-42.0)", "Refunded without deposit ($-42.0)", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Paid $ 100.0 with Mobile Pay", (int) '#', "CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", 0, "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "Paid $ 10.0 with Mobile Pay");
        boolean boolean26 = parkingSpaceFacade0.confirmBooking("CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", "86z9Z9e0MN", "CLT-d2153556-bc61-49e7-b73d-6af2a45e5167", "83a51dc6-0c8f-4f21-ae40-68699828f95d", (int) (byte) 1, "13b04414-31a5-407f-8ea3-fba4613c73d1", 1, "empty", "jane");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.paymentMessage = "staff";
        paymentManager0.paymentMessage = "hi!";
        boolean boolean9 = paymentManager0.processPayment("13b04414-31a5-407f-8ea3-fba4613c73d1", (double) 1L, "06b0adae-5a80-41cd-b7f6-6da51afdd4f5", "13b04414-31a5-407f-8ea3-fba4613c73d1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        spaceManager0.toggleLot("disabled", false);
        ParkingSystem.Booking booking16 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean17 = spaceManager0.assignBooking("empty", (int) (short) 0, booking16);
        ParkingSystem.SpaceManager spaceManager20 = new ParkingSystem.SpaceManager();
        boolean boolean23 = spaceManager20.isSpaceAvailable("hi!", (int) '#');
        spaceManager20.toggleLot("disabled", false);
        ParkingSystem.Booking booking36 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean37 = spaceManager20.assignBooking("empty", (int) (short) 0, booking36);
        boolean boolean38 = spaceManager0.assignBooking("disabled", (int) (byte) 0, booking36);
        booking36.setStartTime("Jane");
        int int41 = booking36.getSpaceId();
        boolean boolean42 = booking36.isCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean4 = paymentManager0.refundWithoutDeposit((double) (short) 10, (double) '4');
        boolean boolean6 = paymentManager0.refundDeposit((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = paymentManager0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        parkingSpaceProxy0.toggleSpace("", "staff", false);
        boolean boolean11 = parkingSpaceProxy0.cancelBooking("");
        java.lang.String str14 = parkingSpaceProxy0.scanSpace("staff", "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        boolean boolean17 = parkingSpaceProxy0.extendBooking("jane", (int) ' ');
        boolean boolean20 = parkingSpaceProxy0.extendBooking("Refunded without deposit ($-42.0)", (int) '4');
        java.lang.Class<?> wildcardClass21 = parkingSpaceProxy0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disabled" + "'", str14, "disabled");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy2 = user0.parkingProxy;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy3.getRegistry();
        boolean boolean6 = parkingSpaceProxy3.checkIn("");
        parkingSpaceProxy3.validateClient("");
        user0.assignProxy(parkingSpaceProxy3);
        boolean boolean12 = parkingSpaceProxy3.extendBooking("Paid $ 100.0 with Mobile Pay", 0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking2 = parkingSpaceProxy0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = parkingSpaceProxy0.getFacade();
        boolean boolean5 = parkingSpaceProxy0.checkOut("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy0.autoGenerateManager();
        parkingSpaceProxy0.validateClient("");
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(parkingSpaceFacade3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.Manager manager5 = superManager4.autoGenerateManager();
        java.lang.String str6 = superManager4.getPassword();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.registry;
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        boolean boolean14 = accountRegistry8.registerClient("CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6", "83a51dc6-0c8f-4f21-ae40-68699828f95d", "09622cbf-e665-45db-b1ad-365065947a20", "Refunded total cost of $1.0", "4a1f2343-8b2e-4dea-ba69-efd105414390");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(manager5);
// flaky "98) test0419(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str6, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str3 = parkingSpaceFacade0.scanSpace("disabled", "empty");
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        java.lang.String str7 = spaceManager4.scanSpace("hi!", "Jane");
        ParkingSystem.ParkingLot parkingLot11 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking13 = null;
        boolean boolean14 = parkingLot11.assignBooking(0, booking13);
        boolean boolean16 = parkingLot11.isSpaceAvailable((int) '#');
        boolean boolean18 = parkingLot11.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace20 = parkingLot11.getParkingSpace((int) (byte) 10);
        int int21 = parkingSpace20.getSpaceId();
        ParkingSystem.Booking booking22 = parkingSpace20.getCurrentBooking();
        java.lang.String str23 = parkingSpace20.scanSpace();
        int int24 = parkingSpace20.getSpaceId();
        ParkingSystem.SpaceManager spaceManager25 = new ParkingSystem.SpaceManager();
        boolean boolean28 = spaceManager25.isSpaceAvailable("hi!", (int) '#');
        spaceManager25.toggleLot("disabled", false);
        ParkingSystem.Booking booking41 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean42 = spaceManager25.assignBooking("empty", (int) (short) 0, booking41);
        java.lang.String str43 = booking41.getClientId();
        boolean boolean44 = parkingSpace20.assignBooking(booking41);
        boolean boolean45 = spaceManager4.assignBooking("", (int) (short) 1, booking41);
        ParkingSystem.SpaceManager spaceManager48 = new ParkingSystem.SpaceManager();
        boolean boolean51 = spaceManager48.isSpaceAvailable("hi!", (int) '#');
        spaceManager48.toggleLot("disabled", false);
        ParkingSystem.Booking booking64 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean65 = spaceManager48.assignBooking("empty", (int) (short) 0, booking64);
        boolean boolean66 = booking64.isCheckedIn();
        booking64.setCheckedIn(true);
        boolean boolean69 = spaceManager4.assignBooking("Paid $ 15.0 with Mobile Pay", (int) (short) 1, booking64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disabled" + "'", str7, "disabled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(booking22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "empty" + "'", str23, "empty");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "staff" + "'", str43, "staff");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        spaceManager4.addParkingLot("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        spaceManager4.removeBooking("25527a32-01ef-45ba-816a-1d0a2fc2a52d", (int) (byte) 0);
        spaceManager4.toggleLot("Refunded without deposit ($-96.0)", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        spaceManager0.loadParkingLots();
        java.lang.String str12 = spaceManager0.scanSpace("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Jane");
        spaceManager0.toggleLot("Refunded without deposit ($-42.0)", true);
        spaceManager0.toggleSpace("86z9Z9e0MN", "Jane", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disabled" + "'", str12, "disabled");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.lang.String str74 = client73.getClientType();
        java.lang.String str75 = client73.getName();
        cSVManager0.saveClient(client73);
        java.lang.String str77 = client73.getName();
        boolean boolean78 = client73.getIsValidated();
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
// flaky "99) test0423(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "09622cbf-e665-45db-b1ad-365065947a20" + "'", str74, "09622cbf-e665-45db-b1ad-365065947a20");
// flaky "38) test0423(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "TXCrKOGD" + "'", str75, "TXCrKOGD");
// flaky "19) test0423(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "TXCrKOGD" + "'", str77, "TXCrKOGD");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("disabled", 10.0d, "disabled", "disabled");
        boolean boolean10 = mobilePay0.processPayment("jane", 15.0d, "jane", "");
        boolean boolean15 = mobilePay0.processPayment("", (double) 0, "Refunded without deposit ($-42.0)", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        java.lang.String str16 = mobilePay0.getPaymentMessage();
        java.lang.String str17 = mobilePay0.getPaymentMessage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str16, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str17, "Paid $ 0.0 with Mobile Pay");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean7 = bookingManager0.editBooking("Jane", "empty", 10);
        boolean boolean12 = bookingManager0.extendBooking("CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", (int) (short) 100, "Refunded total cost of $-1.0", "2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        ParkingSystem.SpaceManager spaceManager47 = new ParkingSystem.SpaceManager();
        boolean boolean50 = spaceManager47.isSpaceAvailable("hi!", (int) '#');
        spaceManager47.toggleLot("disabled", false);
        ParkingSystem.Booking booking63 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean64 = spaceManager47.assignBooking("empty", (int) (short) 0, booking63);
        ParkingSystem.SpaceManager spaceManager67 = new ParkingSystem.SpaceManager();
        boolean boolean70 = spaceManager67.isSpaceAvailable("hi!", (int) '#');
        spaceManager67.toggleLot("disabled", false);
        ParkingSystem.Booking booking83 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean84 = spaceManager67.assignBooking("empty", (int) (short) 0, booking83);
        boolean boolean85 = spaceManager47.assignBooking("disabled", (int) (byte) 0, booking83);
        boolean boolean86 = parkingSpace25.assignBooking(booking83);
        java.lang.String str87 = booking83.getLotId();
        boolean boolean88 = parkingSpace11.assignBooking(booking83);
        java.lang.String str89 = booking83.getLicensePlate();
        java.lang.String str90 = booking83.getStartTime();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "jane" + "'", str87, "jane");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "disabled" + "'", str89, "disabled");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Jane" + "'", str90, "Jane");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        boolean boolean3 = spaceManager0.isSpaceAvailable("hi!", (int) '#');
        java.lang.String str6 = spaceManager0.scanSpace("disabled", "");
        spaceManager0.addParkingLot("hi!");
        java.lang.String str11 = spaceManager0.scanSpace("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay");
        spaceManager0.toggleLot("pass", true);
        spaceManager0.addParkingLot("pass");
        java.lang.String str19 = spaceManager0.scanSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "Refunded total cost of $1.0");
        spaceManager0.toggleLot("Paid $ 100.0 with Mobile Pay", true);
        spaceManager0.toggleSpace("CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.Booking booking2 = parkingSpaceProxy0.getBookingDetails("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade3 = parkingSpaceProxy0.getFacade();
        ParkingSystem.AccountRegistry accountRegistry4 = parkingSpaceProxy0.getRegistry();
        java.util.List<ParkingSystem.Client> clientList5 = accountRegistry4.displayPendingValidations();
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNotNull(parkingSpaceFacade3);
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertNotNull(clientList5);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.lang.Object obj14 = user0.user;
        ParkingSystem.User user15 = new ParkingSystem.User();
        java.lang.Object obj16 = user15.user;
        ParkingSystem.Client client17 = ParkingSystem.Client.getInstance();
        java.lang.String str18 = client17.getName();
        client17.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy21 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry22 = parkingSpaceProxy21.getRegistry();
        boolean boolean24 = parkingSpaceProxy21.checkIn("");
        client17.assignProxy(parkingSpaceProxy21);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade26 = parkingSpaceProxy21.getFacade();
        user15.assignProxy(parkingSpaceProxy21);
        java.lang.String str30 = parkingSpaceProxy21.scanSpace("disabled", "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        parkingSpaceProxy21.toggleLot("empty", true);
        parkingSpaceProxy21.toggleSpace("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Card number should be 16 digits", true);
        user0.parkingProxy = parkingSpaceProxy21;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy39 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj42 = parkingSpaceProxy39.login("empty", "Jane");
        boolean boolean45 = parkingSpaceProxy39.extendBooking("pass", 0);
        boolean boolean47 = parkingSpaceProxy39.checkOut("Paid $ 10.0 with Mobile Pay");
        user0.parkingProxy = parkingSpaceProxy39;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNotNull(accountRegistry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parkingSpaceProxy10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(client17);
// flaky "100) test0429(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Card number should be 16 digits" + "'", str18, "Card number should be 16 digits");
        org.junit.Assert.assertNotNull(accountRegistry22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "disabled" + "'", str30, "disabled");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        boolean boolean7 = parkingSpaceProxy0.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        parkingSpaceProxy0.toggleSpace("CLT-d45cbb33-f273-4b7c-a70f-0ed3be87451f", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", true);
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        java.lang.String str2 = client0.getUsername();
        client0.setValidated(false);
        client0.setClientInfo("staff", "Refunded total cost of $1.0", "9701df9a-2178-4ad5-8076-46ff5f05b3e8", "Jane", "Paid $ 10.0 with Mobile Pay", "Paid $ 0.0 with Mobile Pay", true);
        boolean boolean15 = client0.editBooking("Paid $ 10.0 with Mobile Pay", 0);
        boolean boolean16 = client0.checkOut();
        client0.setClientInfo("jane", "disabled", "", "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Paid $ 100.0 with Mobile Pay", "Refunded without deposit ($0.0)", false);
        java.lang.String str25 = client0.getExtraId();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "empty" + "'", str1, "empty");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "disabled" + "'", str2, "disabled");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Refunded without deposit ($0.0)" + "'", str25, "Refunded without deposit ($0.0)");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean7 = parkingSpaceFacade0.editBooking("Card number should be 16 digits", "", (int) (short) 0);
        parkingSpaceFacade0.toggleSpace("Paid $ 10.0 with Mobile Pay", "Refunded total cost of $1.0", true);
        parkingSpaceFacade0.toggleSpace("Refunded without deposit ($-42.0)", "Refunded total cost of $1.0", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.Booking booking3 = parkingSpaceFacade0.getBookingDetails("Paid $ 100.0 with Mobile Pay");
        ParkingSystem.BookingManager bookingManager4 = parkingSpaceFacade0.getBookingManager();
        boolean boolean8 = parkingSpaceFacade0.editBooking("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "pass", 0);
        boolean boolean10 = parkingSpaceFacade0.checkOut("Refunded total cost of $100.0");
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(bookingManager4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager1 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleLot("hi!", false);
        boolean boolean8 = parkingSpaceFacade0.editBooking("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "Paid $ -1.0 with Mobile Pay", 1);
        boolean boolean10 = parkingSpaceFacade0.checkOut("Paid $ -1.0 with Mobile Pay");
        ParkingSystem.SpaceManager spaceManager11 = parkingSpaceFacade0.getSpaceManager();
        org.junit.Assert.assertNotNull(spaceManager1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(spaceManager11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = null;
        cSVManager0.loadParkingLots(strMap6);
        ParkingSystem.Client client8 = ParkingSystem.Client.getInstance();
        java.lang.String str9 = client8.getClientType();
        cSVManager0.saveClient(client8);
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.updateClientValidation("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(client8);
// flaky "101) test0435(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean2 = parkingSpaceFacade0.checkIn("");
        ParkingSystem.BookingManager bookingManager3 = parkingSpaceFacade0.getBookingManager();
        boolean boolean6 = parkingSpaceFacade0.extendBooking("disabled", 0);
        parkingSpaceFacade0.toggleSpace("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "", false);
        boolean boolean20 = parkingSpaceFacade0.confirmBooking("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "CLT-cef4e11f-bc4f-4469-a240-c82b3dc24841", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "Refunded without deposit ($0.0)", (int) (byte) -1, "433f3d1f-f758-4ae3-972b-7fb179aedfd7", 0, "Paid $ -1.0 with Mobile Pay", "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        ParkingSystem.SpaceManager spaceManager21 = parkingSpaceFacade0.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap22 = spaceManager21.getParkingLots();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookingManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(spaceManager21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("disabled", 10.0d, "disabled", "disabled");
        java.lang.String str6 = mobilePay0.getPaymentMessage();
        boolean boolean11 = mobilePay0.processPayment("disabled", (double) (-1.0f), "jane", "Refunded without deposit ($0.0)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str6, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean7 = parkingLot1.isEnabled();
        boolean boolean8 = parkingLot1.isEnabled();
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) ' ');
        ParkingSystem.ParkingLot parkingLot12 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking14 = null;
        boolean boolean15 = parkingLot12.assignBooking(0, booking14);
        boolean boolean17 = parkingLot12.isSpaceAvailable((int) '#');
        boolean boolean19 = parkingLot12.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace21 = parkingLot12.getParkingSpace((int) (byte) 10);
        int int22 = parkingSpace21.getSpaceId();
        ParkingSystem.Booking booking23 = parkingSpace21.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager24 = new ParkingSystem.SpaceManager();
        boolean boolean27 = spaceManager24.isSpaceAvailable("hi!", (int) '#');
        spaceManager24.toggleLot("disabled", false);
        ParkingSystem.Booking booking40 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean41 = spaceManager24.assignBooking("empty", (int) (short) 0, booking40);
        boolean boolean42 = parkingSpace21.assignBooking(booking40);
        ParkingSystem.SpaceManager spaceManager43 = new ParkingSystem.SpaceManager();
        boolean boolean46 = spaceManager43.isSpaceAvailable("hi!", (int) '#');
        spaceManager43.toggleLot("disabled", false);
        ParkingSystem.Booking booking59 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean60 = spaceManager43.assignBooking("empty", (int) (short) 0, booking59);
        boolean boolean61 = booking59.isCheckedIn();
        java.lang.String str62 = booking59.getClientId();
        boolean boolean63 = parkingSpace21.assignBooking(booking59);
        boolean boolean64 = parkingSpace10.assignBooking(booking59);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(booking23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "staff" + "'", str62, "staff");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("Card number should be 16 digits");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        ParkingSystem.AccountRegistry accountRegistry20 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager21 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry20);
        boolean boolean23 = accountRegistry20.requiresValidation("disabled");
        int int24 = accountRegistry20.getManagersSize();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy26 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj29 = parkingSpaceProxy26.login("empty", "Jane");
        parkingSpaceProxy26.validateClient("Jane");
        parkingSpaceProxy26.toggleSpace("", "staff", false);
        boolean boolean37 = parkingSpaceProxy26.cancelBooking("Jane");
        accountRegistry20.assignProxyToClient("pass", parkingSpaceProxy26);
        boolean boolean44 = parkingSpaceProxy26.register("Jane", "Paid $ -1.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", "", "Refunded total cost of $1.0");
        boolean boolean50 = parkingSpaceProxy26.register("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "jane", "", "jane", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
        java.lang.String str53 = parkingSpaceProxy26.scanSpace("13b04414-31a5-407f-8ea3-fba4613c73d1", "Jane");
        client0.assignProxy(parkingSpaceProxy26);
        parkingSpaceProxy26.toggleLot("Card number should be 16 digits", false);
        org.junit.Assert.assertNotNull(client0);
// flaky "102) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str1, "2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertNotNull(accountRegistry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "39) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7aecb00c-028c-4dcf-96cc-14d25bd709ab" + "'", str10, "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
// flaky "20) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str11, "2afd610d-a8cb-413a-bbee-7927f86b526c");
// flaky "6) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str12, "2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str13, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(superManager21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "disabled" + "'", str53, "disabled");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        // The following exception was thrown during execution in test generation
        try {
            cSVManager0.updateClientValidation("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", false);
// flaky "103) test0441(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
// flaky "40) test0441(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray2);
// flaky "21) test0441(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(client3);
// flaky "7) test0441(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "empty" + "'", str4, "empty");
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "1) test0441(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "jane" + "'", str13, "jane");
// flaky "1) test0441(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "empty" + "'", str14, "empty");
        org.junit.Assert.assertNotNull(client24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "empty" + "'", str25, "empty");
        org.junit.Assert.assertNull(booking28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Jane" + "'", str29, "Jane");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Jane" + "'", str30, "Jane");
        org.junit.Assert.assertNull(booking31);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.validateClient("Jane");
        parkingSpaceProxy3.toggleSpace("", "staff", false);
        boolean boolean14 = parkingSpaceProxy3.cancelBooking("");
        boolean boolean20 = parkingSpaceProxy3.register("jane", "jane", "Jane", "hi!", "disabled");
        accountRegistry1.assignProxyToManager("empty", parkingSpaceProxy3);
        ParkingSystem.Client client23 = accountRegistry1.getClient("Paid $ 100.0 with Mobile Pay");
        ParkingSystem.Client client25 = ParkingSystem.Client.getInstance();
        java.lang.String str26 = client25.getName();
        client25.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str35 = client25.getUsername();
        java.lang.String str36 = client25.getPassword();
        java.lang.String str37 = client25.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy38 = null;
        client25.assignProxy(parkingSpaceProxy38);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy40 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj43 = parkingSpaceProxy40.login("empty", "Jane");
        client25.assignProxy(parkingSpaceProxy40);
        parkingSpaceProxy40.validateClient("13b04414-31a5-407f-8ea3-fba4613c73d1");
        accountRegistry1.assignProxyToClient("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", parkingSpaceProxy40);
        boolean boolean50 = parkingSpaceProxy40.extendBooking("pass", (-1));
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(client23);
        org.junit.Assert.assertNotNull(client25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "jane" + "'", str26, "jane");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "disabled" + "'", str36, "disabled");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace10 = parkingLot1.getParkingSpace((int) (byte) 10);
        int int11 = parkingSpace10.getSpaceId();
        java.lang.String str12 = parkingSpace10.scanSpace();
        boolean boolean13 = parkingSpace10.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "empty" + "'", str12, "empty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        ParkingSystem.Manager manager21 = superManager18.autoGenerateManager();
        java.lang.String str22 = superManager18.getPassword();
        superManager18.setManagerInfo("Paid $ 0.0 with Mobile Pay", "2afd610d-a8cb-413a-bbee-7927f86b526c", "Jane");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertNotNull(manager21);
// flaky "104) test0444(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089" + "'", str22, "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        parkingSpaceFacade17.toggleSpace("pass", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", true);
        boolean boolean25 = parkingSpaceFacade17.editBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", "CLT-035180a0-4707-410d-a011-2a4f0f46838b", 100);
        boolean boolean29 = parkingSpaceFacade17.editBooking("Card number should be 16 digits", "pass", (int) '4');
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
// flaky "105) test0445(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "empty" + "'", str6, "empty");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNotNull(parkingSpaceFacade17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("Jane");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy3 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj6 = parkingSpaceProxy3.login("empty", "Jane");
        parkingSpaceProxy3.validateClient("Jane");
        parkingSpaceProxy3.toggleSpace("", "staff", false);
        boolean boolean14 = parkingSpaceProxy3.cancelBooking("");
        boolean boolean20 = parkingSpaceProxy3.register("jane", "jane", "Jane", "hi!", "disabled");
        accountRegistry1.assignProxyToManager("empty", parkingSpaceProxy3);
        ParkingSystem.Client client23 = accountRegistry1.getClient("Paid $ 100.0 with Mobile Pay");
        ParkingSystem.Client client25 = ParkingSystem.Client.getInstance();
        java.lang.String str26 = client25.getName();
        client25.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str35 = client25.getUsername();
        java.lang.String str36 = client25.getPassword();
        java.lang.String str37 = client25.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy38 = null;
        client25.assignProxy(parkingSpaceProxy38);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy40 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj43 = parkingSpaceProxy40.login("empty", "Jane");
        client25.assignProxy(parkingSpaceProxy40);
        parkingSpaceProxy40.validateClient("13b04414-31a5-407f-8ea3-fba4613c73d1");
        accountRegistry1.assignProxyToClient("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", parkingSpaceProxy40);
        int int48 = accountRegistry1.getManagersSize();
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(client23);
        org.junit.Assert.assertNotNull(client25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "jane" + "'", str26, "jane");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "disabled" + "'", str36, "disabled");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean6 = bookingManager0.extendBooking("disabled", 100, "2afd610d-a8cb-413a-bbee-7927f86b526c", "empty");
        double double9 = bookingManager0.calculateCost("ST001", 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 165.0d + "'", double9 == 165.0d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap5 = null;
        cSVManager0.loadParkingLots(strMap5);
        java.util.List<java.lang.String[]> strArrayList8 = cSVManager0.readCSV("Paid $ -1.0 with Mobile Pay");
        java.lang.String[] strArray9 = cSVManager0.loadSuperManager();
        java.lang.Class<?> wildcardClass10 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(strArrayList8);
        org.junit.Assert.assertNotNull(strArray9);
// flaky "106) test0449(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("jane", "");
        boolean boolean9 = spaceManager0.isSpaceAvailable("hi!", (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        ParkingSystem.User user80 = new ParkingSystem.User();
        java.lang.Object obj81 = user80.user;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy82 = user80.parkingProxy;
        ParkingSystem.User user83 = new ParkingSystem.User();
        java.lang.Object obj84 = user83.user;
        ParkingSystem.Client client85 = ParkingSystem.Client.getInstance();
        java.lang.String str86 = client85.getName();
        client85.setValidated(true);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy89 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry90 = parkingSpaceProxy89.getRegistry();
        boolean boolean92 = parkingSpaceProxy89.checkIn("");
        client85.assignProxy(parkingSpaceProxy89);
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade94 = parkingSpaceProxy89.getFacade();
        user83.assignProxy(parkingSpaceProxy89);
        user80.parkingProxy = parkingSpaceProxy89;
        user0.parkingProxy = parkingSpaceProxy89;
        boolean boolean99 = parkingSpaceProxy89.cancelBooking("TXCrKOGD");
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
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(parkingSpaceProxy82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(client85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "CLT-30fd593b-dedd-41b3-a919-c48700301f41" + "'", str86, "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        org.junit.Assert.assertNotNull(accountRegistry90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade94);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean10 = parkingSpaceFacade0.confirmBooking("staff", "", "disabled", "hi!", (int) 'a', "jane", (int) 'a', "hi!", "");
        parkingSpaceFacade0.toggleSpace("CLT-d2153556-bc61-49e7-b73d-6af2a45e5167", "89de8237-29df-4908-9de4-6dc1ce90de94", true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade1 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager2 = parkingSpaceFacade1.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager3 = parkingSpaceFacade1.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap4 = spaceManager3.getParkingLots();
        cSVManager0.loadParkingLots(strMap4);
        ParkingSystem.CSVManager cSVManager6 = new ParkingSystem.CSVManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade7 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager8 = parkingSpaceFacade7.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager9 = parkingSpaceFacade7.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap10 = spaceManager9.getParkingLots();
        cSVManager6.loadParkingLots(strMap10);
        java.lang.String[] strArray12 = cSVManager6.loadSuperManager();
        ParkingSystem.CSVManager cSVManager13 = new ParkingSystem.CSVManager();
        java.lang.String[] strArray14 = cSVManager13.loadSuperManager();
        java.lang.String[] strArray15 = cSVManager13.loadSuperManager();
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade16 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager17 = parkingSpaceFacade16.getSpaceManager();
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap18 = spaceManager17.getParkingLots();
        cSVManager13.saveParkingLots(strMap18);
        cSVManager6.saveParkingLots(strMap18);
        cSVManager0.loadParkingLots(strMap18);
        cSVManager0.updateClientValidation("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", false);
        org.junit.Assert.assertNotNull(checkInManager2);
        org.junit.Assert.assertNotNull(spaceManager3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(checkInManager8);
        org.junit.Assert.assertNotNull(spaceManager9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strArray12);
// flaky "107) test0453(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray14);
// flaky "41) test0453(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(strArray15);
// flaky "22) test0453(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
        org.junit.Assert.assertNotNull(spaceManager17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        ParkingSystem.User user46 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy47 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj50 = parkingSpaceProxy47.login("empty", "Jane");
        parkingSpaceProxy47.validateClient("Jane");
        parkingSpaceProxy47.toggleSpace("", "staff", false);
        boolean boolean58 = parkingSpaceProxy47.cancelBooking("");
        user46.assignProxy(parkingSpaceProxy47);
        parkingSpaceProxy47.displayPendingValidations();
        boolean boolean64 = parkingSpaceProxy47.editBooking("Paid $ -1.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", 100);
        user18.parkingProxy = parkingSpaceProxy47;
        ParkingSystem.MobilePay mobilePay66 = new ParkingSystem.MobilePay();
        boolean boolean71 = mobilePay66.processPayment("disabled", 10.0d, "disabled", "disabled");
        java.lang.String str72 = mobilePay66.getPaymentMessage();
        boolean boolean77 = mobilePay66.processPayment("Jane", (double) 10L, "jane", "Paid $ 10.0 with Mobile Pay");
        boolean boolean82 = mobilePay66.processPayment("Jane", (double) (byte) 0, "hi!", "Jane");
        java.lang.String str83 = mobilePay66.getPaymentMessage();
        user18.user = str83;
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(client5);
// flaky "108) test0454(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(accountRegistry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceFacade14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(client20);
// flaky "42) test0454(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(accountRegistry25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(accountRegistry32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parkingSpaceProxy42);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str72, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str83, "Paid $ 0.0 with Mobile Pay");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        parkingSpaceFacade0.toggleSpace("pass", "staff", true);
        parkingSpaceFacade0.addParkingLot("Jane");
        ParkingSystem.CheckInManager checkInManager11 = parkingSpaceFacade0.getCheckInManager();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertNotNull(checkInManager11);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean3 = checkInManager1.checkIn("9701df9a-2178-4ad5-8076-46ff5f05b3e8");
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.Manager manager5 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry6 = superManager4.getRegistry();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.registry;
        boolean boolean13 = accountRegistry7.registerClient("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "Jane", "2afd610d-a8cb-413a-bbee-7927f86b526c", "Paid $ 0.0 with Mobile Pay", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry7.loadClientsFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(manager5);
        org.junit.Assert.assertNotNull(accountRegistry6);
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        boolean boolean5 = bookingManager0.extendBooking("jane", (int) (short) -1, "", "Paid $ 10.0 with Mobile Pay");
        double double7 = bookingManager0.getHourlyRate("disabled");
        ParkingSystem.CheckInManager checkInManager8 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean10 = checkInManager8.checkIn("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa");
        boolean boolean12 = checkInManager8.checkIn("CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        boolean boolean14 = checkInManager8.checkIn("89de8237-29df-4908-9de4-6dc1ce90de94");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.DebitOrCredit debitOrCredit6 = new ParkingSystem.DebitOrCredit();
        bookingManager0.setPaymentStrategy((ParkingSystem.Strategy) debitOrCredit6);
        boolean boolean12 = debitOrCredit6.processPayment("2afd610d-a8cb-413a-bbee-7927f86b526c", (double) (-1), "Paid $ -1.0 with Mobile Pay", "");
        java.lang.String str13 = debitOrCredit6.getPaymentMessage();
        boolean boolean16 = debitOrCredit6.validateCard("pass", (double) (byte) 1);
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        parkingSpaceFacade0.addParkingLot("CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceFacade0.addParkingLot("hi!");
        boolean boolean7 = parkingSpaceFacade0.checkOut("TXCrKOGD");
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        boolean boolean3 = checkInManager1.checkOut("");
        boolean boolean5 = checkInManager1.checkIn("jane");
        boolean boolean7 = checkInManager1.checkOut("Paid $ 10.0 with Mobile Pay");
        java.lang.String str8 = checkInManager1.refundMessage;
        checkInManager1.refundMessage = "CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("", "25527a32-01ef-45ba-816a-1d0a2fc2a52d", 10, "staff", (int) (short) 0, "433f3d1f-f758-4ae3-972b-7fb179aedfd7", (double) ' ');
        java.lang.String str8 = booking7.getClientId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        java.lang.String str4 = parkingSpaceProxy0.scanSpace("empty", "hi!");
        boolean boolean14 = parkingSpaceProxy0.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        parkingSpaceProxy0.toggleSpace("9701df9a-2178-4ad5-8076-46ff5f05b3e8", "", true);
        boolean boolean24 = parkingSpaceProxy0.register("jane", "Paid $ -1.0 with Mobile Pay", "Refunded without deposit ($0.0)", "disabled", "Refunded total cost of $1.0");
        boolean boolean28 = parkingSpaceProxy0.editBooking("disabled", "Card number should be 16 digits", (int) (byte) -1);
        ParkingSystem.Booking booking30 = parkingSpaceProxy0.getBookingDetails("CLT-d8bf4c7d-97ae-4388-8e43-8e38dfdc8d7c");
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(booking30);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        parkingSpaceProxy18.validateClient("CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc");
        boolean boolean34 = parkingSpaceProxy18.extendBooking("pass", (int) (short) 100);
        parkingSpaceProxy18.toggleLot("06b0adae-5a80-41cd-b7f6-6da51afdd4f5", true);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(manager16);
        org.junit.Assert.assertNotNull(accountRegistry19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        java.lang.String str1 = paymentManager0.refundMessage;
        boolean boolean3 = paymentManager0.refundTotalCost((-1.0d));
        java.lang.String str4 = paymentManager0.paymentMessage;
        paymentManager0.paymentMessage = "Paid $ 10.0 with Mobile Pay";
        boolean boolean11 = paymentManager0.processPayment("", (double) 10, "staff", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.Manager manager7 = superManager4.autoGenerateManager();
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
        ParkingSystem.Client client10 = accountRegistry8.getClient("ST001");
        // The following exception was thrown during execution in test generation
        try {
            accountRegistry8.loadManagersFromCSV();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str6, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        double double8 = booking7.getTotalCost();
        java.lang.String str9 = booking7.getLotId();
        double double10 = booking7.getTotalCost();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jane" + "'", str9, "jane");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        ParkingSystem.ParkingSpace parkingSpace1 = new ParkingSystem.ParkingSpace((int) (byte) 100);
        boolean boolean2 = parkingSpace1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        ParkingSystem.MobilePay mobilePay0 = new ParkingSystem.MobilePay();
        boolean boolean5 = mobilePay0.processPayment("hi!", (-1.0d), "", "");
        boolean boolean10 = mobilePay0.processPayment("hi!", (double) 100, "jane", "disabled");
        java.lang.String str11 = mobilePay0.getPaymentMessage();
        java.lang.String str12 = mobilePay0.getPaymentMessage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str11, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str12, "Paid $ 100.0 with Mobile Pay");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        boolean boolean8 = parkingLot1.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingLotIterator parkingLotIterator9 = parkingLot1.getIterator();
        boolean boolean10 = parkingLot1.isEnabled();
        parkingLot1.removeBooking((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        boolean boolean30 = parkingSpaceProxy19.cancelBooking("");
        boolean boolean36 = parkingSpaceProxy19.register("jane", "jane", "Jane", "hi!", "disabled");
        accountRegistry17.assignProxyToManager("empty", parkingSpaceProxy19);
        ParkingSystem.Client client39 = accountRegistry17.getClient("Paid $ 100.0 with Mobile Pay");
        ParkingSystem.Client client41 = ParkingSystem.Client.getInstance();
        java.lang.String str42 = client41.getName();
        client41.setClientInfo("hi!", "", "", "disabled", "disabled", "hi!", true);
        java.lang.String str51 = client41.getUsername();
        java.lang.String str52 = client41.getPassword();
        java.lang.String str53 = client41.getUsername();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy54 = null;
        client41.assignProxy(parkingSpaceProxy54);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy56 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj59 = parkingSpaceProxy56.login("empty", "Jane");
        client41.assignProxy(parkingSpaceProxy56);
        parkingSpaceProxy56.validateClient("13b04414-31a5-407f-8ea3-fba4613c73d1");
        accountRegistry17.assignProxyToClient("CLT-2aaedfbd-8450-4ae9-a41d-e7746f52d089", parkingSpaceProxy56);
        superManager4.registry = accountRegistry17;
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str5, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(accountRegistry17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(client39);
        org.junit.Assert.assertNotNull(client41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "jane" + "'", str42, "jane");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "disabled" + "'", str52, "disabled");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.ParkingLotIterator parkingLotIterator7 = parkingLot1.getIterator();
        boolean boolean8 = parkingLotIterator7.hasNext();
        ParkingSystem.ParkingSpace parkingSpace9 = parkingLotIterator7.next();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLotIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        ParkingSystem.PaymentManager paymentManager0 = new ParkingSystem.PaymentManager();
        paymentManager0.refundMessage = "";
        boolean boolean4 = paymentManager0.refundTotalCost((double) (byte) 1);
        paymentManager0.paymentMessage = "Paid $ 100.0 with Mobile Pay";
        boolean boolean8 = paymentManager0.refundTotalCost((double) (short) 100);
        boolean boolean13 = paymentManager0.processPayment("", (double) 0, "Paid $ 100.0 with Mobile Pay", "Refunded without deposit ($-42.0)");
        boolean boolean18 = paymentManager0.processPayment("disabled", (double) 10.0f, "2afd610d-a8cb-413a-bbee-7927f86b526c", "pass");
        java.lang.String str19 = paymentManager0.refundMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Refunded total cost of $100.0" + "'", str19, "Refunded total cost of $100.0");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        boolean boolean3 = parkingSpaceFacade0.extendBooking("CLT-30fd593b-dedd-41b3-a919-c48700301f41", (int) (byte) -1);
        ParkingSystem.SpaceManager spaceManager4 = parkingSpaceFacade0.getSpaceManager();
        java.lang.String str7 = parkingSpaceFacade0.scanSpace("jane", "Refunded without deposit ($0.0)");
        java.lang.String str10 = parkingSpaceFacade0.scanSpace("Jane", "");
        ParkingSystem.Booking booking12 = parkingSpaceFacade0.getBookingDetails("4a1f2343-8b2e-4dea-ba69-efd105414390");
        boolean boolean22 = parkingSpaceFacade0.confirmBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", "Paid $ 100.0 with Mobile Pay", "02659ad3-0b5c-4c48-a915-a466f2b50775", 32, "02659ad3-0b5c-4c48-a915-a466f2b50775", (int) (short) 0, "7aecb00c-028c-4dcf-96cc-14d25bd709ab", "89de8237-29df-4908-9de4-6dc1ce90de94");
        ParkingSystem.CheckInManager checkInManager23 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean25 = checkInManager23.checkIn("Paid $ 15.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spaceManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disabled" + "'", str7, "disabled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "disabled" + "'", str10, "disabled");
        org.junit.Assert.assertNull(booking12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(checkInManager23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        double double3 = bookingManager0.calculateCost("", 0);
        boolean boolean13 = bookingManager0.confirmBooking("empty", "Jane", "disabled", "pass", (int) (byte) 0, "hi!", (int) 'a', "hi!", "");
        double double15 = bookingManager0.getHourlyRate("Jane");
        double double17 = bookingManager0.getHourlyRate("Paid $ 0.0 with Mobile Pay");
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap18 = bookingManager0.getActiveBookings();
        java.util.Map<java.lang.String, ParkingSystem.Booking> strMap19 = bookingManager0.getActiveBookings();
        boolean boolean29 = bookingManager0.confirmBooking("7aecb00c-028c-4dcf-96cc-14d25bd709ab", "CLT-30fd593b-dedd-41b3-a919-c48700301f41", "Paid $ 10.0 with Mobile Pay", "3b453211-7dd1-4452-8741-a206711c1217", 32, "empty", (int) (byte) -1, "CLT-60bc02e6-ea36-49ee-91f5-9241efd385cc", "Refunded total cost of $-1.0");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        ParkingSystem.BookingManager bookingManager0 = new ParkingSystem.BookingManager();
        ParkingSystem.CheckInManager checkInManager1 = new ParkingSystem.CheckInManager(bookingManager0);
        ParkingSystem.SpaceManager spaceManager2 = bookingManager0.getSpaceManager();
        double double5 = bookingManager0.calculateCost("", (int) (byte) 10);
        ParkingSystem.SpaceManager spaceManager6 = bookingManager0.getSpaceManager();
        boolean boolean9 = spaceManager6.isSpaceAvailable("02659ad3-0b5c-4c48-a915-a466f2b50775", (int) (byte) 1);
        ParkingSystem.ParkingLot parkingLot13 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking15 = null;
        boolean boolean16 = parkingLot13.assignBooking(0, booking15);
        boolean boolean18 = parkingLot13.isSpaceAvailable((int) '#');
        boolean boolean20 = parkingLot13.isSpaceAvailable((int) (short) 10);
        ParkingSystem.ParkingSpace parkingSpace22 = parkingLot13.getParkingSpace((int) (byte) 10);
        int int23 = parkingSpace22.getSpaceId();
        ParkingSystem.Booking booking24 = parkingSpace22.getCurrentBooking();
        ParkingSystem.SpaceManager spaceManager25 = new ParkingSystem.SpaceManager();
        boolean boolean28 = spaceManager25.isSpaceAvailable("hi!", (int) '#');
        spaceManager25.toggleLot("disabled", false);
        ParkingSystem.Booking booking41 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean42 = spaceManager25.assignBooking("empty", (int) (short) 0, booking41);
        boolean boolean43 = parkingSpace22.assignBooking(booking41);
        ParkingSystem.SpaceManager spaceManager44 = new ParkingSystem.SpaceManager();
        boolean boolean47 = spaceManager44.isSpaceAvailable("hi!", (int) '#');
        spaceManager44.toggleLot("disabled", false);
        ParkingSystem.Booking booking60 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean61 = spaceManager44.assignBooking("empty", (int) (short) 0, booking60);
        boolean boolean62 = booking60.isCheckedIn();
        java.lang.String str63 = booking60.getClientId();
        boolean boolean64 = parkingSpace22.assignBooking(booking60);
        boolean boolean65 = spaceManager6.assignBooking("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", (int) (byte) 0, booking60);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 165.0d + "'", double5 == 165.0d);
        org.junit.Assert.assertNotNull(spaceManager6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(booking24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "staff" + "'", str63, "staff");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        parkingSpaceFacade33.addParkingLot("CLT-f02c481e-1504-4abf-b598-76152da8586a");
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
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        java.util.List<java.lang.String[]> strArrayList4 = cSVManager0.readCSV("Jane");
        java.lang.String[] strArray5 = cSVManager0.loadSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Client> clientList6 = cSVManager0.loadClients();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(strArrayList4);
        org.junit.Assert.assertNotNull(strArray5);
// flaky "109) test0478(RegressionTest0)":         org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "SMGR-1\tsuperuser\tsuperpass" });
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        parkingLot1.setEnabled(true);
        boolean boolean7 = parkingLot1.isEnabled();
        ParkingSystem.ParkingSpace parkingSpace9 = parkingLot1.getParkingSpace(1);
        boolean boolean10 = parkingSpace9.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        ParkingSystem.Manager manager5 = superManager4.autoGenerateManager();
        java.lang.String str6 = superManager4.getPassword();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.registry;
        ParkingSystem.AccountRegistry accountRegistry8 = superManager4.registry;
// flaky "110) test0480(RegressionTest0)":         superManager4.displayPendingValidations();
        java.lang.String str10 = superManager4.getManagerId();
        java.lang.String str11 = superManager4.getName();
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertNotNull(manager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Jane" + "'", str6, "Jane");
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertNotNull(accountRegistry8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Paid $ 0.0 with Mobile Pay" + "'", str10, "Paid $ 0.0 with Mobile Pay");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2afd610d-a8cb-413a-bbee-7927f86b526c" + "'", str11, "2afd610d-a8cb-413a-bbee-7927f86b526c");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        ParkingSystem.ParkingSpace parkingSpace1 = new ParkingSystem.ParkingSpace((int) '4');
        int int2 = parkingSpace1.getSpaceId();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("");
        ParkingSystem.ParkingLotIterator parkingLotIterator2 = parkingLot1.getIterator();
        ParkingSystem.ParkingSpace parkingSpace4 = parkingLot1.getParkingSpace((int) (byte) -1);
        ParkingSystem.ParkingLotIterator parkingLotIterator5 = parkingLot1.getIterator();
        boolean boolean6 = parkingLot1.isEnabled();
        org.junit.Assert.assertNotNull(parkingLotIterator2);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertNotNull(parkingLotIterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        ParkingSystem.User user0 = new ParkingSystem.User();
        java.lang.Object obj1 = user0.user;
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
        boolean boolean16 = parkingSpaceProxy12.checkIn("hi!");
        user0.parkingProxy = parkingSpaceProxy12;
        boolean boolean19 = parkingSpaceProxy12.checkOut("Refunded without deposit ($-96.0)");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(client2);
// flaky "111) test0483(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7aecb00c-028c-4dcf-96cc-14d25bd709ab" + "'", str3, "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(accountRegistry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        ParkingSystem.AccountRegistry accountRegistry6 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager7 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry6);
        boolean boolean9 = accountRegistry6.requiresValidation("disabled");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy11 = null;
        accountRegistry6.assignProxyToClient("", parkingSpaceProxy11);
        java.util.List<ParkingSystem.Client> clientList13 = accountRegistry6.displayPendingValidations();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy15 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry16 = parkingSpaceProxy15.getRegistry();
        java.lang.String str19 = parkingSpaceProxy15.scanSpace("empty", "hi!");
        boolean boolean29 = parkingSpaceProxy15.confirmBooking("Paid $ -1.0 with Mobile Pay", "staff", "hi!", "hi!", (-1), "Paid $ 10.0 with Mobile Pay", 10, "jane", "CLT-30fd593b-dedd-41b3-a919-c48700301f41");
        boolean boolean33 = parkingSpaceProxy15.editBooking("pass", "2afd610d-a8cb-413a-bbee-7927f86b526c", (int) (byte) 100);
        accountRegistry6.assignProxyToManager("", parkingSpaceProxy15);
        ParkingSystem.SuperManager superManager35 = ParkingSystem.SuperManager.createFromCSV("25527a32-01ef-45ba-816a-1d0a2fc2a52d", "89de8237-29df-4908-9de4-6dc1ce90de94", "Paid $ 100.0 with Mobile Pay", accountRegistry6);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(clientList13);
        org.junit.Assert.assertNotNull(accountRegistry16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "disabled" + "'", str19, "disabled");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(superManager35);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        boolean boolean24 = parkingSpaceProxy15.cancelBooking("pass");
        ParkingSystem.Booking booking26 = parkingSpaceProxy15.getBookingDetails("CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7");
        boolean boolean32 = parkingSpaceProxy15.register("Refunded total cost of $100.0", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "06b0adae-5a80-41cd-b7f6-6da51afdd4f5", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "");
        org.junit.Assert.assertNotNull(client0);
// flaky "112) test0485(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7aecb00c-028c-4dcf-96cc-14d25bd709ab" + "'", str1, "7aecb00c-028c-4dcf-96cc-14d25bd709ab");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disabled" + "'", str11, "disabled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(booking26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.SpaceManager spaceManager1 = parkingSpaceFacade0.getSpaceManager();
        ParkingSystem.Booking booking11 = new ParkingSystem.Booking("Paid $ 100.0 with Mobile Pay", "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", (int) (short) 1, "2afd610d-a8cb-413a-bbee-7927f86b526c", 32, "", 30.0d);
        boolean boolean12 = spaceManager1.assignBooking("Paid $ 0.0 with Mobile Pay", (int) (byte) 10, booking11);
        java.lang.String str13 = booking11.getLotId();
        org.junit.Assert.assertNotNull(spaceManager1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3" + "'", str13, "CLT-84172690-12e5-43e4-8a26-14753ff3c6e3");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        ParkingSystem.ParkingLot parkingLot1 = new ParkingSystem.ParkingLot("hi!");
        ParkingSystem.Booking booking3 = null;
        boolean boolean4 = parkingLot1.assignBooking(0, booking3);
        boolean boolean6 = parkingLot1.isSpaceAvailable((int) '#');
        ParkingSystem.Booking booking15 = new ParkingSystem.Booking("staff", "jane", (int) (short) -1, "Jane", (int) ' ', "disabled", (double) (byte) 1);
        boolean boolean16 = parkingLot1.assignBooking((int) (short) -1, booking15);
        java.lang.String str17 = booking15.getLotId();
        java.lang.String str18 = booking15.getLicensePlate();
        booking15.setStartTime("hi!");
        java.lang.String str21 = booking15.getLotId();
        java.lang.String str22 = booking15.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "jane" + "'", str17, "jane");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "disabled" + "'", str18, "disabled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jane" + "'", str21, "jane");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        ParkingSystem.Booking booking7 = new ParkingSystem.Booking("Paid $ 100.0 with Mobile Pay", "disabled", (int) (short) 1, "pass", (int) (byte) 0, "Card number should be 16 digits", (double) (-1));
        java.lang.String str8 = booking7.getLicensePlate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Card number should be 16 digits" + "'", str8, "Card number should be 16 digits");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        ParkingSystem.Manager manager21 = superManager18.autoGenerateManager();
        java.lang.String str22 = superManager18.getPassword();
        superManager18.setManagerInfo("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "Paid $ -1.0 with Mobile Pay", "CLT-d2153556-bc61-49e7-b73d-6af2a45e5167");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertNotNull(accountRegistry15);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertNotNull(manager21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Jane" + "'", str22, "Jane");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy18 = user0.parkingProxy;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy19 = user0.parkingProxy;
        ParkingSystem.User user20 = new ParkingSystem.User();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy21 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj24 = parkingSpaceProxy21.login("empty", "Jane");
        parkingSpaceProxy21.validateClient("Jane");
        parkingSpaceProxy21.toggleSpace("", "staff", false);
        boolean boolean32 = parkingSpaceProxy21.cancelBooking("");
        user20.assignProxy(parkingSpaceProxy21);
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy34 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry35 = parkingSpaceProxy34.getRegistry();
        boolean boolean41 = parkingSpaceProxy34.register("empty", "disabled", "Paid $ 10.0 with Mobile Pay", "empty", "jane");
        boolean boolean45 = parkingSpaceProxy34.editBooking("Paid $ 10.0 with Mobile Pay", "Paid $ 10.0 with Mobile Pay", 0);
        user20.parkingProxy = parkingSpaceProxy34;
        user0.parkingProxy = parkingSpaceProxy34;
        ParkingSystem.ParkingLot parkingLot49 = new ParkingSystem.ParkingLot("CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49");
        user0.user = parkingLot49;
        java.lang.Object obj53 = user0.login("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "06b0adae-5a80-41cd-b7f6-6da51afdd4f5");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(parkingSpaceProxy2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(parkingSpaceProxy18);
        org.junit.Assert.assertNull(parkingSpaceProxy19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(accountRegistry35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        java.lang.String str3 = parkingSpaceFacade0.scanSpace("disabled", "empty");
        boolean boolean5 = parkingSpaceFacade0.checkOut("Refunded without deposit ($0.0)");
        parkingSpaceFacade0.toggleLot("jane", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disabled" + "'", str3, "disabled");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj3 = parkingSpaceProxy0.login("empty", "Jane");
        parkingSpaceProxy0.validateClient("Jane");
        java.lang.String str8 = parkingSpaceProxy0.scanSpace("", "");
        java.lang.Object obj11 = parkingSpaceProxy0.login("CLT-84172690-12e5-43e4-8a26-14753ff3c6e3", "staff");
        parkingSpaceProxy0.toggleLot("Refunded without deposit ($-42.0)", false);
        boolean boolean24 = parkingSpaceProxy0.confirmBooking("Paid $ 10.0 with Mobile Pay", "CLT-2c703e7f-c82c-4d1c-a76c-41c5a1c52bf7", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52", "Paid $ 10.0 with Mobile Pay", 1, "CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", (-1), "Refunded total cost of $-1.0", "CLT-270f1c6f-0e01-426b-8fb3-6944808f1f52");
        boolean boolean27 = parkingSpaceProxy0.extendBooking("Paid $ -1.0 with Mobile Pay", (int) (short) -1);
        boolean boolean29 = parkingSpaceProxy0.cancelBooking("2afd610d-a8cb-413a-bbee-7927f86b526c");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "disabled" + "'", str8, "disabled");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        ParkingSystem.SpaceManager spaceManager0 = new ParkingSystem.SpaceManager();
        spaceManager0.removeBooking("hi!", (int) (byte) 0);
        java.lang.String str6 = spaceManager0.scanSpace("jane", "");
        spaceManager0.addParkingLot("disabled");
        java.lang.Class<?> wildcardClass9 = spaceManager0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "disabled" + "'", str6, "disabled");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        ParkingSystem.ParkingSpaceFacade parkingSpaceFacade0 = new ParkingSystem.ParkingSpaceFacade();
        ParkingSystem.CheckInManager checkInManager1 = parkingSpaceFacade0.getCheckInManager();
        ParkingSystem.SpaceManager spaceManager2 = parkingSpaceFacade0.getSpaceManager();
        ParkingSystem.CheckInManager checkInManager3 = parkingSpaceFacade0.getCheckInManager();
        boolean boolean13 = parkingSpaceFacade0.confirmBooking("13b04414-31a5-407f-8ea3-fba4613c73d1", "Refunded total cost of $-1.0", "CLT-07d9fe1c-cd89-4d98-a22b-f08722eb0f49", "Refunded without deposit ($0.0)", 0, "Refunded without deposit ($0.0)", (-1), "Jane", "Refunded total cost of $1.0");
        boolean boolean15 = parkingSpaceFacade0.checkIn("Jane");
        org.junit.Assert.assertNotNull(checkInManager1);
        org.junit.Assert.assertNotNull(spaceManager2);
        org.junit.Assert.assertNotNull(checkInManager3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        ParkingSystem.AccountRegistry accountRegistry3 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager4 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry3);
        java.lang.String str5 = superManager4.getManagerId();
        java.lang.String str6 = superManager4.getManagerId();
        ParkingSystem.AccountRegistry accountRegistry7 = superManager4.getRegistry();
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy9 = new ParkingSystem.ParkingSpaceProxy();
        boolean boolean11 = parkingSpaceProxy9.cancelBooking("pass");
        parkingSpaceProxy9.toggleSpace("jane", "Paid $ -1.0 with Mobile Pay", false);
        boolean boolean17 = parkingSpaceProxy9.checkOut("Paid $ 0.0 with Mobile Pay");
        accountRegistry7.assignProxyToManager("CLT-41ead7fd-0c3b-4694-a2a9-d760d7e008d6", parkingSpaceProxy9);
        org.junit.Assert.assertNotNull(superManager4);
// flaky "113) test0495(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str5, "Paid $ 100.0 with Mobile Pay");
// flaky "43) test0495(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str6, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(accountRegistry7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy0 = new ParkingSystem.ParkingSpaceProxy();
        ParkingSystem.AccountRegistry accountRegistry1 = parkingSpaceProxy0.getRegistry();
        java.lang.String str4 = parkingSpaceProxy0.scanSpace("empty", "hi!");
        parkingSpaceProxy0.toggleSpace("CLT-80eb5e7b-8816-4a02-9591-2ca1a19558fa", "86z9Z9e0MN", false);
        org.junit.Assert.assertNotNull(accountRegistry1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disabled" + "'", str4, "disabled");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.String str30 = parkingSpaceProxy15.scanSpace("", "433f3d1f-f758-4ae3-972b-7fb179aedfd7");
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "disabled" + "'", str30, "disabled");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        ParkingSystem.Client client0 = ParkingSystem.Client.getInstance();
        java.lang.String str1 = client0.getClientType();
        boolean boolean2 = client0.getIsValidated();
        java.lang.String str3 = client0.getClientId();
        org.junit.Assert.assertNotNull(client0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Paid $ 10.0 with Mobile Pay" + "'", str1, "Paid $ 10.0 with Mobile Pay");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "114) test0498(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLT-0173ebd7-c50a-4d20-8ab3-f6039f068cff" + "'", str3, "CLT-0173ebd7-c50a-4d20-8ab3-f6039f068cff");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        int int50 = accountRegistry24.getManagersSize();
        ParkingSystem.AccountRegistry accountRegistry61 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager62 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry61);
        ParkingSystem.AccountRegistry accountRegistry66 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager67 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry66);
        superManager62.registry = accountRegistry66;
        ParkingSystem.SuperManager superManager69 = ParkingSystem.SuperManager.createFromCSV("pass", "empty", "Paid $ -1.0 with Mobile Pay", accountRegistry66);
        ParkingSystem.SuperManager superManager70 = ParkingSystem.SuperManager.createFromCSV("Paid $ -1.0 with Mobile Pay", "", "Jane", accountRegistry66);
        ParkingSystem.AccountRegistry accountRegistry74 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager75 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry74);
        ParkingSystem.AccountRegistry accountRegistry79 = new ParkingSystem.AccountRegistry();
        ParkingSystem.SuperManager superManager80 = ParkingSystem.SuperManager.createFromCSV("", "", "disabled", accountRegistry79);
        superManager75.registry = accountRegistry79;
        ParkingSystem.Manager manager82 = accountRegistry79.autoGenerateManager();
        superManager70.registry = accountRegistry79;
        ParkingSystem.ParkingSpaceProxy parkingSpaceProxy84 = new ParkingSystem.ParkingSpaceProxy();
        java.lang.Object obj87 = parkingSpaceProxy84.login("empty", "Jane");
        parkingSpaceProxy84.validateClient("Jane");
        parkingSpaceProxy84.toggleSpace("", "staff", false);
        boolean boolean95 = parkingSpaceProxy84.cancelBooking("");
        parkingSpaceProxy84.validateClient("jane");
        superManager70.assignProxy(parkingSpaceProxy84);
        accountRegistry24.assignProxyToManager("Refunded without deposit ($-42.0)", parkingSpaceProxy84);
        org.junit.Assert.assertNotNull(superManager4);
// flaky "115) test0499(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str5, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertNotNull(superManager19);
// flaky "44) test0499(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Paid $ 100.0 with Mobile Pay" + "'", str20, "Paid $ 100.0 with Mobile Pay");
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertNotNull(clientList31);
        org.junit.Assert.assertNotNull(accountRegistry34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(manager48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(superManager62);
        org.junit.Assert.assertNotNull(superManager67);
        org.junit.Assert.assertNotNull(superManager69);
        org.junit.Assert.assertNotNull(superManager70);
        org.junit.Assert.assertNotNull(superManager75);
        org.junit.Assert.assertNotNull(superManager80);
        org.junit.Assert.assertNotNull(manager82);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        ParkingSystem.CSVManager cSVManager0 = new ParkingSystem.CSVManager();
        java.util.List<java.lang.String[]> strArrayList2 = cSVManager0.readCSV("");
        cSVManager0.updateClientValidation("pass", false);
        java.util.Map<java.lang.String, ParkingSystem.ParkingLot> strMap6 = null;
        cSVManager0.loadParkingLots(strMap6);
        ParkingSystem.Client client8 = ParkingSystem.Client.getInstance();
        java.lang.String str9 = client8.getClientType();
        cSVManager0.saveClient(client8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ParkingSystem.Manager> managerList11 = cSVManager0.loadManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayList2);
        org.junit.Assert.assertNotNull(client8);
// flaky "116) test0500(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "disabled" + "'", str9, "disabled");
    }
}
