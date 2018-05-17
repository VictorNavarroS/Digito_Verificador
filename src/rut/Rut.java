package rut;

public class Rut {

    public static void main(String[] args) {
        String rut = "17307430";
        try {
            String digito = "";
            int rutInt = Integer.parseInt(rut);
            int multiplo = 2;
            int suma = 0;
            for (int i = rut.length()-1; i >= 0; i--) {
                suma = suma + (Integer.parseInt(String.valueOf(rut.charAt(i))) * multiplo);
                multiplo++;
                if (multiplo == 8) {
                    multiplo = 2;
                }
            }
            suma = 11 - (suma % 11);
            switch (suma) {
                case 11:
                    digito = "0";
                    break;
                case 10:
                    digito = "K";
                    break;
                default:
                    digito = "" + suma;
                    break;
            }
            System.out.println("Su Digito Verificador es: "+digito);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
