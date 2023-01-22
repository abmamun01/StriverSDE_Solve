package Compare;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCompare {

    public static void main(String[] args) {
        List<STclass> list = new ArrayList<>();

        list.add(new STclass(5, "Joses ", 5433));
        list.add(new STclass(3, "Aziz ", 2343));
        list.add(new STclass(1, "Rifat ", 9283));
        list.add(new STclass(4, "Sudais ", 7566));
        list.add(new STclass(2, "Yasin ", 4345));

        Collections.sort(list,new NameComparator());
        System.out.println(list);
    }


}

class IdComparator implements Comparator<STclass> {

    @Override
    public int compare(STclass o1, STclass o2) {
        return o1.getId() - o2.getId();
    }
}class NameComparator implements Comparator<STclass> {

    @Override
    public int compare(STclass o1, STclass o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class STclass implements Comparable<STclass> {

    int id = 0;
    String name;
    int phone;


    @Override
    public int compareTo(@NotNull STclass o) {
        return this.id - o.id;
    }

    public STclass(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}' + "\n";
    }


}

