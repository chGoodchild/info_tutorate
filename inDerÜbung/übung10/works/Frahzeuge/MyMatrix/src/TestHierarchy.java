class TestHierarchy {
    public static void main(String[] args) {
        Fahrzeug[] v = new Fahrzeug[4];
        v[0] = new Fahrrad(1980, 12345, 28); // (baujahr, serienNr, rahmenGr)
        v[1] = new PKW(1990, 22346, "FR-HJ-1407", 75, 1205, 5); // (baujahr, serienNr, kennz, leistung, tuevTermin, anzSitze)
        v[2] = new LKW(1995, 32347, "FR-WB-80", 250, 1005, 3, 1000); // (baujahr, serienNr, kennz, leistung, tuevTermin, anzSitze, zuladung)
        v[3] = new Bus(1985, 52347, "IN-FO-1", 250, 1106, 50, 20); // (baujahr, serienNr, kennz, leistung, tuevTermin, anzSitze, anzStehplaetze)

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
            System.out.println();
        }
    }
}
