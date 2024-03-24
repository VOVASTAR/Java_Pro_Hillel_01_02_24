package homework.hw12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Cтворити клас ChainOfFilters який ініціюватиме усі ваши фільтри та буде складати їх один за одним в LinkedList.
public class ChainOfFilters {

    private List<Filter> filters = new LinkedList<>();

    public ChainOfFilters(Filter... filters) {
        this.filters.addAll(Arrays.asList(filters));
    }

    public void doFilter(Request request) {
        Iterator<Filter> iterator = filters.iterator();
        while (iterator.hasNext()) {
            Filter filter = iterator.next();
            filter.doFilter(request, this);
        }
    }


//    Написати метод який буде пропускати request через усі фільтри.
//    Якщо запит не в змозі пройти усі фільтри логувати невдачу у форматі: “400 Bad Request: %s”-- де %s лог фейлу з конкретного фільтру.


    //    Фільтр який приймає шматок рядка та перевіряє що воно міститься в URI
//    boolean isContainsStringInUri(String string) {
//        Predicate<String> predicate = str -> request.getAddress().toString().contains(str);
//        return predicate.test(string);
//    }

//    Фільтр який перевіряє за допомогою Regex виразу URI


//    Фільтр який перевіряє коректність формату payload (його наявність та відповідність JSON формату)
//    Для перевірки використати бібліотеку https://mvnrepository.com/artifact/org.json/json


//    Написати валідацію заголовків кешування (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Cache-Control)

}
