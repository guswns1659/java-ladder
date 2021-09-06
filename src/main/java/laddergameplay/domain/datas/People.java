package laddergameplay.domain.datas;

import laddergameplay.domain.data.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class People {

    public static final int SPACE_OF_PERSON = Person.MAX_LENGTH_OF_NAME+1;

    private final List<Person> people;

    public People(List<String> peopleString) {
        this.people = peopleString.stream()
                .map(Person::new)
                .collect(Collectors.toList());;
    }

    public boolean isSameSizeAs(int size) {
        return people.size() == size;
    }

    public int subtractNumberFromSize(int number) {
        return people.size() - number;
    }

    public void addResultTo(StringBuilder stringBuilder) {
        people.stream()
                .map(Person::toString)
                .map(name -> String.format("%"+ SPACE_OF_PERSON +"s", name))
                .forEach(stringBuilder::append);
    }

    public Person get(int i) {
        return people.get(i);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People people1 = (People) o;
        return Objects.equals(people, people1.people);
    }

    @Override
    public int hashCode() {
        return Objects.hash(people);
    }
}