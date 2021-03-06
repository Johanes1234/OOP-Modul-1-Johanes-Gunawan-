package jhotel;
import java.util.ArrayList;

/**
 * Class Customer ini memodelkan data-data yang berhubungan dengan pesanan.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
 */
public class DatabasePesanan
{
    //protected String[] list_pesanan;
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    public static int LAST_PESANAN_ID = 0;

    /**
     * Constructor for objects of class DatabasePesanan
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }

    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        if(PESANAN_DATABASE.contains(baru))
        {
            if(baru.getStatusAktif())
            {
                //return false;
                throw new PesananSudahAdaException(baru);
            }
            else
            {
                PESANAN_DATABASE.add(baru);
                return true;
            }
        }
        else
        {
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @return     the sum of x and y
     */
    /*public boolean removePesanan()
    {
        return false;
    }
    */

    public static Pesanan getPesananAktif(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getRoom().equals(kamar))
            {
                if(Pesanan.getStatusAktif() == true)
                {
                    return pesanan;
                }
            }
        }

        return null;
    }

    public static Pesanan getPesanan(int id)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getID() == id)
            {
                return pesanan;
            }
        }

        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getPelanggan().equals(pelanggan))
            {
                if(pesanan.getStatusAktif())
                {
                    return pesanan;
                }
            }
        }

        return null;
    }

    public static boolean removePesanan(Customer pesan) throws PesananTidakDitemukanException
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.equals(pesan))
            {
                if(pesanan.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else
                {
                    if(pesanan.getStatusAktif())
                    {
                        pesanan.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(pesanan))
                {
                    return true;
                }
            }
        }

        //return false;
        throw new PesananTidakDitemukanException(pesan);
    }

    public void pesananDibatalkan(Pesanan pesan)
    {
        
    }
}
