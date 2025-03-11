public class TicketPriceCalculator {
    public static double tinhGiaVe (Boolean suatChieuThuong, Boolean loaiGheThuong, int tuoi)  {
        if (tuoi < 0) return -1;
        int giaVeTieuChuan = suatChieuThuong ? 100000 : 120000;
        double giaVe = giaVeTieuChuan;
        if (!loaiGheThuong) {
            giaVe += 0.2 * giaVeTieuChuan;
        }
        if (tuoi < 12) {
            giaVe -= 0.3 * giaVeTieuChuan;
        } else if (tuoi >= 65) {
            giaVe -= 0.25 * giaVeTieuChuan;
        }
        return giaVe;
    }

    public static void main(String[] args) {

    }

}
