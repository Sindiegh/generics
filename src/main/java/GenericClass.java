public class GenericClass<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }

    public static void main(String[] args) {

        GenericClass<String> sInstances = new GenericClass<>();
        sInstances.set("Sindiswa Khama");
        System.out.println(sInstances.get());

        GenericClass<Integer> iInstances = new GenericClass<>();
        iInstances.set(23);
        System.out.println(iInstances.get());

    }
}