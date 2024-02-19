package homework.hw7.phonebook;

public class MainPhonebook {

    public static void main(String[] args) {
        Phonebook myPhonebook = new Phonebook();
        myPhonebook.add(new Note("Ronaldo", "+380937777777"));
        myPhonebook.add(new Note("Messi", "+380931111111"));
        myPhonebook.add(new Note("Ronaldo", "+380937777778"));
        myPhonebook.add(new Note("Mbappe", "+380938888888"));
        myPhonebook.add(new Note("Ronaldo", "+380937777779"));

        System.out.println(myPhonebook.find("Ronaldo"));
        System.out.println(myPhonebook.findAll("Ronaldo"));
        System.out.println(myPhonebook.findAll("Messi"));
    }
}
