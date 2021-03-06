package jhotel;
/**
 * Class ini menunjukkan sedikit informasi tentang hotel seperti nama, lokasi dan kualitas.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-03-01)
 */
public class Hotel
{
    private static String nama;
    private static Lokasi lokasi;
    private static int bintang;
    private static String string;
    private static int id;

    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        Hotel.nama = nama;
        Hotel.lokasi = lokasi;
        Hotel.bintang = bintang;
        id = DatabaseHotel.getLastHotelId() + 1;
    }

    /**
     * Method untuk memasukkan nilai bintang
     * @param bintang hotel bintang ... 
     */
    public  void setBintang(int bintang)
    {
        Hotel.bintang = bintang;
    }
    
    /**
     * Method untuk memasukkan nilai nama
     * @param nama nama hotel 
     */
    public  void setNama(String nama)
    {
        Hotel.nama = nama;
    }
    
    /**
     * Method untuk memasukkan nilai lokasi
     * @param lokasi lokasi hotel 
     */
    public  void setLokasi(Lokasi lokasi)
    {
        Hotel.lokasi = lokasi;
    }

    public void SetID(int id)
    {
        Hotel.id = id;
    }
    
    /**
     * Method untuk mendapat nilai bintang
     * @return hotel bintang ... 
     */
    public  int getBintang()
    {
        return bintang;
    }
    
    /**
     * Method untuk mendapat nilai nama
     * @return nama hotel 
     */
    public  String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk mendapat nilai lokasi
     * @return lokasi hotel 
     */
    public  Lokasi getLokasi()
    {
        return lokasi;
    }

    public int getID()
    {
        return id;
    }
    
    public String toString()
    {
        if(true){
            return "\nName          : " + nama +
                   "\nLokasi        : " + lokasi +
                   "\nBintang : " + bintang +
                   "\nBooking order is in progress";        
        }
       
        else{
            return "\nName          : " + nama +
                   "\nLokasi        : " + lokasi +
                   "\nBintang : " + bintang +
                   "\nBooking order is in progress";  
                }
            }
    
    public static void printData()
    {
        /*
         * ini digunakan untuk memprint data
         */
        System.out.println("Hotel " + nama);
        System.out.println("Hotel " + bintang);
        System.out.println("Hotel " + lokasi);
    }
}
