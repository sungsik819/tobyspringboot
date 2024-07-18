package tobyspring.helloboot;

public interface HelloRepository {
    Hello findhello(String name);

    void increaseCount(String name);

    default int countOf(String name) {
        Hello hello = findhello(name);
        return hello == null ? 0 : hello.getCount();
    }
}
