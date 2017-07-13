package generic;


/**
 * Created by zouxiang on 2017/7/12.
 * 泛型类
 */
public class Generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Book book = new Book();
        Generic<Book> generic = new Generic<>();
        generic.setT(book);
        generic.getT().setName("java 编程");
        System.out.println(book.getName());
        System.out.println(GenericUtil.getClazz(Class.forName("generic.Book")));

    }
}
