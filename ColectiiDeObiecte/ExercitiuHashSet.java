package ColectiiDeObiecte;

import java.util.HashSet;

public class ExercitiuHashSet {
    public static boolean containsAllVowels(String str) {
        str = str.toLowerCase(); // Hai, mai bine, sa folosim doar litere mici

        HashSet<Character> characters = new HashSet<Character>(); // Initializam o multime care va contine vocalele

        for (char c : str.toCharArray()) { // Iteram prin sirul de caractere
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    characters.add(c);
                    break;
                default:
                    // Ignoram caracterele care nu sunt vocale
                    break;
            }
        }

        if (characters.size() == 5) { // Verificam daca avem toate vocalele in lista
            return true; // Toate vocalele sunt prezente in lista noastra, deci returnam adevarat
        } else {
            return false; // Cel putin o vocala nu este prezenta in lista noastra, deci returnam fals
        }
    }

    public static void main(String[] args) {
        String[] strings = { "The quick brown fox jumps over the lazy dog", "Hello, World!" };
        for (String string : strings) {
            System.out.println(containsAllVowels(string));
        }
    }
}
