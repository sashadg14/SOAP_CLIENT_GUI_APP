package service;

public class Section {
    String name;
   // int numOfPages;

    public Section(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
