
/**
 * Class Customer ini memodelkan pesanan yang dibuat oleh customer.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
 */
public class Pesanan
{
    private static double biaya;
    private static boolean isDiproses;
    private static boolean isSelesai;
    private static Customer pelanggan;
    private static String nama_pelanggan;
    private static String jenis_kamar;
    private static Room kamar;

    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    }
    
    public Pesanan()
    {
       
    }
    
    /**
     * Method untuk memasukkan nilai biaya
     * @param biaya biaya yang ditagih
     */
    public void setBiaya (double biaya)
    {
        /*
         * ini digunakan untuk memasukkan nilai biaya
         * nilai berupa double
         */
        Pesanan.biaya = biaya;
    }
    
    /**
     * Method untuk memasukkan nilai pelanggan
     * @param pelanggan pelanggan yang mendaftar
     */
    public void setPelanggan (Customer baru)
    {
        /*
         * ini digunakan untuk memasukkan nilai pelanggan
         */
        Pesanan.pelanggan = pelanggan;
    }
    
    /**
     * Method untuk memasukkan nilai isDiproses
     * @param isDiproses status pesanan pelanggan yang mendaftar
     */
    public void setStatusDiproses (boolean diproses)
    {
        /*
         * ini digunakan untuk memasukkan nilai isDiproses
         * nilai berupa boolean
         */
        Pesanan.isDiproses = isDiproses;
    }
    
    /**
     * Method untuk memasukkan nilai isSelesai
     * @param isSelesai status pesanan pelanggan yang selesai
     */
    public void setStatusSelesai (boolean diproses)
    {
        /*
         * ini digunakan untuk memasukkan nilai isSelesai
         * nilai berupa boolean
         */
        Pesanan.isSelesai = isSelesai;
    }
    
    /**
     * Method untuk mendapat nilai biaya
     * @return biaya yang ditagih
     */
    public double getBiaya()
    {
        /*
         * ini digunakan untuk mendapat nilai biaya
         * nilai berupa double
         */
        return biaya;
    }
    
    /**
     * Method untuk mendapat nilai pelanggan
     * @return nama pelanggan yang mendaftar
     */
    public Customer getPelanggan()
    {
        /*
         * ini digunakan untuk mendapat nilai pelanggan
         */
        return pelanggan;
    }
    
    /**
     * Method untuk mendapat nilai isDiproses
     * @return status pesanan pelanggan yang mendaftar
     */
    public boolean getStatusDiproses()
    {
        /*
         * ini digunakan untuk mendapat nilai isDiproses
         * nilai berupa boolean
         */
        return isDiproses;
    }
    
    /**
     * Method untuk mendapat nilai isSelesai
     * @return status pesanan pelanggan yang selesai
     */
    public boolean getStatusSelesai()
    {
        /*
         * ini digunakan untuk mendapat nilai isSelesai
         * nilai berupa boolean
         */
        return isSelesai;
    }
    
    /**
     * Method untuk mendapat nilai room
     * @return room pelanggan yang mendaftar
     */
    public Room getRoom()
    {
        /*
         * ini digunakan untuk mendapat nilai room
         */
        return kamar;
    }
    
    /**
     * Method untuk mendapat nilai room
     * @return room pelanggan yang mendaftar
     */
    public void setRoom(Room kamar)
    {
        /*
         * ini digunakan untuk memasukkan nilai room
         */
        Pesanan.kamar = kamar;
    }
    
    public static void printData()
    {
        /*
         * ini digunakan untuk memprint data
         */
        System.out.println("Biaya " + biaya);
        System.out.println("Status " + isDiproses);
        System.out.println("Status " + isSelesai);
        System.out.println("Status " + nama_pelanggan);
        System.out.println("Status " + jenis_kamar);
    }
}
