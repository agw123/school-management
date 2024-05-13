package Utility;
import java.time.LocalDate;

public abstract class CodiceFiscaleCalculator {
    public static void main(String[] args) {
        // Esempi di input per calcolare il codice fiscale
        String nome = "Mario";
        String cognome = "Rossi";
        LocalDate dataDiNascita = null;
        String sesso = "M";
        String comuneDiNascita = "Milano";

        // Calcolo del codice fiscale
        String codiceFiscale = calcolaCF(nome, cognome, dataDiNascita, sesso, comuneDiNascita);
        System.out.println("Codice fiscale: " + codiceFiscale);
    }

    // Metodo per calcolare il codice fiscale
    public static String calcolaCF(String nome, String cognome, LocalDate dataDiNascita, String sesso, String comuneDiNascita) {
        // Implementa il calcolo del codice fiscale qui, utilizzando le regole stabilite dal governo italiano
        // Questo è solo un esempio di implementazione molto semplificato

        // Esempio di codice fiscale semplice (nome e cognome in minuscolo, senza calcoli reali)
        String codiceFiscale = "";

        // Estrai le prime tre consonanti del cognome
        codiceFiscale += estraiConsonanti(cognome);

        // Estrai le prime tre consonanti del nome
        codiceFiscale += estraiConsonanti(nome);

       ;
        // Aggiungi le ultime due cifre dell'anno di nascita
        codiceFiscale +=  dataDiNascita.toString().substring(8, 10);

        // Aggiungi il mese di nascita
        codiceFiscale += mappaMese(dataDiNascita.toString().substring(3, 5));

        // Aggiungi il giorno di nascita
        codiceFiscale += dataDiNascita.toString().substring(0, 2);

        // Aggiungi il codice del comune di nascita (semplificato)
        codiceFiscale += comuneDiNascita.substring(0, 3).toUpperCase();

        // Aggiungi il carattere di controllo (semplicemente 'A' per questo esempio)
        codiceFiscale += "A";

        return codiceFiscale;
    }

    // Metodo per estrarre le prime tre consonanti da una stringa
    private static String estraiConsonanti(String s) {
        String consonanti = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1) {
                consonanti += Character.toUpperCase(c);
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        while (count < 3) {
            consonanti += "X";
            count++;
        }
        return consonanti;
    }

    // Metodo per mappare il mese da numerico a lettere
    private static String mappaMese(String mese) {
        switch (mese) {
            case "01":
                return "A";
            case "02":
                return "B";
            case "03":
                return "C";
            case "04":
                return "D";
            case "05":
                return "E";
            case "06":
                return "H";
            case "07":
                return "L";
            case "08":
                return "M";
            case "09":
                return "P";
            case "10":
                return "R";
            case "11":
                return "S";
            case "12":
                return "T";
            default:
                return "";
        }
    }
}
