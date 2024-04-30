package ColectiiDeObiecte;

import java.util.Scanner;
import java.util.TreeMap;

public class ExercitiuTreeMap {
    public static TreeMap<String, Integer> countWords(String[] words) {
        TreeMap<String, Integer> numaraCuvintele = new TreeMap<String,Integer>(String.CASE_INSENSITIVE_ORDER);

        for (String word : words) {
            String cuvantulCurat = word.trim().toLowerCase(); // Curata cuvantul de caractere albe si transforma-l intr-un alt cuvant care are toate caracterele litere mici
            

            numaraCuvintele.put(cuvantulCurat, numaraCuvintele.getOrDefault(cuvantulCurat, 0) + 1); // Actualizeaza dictionarul cu numarul actual de cuvinte
            
        }

        return numaraCuvintele;
    }

    public static void main(String[] args) {
        try (Scanner scanner=new Scanner(System.in)) {
            String input=scanner.nextLine();
            String[] inputWords = input.split(" ");
            TreeMap<String, Integer> result = countWords(inputWords);
            
            System.out.println(result); // Afiseaza rezultatul
            
        } catch (Exception e) {
            System.out.println("Nu am putut numara cuvintele. Incearca alta data.");
        }
    }
}
