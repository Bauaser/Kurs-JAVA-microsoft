public class MysteryWho {
    public static void main(String[] args){
        // wypisujemy sobie "słowniczek" np it="whom"
        String whom ="her";
        String who = "him";
        String it = "who";
        String he = "it";
        String she = "whom";
//ustawiamy kolejność słów, które się zamienią np
// he, she, it zamieni się na it, whom i who
        sentence(he, she, it);
        sentence(she, he, who);
        sentence(who, she, who);
        sentence(it, "stu", "boo");
        sentence(it, whom, who);
    }
   // tworzymy nową metodę she, who i whom nie wczytują się z samej góry
    public static void sentence(String she, String who, String whom) {
//wydruk zamienia kolejność z 1 2 3 na 2 3 1
// i drukuje zdanie według słowniczka
        System.out.println(who + " and " + whom + " like " + she);
    }
}
