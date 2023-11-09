public class ExmpleNumberFormatException {
    public static void main(String[] args) {
        try {
            String bebas_nama_variabelnya = "Angkasa Enterprises";
            int i = Integer.parseInt(bebas_nama_variabelnya);
            System.out.println("int value = " + i);
        }
        catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

}
